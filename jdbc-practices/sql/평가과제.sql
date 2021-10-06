delete from tables;
delete from category;

select * from book;

-- insert category
insert into category values(null, '수필');
select no, name from category;


-- insert book
insert into book values(null, 'abc' , 2000 , 1 );
select *
from book a, category b
where a.category_no = b.no;

-- insert member
insert into member values(null, '우동현', 'dhsj8405@naver.com', 1234, '010-2316-8405');
select * from member;

-- insert cart
insert into cart values(1,1,2);
select * from cart;

-- insert order
insert into `order` values('희동이',5000,'test@test.com',2);
select * from `order`;


