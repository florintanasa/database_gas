-- update GAZ_ACORD_TEHNIC_RACORDARE set ID_INSTALATORI_OSD_ID = <default_value> where ID_INSTALATORI_OSD_ID is null ;
alter table GAZ_ACORD_TEHNIC_RACORDARE alter column ID_INSTALATORI_OSD_ID set not null ;
