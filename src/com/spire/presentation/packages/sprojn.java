/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazia;
import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sprlzia;
import com.spire.presentation.packages.sprmvo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;

@sprtea
public class sprojn {
    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static sprqyo cfr_renamed_13226(sprvqo arg0, String arg1) {
        byte[] byArray;
        byte[] byArray2;
        block2: {
            sprpdja sprpdja2 = new sprpdja();
            try {
                arg0.cfr_renamed_13227(sprpdja2);
                byArray2 = sprmvo.cfr_renamed_12452(sprpdja2);
                if (sprpdja2 == null) break block2;
                byArray = byArray2;
            }
            catch (Throwable throwable) {
                if (sprpdja2 == null) throw throwable;
                sprpdja2.cfr_renamed_2637();
                throw throwable;
            }
            sprpdja2.cfr_renamed_2637();
            return sprojn.cfr_renamed_13228(byArray, arg1);
        }
        byArray = byArray2;
        return sprojn.cfr_renamed_13228(byArray, arg1);
    }

    private static /* synthetic */ byte[] cfr_renamed_13229(String arg0) {
        String string = sprazia.cfr_renamed_11733(arg0);
        return sprkpp.cfr_renamed_13230(new sprlzia(string));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ 3;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
        int n4 = n2;
        int n5 = 5 << 4 ^ (2 << 2 ^ 3);
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

    private static /* synthetic */ sprqyo cfr_renamed_13228(byte[] arg0, String arg1) {
        byte[] byArray = sprojn.cfr_renamed_13231(arg0, arg1);
        sprqyo sprqyo2 = new sprqyo(arg1, "application/vnd.ms-package.obfuscated-opentype");
        sprqyo2.cfr_renamed_13232().cfr_renamed_4924(byArray, 0, byArray.length);
        return sprqyo2;
    }

    private static /* synthetic */ byte[] cfr_renamed_13231(byte[] arg0, String arg1) {
        int n;
        byte[] byArray = sprojn.cfr_renamed_13229(arg1);
        int n2 = n = 0;
        while (n2 < 32) {
            int n3 = byArray.length - n % byArray.length - 1;
            int n4 = n++;
            arg0[n4] = (byte)(arg0[n4] ^ byArray[n3]);
            n2 = n;
        }
        return arg0;
    }
}

