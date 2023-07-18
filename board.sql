--�ܺ�Ű : Ű�� ��ӹ޾� ����ϴ� ��
--��Ģ : �θ� ���� �⺻ Ű�� ��� ��ӹ޾ƾ� ��.

--�Խ���
--�Խñ� ��ȣ(key), �Խñ� ����, �Խñ� ����, ��Ÿ �Ӽ�(��¥, �۾��� ���)�� ��
--�Խ����� ������ �ִٸ� ���̺��� �������� �Ǿ�� �ұ�?
--CATEGORY ����ϸ� �ȴ�

COMMIT;
ROLLBACK;

CREATE TABLE AND_BOARD(
    BOARD_CATEGORY VARCHAR2(10) NOT NULL,  --������ Ű
    BOARD_NO NUMBER NOT NULL,  --�ڵ� ����(������, Ʈ����)
    BOARD_TITLE VARCHAR2(200),
    BOARD_CONTENT VARCHAR2(2000),
    CREATE_DATE DATE,
    CREATE_BY VARCHAR2(100),
    UPDATE_DATE DATE,
    CONSTRAINT AND_BOARD_PK PRIMARY KEY 
    (
    BOARD_CATEGORY 
  , BOARD_NO 
  )
  ENABLE,
  CONSTRAINT AND_BOARD_FK FOREIGN KEY
(
  CREATE_BY 
)
REFERENCES ANDMEMBER
(
  ID 
)
ENABLE
);

INSERT INTO AND_BOARD(BOARD_CATEGORY, BOARD_NO, BOARD_TITLE, BOARD_CONTENT, CREATE_DATE, CREATE_BY)
VALUES ('B', SEQ_AND_BOARD.NEXTVAL, '���', '�������� ���', SYSDATE, 'dev');

SELECT * FROM AND_BOARD WHERE BOARD_CATEGORY = 'B';

--AND_BOARD_REPLY

CREATE TABLE AND_BOARD_REPLY(
    BOARD_CATEGORY VARCHAR2(10) NOT NULL,  --�θ� ���̺��� Ű�� �����ϱ� ���� �÷�1
    BOARD_NO NUMBER NOT NULL,  --�θ� ���̺��� Ű�� �����ϱ� ���� �÷�2
    REPLY_NO NUMBER NOT NULL,  --�θ� Ű �÷� 1, 2 + ����� �����ϱ� ���� Ű
    REPLY_CONTENT VARCHAR2(2000),
    CREATE_DATE DATE,
    CREATE_BY VARCHAR2(100),
    UPDATE_DATE DATE,
CONSTRAINT AND_BOARD_REPLY_PK PRIMARY KEY (REPLY_NO)ENABLE,
CONSTRAINT AND_BOARD_REPLY_FK_1 FOREIGN KEY
(
  CREATE_BY 
)
REFERENCES ANDMEMBER
(
  ID 
)
ENABLE,
CONSTRAINT AND_BOARD_REPLY_FK_2 FOREIGN KEY
(
  BOARD_CATEGORY
, BOARD_NO 
)
REFERENCES AND_BOARD
(
  BOARD_CATEGORY 
, BOARD_NO 
)
ENABLE
);

SELECT * FROM AND_BOARD_REPLY;

INSERT INTO AND_BOARD_REPLY(BOARD_CATEGORY, BOARD_NO, REPLY_NO, REPLY_CONTENT, CREATE_DATE, CREATE_BY)
VALUES ('B', 1, 1,'����', SYSDATE, 'dev');

--������ �����
--CREATE SEQUENCE [������ �̸�] INCREMENT BY [������(����)];
--CURRVAR: ���� ������(������ ����), NEXTVAR: ������(��� �þ)
CREATE SEQUENCE SEQ_TEST
INCREMENT BY 1;

SELECT SEQ_TEST.NEXTVAL FROM DUAL;
DROP SEQUENCE SEQ_TEST;

--SEQ_AND_BOARD ���� AND_BOARD�� INSERT
CREATE SEQUENCE SEQ_AND_BOARD
INCREMENT BY 1;

SELECT SEQ_AND_BOARD.NEXTVAL FROM DUAL;



--TRIGGER �� �⺻����.
--CREATE [ OR REPLACE ] TRIGGER [ schema.] trigger
--BEFORE | AFTER | INSTEAD OF
--DML EVENT ( INSERT [OR] UPDATE [OR] DELETE )
--ON [SCHEMA.] DATABASE TABLE
--WHEN ( ����)
--PL/SQL_BLOCK | CALL_PROCEDURE_STATEMENT ;


--Ʈ���� : Ʈ������� �߻��ϴ� �۾��� �ϱ� �� �Ǵ� �Ŀ� � ������ �����ϰ� ����� ��
--����            NEW             /               OLD
--INSERT   ���ε��µ�����(��)   / NULL : ������ ���� ���� �߰��� ���� ����(OLD) �����ʹ� ����
--UPDATE     �ٲ� ������(��)      /        �ٲ�� �� ������(��)
--DELETE          NULL            /        �����Ǵ� ������(����)

--FOR EACH ROW : INSERT, UPDATE, DELETE�� �������� �ѹ��� �۾��Ǵ� ��찡 ������. ���� �� �ึ�� �۾��� �����Ѵ�.
--BEGIN END; : PL/SQL���� { }�߰�ȣ ����


--BEFORE <- �̺�Ʈ -> AFTER
--TRIGGER�� �̿��ؼ� ���� ������ ���� AND_BOARD_HISTORY�� �̷� ����
CREATE TABLE AND_BOARD_HISTORY(
    BOARD_CATEGORY VARCHAR2(10) NOT NULL,
    BOARD_NO NUMBER NOT NULL,
    BOARD_TITLE VARCHAR2(200),
    BOARD_CONTENT VARCHAR2(2000),
    CREATE_DATE DATE,
    SATATUS_VALUE VARCHAR2(50));
    
CREATE OR REPLACE TRIGGER TRG_AND_BOARD
AFTER UPDATE OR DELETE -- ����(���̺��� ���� �Ǵ� ���� �� ��)
ON AND_BOARD --Ʈ���Ÿ� ������ ���̺� �̸�
FOR EACH ROW --�� �ึ�� ����
BEGIN --����� : �ڹ��� �߰�ȣ (for(){})
    IF UPDATING THEN
    INSERT INTO AND_BOARD_HISTORY
    VALUES ( :OLD.BOARD_CATEGORY, :OLD.BOARD_NO, :OLD.BOARD_TITLE, :OLD.BOARD_CONTENT, sysdate, 'update');
    
    ELSIF DELETING THEN
    INSERT INTO AND_BOARD_HISTORY
    VALUES ( :OLD.BOARD_CATEGORY, :OLD.BOARD_NO, :OLD.BOARD_TITLE, :OLD.BOARD_CONTENT, sysdate, 'delete');
    
    END IF;
END;


CREATE OR REPLACE TRIGGER TRG_AND_BOARD_PK
BEFORE INSERT -- ����(�߰� �� ����)
ON AND_BOARD --Ʈ���Ÿ� ������ ���̺� �̸�
FOR EACH ROW --�� �ึ�� ����
BEGIN --����� : �ڹ��� �߰�ȣ (for(){})
    :NEW.BOARD_NO := SEQ_AND_BOARD.NEXTVAL;
END;


