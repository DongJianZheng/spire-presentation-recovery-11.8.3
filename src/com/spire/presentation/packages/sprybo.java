/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprukq;
import com.spire.presentation.packages.sprwys;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.spryjn;

@sprtea
public abstract class sprybo {
    private boolean cfr_renamed_4;

    public static String cfr_renamed_14138(int arg0) {
        String string = sprxsp.cfr_renamed_12396(arg0);
        Object[] objectArray = new Object[2];
        objectArray[0] = sprebp.cfr_renamed_14247(string.charAt(0));
        objectArray[1] = string.length() > 1 ? sprebp.cfr_renamed_14247(string.charAt(1)) : "";
        return sprraia.cfr_renamed_11562(sprukq.cfr_renamed_9("^\u000bX@\u0014F"), objectArray);
    }

    @sprtea
    public sprybo(boolean bl) {
        this.cfr_renamed_4 = bl;
    }

    public static String cfr_renamed_14892(int[] arg0) {
        int n;
        if (arg0.length == 1) {
            return sprybo.cfr_renamed_14138(arg0[0]);
        }
        StringBuilder stringBuilder = new StringBuilder();
        int[] nArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            sprghha.cfr_renamed_12279(stringBuilder, sprybo.cfr_renamed_14138(nArray[n++]));
            n3 = n;
        }
        return stringBuilder.toString();
    }

    public abstract void cfr_renamed_14890(sprcrn var1);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 3 ^ 3;
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

    @sprtea
    public void cfr_renamed_14853(sprcrn arg0, String arg1) {
        spryjn spryjn2;
        spryjn spryjn3 = spryjn2 = arg0.cfr_renamed_13380();
        spryjn spryjn4 = spryjn2;
        spryjn spryjn5 = spryjn2;
        spryjn spryjn6 = spryjn2;
        spryjn spryjn7 = spryjn2;
        spryjn7.cfr_renamed_11735(sprwys.cfr_renamed_9("-2K5K\u001fk\u0005\"^R\u0003m\u0012Q\u0014vQd\u0018l\u0015p\u0014q\u001ew\u0003a\u0014\"\u0013g\u0016k\u001f"));
        spryjn7.cfr_renamed_11735(sprukq.cfr_renamed_9("\n\u0014\u001bARFO\u0005Y@\\LU"));
        spryjn6.cfr_renamed_11735(sprwys.cfr_renamed_9("\u0013g\u0016k\u001fa\u001cc\u0001"));
        spryjn6.cfr_renamed_11735(sprukq.cfr_renamed_9("\nxl\u007fvBVO@VlUCT"));
        spryjn5.cfr_renamed_11735(sprwys.cfr_renamed_9(">M\"^P\u0014e\u0018q\u0005p\b\"YC\u0015m\u0013gX"));
        spryjn5.cfr_renamed_11735(sprukq.cfr_renamed_9("\u0014jIA^WRK\\\u0005\u0013pxv\u0012"));
        spryjn4.cfr_renamed_11735(sprwys.cfr_renamed_9("^Q\u0004r\u0001n\u0014o\u0014l\u0005\"A"));
        spryjn4.cfr_renamed_11735(sprukq.cfr_renamed_9("\u001b\u0005\u0005_@]"));
        spryjn3.cfr_renamed_14085(sprwys.cfr_renamed_9("-2O\u0010r?c\u001cgQ-\n2\f\"\u0015g\u0017"), arg1);
        spryjn3.cfr_renamed_14085(sprukq.cfr_renamed_9("\u0014fvDKqBU^\u0005@\u0015F\u0005_@]"), this.cfr_renamed_4 ? sprwys.cfr_renamed_9("C") : "1");
        spryjn spryjn8 = spryjn2;
        spryjn spryjn9 = spryjn2;
        spryjn spryjn10 = spryjn2;
        spryjn2.cfr_renamed_11735(sprukq.cfr_renamed_9("\n\u0005Y@\\LUFTA^VKDX@IDUB^"));
        spryjn10.cfr_renamed_11735(sprwys.cfr_renamed_9(">A2A2O>7D7DO"));
        spryjn10.cfr_renamed_11735(sprukq.cfr_renamed_9("^K_FTA^VKDX@IDUB^"));
        this.cfr_renamed_14890(arg0);
        spryjn9.cfr_renamed_11735(sprwys.cfr_renamed_9("\u0014l\u0015a\u001cc\u0001"));
        spryjn9.cfr_renamed_11735(sprukq.cfr_renamed_9("xhZUuDV@\u001bFNWI@UQ_LXQ\u001b\nxhZU\u001bA^CRK^W^VTPIF^\u0005KJK"));
        spryjn8.cfr_renamed_11735("end");
        spryjn8.cfr_renamed_11735("end");
    }
}

