/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpbf;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprrkp;
import com.spire.presentation.packages.sprtvf;
import com.spire.presentation.packages.sprum;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxlh;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprmlf
implements PublicKey,
sprum {
    private transient sprtvf cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    @Override
    public sprpbf cfr_renamed_5682() {
        return sprpbf.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
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
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprmlf) {
            sprmlf sprmlf2 = (sprmlf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprmlf2.cfr_renamed_3.cfr_renamed_91());
        }
        return false;
    }

    @Override
    public final String getAlgorithm() {
        return sprrkp.cfr_renamed_9("SP`WjZ");
    }

    public sprmlf(sprvhm sprvhm2) throws IOException {
        sprmlf sprmlf2 = this;
        sprmlf2.cfr_renamed_5659(sprvhm2);
    }

    public sprmlf(sprtvf sprtvf2) {
        this.cfr_renamed_3 = sprtvf2;
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_3 = (sprtvf)sprhyf.cfr_renamed_5660(arg0);
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
        return sprxlh.cfr_renamed_9("?BR\\^");
    }

    public sprtvf cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }
}

