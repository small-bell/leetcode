delete from Person
where id not in (
    select * from (
       select min(id) mm
       from Person
       group by email
   ) a
)