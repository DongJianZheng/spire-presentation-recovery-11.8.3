/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgaa;
import com.spire.presentation.packages.sprccf;
import com.spire.presentation.packages.sprdf;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprsdg;
import com.spire.presentation.packages.sprtiha;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprgrf
implements PublicKey,
sprdf {
    private transient sprsdg cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public sprgrf(sprsdg sprsdg2) {
        this.cfr_renamed_3 = sprsdg2;
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

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    @Override
    public sprccf cfr_renamed_5682() {
        return sprccf.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
    }

    @Override
    public String getFormat() {
        return sprbgaa.cfr_renamed_9("\u0001:l$`");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprgrf) {
            sprgrf sprgrf2 = (sprgrf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprgrf2.cfr_renamed_3.cfr_renamed_91());
        }
        return false;
    }

    public sprsdg cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    public sprgrf(sprvhm sprvhm2) throws IOException {
        sprgrf sprgrf2 = this;
        sprgrf2.cfr_renamed_5659(sprvhm2);
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_3 = (sprsdg)sprhyf.cfr_renamed_5660(arg0);
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
    public final String getAlgorithm() {
        return sprtiha.cfr_renamed_9("zRfS");
    }
}

