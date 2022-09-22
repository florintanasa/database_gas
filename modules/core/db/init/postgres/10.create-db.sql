-- begin GAZ_ARTERA
create table GAZ_ARTERA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIP_ARTERA varchar(15) not null,
    --
    primary key (ID)
)^
-- end GAZ_ARTERA
-- begin GAZ_PARTENERI
create table GAZ_PARTENERI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_TIP_PERSOANA_ID uuid not null,
    DENUMIRE varchar(255) not null,
    --
    primary key (ID)
)^
-- end GAZ_PARTENERI
-- begin GAZ_TARI
create table GAZ_TARI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DENUMIRE_TARA varchar(25) not null,
    --
    primary key (ID)
)^
-- end GAZ_TARI
-- begin GAZ_JUDETE
create table GAZ_JUDETE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUME_JUDET varchar(25) not null,
    --
    primary key (ID)
)^
-- end GAZ_JUDETE
-- begin GAZ_LOCALITATI
create table GAZ_LOCALITATI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUME_LOCALITATE varchar(30) not null,
    --
    primary key (ID)
)^
-- end GAZ_LOCALITATI
-- begin GAZ_STRAZI
create table GAZ_STRAZI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUME_STRADA varchar(50) not null,
    --
    primary key (ID)
)^
-- end GAZ_STRAZI
-- begin GAZ_LOCATII
create table GAZ_LOCATII (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PARTENERI_ID uuid not null,
    ID_TARI_ID uuid not null,
    ID_JUDETE_ID uuid not null,
    ID_LOCALITATI_ID uuid not null,
    ID_ARTERA_ID uuid,
    ID_STRAZI_ID uuid,
    NUMAR varchar(10),
    BLOC varchar(10),
    SCARA varchar(10),
    ETAJ varchar(10),
    APARTAMENT varchar(10),
    CODPOSTAL varchar(6) not null,
    CORESPONDENTA boolean not null,
    DOMICILIU boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_LOCATII
-- begin GAZ_SIRUTA
create table GAZ_SIRUTA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COD_SIRUTA integer not null,
    LOCALITATE varchar(30) not null,
    JUDET varchar(30) not null,
    --
    primary key (ID)
)^
-- end GAZ_SIRUTA
-- begin GAZ_ACORD_ACCES
create table GAZ_ACORD_ACCES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    ID_PARTENERI_ID uuid not null,
    ID_LOCATII_ID uuid not null,
    NR_ACORD_ACCES integer not null,
    DATA_ACORD_ACCES date not null,
    BUC_MG integer,
    DEBIT_MG decimal(5, 2),
    BUC_CT integer,
    DEBIT_CT decimal(5, 2),
    BUC_INST integer,
    DEBIT_INST decimal(5, 2),
    DEBIT_TOTAL decimal(5, 2) not null,
    ID_CONDUCTA_ID uuid not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_ACORD_ACCES

