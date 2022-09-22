package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import com.haulmont.cuba.core.entity.annotation.Lookup;
import com.haulmont.cuba.core.entity.annotation.LookupType;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
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
import com.haulmont.cuba.core.entity.annotation.Listeners;

@Listeners("gaz_CereriRacordareEntityListener")
@NamePattern("%s %s %s|nrinreg,idPartener,locatia_2")
@Table(name = "GAZ_CERERI_RACORDARE")
@Entity(name = "gaz$CereriRacordare")
public class CereriRacordare extends StandardEntity {
    private static final long serialVersionUID = -6837329350864347474L;

    @NotNull
    @Column(name = "NRINREG", nullable = false)
    protected Integer nrinreg;

    @Temporal(TemporalType.DATE)
    @NotNull
    @Column(name = "DATAINREG", nullable = false)
    protected Date datainreg;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENER_ID")
    protected Parteneri idPartener;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATIA_1_ID")
    protected Locatii locatia_1;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CI_CIF_SOL_ID")
    protected CiCif idCiCifSol;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TELEFOANE_SOL_ID")
    protected Telefoane idTelefoaneSol;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FAX_SOL_ID")
    protected Telefoane idFaxSol;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EMAIL_SOL_ID")
    protected Email idEmailSol;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATIA_2_ID")
    protected Locatii locatia_2;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "LOCATIA_3_ID")
    protected Locatii locatia_3;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MANDATAR_ID")
    protected Parteneri idMandatar;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CI_CIF_MAN_ID")
    protected CiCif idCiCifMan;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TELEFOANE_MAN_ID")
    protected Telefoane idTelefoaneMan;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_FAX_MAN_ID")
    protected Telefoane idFaxMan;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_EMAIL_MAN_ID")
    protected Email idEmailMan;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "LOCATIA_4_ID")
    protected Locatii locatia_4;

    @NotNull
    @Column(name = "TIP_NOU", nullable = false)
    protected Boolean tipNou = false;

    @NotNull
    @Column(name = "TIP_EXISTENT", nullable = false)
    protected Boolean tipExistent = false;

    @NotNull
    @Column(name = "TIP_CASNIC", nullable = false)
    protected Boolean tipCasnic = false;

    @NotNull
    @Column(name = "TIP_NONCASNIC", nullable = false)
    protected Boolean tipNoncasnic = false;

    @NotNull
    @Column(name = "R_OSD_POSTA_DOM", nullable = false)
    protected Boolean rOsdPostaDom = false;

    @NotNull
    @Column(name = "R_OSD_POSTA_LOC_CONS", nullable = false)
    protected Boolean rOsdPostaLocCons = false;

    @NotNull
    @Column(name = "R_OSD_POSTA_MAN", nullable = false)
    protected Boolean rOsdPostaMan = false;

    @NotNull
    @Column(name = "R_OSD_SEDIU", nullable = false)
    protected Boolean rOsdSediu = false;

    @NotNull
    @Column(name = "COM_EMAIL", nullable = false)
    protected Boolean comEmail = false;

    @NotNull
    @Column(name = "COM_FAX", nullable = false)
    protected Boolean comFax = false;

    @NotNull
    @Column(name = "COM_SEDIU", nullable = false)
    protected Boolean comSediu = false;

    @NotNull
    @Column(name = "COM_TELEFON", nullable = false)
    protected Boolean comTelefon = false;

    @NotNull
    @Column(name = "COM_ALTE", nullable = false)
    protected Boolean comAlte = false;

    @NotNull
    @Column(name = "DA_AFISARE_SITE", nullable = false)
    protected Boolean daAfisareSite = false;

    @NotNull
    @Column(name = "NU_AFISARE_SITE", nullable = false)
    protected Boolean nuAfisareSite = false;

    @NotNull
    @Column(name = "TOTAL_DEBIT", nullable = false, precision = 6, scale = 2)
    protected BigDecimal totalDebit;

    @Lob
    @Column(name = "PREC_AMPLASARE")
    protected String precAmplasare;

    @Lob
    @Column(name = "ALTE_CERINTE")
    protected String alteCerinte;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "idCereriRacordare")
    protected List<AparateSolicitate> idAparateSolicitate;

    @Composition
    @OnDelete(DeletePolicy.CASCADE)
    @OneToMany(mappedBy = "idCereriRacordare")
    protected List<DocAnexCerRac> idDocAnexCerRac;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STATUS_CERERE_ATR_ID")
    protected StatusCerereATR idStatusCerereATR;

    public void setIdStatusCerereATR(StatusCerereATR idStatusCerereATR) {
        this.idStatusCerereATR = idStatusCerereATR;
    }

    public StatusCerereATR getIdStatusCerereATR() {
        return idStatusCerereATR;
    }


    public void setIdTelefoaneMan(Telefoane idTelefoaneMan) {
        this.idTelefoaneMan = idTelefoaneMan;
    }

    public Telefoane getIdTelefoaneMan() {
        return idTelefoaneMan;
    }

    public void setIdFaxMan(Telefoane idFaxMan) {
        this.idFaxMan = idFaxMan;
    }

    public Telefoane getIdFaxMan() {
        return idFaxMan;
    }

    public void setIdEmailMan(Email idEmailMan) {
        this.idEmailMan = idEmailMan;
    }

    public Email getIdEmailMan() {
        return idEmailMan;
    }


    public void setIdCiCifSol(CiCif idCiCifSol) {
        this.idCiCifSol = idCiCifSol;
    }

    public CiCif getIdCiCifSol() {
        return idCiCifSol;
    }

    public void setIdCiCifMan(CiCif idCiCifMan) {
        this.idCiCifMan = idCiCifMan;
    }

    public CiCif getIdCiCifMan() {
        return idCiCifMan;
    }

    public void setIdTelefoaneSol(Telefoane idTelefoaneSol) {
        this.idTelefoaneSol = idTelefoaneSol;
    }

    public Telefoane getIdTelefoaneSol() {
        return idTelefoaneSol;
    }

    public void setIdFaxSol(Telefoane idFaxSol) {
        this.idFaxSol = idFaxSol;
    }

    public Telefoane getIdFaxSol() {
        return idFaxSol;
    }

    public void setIdEmailSol(Email idEmailSol) {
        this.idEmailSol = idEmailSol;
    }

    public Email getIdEmailSol() {
        return idEmailSol;
    }


    public void setIdDocAnexCerRac(List<DocAnexCerRac> idDocAnexCerRac) {
        this.idDocAnexCerRac = idDocAnexCerRac;
    }

    public List<DocAnexCerRac> getIdDocAnexCerRac() {
        return idDocAnexCerRac;
    }


    public void setIdAparateSolicitate(List<AparateSolicitate> idAparateSolicitate) {
        this.idAparateSolicitate = idAparateSolicitate;
    }

    public List<AparateSolicitate> getIdAparateSolicitate() {
        return idAparateSolicitate;
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

    public void setIdPartener(Parteneri idPartener) {
        this.idPartener = idPartener;
    }

    public Parteneri getIdPartener() {
        return idPartener;
    }

    public void setLocatia_1(Locatii locatia_1) {
        this.locatia_1 = locatia_1;
    }

    public Locatii getLocatia_1() {
        return locatia_1;
    }

    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
    }

    public void setLocatia_2(Locatii locatia_2) {
        this.locatia_2 = locatia_2;
    }

    public Locatii getLocatia_2() {
        return locatia_2;
    }

    public void setLocatia_3(Locatii locatia_3) {
        this.locatia_3 = locatia_3;
    }

    public Locatii getLocatia_3() {
        return locatia_3;
    }

    public void setIdMandatar(Parteneri idMandatar) {
        this.idMandatar = idMandatar;
    }

    public Parteneri getIdMandatar() {
        return idMandatar;
    }

    public void setLocatia_4(Locatii locatia_4) {
        this.locatia_4 = locatia_4;
    }

    public Locatii getLocatia_4() {
        return locatia_4;
    }

    public void setTipNou(Boolean tipNou) {
        this.tipNou = tipNou;
    }

    public Boolean getTipNou() {
        return tipNou;
    }

    public void setTipExistent(Boolean tipExistent) {
        this.tipExistent = tipExistent;
    }

    public Boolean getTipExistent() {
        return tipExistent;
    }

    public void setTipCasnic(Boolean tipCasnic) {
        this.tipCasnic = tipCasnic;
    }

    public Boolean getTipCasnic() {
        return tipCasnic;
    }

    public void setTipNoncasnic(Boolean tipNoncasnic) {
        this.tipNoncasnic = tipNoncasnic;
    }

    public Boolean getTipNoncasnic() {
        return tipNoncasnic;
    }

    public void setROsdPostaDom(Boolean rOsdPostaDom) {
        this.rOsdPostaDom = rOsdPostaDom;
    }

    public Boolean getROsdPostaDom() {
        return rOsdPostaDom;
    }

    public void setROsdPostaLocCons(Boolean rOsdPostaLocCons) {
        this.rOsdPostaLocCons = rOsdPostaLocCons;
    }

    public Boolean getROsdPostaLocCons() {
        return rOsdPostaLocCons;
    }

    public void setROsdPostaMan(Boolean rOsdPostaMan) {
        this.rOsdPostaMan = rOsdPostaMan;
    }

    public Boolean getROsdPostaMan() {
        return rOsdPostaMan;
    }

    public void setROsdSediu(Boolean rOsdSediu) {
        this.rOsdSediu = rOsdSediu;
    }

    public Boolean getROsdSediu() {
        return rOsdSediu;
    }

    public void setComEmail(Boolean comEmail) {
        this.comEmail = comEmail;
    }

    public Boolean getComEmail() {
        return comEmail;
    }

    public void setComFax(Boolean comFax) {
        this.comFax = comFax;
    }

    public Boolean getComFax() {
        return comFax;
    }

    public void setComSediu(Boolean comSediu) {
        this.comSediu = comSediu;
    }

    public Boolean getComSediu() {
        return comSediu;
    }

    public void setComTelefon(Boolean comTelefon) {
        this.comTelefon = comTelefon;
    }

    public Boolean getComTelefon() {
        return comTelefon;
    }

    public void setComAlte(Boolean comAlte) {
        this.comAlte = comAlte;
    }

    public Boolean getComAlte() {
        return comAlte;
    }

    public void setDaAfisareSite(Boolean daAfisareSite) {
        this.daAfisareSite = daAfisareSite;
    }

    public Boolean getDaAfisareSite() {
        return daAfisareSite;
    }

    public void setNuAfisareSite(Boolean nuAfisareSite) {
        this.nuAfisareSite = nuAfisareSite;
    }

    public Boolean getNuAfisareSite() {
        return nuAfisareSite;
    }

    public void setTotalDebit(BigDecimal totalDebit) {
        this.totalDebit = totalDebit;
    }

    public BigDecimal getTotalDebit() {
        return totalDebit;
    }

    public void setPrecAmplasare(String precAmplasare) {
        this.precAmplasare = precAmplasare;
    }

    public String getPrecAmplasare() {
        return precAmplasare;
    }

    public void setAlteCerinte(String alteCerinte) {
        this.alteCerinte = alteCerinte;
    }

    public String getAlteCerinte() {
        return alteCerinte;
    }


}