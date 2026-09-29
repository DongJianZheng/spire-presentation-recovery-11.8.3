/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradda;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprknk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpjc;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spruml;
import com.spire.presentation.packages.sprwvk;
import com.spire.presentation.packages.spryy;

public class spregl
implements spryy {
    private spruml cfr_renamed_3;
    private sprwvk cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprull {
        byte[] byArray = new byte[arg2 - this.cfr_renamed_4.cfr_renamed_2404()];
        int n = this.cfr_renamed_3.cfr_renamed_3064(arg0, arg1, byArray, 0);
        spregl spregl2 = this;
        this.cfr_renamed_3.cfr_renamed_3064(arg0, arg1 + 8, byArray, 8);
        spregl2.cfr_renamed_3.cfr_renamed_3064(arg0, arg1 + 16, byArray, 16);
        this.cfr_renamed_3.cfr_renamed_3064(arg0, arg1 + 24, byArray, 24);
        byte[] byArray2 = new byte[this.cfr_renamed_4.cfr_renamed_2404()];
        spregl2.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
        this.cfr_renamed_4.cfr_renamed_1219(byArray2, 0);
        byte[] byArray3 = new byte[this.cfr_renamed_4.cfr_renamed_2404()];
        System.arraycopy(arg0, arg1 + arg2 - 4, byArray3, 0, this.cfr_renamed_4.cfr_renamed_2404());
        if (!sproze.cfr_renamed_559(byArray2, byArray3)) {
            throw new IllegalStateException(spradda.cfr_renamed_9("a\u0017oVa\u001f\u007f\u001bm\u0002o\u001e"));
        }
        return byArray;
    }

    public spregl() {
        spregl spregl2 = this;
        this.cfr_renamed_3 = new spruml();
        spregl2.cfr_renamed_4 = new sprwvk();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_1575(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4.cfr_renamed_1197(byArray, n, n2);
        spregl spregl2 = this;
        byte[] byArray2 = new byte[n2 + spregl2.cfr_renamed_4.cfr_renamed_2404()];
        spregl2.cfr_renamed_3.cfr_renamed_3064((byte[])arg0, (int)arg1, byArray2, 0);
        this.cfr_renamed_3.cfr_renamed_3064((byte[])arg0, (int)(arg1 + 8), byArray2, 8);
        this.cfr_renamed_3.cfr_renamed_3064((byte[])arg0, (int)(arg1 + 16), byArray2, 16);
        this.cfr_renamed_3.cfr_renamed_3064((byte[])arg0, (int)(arg1 + 24), byArray2, 24);
        this.cfr_renamed_4.cfr_renamed_1219(byArray2, (int)arg2);
        return byArray2;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        sprbj sprbj2;
        if (arg1 instanceof sprbgk) {
            sprbj2 = (sprbgk)arg1;
            arg1 = ((sprbgk)sprbj2).cfr_renamed_284();
        }
        sprbj2 = (sprknk)arg1;
        spregl spregl2 = this;
        spregl2.cfr_renamed_3.cfr_renamed_5535(arg0, ((sprknk)sprbj2).cfr_renamed_284());
        spregl2.cfr_renamed_4.cfr_renamed_5692(new sprkpk(((sprknk)sprbj2).cfr_renamed_284(), ((sprknk)sprbj2).cfr_renamed_9207()));
    }

    @Override
    public String cfr_renamed_1315() {
        return sprpjc.cfr_renamed_9("?j+qJ\u001dI\u0011Or\nD\b");
    }
}

