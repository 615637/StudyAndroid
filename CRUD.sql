insert into CRUD_RETROFIT(COL1, COL2)
values('�ȳ�', '�ȳ��ϼ���');

update CRUD_RETROFIT set col1='aa', col2='bb' where col_no=1;

delete from CRUD_RETROFIT where col_no=1;


select * from CRUD_RETROFIT;


rollback;

commit;



CREATE OR REPLACE TRIGGER TRG_CRUD_RETROFIT_PK
BEFORE INSERT -- ����(�߰� �� ����)
ON CRUD_RETROFIT --Ʈ���Ÿ� ������ ���̺� �̸�
FOR EACH ROW --�� �ึ�� ����
BEGIN --����� : �ڹ��� �߰�ȣ (for(){})
    :NEW.COL_NO := SEQ_CRUD_RETROFIT.NEXTVAL;
END;

CREATE SEQUENCE SEQ_CRUD_RETROFIT INCREMENT BY 1;

DROP TRIGGER TRG_CRUD_RETROFIT_PK;

CREATE TABLE CRUD_RETROFIT(
    COL_NO NUMBER PRIMARY KEY NOT NULL,
    COL1 VARCHAR2(1000),
    COL2 VARCHAR2(1000)
);
