/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprieg;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprpag;
import com.spire.presentation.packages.sprqxf;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvcg;
import com.spire.presentation.packages.sprvei;
import com.spire.presentation.packages.sprycg;

@sprtea
public class spruzf {
    public static final short cfr_renamed_3 = -32126;
    public static final short cfr_renamed_4 = -31869;

    public static spriyf cfr_renamed_6490(sprgzf arg0, sprsuf arg1, int arg2, byte[] arg3, byte[] arg4) throws IllegalArgumentException {
        if (arg4 == null || arg4.length < arg0.cfr_renamed_1186()) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvei.cfr_renamed_9("t<i'& c6bso &?c usr;g=&")).append(arg0.cfr_renamed_1186()).toString());
        }
        int n = 1 << arg0.cfr_renamed_1153();
        return new spriyf(arg0, arg1, arg2, arg3, n, arg4);
    }

    public static boolean cfr_renamed_6476(sprbxf arg0, sprvcg arg1) {
        sprlyf sprlyf2 = (sprlyf)arg1.cfr_renamed_79();
        sprgzf sprgzf2 = sprlyf2.cfr_renamed_6445();
        int n = sprgzf2.cfr_renamed_1153();
        byte[][] byArray = sprlyf2.spr\u3181();
        byte[] byArray2 = sprqxf.cfr_renamed_6456(arg1);
        int n2 = (1 << n) + sprlyf2.cfr_renamed_1604();
        byte[] byArray3 = arg0.cfr_renamed_6439();
        sprgf sprgf2 = sprieg.cfr_renamed_6485(sprgzf2);
        byte[] byArray4 = new byte[sprgf2.cfr_renamed_1218()];
        sprgf2.cfr_renamed_1197(byArray3, 0, byArray3.length);
        sprpag.cfr_renamed_6460(n2, sprgf2);
        sprpag.cfr_renamed_6461((short)-32126, sprgf2);
        sprgf2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprgf2.cfr_renamed_1219(byArray4, 0);
        int n3 = 0;
        while (n2 > 1) {
            int n4;
            if ((n2 & 1) == 1) {
                sprgf2.cfr_renamed_1197(byArray3, 0, byArray3.length);
                sprpag.cfr_renamed_6460(n2 / 2, sprgf2);
                sprpag.cfr_renamed_6461((short)-31869, sprgf2);
                sprgf2.cfr_renamed_1197(byArray[n3], 0, byArray[n3].length);
                sprgf2.cfr_renamed_1197(byArray4, 0, byArray4.length);
                n4 = n2;
                sprgf2.cfr_renamed_1219(byArray4, 0);
            } else {
                sprgf2.cfr_renamed_1197(byArray3, 0, byArray3.length);
                sprpag.cfr_renamed_6460(n2 / 2, sprgf2);
                sprpag.cfr_renamed_6461((short)-31869, sprgf2);
                sprgf2.cfr_renamed_1197(byArray4, 0, byArray4.length);
                sprgf2.cfr_renamed_1197(byArray[n3], 0, byArray[n3].length);
                n4 = n2;
                sprgf2.cfr_renamed_1219(byArray4, 0);
            }
            n2 = n4 / 2;
            if (++n3 != byArray.length || n2 <= 1) continue;
            return false;
        }
        byte[] byArray5 = byArray4;
        return arg0.cfr_renamed_6479(byArray5);
    }

    public static boolean cfr_renamed_6468(sprbxf arg0, sprlyf arg1, byte[] arg2) {
        sprvcg sprvcg2;
        sprbxf sprbxf2 = arg0;
        sprvcg sprvcg3 = sprvcg2 = sprbxf2.cfr_renamed_6473(arg1);
        sprpag.cfr_renamed_6455(arg2, sprvcg3);
        return spruzf.cfr_renamed_6476(sprbxf2, sprvcg3);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 3 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (2 ^ 5);
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

    public static sprlyf cfr_renamed_6488(sprvcg arg0) {
        sprycg sprycg2 = sprqxf.cfr_renamed_6446(arg0.cfr_renamed_1369(), arg0.cfr_renamed_1604(), arg0.cfr_renamed_3369());
        return new sprlyf(arg0.cfr_renamed_1369().cfr_renamed_1604(), sprycg2, arg0.cfr_renamed_5646(), arg0.cfr_renamed_6493());
    }

    public static boolean cfr_renamed_6496(sprbxf arg0, byte[] arg1, byte[] arg2) {
        sprvcg sprvcg2;
        sprbxf sprbxf2 = arg0;
        sprvcg sprvcg3 = sprvcg2 = sprbxf2.cfr_renamed_5710(arg1);
        sprpag.cfr_renamed_6455(arg2, sprvcg3);
        return spruzf.cfr_renamed_6476(sprbxf2, sprvcg3);
    }

    public static sprlyf cfr_renamed_6469(spriyf arg0, byte[] arg1) {
        sprvcg sprvcg2 = arg0.cfr_renamed_5709();
        sprvcg2.cfr_renamed_1197(arg1, 0, arg1.length);
        return spruzf.cfr_renamed_6488(sprvcg2);
    }
}

