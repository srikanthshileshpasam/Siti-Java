--
-- File generated with SQLiteStudio v3.2.1 on Sat Jan 25 12:59:33 2020
--
-- Text encoding used: UTF-8
--
PRAGMA foreign_keys = off;
BEGIN TRANSACTION;

-- Table: customer_detail
CREATE TABLE customer_detail (vc_no INTEGER PRIMARY KEY NOT NULL, sms_id INTEGER, location_id INTEGER (10), customer_name VARCHAR (50) NOT NULL, address VARCHAR (250), area VARCHAR (10) NOT NULL, city VARCHAR (10) NOT NULL, card_no VARCHAR, status BOOLEAN NOT NULL, cell_1 INTEGER (12), cell_2 INTEGER (12), package VARCHAR (25), package_sub VARCHAR (50), last_paid DATE, next_bill_date DATE);

-- Table: transaction
CREATE TABLE "transaction" (transaction_id INTEGER PRIMARY KEY NOT NULL UNIQUE, vc_no INTEGER REFERENCES customer_detail (vc_no), agent_id INTEGER REFERENCES user (user_id), receipt_num INTEGER (8) NOT NULL, payment_method VARCHAR (15) NOT NULL, amount_paid DECIMAL NOT NULL, package VARCHAR (25), transaction_date DATETIME NOT NULL, num_of_months INTEGER (2), remarks VARCHAR (250));

-- Table: user
CREATE TABLE user (user_id INT (10) NOT NULL UNIQUE, name VARCHAR (50) NOT NULL, user_type VARCHAR (15) NOT NULL, phone_number VARCHAR (12) NOT NULL UNIQUE, user_status VARCHAR (10) NOT NULL, PRIMARY KEY (user_id));

-- Table: user_login
CREATE TABLE user_login (user_login_id INTEGER NOT NULL PRIMARY KEY UNIQUE, user_id INTEGER REFERENCES user (user_id) NOT NULL, user_name VARCHAR (15) NOT NULL UNIQUE, pwd VARCHAR (15) NOT NULL);

COMMIT TRANSACTION;
PRAGMA foreign_keys = on;