-- begin GAZ_CERERI_RACORDARE
create table GAZ_CERERI_RACORDARE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NRINREG integer not null,
    DATAINREG date not null,
    ID_PARTENER_ID uuid not null,
    LOCATIA_1_ID uuid not null,
    ID_CI_CIF_SOL_ID uuid,
    ID_TELEFOANE_SOL_ID uuid,
    ID_FAX_SOL_ID uuid,
    ID_EMAIL_SOL_ID uuid,
    ID_SIRUTA_ID uuid not null,
    LOCATIA_2_ID uuid not null,
    LOCATIA_3_ID uuid not null,
    ID_MANDATAR_ID uuid,
    ID_CI_CIF_MAN_ID uuid,
    ID_TELEFOANE_MAN_ID uuid,
    ID_FAX_MAN_ID uuid,
    ID_EMAIL_MAN_ID uuid,
    LOCATIA_4_ID uuid,
    TIP_NOU boolean not null,
    TIP_EXISTENT boolean not null,
    TIP_CASNIC boolean not null,
    TIP_NONCASNIC boolean not null,
    R_OSD_POSTA_DOM boolean not null,
    R_OSD_POSTA_LOC_CONS boolean not null,
    R_OSD_POSTA_MAN boolean not null,
    R_OSD_SEDIU boolean not null,
    COM_EMAIL boolean not null,
    COM_FAX boolean not null,
    COM_SEDIU boolean not null,
    COM_TELEFON boolean not null,
    COM_ALTE boolean not null,
    DA_AFISARE_SITE boolean not null,
    NU_AFISARE_SITE boolean not null,
    TOTAL_DEBIT decimal(6, 2) not null,
    PREC_AMPLASARE text,
    ALTE_CERINTE text,
    ID_STATUS_CERERE_ATR_ID uuid,
    --
    primary key (ID)
)^
-- end GAZ_CERERI_RACORDARE
-- begin GAZ_CI_CIF
create table GAZ_CI_CIF (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PARTENERI_ID uuid not null,
    ID_TIP_ACT_ID uuid not null,
    ID_INST_ELIB_ACTE_ID uuid not null,
    SERIE_ACT varchar(25),
    NR_ACT varchar(25),
    CIF varchar(25),
    CNP varchar(13),
    NR_ORD varchar(25),
    DATA_ELIBERARE_ACT date,
    VALABIL boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_CI_CIF
-- begin GAZ_TIP_ACT
create table GAZ_TIP_ACT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIP_ACT varchar(15) not null,
    EXPLICATII varchar(100) not null,
    --
    primary key (ID)
)^
-- end GAZ_TIP_ACT
-- begin GAZ_INST_ELIB_ACTE
create table GAZ_INST_ELIB_ACTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEN_INST_ELIB_ACTE varchar(50) not null,
    EXPLICATII_INST_ELIB_ACTE varchar(255),
    --
    primary key (ID)
)^
-- end GAZ_INST_ELIB_ACTE
-- begin GAZ_DIAM_OL
create table GAZ_DIAM_OL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COD_SPECIFIC integer not null,
    DIAMETRU varchar(15) not null,
    --
    primary key (ID)
)^
-- end GAZ_DIAM_OL
-- begin GAZ_DIAM_PE
create table GAZ_DIAM_PE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DIAM_PE integer not null,
    --
    primary key (ID)
)^
-- end GAZ_DIAM_PE
-- begin GAZ_MAT_CONDUCTA
create table GAZ_MAT_CONDUCTA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIP_MAT_CONDUCTA varchar(15) not null,
    --
    primary key (ID)
)^
-- end GAZ_MAT_CONDUCTA
-- begin GAZ_OBIECTE
create table GAZ_OBIECTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIP_OBIECTE varchar(9) not null,
    EXPLICATII_OBIECTE varchar(50) not null,
    --
    primary key (ID)
)^
-- end GAZ_OBIECTE
-- begin GAZ_REGIM_PRES
create table GAZ_REGIM_PRES (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    REGIM_PRESIUNE varchar(2) not null,
    DOM_PRESIUNE varchar(20) not null,
    --
    primary key (ID)
)^
-- end GAZ_REGIM_PRES
-- begin GAZ_SRS
create table GAZ_SRS (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUME_SRS varchar(10) not null,
    --
    primary key (ID)
)^
-- end GAZ_SRS
-- begin GAZ_TIP_TELEFON
create table GAZ_TIP_TELEFON (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DENUMIRE_TIP_TELEFON varchar(25) not null,
    --
    primary key (ID)
)^
-- end GAZ_TIP_TELEFON
-- begin GAZ_TELEFOANE
create table GAZ_TELEFOANE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PARTENERI_ID uuid not null,
    ID_TIP_TELEFON_ID uuid not null,
    NUMAR_TELEFON varchar(12) not null,
    PRINCIPAL boolean not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_TELEFOANE
-- begin GAZ_TIP_CONTOR
create table GAZ_TIP_CONTOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TIP_CONTOR varchar(25) not null,
    TIP_G varchar(5) not null,
    Q_NOM decimal(5, 2) not null,
    Q_MIN decimal(5, 2) not null,
    Q_MAX decimal(6, 2) not null,
    CADERE_PRESIUNE decimal(3, 2) not null,
    EXPLICATII_TIP_CONTOR varchar(255),
    --
    primary key (ID)
)^
-- end GAZ_TIP_CONTOR
-- begin GAZ_TIP_REGULATOR
create table GAZ_TIP_REGULATOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DENUMIRE_REGULATOR varchar(25) not null,
    DEBIT_REGULATOR decimal(5, 2) not null,
    --
    primary key (ID)
)^
-- end GAZ_TIP_REGULATOR
-- begin GAZ_VERIFICATOR
create table GAZ_VERIFICATOR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NUME_VERIFICATOR varchar(25) not null,
    ID_NUME_VERIFICATOR_ID uuid,
    EMITENT_ATESTAT varchar(25) not null,
    NR_ATESTAT_VERIFICATOR varchar(10) not null,
    DATA_ATESTAT_VERIFICATOR date not null,
    DATA_SFARSIT_ATESTAT_VERIFICATOR date not null,
    ID_CONTURI_BANCARE_PARTENERI_ID uuid,
    ID_LOCATII_ID uuid,
    ID_TELEFOANE_ID uuid,
    ID_FAX_ID uuid,
    ID_EMAIL_ID uuid,
    ACTIV boolean,
    --
    primary key (ID)
)^
-- end GAZ_VERIFICATOR
-- begin GAZ_PROIECTANT
create table GAZ_PROIECTANT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SOCIETATI_PROIECTARE_ID uuid not null,
    NUME_PROIECTANT varchar(25) not null,
    TIP_AUT_PROIECTANT varchar(10) not null,
    NR_AUT_PROIECTANT integer not null,
    DATA_START_AUT_PROIECTANT date not null,
    DATA_STOP_AUT_PROIECTANT date not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_PROIECTANT
