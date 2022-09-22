package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;

@Table(name = "GAZ_APARATE_SOLICITATE")
@Entity(name = "gaz$AparateSolicitate")
public class AparateSolicitate extends StandardEntity {
    private static final long serialVersionUID = -7958004718871270162L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CERERI_RACORDARE_ID")
    protected CereriRacordare idCereriRacordare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_APARATE_ID")
    protected TipAparate idAparate;

    @NotNull
    @Column(name = "NRBUC", nullable = false)
    protected Integer nrbuc;

    public TipAparate getIdAparate() {
        return idAparate;
    }

    public void setIdAparate(TipAparate idAparate) {
        this.idAparate = idAparate;
    }


    public void setIdCereriRacordare(CereriRacordare idCereriRacordare) {
        this.idCereriRacordare = idCereriRacordare;
    }

    public CereriRacordare getIdCereriRacordare() {
        return idCereriRacordare;
    }

    public void setNrbuc(Integer nrbuc) {
        this.nrbuc = nrbuc;
    }

    public Integer getNrbuc() {
        return nrbuc;
    }


}