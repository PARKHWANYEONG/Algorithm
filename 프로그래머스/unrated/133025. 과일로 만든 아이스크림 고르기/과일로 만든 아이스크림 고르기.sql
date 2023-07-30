-- 코드를 입력하세요
SELECT o.FLAVOR FROM FIRST_HALF o 
LEFT JOIN ICECREAM_INFO i ON o.FLAVOR = i.FLAVOR
WHERE o.TOTAL_ORDER >= 3000 AND i.INGREDIENT_TYPE = 'fruit_based' 
ORDER BY o.TOTAL_ORDER DESC;
