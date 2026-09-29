/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprsod;
import com.spire.presentation.packages.sprwtb;
import java.math.BigInteger;
import java.util.Random;

public abstract class sprrge {
    private static /* synthetic */ sprwtb cfr_renamed_4579(sprwtb arg0) {
        int n;
        sprwtb sprwtb2 = arg0;
        int n2 = n = 1;
        while (n2 < arg0.cfr_renamed_1938()) {
            sprwtb2 = sprwtb2.cfr_renamed_1048().cfr_renamed_1983(arg0);
            n2 = ++n;
        }
        return sprwtb2;
    }

    private static /* synthetic */ sprwtb cfr_renamed_4580(sprpib arg0, sprwtb arg1) {
        if (arg1.cfr_renamed_805()) {
            return arg1;
        }
        sprwtb sprwtb2 = arg0.cfr_renamed_1652(sprpb.cfr_renamed_1);
        sprwtb sprwtb3 = null;
        sprwtb sprwtb4 = null;
        Random random = new Random();
        int n = arg1.cfr_renamed_1938();
        do {
            int n2;
            sprwtb sprwtb5 = arg0.cfr_renamed_1652(new BigInteger(n, random));
            sprwtb3 = sprwtb2;
            sprwtb sprwtb6 = arg1;
            int n3 = n2 = 1;
            while (n3 <= n - 1) {
                sprwtb sprwtb7 = sprwtb6.cfr_renamed_1048();
                sprwtb3 = sprwtb3.cfr_renamed_1048().cfr_renamed_1983(sprwtb7.cfr_renamed_1833(sprwtb5));
                sprwtb6 = sprwtb7.cfr_renamed_1983(arg1);
                n3 = ++n2;
            }
            if (sprwtb6.cfr_renamed_805()) continue;
            return null;
        } while ((sprwtb4 = sprwtb3.cfr_renamed_1048().cfr_renamed_1983(sprwtb3)).cfr_renamed_805());
        return sprwtb3;
    }

    public static byte[] cfr_renamed_2512(sprrlb arg0) {
        arg0 = arg0.cfr_renamed_1775();
        sprwtb sprwtb2 = arg0.cfr_renamed_1969();
        byte[] byArray = sprwtb2.cfr_renamed_91();
        if (!sprwtb2.cfr_renamed_805()) {
            if (sprrge.cfr_renamed_4579(arg0.cfr_renamed_1973().cfr_renamed_1984(sprwtb2)).cfr_renamed_287()) {
                byte[] byArray2 = byArray;
                int n = byArray.length - 1;
                byArray2[n] = (byte)(byArray2[n] | 1);
                return byArray;
            }
            byte[] byArray3 = byArray;
            int n = byArray.length - 1;
            byArray3[n] = (byte)(byArray3[n] & 0xFE);
        }
        return byArray;
    }

    public static sprrlb cfr_renamed_2509(sprpib arg0, byte[] arg1) {
        sprwtb sprwtb2;
        sprwtb sprwtb3 = arg0.cfr_renamed_1652(BigInteger.valueOf(arg1[arg1.length - 1] & 1));
        sprwtb sprwtb4 = arg0.cfr_renamed_1652(new BigInteger(1, arg1));
        if (!sprrge.cfr_renamed_4579(sprwtb4).equals(arg0.cfr_renamed_1778())) {
            sprwtb4 = sprwtb4.cfr_renamed_1908();
        }
        sprwtb sprwtb5 = null;
        if (sprwtb4.cfr_renamed_805()) {
            sprwtb2 = sprwtb5 = arg0.cfr_renamed_1997().cfr_renamed_1817();
        } else {
            sprwtb sprwtb6 = sprwtb4.cfr_renamed_1048().cfr_renamed_952().cfr_renamed_1833(arg0.cfr_renamed_1997()).cfr_renamed_1983(arg0.cfr_renamed_1778()).cfr_renamed_1983(sprwtb4);
            sprwtb sprwtb7 = sprrge.cfr_renamed_4580(arg0, sprwtb6);
            if (sprwtb7 != null) {
                if (!sprrge.cfr_renamed_4579(sprwtb7).equals(sprwtb3)) {
                    sprwtb7 = sprwtb7.cfr_renamed_1908();
                }
                sprwtb5 = sprwtb4.cfr_renamed_1833(sprwtb7);
            }
            sprwtb2 = sprwtb5;
        }
        if (sprwtb2 == null) {
            throw new IllegalArgumentException(sprsod.cfr_renamed_9("\u0013l,c6k>\"*m3l.\"9m7r(g)q3m4"));
        }
        return arg0.cfr_renamed_1996(sprwtb4.cfr_renamed_1779(), sprwtb5.cfr_renamed_1779());
    }
}

