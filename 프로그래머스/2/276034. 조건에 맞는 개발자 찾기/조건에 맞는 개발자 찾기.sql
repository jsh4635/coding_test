-- 코드를 작성해주세요
select id, email, first_name, last_name from DEVELOPERS 
where skill_code & (select `code` from skillcodes where name = 'C#') = (select `code` from skillcodes where name = 'C#') or skill_code & (select `code` from skillcodes where name = 'Python') = (select `code` from skillcodes where name = 'Python') order by id asc