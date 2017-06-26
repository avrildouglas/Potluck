create database avrildouglasPotluck;
create user 'fooduser'@'localhost' identified by 'TheFood';
grant all on avrildouglasPotluck.* to 'fooduser'@'localhost';

