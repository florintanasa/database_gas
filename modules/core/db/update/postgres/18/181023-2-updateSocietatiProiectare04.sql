alter table GAZ_SOCIETATI_PROIECTARE add constraint FK_GAZ_SOCIETATI_PROIECTARE_ON_ID_CALITATE_REP_LEGAL foreign key (ID_CALITATE_REP_LEGAL_ID) references GAZ_REP_LEGAL(ID);
create index IDX_GAZ_SOCIETATI_PROIECTARE_ON_ID_CALITATE_REP_LEGAL on GAZ_SOCIETATI_PROIECTARE (ID_CALITATE_REP_LEGAL_ID);
