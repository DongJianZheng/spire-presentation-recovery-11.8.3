/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbxp;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprzofa;

public class sprxll {
    public int cfr_renamed_2;
    private final sprwn cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public sprxll(sprwn sprwn2) {
        this.cfr_renamed_3 = sprwn2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 2 << 1;
        int cfr_ignored_0 = 3 << 3 ^ 3;
        int n4 = n2;
        int n5 = 5 << 4;
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

    public byte[] cfr_renamed_1206() throws sprull {
        sprxll sprxll2 = this;
        byte[] byArray = this.cfr_renamed_3.cfr_renamed_1337(sprxll2.cfr_renamed_4, 0, this.cfr_renamed_2);
        sprxll2.cfr_renamed_41();
        return byArray;
    }

    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprxll sprxll2 = this;
        sprxll2.cfr_renamed_41();
        sprxll2.cfr_renamed_3.cfr_renamed_5535(arg0, arg1);
        sprxll2.cfr_renamed_4 = new byte[sprxll2.cfr_renamed_3.cfr_renamed_1344() + (arg0 ? 1 : 0)];
        this.cfr_renamed_2 = 0;
    }

    public int cfr_renamed_1339() {
        return this.cfr_renamed_3.cfr_renamed_1339();
    }

    public int cfr_renamed_3882() {
        return this.cfr_renamed_2;
    }

    public sprwn cfr_renamed_2349() {
        return this.cfr_renamed_3;
    }

    public void cfr_renamed_2494(byte[] arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            return;
        }
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprbxp.cfr_renamed_9("l\u007fA9[>G\u007fY{\u000f\u007f\u000fpJyNjFhJ>Fp_k[>C{Ay[v\u000e"));
        }
        if (this.cfr_renamed_2 + arg2 > this.cfr_renamed_4.length) {
            throw new sprddl(sprzofa.cfr_renamed_9("\u0013e\u0006t\u001fa\u00061\u0006~Ra\u0000~\u0011t\u0001bR|\u0017b\u0001p\u0015tRe\u001d~R}\u001d\u007f\u00151\u0014~\u00001\u0011x\u0002y\u0017c"));
        }
        sprxll sprxll2 = this;
        System.arraycopy(arg0, arg1, sprxll2.cfr_renamed_4, sprxll2.cfr_renamed_2, arg2);
        this.cfr_renamed_2 += arg2;
    }

    public void cfr_renamed_41() {
        if (this.cfr_renamed_4 != null) {
            int n;
            int n2 = n = 0;
            while (n2 < this.cfr_renamed_4.length) {
                this.cfr_renamed_4[n++] = 0;
                n2 = n;
            }
        }
        this.cfr_renamed_2 = 0;
    }

    public void cfr_renamed_3883(byte arg0) {
        sprxll sprxll2 = this;
        if (sprxll2.cfr_renamed_2 >= sprxll2.cfr_renamed_4.length) {
            throw new sprddl(sprbxp.cfr_renamed_9("\u007f[jJs_j\u000fj@>_l@}Jm\\>B{\\mNyJ>[q@>CqAy\u000fx@l\u000f}FnG{]"));
        }
        this.cfr_renamed_4[this.cfr_renamed_2++] = arg0;
    }

    public int cfr_renamed_1344() {
        return this.cfr_renamed_3.cfr_renamed_1344();
    }
}

