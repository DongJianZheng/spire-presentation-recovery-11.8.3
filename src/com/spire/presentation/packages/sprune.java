/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprtks;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprvwja;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.math.BigInteger;

public class sprune
extends sprvva {
    private static sprune[] cfr_renamed_3 = new sprune[12];
    public byte[] cfr_renamed_4;

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprune cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprune) {
            return (sprune)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprtks.cfr_renamed_9("{y~put~5}wxpqa2||5upf\\|fft|vw/2")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprune)sprune.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvwja.cfr_renamed_9("\u0007#\u0001\"\u0006$\f*B(\u0010?\r?B$\fm\u0005(\u0016\u0004\f>\u0016,\f.\u0007wB")).append(exception.toString()).toString());
        }
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprune)) {
            return false;
        }
        sprune sprune2 = (sprune)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprune2.cfr_renamed_4);
    }

    public static sprune cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprune) {
            return sprune.cfr_renamed_23(sprvva2);
        }
        return sprune.cfr_renamed_4807(((sprxue)sprvva2).cfr_renamed_186());
    }

    public BigInteger cfr_renamed_97() {
        return new BigInteger(this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public sprune(int n) {
        this.cfr_renamed_4 = BigInteger.valueOf(n).toByteArray();
    }

    public sprune(BigInteger bigInteger) {
        this.cfr_renamed_4 = bigInteger.toByteArray();
    }

    public static sprune cfr_renamed_4807(byte[] arg0) {
        if (arg0.length > 1) {
            return new sprune(sprzra.cfr_renamed_158(arg0));
        }
        if (arg0.length == 0) {
            throw new IllegalArgumentException(sprvwja.cfr_renamed_9("\b,\u0018/\b0\f6\b&m\n,\u0011m\u0018(\u0010\"B!\u0007#\u00059\n"));
        }
        int n = arg0[0] & 0xFF;
        if (n >= cfr_renamed_3.length) {
            return new sprune(sprzra.cfr_renamed_158(arg0));
        }
        sprune sprune2 = cfr_renamed_3[n];
        if (sprune2 == null) {
            sprune.cfr_renamed_3[n] = new sprune(sprzra.cfr_renamed_158(arg0));
            sprune2 = sprune.cfr_renamed_3[n];
        }
        return sprune2;
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(10, this.cfr_renamed_4);
    }

    public sprune(byte[] byArray) {
        this.cfr_renamed_4 = byArray;
    }

    @Override
    public int hashCode() {
        return sprzra.cfr_renamed_95(this.cfr_renamed_4);
    }
}

