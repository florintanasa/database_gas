alter table GAZ_EXECUTANT rename column data_stop_aut_societate to data_stop_aut_societate__u35519 ;
alter table GAZ_EXECUTANT alter column data_stop_aut_societate__u35519 drop not null ;
alter table GAZ_EXECUTANT rename column data_start_aut_societate to data_start_aut_societate__u89216 ;
alter table GAZ_EXECUTANT alter column data_start_aut_societate__u89216 drop not null ;
alter table GAZ_EXECUTANT rename column nr_aut_societate to nr_aut_societate__u89545 ;
alter table GAZ_EXECUTANT alter column nr_aut_societate__u89545 drop not null ;
alter table GAZ_EXECUTANT rename column tip_aut_societate to tip_aut_societate__u63267 ;
alter table GAZ_EXECUTANT alter column tip_aut_societate__u63267 drop not null ;
alter table GAZ_EXECUTANT rename column den_soc_executie to den_soc_executie__u11184 ;
alter table GAZ_EXECUTANT alter column den_soc_executie__u11184 drop not null ;
-- alter table GAZ_EXECUTANT add column ID_SOCIETATI_EXECUTIE_ID uuid ^
-- update GAZ_EXECUTANT set ID_SOCIETATI_EXECUTIE_ID = <default_value> ;
-- alter table GAZ_EXECUTANT alter column ID_SOCIETATI_EXECUTIE_ID set not null ;
alter table GAZ_EXECUTANT add column ID_SOCIETATI_EXECUTIE_ID uuid not null ;
