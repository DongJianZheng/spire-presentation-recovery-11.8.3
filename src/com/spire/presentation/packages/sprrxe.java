/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprndz;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprref;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprssa;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvif;
import com.spire.presentation.packages.sprzj;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprrxe
implements PublicKey,
sprzj {
    private transient sprlem cfr_renamed_2;
    private transient sprvif cfr_renamed_3;
    private static final long cfr_renamed_4 = 3230324130542413475L;

    /*
     * WARNING - void declaration
     */
    public sprrxe(sprlem sprlem2, sprvif sprvif2) {
        void arg0;
        sprrxe sprrxe2 = this;
        sprrxe2.cfr_renamed_2 = arg0;
        sprrxe2.cfr_renamed_3 = sprvif2;
    }

    public sprrxe(sprvhm sprvhm2) throws IOException {
        sprrxe sprrxe2 = this;
        sprrxe2.cfr_renamed_5659(sprvhm2);
    }

    public int hashCode() {
        return this.cfr_renamed_2.hashCode() + 37 * sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_954());
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_3 = (sprvif)sprhyf.cfr_renamed_5660(arg0);
        this.cfr_renamed_2 = sprref.cfr_renamed_5655(this.cfr_renamed_3.cfr_renamed_3234());
    }

    @Override
    public String getFormat() {
        return sprndz.cfr_renamed_9("us\u0018m\u0014");
    }

    @Override
    public int cfr_renamed_1134() {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1134();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    @Override
    public int cfr_renamed_1452() {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1452();
    }

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    @Override
    public final String getAlgorithm() {
        return sprssa.cfr_renamed_9("\u0002\r\t\u0013\u0017\u0014");
    }

    @Override
    public String cfr_renamed_3234() {
        return sprref.cfr_renamed_5656(this.cfr_renamed_2);
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
        if (arg0 instanceof sprrxe) {
            sprrxe sprrxe2 = (sprrxe)arg0;
            return this.cfr_renamed_2.cfr_renamed_5078(sprrxe2.cfr_renamed_2) && sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_954(), sprrxe2.cfr_renamed_3.cfr_renamed_954());
        }
        return false;
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
}