-- begin GAZ_PROIECTE
create table GAZ_PROIECTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_OBIECTE_ID uuid not null,
    ID_PROIECTANT_ID uuid not null,
    NR_PROIECT varchar(25),
    NR_ADRESA_OSD varchar(10),
    DATA_DEPUNERE_OSD date,
    DATA_AVIZARE_OSD date,
    ID_VERIFICATOR_ID uuid,
    NR_REF_VERIF varchar(10),
    DATA_AVIZARE_VERIF date,
    --
    primary key (ID)
)^
-- end GAZ_PROIECTE
-- begin GAZ_INST_UTILIZARE
create table GAZ_INST_UTILIZARE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    ID_LOCATII_ID uuid not null,
    ID_SRMPRM_ID uuid not null,
    CUI_INST_UTILIZARE integer,
    ID_PROIECTE_ID uuid not null,
    ID_EXECUTANT_ID uuid not null,
    NR_PVLA varchar(10),
    DATA_PVLA date,
    NR_PVRT varchar(10),
    DATA_PVRT date,
    NR_PVPIF varchar(10),
    DATA_PVPIF date,
    NR_ARHIVA integer,
    --
    primary key (ID)
)^
-- end GAZ_INST_UTILIZARE
-- begin GAZ_EXECUTANT
create table GAZ_EXECUTANT (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SOCIETATI_EXECUTIE_ID uuid not null,
    NUME_INSTALATOR varchar(25) not null,
    TIP_AUT_INSTALATOR varchar(10) not null,
    NR_AUT_INSTALATOR integer not null,
    DATA_START_AUT_INSTALATOR date not null,
    DATA_STOP_AUT_INSTALATOR date not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_EXECUTANT
-- begin GAZ_SRMPRM
create table GAZ_SRMPRM (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    ID_BRANSAMENTE_ID uuid not null,
    CUI_SRM_PRM integer not null,
    ID_LOCATII_ID uuid not null,
    ID_PROIECTE_ID uuid,
    ID_EXECUTANT_ID uuid,
    ID_REGIM_PRES_ID uuid not null,
    PRES_REGLATA decimal(5, 3) not null,
    NR_PVRT varchar(10),
    DATA_PVRT date,
    NR_PVPIF varchar(10),
    DATA_PVPIF date,
    VAL_CONTABILA decimal(19, 2),
    NR_INVENTAR varchar(25),
    --
    primary key (ID)
)^
-- end GAZ_SRMPRM
-- begin GAZ_BRANSAMENTE
create table GAZ_BRANSAMENTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    CUI_BR integer not null,
    ID_LOCATII_ID uuid not null,
    ID_REGIM_PRES_ID uuid not null,
    ID_MAT_CONDUCTA_PE_ID uuid,
    ID_DIAM_PE_ID uuid,
    LUNGIME_PE decimal(5, 2),
    ID_MAT_CONDUCTA_OL_ID uuid,
    ID_DIAM_OL_ID uuid,
    LUNGIME_OL decimal(5, 2),
    ID_EXECUTANT_ID uuid not null,
    ID_PROIECTE_ID uuid not null,
    NR_PVLA varchar(20),
    DATA_PVLA date,
    NR_PVRT varchar(20),
    DATA_PVRT date,
    NR_PVPIF varchar(20),
    DATA_PVPIF date,
    NRINVENTAR varchar(25),
    VALCONTABILA decimal(19, 2),
    --
    primary key (ID)
)^
-- end GAZ_BRANSAMENTE
-- begin GAZ_ACORD_TEHNIC_RACORDARE
create table GAZ_ACORD_TEHNIC_RACORDARE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    NRINREG integer not null,
    DATAINREG date not null,
    ID_TIP_ARTERA_ID uuid not null,
    ID_STRAZI_ID uuid not null,
    ID_CERERI_RACORDARE_ID uuid,
    ID_CONDUCTA_RACORD_ID uuid,
    ID_MAT_CONDUCTA_RACORD_OL_ID uuid,
    ID_DIAM_OL_RACORD_ID uuid,
    LUNGIME_OL_RACORD decimal(6, 2),
    ID_MAT_CONDUCTA_RACORD_PE_ID uuid,
    ID_DIAM_PE_RACORD_ID uuid,
    LUNGIME_PE_RACORD decimal(6, 2),
    ID_MAT_CONDUCTA_RACORD_PE2_ID uuid,
    ID_DIAM_PE_RACORD2_ID uuid,
    LUNGIME_PE_RACORD2 decimal(6, 2),
    LUNGIME_ASFALT decimal(6, 2),
    LUNGIME_SPATIU_VERDE decimal(6, 2),
    ID_CONDUCTA_EXTINDERE_ID uuid,
    ID_CONDUCTA_EXTINDERE_EXISTENTA_ID uuid,
    ID_MAT_CONDUCTA_EXTINDERE_OL_ID uuid,
    ID_DIAM_OL_EXTINDERE_ID uuid,
    LUNGIME_OL_EXTINDERE decimal(6, 2),
    ID_MAT_CONDUCTA_EXTINDERE_PE_ID uuid,
    ID_DIAM_PE_EXTINDERE_ID uuid,
    LUNGIME_PE_EXTINDERE decimal(6, 2),
    ID_CONDUCTA_REDIMENSIONARE_ID uuid,
    ID_CONDUCTA_REDIMENSIONARE_EXISTENTA_ID uuid,
    ID_MAT_CONDUCTA_REDIMENSIONARE_PE_ID uuid,
    ID_DIAM_OL_REDIMENSIONARE_ID uuid,
    LUNGIME_OL_REDIMENSIONARE decimal(6, 2),
    ID_MAT_CONDUCTA_REDIMENSIONARE_OL_ID uuid,
    ID_DIAM_PE_REDIMENSIONARE_ID uuid,
    LUNGIME_PE_REDIMENSIONARE decimal(6, 2),
    ID_OBIECTE_BR_ID uuid,
    ID_OBIECTE_POST_ID uuid,
    ID_TIP_CONTOR_ID uuid,
    ID_TIP_REGULATOR_ID uuid,
    PRES_CALCUL decimal(3, 2),
    MOD_SD boolean not null,
    EXTINDERE_CONDUCTA boolean not null,
    REDIMENSIONARE_CONDUCTA boolean not null,
    CORECTOR boolean not null,
    RACORD_NOU boolean not null,
    RACORD_EXISTENT boolean not null,
    POST_NOU boolean not null,
    POST_EXISTENT boolean not null,
    TEREN_PRIVAT boolean not null,
    TEREN_PUBLIC boolean not null,
    IMAGINE_SOLUTIE_ID uuid,
    ID_INSTALATORI_OSD_ID uuid not null,
    --
    primary key (ID)
)^
-- end GAZ_ACORD_TEHNIC_RACORDARE
-- begin GAZ_CONDUCTA
create table GAZ_CONDUCTA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    NOD varchar(11) not null,
    ID_ARTERA_NOD1_ID uuid not null,
    ID_STRAZI_NOD1_ID uuid not null,
    ID_ARTERA_NOD2_ID uuid not null,
    ID_STRAZI_NOD2_ID uuid not null,
    ID_MAT_CONDUCTA_PE_ID uuid,
    ID_DIAM_PE_ID uuid,
    LUNGIME_PE decimal(6, 2),
    ID_MAT_CONDUCTA_OL_ID uuid,
    ID_DIAM_OL_ID uuid,
    LUNGIME_OL decimal(6, 2),
    ID_REGIM_PRES_ID uuid not null,
    ID_SRS_ID uuid not null,
    NR_PVRT integer not null,
    DATA_PVRT date not null,
    NR_PIF integer not null,
    DATA_PIF date not null,
    MONTAJ_INGROPAT boolean not null,
    MONTAJ_APARENT boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_CONDUCTA
