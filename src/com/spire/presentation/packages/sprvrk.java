/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgpa;
import com.spire.presentation.packages.sprjvk;
import com.spire.presentation.packages.sprkqk;

public final class sprvrk
implements spraq {
    private sprjvk cfr_renamed_112;
    private final int cfr_renamed_119;
    private final int[] cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private static final int cfr_renamed_2 = 128;
    private final int[] cfr_renamed_3;
    private final sprkqk cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprgpa.cfr_renamed_9("y*@m\u0016in>@r")).append(this.cfr_renamed_119).toString();
    }

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_112 != null) {
            sprvrk sprvrk2 = this;
            sprvrk2.cfr_renamed_4.cfr_renamed_5183(sprvrk2.cfr_renamed_112);
        }
        this.cfr_renamed_10102();
    }

    private /* synthetic */ void cfr_renamed_10103() {
        sprvrk sprvrk2 = this;
        sprvrk2.cfr_renamed_1 = (sprvrk2.cfr_renamed_1 + 1) % 4;
        if (sprvrk2.cfr_renamed_1 == 0) {
            sprvrk sprvrk3 = this;
            sprvrk3.cfr_renamed_3[this.cfr_renamed_0] = this.cfr_renamed_4.cfr_renamed_10104();
            this.cfr_renamed_0 = (sprvrk3.cfr_renamed_0 + 1) % this.cfr_renamed_3.length;
        }
    }

    private /* synthetic */ void cfr_renamed_10105() {
        sprvrk sprvrk2 = this;
        sprvrk2.cfr_renamed_1 = (sprvrk2.cfr_renamed_1 + 1) % 4;
        if (sprvrk2.cfr_renamed_1 == 0) {
            this.cfr_renamed_0 = (this.cfr_renamed_0 + 1) % this.cfr_renamed_3.length;
        }
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_119 / 8;
    }

    private /* synthetic */ void cfr_renamed_10106(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.length) {
            int n3 = n;
            int n4 = this.cfr_renamed_91[n3] ^ this.cfr_renamed_10107(n, arg0);
            this.cfr_renamed_91[n3] = n4;
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        sprvrk sprvrk2 = this;
        sprvrk2.cfr_renamed_4.cfr_renamed_5535(true, arg0);
        sprvrk2.cfr_renamed_112 = (sprjvk)sprvrk2.cfr_renamed_4.cfr_renamed_461();
        this.cfr_renamed_10102();
    }

    private /* synthetic */ int cfr_renamed_10107(int arg0, int arg1) {
        sprvrk sprvrk2 = this;
        int n = sprvrk2.cfr_renamed_3[(sprvrk2.cfr_renamed_0 + arg0) % this.cfr_renamed_3.length];
        if (arg1 == 0) {
            return n;
        }
        sprvrk sprvrk3 = this;
        int n2 = sprvrk3.cfr_renamed_3[(sprvrk3.cfr_renamed_0 + arg0 + 1) % this.cfr_renamed_3.length];
        return n << arg1 | n2 >>> 32 - arg1;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        int n;
        int n2 = n = 0;
        while (n2 < arg2) {
            int n3 = arg1 + n;
            this.cfr_renamed_1221(arg0[n3]);
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprvrk(int n) {
        void arg0;
        sprvrk sprvrk2 = this;
        sprvrk sprvrk3 = this;
        sprvrk3.cfr_renamed_4 = new sprkqk((int)arg0);
        sprvrk2.cfr_renamed_119 = arg0;
        int n2 = n / 32;
        sprvrk2.cfr_renamed_91 = new int[n2];
        sprvrk2.cfr_renamed_3 = new int[n2 + 1];
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprvrk sprvrk2 = this;
        sprvrk2.cfr_renamed_10103();
        int n = sprvrk2.cfr_renamed_1 * 8;
        int n2 = 128;
        int n3 = 0;
        int n4 = n2;
        while (n4 > 0) {
            if ((arg0 & n2) != 0) {
                this.cfr_renamed_10106(n + n3);
            }
            ++n3;
            n4 = n2 >>= 1;
        }
    }

    private /* synthetic */ void cfr_renamed_10102() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.length) {
            this.cfr_renamed_91[n++] = this.cfr_renamed_4.cfr_renamed_10104();
            n2 = n;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3.length - 1) {
            this.cfr_renamed_3[n++] = this.cfr_renamed_4.cfr_renamed_10104();
            n3 = n;
        }
        this.cfr_renamed_0 = this.cfr_renamed_3.length - 1;
        this.cfr_renamed_1 = 3;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) {
        int n2;
        sprvrk sprvrk2 = this;
        sprvrk2.cfr_renamed_10105();
        sprvrk2.cfr_renamed_10106(sprvrk2.cfr_renamed_1 * 8);
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_91.length) {
            void arg1;
            void arg0;
            sprjvk.cfr_renamed_10108(this.cfr_renamed_91[n2], (byte[])arg0, (int)(arg1 + n2++ * 4));
            n3 = n2;
        }
        sprvrk sprvrk3 = this;
        sprvrk3.cfr_renamed_41();
        return sprvrk3.cfr_renamed_2404();
    }
}

