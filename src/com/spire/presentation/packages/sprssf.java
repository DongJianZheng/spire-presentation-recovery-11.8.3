/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprmbea;
import com.spire.presentation.packages.sprmd;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvzs;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprwzf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprssf
implements sprmd {
    private static final long cfr_renamed_2 = 1L;
    private transient sprwzf cfr_renamed_3;
    private transient spridn cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprssf sprssf2 = this;
        sprssf2.cfr_renamed_4 = arg0.cfr_renamed_82();
        sprssf2.cfr_renamed_3 = (sprwzf)sprhcg.cfr_renamed_5663(sprcom2);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprssf)) {
            return false;
        }
        sprssf sprssf2 = (sprssf)arg0;
        return sproze.cfr_renamed_5244(this.cfr_renamed_3.cfr_renamed_5698(), sprssf2.cfr_renamed_3.cfr_renamed_5698());
    }

    @Override
    public short[] cfr_renamed_5699() {
        return this.cfr_renamed_3.cfr_renamed_5698();
    }

    public int hashCode() {
        return sproze.cfr_renamed_518(this.cfr_renamed_3.cfr_renamed_5698());
    }

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    public sprssf(sprwzf sprwzf2) {
        this.cfr_renamed_3 = sprwzf2;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprssf sprssf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprssf2.cfr_renamed_3, sprssf2.cfr_renamed_4);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return sprvzs.cfr_renamed_9("\u0005#\u0016;vP");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    public sprssf(sprcom sprcom2) throws IOException {
        sprssf sprssf2 = this;
        sprssf2.cfr_renamed_5662(sprcom2);
    }

    @Override
    public final String getAlgorithm() {
        return sprmbea.cfr_renamed_9("mc");
    }
}

