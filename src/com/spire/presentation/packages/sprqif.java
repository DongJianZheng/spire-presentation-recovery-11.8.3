/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprjdz;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprrn;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.spryvf;
import com.spire.presentation.packages.sprzok;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprqif
implements sprrn {
    private static final long cfr_renamed_3 = 1L;
    private transient spryvf cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getFormat() {
        return sprzok.cfr_renamed_9("Y;4%8");
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_4 = (spryvf)sprhyf.cfr_renamed_5660(arg0);
    }

    @Override
    public final String getAlgorithm() {
        return sprjdz.cfr_renamed_9("PP");
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_5697());
    }

    @Override
    public byte[] cfr_renamed_5540() {
        return this.cfr_renamed_4.cfr_renamed_5697();
    }

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

    public sprqif(spryvf spryvf2) {
        this.cfr_renamed_4 = spryvf2;
    }

    public sprqif(sprvhm sprvhm2) throws IOException {
        sprqif sprqif2 = this;
        sprqif2.cfr_renamed_5659(sprvhm2);
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprqif)) {
            return false;
        }
        sprqif sprqif2 = (sprqif)arg0;
        return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_5697(), sprqif2.cfr_renamed_4.cfr_renamed_5697());
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
}

