-- 코드를 작성해주세요
with recursive gen as (
    select id, parent_id, 1 as g
    from ecoli_data
    where parent_id is null
    
    union all
    
    select e.id, e.parent_id, gen.g + 1 as g
    from ecoli_data e
    inner join gen on e.parent_id = gen.id
)

select count(*) as count, c.g as generation
from ecoli_data a
right join gen c on a.parent_id = c.id
where a.id is null
group by c.g