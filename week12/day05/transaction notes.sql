/*
Transactions 
- a group of SQL statements that you combine into a single logical unit
- vs normally our statements autocommit to the database taking immediate effect
- by combining statements, you can prevent certain kinds of database errors

Example: Transfering money from one account to another
- if the UPDATE to one account succeeds 
  but the UPDATE on the other account fails,
  you don't want either: 
    1) the money removed from one account but never added to the other
    2) the money added to the other account withou being removed from the first

Concurrency and Locking
- When two or more users have accss the the same database, 
  it's possible for them to be working with the same data at the same time.
  This is callconcurrency.
  
4 Types of Concurrency Problems
1. Lost updates 
   = two transactions select the same row 
     and then update the row based on the original value
     since each transaction is unaware of the other,
     the later update overwrites the earlier update
2. Dirty Reads
   = Occur when a trasaction selects data that hasn't been committed by
     another transaction. For example, transaction A changes a row.
	 Transaction B then selects the changed row before transaction A commits.
     If Transaction A then rolls back the change, transaction B has selected
     data that doesn't exist in the database.
3. Nonrepeatable reads
   = Occurs when two SELECT statements that try to get the same data
     get different values because another transaction has updated the data in the
     time between the two statements. For example, transaction A selects the same
     row again, the data is different.
4. Phantom reads
   = Occur when you perform an update or delete o na set of rows
     at the same time that another transaction is performing an
	 insert or delete that affects one or more rows in that same set of rows.
     For example, transaction A updates the payment total for each
     invoice that has a balance due, but transaction B inserts a new, unpaid,
     invoice while transaction A is still running. After transaction A finishes,
     there is still an invoice with a balance due.
   
     


*/

START TRANSACTION; -- we will learn how to do this in our Java code

SAVEPOINT before_transfer_out;

UPDATE bank_accounts
SET balance = balance - 100
WHERE account_number = '123456789012';

UPDATE bank_accounts
SET balance = balance + 100
WHERE account_number = '098765432109';

ROLLBACK TO SAVEPOINT before_transfer_out;

-- COMMIT; -- autosave is turned back on once you commit or rollback

SELECT * FROM bank_accounts;

