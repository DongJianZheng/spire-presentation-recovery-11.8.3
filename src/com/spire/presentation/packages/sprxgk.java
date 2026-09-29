/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprhp;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprvnk;

public class sprxgk {
    private final sprhp cfr_renamed_0;
    private final sprug<sprtpl> cfr_renamed_1;
    private final long cfr_renamed_2;
    private final sprcom cfr_renamed_3;
    private final sprvnk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprxgk(sprug<sprtpl> sprug2, long l, sprvnk sprvnk2, sprhp sprhp2, sprcom sprcom2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxgk sprxgk2 = this;
        sprxgk sprxgk3 = this;
        this.cfr_renamed_1 = arg0;
        sprxgk3.cfr_renamed_2 = arg1;
        sprxgk3.cfr_renamed_4 = arg2;
        sprxgk2.cfr_renamed_0 = arg3;
        sprxgk2.cfr_renamed_3 = sprcom2;
    }

    public Object cfr_renamed_9701() {
        return this.cfr_renamed_0.cfr_renamed_9701();
    }

    public boolean cfr_renamed_9800() {
        return this.cfr_renamed_2 < System.currentTimeMillis();
    }

    public sprcom cfr_renamed_1598() {
        return this.cfr_renamed_3;
    }

    public sprhp cfr_renamed_9765() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_9801() {
        return this.cfr_renamed_4 == null;
    }

    public long cfr_renamed_0() {
        return this.cfr_renamed_2;
    }

    public sprvnk cfr_renamed_9781() {
        return this.cfr_renamed_4;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 3;
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

    public sprug<sprtpl> cfr_renamed_9802() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprxgk(sprug<sprtpl> sprug2, long l, sprvnk sprvnk2, sprhp sprhp2) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprxgk sprxgk2 = this;
        sprxgk sprxgk3 = this;
        this.cfr_renamed_1 = arg0;
        sprxgk3.cfr_renamed_2 = arg1;
        sprxgk3.cfr_renamed_4 = arg2;
        sprxgk2.cfr_renamed_0 = arg3;
        sprxgk2.cfr_renamed_3 = null;
    }
}

