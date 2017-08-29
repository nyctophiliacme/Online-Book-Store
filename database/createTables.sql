DROP TABLE wishlist;
DROP TABLE review;
DROP TABLE orders_book;
DROP TABLE orders;
DROP TABLE admin;
DROP TABLE staff;
DROP TABLE customer;
DROP TABLE author_book;
DROP TABLE category_book;
DROP TABLE category;
DROP TABLE book;
DROP TABLE author;
DROP TABLE publisher;

CREATE TABLE publisher (
	publisherid number generated as identity,
	pname varchar2(25),
	CONSTRAINT publisher_pk primary key (publisherid)
);

CREATE TABLE author (
	authorid number generated as identity,
	aname varchar2(25),
	email varchar2(25),
	CONSTRAINT author_pk primary key (authorid)
);

CREATE TABLE book (
	bookid number generated as identity,
	price number(7,2),
	avlqty number,
	bname varchar2(25),
	authorid number,
	publisherid number,
	nextstock date,
	CONSTRAINT book_pk primary key (bookid),
	CONSTRAINT book_author_fk foreign key (authorid) references author(authorid),
	CONSTRAINT book_publisher_fk foreign key (publisherid) references publisher(publisherid)
);

CREATE TABLE category (
	categoryid number generated as identity,
	cname varchar2(25),
	CONSTRAINT category_pk primary key (categoryid)
);

CREATE TABLE category_book (
	categoryid number,
	bookid number,
	CONSTRAINT category_book_pk primary key (categoryid,bookid),
	CONSTRAINT category_book_book_fk foreign key (bookid) references book(bookid),
	CONSTRAINT category_book_category_fk foreign key (categoryid) references category(categoryid)
);

CREATE TABLE author_book (
	authorid number,
	bookid number,
	CONSTRAINT author_book_pk primary key (authorid,bookid),
	CONSTRAINT author_book_book_fk foreign key (bookid) references book(bookid),
	CONSTRAINT author_book_author_fk foreign key (authorid) references author(authorid)
);

CREATE TABLE customer (
	custid number generated as identity,
	cname varchar2(25),
	email varchar2(25),
	password varchar2(25),
	pincode number,
	phone number,
	address varchar2(80),
	CONSTRAINT customer_pk primary key (custid)
);

CREATE TABLE staff (
	staffid number generated as identity,
	sname varchar2(25),
	email varchar2(25),
	password varchar2(25),
	CONSTRAINT staff_pk primary key (staffid)
);

CREATE TABLE admin (
	adminid number generated as identity,
	adname varchar2(25),
	email varchar2(25),
	password varchar2(25),
	CONSTRAINT admin_pk primary key (adminid)
);

CREATE TABLE orders (
	ordersid number generated as identity,
	ordersdate timestamp,
	custid number,
	CONSTRAINT orders_pk primary key (ordersid),
	CONSTRAINT orders_customer_fk foreign key (custid) references customer(custid)
);

CREATE TABLE orders_book (
	ordersid number,
	bookid number,
	curprice number(7,2),
	ordqty number,
	CONSTRAINT orders_book_pk primary key (ordersid,bookid),
	CONSTRAINT orders_book_book_fk foreign key (bookid) references book(bookid),
	CONSTRAINT orders_book_orders_fk foreign key (ordersid) references orders(ordersid)
);

CREATE TABLE review (
	bookid number,
	custid number,
	comments varchar2(80),
	rating number(2,1),
	CONSTRAINT review_pk primary key (bookid,custid),
	CONSTRAINT review_book_fk foreign key (bookid) references book(bookid),
	CONSTRAINT review_customer_fk foreign key (custid) references customer(custid)	
);

CREATE TABLE wishlist (
	custid number,
	bookid number,
	wishqty number,
	CONSTRAINT wishlist_pk primary key (custid,bookid),
	CONSTRAINT wishlist_book_fk foreign key (bookid) references book(bookid),
	CONSTRAINT wishlist_customer_fk foreign key (custid) references customer(custid)		
);
