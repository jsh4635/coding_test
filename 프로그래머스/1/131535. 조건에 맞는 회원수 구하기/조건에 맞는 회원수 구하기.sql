-- 코드를 입력하세요
SELECT count(*) as users from user_info where age >= 20 and age <= 29 and age is not null and joined like "2021%"