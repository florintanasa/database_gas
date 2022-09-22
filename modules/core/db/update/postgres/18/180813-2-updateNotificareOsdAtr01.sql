update GAZ_NOTIFICARE_OSD_ATR set DATA_TERM_PROIECT = current_date where DATA_TERM_PROIECT is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column DATA_TERM_PROIECT set not null ;
update GAZ_NOTIFICARE_OSD_ATR set DATA_TERM_VERIF = current_date where DATA_TERM_VERIF is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column DATA_TERM_VERIF set not null ;
update GAZ_NOTIFICARE_OSD_ATR set DATA_TERM_EXE = current_date where DATA_TERM_EXE is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column DATA_TERM_EXE set not null ;
