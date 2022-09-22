alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD rename column nrinreg to nrinreg__u76035 ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD alter column nrinreg__u76035 drop not null ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD add column NRINREG integer ^
update GAZ_OFERTE_CONTRACTE_RACORDARE_SD set NRINREG = 0 where NRINREG is null ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD alter column NRINREG set not null ;
update GAZ_OFERTE_CONTRACTE_RACORDARE_SD set TVA_TARIF_RACORDARE = 0 where TVA_TARIF_RACORDARE is null ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD alter column TVA_TARIF_RACORDARE set not null ;
update GAZ_OFERTE_CONTRACTE_RACORDARE_SD set TOTAL_TARIF_RACORDARE = 0 where TOTAL_TARIF_RACORDARE is null ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD alter column TOTAL_TARIF_RACORDARE set not null ;
