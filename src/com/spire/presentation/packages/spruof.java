/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprehf;
import com.spire.presentation.packages.sprfhg;
import com.spire.presentation.packages.sprhcg;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsno;
import com.spire.presentation.packages.sprwtf;
import com.spire.presentation.packages.sprxh;
import com.spire.presentation.packages.spryeo;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PrivateKey;

public class spruof
implements PrivateKey,
sprxh {
    private static final long cfr_renamed_2 = 1L;
    private transient spridn cfr_renamed_3;
    private transient sprfhg cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            spruof spruof2 = this;
            sprcom sprcom2 = sprwtf.cfr_renamed_5661(spruof2.cfr_renamed_4, spruof2.cfr_renamed_3);
            return sprcom2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public sprehf cfr_renamed_5682() {
        return sprehf.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
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
    public String getFormat() {
        return spryeo.cfr_renamed_9("$m7uW\u001e");
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
    }

    public spruof(sprfhg sprfhg2) {
        this.cfr_renamed_4 = sprfhg2;
    }

    @Override
    public final String getAlgorithm() {
        return sprsno.cfr_renamed_9("i\u007fiw");
    }

    public sprfhg cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof spruof) {
            spruof spruof2 = (spruof)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), spruof2.cfr_renamed_4.cfr_renamed_91());
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_5662(sprcom sprcom2) throws IOException {
        void arg0;
        spruof spruof2 = this;
        spruof2.cfr_renamed_3 = arg0.cfr_renamed_82();
        spruof2.cfr_renamed_4 = (sprfhg)sprhcg.cfr_renamed_5663(sprcom2);
    }

    public spruof(sprcom sprcom2) throws IOException {
        spruof spruof2 = this;
        spruof2.cfr_renamed_5662(sprcom2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5662(sprcom.cfr_renamed_23(byArray));
    }
}

