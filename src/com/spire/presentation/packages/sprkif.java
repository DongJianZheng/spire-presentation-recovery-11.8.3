/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpn;
import com.spire.presentation.packages.sprpuf;
import com.spire.presentation.packages.sprqkh;
import com.spire.presentation.packages.spruxe;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxbf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprkif
implements sprpn {
    private transient byte[] cfr_renamed_1;
    private static final long cfr_renamed_2 = 1L;
    private transient sprpuf cfr_renamed_3;
    private transient String cfr_renamed_4;

    @Override
    public spruxe cfr_renamed_5682() {
        return spruxe.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_5715((sprpuf)sprhyf.cfr_renamed_5660(arg0));
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprkif) {
            sprkif sprkif2 = (sprkif)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), sprkif2.getEncoded());
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

    public sprpuf cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    public sprkif(sprpuf sprpuf2) {
        sprkif sprkif2 = this;
        sprkif2.cfr_renamed_5715(sprpuf2);
    }

    @Override
    public final String getAlgorithm() {
        return this.cfr_renamed_4;
    }

    public sprkif(sprvhm sprvhm2) throws IOException {
        sprkif sprkif2 = this;
        sprkif2.cfr_renamed_5659(sprvhm2);
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.getEncoded());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5715(sprpuf sprpuf2) {
        void arg0;
        sprkif sprkif2 = this;
        sprkif2.cfr_renamed_3 = arg0;
        sprkif2.cfr_renamed_4 = sprkoe.cfr_renamed_116(sprpuf2.cfr_renamed_284().cfr_renamed_313());
    }

    @Override
    public String getFormat() {
        return sprqkh.cfr_renamed_9("j6\u0007(\u000b");
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = sprxbf.cfr_renamed_5676(this.cfr_renamed_3);
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }
}

