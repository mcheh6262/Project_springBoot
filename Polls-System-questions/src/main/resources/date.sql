DROP TABLE IF EXISTS questions;
DROP TABLE IF EXISTS answers;

CREATE TABLE questions(
    id int NOT NULL AUTO_INCREMENT,
    question_title varchar(255) NOT NULL DEFAULT '',
    question_first_answer varchar(255) NOT NULL DEFAULT '',
    question_second_answer varchar(255) NOT NULL DEFAULT '',
    question_third_answer varchar(255) NOT NULL DEFAULT '',
    question_fourth_answer varchar(255) NOT NULL DEFAULT '',
    PRIMARY KEY (id)

);

CREATE TABLE users(
    id int NOT NULL AUTO_INCREMENT,
    first_name varchar(255) NOT NULL DEFAULT '',
    last_name varchar(255) NOT NULL DEFAULT '',
    email varchar(255) NOT NULL DEFAULT '',
    age int NOT NULL,
    address varchar(255) NOT NULL DEFAULT '',
    joining_date varchar(255) NOT NULL DEFAULT '',
    PRIMARY KEY (id)
);

CREATE TABLE answers(
    id int NOT NULL AUTO_INCREMENT,
    question_id int,
    users_id int,
    selected_answer varchar(255),
    PRIMARY KEY (id),
    FOREIGN KEY (question_id) REFERENCES questions(id),
    FOREIGN KEY (users_id) REFERENCES users(id)
);


INSERT INTO questions (question_title, question_first_answer, question_second_answer, question_third_answer, question_fourth_answer)
VALUES ("Between the following, what do you most love to do?","Watch TV", "Play the computer","Hanging out with friends","Travel the world"),
("Where is your preferred place to travel?", "USA", "France", "South America", "Thailand"),
("When do you mostly like to answer surveys?", "In work", "At night", "In the morning", "in the evening"),
("What is your favorite flavor in food?", "sharp", "sweet", "sour", "salty"),
("What kind of movies do you prefer to watch?", "reality show", "sad", "comedy", "painted");

INSERT INTO answers (question_id, users_id, selected_answer)
VALUES (1, 2, 1),
(1, 1, 3),
(2, 2, 4)

INSERT INTO users (first_name, last_name, email, age, address, joining_date)
VALUES ('chedvi', 'baum', '4150155@', 32, 'Ashdod', '28/01/2012'),('tal', 'levi', '4130041@', 19, 'Tel-Aviv', '18/10/2023'),('yoav', 'cohen', 'yoavv@', 40, 'Yavne', '03/02/2022');