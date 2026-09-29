/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjuf;

public final class sprffg {
    private static /* synthetic */ long cfr_renamed_7041(byte[] arg0, int arg1) {
        long l = arg0[arg1] & 0xFF;
        l |= (long)(arg0[arg1 + 1] & 0xFF) << 8;
        l |= (long)(arg0[arg1 + 2] & 0xFF) << 16;
        return l |= (long)(arg0[arg1 + 3] & 0xFF) << 24;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static void cfr_renamed_7001(sprjuf arg0, byte[] arg1, int arg2) {
        switch (arg2) {
            case 3: {
                int n;
                int n2 = n = 0;
                while (n2 < 64) {
                    int n3;
                    long l = sprffg.cfr_renamed_7042(arg1, 3 * n);
                    long l2 = l & 0x249249L;
                    l2 += l >> 1 & 0x249249L;
                    l2 += l >> 2 & 0x249249L;
                    int n4 = n3 = 0;
                    while (n4 < 4) {
                        short s = (short)(l2 >> 6 * n3 + 0 & 7L);
                        short s2 = (short)(l2 >> 6 * n3 + 3 & 7L);
                        int n5 = 4 * n + n3;
                        arg0.cfr_renamed_6987(n5, (short)(s - s2));
                        n4 = ++n3;
                    }
                    n2 = ++n;
                }
                return;
            }
            default: {
                int n;
                int n6 = n = 0;
                while (n6 < 32) {
                    int n7;
                    long l = sprffg.cfr_renamed_7041(arg1, 4 * n);
                    long l3 = l & 0x55555555L;
                    l3 += l >> 1 & 0x55555555L;
                    int n8 = n7 = 0;
                    while (n8 < 8) {
                        short s = (short)(l3 >> 4 * n7 + 0 & 3L);
                        short s3 = (short)(l3 >> 4 * n7 + arg2 & 3L);
                        int n9 = 8 * n + n7;
                        arg0.cfr_renamed_6987(n9, (short)(s - s3));
                        n8 = ++n7;
                    }
                    n6 = ++n;
                }
                break block0;
            }
        }
    }

    private static /* synthetic */ long cfr_renamed_7042(byte[] arg0, int arg1) {
        long l = arg0[arg1] & 0xFF;
        l |= (long)(arg0[arg1 + 1] & 0xFF) << 8;
        return l |= (long)(arg0[arg1 + 2] & 0xFF) << 16;
    }
}

