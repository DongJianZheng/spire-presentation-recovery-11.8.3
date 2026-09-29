/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridh;
import com.spire.presentation.packages.sprvlh;
import java.io.ByteArrayOutputStream;

public class sprrih {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static byte[] cfr_renamed_8165(sprco arg0, sprvlh arg1) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            new spridh(byteArrayOutputStream).cfr_renamed_8106(arg0, arg1);
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            byteArrayOutputStream2.flush();
            byteArrayOutputStream2.close();
            return byteArrayOutputStream2.toByteArray();
        }
        catch (Exception exception) {
            throw new IllegalStateException(exception.getMessage(), exception);
        }
    }
}

