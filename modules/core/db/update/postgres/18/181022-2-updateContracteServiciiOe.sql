alter table GAZ_CONTRACTE_SERVICII_OE add column TARIF_RACORDARE decimal(19, 2) ^
update GAZ_CONTRACTE_SERVICII_OE set TARIF_RACORDARE = 0 where TARIF_RACORDARE is null ;
alter table GAZ_CONTRACTE_SERVICII_OE alter column TARIF_RACORDARE set not null ;
