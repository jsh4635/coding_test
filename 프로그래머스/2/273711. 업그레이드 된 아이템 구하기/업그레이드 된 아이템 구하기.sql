-- 코드를 작성해주세요
select c.item_id, c.item_name, c.rarity from item_info c 
inner join (select a.item_id from item_tree a
left join item_info b
on a.PARENT_ITEM_ID = b.ITEM_ID
where a.parent_item_id is not null and b.rarity = 'RARE') d
on c.item_id = d.item_id
order by item_id desc