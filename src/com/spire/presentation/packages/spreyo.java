/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdzo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprliy;
import com.spire.presentation.packages.sprlxo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public class spreyo {
    private static final int cfr_renamed_1 = 22;
    private static final char cfr_renamed_2 = '\u05ea';
    private static char[][] cfr_renamed_3;
    private static final String cfr_renamed_4 = "\u05d0\u05d1\u05d2\u05d3\u05d4\u05d5\u05d6\u05d7\u05d8\u05d9\u05db\u05dc\u05de\u05e0\u05e1\u05e2\u05e4\u05e6\u05e7\u05e8\u05e9";

    @sprtea
    public static String cfr_renamed_17260(int arg0) {
        int n;
        if (arg0 == 0) {
            return "";
        }
        arg0 = sprdzo.cfr_renamed_17277(arg0);
        sprtvp sprtvp2 = sprlxo.cfr_renamed_17192(arg0, 1);
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = sprtvp2.cfr_renamed_11861() - 1;
        while (n2 >= 0) {
            String string = spreyo.cfr_renamed_17283(sprtvp2, n);
            if (string != null) {
                StringBuilder stringBuilder2 = stringBuilder;
                sprghha.cfr_renamed_12279(stringBuilder2, string);
                return stringBuilder2.toString();
            }
            int n3 = sprtvp2.cfr_renamed_576(n);
            if (n3 != 0) {
                stringBuilder.append(cfr_renamed_3[n][n3 - 1]);
            }
            n2 = --n;
        }
        return stringBuilder.toString();
    }

    private /* synthetic */ spreyo() {
    }

    @sprtea
    public static String cfr_renamed_17261(int arg0) {
        arg0 = sprdzo.cfr_renamed_17277(arg0);
        StringBuilder stringBuilder = new StringBuilder();
        int n = arg0 / 22;
        sprghha.cfr_renamed_12279(stringBuilder, sprraia.cfr_renamed_11844('\u05ea', n));
        int n2 = arg0 % 22;
        if (n2 > 0) {
            stringBuilder.append(cfr_renamed_4.charAt(n2 - 1));
        }
        return stringBuilder.toString();
    }

    static {
        char[][] cArrayArray = new char[3][];
        char[] cArray = new char[9];
        cArray[0] = 1488;
        cArray[1] = 1489;
        cArray[2] = 1490;
        cArray[3] = 1491;
        cArray[4] = 1492;
        cArray[5] = 1493;
        cArray[6] = 1494;
        cArray[7] = 1495;
        cArray[8] = 1496;
        cArrayArray[0] = cArray;
        char[] cArray2 = new char[9];
        cArray2[0] = 1497;
        cArray2[1] = 1499;
        cArray2[2] = 1500;
        cArray2[3] = 1502;
        cArray2[4] = 1504;
        cArray2[5] = 1505;
        cArray2[6] = 1506;
        cArray2[7] = 1508;
        cArray2[8] = 1510;
        cArrayArray[1] = cArray2;
        char[] cArray3 = new char[3];
        cArray3[0] = 1511;
        cArray3[1] = 1512;
        cArray3[2] = 1513;
        cArrayArray[2] = cArray3;
        cfr_renamed_3 = cArrayArray;
    }

    private static /* synthetic */ String cfr_renamed_17283(sprtvp arg0, int arg1) {
        if (arg1 != 1) {
            return null;
        }
        int n = arg0.cfr_renamed_576(arg1);
        if (n == 1) {
            n = arg0.cfr_renamed_576(arg1 - 1);
            if (n == 5) {
                return sprliy.cfr_renamed_9("\u05b5\u05f6");
            }
            if (n == 6) {
                return sprrgo.cfr_renamed_9("\u05fe\u05e1");
            }
        }
        return null;
    }
}

