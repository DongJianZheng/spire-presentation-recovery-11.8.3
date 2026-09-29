/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class sprtbm {
    private static final long cfr_renamed_4 = Runtime.getRuntime().maxMemory();

    public static int cfr_renamed_4582(InputStream arg0) {
        if (arg0 instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream)arg0).available();
        }
        if (arg0 instanceof FileInputStream) {
            try {
                long l;
                FileChannel fileChannel = ((FileInputStream)arg0).getChannel();
                long l2 = l = fileChannel != null ? fileChannel.size() : Integer.MAX_VALUE;
                if (l < Integer.MAX_VALUE) {
                    return (int)l;
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if (cfr_renamed_4 > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)cfr_renamed_4;
    }
}

