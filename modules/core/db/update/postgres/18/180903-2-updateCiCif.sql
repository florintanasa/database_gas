update GAZ_CI_CIF set VALABIL = false where VALABIL is null ;
alter table GAZ_CI_CIF alter column VALABIL set not null ;
