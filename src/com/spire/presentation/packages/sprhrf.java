/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazaa;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprod;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpwf;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprsvda;
import com.spire.presentation.packages.spruff;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprhrf
implements PublicKey,
sprod {
    private transient sprpwf cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

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
    public spruff cfr_renamed_5682() {
        return spruff.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
    }

    public sprpwf cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    public sprhrf(sprvhm sprvhm2) throws IOException {
        sprhrf sprhrf2 = this;
        sprhrf2.cfr_renamed_5659(sprvhm2);
    }

    @Override
    public String getFormat() {
        return sprsvda.cfr_renamed_9("r\u000e\u001f\u0010\u0013");
    }

    @Override
    public final String getAlgorithm() {
        return sprazaa.cfr_renamed_9("\u001d\u0006\u0001\u0007\u001f\u0002\u0001;>7");
    }

    public sprhrf(sprpwf sprpwf2) {
        this.cfr_renamed_3 = sprpwf2;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprhrf) {
            sprhrf sprhrf2 = (sprhrf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprhrf2.cfr_renamed_3.cfr_renamed_91());
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

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_3 = (sprpwf)sprhyf.cfr_renamed_5660(arg0);
    }
}

