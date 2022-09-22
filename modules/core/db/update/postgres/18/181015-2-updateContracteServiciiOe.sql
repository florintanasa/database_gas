alter table GAZ_CONTRACTE_SERVICII_OE rename column locatia_2_id to locatia_2_id__u19171 ;
alter table GAZ_CONTRACTE_SERVICII_OE alter column locatia_2_id__u19171 drop not null ;
drop index IDX_GAZ_CONTRACTE_SERVICII_OE_ON_LOCATIA_2 ;
alter table GAZ_CONTRACTE_SERVICII_OE drop constraint FK_GAZ_CONTRACTE_SERVICII_OE_ON_LOCATIA_2 ;
-- alter table GAZ_CONTRACTE_SERVICII_OE add column LOCATIA_2_ID uuid ^
-- update GAZ_CONTRACTE_SERVICII_OE set LOCATIA_2_ID = <default_value> ;
-- alter table GAZ_CONTRACTE_SERVICII_OE alter column locatia_2_id set not null ;
alter table GAZ_CONTRACTE_SERVICII_OE add column LOCATIA_2_ID uuid not null ;
