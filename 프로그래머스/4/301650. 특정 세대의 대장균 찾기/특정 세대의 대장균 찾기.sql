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

select a.id from ecoli_data a left join gen b on a.id = b.id where b.g = 3