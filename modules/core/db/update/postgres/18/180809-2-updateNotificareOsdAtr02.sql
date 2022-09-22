alter table GAZ_NOTIFICARE_OSD_ATR add column DATA_OBT_CERT_URB date ^
update GAZ_NOTIFICARE_OSD_ATR set DATA_OBT_CERT_URB = current_date where DATA_OBT_CERT_URB is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column DATA_OBT_CERT_URB set not null ;
alter table GAZ_NOTIFICARE_OSD_ATR add column DATA_DEP_DOC_TEH_PRIM date ^
update GAZ_NOTIFICARE_OSD_ATR set DATA_DEP_DOC_TEH_PRIM = current_date where DATA_DEP_DOC_TEH_PRIM is null ;
alter table GAZ_NOTIFICARE_OSD_ATR alter column DATA_DEP_DOC_TEH_PRIM set not null ;
