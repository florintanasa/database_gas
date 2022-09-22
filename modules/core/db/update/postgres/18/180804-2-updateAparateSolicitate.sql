alter table GAZ_APARATE_SOLICITATE rename column id_aparate_id to id_aparate_id__u33108 ;
alter table GAZ_APARATE_SOLICITATE alter column id_aparate_id__u33108 drop not null ;
drop index IDX_GAZ_APARATE_SOLICITATE_ON_ID_APARATE ;
-- alter table GAZ_APARATE_SOLICITATE add column ID_APARATE_ID uuid ^
-- update GAZ_APARATE_SOLICITATE set ID_APARATE_ID = <default_value> ;
-- alter table GAZ_APARATE_SOLICITATE alter column id_aparate_id set not null ;
alter table GAZ_APARATE_SOLICITATE add column ID_APARATE_ID uuid not null ;
