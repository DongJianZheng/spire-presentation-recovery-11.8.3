/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprene;
import com.spire.presentation.packages.sprioe;
import com.spire.presentation.packages.sprlob;
import com.spire.presentation.packages.sprqve;
import com.spire.presentation.packages.sprtf;
import com.spire.presentation.packages.spruao;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class sprsse {
    private static final sprtf cfr_renamed_4 = new sprene();

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
            throw new sprqve(new StringBuilder().insert(0, spruao.cfr_renamed_9("PnVsEb\\y[6QsVyQ\u007f[q\u0015CgZ\u0015eTpP6WwFs\u0003\"\u0015eAd\\xR,\u0015")).append(exception.getMessage()).toString(), exception);
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
            throw new sprqve(new StringBuilder().insert(0, sprlob.cfr_renamed_9("nGhZ{KbPe\u001foZhPoVeX+jYs+LjYn\u001fi^xZ=\u000b+L\u007fMbQl\u0005+")).append(exception.getMessage()).toString(), exception);
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
            throw new sprioe(new StringBuilder().insert(0, spruao.cfr_renamed_9("PnVsEb\\y[6PxVyQ\u007f[q\u0015CgZ\u0015eTpP6WwFs\u0003\"\u0015rTbT,\u0015")).append(exception.getMessage()).toString(), exception);
        }
    }

    public static int cfr_renamed_497(byte[] arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_272(arg0, 0, arg0.length, arg1);
    }

    public static int cfr_renamed_1(String arg0, OutputStream arg1) throws IOException {
        return cfr_renamed_4.cfr_renamed_1(arg0, arg1);
    }
}

