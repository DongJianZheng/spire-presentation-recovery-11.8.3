/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreo;
import com.spire.presentation.packages.sprgdg;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprjaf;
import com.spire.presentation.packages.sprmpd;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprvao;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprwnf
implements PublicKey,
spreo {
    private transient sprgdg cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    @Override
    public String getFormat() {
        return sprvao.cfr_renamed_9("pq\u001do\u0011");
    }

    public sprgdg cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprwnf) {
            sprwnf sprwnf2 = (sprwnf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprwnf2.cfr_renamed_3.cfr_renamed_91());
        }
        return false;
    }

    @Override
    public sprjaf cfr_renamed_5682() {
        return sprjaf.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_3 = (sprgdg)sprhyf.cfr_renamed_5660(arg0);
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

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
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

    public sprwnf(sprgdg sprgdg2) {
        this.cfr_renamed_3 = sprgdg2;
    }

    @Override
    public final String getAlgorithm() {
        return sprmpd.cfr_renamed_9("gul");
    }

    public sprwnf(sprvhm sprvhm2) throws IOException {
        sprwnf sprwnf2 = this;
        sprwnf2.cfr_renamed_5659(sprvhm2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }
}

