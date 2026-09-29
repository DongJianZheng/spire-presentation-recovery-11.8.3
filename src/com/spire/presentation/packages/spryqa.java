/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceaa;
import com.spire.presentation.packages.sprg;
import com.spire.presentation.packages.sprgpa;
import com.spire.presentation.packages.sproho;
import com.spire.presentation.packages.spropa;
import com.spire.presentation.packages.sprtra;
import com.spire.presentation.packages.sprywa;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class spryqa {
    private static final sprg cfr_renamed_4 = new spropa();

    public static String cfr_renamed_509(byte[] arg0, int arg1, int arg2) {
        return sprywa.cfr_renamed_184(spryqa.cfr_renamed_502(arg0, arg1, arg2));
    }

    public static byte[] cfr_renamed_485(byte[] byArray) {
        byte[] arg0;
        return spryqa.cfr_renamed_502(arg0, 0, arg0.length);
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
            throw new sprtra(new StringBuilder().insert(0, sprceaa.cfr_renamed_9("[\u0007O\u000bB\f\u000e\u001dAIJ\fM\u0006J\f\u000e\u000bO\u001aK_\u001aIJ\bZ\b\u0014I")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static int cfr_renamed_126(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, arg3);
    }

    public static int cfr_renamed_498(byte[] arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, 0, arg0.length, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_502(byte[] arg0, int arg1, int arg2) {
        int n = (arg2 + 2) / 3 * 4;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(n);
        try {
            cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprgpa(new StringBuilder().insert(0, sproho.cfr_renamed_9("\u0002!\u0004<\u0017-\u000e6\ty\u00027\u00046\u00030\t>G;\u0006*\u0002oSy\u0014-\u00150\t>]y")).append(exception.getMessage()).toString(), exception);
        }
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
            throw new sprtra(new StringBuilder().insert(0, sprceaa.cfr_renamed_9("[\u0007O\u000bB\f\u000e\u001dAIJ\fM\u0006J\f\u000e\u000bO\u001aK_\u001aI]\u001d\\\u0000@\u000e\u0014I")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_1(arg0, arg1);
    }

    public static String cfr_renamed_510(byte[] byArray) {
        byte[] arg0;
        return spryqa.cfr_renamed_509(arg0, 0, arg0.length);
    }
}

