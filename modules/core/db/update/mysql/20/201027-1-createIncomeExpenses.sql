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
);