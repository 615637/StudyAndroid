--Table�� : AndMember
--�÷� : id, password, name, phonenumber, address, profileimg, gender

--Ű : id, ���� : ��/�� ��й�ȣ, �̸� : not null, �����ʹ� 2�� ����

create table AndMember(
id          VARCHAR2(100) constraint AndMember_id_pk primary key,
password    VARCHAR2(100) not null,
name        VARCHAR2(20) not null,
phonenumber NUMBER(20),
address     VARCHAR2(500),
profileimg  VARCHAR2(500),
gender      VARCHAR2(3) default '��' check (gender in('��', '��')) enable
);

insert into andmember(ID, PASSWORD, NAME, PHONENUMBER, ADDRESS, PROFILEIMG, GENDER)
values ('dev', 'dev', '������', 01012345678, '���� ���� �󼺵�', 'https://i.ytimg.com/vi/eCelrExcHy4/maxresdefault.jpg', '��');

commit;
select * from andmember;
