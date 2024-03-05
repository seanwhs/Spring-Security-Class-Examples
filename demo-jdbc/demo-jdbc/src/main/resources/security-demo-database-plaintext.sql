USE spring_db;

DROP TABLE IF EXISTS authorities;
DROP TABLE IF EXISTS users;

--
-- Table structure for table users
--

CREATE TABLE users (
  username varchar(50) NOT NULL,
  password varchar(50) NOT NULL,
  enabled tinyint NOT NULL,
  PRIMARY KEY (username)
) ;

--
-- Inserting data for table users
--

INSERT INTO users 
VALUES 
('ravi','{noop}welcome123',1),
('freddie','{noop}welcome123',1),
('lizzy','{noop}welcome123',1);


--
-- Table structure for table authorities
--

CREATE TABLE authorities (
  username varchar(50) NOT NULL,
  authority varchar(50) NOT NULL,
  UNIQUE KEY authZ(username,authority),
  CONSTRAINT authZ FOREIGN KEY (username) REFERENCES users (username)
);

--
-- Inserting data for table authorities
--

INSERT INTO authorities 
VALUES 
('ravi','ROLE_EMPLOYEE'),
('freddie','ROLE_EMPLOYEE'),
('freddie','ROLE_MANAGER'),
('lizzy','ROLE_EMPLOYEE'),
('lizzy','ROLE_MANAGER'),
('lizzy','ROLE_ADMIN');

