/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraad;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprjyy;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.sprwob;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Hashtable;

public class sprpzc {
    public static final Integer cfr_renamed_4 = spriwa.cfr_renamed_279(14);

    public static byte[] cfr_renamed_2778(spraad arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprwob.cfr_renamed_9("gC3S\u0013d\u0014f\u0004W4Wg\u0016#W.X/B`T%\u0016.C,Z"));
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        spraad spraad2 = arg0;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
        sprzsc.cfr_renamed_2752(spraad2.cfr_renamed_2622(), byteArrayOutputStream2);
        sprzsc.cfr_renamed_2638(spraad2.cfr_renamed_2621(), byteArrayOutputStream);
        return byteArrayOutputStream2.toByteArray();
    }

    public static spraad cfr_renamed_2779(byte[] arg0) throws IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprjyy.cfr_renamed_9("n21#,9:>&9\r6=6nw*6'9&#i5,w'\"%;"));
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        int n = sprzsc.cfr_renamed_2660(byteArrayInputStream);
        if (n < 2 || (n & 1) != 0) {
            throw new spryad(50);
        }
        int[] nArray = sprzsc.cfr_renamed_2754(n / 2, byteArrayInputStream);
        ByteArrayInputStream byteArrayInputStream2 = byteArrayInputStream;
        byte[] byArray = sprzsc.cfr_renamed_2763(byteArrayInputStream2);
        sprkxc.cfr_renamed_2674(byteArrayInputStream2);
        return new spraad(nArray, byArray);
    }

    public static void cfr_renamed_2780(Hashtable arg0, spraad arg1) throws IOException {
        arg0.put(cfr_renamed_4, sprpzc.cfr_renamed_2778(arg1));
    }

    public static spraad cfr_renamed_2781(Hashtable arg0) throws IOException {
        byte[] byArray = sprzsc.cfr_renamed_2642(arg0, cfr_renamed_4);
        if (byArray == null) {
            return null;
        }
        return sprpzc.cfr_renamed_2779(byArray);
    }
}

