/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarg;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcvf;
import com.spire.presentation.packages.sprgef;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.sprhgaa;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjzf;
import com.spire.presentation.packages.sprlg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpdf;
import com.spire.presentation.packages.sprwg;
import com.spire.presentation.packages.sprwtf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprxff
implements PrivateKey,
sprlg {
    private static final long cfr_renamed_2 = 1L;
    private transient spridn cfr_renamed_3;
    private transient sprcvf cfr_renamed_4;

    public sprxff(sprcvf sprcvf2) {
        this.cfr_renamed_4 = sprcvf2;
    }

    public sprxff(sprcom sprcom2) throws IOException {
        sprxff sprxff2 = this;
        sprxff2.cfr_renamed_5662(sprcom2);
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

    public sprcvf cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    @Override
    public String getFormat() {
        return sprarg.cfr_renamed_9("{mhu\b\u001e");
    }

    @Override
    public sprwg cfr_renamed_1157() {
        return new sprpdf(new sprjzf(this.cfr_renamed_4.cfr_renamed_284(), this.cfr_renamed_4.cfr_renamed_1157()));
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

    @Override
    public sprgef cfr_renamed_5682() {
        return sprgef.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprxff sprxff2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprxff2.cfr_renamed_4, sprxff2.cfr_renamed_3);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public final String getAlgorithm() {
        return sprhgaa.cfr_renamed_9("#M8T>^#6");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprxff sprxff2 = this;
        sprxff2.cfr_renamed_3 = arg0.cfr_renamed_82();
        sprxff2.cfr_renamed_4 = (sprcvf)sprhcg.cfr_renamed_5663(sprcom2);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprxff) {
            sprxff sprxff2 = (sprxff)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprxff2.cfr_renamed_4.cfr_renamed_91());
        }
        return false;
    }
}

