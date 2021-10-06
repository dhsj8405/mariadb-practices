delete from tables;
delete from category;

-- insert author
insert into category values(null, '수필');
select no, name from category;


-- insert book
insert into book values(null, 'abc' , 2000 , 1 );
select *
from book a, category b
where a.category_no = b.no;


-- insert cart
insert into category values(1,1,2);

select * from book;
