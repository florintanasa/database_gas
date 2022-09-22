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
import com.haulmont.cuba.core.entity.FileDescriptor;
import javax.persistence.OneToOne;
import com.haulmont.cuba.core.entity.annotation.OnDelete;
import com.haulmont.cuba.core.global.DeletePolicy;
import com.haulmont.cuba.core.entity.annotation.Listeners;
import com.haulmont.chile.core.annotations.NumberFormat;

@Listeners("gaz_AcordTehnicRacordareEntityListener")
@NamePattern("%s|nrinreg")
@Table(name = "GAZ_ACORD_TEHNIC_RACORDARE")
@Entity(name = "gaz$AcordTehnicRacordare")
public class AcordTehnicRacordare extends StandardEntity {
    private static final long serialVersionUID = -421845581215137808L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_SIRUTA_ID")
    protected Siruta idSiruta;

    @NumberFormat(pattern = "#", decimalSeparator = ",", groupingSeparator = ".")
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
    @JoinColumn(name = "ID_TIP_ARTERA_ID")
    protected Artera idTipArtera;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_STRAZI_ID")
    protected Strazi idStrazi;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CERERI_RACORDARE_ID", unique = true)
    protected CereriRacordare idCereriRacordare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONDUCTA_RACORD_ID")
    protected Conducta idConductaRacord;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_RACORD_OL_ID")
    protected MatConducta idMatConductaRacordOl;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_OL_RACORD_ID")
    protected DiamOl idDiamOlRacord;

    @Column(name = "LUNGIME_OL_RACORD", precision = 6, scale = 2)
    protected BigDecimal lungimeOlRacord;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_RACORD_PE_ID")
    protected MatConducta idMatConductaRacordPe;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_PE_RACORD_ID")
    protected DiamPe idDiamPeRacord;

    @Column(name = "LUNGIME_PE_RACORD", precision = 6, scale = 2)
    protected BigDecimal lungimePeRacord;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_RACORD_PE2_ID")
    protected MatConducta idMatConductaRacordPe2;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_PE_RACORD2_ID")
    protected DiamPe idDiamPeRacord2;

    @Column(name = "LUNGIME_PE_RACORD2", precision = 6, scale = 2)
    protected BigDecimal lungimePeRacord2;

    @Column(name = "LUNGIME_ASFALT", precision = 6, scale = 2)
    protected BigDecimal lungimeAsfalt;

    @Column(name = "LUNGIME_SPATIU_VERDE", precision = 6, scale = 2)
    protected BigDecimal lungimeSpatiuVerde;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONDUCTA_EXTINDERE_ID")
    protected Conducta idConductaExtindere;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONDUCTA_EXTINDERE_EXISTENTA_ID")
    protected Conducta idConductaExtindereExistenta;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_EXTINDERE_OL_ID")
    protected MatConducta idMatConductaExtindereOl;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_OL_EXTINDERE_ID")
    protected DiamOl idDiamOlExtindere;

    @Column(name = "LUNGIME_OL_EXTINDERE", precision = 6, scale = 2)
    protected BigDecimal lungimeOlExtindere;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_EXTINDERE_PE_ID")
    protected MatConducta idMatConductaExtinderePe;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_PE_EXTINDERE_ID")
    protected DiamPe idDiamPeExtindere;

    @Column(name = "LUNGIME_PE_EXTINDERE", precision = 6, scale = 2)
    protected BigDecimal lungimePeExtindere;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONDUCTA_REDIMENSIONARE_ID")
    protected Conducta idConductaRedimensionare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CONDUCTA_REDIMENSIONARE_EXISTENTA_ID")
    protected Conducta idConductaRedimensionareExistenta;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_REDIMENSIONARE_PE_ID")
    protected MatConducta idMatConductaRedimensionarePe;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_OL_REDIMENSIONARE_ID")
    protected DiamOl idDiamOlRedimensionare;

    @Column(name = "LUNGIME_OL_REDIMENSIONARE", precision = 6, scale = 2)
    protected BigDecimal lungimeOlRedimensionare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_MAT_CONDUCTA_REDIMENSIONARE_OL_ID")
    protected MatConducta idMatConductaRedimensionareOl;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DIAM_PE_REDIMENSIONARE_ID")
    protected DiamPe idDiamPeRedimensionare;

