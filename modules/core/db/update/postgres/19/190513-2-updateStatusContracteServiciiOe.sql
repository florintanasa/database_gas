alter table GAZ_STATUS_CONTRACTE_SERVICII_OE rename column activ to activ__u28786 ;
alter table GAZ_STATUS_CONTRACTE_SERVICII_OE alter column activ__u28786 drop not null ;
alter table GAZ_STATUS_CONTRACTE_SERVICII_OE add column ACTIV boolean ^
update GAZ_STATUS_CONTRACTE_SERVICII_OE set ACTIV = false where ACTIV is null ;
alter table GAZ_STATUS_CONTRACTE_SERVICII_OE alter column ACTIV set not null ;
