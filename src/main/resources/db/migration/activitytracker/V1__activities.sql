CREATE TABLE activities (id BIGINT AUTO_INCREMENT,
start_time TIMESTAMP,activity_desc VARCHAR(255),
activity_type VARCHAR(255),PRIMARY KEY (id));

insert into activities(start_time,activity_desc,activity_type) values ('2020-03-25 09:00:00','biking in Tatra','BIKING')
insert into activities(start_time,activity_desc,activity_type) values ('2020-03-24 09:00:00','hiking in Tatra','HIKING')
insert into activities(start_time,activity_desc,activity_type) values ('2020-03-22 09:00:00','running in Tatra','RUNNING')
