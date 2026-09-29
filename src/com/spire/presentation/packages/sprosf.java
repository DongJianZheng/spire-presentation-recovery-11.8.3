/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbk;
import com.spire.presentation.packages.sprcnf;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprneg;
import com.spire.presentation.packages.sprnm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbf;
import com.spire.presentation.packages.sprtiz;
import com.spire.presentation.packages.sprwtf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprosf
implements sprbk {
    private transient sprneg cfr_renamed_1;
    private transient spridn cfr_renamed_2;
    private transient String cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprosf) {
            sprosf sprosf2 = (sprosf)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), sprosf2.getEncoded());
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    @Override
    public sprnm cfr_renamed_1157() {
        return new sprcnf(this.cfr_renamed_1.cfr_renamed_130());
    }

    public sprosf(sprcom sprcom2) throws IOException {
        sprosf sprosf2 = this;
        sprosf2.cfr_renamed_5662(sprcom2);
    }

    @Override
    public final String getAlgorithm() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprosf sprosf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprosf2.cfr_renamed_1, sprosf2.cfr_renamed_2);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public sprqbf cfr_renamed_5682() {
        return sprqbf.cfr_renamed_5644(this.cfr_renamed_1.cfr_renamed_284().cfr_renamed_313());
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

    public sprneg cfr_renamed_5650() {
        return this.cfr_renamed_1;
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.getEncoded());
    }

    /*
     * WARNING - void declaration
     */
    public sprosf(sprneg sprneg2) {
        void arg0;
        sprosf sprosf2 = this;
        sprosf2.cfr_renamed_1 = arg0;
        sprosf2.cfr_renamed_3 = sprkoe.cfr_renamed_116(sprneg2.cfr_renamed_284().cfr_renamed_313());
    }

    @Override
    public String getFormat() {
        return sprtiz.cfr_renamed_9("#<0$PO");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprosf sprosf2 = this;
        sprosf2.cfr_renamed_2 = arg0.cfr_renamed_82();
        sprosf2.cfr_renamed_1 = (sprneg)sprhcg.cfr_renamed_5663(sprcom2);
        this.cfr_renamed_3 = sprkoe.cfr_renamed_116(this.cfr_renamed_1.cfr_renamed_284().cfr_renamed_313());
    }
}

