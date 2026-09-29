/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprbl;
import com.spire.presentation.packages.sprdse;
import com.spire.presentation.packages.sprhg;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrve;
import java.io.IOException;

public class sprvse {
    private sprao cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprooe cfr_renamed_3;
    private spra cfr_renamed_4;

    public sprbl cfr_renamed_4176() throws IOException {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_4 != null) {
            spra spra2 = this.cfr_renamed_4;
            this.cfr_renamed_4 = null;
            return (sprbl)((sprhg)spra2).cfr_renamed_4829(17, false);
        }
        return null;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3 ^ 5;
        int cfr_ignored_0 = 1 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 3 << 3 ^ 3;
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
    public sprvse(sprao sprao2) throws IOException {
        void arg0;
        sprvse sprvse2 = this;
        sprvse2.cfr_renamed_1 = arg0;
        sprvse2.cfr_renamed_3 = sprooe.cfr_renamed_23(sprao2.cfr_renamed_24());
    }

    public sprrve cfr_renamed_4170() throws IOException {
        this.cfr_renamed_2 = true;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_4 instanceof sprhg && ((sprhg)this.cfr_renamed_4).cfr_renamed_312() == 0) {
            this.cfr_renamed_4 = null;
            return sprrve.cfr_renamed_23(((sprao)((sprhg)this.cfr_renamed_4).cfr_renamed_4829(16, false)).cfr_renamed_119());
        }
        return null;
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    public sprbl cfr_renamed_4171() throws IOException {
        if (!this.cfr_renamed_2) {
            this.cfr_renamed_4170();
        }
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        this.cfr_renamed_4 = null;
        return (sprbl)this.cfr_renamed_4;
    }

    public sprdse cfr_renamed_4172() throws IOException {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_4 != null) {
            sprao sprao2 = (sprao)this.cfr_renamed_4;
            this.cfr_renamed_4 = null;
            return new sprdse(sprao2);
        }
        return null;
    }
}

