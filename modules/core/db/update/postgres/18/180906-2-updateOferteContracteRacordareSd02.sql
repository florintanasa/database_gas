alter table GAZ_OFERTE_CONTRACTE_RACORDARE_SD add constraint FK_GAZ_OFERTE_CONTRACTE_RACORDARE_SD_ON_ID_EMAIL foreign key (ID_EMAIL_ID) references GAZ_EMAIL(ID);
create index IDX_GAZ_OFERTE_CONTRACTE_RACORDARE_SD_ON_ID_EMAIL on GAZ_OFERTE_CONTRACTE_RACORDARE_SD (ID_EMAIL_ID);
