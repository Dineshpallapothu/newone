
select *
from publishers
SELECT *
from titles

select p.pub_name, count(t.title) as No_of_titles
from publishers p join titles t on p.pub_id=t.pub_id
GROUP by p.pub_name

select *
from titleauthor
select *
from authors
select *
from sales
select *
from stores
select *
from titles

select t.title, a.au_lname, t.price
from titleauthor ta join authors a on ta.au_id=a.au_id JOIN titles t on ta.title_id= t.title_id

select *
from authors
select *
from sales
SELECT *
from publishers
select *
from titleauthor

select avg(price)
from titles

select type, COUNT(title_id)
from titles
GROUP by [type]
having avg(price)<20

select p.city, count(t.title_id) as nou
from publishers p join titles t on p.pub_id=t.pub_id
GROUP By city

select au_lname, au_fname
from authors
where au_id in (select au_id
from titleauthor
group by au_id
having COUNT(title_id)>1)
