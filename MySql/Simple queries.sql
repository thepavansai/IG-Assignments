
/*
Problem Scenario: This Scenario is to develop a Library Management System (LMS) to store information of the members, books, status of books issue, book availability and suppliers details.

Simple Questions:
Problem # 1:
Write a query to display the member id, member name, city and membership status who are all having life time membership. Hint: Life time membership status is “Permanent”.

Problem # 2:
Write a query to display the book code, publication, price and supplier name of the book witch is taken frequently.

Problem # 3:
Write a query to display the member id, member name who have taken the book with book code 'BL000002'. 

Problem # 4:
Write a query to display the book code, book title and author of the books whose author name begins with 'P'.

Problem # 5:
Write a query to display the total number of Java books available in library with alias name ‘NO_OF_BOOKS’. 

Problem # 6:
Write a query to list the category and number of books in each category with alias name ‘NO_OF_BOOKS’.

Problem # 7:
Write a query to display the number of books published by "Prentice Hall” with the alias name “NO_OF_BOOKS”.

Problem # 8:
Write a query to display the book code, book title of the books which are issued on the date "1st April 2012".

Problem # 9:
Write a query to display the member id, member name, date of registration and expiry date of the members whose membership expiry date is before APR 2013.

Problem # 10:
write a query to display the member id, member name, date of registration, membership status of the members who registered before  "March 2012" and membership status is "Temporary" 

Problem #11:
Write a query to display the member id, member name who’s City is CHENNAI or DELHI. Hint: Display the member name in title case with alias name 'Name'. 

Problem #12:
Write a query to concatenate book title, author and display in the following format.
Book_Title_is_written_by_Author
Example:  Let Us C_is_written_by_Yashavant Kanetkar
Hint: display unique books. Use “BOOK_WRITTEN_BY” as alias name. 

Problem #13:
Write a query to display the average price of books which is belonging to ‘JAVA’ category with alias name “AVERAGEPRICE”.

Problem #14:
Write a query to display the supplier id, supplier name and email of the suppliers who are all having gmail account.

Problem#15:
Write a query to display the supplier id, supplier name and contact details. Contact details can be either phone number or email or address with alias name “CONTACTDETAILS”. If phone number is null then display email, even if email also null then display the address of the supplier. Hint: Use Coalesce function. 

Problem#16:
Write a query to display the supplier id, supplier name and contact.  If phone number is null then display ‘No’ else display ‘Yes’ with alias name “PHONENUMAVAILABLE”. Hint: Use ISNULL.

Problem#17:
Write a query to display the member id, member name, city and member status of members with the total fine paid by them with alias name “Fine”.



*/

select member_id, member_name,city,membership_status from LMS_MEMBERS where membership_status="Permanent";

select b1.BOOK_CODE,b2.PUBLICATION,b3.SUPPLIER_NAME from(select b1.BOOK_CODE from LMS_BOOK_ISSUE b1 group by BOOK_CODE having count(b1.BOOK_CODE)>1) b1 join LMS_BOOK_DETAILS b2 on b1.BOOK_CODE=b2.BOOK_CODE join LMS_SUPPLIERS_DETAILS b3 on b2.SUPPLIER_ID=b3.SUPPLIER_ID;

select b1.MEMBER_ID,b1.MEMBER_NAME ,b2.BOOK_CODE from LMS_MEMBERS b1, LMS_BOOK_ISSUE b2 where b2.BOOK_CODE="BL000002";

select BOOK_CODE,BOOK_TITLE,AUTHOR from LMS_BOOK_DETAILS where AUTHOR like 'P%';

select count( CATEGORY = "JAVA") as NO_OF_BOOKS from LMS_BOOK_DETAILS;

select CATEGORY, count(CATEGORY) as NO_OF_BOOKS from LMS_BOOK_DETAILS group by CATEGORY;

select count(PUBLICATION="Prentice Hall") as NO_OF_BOOKS from LMS_BOOK_DETAILS;

select b2.BOOK_CODE,b1.BOOK_TITLE from LMS_BOOK_DETAILS b1 inner join LMS_BOOK_ISSUE b2 on b1.BOOK_CODE=b2.BOOK_CODE where b2.DATE_ISSUE ='2012-04-01';

select b1.MEMBER_ID,b2.MEMBER_NAME ,b2.DATE_REGISTER,b2.DATE_EXPIRE from LMS_BOOK_ISSUE b1 inner join LMS_MEMBERS b2 on b1.MEMBER_ID=b2.MEMBER_ID where DATE_EXPIRE <'2013-04-01'; 

select MEMBER_ID,MEMBER_NAME,DATE_REGISTER,MEMBERSHIP_STATUS from LMS_MEMBERS where DATE_REGISTER <'2012-03-01' and MEMBERSHIP_STATUS="Temporary";

select MEMBER_ID ,MEMBER_NAME as Name from LMS_MEMBERS where CITY ='CHENNAI' or CITY='DELHI';

select BOOK_TITLE + '_is_written_by_'+ AUTHOR as 'BOOK _is_written_by_' from LMS_BOOK_DETAILS;

select avg(PRICE) as AVERAGEPRICE from LMS_BOOK_DETAILS where CATEGORY='JAVA';

select SUPPLIER_ID,SUPPLIER_NAME,EMAIL from LMS_SUPPLIERS_DETAILS where EMAIL like '%gmail%';

select SUPPLIER_ID,SUPPLIER_NAME,coalesce(EMAIL,CONTACT,ADDRESS) as CONTACTDETAILS from LMS_SUPPLIERS_DETAILS;

select SUPPLIER_ID,SUPPLIER_NAME,case when CONTACT is NULL then 'NO' when CONTACT is not null then 'YES' end as PHONENUMBERAVAILABLE from LMS_SUPPLIERS_DETAILS;
 
select t1.MEMBER_ID,t1.MEMBER_NAME,t1.CITY,sum(t2.FINE_AMOUNT) as FINE from LMS_MEMBERS t1 inner join LMS_BOOK_ISSUE t3 on t1.MEMBER_ID=t3.MEMBER_ID inner join LMS_FINE_DETAILS t2 on t3.FINE_RANGE=t2.FINE_RANGE group by t1.MEMBER_ID,t1.MEMBER_NAME,t1.CITY;
