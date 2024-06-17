DROP DATABASE IF EXISTS final_exam_01;
CREATE DATABASE final_exam_01;
USE final_exam_01;

DROP TABLE IF EXISTS users;
CREATE TABLE users (
                       id          INT PRIMARY KEY AUTO_INCREMENT,
                       first_name  VARCHAR(50)                     NOT NULL,
                       last_name   VARCHAR(50)                     NOT NULL,
                       phone       VARCHAR (50)                    NOT NULL,
                       email       VARCHAR(50) UNIQUE KEY          NOT NULL,
                       password    VARCHAR(50)                     NOT NULL DEFAULT '123456',
                       candidate        ENUM('EXPERIENCECANDIDATE', 'FRESHCANDIDATE')       NOT NULL DEFAULT 'FRESHCANDIDATE',
                       pro_skill   VARCHAR(50),
                       exp_in_year INT,
                       graduationRank  ENUM('Excellence', 'GOOD', 'Fair', 'Poor')

);

INSERT INTO users (first_name ,last_name,phone    ,  email               , password  ,candidate   , pro_skill, exp_in_year, graduationRank)
VALUES            (' Đức'     ,'Quang'   ,0122222222,  'quangduc@gmail.com', '123456Q' , 'EXPERIENCECANDIDATE' , 'Java'   , 10       ,null   ),
                  (' Duy'     , 'Bùi  '  ,777777777 ,'duy.nn@gmail.com'    , '123456Q' , 'FRESHCANDIDATE'      , NULL     , NULL     ,'GOOD'    ),
                  (' Trỗi'    , 'Nguyễn' ,8888888888, 'troi@gmail.com'     , '123456Q' , 'FRESHCANDIDATE '      , NULL  , NULL     ,'GOOD '     );

DROP PROCEDURE IF EXISTS find_experienceCandidate_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_experience_by_email_and_password (
    IN in_email     VARCHAR(50),
    IN in_password  VARCHAR(50),
    IN in_phone     VARCHAR(50),
    IN in_exp_in_year VARCHAR(50),
    IN in_graduationRank VARCHAR(50)
)
DROP PROCEDURE IF EXISTS find_experienceCandidate_by_email_and_password;
DELIMITER $$
CREATE PROCEDURE find_freshCandidate_by_email_and_password (
    IN in_email     VARCHAR(50),
    IN in_password  VARCHAR(50),
    IN in_phone     VARCHAR(50),
    IN in_graduationRank VARCHAR(50)
)
BEGIN
SELECT *
FROM users
WHERE role ='EXPERIENCECANDIDATE' AND email = in_email AND password = in_password;
END $$
DELIMITER ;