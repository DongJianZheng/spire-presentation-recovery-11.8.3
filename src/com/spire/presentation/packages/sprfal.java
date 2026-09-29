/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbki;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spretk;
import com.spire.presentation.packages.sprjlk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprsrk;
import com.spire.presentation.packages.sprtpk;

public class sprfal
extends sprsrk {
    private boolean cfr_renamed_0;
    private long cfr_renamed_1 = 0L;
    private sprtpk cfr_renamed_2;
    private static final byte[] cfr_renamed_3;
    private final spretk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprddl, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprfal sprfal2 = this;
        sprfal2.cfr_renamed_505(byArray, (int)arg1, sprfal2.cfr_renamed_4.cfr_renamed_1195(), (byte[])arg2, (int)arg3);
        return sprfal2.cfr_renamed_4.cfr_renamed_1195();
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) {
        if (this.cfr_renamed_1 > 0L && this.cfr_renamed_1 % 1024L == 0L) {
            sprmr sprmr2;
            sprmr sprmr3 = sprmr2 = this.cfr_renamed_4.cfr_renamed_2349();
            sprmr3.cfr_renamed_5535(false, this.cfr_renamed_2);
            byte[] byArray = new byte[32];
            sprmr3.cfr_renamed_3064(cfr_renamed_3, 0, byArray, 0);
            sprmr2.cfr_renamed_3064(cfr_renamed_3, 8, byArray, 8);
            sprmr2.cfr_renamed_3064(cfr_renamed_3, 16, byArray, 16);
            sprmr2.cfr_renamed_3064(cfr_renamed_3, 24, byArray, 24);
            sprfal sprfal2 = this;
            this.cfr_renamed_2 = new sprtpk(byArray);
            sprmr2.cfr_renamed_5535(true, this.cfr_renamed_2);
            byte[] byArray2 = this.cfr_renamed_4.cfr_renamed_3452();
            sprmr2.cfr_renamed_3064(byArray2, 0, byArray2, 0);
            sprfal sprfal3 = this;
            sprfal3.cfr_renamed_4.cfr_renamed_5535(sprfal3.cfr_renamed_0, new sprkpk(this.cfr_renamed_2, byArray2));
        }
        sprfal sprfal4 = this;
        ++sprfal4.cfr_renamed_1;
        return sprfal4.cfr_renamed_4.cfr_renamed_3272(arg0);
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_4.cfr_renamed_1195();
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_1 = 0L;
        this.cfr_renamed_4.cfr_renamed_41();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        sprbj arg1;
        void arg0;
        this.cfr_renamed_1 = 0L;
        this.cfr_renamed_4.cfr_renamed_5535((boolean)arg0, arg1);
        this.cfr_renamed_0 = arg0;
        if (sprbj2 instanceof sprkpk) {
            arg1 = ((sprkpk)arg1).cfr_renamed_284();
        }
        if (arg1 instanceof sprbgk) {
            arg1 = ((sprbgk)arg1).cfr_renamed_284();
        }
        if (arg1 instanceof sprjlk) {
            arg1 = ((sprjlk)arg1).cfr_renamed_284();
        }
        this.cfr_renamed_2 = (sprtpk)arg1;
    }

    @Override
    public String cfr_renamed_1315() {
        String string;
        String string2 = string = this.cfr_renamed_4.cfr_renamed_1315();
        String string3 = string;
        return new StringBuilder().insert(0, string2.substring(0, string2.indexOf(47))).append(sprbki.cfr_renamed_9(",\u0001")).append(string3.substring(string3.indexOf(47) + 1)).toString();
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
        cfr_renamed_3 = byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprfal(sprmr sprmr2) {
        super(sprmr2);
        void arg0;
        sprfal sprfal2 = this;
        void v1 = arg0;
        sprfal2.cfr_renamed_4 = new spretk((sprmr)v1, v1.cfr_renamed_1195() * 8);
    }
}

