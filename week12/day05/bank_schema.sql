-- Bank schema
DROP TABLE IF EXISTS bank_accounts;

CREATE TABLE bank_accounts (
   first_name VARCHAR(20),
   last_name VARCHAR(20),
   account_number CHAR(12), -- do not store a value as a number if you dont +, -, *, / etc.
   balance DECIMAL    
);

ALTER TABLE bank_accounts
ADD PRIMARY KEY (account_number);