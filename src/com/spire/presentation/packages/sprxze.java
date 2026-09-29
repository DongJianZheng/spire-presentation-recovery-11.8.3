/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprctl;
import com.spire.presentation.packages.sprfvo;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrbg;
import com.spire.presentation.packages.sprue;
import com.spire.presentation.packages.sprvdf;
import com.spire.presentation.packages.sprwtf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprxze
implements PrivateKey,
sprue {
    private transient spridn cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private transient sprrbg cfr_renamed_4;

    public sprxze(sprrbg sprrbg2) {
        this.cfr_renamed_4 = sprrbg2;
    }

    public sprrbg cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprxze) {
            sprxze sprxze2 = (sprxze)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprxze2.cfr_renamed_4.cfr_renamed_91());
        }
        return false;
    }

    public sprxze(sprcom sprcom2) throws IOException {
        sprxze sprxze2 = this;
        sprxze2.cfr_renamed_5662(sprcom2);
    }

    @Override
    public final String getAlgorithm() {
        return sprctl.cfr_renamed_9("\u0004O\u0015K\u0005");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprxze sprxze2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprxze2.cfr_renamed_4, sprxze2.cfr_renamed_2);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return sprfvo.cfr_renamed_9(",f?~_\u0015");
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

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
    }

    @Override
    public sprvdf cfr_renamed_5682() {
        return sprvdf.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprxze sprxze2 = this;
        sprxze2.cfr_renamed_2 = arg0.cfr_renamed_82();
        sprxze2.cfr_renamed_4 = (sprrbg)sprhcg.cfr_renamed_5663(sprcom2);
    }
}

