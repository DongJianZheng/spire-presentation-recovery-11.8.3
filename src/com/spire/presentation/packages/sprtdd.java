/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprver;
import com.spire.presentation.packages.sprzfaa;

public class sprtdd
extends sprnld {
    public static final int cfr_renamed_2 = 8;
    private static byte[] cfr_renamed_3;
    private static final int cfr_renamed_4 = 16;

    public static boolean cfr_renamed_3378(byte[] arg0, int arg1) {
        int n;
        if (arg0.length - arg1 < 8) {
            throw new IllegalArgumentException(sprzfaa.cfr_renamed_9("]\rOH[\tB\rD\u0001W\u0004\u0016\u001cY\u0007\u0016\u001b^\u0007D\u001c\u0018"));
        }
        int n2 = n = 0;
        while (n2 < 16) {
            block4: {
                int n3;
                int n4 = n3 = 0;
                while (n4 < 8) {
                    if (arg0[n3 + arg1] == cfr_renamed_3[n * 8 + n3]) {
                        n4 = ++n3;
                        continue;
                    }
                    break block4;
                }
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    static {
        byte[] byArray = new byte[128];
        byArray[0] = 1;
        byArray[1] = 1;
        byArray[2] = 1;
        byArray[3] = 1;
        byArray[4] = 1;
        byArray[5] = 1;
        byArray[6] = 1;
        byArray[7] = 1;
        byArray[8] = 31;
        byArray[9] = 31;
        byArray[10] = 31;
        byArray[11] = 31;
        byArray[12] = 14;
        byArray[13] = 14;
        byArray[14] = 14;
        byArray[15] = 14;
        byArray[16] = -32;
        byArray[17] = -32;
        byArray[18] = -32;
        byArray[19] = -32;
        byArray[20] = -15;
        byArray[21] = -15;
        byArray[22] = -15;
        byArray[23] = -15;
        byArray[24] = -2;
        byArray[25] = -2;
        byArray[26] = -2;
        byArray[27] = -2;
        byArray[28] = -2;
        byArray[29] = -2;
        byArray[30] = -2;
        byArray[31] = -2;
        byArray[32] = 1;
        byArray[33] = -2;
        byArray[34] = 1;
        byArray[35] = -2;
        byArray[36] = 1;
        byArray[37] = -2;
        byArray[38] = 1;
        byArray[39] = -2;
        byArray[40] = 31;
        byArray[41] = -32;
        byArray[42] = 31;
        byArray[43] = -32;
        byArray[44] = 14;
        byArray[45] = -15;
        byArray[46] = 14;
        byArray[47] = -15;
        byArray[48] = 1;
        byArray[49] = -32;
        byArray[50] = 1;
        byArray[51] = -32;
        byArray[52] = 1;
        byArray[53] = -15;
        byArray[54] = 1;
        byArray[55] = -15;
        byArray[56] = 31;
        byArray[57] = -2;
        byArray[58] = 31;
        byArray[59] = -2;
        byArray[60] = 14;
        byArray[61] = -2;
        byArray[62] = 14;
        byArray[63] = -2;
        byArray[64] = 1;
        byArray[65] = 31;
        byArray[66] = 1;
        byArray[67] = 31;
        byArray[68] = 1;
        byArray[69] = 14;
        byArray[70] = 1;
        byArray[71] = 14;
        byArray[72] = -32;
        byArray[73] = -2;
        byArray[74] = -32;
        byArray[75] = -2;
        byArray[76] = -15;
        byArray[77] = -2;
        byArray[78] = -15;
        byArray[79] = -2;
        byArray[80] = -2;
        byArray[81] = 1;
        byArray[82] = -2;
        byArray[83] = 1;
        byArray[84] = -2;
        byArray[85] = 1;
        byArray[86] = -2;
        byArray[87] = 1;
        byArray[88] = -32;
        byArray[89] = 31;
        byArray[90] = -32;
        byArray[91] = 31;
        byArray[92] = -15;
        byArray[93] = 14;
        byArray[94] = -15;
        byArray[95] = 14;
        byArray[96] = -32;
        byArray[97] = 1;
        byArray[98] = -32;
        byArray[99] = 1;
        byArray[100] = -15;
        byArray[101] = 1;
        byArray[102] = -15;
        byArray[103] = 1;
        byArray[104] = -2;
        byArray[105] = 31;
        byArray[106] = -2;
        byArray[107] = 31;
        byArray[108] = -2;
        byArray[109] = 14;
        byArray[110] = -2;
        byArray[111] = 14;
        byArray[112] = 31;
        byArray[113] = 1;
        byArray[114] = 31;
        byArray[115] = 1;
        byArray[116] = 14;
        byArray[117] = 1;
        byArray[118] = 14;
        byArray[119] = 1;
        byArray[120] = -2;
        byArray[121] = -32;
        byArray[122] = -2;
        byArray[123] = -32;
        byArray[124] = -2;
        byArray[125] = -15;
        byArray[126] = -2;
        byArray[127] = -15;
        cfr_renamed_3 = byArray;
    }

    public static void cfr_renamed_1520(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            byte by = arg0[n];
            arg0[n++] = (byte)(by & 0xFE | (by >> 1 ^ by >> 2 ^ by >> 3 ^ by >> 4 ^ by >> 5 ^ by >> 6 ^ by >> 7 ^ 1) & 1);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprtdd(byte[] byArray) {
        void arg0;
        void v0 = arg0;
        super((byte[])v0);
        if (sprtdd.cfr_renamed_3378((byte[])v0, 0)) {
            throw new IllegalArgumentException(sprver.cfr_renamed_9("E$P5I PpP?\u00043V5E$ApS5E;\u0004\u0014a\u0003\u0004;A)"));
        }
    }
}

