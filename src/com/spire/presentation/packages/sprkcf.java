/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfc;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdo;
import com.spire.presentation.packages.spremf;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprref;
import com.spire.presentation.packages.sprrog;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprzbp;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprkcf
implements PrivateKey,
sprdo {
    private transient spridn cfr_renamed_1;
    private static final long cfr_renamed_2 = 8568701712864512338L;
    private transient spremf cfr_renamed_3;
    private transient sprlem cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprkcf sprkcf2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(sprkcf2.cfr_renamed_3, sprkcf2.cfr_renamed_1);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public sprdo cfr_renamed_3249(int arg0) {
        sprkcf sprkcf2 = this;
        return new sprkcf(sprkcf2.cfr_renamed_4, sprkcf2.cfr_renamed_3.cfr_renamed_3249(arg0));
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

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    public sprlem cfr_renamed_5651() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprkcf sprkcf2 = this;
        sprkcf2.cfr_renamed_1 = arg0.cfr_renamed_82();
        sprkcf2.cfr_renamed_4 = sprrog.cfr_renamed_23(sprcom2.cfr_renamed_1254().cfr_renamed_284()).cfr_renamed_3234().cfr_renamed_593();
        sprkcf2.cfr_renamed_3 = (spremf)sprhcg.cfr_renamed_5663((sprcom)arg0);
    }

    @Override
    public String getFormat() {
        return sprbfc.cfr_renamed_9("MX^@>+");
    }

    @Override
    public long cfr_renamed_5649() {
        return this.cfr_renamed_3.cfr_renamed_5649();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    @Override
    public int cfr_renamed_1452() {
        return this.cfr_renamed_3.cfr_renamed_284().cfr_renamed_1452();
    }

    @Override
    public long cfr_renamed_320() {
        if (this.cfr_renamed_5649() == 0L) {
            throw new IllegalStateException(sprzbp.cfr_renamed_9("oH}\raUlLq^pH`"));
        }
        return this.cfr_renamed_3.cfr_renamed_320();
    }

    /*
     * WARNING - void declaration
     */
    public sprkcf(sprlem sprlem2, spremf spremf2) {
        void arg0;
        sprkcf sprkcf2 = this;
        sprkcf2.cfr_renamed_4 = arg0;
        sprkcf2.cfr_renamed_3 = spremf2;
    }

    @Override
    public String cfr_renamed_3234() {
        return sprref.cfr_renamed_5656(this.cfr_renamed_4);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprkcf) {
            sprkcf sprkcf2 = (sprkcf)arg0;
            return this.cfr_renamed_4.cfr_renamed_5078(sprkcf2.cfr_renamed_4) && sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_954(), sprkcf2.cfr_renamed_3.cfr_renamed_954());
        }
        return false;
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() + 37 * sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_954());
    }

    public sprkcf(sprcom sprcom2) throws IOException {
        sprkcf sprkcf2 = this;
        sprkcf2.cfr_renamed_5662(sprcom2);
    }

    @Override
    public String getAlgorithm() {
        return sprbfc.cfr_renamed_9("E^N@");
    }
}