-- begin GAZ_EMAIL
create table GAZ_EMAIL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PARTENERI_ID uuid not null,
    ADRESA_EMAIL varchar(50) not null,
    PRINCIPAL boolean not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_EMAIL

-- begin GAZ_APARATE_SOLICITATE
create table GAZ_APARATE_SOLICITATE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_CERERI_RACORDARE_ID uuid not null,
    ID_APARATE_ID uuid not null,
    NRBUC integer not null,
    --
    primary key (ID)
)^
-- end GAZ_APARATE_SOLICITATE
-- begin GAZ_TIP_APARATE
create table GAZ_TIP_APARATE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DENUMIRE varchar(255) not null,
    DEBIT decimal(6, 2) not null,
    --
    primary key (ID)
)^
-- end GAZ_TIP_APARATE
-- begin GAZ_TIP_DOCUMENTE
create table GAZ_TIP_DOCUMENTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DENUMIRE varchar(255) not null,
    --
    primary key (ID)
)^
-- end GAZ_TIP_DOCUMENTE
-- begin GAZ_DOC_ANEX_CER_RAC
create table GAZ_DOC_ANEX_CER_RAC (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_CERERI_RACORDARE_ID uuid not null,
    ID_TIP_DOCUMENTE_ID uuid not null,
    FISIER_DOCUMENT_ID uuid,
    --
    primary key (ID)
)^
-- end GAZ_DOC_ANEX_CER_RAC
-- begin GAZ_CONTRACTE_RACORDARE_SD
create table GAZ_CONTRACTE_RACORDARE_SD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    NRINREG integer not null,
    DATAINREG date not null,
    ID_PARTENERI_ID uuid not null,
    ID_CI_CIF_ID uuid not null,
    LOCATIA_1_ID uuid not null,
    ID_TELEFOANE_ID uuid,
    ID_FAX_ID uuid,
    ID_EMAIL_ID uuid,
    ID_CONTURI_BANCARE_PARTENERI_ID uuid,
    ID_ACORD_TEHNIC_RACORDARE_ID uuid not null,
    LOCATIA_2_ID uuid not null,
    PREL_DOCUMENTE boolean not null,
    OBT_AVIZ_CU_AC boolean not null,
    PRO_EXEC_RAC boolean not null,
    VERIF_PROIECT boolean not null,
    URM_LUC_EXE_RAC boolean not null,
    REC_PIF boolean not null,
    DURATA_CONTRACT decimal(5, 2),
    PREL_CONTRACT decimal(5, 2),
    ID_NOTIFICARE_OSD_ATR_ID uuid,
    PROC_GARANTIE decimal(5, 2) not null,
    TARIF_RACORDARE decimal(19, 2) not null,
    ZILE_PLATA_TARIF integer not null,
    ZILE_NOTIF_REZ integer not null,
    ID_STATUS_CONTRACTE_RACORDARE_SD_ID uuid,
    --
    primary key (ID)
)^
-- end GAZ_CONTRACTE_RACORDARE_SD
-- begin GAZ_TIP_PERSOANA
create table GAZ_TIP_PERSOANA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    PREFIX varchar(25) not null,
    DENUMIRE varchar(255) not null,
    SUFIX varchar(25),
    --
    primary key (ID)
)^
-- end GAZ_TIP_PERSOANA
-- begin GAZ_NOTIFICARE_OSD_ATR
create table GAZ_NOTIFICARE_OSD_ATR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NRINREG integer not null,
    ID_SIRUTA_ID uuid not null,
    DATAINREG date not null,
    ID_PARTENERI_ID uuid not null,
    ID_CI_CIF_ID uuid not null,
    LOCATIA_1_ID uuid not null,
    ID_TELEFOANE_ID uuid,
    ID_FAX_ID uuid,
    ID_EMAIL_ID uuid,
    ID_ACORD_TEHNIC_RACORDARE_ID uuid not null,
    LOCATIA_2_ID uuid not null,
    DATA_OBT_CERT_URB date not null,
    DATA_DEP_DOC_TEH_PRIM date not null,
    ID_SOCIETATI_PROIECTARE_ID uuid,
    DATA_TERM_PROIECT date not null,
    ID_VERIFICATOR_ID uuid,
    DATA_TERM_VERIF date not null,
    ID_SOCIETATI_EXECUTIE_ID uuid,
    DATA_TERM_EXE date not null,
    TOTAL_PRET_TARIF decimal(19, 2) not null,
    TOTAL_TVA decimal(19, 2) not null,
    TOTAL_PRET_TARIF_TVA decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end GAZ_NOTIFICARE_OSD_ATR
