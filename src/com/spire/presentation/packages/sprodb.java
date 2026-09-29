/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprfcb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjsg;
import com.spire.presentation.packages.sprjta;
import com.spire.presentation.packages.sprnhb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvgz;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzcb;
import com.spire.presentation.packages.sprzna;
import java.io.IOException;
import java.security.PublicKey;

public class sprodb
implements sprt,
PublicKey {
    private sprfcb cfr_renamed_91;
    private int cfr_renamed_0;
    private String cfr_renamed_1;
    private static final long cfr_renamed_2 = 1L;
    private int cfr_renamed_3;
    private sprjta cfr_renamed_4;

    public sprfcb cfr_renamed_1247() {
        return this.cfr_renamed_91;
    }

    public int hashCode() {
        sprodb sprodb2 = this;
        return sprodb2.cfr_renamed_3 + sprodb2.cfr_renamed_0 + this.cfr_renamed_4.hashCode();
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprodb)) {
            return false;
        }
        sprodb sprodb2 = (sprodb)arg0;
        return this.cfr_renamed_3 == sprodb2.cfr_renamed_3 && this.cfr_renamed_0 == sprodb2.cfr_renamed_0 && this.cfr_renamed_4.equals(sprodb2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprodb(sprzcb sprzcb2) {
        this(arg0.cfr_renamed_1143(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1144(), arg0.cfr_renamed_1154());
        void arg0;
        this.cfr_renamed_91 = sprzcb2.cfr_renamed_284();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] getEncoded() {
        sprodb sprodb2 = this;
        sprnhb sprnhb2 = new sprnhb(new sprtzd(this.cfr_renamed_1), sprodb2.cfr_renamed_3, sprodb2.cfr_renamed_0, this.cfr_renamed_4);
        sprije sprije2 = new sprije(this.cfr_renamed_113(), sprume.cfr_renamed_3);
        try {
            sprdce sprdce2 = new sprdce(sprije2, sprnhb2);
            return sprdce2.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public String getFormat() {
        return null;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_4.cfr_renamed_884();
    }

    public String cfr_renamed_1143() {
        return this.cfr_renamed_1;
    }

    public String toString() {
        String string = sprjsg.cfr_renamed_9("\u001cG\u0014H8A2A\u0001Q3H8G\u001aA(\u001e[");
        string = new StringBuilder().insert(0, string).append(sprvgz.cfr_renamed_9("uY0[2A=\u0015:SuA=PuV:Q0\u0015u\u0015u\u0015u\u0015u\u0015o\u0015")).append(this.cfr_renamed_3).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprjsg.cfr_renamed_9("\u00044V#K#\u00042K#V4G%M>JqG0T0F8H8P(\u001eq")).append(this.cfr_renamed_0).append("\n").toString();
        string = new StringBuilder().insert(0, string).append(sprvgz.cfr_renamed_9("uR0[0G4A:GuX4A'\\-\u0015u\u0015u\u0015u\u0015u\u0015u\u0015o\u0015")).append(this.cfr_renamed_4.toString()).toString();
        return string;
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_3;
    }

    @Override
    public String getAlgorithm() {
        return sprjsg.cfr_renamed_9("i2a=M4G4");
    }

    public sprtzd cfr_renamed_113() {
        return new sprtzd("1.3.6.1.4.1.8301.3.1.3.4.2");
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_0;
    }

    public sprvva cfr_renamed_1248() {
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprodb(String string, int n, int n2, sprjta sprjta2) {
        void arg2;
        void arg1;
        void arg0;
        sprodb sprodb2 = this;
        sprodb sprodb3 = this;
        sprodb3.cfr_renamed_1 = arg0;
        sprodb3.cfr_renamed_3 = arg1;
        sprodb2.cfr_renamed_0 = arg2;
        sprodb2.cfr_renamed_4 = sprjta2;
    }

    public sprjta cfr_renamed_1145() {
        return this.cfr_renamed_4;
    }

    public sprodb(sprzna arg0) {
        this(arg0.cfr_renamed_1143(), arg0.cfr_renamed_1146(), arg0.cfr_renamed_1144(), arg0.cfr_renamed_1154());
    }
}

