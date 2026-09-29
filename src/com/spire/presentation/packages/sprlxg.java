/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.spraxg;
import com.spire.presentation.packages.sprbg;
import com.spire.presentation.packages.sprgqk;
import com.spire.presentation.packages.sprhtg;
import com.spire.presentation.packages.sprivk;
import com.spire.presentation.packages.sprjyg;
import com.spire.presentation.packages.sprjzk;
import com.spire.presentation.packages.sprkuk;
import com.spire.presentation.packages.sprnxe;
import com.spire.presentation.packages.sproam;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprojm;
import com.spire.presentation.packages.sproqk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsgm;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.spruxy;
import com.spire.presentation.packages.sprycm;
import com.spire.presentation.packages.sprzu;

public class sprlxg {
    public static sprzu cfr_renamed_7911(int arg0, int arg1) throws sprtqg {
        if (arg0 != 7 && arg0 != 8 && arg0 != 9) {
            throw new sprtqg(spruxy.cfr_renamed_9("Q^Q_0t~wi;cn`k\u007fid~t;vtb;Q^C;rzc~t;qwwtbrds}h"));
        }
        switch (arg1) {
            case 1: {
                return new sproqk(new sprael());
            }
            case 2: {
                return new sprkuk(new sprael(), new sprael());
            }
            case 3: {
                return new sprgqk(new sprael());
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprnxe.cfr_renamed_9("\b\u0017\u000f\u001c\u001e\u0016\u001a\u0017\u0014\n\u0018\u001d]8889Y\u001c\u0015\u001a\u0016\u000f\u0010\t\u0011\u0010C]")).append(arg1).toString());
    }

    public static long cfr_renamed_7952(int arg0) {
        return 1L << arg0 + 6;
    }

    public static sprbg cfr_renamed_7956(sproam arg0, spraxg arg1) throws sprtqg {
        if (arg0.cfr_renamed_3() == 1) {
            throw new sprtqg(spruxy.cfr_renamed_9("HUR@_0kqx{~d;]NCO0yu;\u007f}0muicr\u007fu0)0tb;wiuzd~b5"));
        }
        sproam sproam2 = arg0;
        int n = sproam2.cfr_renamed_7783();
        int n2 = sproam2.cfr_renamed_7855();
        int n3 = sproam2.cfr_renamed_7864();
        byte[] byArray = sproam2.cfr_renamed_7954();
        byte[][] byArray2 = sprlxg.cfr_renamed_7865(n2, n, arg1.cfr_renamed_1521(), arg0.cfr_renamed_1477(), byArray);
        byte[] byArray3 = byArray2[0];
        byte[] byArray4 = byArray2[1];
        sprtpk sprtpk2 = new sprtpk(byArray3);
        sprzu sprzu2 = sprlxg.cfr_renamed_7911(n, n2);
        return new sprhtg(sprzu2, sprtpk2, byArray4, n, n2, n3, byArray);
    }

    public static byte[] cfr_renamed_7957(byte[] arg0, long arg1) {
        byte[] byArray = sproze.cfr_renamed_158(arg0);
        sprlxg.cfr_renamed_7955(byArray, arg1);
        return byArray;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 2;
        int cfr_ignored_0 = 4 << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 4 << 4;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public static sprbg cfr_renamed_7953(sprojm arg0, spraxg arg1) throws sprtqg {
        sprojm sprojm2 = arg0;
        byte by = sprojm2.cfr_renamed_7866();
        byte[] byArray = sprojm2.cfr_renamed_1205();
        int n = sprojm2.cfr_renamed_7864();
        spraxg spraxg2 = arg1;
        int n2 = spraxg2.cfr_renamed_593();
        byte[] byArray2 = spraxg2.cfr_renamed_1521();
        byte[] byArray3 = sprojm2.cfr_renamed_7954();
        sprtpk sprtpk2 = new sprtpk(byArray2);
        sprzu sprzu2 = sprlxg.cfr_renamed_7911(n2, by);
        return new sprjyg(sprzu2, sprtpk2, byArray, n2, by, n, byArray3);
    }

    public static void cfr_renamed_7955(byte[] arg0, long arg1) {
        int n = arg0.length - 8;
        byte[] byArray = arg0;
        byte[] byArray2 = arg0;
        int n2 = n++;
        byArray[n2] = (byte)(byArray[n2] ^ (byte)(arg1 >> 56));
        int n3 = n++;
        byArray2[n3] = (byte)(byArray2[n3] ^ (byte)(arg1 >> 48));
        int n4 = n++;
        byArray[n4] = (byte)(byArray[n4] ^ (byte)(arg1 >> 40));
        int n5 = n++;
        byArray2[n5] = (byte)(byArray2[n5] ^ (byte)(arg1 >> 32));
        int n6 = n++;
        byArray[n6] = (byte)(byArray[n6] ^ (byte)(arg1 >> 24));
        int n7 = n++;
        byArray2[n7] = (byte)(byArray2[n7] ^ (byte)(arg1 >> 16));
        int n8 = n++;
        byArray[n8] = (byte)(byArray[n8] ^ (byte)(arg1 >> 8));
        int n9 = n;
        byArray2[n9] = (byte)(byArray2[n9] ^ (byte)arg1);
    }

    public static byte[][] cfr_renamed_7865(int arg0, int arg1, byte[] arg2, byte[] arg3, byte[] arg4) throws sprtqg {
        sprjzk sprjzk2;
        sprivk sprivk2 = new sprivk(arg2, arg3, arg4);
        sprjzk sprjzk3 = sprjzk2 = new sprjzk(new sprohl());
        sprjzk3.cfr_renamed_5671(sprivk2);
        int n = sprycm.cfr_renamed_7909(arg1);
        int n2 = sprsgm.cfr_renamed_7910(arg0);
        byte[] byArray = new byte[n + n2 - 8];
        sprjzk3.cfr_renamed_2341(byArray, 0, byArray.length);
        byte[][] byArrayArray = new byte[2][];
        byArrayArray[0] = sproze.cfr_renamed_533(byArray, 0, n);
        int n3 = n;
        byArrayArray[1] = sproze.cfr_renamed_533(byArray, n3, n3 + n2);
        return byArrayArray;
    }
}

