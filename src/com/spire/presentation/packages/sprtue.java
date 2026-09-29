/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvh;
import com.spire.presentation.packages.sprioe;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprqpb;
import com.spire.presentation.packages.sprqve;
import com.spire.presentation.packages.sprtf;
import com.spire.presentation.packages.spryme;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprtue {
    private static final sprtf cfr_renamed_4 = new spryme();

    public static String cfr_renamed_510(byte[] byArray) {
        byte[] arg0;
        return sprtue.cfr_renamed_509(arg0, 0, arg0.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_488(String arg0) {
        int n = arg0.length() / 4 * 3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        try {
            cfr_renamed_4.cfr_renamed_1(arg0, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprqve(new StringBuilder().insert(0, sprbvh.cfr_renamed_9("&;27?0s!<u700:70s72&6cgu !!<=2iu")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_1(arg0, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_496(byte[] arg0) {
        int n = arg0.length / 4 * 3;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        try {
            cfr_renamed_4.cfr_renamed_272(arg0, 0, arg0.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprqve(new StringBuilder().insert(0, sprqpb.cfr_renamed_9("i\u001c}\u0010p\u0017<\u0006sRx\u0017\u007f\u001dx\u0017<\u0010}\u0001yD(Rx\u0013h\u0013&R")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static int cfr_renamed_126(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, arg3);
    }

    public static byte[] cfr_renamed_485(byte[] byArray) {
        byte[] arg0;
        return sprtue.cfr_renamed_502(arg0, 0, arg0.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_502(byte[] arg0, int arg1, int arg2) {
        int n = cfr_renamed_4.cfr_renamed_5215(arg2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        try {
            cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprioe(new StringBuilder().insert(0, sprbvh.cfr_renamed_9("6-00#!::=u6;0:7<=2s72&6cgu !!<=2iu")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static String cfr_renamed_509(byte[] arg0, int arg1, int arg2) {
        return sprkoe.cfr_renamed_184(sprtue.cfr_renamed_502(arg0, arg1, arg2));
    }

    public static int cfr_renamed_498(byte[] arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, 0, arg0.length, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static int cfr_renamed_272(byte[] arg0, int arg1, int arg2, OutputStream arg3) {
        try {
            return cfr_renamed_4.cfr_renamed_272(arg0, arg1, arg2, arg3);
        }
        catch (Exception exception) {
            throw new sprqve(new StringBuilder().insert(0, sprqpb.cfr_renamed_9("i\u001c}\u0010p\u0017<\u0006sRx\u0017\u007f\u001dx\u0017<\u0010}\u0001yD(Rx\u0013h\u0013&R")).append(exception.getMessage()).toString(), exception);
        }
    }
}

