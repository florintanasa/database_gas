update GAZ_CONDUCTA set MONTAJ_INGROPAT = false where MONTAJ_INGROPAT is null ;
alter table GAZ_CONDUCTA alter column MONTAJ_INGROPAT set not null ;
update GAZ_CONDUCTA set MONTAJ_APARENT = false where MONTAJ_APARENT is null ;
alter table GAZ_CONDUCTA alter column MONTAJ_APARENT set not null ;
