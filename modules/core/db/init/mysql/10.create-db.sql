-- begin CHARTEXAMPLE_PIVOT_TABLE
create table CHARTEXAMPLE_PIVOT_TABLE (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    ROW_ integer,
    TOTAL_BILL double precision,
    SEX varchar(50),
    SMOKER varchar(50),
    DAY_ varchar(50),
    TIME_ varchar(50),
    SIZE_ integer,
    TIP double precision,
    --
    primary key (ID)
)^
-- end CHARTEXAMPLE_PIVOT_TABLE
-- begin CHARTEXAMPLE_PRODUCT
create table CHARTEXAMPLE_PRODUCT (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    ROW_LABELS varchar(50),
    CATEGORY varchar(255),
    NAME varchar(255),
    REVOLVING integer,
    TERM_LOAN integer,
    GRAND_TOTAL integer,
    --
    primary key (ID)
)^
-- end CHARTEXAMPLE_PRODUCT
-- begin CHARTEXAMPLE_INCOME_EXPENSES
create table CHARTEXAMPLE_INCOME_EXPENSES (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    YEAR_ integer not null,
    INCOME double precision not null,
    EXPENSES double precision not null,
    ALPHA double precision,
    DASH_LENGTH_LINE integer,
    DASH_LENGTH_COLUMN integer,
    ADDITIONAL varchar(255),
    --
    primary key (ID)
)^
-- end CHARTEXAMPLE_INCOME_EXPENSES
-- begin CHARTEXAMPLE_COUNTRY_SALES
create table CHARTEXAMPLE_COUNTRY_SALES (
    ID varchar(32),
    VERSION integer not null,
    CREATE_TS datetime(3),
    CREATED_BY varchar(50),
    UPDATE_TS datetime(3),
    UPDATED_BY varchar(50),
    DELETE_TS datetime(3),
    DELETED_BY varchar(50),
    --
    PRODUCT varchar(255),
    CATEGORY varchar(255),
    COUNTRY varchar(255),
    SALES integer,
    EXPENSE integer,
    --
    primary key (ID)
)^
-- end CHARTEXAMPLE_COUNTRY_SALES
