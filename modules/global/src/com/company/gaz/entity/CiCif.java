package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.StandardEntity;
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
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s %s %s %s|idTipAct,serieAct,nrAct,cnp,cif")
@Table(name = "GAZ_CI_CIF")
@Entity(name = "gaz$CiCif")
public class CiCif extends StandardEntity {
    private static final long serialVersionUID = -4098325426971033989L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TIP_ACT_ID")
    protected TipAct idTipAct;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INST_ELIB_ACTE_ID")
    protected InstElibActe idInstElibActe;

    @Column(name = "SERIE_ACT", length = 25)
    protected String serieAct;

    @Column(name = "NR_ACT", length = 25)
    protected String nrAct;

    @Column(name = "CIF", length = 25)
    protected String cif;

    @Column(name = "CNP", length = 13)
    protected String cnp;

    @Column(name = "NR_ORD", length = 25)
    protected String nrOrd;

    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_ELIBERARE_ACT")
    protected Date dataEliberareAct;

    @NotNull
    @Column(name = "VALABIL", nullable = false)
    protected Boolean valabil = false;

    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setIdTipAct(TipAct idTipAct) {
        this.idTipAct = idTipAct;
    }

    public TipAct getIdTipAct() {
        return idTipAct;
    }

    public void setIdInstElibActe(InstElibActe idInstElibActe) {
        this.idInstElibActe = idInstElibActe;
    }

    public InstElibActe getIdInstElibActe() {
        return idInstElibActe;
    }

    public void setSerieAct(String serieAct) {
        this.serieAct = serieAct;
    }

    public String getSerieAct() {
        return serieAct;
    }

    public void setNrAct(String nrAct) {
        this.nrAct = nrAct;
    }

    public String getNrAct() {
        return nrAct;
    }

    public void setCif(String cif) {
        this.cif = cif;
    }

    public String getCif() {
        return cif;
    }

    public void setCnp(String cnp) {
        this.cnp = cnp;
    }

    public String getCnp() {
        return cnp;
    }

    public void setNrOrd(String nrOrd) {
        this.nrOrd = nrOrd;
    }

    public String getNrOrd() {
        return nrOrd;
    }

    public void setDataEliberareAct(Date dataEliberareAct) {
        this.dataEliberareAct = dataEliberareAct;
    }

    public Date getDataEliberareAct() {
        return dataEliberareAct;
    }

    public void setValabil(Boolean valabil) {
        this.valabil = valabil;
    }

    public Boolean getValabil() {
        return valabil;
    }


}