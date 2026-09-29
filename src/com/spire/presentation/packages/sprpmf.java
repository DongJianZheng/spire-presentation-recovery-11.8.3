/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgk;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprkdg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprncf;
import com.spire.presentation.packages.sprnkp;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxbf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprpmf
implements sprgk {
    private transient sprkdg cfr_renamed_1;
    private transient String cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private transient byte[] cfr_renamed_4;

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = sprxbf.cfr_renamed_5676(this.cfr_renamed_1);
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    @Override
    public String getFormat() {
        return sprnkp.cfr_renamed_9("<BQ\\]");
    }

    @Override
    public final String getAlgorithm() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5689(sprkdg sprkdg2) {
        void arg0;
        sprpmf sprpmf2 = this;
        sprpmf2.cfr_renamed_1 = arg0;
        sprpmf2.cfr_renamed_2 = sprkoe.cfr_renamed_116(sprkdg2.cfr_renamed_284().cfr_renamed_313());
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

    public sprpmf(sprvhm sprvhm2) throws IOException {
        sprpmf sprpmf2 = this;
        sprpmf2.cfr_renamed_5659(sprvhm2);
    }

    @Override
    public sprncf cfr_renamed_5682() {
        return sprncf.cfr_renamed_5644(this.cfr_renamed_1.cfr_renamed_284().cfr_renamed_313());
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_5689((sprkdg)sprhyf.cfr_renamed_5660(arg0));
    }

    public sprpmf(sprkdg sprkdg2) {
        sprpmf sprpmf2 = this;
        sprpmf2.cfr_renamed_5689(sprkdg2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    public sprkdg cfr_renamed_5650() {
        return this.cfr_renamed_1;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprpmf) {
            sprpmf sprpmf2 = (sprpmf)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), sprpmf2.getEncoded());
        }
        return false;
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.getEncoded());
    }
}

