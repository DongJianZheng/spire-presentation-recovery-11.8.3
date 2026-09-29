/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceaa;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprkeg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqbf;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxbf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprcnf
implements sprnm {
    private transient sprkeg cfr_renamed_1;
    private static final long cfr_renamed_2 = 1L;
    private transient String cfr_renamed_3;
    private transient byte[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2291(ObjectOutputStream objectOutputStream) throws IOException {
        void arg0;
        void v0 = arg0;
        v0.defaultWriteObject();
        v0.writeObject(this.getEncoded());
    }

    @Override
    public sprqbf cfr_renamed_5682() {
        return sprqbf.cfr_renamed_5644(this.cfr_renamed_1.cfr_renamed_284().cfr_renamed_313());
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.getEncoded());
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_5714((sprkeg)sprhyf.cfr_renamed_5660(arg0));
    }

    public sprkeg cfr_renamed_5650() {
        return this.cfr_renamed_1;
    }

    public sprcnf(sprvhm sprvhm2) throws IOException {
        sprcnf sprcnf2 = this;
        sprcnf2.cfr_renamed_5659(sprvhm2);
    }

    @Override
    public String getFormat() {
        return sprceaa.cfr_renamed_9("1\u0000\\\u001eP");
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = sprxbf.cfr_renamed_5676(this.cfr_renamed_1);
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5714(sprkeg sprkeg2) {
        void arg0;
        sprcnf sprcnf2 = this;
        sprcnf2.cfr_renamed_1 = arg0;
        sprcnf2.cfr_renamed_3 = sprkoe.cfr_renamed_116(sprkeg2.cfr_renamed_284().cfr_renamed_313());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    @Override
    public final String getAlgorithm() {
        return this.cfr_renamed_3;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprcnf) {
            sprcnf sprcnf2 = (sprcnf)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), sprcnf2.getEncoded());
        }
        return false;
    }

    public sprcnf(sprkeg sprkeg2) {
        sprcnf sprcnf2 = this;
        sprcnf2.cfr_renamed_5714(sprkeg2);
    }
}

