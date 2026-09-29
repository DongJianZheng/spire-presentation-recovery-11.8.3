/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdtr;
import com.spire.presentation.packages.sprgef;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprjzf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprwg;
import com.spire.presentation.packages.sprxan;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class sprpdf
implements sprwg {
    private static final long cfr_renamed_3 = 1L;
    private transient sprjzf cfr_renamed_4;

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_4;
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

    @Override
    public final String getAlgorithm() {
        return sprdtr.cfr_renamed_9("e>~'x-eE");
    }

    @Override
    public sprgef cfr_renamed_5682() {
        return sprgef.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
    }

    @Override
    public String getFormat() {
        return sprxan.cfr_renamed_9("%AH_D");
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
        if (arg0 instanceof sprpdf) {
            sprpdf sprpdf2 = (sprpdf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprpdf2.cfr_renamed_4.cfr_renamed_91());
        }
        return false;
    }

    public sprpdf(sprjzf sprjzf2) {
        this.cfr_renamed_4 = sprjzf2;
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_4 = (sprjzf)sprhyf.cfr_renamed_5660(arg0);
    }

    public sprpdf(sprvhm sprvhm2) throws IOException {
        sprpdf sprpdf2 = this;
        sprpdf2.cfr_renamed_5659(sprvhm2);
    }
}

