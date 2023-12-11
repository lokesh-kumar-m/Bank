create database bankingapp;
use bankingapp;

create table signup(
    formno Varchar(10),
    name Varchar(20),
    DOB Varchar(20),
    gender Varchar(20),
    email Varchar(40),
    mstatus Varchar(20),
    address Varchar(20),
    city Varchar(20),
    pincode Varchar(20),
    state Varchar(20)
);

create table signuptwo(
    formno Varchar(10),
    cardno Varchar(20),
    pin Varchar(20),
    services Varchar(20),
    edu Varchar(40),
    acctype Varchar(20),
    inc Varchar(20),
    occ Varchar(20),
    ibn Varchar(20)
);
create table login(
    formno Varchar(10),
    cardno Varchar(20),
    pin Varchar(20)
);

create table bank(
    pin varchar(10),
    date varchar(40),
    type varchar(20),
    amount varchar(10)
);