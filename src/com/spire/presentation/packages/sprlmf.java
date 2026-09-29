/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpbf;
import com.spire.presentation.packages.sprqbg;
import com.spire.presentation.packages.sprsrf;
import com.spire.presentation.packages.sprum;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprybg;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprlmf
implements PrivateKey,
sprum {
    private transient sprybg cfr_renamed_2;
    private transient spridn cfr_renamed_3;
    private static final long cfr_renamed_4 = 1L;

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprlmf) {
            sprlmf sprlmf2 = (sprlmf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_2.cfr_renamed_91(), sprlmf2.cfr_renamed_2.cfr_renamed_91());
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
            sprlmf sprlmf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprlmf2.cfr_renamed_2, sprlmf2.cfr_renamed_3);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_2.cfr_renamed_91());
    }

    @Override
    public final String getAlgorithm() {
        return sprsrf.cfr_renamed_9("S\"`%j(");
    }

    public sprlmf(sprybg sprybg2) {
        this.cfr_renamed_2 = sprybg2;
    }

    @Override
    public String getFormat() {
        return sprqbg.cfr_renamed_9("`Cs[\u00130");
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
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
    public sprpbf cfr_renamed_5682() {
        return sprpbf.cfr_renamed_5644(this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_313());
    }

    public sprybg cfr_renamed_5650() {
        return this.cfr_renamed_2;
    }

    public sprlmf(sprcom sprcom2) throws IOException {
        sprlmf sprlmf2 = this;
        sprlmf2.cfr_renamed_5662(sprcom2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprlmf sprlmf2 = this;
        sprlmf2.cfr_renamed_3 = arg0.cfr_renamed_82();
        sprlmf2.cfr_renamed_2 = (sprybg)sprhcg.cfr_renamed_5663(sprcom2);
    }
}

