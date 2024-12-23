-- 코드를 입력하세요 
select date_format(a.sales_date, '%Y-%m-%d') as sales_date, a.product_id, a.user_id, a.sales_amount
from online_sale a
left join offline_sale b
on a.product_id = b.product_id and a.sales_date = b.sales_date
where a.sales_date like '2022-03%'
union all
select date_format(b.sales_date, '%Y-%m-%d') as sales_date, b.product_id, null as user_id, b.sales_amount
from online_sale a
right join offline_sale b
on a.product_id = b.product_id and a.sales_date = b.sales_date
where b.sales_date like '2022-03%'
order by sales_date, product_id, user_id