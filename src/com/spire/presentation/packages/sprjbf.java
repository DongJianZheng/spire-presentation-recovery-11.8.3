/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprgyz;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpof;
import com.spire.presentation.packages.sprref;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.spryg;
import com.spire.presentation.packages.spryog;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprjbf
implements PrivateKey,
spryg {
    private transient spridn cfr_renamed_1;
    private transient sprpof cfr_renamed_2;
    private static final long cfr_renamed_3 = 7682140473044521395L;
    private transient sprlem cfr_renamed_4;

    public sprjbf(sprcom sprcom2) throws IOException {
        sprjbf sprjbf2 = this;
        sprjbf2.cfr_renamed_5662(sprcom2);
    }

    @Override
    public long cfr_renamed_320() {
        if (this.cfr_renamed_5649() == 0L) {
            throw new IllegalStateException(sprgyz.cfr_renamed_9("\u001bz\t?\u0015g\u0018~\u0005l\u0004z\u0014"));
        }
        return this.cfr_renamed_2.cfr_renamed_320();
    }

    /*
     * WARNING - void declaration
     */
    public sprjbf(sprlem sprlem2, sprpof sprpof2) {
        void arg0;
        sprjbf sprjbf2 = this;
        sprjbf2.cfr_renamed_4 = arg0;
        sprjbf2.cfr_renamed_2 = sprpof2;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprjbf) {
            sprjbf sprjbf2 = (sprjbf)arg0;
            return this.cfr_renamed_4.cfr_renamed_5078(sprjbf2.cfr_renamed_4) && sproze.cfr_renamed_92(this.cfr_renamed_2.cfr_renamed_954(), sprjbf2.cfr_renamed_2.cfr_renamed_954());
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
            sprjbf sprjbf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprjbf2.cfr_renamed_2, sprjbf2.cfr_renamed_1);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String cfr_renamed_3234() {
        return sprref.cfr_renamed_5656(this.cfr_renamed_4);
    }

    @Override
    public String getFormat() {
        return sprkwe.cfr_renamed_9("L\u000b_\u0013?x");
    }

    public sprlem cfr_renamed_5651() {
        return this.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_1452() {
        return this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_1452();
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() + 37 * sproze.cfr_renamed_95(this.cfr_renamed_2.cfr_renamed_954());
    }

    @Override
    public int cfr_renamed_1134() {
        return this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_1134();
    }

    @Override
    public long cfr_renamed_5649() {
        return this.cfr_renamed_2.cfr_renamed_5649();
    }

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_2;
    }

    @Override
    public String getAlgorithm() {
        return sprgyz.cfr_renamed_9("G=L#R$");
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

    @Override
    public spryg cfr_renamed_3249(int arg0) {
        sprjbf sprjbf2 = this;
        return new sprjbf(sprjbf2.cfr_renamed_4, sprjbf2.cfr_renamed_2.cfr_renamed_3249(arg0));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprjbf sprjbf2 = this;
        sprjbf2.cfr_renamed_1 = arg0.cfr_renamed_82();
        sprjbf2.cfr_renamed_4 = spryog.cfr_renamed_23(sprcom2.cfr_renamed_1254().cfr_renamed_284()).cfr_renamed_3234().cfr_renamed_593();
        sprjbf2.cfr_renamed_2 = (sprpof)sprhcg.cfr_renamed_5663((sprcom)arg0);
    }
}

