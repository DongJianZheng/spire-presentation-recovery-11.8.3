/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbuy;
import com.spire.presentation.packages.sprcgd;
import com.spire.presentation.packages.sprcnd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprrfd;
import com.spire.presentation.packages.sprt;

public class sprvkd
extends sprcnd {
    private long cfr_renamed_0 = 0L;
    private static final byte[] cfr_renamed_1;
    private final sprcgd cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprnld cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        String string;
        String string2 = string = this.cfr_renamed_2.cfr_renamed_1315();
        String string3 = string;
        return new StringBuilder().insert(0, string2.substring(0, string2.indexOf(47) - 1)).append(sprbuy.cfr_renamed_9("]F")).append(string3.substring(string3.indexOf(47) + 1)).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprvkd(sprff sprff2) {
        super(sprff2);
        void arg0;
        sprvkd sprvkd2 = this;
        void v1 = arg0;
        sprvkd2.cfr_renamed_2 = new sprcgd((sprff)v1, v1.cfr_renamed_1195() * 8);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        sprt arg1;
        void arg0;
        this.cfr_renamed_0 = 0L;
        this.cfr_renamed_2.cfr_renamed_1217((boolean)arg0, arg1);
        this.cfr_renamed_3 = arg0;
        if (sprt2 instanceof sprnjd) {
            arg1 = ((sprnjd)arg1).cfr_renamed_284();
        }
        if (arg1 instanceof spraed) {
            arg1 = ((spraed)arg1).cfr_renamed_284();
        }
        if (arg1 instanceof sprrfd) {
            arg1 = ((sprrfd)arg1).cfr_renamed_284();
        }
        this.cfr_renamed_4 = (sprnld)arg1;
    }

    static {
        byte[] byArray = new byte[32];
        byArray[0] = 105;
        byArray[1] = 0;
        byArray[2] = 114;
        byArray[3] = 34;
        byArray[4] = 100;
        byArray[5] = -55;
        byArray[6] = 4;
        byArray[7] = 35;
        byArray[8] = -115;
        byArray[9] = 58;
        byArray[10] = -37;
        byArray[11] = -106;
        byArray[12] = 70;
        byArray[13] = -23;
        byArray[14] = 42;
        byArray[15] = -60;
        byArray[16] = 24;
        byArray[17] = -2;
        byArray[18] = -84;
        byArray[19] = -108;
        byArray[20] = 0;
        byArray[21] = -19;
        byArray[22] = 7;
        byArray[23] = 18;
        byArray[24] = -64;
        byArray[25] = -122;
        byArray[26] = -36;
        byArray[27] = -62;
        byArray[28] = -17;
        byArray[29] = 76;
        byArray[30] = -87;
        byArray[31] = 43;
        cfr_renamed_1 = byArray;
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_2.cfr_renamed_1195();
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) {
        if (this.cfr_renamed_0 > 0L && this.cfr_renamed_0 % 1024L == 0L) {
            sprff sprff2;
            sprff sprff3 = sprff2 = this.cfr_renamed_2.cfr_renamed_2349();
            sprff3.cfr_renamed_1217(false, this.cfr_renamed_4);
            byte[] byArray = new byte[32];
            sprff3.cfr_renamed_3064(cfr_renamed_1, 0, byArray, 0);
            sprff2.cfr_renamed_3064(cfr_renamed_1, 8, byArray, 8);
            sprff2.cfr_renamed_3064(cfr_renamed_1, 16, byArray, 16);
            sprff2.cfr_renamed_3064(cfr_renamed_1, 24, byArray, 24);
            sprvkd sprvkd2 = this;
            this.cfr_renamed_4 = new sprnld(byArray);
            sprff2.cfr_renamed_1217(true, this.cfr_renamed_4);
            byte[] byArray2 = this.cfr_renamed_2.cfr_renamed_3452();
            sprff2.cfr_renamed_3064(byArray2, 0, byArray2, 0);
            sprvkd sprvkd3 = this;
            sprvkd3.cfr_renamed_2.cfr_renamed_1217(sprvkd3.cfr_renamed_3, new sprnjd(this.cfr_renamed_4, byArray2));
        }
        sprvkd sprvkd4 = this;
        ++sprvkd4.cfr_renamed_0;
        return sprvkd4.cfr_renamed_2.cfr_renamed_3272(arg0);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_0 = 0L;
        this.cfr_renamed_2.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprjkd, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprvkd sprvkd2 = this;
        sprvkd2.cfr_renamed_505(byArray, (int)arg1, sprvkd2.cfr_renamed_2.cfr_renamed_1195(), (byte[])arg2, (int)arg3);
        return sprvkd2.cfr_renamed_2.cfr_renamed_1195();
    }
}

