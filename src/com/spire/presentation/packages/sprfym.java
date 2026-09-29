/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprfym {
    private static final int cfr_renamed_2 = 76;
    private int cfr_renamed_3;
    private String cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 << 2 ^ 3);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 5;
        int n4 = n2;
        int n5 = (2 ^ 5) << 3 ^ 2;
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

    public boolean cfr_renamed_12445() {
        sprfym sprfym2 = this;
        return sprfym2.cfr_renamed_3 >= sprfym2.cfr_renamed_4.length();
    }

    public static String cfr_renamed_12460(byte[] arg0, String arg1) {
        StringBuilder stringBuilder;
        sprfym sprfym2 = new sprfym(arg0, 0, arg0.length);
        StringBuilder stringBuilder2 = stringBuilder = new StringBuilder();
        while (true) {
            sprghha.cfr_renamed_12279(stringBuilder2, sprfym2.cfr_renamed_12446());
            if (sprfym2.cfr_renamed_12445()) break;
            StringBuilder stringBuilder3 = stringBuilder;
            stringBuilder2 = stringBuilder3;
            sprghha.cfr_renamed_12279(stringBuilder3, arg1);
        }
        sprghha.cfr_renamed_12279(stringBuilder, arg1);
        return stringBuilder.toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprfym(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        this.cfr_renamed_4 = sprpkja.cfr_renamed_509(byArray, (int)arg1, (int)arg2);
    }

    public String cfr_renamed_12446() {
        int n = sprrgga.cfr_renamed_12461(76, this.cfr_renamed_4.length() - this.cfr_renamed_3);
        sprfym sprfym2 = this;
        sprfym sprfym3 = this;
        String string = sprfym2.cfr_renamed_4.substring(sprfym2.cfr_renamed_3, sprfym3.cfr_renamed_3 + n);
        sprfym3.cfr_renamed_3 += n;
        return string;
    }
}

