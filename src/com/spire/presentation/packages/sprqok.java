/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqik;
import java.io.IOException;

public class sprqok {
    private final byte[] cfr_renamed_0;
    private final int cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final long cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public static sprqok cfr_renamed_9663(Object arg0, int arg1, int arg2) throws IOException {
        if (arg0 instanceof sprqok) {
            return (sprqok)arg0;
        }
        sprqik sprqik2 = sprqik.cfr_renamed_9654(arg0);
        int n = sprqik2.cfr_renamed_9666();
        byte[] byArray = sprqik2.cfr_renamed_9664(20);
        long l = sprqik2.cfr_renamed_9655();
        byte[] byArray2 = null;
        if (l > 0L) {
            byArray2 = sprqik2.cfr_renamed_9658((int)((long)arg2 + l), (int)((long)arg2 + l + 8L));
        }
        sprqik sprqik3 = sprqik2;
        int n2 = sprqik3.cfr_renamed_9656();
        sprqik3.cfr_renamed_9656();
        sprqik sprqik4 = sprqik2;
        byte[] byArray3 = sprqik4.cfr_renamed_9664(arg1 - (sprqik4.cfr_renamed_9666() - n));
        return new sprqok(byArray, l, n2, byArray3, byArray2);
    }

    public byte[] cfr_renamed_5209() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    public byte[] cfr_renamed_9669() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprqok(byte[] byArray, long l, int n, byte[] byArray2, byte[] byArray3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqok sprqok2 = this;
        sprqok sprqok3 = this;
        this.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg0);
        sprqok3.cfr_renamed_3 = arg1;
        sprqok3.cfr_renamed_1 = arg2;
        sprqok2.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg3);
        sprqok2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray3);
    }

    public byte[] cfr_renamed_7541() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4;
        int cfr_ignored_0 = 2 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 3;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public int cfr_renamed_7617() {
        return this.cfr_renamed_1;
    }
}

