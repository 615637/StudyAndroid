--Table명 : AndMember
--컬럼 : id, password, name, phonenumber, address, profileimg, gender

--키 : id, 성별 : 남/여 비밀번호, 이름 : not null, 데이터는 2건 정도

create table AndMember(
id          VARCHAR2(100) constraint AndMember_id_pk primary key,
password    VARCHAR2(100) not null,
name        VARCHAR2(20) not null,
phonenumber NUMBER(20),
address     VARCHAR2(500),
profileimg  VARCHAR2(500),
gender      VARCHAR2(3) default '남' check (gender in('남', '여')) enable
);

insert into andmember(ID, PASSWORD, NAME, PHONENUMBER, ADDRESS, PROFILEIMG, GENDER)
values ('dev', 'dev', '남도일', 01012345678, '광주 서구 농성동', 'https://i.ytimg.com/vi/eCelrExcHy4/maxresdefault.jpg', '남');

commit;
select * from andmember;
