alter table GAZ_ACORD_ACCES rename column nod to nod__u86633 ;
alter table GAZ_ACORD_ACCES alter column nod__u86633 drop not null ;
-- alter table GAZ_ACORD_ACCES add column ID_CONDUCTA_ID uuid ^
-- update GAZ_ACORD_ACCES set ID_CONDUCTA_ID = <default_value> ;
-- alter table GAZ_ACORD_ACCES alter column ID_CONDUCTA_ID set not null ;
alter table GAZ_ACORD_ACCES add column ID_CONDUCTA_ID uuid not null ;
