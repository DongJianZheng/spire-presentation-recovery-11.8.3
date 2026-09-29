/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprmwd;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpkg;
import com.spire.presentation.packages.sprsn;
import com.spire.presentation.packages.sprukaa;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprwwe;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprjjf
implements PrivateKey,
sprsn {
    private transient spridn cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private transient sprpkg cfr_renamed_4;

    @Override
    public String getFormat() {
        return sprmwd.cfr_renamed_9("S\u0016@\u000e e");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprjjf sprjjf2 = this;
        sprjjf2.cfr_renamed_2 = arg0.cfr_renamed_82();
        sprjjf2.cfr_renamed_4 = (sprpkg)sprhcg.cfr_renamed_5663(sprcom2);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprjjf) {
            sprjjf sprjjf2 = (sprjjf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprjjf2.cfr_renamed_4.cfr_renamed_91());
        }
        return false;
    }

    @Override
    public final String getAlgorithm() {
        return sprukaa.cfr_renamed_9("\nZ\u0003V");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprjjf sprjjf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprjjf2.cfr_renamed_4, sprjjf2.cfr_renamed_2);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
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

    public sprpkg cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprwwe cfr_renamed_5682() {
        return sprwwe.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    public sprjjf(sprpkg sprpkg2) {
        this.cfr_renamed_4 = sprpkg2;
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
    }

    public sprjjf(sprcom sprcom2) throws IOException {
        sprjjf sprjjf2 = this;
        sprjjf2.cfr_renamed_5662(sprcom2);
    }
}

