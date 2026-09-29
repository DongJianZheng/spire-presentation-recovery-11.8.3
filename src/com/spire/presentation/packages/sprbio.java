/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprhsp;
import com.spire.presentation.packages.sprrpp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxno;
import com.spire.presentation.packages.sprxt;

@sprtea
public class sprbio {
    private sprrpp cfr_renamed_3;
    private sprggo cfr_renamed_4;

    @sprtea
    public void cfr_renamed_722() {
        sprbio sprbio2 = this;
        sprbio2.cfr_renamed_16695();
        sprbio2.cfr_renamed_3.cfr_renamed_722();
    }

    public sprxno cfr_renamed_16063() {
        return this.cfr_renamed_4.cfr_renamed_16063();
    }

    public void cfr_renamed_13414(int arg0, Object arg1) {
        this.cfr_renamed_3.cfr_renamed_12962(arg0, arg1);
    }

    public sprbio(sprggo sprggo2) {
        sprbio sprbio2 = this;
        this.cfr_renamed_3 = new sprrpp();
        this.cfr_renamed_4 = sprggo2;
    }

    private /* synthetic */ void cfr_renamed_16695() {
        sprhsp sprhsp2 = this.cfr_renamed_3.cfr_renamed_12162();
        block0: while (true) {
            sprhsp sprhsp3 = sprhsp2;
            while (sprhsp3.cfr_renamed_15064()) {
                if (!(sprhsp2.cfr_renamed_15066() instanceof sprxt)) continue block0;
                ((sprxt)sprhsp2.cfr_renamed_15066()).dispose();
                sprhsp3 = sprhsp2;
            }
            break;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2;
        int cfr_ignored_0 = 5 << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4;
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

    public Object cfr_renamed_576(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_576(arg0);
    }
}

