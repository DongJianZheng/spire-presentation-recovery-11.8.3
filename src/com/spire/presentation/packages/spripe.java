/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.spriae;
import com.spire.presentation.packages.sprkme;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmpe;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprome;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtqe;
import com.spire.presentation.packages.sprxse;

public class spripe {
    private sprkme cfr_renamed_79;
    private static final int cfr_renamed_107 = 1;
    private int cfr_renamed_132;
    private sprome cfr_renamed_102;
    private sprnje cfr_renamed_93;
    private spriae cfr_renamed_86;
    private static final int cfr_renamed_152 = 0;
    private static final int cfr_renamed_112 = 1;
    private sprbne cfr_renamed_119;
    private static final int cfr_renamed_91 = 2;
    private sprxse cfr_renamed_0;
    private sprooe cfr_renamed_1;
    private sprszd cfr_renamed_2;
    private static final int cfr_renamed_3 = 3;
    private sprere cfr_renamed_4;

    public void cfr_renamed_4769(sprxse arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public void cfr_renamed_11(sprooe arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_4770(sprnje arg0) {
        this.cfr_renamed_93 = arg0;
    }

    public sprtqe cfr_renamed_1451() {
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_132 != 1) {
            sprlre2.cfr_renamed_49(new sprooe(this.cfr_renamed_132));
        }
        sprlre sprlre3 = sprlre2;
        spripe spripe2 = this;
        sprlre sprlre4 = sprlre2;
        sprlre4.cfr_renamed_49(this.cfr_renamed_102);
        sprlre4.cfr_renamed_49(this.cfr_renamed_93);
        sprlre3.cfr_renamed_49(spripe2.cfr_renamed_1);
        sprlre3.cfr_renamed_49(spripe2.cfr_renamed_0);
        if (this.cfr_renamed_79 != null) {
            sprlre2.cfr_renamed_49(new sprhse(0 != 0, 0, this.cfr_renamed_79));
        }
        if (this.cfr_renamed_86 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 1, this.cfr_renamed_86));
        }
        if (this.cfr_renamed_4 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 2, this.cfr_renamed_4));
        }
        if (this.cfr_renamed_119 != null) {
            sprlre2.cfr_renamed_49(new sprhse(false, 3, this.cfr_renamed_119));
        }
        if (this.cfr_renamed_2 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_2);
        }
        return sprtqe.cfr_renamed_23(new sprpse(sprlre2));
    }

    public void cfr_renamed_4771(sprkme arg0) {
        this.cfr_renamed_79 = arg0;
    }

    public void cfr_renamed_4772(spriae arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public void cfr_renamed_4767(int arg0) {
        this.cfr_renamed_132 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_4773(sprmpe[] sprmpeArray) {
        void arg0;
        spripe spripe2 = this;
        spripe2.cfr_renamed_119 = new sprpse((spra[])arg0);
    }

    public void cfr_renamed_4774(sprome arg0) {
        this.cfr_renamed_102 = arg0;
    }

    public void cfr_renamed_4775(sprere arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_2603(sprszd arg0) {
        this.cfr_renamed_2 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public spripe(sprome sprome2, sprnje sprnje2, sprooe sprooe2, sprxse sprxse2) {
        void arg2;
        void arg1;
        void arg0;
        spripe spripe2 = this;
        spripe spripe3 = this;
        this.cfr_renamed_132 = 1;
        spripe3.cfr_renamed_102 = arg0;
        spripe3.cfr_renamed_93 = arg1;
        spripe2.cfr_renamed_1 = arg2;
        spripe2.cfr_renamed_0 = sprxse2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3;
        int cfr_ignored_0 = 5 << 4 ^ 1;
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 << 2 ^ 3);
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

