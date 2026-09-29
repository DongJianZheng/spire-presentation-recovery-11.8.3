/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproal;
import com.spire.presentation.packages.sprxvr;

public class sprwwk
extends sproal {
    public static final int cfr_renamed_4 = 24;

    public static boolean cfr_renamed_9992(byte[] arg0, int arg1) {
        if (arg0.length == 16) {
            return sprwwk.cfr_renamed_9993(arg0, arg1);
        }
        return sprwwk.cfr_renamed_9994(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public static boolean cfr_renamed_3378(byte[] byArray, int n) {
        void arg1;
        byte[] arg0;
        return sprwwk.cfr_renamed_3379(arg0, n, arg0.length - arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprwwk(byte[] byArray) {
        void arg0;
        void v0 = arg0;
        super((byte[])v0);
        if (sprwwk.cfr_renamed_3379((byte[])v0, 0, ((void)arg0).length)) {
            throw new IllegalArgumentException(sprxvr.cfr_renamed_9("\fI\u0019X\u0000M\u0019\u001d\u0019RM^\u001fX\fI\b\u001d\u001aX\fVMy(n\bY\b\u001d\u0006X\u0014"));
        }
    }

    public static boolean cfr_renamed_9993(byte[] arg0, int arg1) {
        int n;
        boolean bl = false;
        int n2 = n = arg1;
        while (n2 != arg1 + 8) {
            if (arg0[n] != arg0[n + 8]) {
                bl = true;
            }
            n2 = ++n;
        }
        return bl;
    }

    public static boolean cfr_renamed_3379(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = arg1;
        while (n2 < arg2) {
            if (sproal.cfr_renamed_3378(arg0, n)) {
                return true;
            }
            n2 = n += 8;
        }
        return false;
    }

    public static boolean cfr_renamed_9994(byte[] arg0, int arg1) {
        int n;
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        int n2 = n = arg1;
        while (n2 != arg1 + 8) {
            bl |= arg0[n] != arg0[n + 8];
            bl2 |= arg0[n] != arg0[n + 16];
            bl3 |= arg0[n + 8] != arg0[n + 16];
            n2 = ++n;
        }
        return bl && bl2 && bl3;
    }
}

