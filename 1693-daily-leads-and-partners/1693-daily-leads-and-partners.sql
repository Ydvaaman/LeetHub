# Write your MySQL query statement below
select date_id, make_name,        /*select the required column name*/
count(distinct(lead_id)) as unique_leads, /*count the different lead_id value and named the column as unique_leads*/
count(distinct(partner_id)) as unique_partners  /*count the different partner_id value and named the column as                                                             unique_partners*/
from DailySales                            /* from the daily sales table*/
group by date_id, make_name;             /* and group the table into date_id and make_name */
