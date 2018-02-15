create table PERSON
(
	id integer not null,
	name varchar(255) not null,
	location varchar(255),
	birth_date timestamp,
	primary key(id)
);

INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10001, 'Scott', 'Tampa',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10002, 'Tommy', 'Orlando',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10003, 'James', 'Dallas',sysdate());
INSERT INTO PERSON (ID,NAME,LOCATION,BIRTH_DATE)
VALUES(10004, 'Tommy', 'Orlando',sysdate());

