package com.company.gaz.listener;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.gaz.entity.ContracteRacordareSD;

import javax.inject.Inject;

@Component("gaz_ContracteRacordareSDEntityListener")
public class ContracteRacordareSDEntityListener implements BeforeInsertEntityListener<ContracteRacordareSD> {

    @Inject
    private UniqueNumbersService unService;

    @Override
    public void onBeforeInsert(ContracteRacordareSD entity, EntityManager entityManager) {
        if (entity.getIdSiruta().getCodSiruta() == 146637) {
            entity.setNrinreg((int) unService.getNextNumber("NrContracteRacordareSDRadauti"));
        } else if (entity.getIdSiruta().getCodSiruta() == 179490) {
            entity.setNrinreg((int) unService.getNextNumber("NrContracteRacordareSDOtopeni"));
        } else if (entity.getIdSiruta().getCodSiruta() == 109782) {
            entity.setNrinreg((int) unService.getNextNumber("NrContracteRacordareSDDrobeta"));
        } else if (entity.getIdSiruta().getCodSiruta() == 146272) {
            entity.setNrinreg((int) unService.getNextNumber("NrContracteRacordareSDSuceava"));
        }
    }
}
