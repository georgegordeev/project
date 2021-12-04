select department_id, name from employee
where id = cheif_id;

select name, max(salary) from employee
where id <> cheif_id
group by name;

select department_id, max(salary) from employee where id <> cheif_id group by department_id;

select department_id, name
from employee e
    inner join (select department_id as d_id, max(salary) as max_s from employee where id <> cheif_id group by department_id) s on s.d_id = e.department_id
where id = cheif_id and salary > max_s;

select * from employee;

select department_id, cheif_id, name from employee where id = cheif_id;

select department_id, cheif_id, name
from employee e
    inner join (select department_id as d_id, cheif_id as c_id from employee where id = cheif_id) cofd on cofd.d_id = e.department_id
where d_id = department_id and c_id <> cheif_id
order by department_id;