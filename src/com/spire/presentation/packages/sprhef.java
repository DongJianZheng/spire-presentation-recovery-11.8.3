/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import java.util.Comparator;

public class sprhef
implements Comparator {
    public int compare(Object arg0, Object arg1) {
        int n;
        byte[] byArray = (byte[])arg0;
        byte[] byArray2 = (byte[])arg1;
        int n2 = n = 0;
        while (n2 < byArray.length && n < byArray2.length) {
            int n3 = byArray[n] & 0xFF;
            int n4 = byArray2[n] & 0xFF;
            if (n3 != n4) {
                return n3 - n4;
            }
            n2 = ++n;
        }
        return byArray.length - byArray2.length;
    }
}

