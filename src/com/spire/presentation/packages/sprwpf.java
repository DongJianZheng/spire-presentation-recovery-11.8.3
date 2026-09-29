/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.spreo;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjaf;
import com.spire.presentation.packages.sprjpm;
import com.spire.presentation.packages.sprkgs;
import com.spire.presentation.packages.sprmag;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwtf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprwpf
implements PrivateKey,
spreo {
    private transient spridn cfr_renamed_2;
    private transient sprmag cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public sprmag cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
    }

    @Override
    public sprjaf cfr_renamed_5682() {
        return sprjaf.cfr_renamed_5644(this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_313());
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprwpf) {
            sprwpf sprwpf2 = (sprwpf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprwpf2.cfr_renamed_3.cfr_renamed_91());
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprwpf sprwpf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprwpf2.cfr_renamed_3, sprwpf2.cfr_renamed_2);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public sprwpf(sprcom sprcom2) throws IOException {
        sprwpf sprwpf2 = this;
        sprwpf2.cfr_renamed_5662(sprcom2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    @Override
    public String getFormat() {
        return sprkgs.cfr_renamed_9("Z^IF)-");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprwpf sprwpf2 = this;
        sprwpf2.cfr_renamed_2 = arg0.cfr_renamed_82();
        sprwpf2.cfr_renamed_3 = (sprmag)sprhcg.cfr_renamed_5663(sprcom2);
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

    public sprwpf(sprmag sprmag2) {
        this.cfr_renamed_3 = sprmag2;
    }

    @Override
    public final String getAlgorithm() {
        return sprjpm.cfr_renamed_9("Q\nZ");
    }
}

