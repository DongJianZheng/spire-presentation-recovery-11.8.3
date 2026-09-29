/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprciaa;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprgk;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkdg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprncf;
import com.spire.presentation.packages.sprne;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprozf;
import com.spire.presentation.packages.sprpmf;
import com.spire.presentation.packages.sprxbf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprcpf
implements sprne {
    private transient spridn cfr_renamed_0;
    private transient byte[] cfr_renamed_1;
    private static final long cfr_renamed_2 = 1L;
    private transient String cfr_renamed_3;
    private transient sprozf cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    private /* synthetic */ void cfr_renamed_5662(sprcom arg0) throws IOException {
        this.cfr_renamed_5690((sprozf)sprhcg.cfr_renamed_5663(arg0), arg0.cfr_renamed_82());
    }

    @Override
    public final String getAlgorithm() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprgk cfr_renamed_1157() {
        return new sprpmf(new sprkdg(this.cfr_renamed_4.cfr_renamed_284(), this.cfr_renamed_4.cfr_renamed_1157()));
    }

    public sprozf cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5690(sprozf sprozf2, spridn spridn2) {
        void arg0;
        void arg1;
        sprcpf sprcpf2 = this;
        this.cfr_renamed_0 = arg1;
        sprcpf2.cfr_renamed_4 = arg0;
        sprcpf2.cfr_renamed_3 = sprkoe.cfr_renamed_116(sprozf2.cfr_renamed_284().cfr_renamed_313());
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprcpf) {
            sprcpf sprcpf2 = (sprcpf)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), sprcpf2.getEncoded());
        }
        return false;
    }

    @Override
    public sprncf cfr_renamed_5682() {
        return sprncf.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = sprxbf.cfr_renamed_5673(this.cfr_renamed_4, this.cfr_renamed_0);
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    public sprcpf(sprozf sprozf2) {
        sprcpf sprcpf2 = this;
        sprcpf2.cfr_renamed_5690(sprozf2, null);
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
    public String getFormat() {
        return sprciaa.cfr_renamed_9("0j#rC\u0019");
    }

    public sprcpf(sprcom sprcom2) throws IOException {
        sprcpf sprcpf2 = this;
        sprcpf2.cfr_renamed_5662(sprcom2);
    }
}

