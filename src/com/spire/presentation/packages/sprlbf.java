/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprlvf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprue;
import com.spire.presentation.packages.sprvdf;
import com.spire.presentation.packages.sprvei;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxno;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprlbf
implements PublicKey,
sprue {
    private static final long cfr_renamed_3 = 1L;
    private transient sprlvf cfr_renamed_4;

    @Override
    public final String getAlgorithm() {
        return sprvei.cfr_renamed_9("U\u0012D\u0016T");
    }

    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (arg0 instanceof sprlbf) {
            sprlbf sprlbf2 = (sprlbf)arg0;
            return sproze.cfr_renamed_92(this.cfr_renamed_4.cfr_renamed_91(), sprlbf2.cfr_renamed_4.cfr_renamed_91());
        }
        return false;
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

    public sprlbf(sprlvf sprlvf2) {
        this.cfr_renamed_4 = sprlvf2;
    }

    public sprlbf(sprvhm sprvhm2) throws IOException {
        sprlbf sprlbf2 = this;
        sprlbf2.cfr_renamed_5659(sprvhm2);
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }

    @Override
    public String getFormat() {
        return sprxno.cfr_renamed_9("9\u0000T\u001eX");
    }

    public int hashCode() {
        return sproze.cfr_renamed_95(this.cfr_renamed_4.cfr_renamed_91());
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

    public sprlvf cfr_renamed_5650() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_5659(sprvhm arg0) throws IOException {
        this.cfr_renamed_4 = (sprlvf)sprhyf.cfr_renamed_5660(arg0);
    }

    @Override
    public sprvdf cfr_renamed_5682() {
        return sprvdf.cfr_renamed_5644(this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_313());
    }
}

