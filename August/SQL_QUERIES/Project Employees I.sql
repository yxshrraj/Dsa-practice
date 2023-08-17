# Write your MySQL query statement below
select t1.project_id , Round(Sum(t2.experience_years)/count(t1.project_id),2) as
average_years from Project as t1 left join Employee as t2 on
t2.employee_id = t1.employee_id group by project_id;
