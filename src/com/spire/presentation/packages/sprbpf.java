/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprio;
import com.spire.presentation.packages.sprmbf;
import com.spire.presentation.packages.sprmuf;
import com.spire.presentation.packages.sprolj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprxik;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprbpf
implements PrivateKey,
sprio {
    private transient spridn cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private transient sprmuf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    public sprmuf cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    @Override
    public final String getAlgorithm() {
        return sprxik.cfr_renamed_9("r)n(p-n\u0014Q\u0018");
    }

    @Override
    public sprmbf cfr_renamed_5682() {
        return sprmbf.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprbpf sprbpf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprbpf2.cfr_renamed_4, sprbpf2.cfr_renamed_2);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public sprbpf(sprcom sprcom2) throws IOException {
        sprbpf sprbpf2 = this;
        sprbpf2.cfr_renamed_5662(sprcom2);
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
    }

    public sprbpf(sprmuf sprmuf2) {
        this.cfr_renamed_4 = sprmuf2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprbpf sprbpf2 = this;
        sprbpf2.cfr_renamed_2 = arg0.cfr_renamed_82();
        sprbpf2.cfr_renamed_4 = (sprmuf)sprhcg.cfr_renamed_5663(sprcom2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    @Override
    public String getFormat() {
        return sprolj.cfr_renamed_9("\u001c\u007f\u000fgo\f");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprbpf) {
            sprbpf sprbpf2 = (sprbpf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprbpf2.cfr_renamed_4.cfr_renamed_91());
        }
        return false;
    }
}

