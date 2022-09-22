package com.company.gaz.listener;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.gaz.entity.AcordTehnicRacordare;

import javax.inject.Inject;

@Component("gaz_AcordTehnicRacordareEntityListener")
public class AcordTehnicRacordareEntityListener implements BeforeInsertEntityListener<AcordTehnicRacordare> {
    @Inject
    private UniqueNumbersService unService;

    @Override
    public void onBeforeInsert(AcordTehnicRacordare entity, EntityManager entityManager) {
        if (entity.getIdSiruta().getCodSiruta() == 146637) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregATRRadauti"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 179490) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregATROtopeni"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 109782) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregATRDrobeta"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 146272) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregATRSuceava"));
        }

    }


}