/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgqe;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.channels.FileChannel;

public class sprcme {
    private static final long cfr_renamed_4 = Runtime.getRuntime().maxMemory();

    public static int cfr_renamed_4582(InputStream arg0) {
        if (arg0 instanceof sprgqe) {
            return ((sprgqe)arg0).cfr_renamed_4583();
        }
        if (arg0 instanceof sprgle) {
            return ((sprgle)arg0).cfr_renamed_4584();
        }
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

    public static int cfr_renamed_4585(int arg0) throws IOException {
        int n = 1;
        if (arg0 >= 31) {
            if (arg0 < 128) {
                return ++n;
            }
            byte[] byArray = new byte[5];
            int n2 = byArray.length;
            byArray[--n2] = (byte)(arg0 & 0x7F);
            do {
                byArray[--n2] = (byte)((arg0 >>= 7) & 0x7F | 0x80);
            } while (arg0 > 127);
            n += byArray.length - n2;
        }
        return n;
    }

    public static int cfr_renamed_4586(int arg0) {
        int n = 1;
        if (arg0 > 127) {
            int n2;
            int n3;
            int n4 = 1;
            int n5 = n3 = arg0;
            while ((n3 = n5 >>> 8) != 0) {
                n5 = n3;
                ++n4;
            }
            int n6 = n2 = (n4 - 1) * 8;
            while (n6 >= 0) {
                n6 = n2 -= 8;
                ++n;
            }
        }
        return n;
    }
}

