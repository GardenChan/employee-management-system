CREATE TABLE t_user(
	id VARCHAR(40) PRIMARY KEY,
	username VARCHAR(40),
	realname VARCHAR(40),
	password VARCHAR(40),
	sex VARCHAR(8)
);


CREATE TABLE t_emp(
	id VARCHAR(40) PRIMARY KEY,
	name VARCHAR(60),
	salary DOUBLE(7,2),
	age int(3),
	bir date
);