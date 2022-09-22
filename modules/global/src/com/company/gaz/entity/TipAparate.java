package com.company.gaz.entity;

import javax.persistence.Entity;
import javax.persistence.Table;
import java.math.BigDecimal;
import javax.persistence.Column;
import javax.validation.constraints.NotNull;
import com.haulmont.cuba.core.entity.StandardEntity;
import com.haulmont.chile.core.annotations.NamePattern;

@NamePattern("%s %s|denumire,debit")
@Table(name = "GAZ_TIP_APARATE")
@Entity(name = "gaz$TipAparate")
public class TipAparate extends StandardEntity {
    private static final long serialVersionUID = 4058931413423638692L;

    @NotNull
    @Column(name = "DENUMIRE", nullable = false)
    protected String denumire;

    @NotNull
    @Column(name = "DEBIT", nullable = false, precision = 6, scale = 2)
    protected BigDecimal debit;

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDebit(BigDecimal debit) {
        this.debit = debit;
    }

    public BigDecimal getDebit() {
        return debit;
    }


}