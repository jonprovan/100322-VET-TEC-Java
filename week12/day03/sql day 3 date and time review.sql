/*
Date and Time review


TYPE      BYTES     BITS        DESCRIPTION
--------------------------------------------
DATE        3        24          Date is from January 1, 1000 to December 31, 9999
							     It displays in the foramt 'yyyy-mm-dd'
 
TIME        3        24          Time is from -838:59:59 to 838:59:59
                                 It displays in the foramt 'hh:mm:ss'

DATETIME    8        64          DateTime is from midnight Jan 1, 1970 to Dec 31, 9999
                                 It displays in the format 'yyyy-mm-dd hh:mm:ss'

TIMESTAMP   4        32          Timestamp is from midnight January 1, 1970 to the year 2037
                                 It display in the format 'yyyy-mm-dd hh:mm:ss'

YEAR        1         8          The 2 digit year goes from 1970 to 2069.
								 The 4 digit year goes from 1901 to 2155

*/

/*
DATETIME vs TIMESTAMP

--------
RANGEs
--------
For DATETIME values is 
'1000-01-01 00:00:00.000000' to '9999-12-31 23:59:59.999999', 
and the range for TIMESTAMP values is 
'1970-01-01 00:00:01.000000' to '2038-01-19 03:14:07.999999'

-----------
WARNING!!!!
-----------
MySQL converts TIMESTAMP values from the current time zone to UTC 
for storage, and back from UTC to the current time zone for retrieval. 
(This does not occur for other types such as DATETIME.) 

you can convert TIMESTAMP values to UTC DATETIME values when retrieving 
them using CAST() with the AT TIME ZONE operator
-- 

*/

/*
WAYS TO MANUALLY INSERT A DATE LITERAL

'yyyy-mm-dd'


*/

/* DATE FUNCTIONS TO USE */


SELECT 
  NOW(),   -- '2022-12-21 15:47:07'
  SYSDATE(), -- '2022-12-21 15:47:07'
  CURRENT_TIMESTAMP(),  
  CURRENT_TIMESTAMP,
  
  CURDATE(),
  CURRENT_DATE(),
  CURRENT_DATE, -- THIS WORKS AS WELL
  
  CURTIME(),
  CURRENT_TIME(),
  CURRENT_TIME,
  
  UTC_DATE(),
  UTC_TIME();
;

/* formatting your dates you get from your queries */

SELECT DATE_FORMAT(CURRENT_DATE, '%W, %d %b %Y');
SELECT TIME_FORMAT(CURRENT_TIME, '%l:%i %p')
/*
%m  Month numeric (01, 12 ...)
%c  Month numeric (1...12)
%M  Month name (January, February...)
%b  Abbreviation for month (Jan, Feb...)

%W Weekday name
%a Abbreviated weekday (Mon, Tue...)

%T  24 hour time
%r 12 hour
%p AM or PM
*/

-- https://dev.mysql.com/doc/refman/8.0/en/date-and-time-functions.html