-- begin GAZ_SOCIETATI_PROIECTARE
create table GAZ_SOCIETATI_PROIECTARE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PARTENERI_ID uuid not null,
    TIP_AUT_SOCIETATE_PROIECTARE varchar(10) not null,
    NR_AUT_SOCIETATE_PROIECTARE integer not null,
    DATA_START_AUT_SOCIETATE_PROIECTARE date not null,
    DATA_STOP_AUT_SOCIETATE_PROIECTARE date not null,
    ID_LOCATII_ID uuid not null,
    ID_TELEFOANE_ID uuid not null,
    ID_FAX_ID uuid,
    IDEMAIL_ID uuid,
    ID_CONTURI_BANCARE_PARTENERI_ID uuid not null,
    ID_REP_LEGAL_ID uuid,
    ID_CALITATE_REP_LEGAL_ID uuid,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_SOCIETATI_PROIECTARE
-- begin GAZ_BANCI
create table GAZ_BANCI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    DEN_UZUALA varchar(25) not null,
    DEN_COMPLETA varchar(255) not null,
    --
    primary key (ID)
)^
-- end GAZ_BANCI
-- begin GAZ_CONTURI_BANCARE_PARTENERI
create table GAZ_CONTURI_BANCARE_PARTENERI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PARTENERI_ID uuid not null,
    IBAN varchar(24) not null,
    ID_BANCI_ID uuid not null,
    --
    primary key (ID)
)^
-- end GAZ_CONTURI_BANCARE_PARTENERI
-- begin GAZ_SOCIETATI_EXECUTIE
create table GAZ_SOCIETATI_EXECUTIE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_PARTENERI_ID uuid not null,
    TIP_AUT_SOCIETATE_EXECUTIE varchar(10) not null,
    NR_AUT_SOCIETATE_EXECUTIE integer not null,
    DATA_START_AUT_SOCIETATE_EXECUTIE date not null,
    DATA_STOP_AUT_SOCIETATE_EXECUTIE date not null,
    ID_LOCATII_ID uuid not null,
    ID_TELEFOANE_ID uuid not null,
    ID_FAX_ID uuid,
    ID_EMAIL_ID uuid,
    ID_CONTURI_BANCARE_PARTENERI_ID uuid not null,
    ID_REP_LEGAL_ID uuid,
    ID_CALITATE_REP_LEGAL_ID uuid,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_SOCIETATI_EXECUTIE
