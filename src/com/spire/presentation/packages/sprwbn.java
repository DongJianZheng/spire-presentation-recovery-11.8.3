/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazm;
import com.spire.presentation.packages.sprrzm;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class sprwbn {
    public static int cfr_renamed_4582(InputStream arg0) {
        long l;
        if (arg0 instanceof sprazm) {
            return ((sprazm)arg0).cfr_renamed_4584();
        }
        if (arg0 instanceof sprrzm) {
            return ((sprrzm)arg0).cfr_renamed_4584();
        }
        if (arg0 instanceof ByteArrayInputStream) {
            return ((ByteArrayInputStream)arg0).available();
        }
        if (arg0 instanceof FileInputStream) {
            try {
                long l2;
                FileChannel fileChannel = ((FileInputStream)arg0).getChannel();
                long l3 = l2 = fileChannel != null ? fileChannel.size() : Integer.MAX_VALUE;
                if (l2 < Integer.MAX_VALUE) {
                    return (int)l2;
                }
            }
            catch (IOException iOException) {
                // empty catch block
            }
        }
        if ((l = Runtime.getRuntime().maxMemory()) > Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        return (int)l;
    }
}

