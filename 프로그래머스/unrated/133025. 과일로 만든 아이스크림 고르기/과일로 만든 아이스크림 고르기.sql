-- 코드를 입력하세요
SELECT f.FLAVOR from FIRST_HALF as f left join ICECREAM_INFO as i on f.FLAVOR = i.FLAVOR 
where f.total_order > 3000 and i.INGREDIENT_TYPE = 'fruit_based' order by f.TOTAL_ORDER desc;