alter table GAZ_CONTRACTE_RACORDARE_SD add constraint FK_GAZ_CONTRACTE_RACORDARE_SD_ON_ID_NOTIFICARE_OSD_ATR foreign key (ID_NOTIFICARE_OSD_ATR_ID) references GAZ_NOTIFICARE_OSD_ATR(ID);
create index IDX_GAZ_CONTRACTE_RACORDARE_SD_ON_ID_NOTIFICARE_OSD_ATR on GAZ_CONTRACTE_RACORDARE_SD (ID_NOTIFICARE_OSD_ATR_ID);