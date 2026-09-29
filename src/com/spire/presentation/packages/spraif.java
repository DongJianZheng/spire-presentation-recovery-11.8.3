/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.spribf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprouba;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpig;
import com.spire.presentation.packages.sprqe;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxbf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class spraif
implements sprqe {
    private static final long cfr_renamed_1 = 1L;
    private transient byte[] cfr_renamed_2;
    private transient String cfr_renamed_3;
    private transient sprpig cfr_renamed_4;

    public spraif(sprpig sprpig2) {
        spraif spraif2 = this;
        spraif2.cfr_renamed_5717(sprpig2);
    }

    public spraif(sprvhm sprvhm2) throws IOException {
        spraif spraif2 = this;
        spraif2.cfr_renamed_5659(sprvhm2);
    }

    @Override
    public String getFormat() {
        return sprouba.cfr_renamed_9("S2>,2");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof spraif) {
            spraif spraif2 = (spraif)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), spraif2.getEncoded());
        }
        return false;
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_5717((sprpig)sprhyf.cfr_renamed_5660(arg0));
    }

    @Override
    public spribf cfr_renamed_5682() {
        return spribf.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5717(sprpig sprpig2) {
        void arg0;
        spraif spraif2 = this;
        spraif2.cfr_renamed_4 = arg0;
        spraif2.cfr_renamed_3 = sprkoe.cfr_renamed_116(sprpig2.cfr_renamed_284().cfr_renamed_313());
    }

    public sprpig cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    @Override
    public final String getAlgorithm() {
        return this.cfr_renamed_3;
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
        return sproze.cfr_renamed_95(this.getEncoded());
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_2 == null) {
            this.cfr_renamed_2 = sprxbf.cfr_renamed_5676(this.cfr_renamed_4);
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }
}

