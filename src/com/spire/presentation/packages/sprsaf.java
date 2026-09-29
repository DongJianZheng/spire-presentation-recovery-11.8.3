/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgpf;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprll;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprref;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxjg;
import com.spire.presentation.packages.sprzwq;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprsaf
implements PublicKey,
sprll {
    private transient sprlem cfr_renamed_2;
    private static final long cfr_renamed_3 = -5617456225328969766L;
    private transient sprgpf cfr_renamed_4;

    @Override
    public String cfr_renamed_3234() {
        return sprref.cfr_renamed_5656(this.cfr_renamed_2);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprsaf) {
            sprsaf sprsaf2 = (sprsaf)arg0;
            try {
                return this.cfr_renamed_2.cfr_renamed_5078(sprsaf2.cfr_renamed_2) && sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprsaf2.cfr_renamed_4.cfr_renamed_91());
            }
            catch (IOException iOException) {
                return false;
            }
        }
        return false;
    }

    @Override
    public String getFormat() {
        return sprzwq.cfr_renamed_9("[q6o:");
    }

    @Override
    public int cfr_renamed_1452() {
        return this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_1452();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprvhm sprvhm2 = sprrif.cfr_renamed_5658(this.cfr_renamed_4);
            return sprvhm2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int hashCode() {
        try {
            return this.cfr_renamed_2.hashCode() + 37 * sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
        }
        catch (IOException iOException) {
            return this.cfr_renamed_2.hashCode();
        }
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
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

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_4 = (sprgpf)sprhyf.cfr_renamed_5660(arg0);
        this.cfr_renamed_2 = sprref.cfr_renamed_5655(this.cfr_renamed_4.cfr_renamed_3234());
    }

    /*
     * WARNING - void declaration
     */
    public sprsaf(sprlem sprlem2, sprgpf sprgpf2) {
        void arg0;
        sprsaf sprsaf2 = this;
        sprsaf2.cfr_renamed_2 = arg0;
        sprsaf2.cfr_renamed_4 = sprgpf2;
    }

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    public sprsaf(sprvhm sprvhm2) throws IOException {
        sprsaf sprsaf2 = this;
        sprsaf2.cfr_renamed_5659(sprvhm2);
    }

    @Override
    public final String getAlgorithm() {
        return sprxjg.cfr_renamed_9("\u001d9\u0016'");
    }
}

