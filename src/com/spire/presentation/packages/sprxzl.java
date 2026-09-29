/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmkaa;
import com.spire.presentation.packages.sprolha;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryfm;

public class sprxzl
extends sprqqe {
    private sprlem cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private static final byte[] cfr_renamed_3;
    private spryfm cfr_renamed_4;

    public sprxzl(sprlem sprlem2) {
        this.cfr_renamed_2 = cfr_renamed_3;
        this.cfr_renamed_1 = sprlem2;
    }

    /*
     * WARNING - void declaration
     */
    public sprxzl(sprlem sprlem2, byte[] byArray) {
        void arg0;
        sprxzl sprxzl2 = this;
        this.cfr_renamed_2 = cfr_renamed_3;
        sprxzl2.cfr_renamed_1 = arg0;
        sprxzl2.cfr_renamed_2 = sproze.cfr_renamed_158(byArray);
    }

    public sprlem cfr_renamed_2507() {
        return this.cfr_renamed_1;
    }

    public spryfm cfr_renamed_2508() {
        return this.cfr_renamed_4;
    }

    public static byte[] cfr_renamed_2511() {
        return sproze.cfr_renamed_158(cfr_renamed_3);
    }

    public static sprxzl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprxzl) {
            return (sprxzl)arg0;
        }
        if (arg0 != null) {
            sprszm sprszm2;
            sprxzl sprxzl2;
            sprszm sprszm3 = sprszm.cfr_renamed_23(arg0);
            if (sprszm3.cfr_renamed_85(0) instanceof sprlem) {
                sprxzl2 = new sprxzl(sprlem.cfr_renamed_23(sprszm3.cfr_renamed_85(0)));
                sprszm2 = sprszm3;
            } else {
                sprxzl2 = new sprxzl(spryfm.cfr_renamed_23(sprszm3.cfr_renamed_85(0)));
                sprszm2 = sprszm3;
            }
            if (sprszm2.cfr_renamed_84() == 2) {
                sprxzl2.cfr_renamed_2 = sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(1)).cfr_renamed_186();
                if (sprxzl2.cfr_renamed_2.length != cfr_renamed_3.length) {
                    throw new IllegalArgumentException(sprolha.cfr_renamed_9("savf\u007fw<s}qof<fnqsq"));
                }
            }
            return sprxzl2;
        }
        throw new IllegalArgumentException(sprmkaa.cfr_renamed_9("u2p5y$: {\"i5:5h\"u\""));
    }

    public sprxzl(spryfm spryfm2) {
        this.cfr_renamed_2 = cfr_renamed_3;
        this.cfr_renamed_4 = spryfm2;
    }

    public byte[] cfr_renamed_2510() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public boolean cfr_renamed_2317() {
        return this.cfr_renamed_1 != null;
    }

    static {
        byte[] byArray = new byte[64];
        byArray[0] = -87;
        byArray[1] = -42;
        byArray[2] = -21;
        byArray[3] = 69;
        byArray[4] = -15;
        byArray[5] = 60;
        byArray[6] = 112;
        byArray[7] = -126;
        byArray[8] = -128;
        byArray[9] = -60;
        byArray[10] = -106;
        byArray[11] = 123;
        byArray[12] = 35;
        byArray[13] = 31;
        byArray[14] = 94;
        byArray[15] = -83;
        byArray[16] = -10;
        byArray[17] = 88;
        byArray[18] = -21;
        byArray[19] = -92;
        byArray[20] = -64;
        byArray[21] = 55;
        byArray[22] = 41;
        byArray[23] = 29;
        byArray[24] = 56;
        byArray[25] = -39;
        byArray[26] = 107;
        byArray[27] = -16;
        byArray[28] = 37;
        byArray[29] = -54;
        byArray[30] = 78;
        byArray[31] = 23;
        byArray[32] = -8;
        byArray[33] = -23;
        byArray[34] = 114;
        byArray[35] = 13;
        byArray[36] = -58;
        byArray[37] = 21;
        byArray[38] = -76;
        byArray[39] = 58;
        byArray[40] = 40;
        byArray[41] = -105;
        byArray[42] = 95;
        byArray[43] = 11;
        byArray[44] = -63;
        byArray[45] = -34;
        byArray[46] = -93;
        byArray[47] = 100;
        byArray[48] = 56;
        byArray[49] = -75;
        byArray[50] = 100;
        byArray[51] = -22;
        byArray[52] = 44;
        byArray[53] = 23;
        byArray[54] = -97;
        byArray[55] = -48;
        byArray[56] = 18;
        byArray[57] = 62;
        byArray[58] = 109;
        byArray[59] = -72;
        byArray[60] = -6;
        byArray[61] = -59;
        byArray[62] = 121;
        byArray[63] = 4;
        cfr_renamed_3 = byArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprxzl sprxzl2;
        sprrvm sprrvm2 = new sprrvm(2);
        if (this.cfr_renamed_1 != null) {
            sprxzl sprxzl3 = this;
            sprxzl2 = sprxzl3;
            sprrvm2.cfr_renamed_5004(sprxzl3.cfr_renamed_1);
        } else {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
            sprxzl2 = this;
        }
        if (!sproze.cfr_renamed_92(sprxzl2.cfr_renamed_2, cfr_renamed_3)) {
            sprrvm2.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        }
        return new sprcen(sprrvm2);
    }
}

