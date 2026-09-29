/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprhyf;
import com.spire.presentation.packages.sprldg;
import com.spire.presentation.packages.sprmpd;
import com.spire.presentation.packages.sprodg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrif;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvuca;
import com.spire.presentation.packages.sprxe;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.security.PublicKey;

public class sprdpf
implements PublicKey,
sprxe {
    private transient sprodg cfr_renamed_3;
    private static final long cfr_renamed_4 = -5617456225328969766L;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        try {
            sprvhm sprvhm2 = sprrif.cfr_renamed_5658(this.cfr_renamed_3);
            return sprvhm2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public final String getAlgorithm() {
        return sprmpd.cfr_renamed_9("ci|");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean equals(Object arg0) {
        if (arg0 == this) {
            return true;
        }
        if (!(arg0 instanceof sprdpf)) {
            return false;
        }
        sprdpf sprdpf2 = (sprdpf)arg0;
        try {
            return sproze.cfr_renamed_92(this.cfr_renamed_3.cfr_renamed_91(), sprdpf2.cfr_renamed_3.cfr_renamed_91());
        }
        catch (IOException iOException) {
            return false;
        }
    }

    public sprdpf(sprodg sprodg2) {
        this.cfr_renamed_3 = sprodg2;
    }

    public sprdpf(sprvhm sprvhm2) throws IOException {
        sprdpf sprdpf2 = this;
        sprdpf2.cfr_renamed_5659(sprvhm2);
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
        this.cfr_renamed_3 = (sprodg)sprhyf.cfr_renamed_5660(arg0);
    }

    public sprbj cfr_renamed_5650() {
        return this.cfr_renamed_3;
    }

    @Override
    public String getFormat() {
        return sprvuca.cfr_renamed_9("\u0018!u?y");
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int hashCode() {
        try {
            return sproze.cfr_renamed_95(this.cfr_renamed_3.cfr_renamed_91());
        }
        catch (IOException iOException) {
            return -1;
        }
    }

    @Override
    public int cfr_renamed_5713() {
        if (this.cfr_renamed_3 instanceof sprbxf) {
            return 1;
        }
        return ((sprldg)this.cfr_renamed_3).cfr_renamed_2331();
    }

    private /* synthetic */ void cfr_renamed_2290(ObjectInputStream arg0) throws IOException, ClassNotFoundException {
        ObjectInputStream objectInputStream = arg0;
        objectInputStream.defaultReadObject();
        byte[] byArray = (byte[])objectInputStream.readObject();
        this.cfr_renamed_5659(sprvhm.cfr_renamed_23(byArray));
    }
}

