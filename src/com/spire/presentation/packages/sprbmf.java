/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgd;
import com.spire.presentation.packages.sprhhb;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprmhf;
import com.spire.presentation.packages.sprmzf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxuy;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprbmf
implements PublicKey,
sprgd {
    private static final long cfr_renamed_3 = 1L;
    private transient sprmzf cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprvhm sprvhm2 = sprrif.cfr_renamed_5658(this.cfr_renamed_4);
            return sprvhm2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    public sprmzf cfr_renamed_5650() {
        return this.cfr_renamed_4;
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

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
    }

    @Override
    public String getFormat() {
        return sprhhb.cfr_renamed_9("n6\u0003(\u000f");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprbmf) {
            sprbmf sprbmf2 = (sprbmf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprbmf2.cfr_renamed_4.cfr_renamed_91());
        }
        return false;
    }

    public sprbmf(sprvhm sprvhm2) throws IOException {
        sprbmf sprbmf2 = this;
        sprbmf2.cfr_renamed_5659(sprvhm2);
    }

    public sprbmf(sprmzf sprmzf2) {
        this.cfr_renamed_4 = sprmzf2;
    }

    @Override
    public sprmhf cfr_renamed_5682() {
        return sprmhf.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_4 = (sprmzf)sprhyf.cfr_renamed_5660(arg0);
    }

    @Override
    public final String getAlgorithm() {
        return sprxuy.cfr_renamed_9("ZLsZs");
    }
}

