alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD add constraint FK_GAZ_OFERCONTRACOSD_ON_IDSTATOFERCONTRACOSD foreign key (ID_STATUS_OFERTE_CONTRACTE_RACORDARE_SD_ID) references GAZ_STATUS_OFERTE_CONTRACTE_RACORDARE_SD(ID);
create index IDX_GAZ_OFERCONTRACOSD_ON_IDSTATOFERCONTRACOSD on GAZ_OFERTE_CONTRACTE_RACORDARE_SD (ID_STATUS_OFERTE_CONTRACTE_RACORDARE_SD_ID);