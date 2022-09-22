alter table GAZ_EMAIL add column PRINCIPAL boolean ^
update GAZ_EMAIL set PRINCIPAL = false where PRINCIPAL is null ;
alter table GAZ_EMAIL alter column PRINCIPAL set not null ;
alter table GAZ_EMAIL add column ACTIV boolean ^
update GAZ_EMAIL set ACTIV = false where ACTIV is null ;
alter table GAZ_EMAIL alter column ACTIV set not null ;
