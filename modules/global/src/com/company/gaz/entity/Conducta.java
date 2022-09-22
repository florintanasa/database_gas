package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.math.BigDecimal;
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

@NamePattern("%s|nod")
@Table(name = "GAZ_CONDUCTA")
@Entity(name = "gaz$Conducta")
public class Conducta extends StandardEntity {
    private static final long serialVersionUID = -7516162249453354812L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @NotNull
    @Column(name = "NOD", nullable = false, length = 11)
    protected String nod;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ARTERA_NOD1_ID")
    protected Artera idArteraNod1;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_STRAZI_NOD1_ID")
    protected Strazi idStraziNod1;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ARTERA_NOD2_ID")
    protected Artera idArteraNod2;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_STRAZI_NOD2_ID")
    protected Strazi idStraziNod2;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_PE_ID")
    protected MatConducta idMatConductaPe;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_PE_ID")
    protected DiamPe idDiamPe;

    @Column(name = "LUNGIME_PE", precision = 6, scale = 2)
    protected BigDecimal lungimePe;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_OL_ID")
    protected MatConducta idMatConductaOl;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_OL_ID")
    protected DiamOl idDiamOl;

    @Column(name = "LUNGIME_OL", precision = 6, scale = 2)
    protected BigDecimal lungimeOl;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_REGIM_PRES_ID")
    protected RegimPres idRegimPres;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SRS_ID")
    protected Srs idSrs;

    @NotNull
    @Column(name = "NR_PVRT", nullable = false)
    protected Integer nrPVRT;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_PVRT", nullable = false)
    protected Date dataPVRT;

    @NotNull
    @Column(name = "NR_PIF", nullable = false)
    protected Integer nrPIF;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_PIF", nullable = false)
    protected Date dataPIF;

    @NotNull
    @Column(name = "MONTAJ_INGROPAT", nullable = false)
    protected Boolean montajIngropat = false;

    @NotNull
    @Column(name = "MONTAJ_APARENT", nullable = false)
    protected Boolean montajAparent = false;

    public void setIdMatConductaPe(MatConducta idMatConductaPe) {
        this.idMatConductaPe = idMatConductaPe;
    }

    public MatConducta getIdMatConductaPe() {
        return idMatConductaPe;
    }

    public void setIdMatConductaOl(MatConducta idMatConductaOl) {
        this.idMatConductaOl = idMatConductaOl;
    }

    public MatConducta getIdMatConductaOl() {
        return idMatConductaOl;
    }


    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }

    public void setNod(String nod) {
        this.nod = nod;
    }

    public String getNod() {
        return nod;
    }

    public void setIdArteraNod1(Artera idArteraNod1) {
        this.idArteraNod1 = idArteraNod1;
    }

    public Artera getIdArteraNod1() {
        return idArteraNod1;
    }

    public void setIdStraziNod1(Strazi idStraziNod1) {
        this.idStraziNod1 = idStraziNod1;
    }

    public Strazi getIdStraziNod1() {
        return idStraziNod1;
    }

    public void setIdArteraNod2(Artera idArteraNod2) {
        this.idArteraNod2 = idArteraNod2;
    }

    public Artera getIdArteraNod2() {
        return idArteraNod2;
    }

    public void setIdStraziNod2(Strazi idStraziNod2) {
        this.idStraziNod2 = idStraziNod2;
    }

    public Strazi getIdStraziNod2() {
        return idStraziNod2;
    }

    public void setIdDiamPe(DiamPe idDiamPe) {
        this.idDiamPe = idDiamPe;
    }

    public DiamPe getIdDiamPe() {
        return idDiamPe;
    }

    public void setLungimePe(BigDecimal lungimePe) {
        this.lungimePe = lungimePe;
    }

    public BigDecimal getLungimePe() {
        return lungimePe;
    }

    public void setIdDiamOl(DiamOl idDiamOl) {
        this.idDiamOl = idDiamOl;
    }

    public DiamOl getIdDiamOl() {
        return idDiamOl;
    }

    public void setLungimeOl(BigDecimal lungimeOl) {
        this.lungimeOl = lungimeOl;
    }

    public BigDecimal getLungimeOl() {
        return lungimeOl;
    }

    public void setIdRegimPres(RegimPres idRegimPres) {
        this.idRegimPres = idRegimPres;
    }

    public RegimPres getIdRegimPres() {
        return idRegimPres;
    }

    public void setIdSrs(Srs idSrs) {
        this.idSrs = idSrs;
    }

    public Srs getIdSrs() {
        return idSrs;
    }

    public void setNrPVRT(Integer nrPVRT) {
        this.nrPVRT = nrPVRT;
    }

    public Integer getNrPVRT() {
        return nrPVRT;
    }

    public void setDataPVRT(Date dataPVRT) {
        this.dataPVRT = dataPVRT;
    }

    public Date getDataPVRT() {
        return dataPVRT;
    }

    public void setNrPIF(Integer nrPIF) {
        this.nrPIF = nrPIF;
    }

    public Integer getNrPIF() {
        return nrPIF;
    }

    public void setDataPIF(Date dataPIF) {
        this.dataPIF = dataPIF;
    }

    public Date getDataPIF() {
        return dataPIF;
    }

    public void setMontajIngropat(Boolean montajIngropat) {
        this.montajIngropat = montajIngropat;
    }

    public Boolean getMontajIngropat() {
        return montajIngropat;
    }

    public void setMontajAparent(Boolean montajAparent) {
        this.montajAparent = montajAparent;
    }

    public Boolean getMontajAparent() {
        return montajAparent;
    }


}