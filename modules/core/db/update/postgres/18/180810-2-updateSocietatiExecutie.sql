alter table GAZ_SOCIETATI_EXECUTIE rename column id_locatii_id to id_locatii_id__u93714 ;
alter table GAZ_SOCIETATI_EXECUTIE alter column id_locatii_id__u93714 drop not null ;
drop index IDX_GAZ_SOCIETATI_EXECUTIE_ON_ID_LOCATII ;
alter table GAZ_SOCIETATI_EXECUTIE drop constraint FK_GAZ_SOCIETATI_EXECUTIE_ON_ID_LOCATII ;
-- alter table GAZ_SOCIETATI_EXECUTIE add column ID_LOCATII_ID uuid ^
-- update GAZ_SOCIETATI_EXECUTIE set ID_LOCATII_ID = <default_value> ;
-- alter table GAZ_SOCIETATI_EXECUTIE alter column id_locatii_id set not null ;
alter table GAZ_SOCIETATI_EXECUTIE add column ID_LOCATII_ID uuid not null ;
