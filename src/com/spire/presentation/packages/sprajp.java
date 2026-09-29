/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprajp {
    private long cfr_renamed_0;
    private String cfr_renamed_1;
    private long cfr_renamed_2;
    private int cfr_renamed_3;
    public long cfr_renamed_4;

    public sprajp(long arg0, int arg1, long arg2, long arg3) {
        sprajp sprajp2 = this;
        sprajp sprajp3 = this;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_18910(arg1);
        sprajp3.cfr_renamed_18911(arg2);
        sprajp3.cfr_renamed_11561(arg3);
        sprajp2.cfr_renamed_18912(sprrzo.cfr_renamed_18658(sprajp2.cfr_renamed_4));
    }

    public void cfr_renamed_18911(long arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public int cfr_renamed_18913() {
        return this.cfr_renamed_3;
    }

    public sprajp cfr_renamed_12099() {
        if ((this.cfr_renamed_4 & 0xFFFFFFFFL) != 0L) {
            return new sprajp(this.cfr_renamed_4, this.cfr_renamed_18913(), this.cfr_renamed_8906(), this.cfr_renamed_806());
        }
        return new sprajp(this.cfr_renamed_8159(), this.cfr_renamed_18913(), this.cfr_renamed_8906(), this.cfr_renamed_806());
    }

    public long cfr_renamed_8906() {
        return this.cfr_renamed_0;
    }

    public sprajp(sprkto arg0) {
        sprkto sprkto2 = arg0;
        this(sprkto2.cfr_renamed_0, sprkto2.cfr_renamed_4, arg0.cfr_renamed_3, arg0.cfr_renamed_2);
    }

    public void cfr_renamed_11561(long arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3 << 1;
        int cfr_ignored_0 = 4 << 4 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 2;
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

    /*
     * WARNING - void declaration
     */
    public sprajp(String string, int n, long l, long l2) {
        void arg3;
        void arg2;
        void arg1;
        sprajp sprajp2 = this;
        sprajp sprajp3 = this;
        this.cfr_renamed_4 = 0L;
        sprajp3.cfr_renamed_18910((int)arg1);
        sprajp3.cfr_renamed_18911((long)arg2);
        sprajp2.cfr_renamed_11561((long)arg3);
        sprajp2.cfr_renamed_18912(string);
    }

    public String cfr_renamed_8159() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_18912(String arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public long cfr_renamed_806() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_18910(int arg0) {
        this.cfr_renamed_3 = arg0;
    }
}

