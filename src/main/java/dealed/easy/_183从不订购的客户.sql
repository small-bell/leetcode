
select name
from Customers
where id not in (
    select distinct customerId
    from Orders
)