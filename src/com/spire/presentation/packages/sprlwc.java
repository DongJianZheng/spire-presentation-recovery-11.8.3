/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbd;
import com.spire.presentation.packages.sprbcd;
import com.spire.presentation.packages.sprefs;
import com.spire.presentation.packages.sprkxc;
import com.spire.presentation.packages.spryad;
import com.spire.presentation.packages.sprzra;
import com.spire.presentation.packages.sprzsc;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;
import java.util.Hashtable;
import java.util.Vector;

public abstract class sprlwc {
    public final SecureRandom cfr_renamed_4;

    public static byte[] cfr_renamed_3110(sprbbd arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        arg0.cfr_renamed_2623(byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static void cfr_renamed_3123(int arg0, short arg1) throws IOException {
        switch (sprzsc.cfr_renamed_2746(arg0)) {
            case 1: 
            case 2: {
                throw new spryad(arg1);
            }
        }
    }

    public static byte[] cfr_renamed_3109(Vector arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprkxc.cfr_renamed_2927(byteArrayOutputStream, arg0);
        return byteArrayOutputStream.toByteArray();
    }

    /*
     * WARNING - void declaration
     */
    public sprlwc(SecureRandom secureRandom) {
        void arg0;
        if (secureRandom == null) {
            throw new IllegalArgumentException(sprefs.cfr_renamed_9("))k9{(k\bo4j5c}.9o4`5zzl?.4{6b"));
        }
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_3119(byte[] arg0, byte[] arg1) throws IOException {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arg0);
        byte[] byArray = sprzsc.cfr_renamed_2632(arg1.length, byteArrayInputStream);
        sprkxc.cfr_renamed_2674(byteArrayInputStream);
        if (!sprzra.cfr_renamed_559(arg1, byArray)) {
            throw new spryad(40);
        }
    }

    public static short cfr_renamed_3124(Hashtable arg0, Hashtable arg1, short arg2) throws IOException {
        short s = sprbcd.cfr_renamed_2930(arg1);
        if (s >= 0 && s != sprbcd.cfr_renamed_2930(arg0)) {
            throw new spryad(arg2);
        }
        return s;
    }
}

