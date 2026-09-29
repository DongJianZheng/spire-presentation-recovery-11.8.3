/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

public class sprfef {
    public int cfr_renamed_2;
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    public static sprfef cfr_renamed_712(int arg0, int arg1) {
        int n = 0;
        int n2 = 1;
        int n3 = 1;
        int n4 = 0;
        int n5 = arg1;
        while (n5 != 0) {
            int n6 = arg0 / arg1;
            int n7 = arg0;
            arg0 = arg1;
            arg1 = n7 % arg1;
            n7 = n;
            n = n2 - n6 * n;
            n2 = n7;
            n7 = n3;
            n3 = n4 - n6 * n3;
            n4 = n7;
            n5 = arg1;
        }
        sprfef sprfef2 = new sprfef();
        sprfef2.cfr_renamed_3 = n2;
        sprfef2.cfr_renamed_4 = n4;
        sprfef2.cfr_renamed_2 = arg0;
        return sprfef2;
    }

    private /* synthetic */ sprfef() {
    }
}

