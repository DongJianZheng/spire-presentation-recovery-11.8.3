/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfg;
import com.spire.presentation.packages.sprehf;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprmdj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxh;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprejf
implements PublicKey,
sprxh {
    private transient sprcfg cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
    }

    @Override
    public final String getAlgorithm() {
        return sprsqaa.cfr_renamed_9("3\u007f3w");
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
        return sprmdj.cfr_renamed_9("8BU\\Y");
    }

    public sprejf(sprvhm sprvhm2) throws IOException {
        sprejf sprejf2 = this;
        sprejf2.cfr_renamed_5659(sprvhm2);
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_3 = (sprcfg)sprhyf.cfr_renamed_5660(arg0);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprejf) {
            sprejf sprejf2 = (sprejf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprejf2.cfr_renamed_3.cfr_renamed_91());
        }
        return false;
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

    public sprcfg cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    public sprejf(sprcfg sprcfg2) {
        this.cfr_renamed_3 = sprcfg2;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    @Override
    public sprehf cfr_renamed_5682() {
        return sprehf.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }
}

