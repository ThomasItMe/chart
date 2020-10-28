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
    REVOLVING integer,
    TERM_LOAN integer,
    GRAND_TOTAL integer,
    --
    primary key (ID)
);