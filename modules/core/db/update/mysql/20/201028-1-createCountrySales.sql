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
);