/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcdb;
import com.spire.presentation.packages.sprdcb;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.sprgeb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtcz;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzoa;
import java.io.IOException;
import java.security.PublicKey;

public class sprdbb
implements sprt,
PublicKey {
    private static final long cfr_renamed_91 = 1L;
    private int cfr_renamed_0;
    private sprjta cfr_renamed_1;
    private String cfr_renamed_2;
    private int cfr_renamed_3;
    private sprdcb cfr_renamed_4;

    @Override
    public String getFormat() {
        return null;
    }

    @Override
    public String getAlgorithm() {
        return sprebda.cfr_renamed_9("W\u0013_\u001cs\u0015y\u0015");
    }

    public String toString() {
        String string = sprtcz.cfr_renamed_9("Z5R:~3t3G#u:~5\\3nl\u001d");
        string = new StringBuilder().insert(0, string).append(sprebda.cfr_renamed_9(":\u001c\u007f\u001e}\u0004rPu\u0016:\u0004r\u0015:\u0013u\u0014\u007fP:P:P:P:P P")).append(this.cfr_renamed_0).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprtcz.cfr_renamed_9("vr$e9evt9e$r5c?x875v&v4~:~\"nl7")).append(this.cfr_renamed_3).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprebda.cfr_renamed_9(":\u0017\u007f\u001e\u007f\u0002{\u0004u\u0002:\u001d{\u0004h\u0019bP:P:P:P:P:P P")).append(this.cfr_renamed_1.toString()).toString();
        return string;
    }

    public sprdcb cfr_renamed_1238() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sprdbb sprdbb2 = this;
        sprcdb sprcdb2 = new sprcdb(new sprtzd(this.cfr_renamed_2), sprdbb2.cfr_renamed_0, sprdbb2.cfr_renamed_3, this.cfr_renamed_1);
        sprije sprije2 = new sprije(this.cfr_renamed_113(), sprume.cfr_renamed_3);
        try {
            sprdce sprdce2 = new sprdce(sprije2, sprcdb2);
            return sprdce2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_1.cfr_renamed_884();
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_0;
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_2;
    }

    public sprjta cfr_renamed_1145() {
        return this.cfr_renamed_1;
    }

    public sprvva cfr_renamed_1248() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprdbb(String string, int n, int n2, sprjta sprjta2) {
        void arg2;
        void arg1;
        void arg0;
        sprdbb sprdbb2 = this;
        sprdbb sprdbb3 = this;
        sprdbb3.cfr_renamed_2 = arg0;
        sprdbb3.cfr_renamed_0 = arg1;
        sprdbb2.cfr_renamed_3 = arg2;
        sprdbb2.cfr_renamed_1 = sprjta2;
    }

    public sprdbb(sprzoa arg0) {
        this(arg0.cfr_renamed_1143(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1144(), arg0.cfr_renamed_1145());
    }

    public sprtzd cfr_renamed_113() {
        return new sprtzd("1.3.6.1.4.1.8301.3.1.3.4.1");
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprdbb)) {
            return false;
        }
        sprdbb sprdbb2 = (sprdbb)arg0;
        return this.cfr_renamed_0 == sprdbb2.cfr_renamed_0 && this.cfr_renamed_3 == sprdbb2.cfr_renamed_3 && this.cfr_renamed_1.equals(sprdbb2.cfr_renamed_1);
    }

    public int hashCode() {
        sprdbb sprdbb2 = this;
        return sprdbb2.cfr_renamed_0 + sprdbb2.cfr_renamed_3 + this.cfr_renamed_1.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public sprdbb(sprgeb sprgeb2) {
        this(arg0.cfr_renamed_1143(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1144(), arg0.cfr_renamed_1145());
        void arg0;
        this.cfr_renamed_4 = sprgeb2.cfr_renamed_284();
    }
}

