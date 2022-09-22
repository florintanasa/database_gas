update GAZ_LOCATII set CORESPONDENTA = false where CORESPONDENTA is null ;
alter table GAZ_LOCATII alter column CORESPONDENTA set not null ;
update GAZ_LOCATII set DOMICILIU = false where DOMICILIU is null ;
alter table GAZ_LOCATII alter column DOMICILIU set not null ;
