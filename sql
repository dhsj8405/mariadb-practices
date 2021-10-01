-- Basic Query

drop table pet;		

create table pet(		
   name varchar(20),		
   owner varchar(20),
   species varchar(20),
   gender char(1),
   birth DATE,
   death DATE
);

-- 조회
select name, owner, species, gender, birth, death from pet;

-- 데이터 넣기(생성, create)
insert
  into pet
 value ('성탄이', '안대혁', 'dog', 'm', '2018-12-25', null);

-- 데이터 삭제(delete)
delete
  from pet
 where name = '성탄이';

-- load data local infile
load data local infile 'C:\\pet.txt' into table pet;


-- 조회연습1: where
-- 1990년 이후에 태어난 아이들은?
select name, species, birth
  from pet
 where birth > '1990-12-31';
 
 --- Gwen과 함께 사는 아이들은 ?
 
 
 

