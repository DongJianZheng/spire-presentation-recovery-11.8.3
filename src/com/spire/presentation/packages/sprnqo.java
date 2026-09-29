/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghp;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprpip;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvyo;
import com.spire.presentation.packages.sprwbp;

@sprtea
public class sprnqo {
    private static final int cfr_renamed_4 = 8;

    public static sprpln cfr_renamed_17527(byte[] arg0, sprwbp arg1, sprwbp arg2) {
        if (arg0 == null || sprnqo.cfr_renamed_17528(arg0, (byte)-1)) {
            return new sprghp(arg2);
        }
        if (sprnqo.cfr_renamed_17528(arg0, (byte)0)) {
            return new sprghp(arg2);
        }
        return new sprpip(sprnqo.cfr_renamed_17529(arg0, arg1, arg2), 0);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private static /* synthetic */ byte[] cfr_renamed_17529(byte[] arg0, sprwbp arg1, sprwbp arg2) {
        sprvyo sprvyo2 = new sprvyo(8, 8);
        try {
            sprpdja sprpdja2;
            int n;
            int n2 = n = 0;
            while (n2 < 8) {
                int n3;
                int n4 = n3 = 0;
                while (n4 < 8) {
                    sprwbp sprwbp2 = (arg0[n] & 0xFF & 128 >> n3) > 0 ? arg2 : arg1;
                    sprvyo2.cfr_renamed_14006(n3++, n, sprwbp2);
                    n4 = n3;
                }
                n2 = ++n;
            }
            sprpdja sprpdja3 = sprpdja2 = new sprpdja();
            sprvyo2.cfr_renamed_12641(sprpdja3, 6);
            byte[] byArray = sprmvo.cfr_renamed_12452(sprpdja3);
            return byArray;
        }
        finally {
            if (sprvyo2 != null) {
                sprvyo2.cfr_renamed_11665();
            }
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4;
        int cfr_ignored_0 = 4 << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ (2 ^ 5);
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

    private static /* synthetic */ boolean cfr_renamed_17528(byte[] arg0, byte arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            if (arg0[n] != arg1) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ sprnqo() {
    }
}

