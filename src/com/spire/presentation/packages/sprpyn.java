/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxp;
import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprdfp;
import com.spire.presentation.packages.sprmvn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprunp;
import com.spire.presentation.packages.sprvmaa;
import com.spire.presentation.packages.spryjn;
import java.util.Iterator;

@sprtea
public class sprpyn
extends sprmvn {
    private static final int cfr_renamed_2 = 63;
    private static sprdfp cfr_renamed_3;
    private static final byte cfr_renamed_4 = 63;

    @Override
    public void cfr_renamed_14352(spryjn arg0) {
        arg0.cfr_renamed_11835("(");
    }

    @sprtea
    public static byte cfr_renamed_14836(int arg0) {
        int n = cfr_renamed_3.cfr_renamed_14837(arg0);
        if (n != Integer.MIN_VALUE) {
            return (byte)n;
        }
        return 63;
    }

    @Override
    public void cfr_renamed_14838(int arg0, int arg1, spryjn arg2) {
        if (!sprpyn.cfr_renamed_14839(arg1)) {
            return;
        }
        arg2.cfr_renamed_14071(sprpyn.cfr_renamed_14836(arg1));
    }

    @sprtea
    public static int cfr_renamed_14840() {
        return 32;
    }

    @Override
    public void cfr_renamed_14365(spryjn arg0) {
        arg0.cfr_renamed_11835(")");
    }

    @sprtea
    public static boolean cfr_renamed_14841(byte arg0) {
        return cfr_renamed_3.cfr_renamed_14842(arg0 & 0xFF) != Integer.MIN_VALUE;
    }

    @sprtea
    public static boolean cfr_renamed_14597(String arg0) {
        if (arg0 == null) {
            return false;
        }
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            if (sprpyn.cfr_renamed_14839((Integer)iterator.next())) continue;
            return false;
        }
        return true;
    }

    @Override
    public void cfr_renamed_14843(spryjn arg0) {
        arg0.cfr_renamed_14057(sprvmaa.cfr_renamed_9("\u000e\u0011O7N0H:F"), sprbxp.cfr_renamed_9("1xwA_AmF[A}@zFpH"));
    }

    @sprtea
    public static boolean cfr_renamed_14839(int arg0) {
        return cfr_renamed_3.cfr_renamed_14837(arg0) != Integer.MIN_VALUE;
    }

    @sprtea
    public static int cfr_renamed_14844() {
        return 255;
    }

    @sprtea
    public static byte[] cfr_renamed_14845(String arg0) {
        Iterator iterator;
        sprunp sprunp2 = sprunp.cfr_renamed_14846();
        Iterator iterator2 = iterator = new sprcop(arg0).iterator();
        while (iterator2.hasNext()) {
            int n = (Integer)iterator.next();
            iterator2 = iterator;
            sprunp2.cfr_renamed_14847(sprpyn.cfr_renamed_14836(n));
        }
        return sprunp2.cfr_renamed_4529();
    }

    static {
        sprpyn.cfr_renamed_14848();
    }

    private static /* synthetic */ void cfr_renamed_14848() {
        int n;
        cfr_renamed_3 = new sprdfp();
        int n2 = n = 32;
        while (n2 <= 126) {
            int n3 = n++;
            cfr_renamed_3.cfr_renamed_14849(n3, (byte)n3 & 0xFF);
            n2 = n;
        }
        int n4 = n = 161;
        while (n4 <= 255) {
            if (n != 173) {
                int n5 = n;
                cfr_renamed_3.cfr_renamed_14849(n5, (byte)n5 & 0xFF);
            }
            n4 = ++n;
        }
        cfr_renamed_3.cfr_renamed_14849(8364, 128);
        cfr_renamed_3.cfr_renamed_14849(8218, 130);
        cfr_renamed_3.cfr_renamed_14849(402, 131);
        cfr_renamed_3.cfr_renamed_14849(8222, 132);
        cfr_renamed_3.cfr_renamed_14849(8230, 133);
        cfr_renamed_3.cfr_renamed_14849(8224, 134);
        cfr_renamed_3.cfr_renamed_14849(8225, 135);
        cfr_renamed_3.cfr_renamed_14849(710, 136);
        cfr_renamed_3.cfr_renamed_14849(8240, 137);
        cfr_renamed_3.cfr_renamed_14849(352, 138);
        cfr_renamed_3.cfr_renamed_14849(8249, 139);
        cfr_renamed_3.cfr_renamed_14849(338, 140);
        cfr_renamed_3.cfr_renamed_14849(381, 142);
        cfr_renamed_3.cfr_renamed_14849(8216, 145);
        cfr_renamed_3.cfr_renamed_14849(8217, 146);
        cfr_renamed_3.cfr_renamed_14849(8220, 147);
        cfr_renamed_3.cfr_renamed_14849(8221, 148);
        cfr_renamed_3.cfr_renamed_14849(8226, 149);
        cfr_renamed_3.cfr_renamed_14849(8211, 150);
        cfr_renamed_3.cfr_renamed_14849(8212, 151);
        cfr_renamed_3.cfr_renamed_14849(732, 152);
        cfr_renamed_3.cfr_renamed_14849(8482, 153);
        cfr_renamed_3.cfr_renamed_14849(353, 154);
        cfr_renamed_3.cfr_renamed_14849(8250, 155);
        cfr_renamed_3.cfr_renamed_14849(339, 156);
        cfr_renamed_3.cfr_renamed_14849(382, 158);
        cfr_renamed_3.cfr_renamed_14849(376, 159);
    }

    @sprtea
    public static int cfr_renamed_14850(byte arg0) {
        int n = cfr_renamed_3.cfr_renamed_14842(arg0 & 0xFF);
        if (n != Integer.MIN_VALUE) {
            return n;
        }
        return 63;
    }
}

