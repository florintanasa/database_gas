alter table GAZ_NOTIFICARE_OSD_ATR add constraint FK_GAZ_NOTIFICARE_OSD_ATR_ON_ID_EMAIL foreign key (ID_EMAIL_ID) references GAZ_EMAIL(ID);
create index IDX_GAZ_NOTIFICARE_OSD_ATR_ON_ID_EMAIL on GAZ_NOTIFICARE_OSD_ATR (ID_EMAIL_ID);
