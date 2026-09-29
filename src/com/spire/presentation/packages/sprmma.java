/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprg;
import com.spire.presentation.packages.sprgpa;
import com.spire.presentation.packages.sprjpfa;
import com.spire.presentation.packages.sprnpa;
import com.spire.presentation.packages.sprsso;
import com.spire.presentation.packages.sprtra;
import com.spire.presentation.packages.sprywa;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprmma {
    private static final sprg cfr_renamed_4 = new sprnpa();

    public static String cfr_renamed_501(byte[] arg0, int arg1, int arg2) {
        return sprywa.cfr_renamed_184(sprmma.cfr_renamed_502(arg0, arg1, arg2));
    }

    public static int cfr_renamed_498(byte[] arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, 0, arg0.length, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_496(byte[] arg0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cfr_renamed_4.cfr_renamed_272(arg0, 0, arg0.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprtra(new StringBuilder().insert(0, sprjpfa.cfr_renamed_9("\u001c\u0004\u001a\u0019\t\b\u0010\u0013\u0017\\\u001d\u0019\u001a\u0013\u001d\u0015\u0017\u001bY4\u001c\u0004Y\u0018\u0018\b\u0018FY")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_488(String arg0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cfr_renamed_4.cfr_renamed_1(arg0, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprtra(new StringBuilder().insert(0, sprsso.cfr_renamed_9("[8]%N4W/P`Z%]/Z)P'\u001e\b[8\u001e3J2W.Yz\u001e")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static byte[] cfr_renamed_485(byte[] byArray) {
        byte[] arg0;
        return sprmma.cfr_renamed_502(arg0, 0, arg0.length);
    }

    public static int cfr_renamed_126(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, arg3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_502(byte[] arg0, int arg1, int arg2) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprgpa(new StringBuilder().insert(0, sprjpfa.cfr_renamed_9("\u001c\u0004\u001a\u0019\t\b\u0010\u0013\u0017\\\u001c\u0012\u001a\u0013\u001d\u0015\u0017\u001bY4\u001c\u0004Y\u000f\r\u000e\u0010\u0012\u001eFY")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static String cfr_renamed_503(byte[] byArray) {
        byte[] arg0;
        return sprmma.cfr_renamed_501(arg0, 0, arg0.length);
    }

    public static int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_1(arg0, arg1);
    }
}

