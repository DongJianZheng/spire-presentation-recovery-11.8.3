/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawha;
import com.spire.presentation.packages.sprg;
import com.spire.presentation.packages.sprgpa;
import com.spire.presentation.packages.sproua;
import com.spire.presentation.packages.sprtra;
import com.spire.presentation.packages.sprwwn;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprjma {
    private static final sprg cfr_renamed_4 = new sproua();

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
            throw new sprtra(new StringBuilder().insert(0, sprawha.cfr_renamed_9("W{QfBw[l\\#VfQlVj\\d\u0012V`O\u0012pSeW#PbAf\u00047\u0012pFq[mU9\u0012")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_485(byte[] arg0) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            cfr_renamed_4.cfr_renamed_126(arg0, 0, arg0.length, byteArrayOutputStream);
            return byteArrayOutputStream.toByteArray();
        }
        catch (Exception exception) {
            throw new sprgpa(new StringBuilder().insert(0, sprwwn.cfr_renamed_9("h-n0}!d:cuh;n:i<c2-\u0000_\u0019-&l3huo4~0;a-1l!lo-")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static int cfr_renamed_497(byte[] arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_272(arg0, 0, arg0.length, arg1);
    }

    public static int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_1(arg0, arg1);
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
            throw new sprtra(new StringBuilder().insert(0, sprawha.cfr_renamed_9("W{QfBw[l\\#VfQlVj\\d\u0012V`O\u0012pSeW#PbAf\u00047\u0012pFq[mU9\u0012")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static int cfr_renamed_498(byte[] arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_126(arg0, 0, arg0.length, arg1);
    }
}

