package com.company.gaz.listener;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.gaz.entity.CereriRacordare;


import javax.inject.Inject;

@Component("gaz_CereriRacordareEntityListener")
public class CereriRacordareEntityListener implements BeforeInsertEntityListener<CereriRacordare> {

    @Inject
    private UniqueNumbersService unService;
    @Override
    public void onBeforeInsert(CereriRacordare entity, EntityManager entityManager) {
        if (entity.getIdSiruta().getCodSiruta() == 146637) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregCereriRacordareRadauti"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 179490) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregCereriRacordareOtopeni"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 109782) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregCereriRacordareDrobeta"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 146272) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregCereriRacordareSuceava"));
        }
    }
}
