/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbad;
import com.spire.presentation.packages.sprgpk;
import com.spire.presentation.packages.sprsc;
import com.spire.presentation.packages.spruyc;
import com.spire.presentation.packages.sprwwc;
import com.spire.presentation.packages.sprxno;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;

public class sprcad {
    public Vector cfr_renamed_3;
    public short cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprcad(short s, Vector vector) {
        void arg0;
        void arg1;
        if (!sprbad.cfr_renamed_2963(s)) {
            throw new IllegalArgumentException(sprxno.cfr_renamed_9("FZ\u0018^\u0004\tAG\u0012\u000e\u000fA\u0015\u000e\u0000\u000e\u0017O\rG\u0005\u000e\"K\u0013Z\"F\u0000G\u000fz\u0018^\u0004\u000e\u0017O\r[\u0004"));
        }
        if (arg1 == null || arg1.isEmpty()) {
            throw new IllegalArgumentException(sprgpk.cfr_renamed_9("c=6$\u0005& \u0000%;,\u0004-;0od%1;0h,)2-d$!&#<,hzht"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public short cfr_renamed_324() {
        return this.cfr_renamed_4;
    }

    public static sprcad cfr_renamed_2628(sprsc arg0, InputStream arg1) throws IOException {
        short s = sprzsc.cfr_renamed_2630(arg1);
        if (!sprbad.cfr_renamed_2963(s)) {
            throw new spryad(50);
        }
        int n = sprzsc.cfr_renamed_2660(arg1);
        if (n < 1) {
            throw new spryad(50);
        }
        byte[] byArray = sprzsc.cfr_renamed_2632(n, arg1);
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
        Vector<sprwwc> vector = new Vector<sprwwc>();
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        while (byteArrayInputStream2.available() > 0) {
            sprwwc sprwwc2 = sprwwc.cfr_renamed_2628(arg0, byteArrayInputStream);
            byteArrayInputStream2 = byteArrayInputStream;
            vector.addElement(sprwwc2);
        }
        return new sprcad(s, vector);
    }

    public Vector cfr_renamed_3256() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_2623(OutputStream arg0) throws IOException {
        int n;
        sprzsc.cfr_renamed_2676(this.cfr_renamed_4, arg0);
        spruyc spruyc2 = new spruyc(this);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.size()) {
            Object e = this.cfr_renamed_3.elementAt(n);
            ((sprwwc)e).cfr_renamed_2623(spruyc2);
            n2 = ++n;
        }
        spruyc2.cfr_renamed_3257(arg0);
    }
}

