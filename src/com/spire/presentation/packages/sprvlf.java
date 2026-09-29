/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdbd;
import com.spire.presentation.packages.sprgd;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprmhf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtdg;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.spryth;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprvlf
implements PrivateKey,
sprgd {
    private static final long cfr_renamed_2 = 1L;
    private transient sprtdg cfr_renamed_3;
    private transient spridn cfr_renamed_4;

    @Override
    public String getFormat() {
        return spryth.cfr_renamed_9("AWRO2$");
    }

    public sprvlf(sprcom sprcom2) throws IOException {
        sprvlf sprvlf2 = this;
        sprvlf2.cfr_renamed_5662(sprcom2);
    }

    public sprvlf(sprtdg sprtdg2) {
        this.cfr_renamed_3 = sprtdg2;
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

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprvlf) {
            sprvlf sprvlf2 = (sprvlf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprvlf2.cfr_renamed_3.cfr_renamed_91());
        }
        return false;
    }

    public sprtdg cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    @Override
    public sprmhf cfr_renamed_5682() {
        return sprmhf.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprvlf sprvlf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprvlf2.cfr_renamed_3, sprvlf2.cfr_renamed_4);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprvlf sprvlf2 = this;
        sprvlf2.cfr_renamed_4 = arg0.cfr_renamed_82();
        sprvlf2.cfr_renamed_3 = (sprtdg)sprhcg.cfr_renamed_5663(sprcom2);
    }

    @Override
    public final String getAlgorithm() {
        return sprdbd.cfr_renamed_9("n^GHG");
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
    }
}

