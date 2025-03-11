# Write your MySQL query statement below
select year, price, product_name from Sales INNER JOIN Product ON Sales.product_id = Product.product_id