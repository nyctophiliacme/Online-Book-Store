delete from publisher;
insert into publisher(pname) values('Penguin India');
insert into publisher(pname) values('Pustak Mahal');
insert into publisher(pname) values('Bloomsbury Publishing');
insert into publisher(pname) values('HCV');
commit;

delete from category;
insert into category(cname) values('scifi');
insert into category(cname) values('fantasy');
insert into category(cname) values('education');
insert into category(cname) values('social');
insert into category(cname) values('adventure');
commit;

delete from author;
insert into author(aname,email) values('J K Rowling','Rowling.jk@gmail.com');
insert into author(aname,email) values('H C Verma','hcverma@gmail.com');
insert into author(aname,email) values('Sudha Murthy','smurthy@gmail.com');
insert into author(aname,email) values('Ruskin Bond','bondruskin@gmail.com');
commit;

delete from book;
insert into book(bname,authorid,publisherid,price,nextstock,avlqty) values('Harry Potter',1,3,400,SYSDATE+30,25);
insert into book(bname,authorid,publisherid,price,nextstock,avlqty) values('Concepts of Physics',2,4,300,SYSDATE+30,20);
insert into book(bname,authorid,publisherid,price,nextstock,avlqty) values('Wise and Otherwise',3,2,200,SYSDATE+10,22);
insert into book(bname,authorid,publisherid,price,nextstock,avlqty) values('The Blue Umbrella',4,2,150,SYSDATE+20,36);
commit;

delete from category_book;
insert into category_book(categoryid,bookid) values(1,4);
insert into category_book(categoryid,bookid) values(5,1);
insert into category_book(categoryid,bookid) values(2,1);
insert into category_book(categoryid,bookid) values(3,2);
insert into category_book(categoryid,bookid) values(4,3);
insert into category_book(categoryid,bookid) values(1,2);
commit;

delete from author_book;
insert into author_book(authorid,bookid) values(1,1);
insert into author_book(authorid,bookid) values(2,2);
insert into author_book(authorid,bookid) values(3,3);
insert into author_book(authorid,bookid) values(4,4);
commit;

delete from customer;
insert into customer(cname,email,password,phone,pincode,address) values ('Pransh','pransh.tiwari@oracle.com','tiwari',
	7206555179,400088,'Room no - 14, Mumbai');
insert into customer(cname,email,password,phone,pincode,address) values ('Bhushan','bhushan@oracle.com','kulkarni',
	9968552179,409045,'House no-15, Gali no 24, Nagpur');
insert into customer(cname,email,password,phone,pincode,address) values ('Prashant','prashant@oracle.com','khulbe',
	9869001134,178066,'Street no - 25 Lucknow');
insert into customer(cname,email,password,phone,pincode,address) values ('Nikhil','nikhil@oracle.com','sai',
	9920456712,142890,'Gachibowli-24, Hyderabad');
commit;

delete from admin;
insert into admin(adname,email,password) values ('Batman','darkknight@gmail.com','gotham');
commit;

delete from staff;
insert into staff(sname,email,password) values ('Wonderwoman','gal.gadot@gmail.com','isarael');
insert into staff(sname,email,password) values ('Aquaman','khaldrogo@gmail.com','got');
insert into staff(sname,email,password) values ('Flash','fastest@gmail.com','catchme');
commit;

delete from orders;
insert into orders(ordersdate,custid) values(SYSTIMESTAMP,1);
insert into orders(ordersdate,custid) values(SYSTIMESTAMP,4);
insert into orders(ordersdate,custid) values(SYSTIMESTAMP,3);
insert into orders(ordersdate,custid) values(SYSTIMESTAMP,2);
commit;

delete from orders_book;
insert into orders_book(ordersid,bookid,ordqty,curprice) values(1,2,2,300);
insert into orders_book(ordersid,bookid,ordqty,curprice) values(1,1,5,400);
insert into orders_book(ordersid,bookid,ordqty,curprice) values(2,2,1,300);
insert into orders_book(ordersid,bookid,ordqty,curprice) values(2,4,3,150);
insert into orders_book(ordersid,bookid,ordqty,curprice) values(2,1,2,400);
insert into orders_book(ordersid,bookid,ordqty,curprice) values(3,3,1,200);
insert into orders_book(ordersid,bookid,ordqty,curprice) values(4,3,2,200);
insert into orders_book(ordersid,bookid,ordqty,curprice) values(4,4,10,150);
commit;

delete from review;
insert into review(custid,bookid,comments,rating) values(1,1,'Must Read!',9);
insert into review(custid,bookid,comments,rating) values(1,2,'Not worth it',3);
insert into review(custid,bookid,comments,rating) values(2,3,'Buy it now',8);
insert into review(custid,bookid,comments,rating) values(3,4,'Late delivery',6);
insert into review(custid,bookid,comments,rating) values(4,1,'Great writing',8);
commit;

delete from wishlist;
insert into wishlist(custid,bookid,wishqty) values(1,3,2);
insert into wishlist(custid,bookid,wishqty) values(2,3,5);
insert into wishlist(custid,bookid,wishqty) values(4,2,1);
insert into wishlist(custid,bookid,wishqty) values(3,1,1);
commit;

