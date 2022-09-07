-- 创建用户
create user 'mp_high'@'%' identified by 'XueGod!@#123';
-- 创建数据库
create database if not exists mp_high default character set utf8 default collate utf8_general_ci;
-- 授权mysql5.7
grant all on mp_high.* to 'mp_high'@'%' identified by 'XueGod!@#123';
-- 授权mysql8.1
grant all privileges on mp_high.* to 'mp_high'@'%' with grant option;
alter user 'mp_high'@'%' identified with mysql_native_password by 'XueGod!@#123'; #修改加密规则
alter user 'mp_high'@'%' identified by 'XueGod!@#123' password expire never; #更新一下用户的密码且不过期
-- 刷新权限
flush privileges;