alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD rename column proc_taxa_isc to proc_taxa_isc__u70737 ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD rename column taxa_isc to taxa_isc__u79735 ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD add column PROC_TAXA_ISC1 decimal(19, 2) ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD add column TAXA_ISC1 decimal(19, 2) ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD add column PROC_TAXA_ISC2 decimal(19, 2) ;
alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD add column TAXA_ISC2 decimal(19, 2) ;
