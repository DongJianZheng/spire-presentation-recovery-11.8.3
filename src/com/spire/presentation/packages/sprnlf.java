/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlhk;
import com.spire.presentation.packages.sprod;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruff;
import com.spire.presentation.packages.sprwgaa;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprxxf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprnlf
implements PrivateKey,
sprod {
    private transient spridn cfr_renamed_2;
    private transient sprxxf cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
    }

    public sprnlf(sprxxf sprxxf2) {
        this.cfr_renamed_3 = sprxxf2;
    }

    @Override
    public String getFormat() {
        return sprwgaa.cfr_renamed_9("Z\u001eI\u0006)m");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprnlf) {
            sprnlf sprnlf2 = (sprnlf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprnlf2.cfr_renamed_3.cfr_renamed_91());
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprnlf sprnlf2 = this;
        sprnlf2.cfr_renamed_2 = arg0.cfr_renamed_82();
        sprnlf2.cfr_renamed_3 = (sprxxf)sprhcg.cfr_renamed_5663(sprcom2);
    }

    public sprnlf(sprcom sprcom2) throws IOException {
        sprnlf sprnlf2 = this;
        sprnlf2.cfr_renamed_5662(sprcom2);
    }

    @Override
    public spruff cfr_renamed_5682() {
        return spruff.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    @Override
    public final String getAlgorithm() {
        return sprlhk.cfr_renamed_9("nYrXl]rdMh");
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

    public sprxxf cfr_renamed_5650() {
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
            sprnlf sprnlf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprnlf2.cfr_renamed_3, sprnlf2.cfr_renamed_2);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }
}

