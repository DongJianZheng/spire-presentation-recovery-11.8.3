/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfgja;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprboo {
    private sprfgja cfr_renamed_3;
    private static final long cfr_renamed_4 = 3686797314L;

    public void cfr_renamed_11594(byte arg0) {
        this.cfr_renamed_3.cfr_renamed_11594(arg0);
    }

    public void cfr_renamed_16017() {
        this.cfr_renamed_3.cfr_renamed_15097(3686797314L);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16015(sprgeja sprgeja2) {
        void arg0;
        sprboo sprboo2 = this;
        void v1 = arg0;
        this.cfr_renamed_15109(arg0.cfr_renamed_1980());
        this.cfr_renamed_15109(v1.spr\u3181());
        sprboo2.cfr_renamed_15109(v1.cfr_renamed_1942());
        sprboo2.cfr_renamed_15109(sprgeja2.cfr_renamed_1452());
    }

    public void cfr_renamed_16014(sprwbp arg0) {
        this.cfr_renamed_3.cfr_renamed_12761(arg0.cfr_renamed_13088());
    }

    public sprboo(sprfgja sprfgja2) {
        this.cfr_renamed_3 = sprfgja2;
    }

    public void cfr_renamed_15108(int arg0) {
        this.cfr_renamed_3.cfr_renamed_15085(arg0);
    }

    public void cfr_renamed_9011(int arg0) {
        this.cfr_renamed_3.cfr_renamed_12761(arg0);
    }

    public void cfr_renamed_15112(short arg0) {
        this.cfr_renamed_3.cfr_renamed_12762(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16013(sprqgp sprqgp2) {
        void arg0;
        sprboo sprboo2 = this;
        void v1 = arg0;
        sprboo sprboo3 = this;
        void v3 = arg0;
        this.cfr_renamed_15109(v3.cfr_renamed_12595());
        sprboo3.cfr_renamed_15109(v3.cfr_renamed_12596());
        sprboo3.cfr_renamed_15109(arg0.cfr_renamed_12597());
        this.cfr_renamed_15109(v1.cfr_renamed_12598());
        sprboo2.cfr_renamed_15109(v1.cfr_renamed_12599());
        sprboo2.cfr_renamed_15109(sprqgp2.cfr_renamed_12600());
    }

    public void cfr_renamed_14093(float[] arg0) {
        int n;
        this.cfr_renamed_9011(arg0.length);
        float[] fArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            this.cfr_renamed_15109(fArray[n++]);
            n3 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16040(sprsuja sprsuja2) {
        void arg0;
        sprboo sprboo2 = this;
        sprboo2.cfr_renamed_15109(arg0.cfr_renamed_1980());
        sprboo2.cfr_renamed_15109(sprsuja2.spr\u3181());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
        int cfr_ignored_0 = 4 << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = 5 << 4 ^ 4 << 1;
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

    public void cfr_renamed_16018(int arg0) {
        int n;
        int n2 = arg0 % 4 == 0 ? 0 : 4 - arg0 % 4;
        int n3 = n = 0;
        while (n3 < n2) {
            this.cfr_renamed_11594((byte)0);
            n3 = ++n;
        }
    }

    public void cfr_renamed_9854(byte[] arg0) {
        this.cfr_renamed_3.cfr_renamed_9854(arg0);
    }

    public void cfr_renamed_15098(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_15098(arg0, arg1, arg2);
    }

    public void cfr_renamed_15104(long arg0) {
        this.cfr_renamed_3.cfr_renamed_15097(arg0);
    }

    public void cfr_renamed_15109(float arg0) {
        this.cfr_renamed_3.cfr_renamed_15109(arg0);
    }
}

