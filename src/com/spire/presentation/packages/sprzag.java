/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrya;

public class sprzag {
    private static final int cfr_renamed_4 = 12;

    public static void cfr_renamed_6065(int arg0, int[] arg1) {
        int n;
        if (arg1.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg0 % 2 != 0) {
            throw new IllegalArgumentException(sprrya.cfr_renamed_9("}\r^\u001aV\n\u0013\u0017UXA\u0017F\u0016W\u000b\u0013\u0015F\u000bGXQ\u001d\u0013\u001dE\u001d]"));
        }
        int n2 = arg1[0];
        int n3 = arg1[1];
        int n4 = arg1[2];
        int n5 = arg1[3];
        int n6 = arg1[4];
        int n7 = arg1[5];
        int n8 = arg1[6];
        int n9 = arg1[7];
        int n10 = arg1[8];
        int n11 = arg1[9];
        int n12 = arg1[10];
        int n13 = arg1[11];
        int n14 = arg1[12];
        int n15 = arg1[13];
        int n16 = arg1[14];
        int n17 = arg1[15];
        int n18 = n = arg0;
        while (n18 > 0) {
            n14 = sprzag.cfr_renamed_3608(n14 ^ (n2 += n6), 16);
            n6 = sprzag.cfr_renamed_3608(n6 ^ (n10 += n14), 12);
            n14 = sprzag.cfr_renamed_3608(n14 ^ (n2 += n6), 8);
            n6 = sprzag.cfr_renamed_3608(n6 ^ (n10 += n14), 7);
            n15 = sprzag.cfr_renamed_3608(n15 ^ (n3 += n7), 16);
            n7 = sprzag.cfr_renamed_3608(n7 ^ (n11 += n15), 12);
            n15 = sprzag.cfr_renamed_3608(n15 ^ (n3 += n7), 8);
            n7 = sprzag.cfr_renamed_3608(n7 ^ (n11 += n15), 7);
            n16 = sprzag.cfr_renamed_3608(n16 ^ (n4 += n8), 16);
            n8 = sprzag.cfr_renamed_3608(n8 ^ (n12 += n16), 12);
            n16 = sprzag.cfr_renamed_3608(n16 ^ (n4 += n8), 8);
            n8 = sprzag.cfr_renamed_3608(n8 ^ (n12 += n16), 7);
            n17 = sprzag.cfr_renamed_3608(n17 ^ (n5 += n9), 16);
            n9 = sprzag.cfr_renamed_3608(n9 ^ (n13 += n17), 12);
            n17 = sprzag.cfr_renamed_3608(n17 ^ (n5 += n9), 8);
            n9 = sprzag.cfr_renamed_3608(n9 ^ (n13 += n17), 7);
            n17 = sprzag.cfr_renamed_3608(n17 ^ (n2 += n7), 16);
            n7 = sprzag.cfr_renamed_3608(n7 ^ (n12 += n17), 12);
            n17 = sprzag.cfr_renamed_3608(n17 ^ (n2 += n7), 8);
            n7 = sprzag.cfr_renamed_3608(n7 ^ (n12 += n17), 7);
            n14 = sprzag.cfr_renamed_3608(n14 ^ (n3 += n8), 16);
            n8 = sprzag.cfr_renamed_3608(n8 ^ (n13 += n14), 12);
            n14 = sprzag.cfr_renamed_3608(n14 ^ (n3 += n8), 8);
            n8 = sprzag.cfr_renamed_3608(n8 ^ (n13 += n14), 7);
            n15 = sprzag.cfr_renamed_3608(n15 ^ (n4 += n9), 16);
            n9 = sprzag.cfr_renamed_3608(n9 ^ (n10 += n15), 12);
            n15 = sprzag.cfr_renamed_3608(n15 ^ (n4 += n9), 8);
            n9 = sprzag.cfr_renamed_3608(n9 ^ (n10 += n15), 7);
            n16 = sprzag.cfr_renamed_3608(n16 ^ (n5 += n6), 16);
            n6 = sprzag.cfr_renamed_3608(n6 ^ (n11 += n16), 12);
            n16 = sprzag.cfr_renamed_3608(n16 ^ (n5 += n6), 8);
            n6 = sprzag.cfr_renamed_3608(n6 ^ (n11 += n16), 7);
            n18 = n -= 2;
        }
        arg1[0] = n2;
        arg1[1] = n3;
        arg1[2] = n4;
        arg1[3] = n5;
        arg1[4] = n6;
        arg1[5] = n7;
        arg1[6] = n8;
        arg1[7] = n9;
        arg1[8] = n10;
        arg1[9] = n11;
        arg1[10] = n12;
        arg1[11] = n13;
        arg1[12] = n14;
        arg1[13] = n15;
        arg1[14] = n16;
        arg1[15] = n17;
    }

    public void cfr_renamed_6066(byte[] arg0, byte[] arg1) {
        int n;
        int[] nArray = new int[16];
        int n2 = n = 0;
        while (n2 < 16) {
            int n3 = n++;
            nArray[n3] = sprpxe.cfr_renamed_439(arg1, 4 * n3);
            n2 = n;
        }
        sprzag.cfr_renamed_6065(12, nArray);
        int n4 = n = 0;
        while (n4 < 16) {
            sprpxe.cfr_renamed_437(nArray[n], arg0, 4 * n++);
            n4 = n;
        }
    }

    public static int cfr_renamed_3608(int arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }
}

