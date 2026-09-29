/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccf;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprczf;
import com.spire.presentation.packages.sprdf;
import com.spire.presentation.packages.sprgraa;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwtf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprukf
implements PrivateKey,
sprdf {
    private transient sprczf cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private transient spridn cfr_renamed_4;

    @Override
    public final String getAlgorithm() {
        return sprgraa.cfr_renamed_9("O`Sa");
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_2.cfr_renamed_91());
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
        if (arg0 instanceof sprukf) {
            sprukf sprukf2 = (sprukf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_2.cfr_renamed_91(), sprukf2.cfr_renamed_2.cfr_renamed_91());
        }
        return false;
    }

    public sprukf(sprcom sprcom2) throws IOException {
        sprukf sprukf2 = this;
        sprukf2.cfr_renamed_5662(sprcom2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprukf sprukf2 = this;
        sprukf2.cfr_renamed_4 = arg0.cfr_renamed_82();
        sprukf2.cfr_renamed_2 = (sprczf)sprhcg.cfr_renamed_5663(sprcom2);
    }

    @Override
    public sprccf cfr_renamed_5682() {
        return sprccf.cfr_renamed_5644(this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_313());
    }

    public sprukf(sprczf sprczf2) {
        this.cfr_renamed_2 = sprczf2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprukf sprukf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprukf2.cfr_renamed_2, sprukf2.cfr_renamed_4);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    public sprczf cfr_renamed_5650() {
        return this.cfr_renamed_2;
    }

    @Override
    public String getFormat() {
        return sprgraa.cfr_renamed_9("Q\u007fBg\"\f");
    }
}

