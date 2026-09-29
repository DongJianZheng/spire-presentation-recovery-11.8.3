/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprclg;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprkam;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmh;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtom;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprurm;
import com.spire.presentation.packages.sprypg;
import java.io.IOException;

public class sprulg {
    private sprlem cfr_renamed_2;
    private sprrvm cfr_renamed_3;
    private sprco cfr_renamed_4;

    public sprulg(sprpxl arg0) throws IOException {
        this(arg0.cfr_renamed_568());
    }

    public sprulg cfr_renamed_7360(sprlem arg0, sprco arg1) {
        sprulg sprulg2 = this;
        sprulg2.cfr_renamed_3.cfr_renamed_5004(new sprurm(arg0, new sprocn(arg1)));
        return sprulg2;
    }

    public sprulg(sprndm arg0) throws IOException {
        sprulg sprulg2 = this;
        this.cfr_renamed_3 = new sprrvm();
        sprulg2.cfr_renamed_2 = sprdl.cfr_renamed_593;
        this.cfr_renamed_4 = new sprtom(sprdl.cfr_renamed_1197, new sprfvg(arg0.cfr_renamed_91()));
    }

    public sprulg(sprcom arg0, sprmh arg1) {
        sprulg sprulg2 = this;
        this.cfr_renamed_3 = new sprrvm();
        sprulg2.cfr_renamed_2 = sprdl.cfr_renamed_2541;
        this.cfr_renamed_4 = new sprclg(arg0).cfr_renamed_7357(arg1).cfr_renamed_568();
    }

    public sprulg(sprcom sprcom2) {
        sprulg sprulg2 = this;
        sprulg sprulg3 = this;
        sprulg2.cfr_renamed_3 = new sprrvm();
        sprulg2.cfr_renamed_2 = sprdl.cfr_renamed_1497;
        sprulg2.cfr_renamed_4 = sprcom2;
    }

    public sprulg(sprffm arg0) throws IOException {
        sprulg sprulg2 = this;
        this.cfr_renamed_3 = new sprrvm();
        sprulg2.cfr_renamed_2 = sprdl.cfr_renamed_955;
        this.cfr_renamed_4 = new sprtom(sprdl.cfr_renamed_1217, new sprfvg(arg0.cfr_renamed_91()));
    }

    public sprypg cfr_renamed_1451() {
        sprulg sprulg2 = this;
        return new sprypg(new sprkam(sprulg2.cfr_renamed_2, sprulg2.cfr_renamed_4, new sprocn(this.cfr_renamed_3)));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 5;
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

    public sprulg(sprtpl arg0) throws IOException {
        this(arg0.cfr_renamed_568());
    }
}

