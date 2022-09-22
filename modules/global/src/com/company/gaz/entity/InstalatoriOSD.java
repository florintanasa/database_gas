package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s %s|idParteneri,tipAutorizatie,nrAutorizatie")
@Table(name = "GAZ_INSTALATORI_OSD")
@Entity(name = "gaz$InstalatoriOSD")
public class InstalatoriOSD extends StandardEntity {
    private static final long serialVersionUID = -7896692457788981093L;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @NotNull
    @Column(name = "TIP_AUTORIZATIE", nullable = false, length = 10)
    protected String tipAutorizatie;

    @NotNull
    @Column(name = "NR_AUTORIZATIE", nullable = false)
    protected Integer nrAutorizatie;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_START_AUTORIZATIE", nullable = false)
    protected Date dataStartAutorizatie;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_STOP_AUTORIZATIE", nullable = false)
    protected Date dataStopAutorizatie;

    @NotNull
    @Column(name = "ACTIV", nullable = false)
    protected Boolean activ = false;

    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }


    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setTipAutorizatie(String tipAutorizatie) {
        this.tipAutorizatie = tipAutorizatie;
    }

    public String getTipAutorizatie() {
        return tipAutorizatie;
    }

    public void setNrAutorizatie(Integer nrAutorizatie) {
        this.nrAutorizatie = nrAutorizatie;
    }

    public Integer getNrAutorizatie() {
        return nrAutorizatie;
    }

    public void setDataStartAutorizatie(Date dataStartAutorizatie) {
        this.dataStartAutorizatie = dataStartAutorizatie;
    }

    public Date getDataStartAutorizatie() {
        return dataStartAutorizatie;
    }

    public void setDataStopAutorizatie(Date dataStopAutorizatie) {
        this.dataStopAutorizatie = dataStopAutorizatie;
    }

    public Date getDataStopAutorizatie() {
        return dataStopAutorizatie;
    }

    public void setActiv(Boolean activ) {
        this.activ = activ;
    }

    public Boolean getActiv() {
        return activ;
    }


}