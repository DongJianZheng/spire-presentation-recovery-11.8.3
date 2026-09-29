/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabz;
import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprauk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgvk;

public final class sprgtk
implements spraq {
    private int cfr_renamed_119;
    private static final int cfr_renamed_91 = 128;
    private int cfr_renamed_0;
    private final int[] cfr_renamed_1;
    private sprgvk cfr_renamed_2;
    private final sprauk cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        if (this.cfr_renamed_2 != null) {
            sprgtk sprgtk2 = this;
            sprgtk2.cfr_renamed_3.cfr_renamed_5183(sprgtk2.cfr_renamed_2);
        }
        this.cfr_renamed_10102();
    }

    @Override
    public int cfr_renamed_2404() {
        return 4;
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        sprgtk sprgtk2 = this;
        sprgtk2.cfr_renamed_3.cfr_renamed_5535(true, arg0);
        sprgtk2.cfr_renamed_2 = (sprgvk)sprgtk2.cfr_renamed_3.cfr_renamed_461();
        this.cfr_renamed_10102();
    }

    private /* synthetic */ int cfr_renamed_10109(int arg0) {
        sprgtk sprgtk2 = this;
        int n = sprgtk2.cfr_renamed_1[sprgtk2.cfr_renamed_4];
        if (arg0 == 0) {
            return n;
        }
        sprgtk sprgtk3 = this;
        int n2 = sprgtk3.cfr_renamed_1[(sprgtk3.cfr_renamed_4 + 1) % this.cfr_renamed_1.length];
        return n << arg0 | n2 >>> 32 - arg0;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprgtk sprgtk2 = this;
        sprgtk2.cfr_renamed_10103();
        int n = sprgtk2.cfr_renamed_119 * 8;
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

    private /* synthetic */ void cfr_renamed_10102() {
        int n;
        this.cfr_renamed_0 = 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length - 1) {
            this.cfr_renamed_1[n++] = this.cfr_renamed_3.cfr_renamed_10104();
            n2 = n;
        }
        this.cfr_renamed_4 = this.cfr_renamed_1.length - 1;
        this.cfr_renamed_119 = 3;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprabz.cfr_renamed_9("ohV,\u0007%x|V");
    }

    private /* synthetic */ int cfr_renamed_10110() {
        if (this.cfr_renamed_119 != 0) {
            return this.cfr_renamed_3.cfr_renamed_10104();
        }
        this.cfr_renamed_4 = (this.cfr_renamed_4 + 1) % this.cfr_renamed_1.length;
        sprgtk sprgtk2 = this;
        return sprgtk2.cfr_renamed_1[sprgtk2.cfr_renamed_4];
    }

    private /* synthetic */ void cfr_renamed_10103() {
        sprgtk sprgtk2 = this;
        sprgtk2.cfr_renamed_119 = (sprgtk2.cfr_renamed_119 + 1) % 4;
        if (sprgtk2.cfr_renamed_119 == 0) {
            sprgtk sprgtk3 = this;
            sprgtk3.cfr_renamed_1[this.cfr_renamed_4] = this.cfr_renamed_3.cfr_renamed_10104();
            this.cfr_renamed_4 = (sprgtk3.cfr_renamed_4 + 1) % this.cfr_renamed_1.length;
        }
    }

    public sprgtk() {
        sprgtk sprgtk2 = this;
        this.cfr_renamed_3 = new sprauk(null);
        this.cfr_renamed_1 = new int[2];
    }

    private /* synthetic */ void cfr_renamed_10106(int arg0) {
        this.cfr_renamed_0 ^= this.cfr_renamed_10109(arg0);
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprgtk sprgtk2 = this;
        sprgtk2.cfr_renamed_10103();
        sprgtk sprgtk3 = this;
        sprgtk2.cfr_renamed_0 ^= sprgtk3.cfr_renamed_10109(this.cfr_renamed_119 * 8);
        sprgtk3.cfr_renamed_0 ^= this.cfr_renamed_10110();
        sprgvk.cfr_renamed_10108(sprgtk2.cfr_renamed_0, arg0, arg1);
        sprgtk2.cfr_renamed_41();
        return sprgtk2.cfr_renamed_2404();
    }
}

