/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravf;
import com.spire.presentation.packages.sprevf;
import com.spire.presentation.packages.sprjyf;
import com.spire.presentation.packages.sprmdg;

public class sprdag {
    public sprjyf cfr_renamed_4;

    public int cfr_renamed_6809(sprevf arg0) {
        int n;
        int[] nArray = new int[54];
        nArray[0] = 10745844;
        nArray[1] = 3068844;
        nArray[2] = 3741698;
        nArray[3] = 5559083;
        nArray[4] = 1580863;
        nArray[5] = 8248194;
        nArray[6] = 2260429;
        nArray[7] = 13669192;
        nArray[8] = 2736639;
        nArray[9] = 708981;
        nArray[10] = 4421575;
        nArray[11] = 10046180;
        nArray[12] = 169348;
        nArray[13] = 7122675;
        nArray[14] = 4136815;
        nArray[15] = 30538;
        nArray[16] = 13063405;
        nArray[17] = 7650655;
        nArray[18] = 4132;
        nArray[19] = 14505003;
        nArray[20] = 7826148;
        nArray[21] = 417;
        nArray[22] = 16768101;
        nArray[23] = 11363290;
        nArray[24] = 31;
        nArray[25] = 8444042;
        nArray[26] = 8086568;
        nArray[27] = 1;
        nArray[28] = 12844466;
        nArray[29] = 265321;
        nArray[30] = 0;
        nArray[31] = 1232676;
        nArray[32] = 13644283;
        nArray[33] = 0;
        nArray[34] = 38047;
        nArray[35] = 9111839;
        nArray[36] = 0;
        nArray[37] = 870;
        nArray[38] = 6138264;
        nArray[39] = 0;
        nArray[40] = 14;
        nArray[41] = 12545723;
        nArray[42] = 0;
        nArray[43] = 0;
        nArray[44] = 3104126;
        nArray[45] = 0;
        nArray[46] = 0;
        nArray[47] = 28824;
        nArray[48] = 0;
        nArray[49] = 0;
        nArray[50] = 198;
        nArray[51] = 0;
        nArray[52] = 0;
        nArray[53] = 1;
        int[] nArray2 = nArray;
        sprevf sprevf2 = arg0;
        long l = sprevf2.cfr_renamed_6810();
        int n2 = sprevf2.cfr_renamed_6811() & 0xFF;
        int n3 = (int)l & 0xFFFFFF;
        int n4 = (int)(l >>> 24) & 0xFFFFFF;
        int n5 = (int)(l >>> 48) | n2 << 16;
        int n6 = 0;
        int n7 = n = 0;
        while (n7 < nArray2.length) {
            int n8 = nArray2[n + 2];
            int n9 = nArray2[n + 1];
            int n10 = nArray2[n + 0];
            int n11 = n3 - n8 >>> 31;
            n11 = n4 - n9 - n11 >>> 31;
            n11 = n5 - n10 - n11 >>> 31;
            n6 += n11;
            n7 = n += 3;
        }
        return n6;
    }

    public sprdag() {
        sprdag sprdag2 = this;
        sprdag2.cfr_renamed_4 = new sprjyf();
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_6812(sprevf sprevf2, sprmdg sprmdg2, sprmdg sprmdg3) {
        void arg0;
        int n;
        void arg2;
        int n2;
        void arg1;
        sprdag sprdag2 = this;
        sprdag sprdag3 = this;
        int n3 = (int)sprdag2.cfr_renamed_4.cfr_renamed_6813(sprdag3.cfr_renamed_4.cfr_renamed_6814((sprmdg)arg1, this.cfr_renamed_4.cfr_renamed_114));
        sprdag sprdag4 = this;
        sprmdg sprmdg4 = sprdag2.cfr_renamed_4.cfr_renamed_6815((sprmdg)arg1, sprdag4.cfr_renamed_4.cfr_renamed_6814(sprdag4.cfr_renamed_4.cfr_renamed_6816(n3), this.cfr_renamed_4.spr\ufe34));
        int n4 = n2 = n3;
        n3 = n2 = n4 ^ (n2 ^ 0x3F) & -(63 - n4 >>> 31);
        long l = (sprdag3.cfr_renamed_4.cfr_renamed_6817(sprmdg4, (sprmdg)arg2) << 1) - 1L >>> n3;
        int n5 = 64;
        while ((n = (arg0.cfr_renamed_6811() & 0xFF) - ((int)(l >>> (n5 -= 8)) & 0xFF)) == 0 && n5 > 0) {
        }
        return n >>> 31;
    }

    public int cfr_renamed_6818(spravf arg0, sprmdg arg1, sprmdg arg2) {
        return this.cfr_renamed_6819(arg0, arg1, arg2);
    }

    public int cfr_renamed_6819(spravf arg0, sprmdg arg1, sprmdg arg2) {
        int n;
        int n2;
        sprdag sprdag2;
        sprdag sprdag3;
        sprmdg sprmdg2;
        sprdag sprdag4;
        spravf spravf2 = arg0;
        sprdag sprdag5 = this;
        int n3 = (int)sprdag5.cfr_renamed_4.cfr_renamed_6820(arg1);
        sprdag sprdag6 = this;
        sprmdg sprmdg3 = sprdag5.cfr_renamed_4.cfr_renamed_6815(arg1, sprdag6.cfr_renamed_4.cfr_renamed_6816(n3));
        sprmdg sprmdg4 = sprdag6.cfr_renamed_4.cfr_renamed_6821(this.cfr_renamed_4.cfr_renamed_6822(arg2));
        sprmdg sprmdg5 = sprdag5.cfr_renamed_4.cfr_renamed_6814(arg2, spravf2.cfr_renamed_3);
        do {
            sprdag4 = this;
            sprdag3 = this;
            int n4 = sprdag3.cfr_renamed_6809(spravf2.cfr_renamed_4);
            int n5 = spravf2.cfr_renamed_4.cfr_renamed_6811() & 0xFF & 1;
            n = n5 + ((n5 << 1) - 1) * n4;
            sprdag sprdag7 = this;
            sprmdg2 = sprdag4.cfr_renamed_4.cfr_renamed_6814(sprdag7.cfr_renamed_4.cfr_renamed_6822(sprdag7.cfr_renamed_4.cfr_renamed_6815(this.cfr_renamed_4.cfr_renamed_6816(n), sprmdg3)), sprmdg4);
            sprdag2 = this;
            n2 = n4;
        } while (sprdag4.cfr_renamed_6812(spravf2.cfr_renamed_4, sprmdg2 = sprdag3.cfr_renamed_4.cfr_renamed_6815(sprmdg2, sprdag2.cfr_renamed_4.cfr_renamed_6814(sprdag2.cfr_renamed_4.cfr_renamed_6816(n2 * n2), this.cfr_renamed_4.cfr_renamed_132)), sprmdg5) == 0);
        return n3 + n;
    }
}