    @Column(name = "LUNGIME_PE_REDIMENSIONARE", precision = 6, scale = 2)
    protected BigDecimal lungimePeRedimensionare;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_OBIECTE_BR_ID")
    protected Obiecte idObiecteBr;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_OBIECTE_POST_ID")
    protected Obiecte idObiectePost;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIP_CONTOR_ID")
    protected TipContor idTipContor;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_TIP_REGULATOR_ID")
    protected TipRegulator idTipRegulator;

    @Column(name = "PRES_CALCUL", precision = 3, scale = 2)
    protected BigDecimal presCalcul;

    @NotNull
    @Column(name = "MOD_SD", nullable = false)
    protected Boolean modSD = false;

    @NotNull
    @Column(name = "EXTINDERE_CONDUCTA", nullable = false)
    protected Boolean extindereConducta = false;

    @NotNull
    @Column(name = "REDIMENSIONARE_CONDUCTA", nullable = false)
    protected Boolean redimensionareConducta = false;

    @NotNull
    @Column(name = "CORECTOR", nullable = false)
    protected Boolean corector = false;

    @NotNull
    @Column(name = "RACORD_NOU", nullable = false)
    protected Boolean racordNou = false;

    @NotNull
    @Column(name = "RACORD_EXISTENT", nullable = false)
    protected Boolean racordExistent = false;

    @NotNull
    @Column(name = "POST_NOU", nullable = false)
    protected Boolean postNou = false;

    @NotNull
    @Column(name = "POST_EXISTENT", nullable = false)
    protected Boolean postExistent = false;

    @NotNull
    @Column(name = "TEREN_PRIVAT", nullable = false)
    protected Boolean terenPrivat = false;

    @NotNull
    @Column(name = "TEREN_PUBLIC", nullable = false)
    protected Boolean terenPublic = false;

