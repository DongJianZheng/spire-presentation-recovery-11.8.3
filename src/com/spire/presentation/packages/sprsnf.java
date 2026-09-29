/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprah;
import com.spire.presentation.packages.spraif;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spribf;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjnn;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqe;
import com.spire.presentation.packages.sprxbf;
import com.spire.presentation.packages.sprxfg;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprsnf
implements sprah {
    private transient String cfr_renamed_0;
    private transient spridn cfr_renamed_1;
    private static final long cfr_renamed_2 = 1L;
    private transient byte[] cfr_renamed_3;
    private transient sprxfg cfr_renamed_4;

    public sprsnf(sprxfg sprxfg2) {
        sprsnf sprsnf2 = this;
        sprsnf2.cfr_renamed_5718(sprxfg2, null);
    }

    public sprsnf(sprcom sprcom2) throws IOException {
        sprsnf sprsnf2 = this;
        sprsnf2.cfr_renamed_5662(sprcom2);
    }

    @Override
    public String getFormat() {
        return sprjnn.cfr_renamed_9("\u000f1\u001c)|B");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprsnf) {
            sprsnf sprsnf2 = (sprsnf)arg0;
            return sproze.cfr_renamed_92(this.getEncoded(), sprsnf2.getEncoded());
        }
        return false;
    }

    @Override
    public sprqe cfr_renamed_1157() {
        return new spraif(this.cfr_renamed_4.cfr_renamed_130());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    public sprxfg cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.getEncoded());
    }

    @Override
    public spribf cfr_renamed_5682() {
        return spribf.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    @Override
    public byte[] getEncoded() {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = sprxbf.cfr_renamed_5673(this.cfr_renamed_4, this.cfr_renamed_1);
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5718(sprxfg sprxfg2, spridn spridn2) {
        void arg0;
        void arg1;
        sprsnf sprsnf2 = this;
        this.cfr_renamed_1 = arg1;
        sprsnf2.cfr_renamed_4 = arg0;
        sprsnf2.cfr_renamed_0 = sprkoe.cfr_renamed_116(sprxfg2.cfr_renamed_284().cfr_renamed_313());
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

    private /* synthetic */ void cfr_renamed_5662(sprcom arg0) throws IOException {
        this.cfr_renamed_5718((sprxfg)sprhcg.cfr_renamed_5663(arg0), arg0.cfr_renamed_82());
    }

    @Override
    public final String getAlgorithm() {
        return this.cfr_renamed_0;
    }
}

