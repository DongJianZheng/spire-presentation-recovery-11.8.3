/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravo;
import com.spire.presentation.packages.sprcep;
import com.spire.presentation.packages.sprkvo;
import com.spire.presentation.packages.sprrzo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprujo;

@sprtea
public abstract class spriro
extends spravo {
    private int cfr_renamed_0;
    private sprkvo cfr_renamed_1;
    private int cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprcep cfr_renamed_4;

    public abstract void cfr_renamed_18878(sprujo var1, long var2, int var4, int var5, int[] var6, int var7);

    public sprkvo cfr_renamed_18859() {
        return this.cfr_renamed_1;
    }

    @Override
    public void cfr_renamed_18686(sprujo arg0) {
        sprujo sprujo2 = arg0;
        spriro spriro2 = this;
        sprujo sprujo3 = arg0;
        long l = sprujo3.cfr_renamed_14060().cfr_renamed_3274();
        sprujo sprujo4 = arg0;
        this.cfr_renamed_18888(sprujo4.cfr_renamed_13218());
        spriro2.cfr_renamed_12827(sprujo4.cfr_renamed_13218());
        int n = sprujo2.cfr_renamed_13218();
        int n2 = sprujo3.cfr_renamed_13218();
        int n3 = sprujo2.cfr_renamed_13218();
        long l2 = (spriro2.cfr_renamed_2704() & 0xFFFF) == 1 ? arg0.cfr_renamed_13220() : 0L;
        spriro spriro3 = this;
        spriro3.cfr_renamed_18889(sprkvo.cfr_renamed_18689(arg0, l + (long)(n & 0xFFFF)));
        if (spriro3.cfr_renamed_18890()) {
            return;
        }
        sprujo sprujo5 = arg0;
        long l3 = l;
        this.cfr_renamed_18891(sprcep.cfr_renamed_18689(sprujo5, l3 + (long)(n2 & 0xFFFF)));
        this.cfr_renamed_18892(sprujo5, l3 + (long)(n3 & 0xFFFF));
        if ((l2 & 0xFFFFFFFFL) > 0L) {
            this.cfr_renamed_18869(arg0, l + (l2 & 0xFFFFFFFFL));
        }
    }

    @sprtea
    public boolean cfr_renamed_18890() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_2704() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public void cfr_renamed_18893(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    private /* synthetic */ void cfr_renamed_18891(sprcep arg0) {
        this.cfr_renamed_4 = arg0;
    }

    private /* synthetic */ void cfr_renamed_18889(sprkvo arg0) {
        this.cfr_renamed_1 = arg0;
    }

    private /* synthetic */ void cfr_renamed_18892(sprujo arg0, long arg1) {
        int n;
        arg0.cfr_renamed_14060().cfr_renamed_11547(arg1, 0);
        sprujo sprujo2 = arg0;
        int[] nArray = sprrzo.cfr_renamed_18661(sprujo2, sprujo2.cfr_renamed_13218() & 0xFFFF);
        int n2 = nArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            int n4 = nArray[n];
            long l = arg1 + (long)(n4 & 0xFFFF);
            arg0.cfr_renamed_14060().cfr_renamed_11547(l, 0);
            sprujo sprujo3 = arg0;
            int n5 = sprujo3.cfr_renamed_13218();
            int n6 = sprujo3.cfr_renamed_13218();
            int[] nArray2 = sprrzo.cfr_renamed_18661(sprujo3, sprujo3.cfr_renamed_13218() & 0xFFFF);
            int n7 = (n6 & 0xFFFF & 0x10) == 16 ? arg0.cfr_renamed_13218() : 0;
            this.cfr_renamed_18878(arg0, l, n5, n6, nArray2, n7);
            n3 = ++n;
        }
    }

    public int cfr_renamed_2703() {
        return this.cfr_renamed_2;
    }

    public sprcep cfr_renamed_18877() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ void cfr_renamed_18888(int arg0) {
        this.cfr_renamed_2 = arg0;
    }

    private /* synthetic */ void cfr_renamed_12827(int arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public abstract void cfr_renamed_18869(sprujo var1, long var2);
}

