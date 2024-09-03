create database truckmgt;
create table truck(
			id int primary key auto_increment,
            name varchar(255),
            model varchar(255),
            capacity int,
            driver_name varchar(255),
	);