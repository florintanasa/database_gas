package com.company.gaz.listener;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.gaz.entity.OferteContracteRacordareSD;

import javax.inject.Inject;

@Component("gaz_OferteContracteRacordareSDEntityListener")
public class OferteContracteRacordareSDEntityListener implements BeforeInsertEntityListener<OferteContracteRacordareSD> {

    @Inject
    private UniqueNumbersService unService;

    @Override
    public void onBeforeInsert(OferteContracteRacordareSD entity, EntityManager entityManager) {
        if (entity.getIdSiruta().getCodSiruta() == 146637){
            entity.setNrinreg((int) unService.getNextNumber("NrOferteContracteRacordareSDRadauti"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 179490) {
            entity.setNrinreg((int) unService.getNextNumber("NrOferteContracteRacordareSDOtopeni"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 109782){
            entity.setNrinreg((int) unService.getNextNumber("NrOferteContracteRacordareSDDrobeta"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 146272){
            entity.setNrinreg((int) unService.getNextNumber("NrOferteContracteRacordareSDSuceava"));
        }
    }
}