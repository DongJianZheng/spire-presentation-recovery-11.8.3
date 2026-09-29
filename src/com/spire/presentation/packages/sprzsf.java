/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcmf;
import com.spire.presentation.packages.sprhbg;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprio;
import com.spire.presentation.packages.sprkqa;
import com.spire.presentation.packages.sprmbf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprzsf
implements PublicKey,
sprio {
    private transient sprhbg cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprvhm sprvhm2 = sprrif.cfr_renamed_5658(this.cfr_renamed_3);
            return sprvhm2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return sprkqa.cfr_renamed_9(">\u0015S\u000b_");
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
    }

    public sprzsf(sprhbg sprhbg2) {
        this.cfr_renamed_3 = sprhbg2;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprzsf) {
            sprzsf sprzsf2 = (sprzsf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprzsf2.cfr_renamed_3.cfr_renamed_91());
        }
        return false;
    }

    public sprhbg cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_3 = (sprhbg)sprhyf.cfr_renamed_5660(arg0);
    }

    @Override
    public final String getAlgorithm() {
        return sprcmf.cfr_renamed_9("sGoFqCozPv");
    }

    @Override
    public sprmbf cfr_renamed_5682() {
        return sprmbf.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    public sprzsf(sprvhm sprvhm2) throws IOException {
        sprzsf sprzsf2 = this;
        sprzsf2.cfr_renamed_5659(sprvhm2);
    }
}

