/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfaa;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spridr;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprpke;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprzra;

public class sprhee
extends sprkra {
    private sprtzd cfr_renamed_1;
    private static final byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3 = cfr_renamed_2;
    private sprpke cfr_renamed_4;

    public sprtzd cfr_renamed_2507() {
        return this.cfr_renamed_1;
    }

    public sprpke cfr_renamed_2508() {
        return this.cfr_renamed_4;
    }

    public sprhee(sprtzd sprtzd2) {
        this.cfr_renamed_1 = sprtzd2;
    }

    public static sprhee cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhee) {
            return (sprhee)arg0;
        }
        if (arg0 != null) {
            sprbne sprbne2;
            sprhee sprhee2;
            sprbne sprbne3 = sprbne.cfr_renamed_23(arg0);
            if (sprbne3.cfr_renamed_85(0) instanceof sprtzd) {
                sprhee2 = new sprhee(sprtzd.cfr_renamed_23(sprbne3.cfr_renamed_85(0)));
                sprbne2 = sprbne3;
            } else {
                sprhee2 = new sprhee(sprpke.cfr_renamed_23(sprbne3.cfr_renamed_85(0)));
                sprbne2 = sprbne3;
            }
            if (sprbne2.cfr_renamed_84() == 2) {
                sprhee2.cfr_renamed_3 = sprxue.cfr_renamed_23(sprbne3.cfr_renamed_85(1)).cfr_renamed_186();
                if (sprhee2.cfr_renamed_3.length != cfr_renamed_2.length) {
                    throw new IllegalArgumentException(spridr.cfr_renamed_9("\u0005&\u0000!\t0J4\u000b6\u0019!J!\u00186\u00056"));
                }
            }
            return sprhee2;
        }
        throw new IllegalArgumentException(sprbfaa.cfr_renamed_9("m[h\\aM\"IcKq\\\"\\pKmK"));
    }

    @Override
    public sprvva cfr_renamed_119() {
        sprhee sprhee2;
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_1 != null) {
            sprhee sprhee3 = this;
            sprhee2 = sprhee3;
            sprlre2.cfr_renamed_49(sprhee3.cfr_renamed_1);
        } else {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
            sprhee2 = this;
        }
        if (!sprzra.cfr_renamed_92(sprhee2.cfr_renamed_3, cfr_renamed_2)) {
            sprlre2.cfr_renamed_49(new sprlqe(this.cfr_renamed_3));
        }
        return new sprpse(sprlre2);
    }

    public static byte[] cfr_renamed_2511() {
        return cfr_renamed_2;
    }

    public byte[] cfr_renamed_2510() {
        return this.cfr_renamed_3;
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
        cfr_renamed_2 = byArray;
    }

    public sprhee(sprpke sprpke2) {
        this.cfr_renamed_4 = sprpke2;
    }

    public boolean cfr_renamed_2317() {
        return this.cfr_renamed_1 != null;
    }
}

