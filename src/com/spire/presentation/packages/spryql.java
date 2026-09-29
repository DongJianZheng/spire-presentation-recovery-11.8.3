/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdvm;
import com.spire.presentation.packages.sprgmm;
import com.spire.presentation.packages.sprhsh;
import com.spire.presentation.packages.sprrnl;
import com.spire.presentation.packages.sprsom;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprxpm;
import java.util.ArrayList;

public class spryql {
    private final sprxpm[] cfr_renamed_3;
    private final sprsom[] cfr_renamed_4;

    public sprxpm[] cfr_renamed_11000() {
        sprxpm[] sprxpmArray = new sprxpm[this.cfr_renamed_3.length];
        System.arraycopy(this.cfr_renamed_3, 0, sprxpmArray, 0, sprxpmArray.length);
        return sprxpmArray;
    }

    public static spryql cfr_renamed_10997(sprdvm arg0) {
        if (!spryql.cfr_renamed_11001(arg0.cfr_renamed_324())) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhsh.cfr_renamed_9("0.=56/'a<'s\u0011\u0018\b\u0011.78s6!.=&s5*16{s")).append(arg0.cfr_renamed_324()).toString());
        }
        return new spryql(sprgmm.cfr_renamed_23(arg0.cfr_renamed_480()));
    }

    public boolean cfr_renamed_11002() {
        int n;
        boolean bl = true;
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.length) {
            sprxpm sprxpm2 = this.cfr_renamed_3[n];
            bl &= sprxpm2.cfr_renamed_4893();
            n2 = ++n;
        }
        return bl;
    }

    public sprco cfr_renamed_568() {
        spryql spryql2 = this;
        return new sprgmm(spryql2.cfr_renamed_3, spryql2.cfr_renamed_4);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static boolean cfr_renamed_11001(int arg0) {
        switch (arg0) {
            case 1: 
            case 3: 
            case 8: 
            case 14: {
                return true;
            }
        }
        return false;
    }

    /*
     * WARNING - void declaration
     */
    public spryql(sprgmm sprgmm2) {
        void arg0;
        spryql spryql2 = this;
        spryql2.cfr_renamed_4 = arg0.cfr_renamed_3262();
        spryql2.cfr_renamed_3 = sprgmm2.cfr_renamed_4896();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4;
        int cfr_ignored_0 = 4 << 4 ^ (2 ^ 5) << 1;
        int n4 = n2;
        int n5 = 4 << 3 ^ 2;
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

    public sprtpl[] cfr_renamed_11003() {
        int n;
        ArrayList<sprtpl> arrayList = new ArrayList<sprtpl>();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.length) {
            if (this.cfr_renamed_3[n].cfr_renamed_4893()) {
                arrayList.add(new sprtpl(this.cfr_renamed_3[n].cfr_renamed_4415()));
            }
            n2 = ++n;
        }
        return arrayList.toArray(new sprtpl[0]);
    }

    public sprrnl[] cfr_renamed_4280() {
        int n;
        sprrnl[] sprrnlArray = new sprrnl[this.cfr_renamed_4.length];
        int n2 = n = 0;
        while (n2 != sprrnlArray.length) {
            int n3 = n;
            sprrnl sprrnl2 = new sprrnl(this.cfr_renamed_4[n]);
            sprrnlArray[n3] = sprrnl2;
            n2 = ++n;
        }
        return sprrnlArray;
    }
}

