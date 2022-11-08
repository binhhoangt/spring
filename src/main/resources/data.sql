-- create table customers(
--     id integer GENERATED,
--     customerName VARCHAR(50),
--     nationalId VARCHAR(50),
--     address VARCHAR(50),
--     phoneNumber VARCHAR(50),
--     emailAddress VARCHAR(50),
--     dateOfBirth timestamp,
--     branch VARCHAR(50),
--     cardNumber VARCHAR(50),
--     cardIssueDate timestamp,
--     accountActiveDate timestamp,
--     cardStatus VARCHAR(50),
--     balance Integer,
--     level VARCHAR(50)
-- );

INSERT INTO CUSTOMERS
    (CUSTOMER_NAME, NATIONAL_ID, ADDRESS, ACCOUNT_ACTIVE_DATE, BALANCE)
VALUES('Binhht', 'vn', 'Hanoi', '2022-11-06', 100000000);
INSERT INTO CUSTOMERS
    (CUSTOMER_NAME, NATIONAL_ID, ADDRESS, ACCOUNT_ACTIVE_DATE, BALANCE)
VALUES('Khapm', 'vn', 'Hanoi', '2022-11-06', 100000000);
INSERT INTO CUSTOMERS
    (CUSTOMER_NAME, NATIONAL_ID, ADDRESS, ACCOUNT_ACTIVE_DATE, BALANCE)
VALUES('Kongdt', 'vn', 'Hanoi', '2022-11-07', 10000000);
INSERT INTO CUSTOMERS
    (CUSTOMER_NAME, NATIONAL_ID, ADDRESS, ACCOUNT_ACTIVE_DATE, BALANCE)
VALUES('Yenpth', 'vn', 'Thaibinh', '2022-11-06', 10000000);