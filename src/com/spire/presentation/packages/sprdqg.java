/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjaz;
import com.spire.presentation.packages.sprkaq;
import com.spire.presentation.packages.sprvpg;

public class sprdqg {
    public static int cfr_renamed_7047(int arg0, int arg1, sprvpg arg2) {
        int n = arg2.cfr_renamed_7048();
        int n2 = 8380417;
        if (arg0 <= n || arg0 > n2 - n || arg0 == n2 - n && arg1 == 0) {
            return 0;
        }
        return 1;
    }

    public static int cfr_renamed_7049(int arg0, int arg1, int arg2) {
        int[] nArray = sprdqg.cfr_renamed_7050(arg0, arg2);
        int n = nArray[0];
        int n2 = nArray[1];
        if (arg1 == 0) {
            return n2;
        }
        if (arg2 == 261888) {
            if (n > 0) {
                return n2 + 1 & 0xF;
            }
            return n2 - 1 & 0xF;
        }
        if (arg2 == 95232) {
            if (n > 0) {
                if (n2 == 43) {
                    return 0;
                }
                return n2 + 1;
            }
            if (n2 == 0) {
                return 43;
            }
            return n2 - 1;
        }
        throw new RuntimeException(sprkaq.cfr_renamed_9("8k\u0000w\b9(x\u0002t\u000e+N"));
    }

    public static int[] cfr_renamed_7051(int arg0) {
        int[] nArray;
        int[] nArray2 = nArray = new int[2];
        nArray2[0] = arg0 + 4096 - 1 >> 13;
        nArray[1] = arg0 - (nArray[0] << 13);
        return nArray2;
    }

    public static int[] cfr_renamed_7050(int arg0, int arg1) {
        int n;
        int n2;
        int n3 = arg0 + 127 >> 7;
        if (arg1 == 261888) {
            n3 = n3 * 1025 + 0x200000 >> 22;
            n3 &= 0xF;
            n2 = arg0;
        } else if (arg1 == 95232) {
            int n4 = n3 = n3 * 11275 + 0x800000 >> 24;
            n3 = n4 ^ 43 - n3 >> 31 & n4;
            n2 = arg0;
        } else {
            throw new RuntimeException(sprjaz.cfr_renamed_9("\u0018J V(\u0018\bY\"U.\nn"));
        }
        int n5 = n = n2 - n3 * 2 * arg1;
        n = n5 - (0x3FF000 - n5 >> 31 & 0x7FE001);
        int[] nArray = new int[2];
        nArray[0] = n;
        nArray[1] = n3;
        return nArray;
    }
}

