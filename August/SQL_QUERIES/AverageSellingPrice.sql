select t1.product_id , Round(Sum(t1.price*t2.units) / sum(t2.units),2) as average_price 
from Prices as t1 inner join UnitsSold as t2 on t1.product_id = t2.product_id and
t2.purchase_date between t1.start_date and t1.end_date
group by product_id;