-- begin GAZ_TVA
create table GAZ_TVA (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    COTA_TVA decimal(19, 2) not null,
    DATA_START date not null,
    DATA_STOP date,
    VALABIL boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_TVA
-- begin GAZ_COMP_TARIF_NOTIFICARE
create table GAZ_COMP_TARIF_NOTIFICARE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    TIP_TARIF varchar(5) not null,
    DEN_TARIF varchar(255) not null,
    EXPLICATII varchar(255),
    --
    primary key (ID)
)^
-- end GAZ_COMP_TARIF_NOTIFICARE
-- begin GAZ_NOTIFICARE_OSD_ATR_LINII
create table GAZ_NOTIFICARE_OSD_ATR_LINII (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_NOTIFICARE_OSD_ATR_ID uuid not null,
    ID_DEN_TARIF_ID uuid not null,
    PRET_TARIF decimal(19, 2) not null,
    ID_COTA_TVA_ID uuid not null,
    TVA_TARIF decimal(19, 2) not null,
    PRET_TARIF_TVA decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end GAZ_NOTIFICARE_OSD_ATR_LINII
-- begin GAZ_OFERTE_CONTRACTE_RACORDARE_SD
create table GAZ_OFERTE_CONTRACTE_RACORDARE_SD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    NRINREG integer not null,
    DATAINREG date not null,
    ID_PARTENERI_ID uuid not null,
    ID_CI_CIF_ID uuid not null,
    LOCATIA_1_ID uuid not null,
    ID_TELEFOANE_ID uuid,
    ID_FAX_ID uuid,
    ID_EMAIL_ID uuid,
    ID_CONTURI_BANCARE_PARTENERI_ID uuid,
    ID_ACORD_TEHNIC_RACORDARE_ID uuid not null,
    LOCATIA_2_ID uuid not null,
    PREL_DOCUMENTE boolean,
    OBT_AVIZ_CU_AC boolean,
    PRO_EXEC_RAC boolean,
    VERIF_PROIECT boolean,
    URM_LUC_EXE_RAC boolean,
    REC_PIF boolean,
    DURATA_CONTRACT decimal(5, 2) not null,
    PREL_CONTRACT decimal(5, 2) not null,
    PROC_GARANTIE decimal(5, 2) not null,
    PROC_TAXA_ISC1 decimal(19, 2),
    TAXA_ISC1 decimal(19, 2),
    PROC_TAXA_ISC2 decimal(19, 2),
    TAXA_ISC2 decimal(19, 2),
    TARIF_RACORDARE decimal(19, 2) not null,
    TVA_TARIF_RACORDARE decimal(19, 2) not null,
    TOTAL_TARIF_RACORDARE decimal(19, 2) not null,
    ZILE_PLATA_TARIF integer not null,
    ZILE_NOTIF_REZ integer not null,
    ID_STATUS_OFERTE_CONTRACTE_RACORDARE_SD_ID uuid,
    --
    primary key (ID)
)^
-- end GAZ_OFERTE_CONTRACTE_RACORDARE_SD
-- begin GAZ_TARIFE_RACORDARE_FIXE
create table GAZ_TARIFE_RACORDARE_FIXE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    TIP_TARIF varchar(5) not null,
    DENUMIRE_TARIF varchar(50) not null,
    TARIF decimal(19, 2) not null,
    DATA_START date not null,
    DATA_STOP date,
    ACTIV boolean not null,
    EXPLICATII varchar(255),
    --
    primary key (ID)
)^
-- end GAZ_TARIFE_RACORDARE_FIXE
-- begin GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII
create table GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_OFERTE_CONTRACTE_RACORDARE_SD_ID uuid not null,
    ID_TARIFE_RACORDARE_FIXE_ID uuid not null,
    DISCOUNT decimal(19, 2) not null,
    TARIF_D decimal(19, 2) not null,
    ID_TVA_ID uuid not null,
    TVA_TARIF decimal(19, 2) not null,
    TOTAL_TARIF decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end GAZ_OFERTE_CONTRACTE_RACORDARE_OSD_LINII
