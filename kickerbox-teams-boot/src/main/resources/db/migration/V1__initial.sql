
CREATE SEQUENCE HIBERNATE_SEQUENCE;

CREATE TABLE team (
    id INT PRIMARY KEY,
    name varchar (255) NOT NULL
);

CREATE TABLE members (
    team_id INT NOT NULL,
    name VARCHAR (255) NOT NULL
);