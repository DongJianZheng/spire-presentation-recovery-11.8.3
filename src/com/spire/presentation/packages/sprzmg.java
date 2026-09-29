/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtwg;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprzmg {
    private final sprtpl cfr_renamed_3;
    private final sprtwg cfr_renamed_4;

    public sprtwg cfr_renamed_7493() {
        return this.cfr_renamed_4;
    }

    public sprzmg(byte[] byArray) throws IOException {
        sprrzm sprrzm2 = new sprrzm(byArray);
        sprzmg sprzmg2 = this;
        sprzmg2.cfr_renamed_3 = new sprtpl(sprrzm2.cfr_renamed_24().cfr_renamed_91());
        sprxgf sprxgf2 = sprrzm2.cfr_renamed_24();
        if (sprxgf2 != null) {
            this.cfr_renamed_4 = new sprtwg(sprxgf2.cfr_renamed_91());
            return;
        }
        this.cfr_renamed_4 = null;
    }

    public byte[] cfr_renamed_91() throws IOException {
        return sproze.cfr_renamed_543(this.cfr_renamed_3.cfr_renamed_91(), this.cfr_renamed_4.cfr_renamed_7494().cfr_renamed_91());
    }

    public sprtpl cfr_renamed_7495() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprzmg(sprtpl sprtpl2, sprtwg sprtwg2) {
        void arg0;
        sprzmg sprzmg2 = this;
        sprzmg2.cfr_renamed_3 = arg0;
        sprzmg2.cfr_renamed_4 = sprtwg2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1 << 1;
        int cfr_ignored_0 = 1 << 3 ^ 5;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
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
}

