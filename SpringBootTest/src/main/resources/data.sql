CREATE SEQUENCE "USERS_SEQ" 
MINVALUE 1 
MAXVALUE 999999999 
INCREMENT BY 50 
START WITH 202700 
NOCACHE 
NOCYCLE;

INSERT INTO USERS (NAME, STATUS) VALUES ( 'USA',1);
INSERT INTO USERS (NAME, STATUS) VALUES ('France',1);
INSERT INTO USERS (NAME, STATUS) VALUES ('Brazil',1);
INSERT INTO USERS (NAME, STATUS) VALUES ('Italy',1);
INSERT INTO USERS (NAME, STATUS) VALUES ( 'Canada',1);