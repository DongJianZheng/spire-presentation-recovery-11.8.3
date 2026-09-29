/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcme;
import com.spire.presentation.packages.sprcno;
import com.spire.presentation.packages.sprilaa;
import com.spire.presentation.packages.sprope;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;
import com.spire.presentation.packages.sprzra;
import java.io.IOException;
import java.math.BigInteger;

public class sprooe
extends sprvva {
    public byte[] cfr_renamed_4;

    public BigInteger cfr_renamed_97() {
        return new BigInteger(this.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_4613(sprope arg0) throws IOException {
        arg0.cfr_renamed_4614(2, this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_4788(sprvva arg0) {
        if (!(arg0 instanceof sprooe)) {
            return false;
        }
        sprooe sprooe2 = (sprooe)arg0;
        return sprzra.cfr_renamed_92(this.cfr_renamed_4, sprooe2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprooe(byte[] byArray, boolean bl) {
        void arg0;
        this.cfr_renamed_4 = (byte[])(bl ? sprzra.cfr_renamed_158((byte[])arg0) : arg0);
    }

    @Override
    public int hashCode() {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 != this.cfr_renamed_4.length) {
            int n4 = this.cfr_renamed_4[n] & 0xFF;
            int n5 = n % 4;
            n2 ^= n4 << n5;
            n3 = ++n;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprooe cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprooe) {
            return (sprooe)arg0;
        }
        if (!(arg0 instanceof byte[])) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcno.cfr_renamed_9("W9R0Y4RuQ7T0]!\u001e<PuY0J\u001cP&J4P6[o\u001e")).append(arg0.getClass().getName()).toString());
        }
        try {
            return (sprooe)sprooe.cfr_renamed_184((byte[])arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprilaa.cfr_renamed_9("\u0017\u0015\u0011\u0014\u0016\u0012\u001c\u001cR\u001e\u0000\t\u001d\tR\u0012\u001c[\u0015\u001e\u00062\u001c\b\u0006\u001a\u001c\u0018\u0017AR")).append(exception.toString()).toString());
        }
    }

    @Override
    public boolean cfr_renamed_4575() {
        return false;
    }

    public BigInteger cfr_renamed_162() {
        return new BigInteger(1, this.cfr_renamed_4);
    }

    public String toString() {
        return this.cfr_renamed_97().toString();
    }

    public sprooe(long l) {
        this.cfr_renamed_4 = BigInteger.valueOf(l).toByteArray();
    }

    public sprooe(BigInteger bigInteger) {
        this.cfr_renamed_4 = bigInteger.toByteArray();
    }

    @Override
    public int cfr_renamed_4616() {
        return 1 + sprcme.cfr_renamed_4586(this.cfr_renamed_4.length) + this.cfr_renamed_4.length;
    }

    public static sprooe cfr_renamed_341(spryte arg0, boolean arg1) {
        sprvva sprvva2 = arg0.cfr_renamed_2456();
        if (arg1 || sprvva2 instanceof sprooe) {
            return sprooe.cfr_renamed_23(sprvva2);
        }
        return new sprooe(sprxue.cfr_renamed_23(arg0.cfr_renamed_2456()).cfr_renamed_186());
    }

    public sprooe(byte[] arg0) {
        this(arg0, true);
    }
}

