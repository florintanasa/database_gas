package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import com.haulmont.cuba.core.entity.StandardEntity;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.FileDescriptor;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import javax.persistence.OneToOne;

@Table(name = "GAZ_DOC_ANEX_CER_RAC")
@Entity(name = "gaz$DocAnexCerRac")
public class DocAnexCerRac extends StandardEntity {
    private static final long serialVersionUID = 2048363188094985603L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CERERI_RACORDARE_ID")
    protected CereriRacordare idCereriRacordare;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TIP_DOCUMENTE_ID")
    protected TipDocumente idTipDocumente;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FISIER_DOCUMENT_ID")
    protected FileDescriptor fisierDocument;

    public FileDescriptor getFisierDocument() {
        return fisierDocument;
    }

    public void setFisierDocument(FileDescriptor fisierDocument) {
        this.fisierDocument = fisierDocument;
    }


    public void setIdCereriRacordare(CereriRacordare idCereriRacordare) {
        this.idCereriRacordare = idCereriRacordare;
    }

    public CereriRacordare getIdCereriRacordare() {
        return idCereriRacordare;
    }

    public void setIdTipDocumente(TipDocumente idTipDocumente) {
        this.idTipDocumente = idTipDocumente;
    }

    public TipDocumente getIdTipDocumente() {
        return idTipDocumente;
    }


}