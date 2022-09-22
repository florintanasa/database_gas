update GAZ_EMAIL set ADRESA_EMAIL = '' where ADRESA_EMAIL is null ;
alter table GAZ_EMAIL alter column ADRESA_EMAIL set not null ;
