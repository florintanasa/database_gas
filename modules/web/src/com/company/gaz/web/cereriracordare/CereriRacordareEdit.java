package com.company.gaz.web.cereriracordare;

import com.company.gaz.entity.*;
import com.haulmont.cuba.gui.components.AbstractEditor;
import com.haulmont.cuba.gui.data.CollectionDatasource;
import com.haulmont.cuba.gui.data.GroupDatasource;
import org.apache.poi.ss.formula.functions.T;

import javax.inject.Inject;
import java.math.BigDecimal;
import java.util.Map;
import java.util.UUID;

public class CereriRacordareEdit extends AbstractEditor<CereriRacordare> {
    @Inject
    private CollectionDatasource<AparateSolicitate, UUID> idAparateSolicitateDs;
    @Inject
    private GroupDatasource<Telefoane,UUID> telefoanesDs;
    @Inject
    private GroupDatasource<Telefoane, UUID> telefoanesmDs;
    @Inject
    private GroupDatasource<CiCif, UUID> ciCifsDs;
    @Inject
    private GroupDatasource<CiCif, UUID> cicifsmDs;
    @Inject
    private GroupDatasource<Email, UUID> emailsDs;
    @Inject
    private GroupDatasource<Email, UUID> emailsmDs;

    @Inject
    private CollectionDatasource<Telefoane, UUID> telefoaneSolDs;
    @Inject
    private CollectionDatasource<Telefoane, UUID> faxSolDs;
    @Inject
    private CollectionDatasource<Telefoane, UUID> faxManDs;
    @Inject
    private CollectionDatasource<Telefoane, UUID> telefoaneManDs;
    @Inject
    private CollectionDatasource<CiCif, UUID> ciCifSolDs;
    @Inject
    private CollectionDatasource<CiCif, UUID> ciCifManDs;
    @Inject
    private CollectionDatasource<Email, UUID> emailSolDs;
    @Inject
    private CollectionDatasource<Email, UUID> emailManDs;

    @Override
    public void init(Map<String, Object> params) {
        idAparateSolicitateDs.addCollectionChangeListener(e -> calculTotalDebit());
        telefoanesDs.addCollectionChangeListener(e -> refresh());
        telefoanesmDs.addCollectionChangeListener(e -> refresh());
        ciCifsDs.addCollectionChangeListener(e -> refresh());
        cicifsmDs.addCollectionChangeListener(e -> refresh());
        emailsDs.addCollectionChangeListener(e -> refresh());
        emailsmDs.addCollectionChangeListener(e -> refresh());
    }

    private void calculTotalDebit(){
        BigDecimal totaldebit = BigDecimal.ZERO;
        for (AparateSolicitate linie : idAparateSolicitateDs.getItems()){
            totaldebit = totaldebit.add(linie.getIdAparate().getDebit().multiply(new BigDecimal(linie.getNrbuc())));
        }
        getItem().setTotalDebit(totaldebit);
    }
    private void refresh(){
        telefoaneSolDs.refresh();
        faxSolDs.refresh();
        faxManDs.refresh();
        telefoaneManDs.refresh();
        ciCifSolDs.refresh();
        ciCifManDs.refresh();
        emailSolDs.refresh();
        emailManDs.refresh();
    }
}