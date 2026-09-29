/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfo;
import com.spire.presentation.packages.sprfgja;
import com.spire.presentation.packages.sprnmp;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprwgo {
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private boolean cfr_renamed_0;
    private sprfgja cfr_renamed_1;
    private long cfr_renamed_2;
    private long cfr_renamed_3;
    private long cfr_renamed_4;

    public void cfr_renamed_15970() {
        if (!this.cfr_renamed_0) {
            return;
        }
        sprwgo sprwgo2 = this;
        sprwgo2.cfr_renamed_0 = false;
        long l = sprwgo2.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_3274();
        sprwgo sprwgo3 = this;
        int n = (int)(l - sprwgo3.cfr_renamed_2);
        sprwgo3.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_2 + 4L);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(n);
        if (sprwgo2.cfr_renamed_91 == 70) {
            this.cfr_renamed_1.cfr_renamed_12761(n - 12);
        }
        this.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_11548(l);
    }

    public void cfr_renamed_15971(int arg0) {
        if (this.cfr_renamed_0) {
            return;
        }
        sprwgo sprwgo2 = this;
        this.cfr_renamed_0 = true;
        this.cfr_renamed_2 = this.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_3274();
        sprwgo2.cfr_renamed_91 = arg0;
        ++this.cfr_renamed_119;
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(arg0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
    }

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 5;
        int cfr_ignored_0 = 1 << 3 ^ 2;
        int n4 = n2;
        int n5 = 2;
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

    public sprwgo(sprfgja sprfgja2) {
        this.cfr_renamed_1 = sprfgja2;
    }

    public void cfr_renamed_15972(sprphja arg0, float arg1, float arg2) {
        sprwgo sprwgo2 = this;
        sprphja sprphja2 = arg0;
        sprwgo sprwgo3 = this;
        this.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_3274();
        sprwgo3.cfr_renamed_15971(1);
        int n = sprnmp.cfr_renamed_15973(sprphja2.cfr_renamed_1942(), arg1);
        int n2 = sprnmp.cfr_renamed_15973(sprphja2.cfr_renamed_1452(), arg2);
        int n3 = n - 1;
        int n4 = n2 - 1;
        int n5 = sprdfo.cfr_renamed_2.cfr_renamed_1942();
        int n6 = sprdfo.cfr_renamed_2.cfr_renamed_1452();
        int n7 = (int)sprnmp.cfr_renamed_15974(n5, arg1);
        int n8 = (int)sprnmp.cfr_renamed_15974(n6, arg2);
        double d = (double)n5 / (double)n7;
        double d2 = (double)n6 / (double)n8;
        double d3 = (double)n3 * 100.0 / d;
        double d4 = (double)n4 * 100.0 / d2;
        sprwgo3.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(n);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(n2);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761((int)d3);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761((int)d4);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(1179469088);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(65536);
        sprwgo2.cfr_renamed_4 = sprwgo2.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_3274();
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(1);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(n5);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(n6);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(n7);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(n8);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761((int)sprnmp.cfr_renamed_15975(sprdfo.cfr_renamed_2.cfr_renamed_1942(), arg1));
        sprwgo2.cfr_renamed_1.cfr_renamed_12761((int)sprnmp.cfr_renamed_15975(sprdfo.cfr_renamed_2.cfr_renamed_1452(), arg2));
        sprwgo2.cfr_renamed_15970();
    }

    public void cfr_renamed_15976() {
        sprwgo sprwgo2 = this;
        sprwgo2.cfr_renamed_15971(14);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(16);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(20);
        sprwgo2.cfr_renamed_15970();
        long l = sprwgo2.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_3274();
        sprwgo2.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_4);
        sprwgo2.cfr_renamed_1.cfr_renamed_15097(l - this.cfr_renamed_3);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(this.cfr_renamed_119);
        sprwgo2.cfr_renamed_1.cfr_renamed_14060().cfr_renamed_11548(l);
    }

    public sprfgja cfr_renamed_14552() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_15977() {
        sprwgo sprwgo2 = this;
        sprwgo2.cfr_renamed_15971(70);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(0);
        sprwgo2.cfr_renamed_1.cfr_renamed_12761(726027589);
    }
}

