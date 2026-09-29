/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprioe;
import com.spire.presentation.packages.sprjoe;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprqve;
import com.spire.presentation.packages.sprssy;
import com.spire.presentation.packages.sprtf;
import com.spire.presentation.packages.sprzyd;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprete {
    private static final sprtf cfr_renamed_4 = new sprjoe();

    public static int cfr_renamed_498(byte[] arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, 0, arg0.length, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_488(String arg0) {
        int n = arg0.length() / 8 * 5;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        try {
            cfr_renamed_4.cfr_renamed_1(arg0, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprqve(new StringBuilder().insert(0, sprssy.cfr_renamed_9("C\rW\u0001Z\u0006\u0016\u0017YCR\u0006U\fR\u0006\u0016\u0001W\u0010SP\u0004CE\u0017D\nX\u0004\fC")).append(exception.getMessage()).toString(), exception);
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
    public static byte[] cfr_renamed_502(byte[] arg0, int arg1, int arg2) {
        int n = cfr_renamed_4.cfr_renamed_5215(arg2);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        try {
            cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprioe(new StringBuilder().insert(0, sprzyd.cfr_renamed_9("\u0002!\u0004<\u0017-\u000e6\ty\u00027\u00046\u00030\t>G;\u0006*\u0002jUy\u0014-\u00150\t>]y")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static String cfr_renamed_5220(byte[] byArray) {
        byte[] arg0;
        return sprete.cfr_renamed_5221(arg0, 0, arg0.length);
    }

    public static byte[] cfr_renamed_485(byte[] byArray) {
        byte[] arg0;
        return sprete.cfr_renamed_502(arg0, 0, arg0.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_496(byte[] arg0) {
        int n = arg0.length / 8 * 5;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        try {
            cfr_renamed_4.cfr_renamed_272(arg0, 0, arg0.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprqve(new StringBuilder().insert(0, sprssy.cfr_renamed_9("C\rW\u0001Z\u0006\u0016\u0017YCR\u0006U\fR\u0006\u0016\u0001W\u0010SP\u0004CR\u0002B\u0002\fC")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static String cfr_renamed_5221(byte[] arg0, int arg1, int arg2) {
        return sprkoe.cfr_renamed_184(sprete.cfr_renamed_502(arg0, arg1, arg2));
    }

    public static int cfr_renamed_126(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, arg3);
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
            throw new sprqve(new StringBuilder().insert(0, sprzyd.cfr_renamed_9("\u00127\u0006;\u000b<G-\by\u0003<\u00046\u0003<G;\u0006*\u0002jUy\u00038\u00138]y")).append(exception.getMessage()).toString(), exception);
        }
    }
}

