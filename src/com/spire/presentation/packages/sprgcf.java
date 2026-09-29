/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbn;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprghg;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlwy;
import com.spire.presentation.packages.sprmj;
import com.spire.presentation.packages.sprnek;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprwag;
import com.spire.presentation.packages.sprwtf;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class sprgcf
implements PrivateKey,
sprmj {
    private transient sprwag cfr_renamed_1;
    private transient spridn cfr_renamed_2;
    private static final long cfr_renamed_3 = 1L;
    private transient sprlem cfr_renamed_4;

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_1;
    }

    @Override
    public byte[] cfr_renamed_5683() {
        return this.cfr_renamed_1.cfr_renamed_5683();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprcom sprcom2;
            sprcom sprcom3;
            if (this.cfr_renamed_1.cfr_renamed_3234() != null) {
                sprcom sprcom4;
                sprgcf sprgcf2 = this;
                sprcom3 = sprcom4 = sprwtf.cfr_renamed_5661(sprgcf2.cfr_renamed_1, sprgcf2.cfr_renamed_2);
                return sprcom3.cfr_renamed_91();
            }
            sprddm sprddm2 = new sprddm(sprbn.cfr_renamed_82, new sprghg(new sprddm(this.cfr_renamed_4)));
            sprcom3 = sprcom2 = new sprcom(sprddm2, new sprfvg(this.cfr_renamed_1.cfr_renamed_5683()), this.cfr_renamed_2);
            return sprcom3.cfr_renamed_91();
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

    public int hashCode() {
        return this.cfr_renamed_4.hashCode() + 37 * sproze.cfr_renamed_95(this.cfr_renamed_1.cfr_renamed_5683());
    }

    @Override
    public final String getAlgorithm() {
        return sprlwy.cfr_renamed_9("6f-\u007f+u6\u001bW\u0003S");
    }

    public sprgcf(sprcom sprcom2) throws IOException {
        sprgcf sprgcf2 = this;
        sprgcf2.cfr_renamed_5662(sprcom2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        sprgcf sprgcf2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = v1.cfr_renamed_82();
        sprgcf2.cfr_renamed_4 = sprghg.cfr_renamed_23(v1.cfr_renamed_1254().cfr_renamed_284()).cfr_renamed_3234().cfr_renamed_593();
        sprgcf2.cfr_renamed_1 = (sprwag)sprhcg.cfr_renamed_5663(sprcom2);
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprgcf) {
            sprgcf sprgcf2 = (sprgcf)arg0;
            return this.cfr_renamed_4.cfr_renamed_5078(sprgcf2.cfr_renamed_4) && sproze.cfr_renamed_92(this.cfr_renamed_1.cfr_renamed_5683(), sprgcf2.cfr_renamed_1.cfr_renamed_5683());
        }
        return false;
    }

    @Override
    public String getFormat() {
        return sprnek.cfr_renamed_9("W0D($C");
    }

    /*
     * WARNING - void declaration
     */
    public sprgcf(sprlem sprlem2, sprwag sprwag2) {
        void arg0;
        sprgcf sprgcf2 = this;
        sprgcf2.cfr_renamed_4 = arg0;
        sprgcf2.cfr_renamed_1 = sprwag2;
    }

    public sprlem cfr_renamed_3234() {
        return this.cfr_renamed_4;
    }
}

