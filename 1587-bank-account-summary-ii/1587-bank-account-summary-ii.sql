select name, balance from (select u.name,t.account,sum(t.amount) balance from Users u inner join transactions t on u.account=t.account group by t.account) tt where balance>10000;

# {"headers": ["name", "account", "sum(t.amount)"], 
# "values": [["Alice", 900001, 11000], 
#            ["Bob", 900002, 1000], 
#            ["Charlie", 900003, 8000]]}