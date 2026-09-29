/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdg;
import com.spire.presentation.packages.sprkyf;
import com.spire.presentation.packages.sprptf;
import com.spire.presentation.packages.sprvtf;

public class sprfeg {
    public static void cfr_renamed_6052(sprptf arg0, byte[] arg1, int arg2, int arg3, byte[] arg4, sprkyf arg5, byte[] arg6, int arg7) {
        int n;
        sprkyf sprkyf2 = new sprkyf(arg5);
        byte[] byArray = new byte[(arg3 + 1) * 32];
        int[] nArray = new int[arg3 + 1];
        int n2 = 0;
        sprkyf sprkyf3 = sprkyf2;
        sprkyf sprkyf4 = sprkyf3;
        int n3 = (int)(sprkyf3.cfr_renamed_4 + (long)(1 << arg3));
        while (sprkyf4.cfr_renamed_4 < (long)n3) {
            int n4 = n2++;
            sprfeg.cfr_renamed_6053(arg0, byArray, n4 * 32, arg6, arg7, arg4, sprkyf2);
            nArray[n4] = 0;
            int n5 = n2;
            while (n5 > 1 && nArray[n2 - 1] == nArray[n2 - 2]) {
                int n6 = 2 * (nArray[n2 - 1] + 7) * 32;
                arg0.cfr_renamed_6054(byArray, (n2 - 2) * 32, byArray, (n2 - 2) * 32, arg6, arg7 + n6);
                int n7 = n2 - 2;
                nArray[n7] = nArray[n7] + 1;
                n5 = --n2;
            }
            sprkyf sprkyf5 = sprkyf2;
            sprkyf4 = sprkyf5;
            ++sprkyf5.cfr_renamed_4;
        }
        int n8 = n = 0;
        while (n8 < 32) {
            int n9 = arg2 + n;
            byte by = byArray[n];
            arg1[n9] = by;
            n8 = ++n;
        }
    }

    public static void cfr_renamed_6055(sprptf arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, int arg6) {
        int n;
        int n2 = 67;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 7) {
            int n5 = n3 = 0;
            while (n5 < n2 >>> 1) {
                arg0.cfr_renamed_6054(arg3, arg4 + ++n3 * 32, arg3, arg4 + n3 * 2 * 32, arg5, arg6 + n * 2 * 32);
                n5 = n3;
            }
            if ((n2 & 1) != 0) {
                int n6 = n2;
                System.arraycopy(arg3, arg4 + (n6 - 1) * 32, arg3, arg4 + (n2 >>> 1) * 32, 32);
                n2 = (n6 >>> 1) + 1;
            } else {
                n2 >>>= 1;
            }
            n4 = ++n;
        }
        System.arraycopy(arg3, arg4, arg1, arg2, 32);
    }

    public static void cfr_renamed_6053(sprptf arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, byte[] arg5, sprkyf arg6) {
        byte[] byArray = new byte[32];
        byte[] byArray2 = new byte[2144];
        sprfdg sprfdg2 = new sprfdg();
        sprptf sprptf2 = arg0;
        sprvtf.cfr_renamed_6056(sprptf2, byArray, 0, arg5, arg6);
        sprfdg2.cfr_renamed_6049(sprptf2, byArray2, 0, byArray, 0, arg3, arg4);
        sprfeg.cfr_renamed_6055(arg0, arg1, arg2, byArray2, 0, arg3, arg4);
    }
}

