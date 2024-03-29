--------------------------------------------------------
--  File created - Wednesday-July-31-2019   
--------------------------------------------------------
--------------------------------------------------------
--  DDL for Table TRANSACTION_FIELD
--------------------------------------------------------

  CREATE TABLE "USRTEST"."TRANSACTION_FIELD" 
   (	"ID" NUMBER, 
	"TRANSACTION_ID" NUMBER, 
	"FIELD_TYPE" VARCHAR2(2 BYTE), 
	"FIELD_ID" NUMBER, 
	"FIELD_NAME" VARCHAR2(50 BYTE)
   ) SEGMENT CREATION IMMEDIATE 
  PCTFREE 10 PCTUSED 40 INITRANS 1 MAXTRANS 255 NOCOMPRESS LOGGING
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
REM INSERTING into USRTEST.TRANSACTION_FIELD
SET DEFINE OFF;
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (1,210040,'OU',0,'MESSAGE TYPE INDICATOR');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (2,210040,'OU',3,'PROCESSING CODE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (3,210040,'OU',4,'AMOUNT, TRANSACTION');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (4,210040,'OU',11,'SYSTEM TRACE AUDIT NUMBER');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (5,210040,'OU',12,'TIME, LOCAL TRANSACTION');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (6,210040,'OU',13,'DATE, LOCAL TRANSACTION');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (7,210040,'OU',15,'DATE, SETTLEMENT');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (8,210040,'OU',17,'DATE, CAPTURE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (9,210040,'OU',33,'FORWARDING INSTITUTION IDENT CODE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (10,210040,'OU',37,'RETRIEVAL REFERENCE NUMBER');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (11,210040,'OU',38,'AUTHORIZATION IDENTIFICATION RESPONSE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (12,210040,'OU',39,'RESPONSE CODE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (13,210040,'OU',41,'CARD ACCEPTOR TERMINAL IDENTIFICACION');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (14,210040,'OU',42,'CARD ACCEPTOR IDENTIFICATION CODE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (15,210040,'OU',54,'ADDITIONAL AMOUNTS');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (16,210040,'OU',59,'RESERVED NATIONAL');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (17,210040,'OU',60,'RESERVED PRIVATE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (18,210040,'OU',61,'RESERVED PRIVATE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (19,210040,'OU',62,'RESERVED PRIVATE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (20,210040,'OU',63,'RESERVED PRIVATE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (21,210040,'IN',0,'MESSAGE TYPE INDICATOR');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (22,210040,'IN',3,'PROCESSING CODE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (23,210040,'IN',4,'AMOUNT, TRANSACTION');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (24,210040,'IN',11,'SYSTEM TRACE AUDIT NUMBER');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (25,210040,'IN',13,'DATE, LOCAL TRANSACTION');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (26,210040,'IN',24,'NETWORK INTERNATIONAL IDENTIFIEER');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (27,210040,'IN',33,'FORWARDING INSTITUTION IDENT CODE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (28,210040,'IN',35,'TRACK 2 DATA');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (29,210040,'IN',54,'ADDITIONAL AMOUNTS');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (30,210040,'IN',61,'RESERVED PRIVATE');
Insert into USRTEST.TRANSACTION_FIELD (ID,TRANSACTION_ID,FIELD_TYPE,FIELD_ID,FIELD_NAME) values (31,210040,'IN',63,'RESERVED PRIVATE');
--------------------------------------------------------
--  DDL for Index TRANSACTION_FIELD_PK
--------------------------------------------------------

  CREATE UNIQUE INDEX "USRTEST"."TRANSACTION_FIELD_PK" ON "USRTEST"."TRANSACTION_FIELD" ("ID") 
  PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM" ;
--------------------------------------------------------
--  Constraints for Table TRANSACTION_FIELD
--------------------------------------------------------

  ALTER TABLE "USRTEST"."TRANSACTION_FIELD" ADD CONSTRAINT "TRANSACTION_FIELD_PK" PRIMARY KEY ("ID")
  USING INDEX PCTFREE 10 INITRANS 2 MAXTRANS 255 
  STORAGE(INITIAL 65536 NEXT 1048576 MINEXTENTS 1 MAXEXTENTS 2147483645
  PCTINCREASE 0 FREELISTS 1 FREELIST GROUPS 1 BUFFER_POOL DEFAULT FLASH_CACHE DEFAULT CELL_FLASH_CACHE DEFAULT)
  TABLESPACE "SYSTEM"  ENABLE;
  ALTER TABLE "USRTEST"."TRANSACTION_FIELD" MODIFY ("ID" NOT NULL ENABLE);
