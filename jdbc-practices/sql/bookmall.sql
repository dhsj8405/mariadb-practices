
-- CategoryDao
-- insert 
insert into category values(null, '수필');
-- select 
select no, name 
from category ct;

-- BookDao
-- insert 
insert into book values(null, 'abc' , 2000 , 1 );
-- select
select b.no as book_no, b.title as 책이름, b.price as 가격 ,ct.no as category_no
from book b, category ct
where b.category_no = ct.no;

-- MemberDao
-- insert 
insert into member values(null, '우동현', 'dhsj8405@naver.com', 1234, '010-2316-8405');
-- select
select m.no, m.name, m.email, m.password, m.phone_number
from member m;

-- CartDao
-- insert 
insert into cart values(1,1,2);
-- select
select b.no as book_no, m.no as member_no, c.quantity
from cart c, book b, member m
where c.book_no = b.no 
and  c.member_no = m.no;


-- OrderDao
-- insert 
insert into `order` values('희동이',5000,'test@test.com',2);
-- select
select o.no as order_num , m.name, b.price*ob.quantity as payment, o.address, m.no as member_no
from `order` o, order_book ob ,book b, member m
where o.no = ob.order_no
and ob.book_no = b.no
and o.member_no = m.no;

-- Order_book
-- insert
insert into order_book values();
-- select
select b.no as book_num, ob.quantity, o.no as order_num 
from order_book ob,`order` o , book b
where ob.book_no = b.no
and ob.order_no = o.no;






