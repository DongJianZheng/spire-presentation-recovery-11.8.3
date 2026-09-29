/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdjl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvim;
import com.spire.presentation.packages.spryil;

public class sprdlg {
    private final sprtpl[] cfr_renamed_3;
    private final sprcom cfr_renamed_4;

    public sprtpl cfr_renamed_2141() {
        return this.cfr_renamed_3[0];
    }

    public sprdlg(sprcom arg0, sprtpl arg1) {
        sprtpl[] sprtplArray = new sprtpl[1];
        sprtplArray[0] = arg1;
        this(arg0, sprtplArray);
    }

    private /* synthetic */ byte[] cfr_renamed_3955() {
        sprvim sprvim2 = sprvim.cfr_renamed_5322(this.cfr_renamed_3[0].cfr_renamed_98());
        if (sprvim2 == null) {
            return null;
        }
        return sprvim2.cfr_renamed_327();
    }

    public sprcom cfr_renamed_1598() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprdlg(sprcom sprcom2, sprtpl[] sprtplArray) {
        void arg1;
        void arg0;
        sprdlg sprdlg2 = this;
        sprdlg2.cfr_renamed_4 = arg0;
        sprdlg2.cfr_renamed_3 = new sprtpl[sprtplArray.length];
        System.arraycopy(arg1, 0, this.cfr_renamed_3, 0, ((void)arg1).length);
    }

    public sprtpl[] cfr_renamed_2454() {
        sprtpl[] sprtplArray = new sprtpl[this.cfr_renamed_3.length];
        System.arraycopy(this.cfr_renamed_3, 0, sprtplArray, 0, sprtplArray.length);
        return sprtplArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 2;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 3 ^ 5;
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

    public spryil cfr_renamed_7267() {
        return new sprdjl(this.cfr_renamed_3[0].cfr_renamed_102(), this.cfr_renamed_3[0].cfr_renamed_114(), this.cfr_renamed_3955());
    }
}

