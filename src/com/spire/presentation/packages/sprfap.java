/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprfap {
    private short cfr_renamed_1;
    private short cfr_renamed_2;
    private short cfr_renamed_3;
    private short cfr_renamed_4;

    public void cfr_renamed_18645(short arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 3 ^ 4;
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

    public short cfr_renamed_14887() {
        return this.cfr_renamed_2;
    }

    public sprfap() {
    }

    public void cfr_renamed_18646(short arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_18647(short arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public short cfr_renamed_13341() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_18648(short arg0, short arg1, short arg2, short arg3) {
        sprfap sprfap2 = this;
        sprfap2.cfr_renamed_2 = sprrgga.cfr_renamed_18292(sprfap2.cfr_renamed_2, arg0);
        sprfap2.cfr_renamed_4 = sprrgga.cfr_renamed_18292(sprfap2.cfr_renamed_4, arg1);
        sprfap2.cfr_renamed_1 = sprrgga.cfr_renamed_13324(sprfap2.cfr_renamed_1, arg2);
        sprfap2.cfr_renamed_3 = sprrgga.cfr_renamed_13324(sprfap2.cfr_renamed_3, arg3);
    }

    public short cfr_renamed_14888() {
        return this.cfr_renamed_4;
    }

    public sprfap(int arg0, int arg1, int arg2, int arg3) {
        this((short)arg0, (short)arg1, (short)arg2, (short)arg3);
    }

    public short cfr_renamed_14889() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_2 == 0 && this.cfr_renamed_4 == 0 && this.cfr_renamed_1 == 0 && this.cfr_renamed_3 == 0;
    }

    public short cfr_renamed_13487() {
        return this.cfr_renamed_1;
    }

    public short cfr_renamed_13429() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_18649(short arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public short cfr_renamed_13342() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprfap(short s, short s2, short s3, short s4) {
        void arg2;
        void arg1;
        void arg0;
        sprfap sprfap2 = this;
        sprfap sprfap3 = this;
        sprfap3.cfr_renamed_2 = arg0;
        sprfap3.cfr_renamed_4 = arg1;
        sprfap2.cfr_renamed_1 = arg2;
        sprfap2.cfr_renamed_3 = s4;
    }

    public short cfr_renamed_13430() {
        return this.cfr_renamed_2;
    }
}

