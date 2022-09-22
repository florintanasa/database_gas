alter table GAZ_CONTRACTE_SERVICII_OE add constraint FK_GAZ_CONTRACTE_SERVICII_OE_ON_ID_SIRUTA foreign key (ID_SIRUTA_ID) references GAZ_SIRUTA(ID);
alter table GAZ_CONTRACTE_SERVICII_OE add constraint FK_GAZ_CONTRACTE_SERVICII_OE_ON_ID_SOCIETATI_PROIECTARE foreign key (ID_SOCIETATI_PROIECTARE_ID) references GAZ_SOCIETATI_PROIECTARE(ID);
alter table GAZ_CONTRACTE_SERVICII_OE add constraint FK_GAZ_CONTRACTE_SERVICII_OE_ON_ID_VERIFICATOR foreign key (ID_VERIFICATOR_ID) references GAZ_VERIFICATOR(ID);
alter table GAZ_CONTRACTE_SERVICII_OE add constraint FK_GAZ_CONTRACTE_SERVICII_OE_ON_ID_SOCIETATI_EXECUTIE foreign key (ID_SOCIETATI_EXECUTIE_ID) references GAZ_SOCIETATI_EXECUTIE(ID);
alter table GAZ_CONTRACTE_SERVICII_OE add constraint FK_GAZ_CONTRACTE_SERVICII_OE_ON_ID_NOTIFICARE_OSD_ATR foreign key (ID_NOTIFICARE_OSD_ATR_ID) references GAZ_NOTIFICARE_OSD_ATR(ID);
alter table GAZ_CONTRACTE_SERVICII_OE add constraint FK_GAZ_CONTRACTE_SERVICII_OE_ON_ID_ACORD_TEHNIC_RACORDARE foreign key (ID_ACORD_TEHNIC_RACORDARE_ID) references GAZ_ACORD_TEHNIC_RACORDARE(ID);
alter table GAZ_CONTRACTE_SERVICII_OE add constraint FK_GAZ_CONTRACTE_SERVICII_OE_ON_LOCATIA_2 foreign key (LOCATIA_2_ID) references GAZ_LOCALITATI(ID);
create index IDX_GAZ_CONTRACTE_SERVICII_OE_ON_ID_SIRUTA on GAZ_CONTRACTE_SERVICII_OE (ID_SIRUTA_ID);
create index IDX_GAZ_CONTRACTE_SERVICII_OE_ON_ID_SOCIETATI_PROIECTARE on GAZ_CONTRACTE_SERVICII_OE (ID_SOCIETATI_PROIECTARE_ID);
create index IDX_GAZ_CONTRACTE_SERVICII_OE_ON_ID_VERIFICATOR on GAZ_CONTRACTE_SERVICII_OE (ID_VERIFICATOR_ID);
create index IDX_GAZ_CONTRACTE_SERVICII_OE_ON_ID_SOCIETATI_EXECUTIE on GAZ_CONTRACTE_SERVICII_OE (ID_SOCIETATI_EXECUTIE_ID);
create index IDX_GAZ_CONTRACTE_SERVICII_OE_ON_ID_NOTIFICARE_OSD_ATR on GAZ_CONTRACTE_SERVICII_OE (ID_NOTIFICARE_OSD_ATR_ID);
create index IDX_GAZ_CONTRACTE_SERVICII_OE_ON_ID_ACORD_TEHNIC_RACORDARE on GAZ_CONTRACTE_SERVICII_OE (ID_ACORD_TEHNIC_RACORDARE_ID);
create index IDX_GAZ_CONTRACTE_SERVICII_OE_ON_LOCATIA_2 on GAZ_CONTRACTE_SERVICII_OE (LOCATIA_2_ID);