-- begin GAZ_TARIFE_EXECUTIE_BRANSAMENTE
create table GAZ_TARIFE_EXECUTIE_BRANSAMENTE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    TIP_TARIF varchar(5) not null,
    DEN_TARIF varchar(255) not null,
    ID_DIAM_PE_ID uuid,
    ID_DIAM_OL_ID uuid,
    TARIF decimal(19, 2) not null,
    DATA_START date not null,
    DATA_STOP date,
    ACTIV boolean not null,
    EXPLICATII varchar(255),
    --
    primary key (ID)
)^
-- end GAZ_TARIFE_EXECUTIE_BRANSAMENTE
-- begin GAZ_TARIFE_EXECUTIE_POSTURI
create table GAZ_TARIFE_EXECUTIE_POSTURI (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    TIP_TARIF varchar(5) not null,
    DEN_TARIF varchar(255) not null,
    DEBIT_MAXIM decimal(19, 2) not null,
    TARIF decimal(19, 2) not null,
    DATA_START date not null,
    DATA_STOP date,
    ACTIV boolean not null,
    EXPLICATII varchar(255),
    --
    primary key (ID)
)^
-- end GAZ_TARIFE_EXECUTIE_POSTURI
-- begin GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_BR_LINII
create table GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_BR_LINII (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_OFERTE_CONTRACTE_RACORDARE_SD_ID uuid not null,
    ID_TARIFE_EXECUTIE_BRANSAMENTE_ID uuid not null,
    DISCOUNT decimal(19, 2) not null,
    BUC_ML decimal(19, 2) not null,
    TARIF_D decimal(19, 2) not null,
    ID_TVA_ID uuid not null,
    TVA_TARIF decimal(19, 2) not null,
    TOTAL_TARIF decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_BR_LINII
-- begin GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_POST_LINII
create table GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_POST_LINII (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_OFERTE_CONTRACTE_RACORDARE_SD_ID uuid not null,
    ID_TARIFE_EXECUTIE_POSTURI_ID uuid not null,
    DISCOUNT decimal(19, 2) not null,
    BUC_ML decimal(19, 2) not null,
    TARIF_D decimal(19, 2) not null,
    ID_TVA_ID uuid not null,
    TVA_TARIF decimal(19, 2) not null,
    TOTAL_TARIF decimal(19, 2) not null,
    --
    primary key (ID)
)^
-- end GAZ_OFERTE_CON_RAC_OSD_TARIF_EXE_POST_LINII
-- begin GAZ_INSTALATORI_OSD
create table GAZ_INSTALATORI_OSD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    ID_PARTENERI_ID uuid not null,
    TIP_AUTORIZATIE varchar(10) not null,
    NR_AUTORIZATIE integer not null,
    DATA_START_AUTORIZATIE date not null,
    DATA_STOP_AUTORIZATIE date not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_INSTALATORI_OSD
-- begin GAZ_CONTRACTE_SERVICII_OE
create table GAZ_CONTRACTE_SERVICII_OE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    ID_SIRUTA_ID uuid not null,
    NRINREG integer not null,
    DATAINREG date not null,
    ID_SOCIETATI_PROIECTARE_ID uuid,
    ID_VERIFICATOR_ID uuid,
    ID_SOCIETATI_EXECUTIE_ID uuid,
    ID_NOTIFICARE_OSD_ATR_ID uuid not null,
    ID_ACORD_TEHNIC_RACORDARE_ID uuid not null,
    ID_CONTRACTE_RACORDARE_SD_ID uuid not null,
    LOCATIA_2_ID uuid not null,
    DURATA_CONTRACT integer not null,
    ZILE_REP_GARANTIE integer not null,
    PROC_ELIB_GARANTIE1 decimal(5, 2) not null,
    PROC_ELIB_GARANTIE2 decimal(5, 2) not null,
    TARIF_RACORDARE decimal(19, 2) not null,
    DATA_TERM_PROIECT date,
    TARIF_PROIECTARE decimal(19, 2),
    PROC1_TARIF_PROIECTARE decimal(5, 2) not null,
    TARIF1_PROIECTARE decimal(5, 2) not null,
    PROC2_TARIF_PROIECTARE decimal(5, 2) not null,
    TARIF2_PROIECTARE decimal(5, 2) not null,
    DATA_TERM_VERIFCARE date,
    TARIF_VERIFICARE decimal(19, 2),
    PROC1_TARIF_VERIFICARE decimal(5, 2) not null,
    TARIF1_VERIFICARE decimal(19, 2) not null,
    PROC2_TARIF_VERIFICARE decimal(5, 2) not null,
    TARIF2_VERIFICARE decimal(19, 2) not null,
    DATA_TERM_EXE date,
    TARIF_EXECUTIE decimal(19, 2),
    PROC1_TARIF_EXECUTIE decimal(19, 2) not null,
    TARIF1_EXECUTIE decimal(19, 2) not null,
    PROC2_TARIF_EXECUTIE decimal(19, 2) not null,
    TARIF2_EXECUTIE decimal(19, 2) not null,
    ID_STATUS_CONTRACTE_SERVICII_OE_ID uuid,
    --
    primary key (ID)
)^
-- end GAZ_CONTRACTE_SERVICII_OE
-- begin GAZ_REP_LEGAL
create table GAZ_REP_LEGAL (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    CALITATE_REP_LEGAL varchar(255) not null,
    --
    primary key (ID)
)^
-- end GAZ_REP_LEGAL
-- begin GAZ_STATUS_CERERE_ATR
create table GAZ_STATUS_CERERE_ATR (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NR_ORD integer not null,
    STARE_CERERE_ATR varchar(255) not null,
    EXPLICATII varchar(255) not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_STATUS_CERERE_ATR
-- begin GAZ_STATUS_CONTRACTE_RACORDARE_SD
create table GAZ_STATUS_CONTRACTE_RACORDARE_SD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NR_ORD integer not null,
    STARE_CONTRACT_RACORDARE_SD varchar(255) not null,
    EXPLICATII varchar(255) not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_STATUS_CONTRACTE_RACORDARE_SD
-- begin GAZ_STATUS_CONTRACTE_SERVICII_OE
create table GAZ_STATUS_CONTRACTE_SERVICII_OE (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NR_ORD integer not null,
    STARE_CONTRACTE_SERVICII_OE varchar(255) not null,
    EXPLICATII varchar(255) not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_STATUS_CONTRACTE_SERVICII_OE
-- begin GAZ_STATUS_OFERTE_CONTRACTE_RACORDARE_SD
create table GAZ_STATUS_OFERTE_CONTRACTE_RACORDARE_SD (
    ID uuid,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NR_ORD integer not null,
    STARE_OFERTE_CONTRACTE_RACORDARE_SD varchar(255) not null,
    EXPLICATII varchar(255) not null,
    ACTIV boolean not null,
    --
    primary key (ID)
)^
-- end GAZ_STATUS_OFERTE_CONTRACTE_RACORDARE_SD
