create sequence user_seq
start with 0
increment by 1
minvalue 0;

create sequence content_seq
start with 0
increment by 1
minvalue 0;

create table board_info_table(
board_info_idx number constraint BOARD_INFO_PK primary key,
board_info_name varchar2(50) not null);


insert into board_info_table(board_info_idx,board_info_name) values(1,'1팀');
insert into board_info_table(board_info_idx,board_info_name) values(2,'2팀');
insert into board_info_table(board_info_idx,board_info_name) values(3,'3팀');
insert into board_info_table(board_info_idx,board_info_name) values(4,'4팀');

select * from board_info_table;
commit;


create table user_table(
user_idx number constraint USER_PK primary key,
user_name varchar2(50) not null,
user_id varchar2(100) not null,
user_pw varchar2(50) not null);


create table content_table(
content_idx number constraint CONTENT_PK primary key,
content_subject varchar2(100) not null,
content_text long not null,
content_writer_idx number not null
constraint CONTENT_FK1 references user_table(user_idx),
content_board_idx number not null
constraint CONTENT_FK2 references board_info_table(board_info_idx),
content_date date not null);


select board_info_idx, board_info_name
from board_info_table
order by board_info_idx;


select user_name
from user_table
where user_id='abcde';

select * from user_table;
select * from user_table;


select user_idx, user_name
from user_table
where user_id='aa1111' and user_pw='12345';

select user_id, user_name
from user_table
where user_idx=0;

select * from content_table;

select board_info_name
from board_info_table
where board_info_idx=1;

select A1.content_idx, A1.content_subject, A2.user_name as content_writer_name, 
to_char(A1.content_date, 'YYYY-MM-DD') as content_date
from content_table A1, user_table A2
where A1.content_writer_idx = A2.user_idx 
and A1.content_board_idx =1
order by A1.content_idx desc;

select A2.user_name as content_write_name,
to_char(A1.content_date, 'YYYY-MM-DD')as content_date,
A1.content_subject, A1.content_text
from content_table A1, user_table A2
where A1.content_writer_idx=A2.user_idx
and content_idx=0;

 
update content_table set content_subject='제목', content_text='내용' 
where content_idx='2';