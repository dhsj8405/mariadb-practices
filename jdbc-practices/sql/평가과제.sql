delete from tables;
delete from category;

select * from book;

-- insert category
insert into category values(null, '수필');
select ct.no, ct.name 
from category ct;


-- insert book
insert into book values(null, 'abc' , 2000 , 1 );

select a.no as book_no, a.title as 책이름, a.price as 가격 ,b.no as category_num
from book a, category b
where a.category_no = b.no;

insert into book values(null, 'abc' , 2000 , 1 )
from book b, category c
where c.ca

select *
from book a, category b
where a.category_no = b.no;



-- insert member
insert into member values(null, '우동현', 'dhsj8405@naver.com', 1234, '010-2316-8405');
select m.no,m.name,m.email,m.password,m.phone_number
from member m;
select * from member;


-- insert cart
insert into cart values(1,1,2);

select b.no as book_no, m.no as member_no, c.quantity
from cart c, book b, member m
where c.book_no = b.no 
and  c.member_no = m.no;

select * from member a,cart b, book c
where a.no = b.member_no
and b.book_no = c.no;


-- insert order
  -- 1기본
insert into `order` values('희동이',5000,'test@test.com',2);
-- select order
select o.no as order_num , o.name, o.payment, o.address, m.no as member_no
from `order` o, member m
where o.member_no = m.no;



-- order_book
select * 
from order_book;


select * from member m, cart c, book b, `order` o ,order_book ob, category ct
where m.no = c.member_no
and c.book_no = b.no
and o.member_no = m.no
and ob.order_no = o.no;

  


