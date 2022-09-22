alter table GAZ_SOCIETATI_EXECUTIE add constraint FK_GAZ_SOCIETATI_EXECUTIE_ON_ID_PARTENERI foreign key (ID_PARTENERI_ID) references GAZ_PARTENERI(ID);
alter table GAZ_SOCIETATI_EXECUTIE add constraint FK_GAZ_SOCIETATI_EXECUTIE_ON_ID_LOCATII foreign key (ID_LOCATII_ID) references GAZ_LOCALITATI(ID);
alter table GAZ_SOCIETATI_EXECUTIE add constraint FK_GAZ_SOCIETATI_EXECUTIE_ON_ID_TELEFOANE foreign key (ID_TELEFOANE_ID) references GAZ_TELEFOANE(ID);
alter table GAZ_SOCIETATI_EXECUTIE add constraint FK_GAZ_SOCIETATI_EXECUTIE_ON_ID_CONTURI_BANCARE_PARTENERI foreign key (ID_CONTURI_BANCARE_PARTENERI_ID) references GAZ_CONTURI_BANCARE_PARTENERI(ID);
create index IDX_GAZ_SOCIETATI_EXECUTIE_ON_ID_PARTENERI on GAZ_SOCIETATI_EXECUTIE (ID_PARTENERI_ID);
create index IDX_GAZ_SOCIETATI_EXECUTIE_ON_ID_LOCATII on GAZ_SOCIETATI_EXECUTIE (ID_LOCATII_ID);
create index IDX_GAZ_SOCIETATI_EXECUTIE_ON_ID_TELEFOANE on GAZ_SOCIETATI_EXECUTIE (ID_TELEFOANE_ID);
create index IDX_GAZ_SOCIETATI_EXECUTIE_ON_ID_CONTURI_BANCARE_PARTENERI on GAZ_SOCIETATI_EXECUTIE (ID_CONTURI_BANCARE_PARTENERI_ID);