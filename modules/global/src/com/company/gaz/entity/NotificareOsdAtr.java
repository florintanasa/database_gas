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
import com.haulmont.chile.core.annotations.Composition;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import java.util.List;
import javax.persistence.OneToMany;
import java.math.BigDecimal;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.chile.core.annotations.NumberFormat;

@Listeners("gaz_NotificareOsdAtrEntityListener")
@NamePattern("%s|nrinreg")
@Table(name = "GAZ_NOTIFICARE_OSD_ATR")
@Entity(name = "gaz$NotificareOsdAtr")
public class NotificareOsdAtr extends StandardEntity {
    private static final long serialVersionUID = 8465157226644462331L;

    @NotNull
    @Column(name = "NRINREG", nullable = false)
    protected Integer nrinreg;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATAINREG", nullable = false)
    protected Date datainreg;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_CI_CIF_ID")
    protected CiCif idCiCif;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATIA_1_ID")
    protected Locatii locatia_1;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TELEFOANE_ID")
    protected Telefoane idTelefoane;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FAX_ID")
    protected Telefoane idFax;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EMAIL_ID")
    protected Email idEmail;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_ACORD_TEHNIC_RACORDARE_ID")
    protected AcordTehnicRacordare idAcordTehnicRacordare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATIA_2_ID")
    protected Locatii locatia_2;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_OBT_CERT_URB", nullable = false)
    protected Date dataObtCertUrb;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATA_DEP_DOC_TEH_PRIM", nullable = false)
    protected Date dataDepDocTehPrim;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SOCIETATI_PROIECTARE_ID")
    protected SocietatiProiectare idSocietatiProiectare;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_TERM_PROIECT", nullable = false)
    protected Date dataTermProiect;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_VERIFICATOR_ID")
    protected Verificator idVerificator;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_TERM_VERIF", nullable = false)
    protected Date dataTermVerif;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_SOCIETATI_EXECUTIE_ID")
    protected SocietatiExecutie idSocietatiExecutie;

    @NotNull
    @Temporal(TemporalType.DATE)
    @Column(name = "DATA_TERM_EXE", nullable = false)
    protected Date dataTermExe;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "idNotificareOsdAtr")
    protected List<NotificareOsdAtrLinii> idNotificareOsdAtrLinii;

    @NumberFormat(pattern = "#,##0.##", decimalSeparator = ",", groupingSeparator = ".")
    @NotNull
    @Column(name = "TOTAL_PRET_TARIF", nullable = false)
    protected BigDecimal totalPretTarif;

    @NotNull
    @Column(name = "TOTAL_TVA", nullable = false)
    protected BigDecimal totalTVA;

    @NotNull
    @Column(name = "TOTAL_PRET_TARIF_TVA", nullable = false)
    protected BigDecimal totalPretTarifTva;

    public void setIdFax(Telefoane idFax) {
        this.idFax = idFax;
    }

    public Telefoane getIdFax() {
        return idFax;
    }

    public void setIdEmail(Email idEmail) {
        this.idEmail = idEmail;
    }

    public Email getIdEmail() {
        return idEmail;
    }


    public void setDataTermProiect(Date dataTermProiect) {
        this.dataTermProiect = dataTermProiect;
    }

    public Date getDataTermProiect() {
        return dataTermProiect;
    }

    public void setDataTermVerif(Date dataTermVerif) {
        this.dataTermVerif = dataTermVerif;
    }

    public Date getDataTermVerif() {
        return dataTermVerif;
    }

    public void setDataTermExe(Date dataTermExe) {
        this.dataTermExe = dataTermExe;
    }

    public Date getDataTermExe() {
        return dataTermExe;
    }


    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }


    public void setTotalPretTarif(BigDecimal totalPretTarif) {
        this.totalPretTarif = totalPretTarif;
    }

    public BigDecimal getTotalPretTarif() {
        return totalPretTarif;
    }

    public void setTotalTVA(BigDecimal totalTVA) {
        this.totalTVA = totalTVA;
    }

    public BigDecimal getTotalTVA() {
        return totalTVA;
    }

    public void setTotalPretTarifTva(BigDecimal totalPretTarifTva) {
        this.totalPretTarifTva = totalPretTarifTva;
    }

    public BigDecimal getTotalPretTarifTva() {
        return totalPretTarifTva;
    }


    public void setIdNotificareOsdAtrLinii(List<NotificareOsdAtrLinii> idNotificareOsdAtrLinii) {
        this.idNotificareOsdAtrLinii = idNotificareOsdAtrLinii;
    }

    public List<NotificareOsdAtrLinii> getIdNotificareOsdAtrLinii() {
        return idNotificareOsdAtrLinii;
    }


    public void setDataObtCertUrb(Date dataObtCertUrb) {
        this.dataObtCertUrb = dataObtCertUrb;
    }

    public Date getDataObtCertUrb() {
        return dataObtCertUrb;
    }

    public void setDataDepDocTehPrim(Date dataDepDocTehPrim) {
        this.dataDepDocTehPrim = dataDepDocTehPrim;
    }

    public Date getDataDepDocTehPrim() {
        return dataDepDocTehPrim;
    }


    public Telefoane getIdTelefoane() {
        return idTelefoane;
    }

    public void setIdTelefoane(Telefoane idTelefoane) {
        this.idTelefoane = idTelefoane;
    }


    public void setLocatia_2(Locatii locatia_2) {
        this.locatia_2 = locatia_2;
    }

    public Locatii getLocatia_2() {
        return locatia_2;
    }


    public void setIdSocietatiProiectare(SocietatiProiectare idSocietatiProiectare) {
        this.idSocietatiProiectare = idSocietatiProiectare;
    }

    public SocietatiProiectare getIdSocietatiProiectare() {
        return idSocietatiProiectare;
    }

    public void setIdVerificator(Verificator idVerificator) {
        this.idVerificator = idVerificator;
    }

    public Verificator getIdVerificator() {
        return idVerificator;
    }

    public void setIdSocietatiExecutie(SocietatiExecutie idSocietatiExecutie) {
        this.idSocietatiExecutie = idSocietatiExecutie;
    }

    public SocietatiExecutie getIdSocietatiExecutie() {
        return idSocietatiExecutie;
    }


    public void setNrinreg(Integer nrinreg) {
        this.nrinreg = nrinreg;
    }

    public Integer getNrinreg() {
        return nrinreg;
    }

    public void setDatainreg(Date datainreg) {
        this.datainreg = datainreg;
    }

    public Date getDatainreg() {
        return datainreg;
    }

    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setIdCiCif(CiCif idCiCif) {
        this.idCiCif = idCiCif;
    }

    public CiCif getIdCiCif() {
        return idCiCif;
    }

    public void setLocatia_1(Locatii locatia_1) {
        this.locatia_1 = locatia_1;
    }

    public Locatii getLocatia_1() {
        return locatia_1;
    }

    public void setIdAcordTehnicRacordare(AcordTehnicRacordare idAcordTehnicRacordare) {
        this.idAcordTehnicRacordare = idAcordTehnicRacordare;
    }

    public AcordTehnicRacordare getIdAcordTehnicRacordare() {
        return idAcordTehnicRacordare;
    }


}