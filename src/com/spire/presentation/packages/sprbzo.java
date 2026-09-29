/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvo;
import com.spire.presentation.packages.sprpap;
import com.spire.presentation.packages.sprrpk;
import com.spire.presentation.packages.sprsuo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprzqh;

@sprtea
public class sprbzo {
    private sprpap cfr_renamed_91;
    private int cfr_renamed_0;
    private sprbvo cfr_renamed_1;
    private sprwbp cfr_renamed_2 = sprwbp.cfr_renamed_1447;
    private byte[] cfr_renamed_3;
    private sprsuo cfr_renamed_4;

    @sprtea
    public void cfr_renamed_17594(sprbvo arg0) {
        if (this.cfr_renamed_17602()) {
            throw new IllegalArgumentException(sprzqh.cfr_renamed_9("ha_m^aH$\\eXpIvB$OeBjCp\flMrI$|mT@MpM*"));
        }
        this.cfr_renamed_1 = arg0;
    }

    @sprtea
    public sprbzo(int n) {
        this.cfr_renamed_0 = n;
    }

    @sprtea
    public void cfr_renamed_17603(sprpap arg0) {
        if (this.cfr_renamed_17602()) {
            throw new IllegalArgumentException(sprrpk.cfr_renamed_9("C/t#u/cjw+s>b8ijd+i$h>'\"f<bjD%k%u\u001ef(k/)"));
        }
        this.cfr_renamed_91 = arg0;
    }

    @sprtea
    public boolean cfr_renamed_17602() {
        return this.cfr_renamed_0 == 2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 2;
        int cfr_ignored_0 = 2 ^ 5;
        int n4 = n2;
        int n5 = 1 << 3 ^ 1;
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

    @sprtea
    public void cfr_renamed_17601(byte[] arg0) {
        this.cfr_renamed_3 = arg0;
    }

    @sprtea
    public sprbvo cfr_renamed_17540() {
        return this.cfr_renamed_1;
    }

    @sprtea
    public void cfr_renamed_17588(sprsuo arg0) {
        if (this.cfr_renamed_17602()) {
            throw new IllegalArgumentException(sprzqh.cfr_renamed_9("@IwEvI`\ftMpXa^j\fgMjBkX$DeZa\fTE|ae\\*"));
        }
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public void cfr_renamed_12554(sprwbp arg0) {
        if (!this.cfr_renamed_17602()) {
            throw new IllegalArgumentException(sprrpk.cfr_renamed_9("\u0004h$'.b9n8b.':f>s/u$')f$i%sjo+q/')h&h8)"));
        }
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public sprwbp cfr_renamed_12553() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public sprpap cfr_renamed_14120() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public byte[] cfr_renamed_17621() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public sprsuo cfr_renamed_17596() {
        return this.cfr_renamed_4;
    }
}