    @OnDelete(DeletePolicy.CASCADE)
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "IMAGINE_SOLUTIE_ID")
    protected FileDescriptor imagineSolutie;

    @NotNull
    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_INSTALATORI_OSD_ID")
    protected InstalatoriOSD idInstalatoriOSD;

    public void setIdMatConductaRacordPe2(MatConducta idMatConductaRacordPe2) {
        this.idMatConductaRacordPe2 = idMatConductaRacordPe2;
    }

    public MatConducta getIdMatConductaRacordPe2() {
        return idMatConductaRacordPe2;
    }

    public void setIdDiamPeRacord2(DiamPe idDiamPeRacord2) {
        this.idDiamPeRacord2 = idDiamPeRacord2;
    }

    public DiamPe getIdDiamPeRacord2() {
        return idDiamPeRacord2;
    }

    public void setLungimePeRacord2(BigDecimal lungimePeRacord2) {
        this.lungimePeRacord2 = lungimePeRacord2;
    }

    public BigDecimal getLungimePeRacord2() {
        return lungimePeRacord2;
    }


    public void setIdConductaExtindereExistenta(Conducta idConductaExtindereExistenta) {
        this.idConductaExtindereExistenta = idConductaExtindereExistenta;
    }

    public Conducta getIdConductaExtindereExistenta() {
        return idConductaExtindereExistenta;
    }

    public void setIdConductaRedimensionareExistenta(Conducta idConductaRedimensionareExistenta) {
        this.idConductaRedimensionareExistenta = idConductaRedimensionareExistenta;
    }

    public Conducta getIdConductaRedimensionareExistenta() {
        return idConductaRedimensionareExistenta;
    }


    public void setIdInstalatoriOSD(InstalatoriOSD idInstalatoriOSD) {
        this.idInstalatoriOSD = idInstalatoriOSD;
    }

    public InstalatoriOSD getIdInstalatoriOSD() {
        return idInstalatoriOSD;
    }


    public void setLungimeAsfalt(BigDecimal lungimeAsfalt) {
        this.lungimeAsfalt = lungimeAsfalt;
    }

    public BigDecimal getLungimeAsfalt() {
        return lungimeAsfalt;
    }

    public void setLungimeSpatiuVerde(BigDecimal lungimeSpatiuVerde) {
        this.lungimeSpatiuVerde = lungimeSpatiuVerde;
    }

    public BigDecimal getLungimeSpatiuVerde() {
        return lungimeSpatiuVerde;
    }


    public void setImagineSolutie(FileDescriptor imagineSolutie) {
        this.imagineSolutie = imagineSolutie;
    }

    public FileDescriptor getImagineSolutie() {
        return imagineSolutie;
    }


    public void setIdConductaRacord(Conducta idConductaRacord) {
        this.idConductaRacord = idConductaRacord;
    }

    public Conducta getIdConductaRacord() {
        return idConductaRacord;
    }

    public void setIdMatConductaRacordOl(MatConducta idMatConductaRacordOl) {
        this.idMatConductaRacordOl = idMatConductaRacordOl;
    }

    public MatConducta getIdMatConductaRacordOl() {
        return idMatConductaRacordOl;
    }

    public void setIdMatConductaRacordPe(MatConducta idMatConductaRacordPe) {
        this.idMatConductaRacordPe = idMatConductaRacordPe;
    }

    public MatConducta getIdMatConductaRacordPe() {
        return idMatConductaRacordPe;
    }

    public void setIdConductaExtindere(Conducta idConductaExtindere) {
        this.idConductaExtindere = idConductaExtindere;
    }

    public Conducta getIdConductaExtindere() {
        return idConductaExtindere;
    }

    public void setIdMatConductaExtindereOl(MatConducta idMatConductaExtindereOl) {
        this.idMatConductaExtindereOl = idMatConductaExtindereOl;
    }

    public MatConducta getIdMatConductaExtindereOl() {
        return idMatConductaExtindereOl;
    }

    public void setIdMatConductaExtinderePe(MatConducta idMatConductaExtinderePe) {
        this.idMatConductaExtinderePe = idMatConductaExtinderePe;
    }

    public MatConducta getIdMatConductaExtinderePe() {
        return idMatConductaExtinderePe;
    }

    public void setIdConductaRedimensionare(Conducta idConductaRedimensionare) {
        this.idConductaRedimensionare = idConductaRedimensionare;
    }

    public Conducta getIdConductaRedimensionare() {
        return idConductaRedimensionare;
    }

    public void setIdMatConductaRedimensionarePe(MatConducta idMatConductaRedimensionarePe) {
        this.idMatConductaRedimensionarePe = idMatConductaRedimensionarePe;
    }

    public MatConducta getIdMatConductaRedimensionarePe() {
        return idMatConductaRedimensionarePe;
    }

    public void setIdMatConductaRedimensionareOl(MatConducta idMatConductaRedimensionareOl) {
        this.idMatConductaRedimensionareOl = idMatConductaRedimensionareOl;
    }

    public MatConducta getIdMatConductaRedimensionareOl() {
        return idMatConductaRedimensionareOl;
    }

    public void setIdObiecteBr(Obiecte idObiecteBr) {
        this.idObiecteBr = idObiecteBr;
    }

    public Obiecte getIdObiecteBr() {
        return idObiecteBr;
    }

    public void setIdObiectePost(Obiecte idObiectePost) {
        this.idObiectePost = idObiectePost;
    }

    public Obiecte getIdObiectePost() {
        return idObiectePost;
    }

    public void setIdTipContor(TipContor idTipContor) {
        this.idTipContor = idTipContor;
    }

    public TipContor getIdTipContor() {
        return idTipContor;
    }

    public void setIdTipRegulator(TipRegulator idTipRegulator) {
        this.idTipRegulator = idTipRegulator;
    }

    public TipRegulator getIdTipRegulator() {
        return idTipRegulator;
    }

    public void setPresCalcul(BigDecimal presCalcul) {
        this.presCalcul = presCalcul;
    }

    public BigDecimal getPresCalcul() {
        return presCalcul;
    }

    public void setModSD(Boolean modSD) {
        this.modSD = modSD;
    }

    public Boolean getModSD() {
        return modSD;
    }

    public void setExtindereConducta(Boolean extindereConducta) {
        this.extindereConducta = extindereConducta;
    }

    public Boolean getExtindereConducta() {
        return extindereConducta;
    }

    public void setRedimensionareConducta(Boolean redimensionareConducta) {
        this.redimensionareConducta = redimensionareConducta;
    }

    public Boolean getRedimensionareConducta() {
        return redimensionareConducta;
    }

    public void setCorector(Boolean corector) {
        this.corector = corector;
    }

    public Boolean getCorector() {
        return corector;
    }

    public void setRacordNou(Boolean racordNou) {
        this.racordNou = racordNou;
    }

    public Boolean getRacordNou() {
        return racordNou;
    }

    public void setRacordExistent(Boolean racordExistent) {
        this.racordExistent = racordExistent;
    }

    public Boolean getRacordExistent() {
        return racordExistent;
    }

    public void setPostNou(Boolean postNou) {
        this.postNou = postNou;
    }

    public Boolean getPostNou() {
        return postNou;
    }

    public void setPostExistent(Boolean postExistent) {
        this.postExistent = postExistent;
    }

    public Boolean getPostExistent() {
        return postExistent;
    }

    public void setTerenPrivat(Boolean terenPrivat) {
        this.terenPrivat = terenPrivat;
    }

    public Boolean getTerenPrivat() {
        return terenPrivat;
    }

    public void setTerenPublic(Boolean terenPublic) {
        this.terenPublic = terenPublic;
    }

    public Boolean getTerenPublic() {
        return terenPublic;
    }


    public void setIdSiruta(Siruta idSiruta) {
        this.idSiruta = idSiruta;
    }

    public Siruta getIdSiruta() {
        return idSiruta;
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

    public void setIdTipArtera(Artera idTipArtera) {
        this.idTipArtera = idTipArtera;
    }

    public Artera getIdTipArtera() {
        return idTipArtera;
    }

    public void setIdStrazi(Strazi idStrazi) {
        this.idStrazi = idStrazi;
    }

    public Strazi getIdStrazi() {
        return idStrazi;
    }

    public void setIdCereriRacordare(CereriRacordare idCereriRacordare) {
        this.idCereriRacordare = idCereriRacordare;
    }

    public CereriRacordare getIdCereriRacordare() {
        return idCereriRacordare;
    }

    public void setLungimeOlRacord(BigDecimal lungimeOlRacord) {
        this.lungimeOlRacord = lungimeOlRacord;
    }

    public BigDecimal getLungimeOlRacord() {
        return lungimeOlRacord;
    }

    public void setIdDiamOlRacord(DiamOl idDiamOlRacord) {
        this.idDiamOlRacord = idDiamOlRacord;
    }

    public DiamOl getIdDiamOlRacord() {
        return idDiamOlRacord;
    }

    public void setLungimePeRacord(BigDecimal lungimePeRacord) {
        this.lungimePeRacord = lungimePeRacord;
    }

    public BigDecimal getLungimePeRacord() {
        return lungimePeRacord;
    }

    public void setIdDiamPeRacord(DiamPe idDiamPeRacord) {
        this.idDiamPeRacord = idDiamPeRacord;
    }

    public DiamPe getIdDiamPeRacord() {
        return idDiamPeRacord;
    }

    public void setLungimeOlExtindere(BigDecimal lungimeOlExtindere) {
        this.lungimeOlExtindere = lungimeOlExtindere;
    }

    public BigDecimal getLungimeOlExtindere() {
        return lungimeOlExtindere;
    }

    public void setIdDiamOlExtindere(DiamOl idDiamOlExtindere) {
        this.idDiamOlExtindere = idDiamOlExtindere;
    }

    public DiamOl getIdDiamOlExtindere() {
        return idDiamOlExtindere;
    }

    public void setLungimePeExtindere(BigDecimal lungimePeExtindere) {
        this.lungimePeExtindere = lungimePeExtindere;
    }

    public BigDecimal getLungimePeExtindere() {
        return lungimePeExtindere;
    }

    public void setIdDiamPeExtindere(DiamPe idDiamPeExtindere) {
        this.idDiamPeExtindere = idDiamPeExtindere;
    }

    public DiamPe getIdDiamPeExtindere() {
        return idDiamPeExtindere;
    }

    public void setLungimeOlRedimensionare(BigDecimal lungimeOlRedimensionare) {
        this.lungimeOlRedimensionare = lungimeOlRedimensionare;
    }

    public BigDecimal getLungimeOlRedimensionare() {
        return lungimeOlRedimensionare;
    }

    public void setIdDiamOlRedimensionare(DiamOl idDiamOlRedimensionare) {
        this.idDiamOlRedimensionare = idDiamOlRedimensionare;
    }

    public DiamOl getIdDiamOlRedimensionare() {
        return idDiamOlRedimensionare;
    }

    public void setLungimePeRedimensionare(BigDecimal lungimePeRedimensionare) {
        this.lungimePeRedimensionare = lungimePeRedimensionare;
    }

    public BigDecimal getLungimePeRedimensionare() {
        return lungimePeRedimensionare;
    }

    public void setIdDiamPeRedimensionare(DiamPe idDiamPeRedimensionare) {
        this.idDiamPeRedimensionare = idDiamPeRedimensionare;
    }

    public DiamPe getIdDiamPeRedimensionare() {
        return idDiamPeRedimensionare;
    }


}