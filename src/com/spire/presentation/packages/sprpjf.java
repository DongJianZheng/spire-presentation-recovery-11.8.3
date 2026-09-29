/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdwf;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkif;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpn;
import com.spire.presentation.packages.sprpuf;
import com.spire.presentation.packages.sprshl;
import com.spire.presentation.packages.sprtd;
import com.spire.presentation.packages.spruxe;
import com.spire.presentation.packages.sprxbf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprpjf
implements sprtd {
    private transient String cfr_renamed_0;
    private static final long cfr_renamed_1 = 1L;
    private transient spridn cfr_renamed_2;
    private transient sprdwf cfr_renamed_3;
    private transient byte[] cfr_renamed_4;

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = sprxbf.cfr_renamed_5673(this.cfr_renamed_3, this.cfr_renamed_2);
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public spruxe cfr_renamed_5682() {
        return spruxe.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    @Override
    public String getFormat() {
        return sprshl.cfr_renamed_9("\u001e=\r%mN");
    }

    @Override
    public final String getAlgorithm() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    public sprpjf(sprdwf sprdwf2) {
        sprpjf sprpjf2 = this;
        sprpjf2.cfr_renamed_5716(sprdwf2, null);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    public sprpjf(sprcom sprcom2) throws IOException {
        sprpjf sprpjf2 = this;
        sprpjf2.cfr_renamed_5662(sprcom2);
    }

    public sprdwf cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_5662(sprcom arg0) throws IOException {
        this.cfr_renamed_5716((sprdwf)sprhcg.cfr_renamed_5663(arg0), arg0.cfr_renamed_82());
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.getEncoded());
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprpjf) {
            sprpjf sprpjf2 = (sprpjf)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), sprpjf2.getEncoded());
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5716(sprdwf sprdwf2, spridn spridn2) {
        void arg0;
        void arg1;
        sprpjf sprpjf2 = this;
        this.cfr_renamed_2 = arg1;
        sprpjf2.cfr_renamed_3 = arg0;
        sprpjf2.cfr_renamed_0 = sprkoe.cfr_renamed_116(sprdwf2.cfr_renamed_284().cfr_renamed_313());
    }

    @Override
    public sprpn cfr_renamed_1157() {
        return new sprkif(new sprpuf(this.cfr_renamed_3.cfr_renamed_284(), this.cfr_renamed_3.cfr_renamed_1157()));
    }
}

