/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqzx;
import com.spire.presentation.packages.sprtdd;

public class sprlhd
extends sprtdd {
    public static final int cfr_renamed_4 = 24;

    /*
     * WARNING - void declaration
     */
    public static boolean cfr_renamed_3378(byte[] byArray, int n) {
        void arg1;
        byte[] arg0;
        return sprlhd.cfr_renamed_3379(arg0, n, arg0.length - arg1);
    }

    public static boolean cfr_renamed_3379(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = arg1;
        while (n2 < arg2) {
            if (sprtdd.cfr_renamed_3378(arg0, n)) {
                return true;
            }
            n2 = n += 8;
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public sprlhd(byte[] byArray) {
        void arg0;
        void v0 = arg0;
        super((byte[])v0);
        if (sprlhd.cfr_renamed_3379((byte[])v0, 0, ((void)arg0).length)) {
            throw new IllegalArgumentException(sprqzx.cfr_renamed_9("\u0014\u0018\u0001\t\u0018\u001c\u0001L\u0001\u0003U\u000f\u0007\t\u0014\u0018\u0010L\u0002\t\u0014\u0007U(0?\u0010\b\u0010L\u001e\t\f"));
        }
    }
}

