delete from dept;
select * from dept;

delete from emp where dept_no is not null;
select * from emp;

-- insert
insert into dept values(null, '총무');
select no, name from dept;

update dept set name='총무2팀' where no=5;

delete from dept where no=8;

select emp_no,
       first_name, 
	date_format(hire_date, '%Y-%m-%d') 
  from employees 
where first_name like '%ty%'  
   or last_name like '%ty%' ;
   
select first_name
from employees a, salaries b
where a.emp_no = b.emp_no
and b.to_date = '9999-01-01'
and b.salary = (select min(salary) from salaries);

select a.first_name,a.last_name,b.salary
from employees a, salaries b
where a.emp_no = b.emp_no
and b.to_date = '9999-01-01'
and b.salary < (select max(salary) from salaries)
and b.salary > (select min(salary) from salaries);
