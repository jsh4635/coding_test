-- 코드를 작성해주세요
with recursive year_max as (
    select date_format(DIFFERENTIATION_DATE,'%Y') as year, max(size_of_colony) as max_size
    from ecoli_data
    group by year
)

select convert(date_format(a.DIFFERENTIATION_DATE,'%Y'), signed) as YEAR, b.max_size - a.SIZE_OF_COLONY as YEAR_DEV, a.ID
from ecoli_data a
join year_max b on date_format(a.DIFFERENTIATION_DATE,'%Y') = b.year
order by year asc, year_dev asc