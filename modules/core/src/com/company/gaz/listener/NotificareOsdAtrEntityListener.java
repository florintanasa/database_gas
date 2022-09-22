package com.company.gaz.listener;

import com.haulmont.cuba.core.app.UniqueNumbersService;
import org.springframework.stereotype.Component;
import com.haulmont.cuba.core.listener.BeforeInsertEntityListener;
import com.haulmont.cuba.core.EntityManager;
import com.company.gaz.entity.NotificareOsdAtr;

import javax.inject.Inject;

@Component("gaz_NotificareOsdAtrEntityListener")
public class NotificareOsdAtrEntityListener implements BeforeInsertEntityListener<NotificareOsdAtr> {

    @Inject
    private UniqueNumbersService unService;

    @Override
    public void onBeforeInsert(NotificareOsdAtr entity, EntityManager entityManager) {
        if (entity.getIdSiruta().getCodSiruta() == 146637) {
        entity.setNrinreg((int) unService.getNextNumber("NrInregNotificareOsdAtrRadauti"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 179490) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregNotificareOsdAtrOtopeni"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 109782) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregNotificareOsdAtrDrobeta"));
        }
        else if (entity.getIdSiruta().getCodSiruta() == 146272) {
            entity.setNrinreg((int) unService.getNextNumber("NrInregNotificareOsdAtrSuceava"));
        }
    }
}
