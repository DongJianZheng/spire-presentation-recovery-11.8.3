/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcaz;
import com.spire.presentation.packages.sprioe;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprqve;
import com.spire.presentation.packages.sprseaa;
import com.spire.presentation.packages.sprwqe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprfqe {
    private static final sprwqe cfr_renamed_4 = new sprwqe();

    public static int cfr_renamed_498(byte[] arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, 0, arg0.length, arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5216(String arg0, int arg1, int arg2) {
        try {
            return cfr_renamed_4.cfr_renamed_5216(arg0, arg1, arg2);
        }
        catch (Exception exception) {
            throw new sprqve(new StringBuilder().insert(0, sprcaz.cfr_renamed_9("\u0004c\u0002~\u0011o\bt\u000f;\u0005~\u0002t\u0005r\u000f|AS\u0004cAh\u0015i\bu\u0006!A")).append(exception.getMessage()).toString(), exception);
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
            throw new sprqve(new StringBuilder().insert(0, sprseaa.cfr_renamed_9("4C2^!O8T?\u001b5^2T5R?\\qs4CqH%I8U6\u0001q")).append(exception.getMessage()).toString(), exception);
        }
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
            throw new sprqve(new StringBuilder().insert(0, sprcaz.cfr_renamed_9("\u0004c\u0002~\u0011o\bt\u000f;\u0005~\u0002t\u0005r\u000f|AS\u0004cA\u007f\u0000o\u0000!A")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static byte[] cfr_renamed_485(byte[] byArray) {
        byte[] arg0;
        return sprfqe.cfr_renamed_502(arg0, 0, arg0.length);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_5217(String arg0) {
        try {
            String string = arg0;
            return cfr_renamed_4.cfr_renamed_5216(string, 0, string.length());
        }
        catch (Exception exception) {
            throw new sprqve(new StringBuilder().insert(0, sprseaa.cfr_renamed_9("4C2^!O8T?\u001b5^2T5R?\\qs4CqH%I8U6\u0001q")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static String cfr_renamed_503(byte[] byArray) {
        byte[] arg0;
        return sprfqe.cfr_renamed_501(arg0, 0, arg0.length);
    }

    public static int cfr_renamed_126(byte[] arg0, int arg1, int arg2, OutputStream arg3) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, arg1, arg2, arg3);
    }

    public static String cfr_renamed_501(byte[] arg0, int arg1, int arg2) {
        return sprkoe.cfr_renamed_184(sprfqe.cfr_renamed_502(arg0, arg1, arg2));
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
            throw new sprioe(new StringBuilder().insert(0, sprcaz.cfr_renamed_9("\u0004c\u0002~\u0011o\bt\u000f;\u0004u\u0002t\u0005r\u000f|AS\u0004cAh\u0015i\bu\u0006!A")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_1(arg0, arg1);
    }
}

