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
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|idStrazi,numar")
@Table(name = "GAZ_LOCATII")
@Entity(name = "gaz$Locatii")
public class Locatii extends StandardEntity {
    private static final long serialVersionUID = 469765778729532997L;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_PARTENERI_ID")
    protected Parteneri idParteneri;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TARI_ID")
    protected Tari idTari;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_JUDETE_ID")
    protected Judete idJudete;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_LOCALITATI_ID")
    protected Localitati idLocalitati;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_ARTERA_ID")
    protected Artera idArtera;

    @Lookup(type = LookupType.DROPDOWN, actions = {"lookup", "open"})
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_STRAZI_ID")
    protected Strazi idStrazi;

    @Column(name = "NUMAR", length = 10)
    protected String numar;

    @Column(name = "BLOC", length = 10)
    protected String bloc;

    @Column(name = "SCARA", length = 10)
    protected String scara;

    @Column(name = "ETAJ", length = 10)
    protected String etaj;

    @Column(name = "APARTAMENT", length = 10)
    protected String apartament;

    @NotNull
    @Column(name = "CODPOSTAL", nullable = false, length = 6)
    protected String codpostal;

    @NotNull
    @Column(name = "CORESPONDENTA", nullable = false)
    protected Boolean corespondenta = false;

    @NotNull
    @Column(name = "DOMICILIU", nullable = false)
    protected Boolean domiciliu = false;

    public void setIdParteneri(Parteneri idParteneri) {
        this.idParteneri = idParteneri;
    }

    public Parteneri getIdParteneri() {
        return idParteneri;
    }

    public void setIdTari(Tari idTari) {
        this.idTari = idTari;
    }

    public Tari getIdTari() {
        return idTari;
    }

    public void setIdJudete(Judete idJudete) {
        this.idJudete = idJudete;
    }

    public Judete getIdJudete() {
        return idJudete;
    }

    public void setIdLocalitati(Localitati idLocalitati) {
        this.idLocalitati = idLocalitati;
    }

    public Localitati getIdLocalitati() {
        return idLocalitati;
    }

    public void setIdArtera(Artera idArtera) {
        this.idArtera = idArtera;
    }

    public Artera getIdArtera() {
        return idArtera;
    }

    public void setIdStrazi(Strazi idStrazi) {
        this.idStrazi = idStrazi;
    }

    public Strazi getIdStrazi() {
        return idStrazi;
    }

    public void setNumar(String numar) {
        this.numar = numar;
    }

    public String getNumar() {
        return numar;
    }

    public void setBloc(String bloc) {
        this.bloc = bloc;
    }

    public String getBloc() {
        return bloc;
    }

    public void setScara(String scara) {
        this.scara = scara;
    }

    public String getScara() {
        return scara;
    }

    public void setEtaj(String etaj) {
        this.etaj = etaj;
    }

    public String getEtaj() {
        return etaj;
    }

    public void setApartament(String apartament) {
        this.apartament = apartament;
    }

    public String getApartament() {
        return apartament;
    }

    public void setCodpostal(String codpostal) {
        this.codpostal = codpostal;
    }

    public String getCodpostal() {
        return codpostal;
    }

    public void setCorespondenta(Boolean corespondenta) {
        this.corespondenta = corespondenta;
    }

    public Boolean getCorespondenta() {
        return corespondenta;
    }

    public void setDomiciliu(Boolean domiciliu) {
        this.domiciliu = domiciliu;
    }

    public Boolean getDomiciliu() {
        return domiciliu;
    }


}