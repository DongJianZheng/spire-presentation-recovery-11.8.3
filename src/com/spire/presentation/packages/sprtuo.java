/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprlxo;
import com.spire.presentation.packages.sprpcba;
import com.spire.presentation.packages.sprrtea;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public class sprtuo {
    private static String[] cfr_renamed_0;
    private static String[] cfr_renamed_1;
    private static String[] cfr_renamed_2;
    private static String[] cfr_renamed_3;
    private static String[] cfr_renamed_4;

    private /* synthetic */ sprtuo() {
    }

    @sprtea
    public static String cfr_renamed_17263(int arg0) {
        if (arg0 == 0) {
            return "0";
        }
        return cfr_renamed_4[arg0 % cfr_renamed_4.length];
    }

    public static String cfr_renamed_17265(int arg0) {
        int n;
        if (arg0 < 10) {
            return cfr_renamed_3[arg0];
        }
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = arg0 >= 10000;
        sprtvp sprtvp2 = sprlxo.cfr_renamed_17192(arg0, 4);
        int n2 = n = sprtvp2.cfr_renamed_11861() - 1;
        while (n2 >= 0) {
            sprtvp sprtvp3 = sprlxo.cfr_renamed_17192(sprtvp2.cfr_renamed_576(n), 1);
            int n3 = sprtvp3.cfr_renamed_11861() - 1;
            while (n3 >= 0) {
                int n4;
                int n5 = sprtvp3.cfr_renamed_576(n4);
                if (n5 != 0) {
                    if (n5 > 1 || n4 == 0 || bl) {
                        sprghha.cfr_renamed_12279(stringBuilder, cfr_renamed_3[n5]);
                    }
                    sprghha.cfr_renamed_12279(stringBuilder, cfr_renamed_1[n4]);
                    bl = false;
                }
                n3 = --n4;
            }
            sprghha.cfr_renamed_12279(stringBuilder, cfr_renamed_2[n--]);
            n2 = n;
        }
        return stringBuilder.toString();
    }

    static {
        String[] stringArray = new String[46];
        stringArray[0] = sprrtea.cfr_renamed_9("\u30de");
        stringArray[1] = sprpcba.cfr_renamed_9("\u30a8");
        stringArray[2] = sprrtea.cfr_renamed_9("\u3089");
        stringArray[3] = sprpcba.cfr_renamed_9("\u30ac");
        stringArray[4] = sprrtea.cfr_renamed_9("\u3085");
        stringArray[5] = sprpcba.cfr_renamed_9("\u30a0");
        stringArray[6] = sprrtea.cfr_renamed_9("\u3086");
        stringArray[7] = sprpcba.cfr_renamed_9("\u30a7");
        stringArray[8] = sprrtea.cfr_renamed_9("\u3082");
        stringArray[9] = sprpcba.cfr_renamed_9("\u30bb");
        stringArray[10] = sprrtea.cfr_renamed_9("\u309e");
        stringArray[11] = sprpcba.cfr_renamed_9("\u30bf");
        stringArray[12] = sprrtea.cfr_renamed_9("\u309a");
        stringArray[13] = sprpcba.cfr_renamed_9("\u30b3");
        stringArray[14] = sprrtea.cfr_renamed_9("\u3096");
        stringArray[15] = sprpcba.cfr_renamed_9("\u30b7");
        stringArray[16] = sprrtea.cfr_renamed_9("\u3092");
        stringArray[17] = sprpcba.cfr_renamed_9("\u30cb");
        stringArray[18] = sprrtea.cfr_renamed_9("\u30e9");
        stringArray[19] = sprpcba.cfr_renamed_9("\u30cc");
        stringArray[20] = sprrtea.cfr_renamed_9("\u30e5");
        stringArray[21] = sprpcba.cfr_renamed_9("\u30c0");
        stringArray[22] = sprrtea.cfr_renamed_9("\u30e6");
        stringArray[23] = sprpcba.cfr_renamed_9("\u30c6");
        stringArray[24] = sprrtea.cfr_renamed_9("\u30e0");
        stringArray[25] = sprpcba.cfr_renamed_9("\u30c4");
        stringArray[26] = sprrtea.cfr_renamed_9("\u30e2");
        stringArray[27] = sprpcba.cfr_renamed_9("\u30d8");
        stringArray[28] = sprrtea.cfr_renamed_9("\u30f8");
        stringArray[29] = sprpcba.cfr_renamed_9("\u30d2");
        stringArray[30] = sprrtea.cfr_renamed_9("\u30f6");
        stringArray[31] = sprpcba.cfr_renamed_9("\u30d4");
        stringArray[32] = sprrtea.cfr_renamed_9("\u30f2");
        stringArray[33] = sprpcba.cfr_renamed_9("\u30ea");
        stringArray[34] = sprrtea.cfr_renamed_9("\u30cc");
        stringArray[35] = sprpcba.cfr_renamed_9("\u30e8");
        stringArray[36] = sprrtea.cfr_renamed_9("\u30c9");
        stringArray[37] = sprpcba.cfr_renamed_9("\u30ec");
        stringArray[38] = sprrtea.cfr_renamed_9("\u30c5");
        stringArray[39] = sprpcba.cfr_renamed_9("\u30e3");
        stringArray[40] = sprrtea.cfr_renamed_9("\u30c7");
        stringArray[41] = sprpcba.cfr_renamed_9("\u30e1");
        stringArray[42] = sprrtea.cfr_renamed_9("\u30c1");
        stringArray[43] = sprpcba.cfr_renamed_9("\u30e7");
        stringArray[44] = sprrtea.cfr_renamed_9("\u30c2");
        stringArray[45] = sprpcba.cfr_renamed_9("\u30f8");
        cfr_renamed_0 = stringArray;
        String[] stringArray2 = new String[48];
        stringArray2[0] = sprrtea.cfr_renamed_9("\u30de");
        stringArray2[1] = sprpcba.cfr_renamed_9("\u30ae");
        stringArray2[2] = sprrtea.cfr_renamed_9("\u30c0");
        stringArray2[3] = sprpcba.cfr_renamed_9("\u30c5");
        stringArray2[4] = sprrtea.cfr_renamed_9("\u30e6");
        stringArray2[5] = sprpcba.cfr_renamed_9("\u30d1");
        stringArray2[6] = sprrtea.cfr_renamed_9("\u30f5");
        stringArray2[7] = sprpcba.cfr_renamed_9("\u30c2");
        stringArray2[8] = sprrtea.cfr_renamed_9("\u30ec");
        stringArray2[9] = sprpcba.cfr_renamed_9("\u30e0");
        stringArray2[10] = sprrtea.cfr_renamed_9("\u30e1");
        stringArray2[11] = sprpcba.cfr_renamed_9("\u30e1");
        stringArray2[12] = sprrtea.cfr_renamed_9("\u30df");
        stringArray2[13] = sprpcba.cfr_renamed_9("\u30e5");
        stringArray2[14] = sprrtea.cfr_renamed_9("\u3086");
        stringArray2[15] = sprpcba.cfr_renamed_9("\u30e2");
        stringArray2[16] = sprrtea.cfr_renamed_9("\u3092");
        stringArray2[17] = sprpcba.cfr_renamed_9("\u30e6");
        stringArray2[18] = sprrtea.cfr_renamed_9("\u3090");
        stringArray2[19] = sprpcba.cfr_renamed_9("\u30ce");
        stringArray2[20] = sprrtea.cfr_renamed_9("\u30e0");
        stringArray2[21] = sprpcba.cfr_renamed_9("\u30c0");
        stringArray2[22] = sprrtea.cfr_renamed_9("\u30c4");
        stringArray2[23] = sprpcba.cfr_renamed_9("\u30ea");
        stringArray2[24] = sprrtea.cfr_renamed_9("\u308b");
        stringArray2[25] = sprpcba.cfr_renamed_9("\u30fa");
        stringArray2[26] = sprrtea.cfr_renamed_9("\u30e3");
        stringArray2[27] = sprpcba.cfr_renamed_9("\u30a0");
        stringArray2[28] = sprrtea.cfr_renamed_9("\u3082");
        stringArray2[29] = sprpcba.cfr_renamed_9("\u30ee");
        stringArray2[30] = sprrtea.cfr_renamed_9("\u30f3");
        stringArray2[31] = sprpcba.cfr_renamed_9("\u30bb");
        stringArray2[32] = sprrtea.cfr_renamed_9("\u30f8");
        stringArray2[33] = sprpcba.cfr_renamed_9("\u30b9");
        stringArray2[34] = sprrtea.cfr_renamed_9("\u3085");
        stringArray2[35] = sprpcba.cfr_renamed_9("\u30cc");
        stringArray2[36] = sprrtea.cfr_renamed_9("\u308f");
        stringArray2[37] = sprpcba.cfr_renamed_9("\u30bf");
        stringArray2[38] = sprrtea.cfr_renamed_9("\u3080");
        stringArray2[39] = sprpcba.cfr_renamed_9("\u30ec");
        stringArray2[40] = sprrtea.cfr_renamed_9("\u30cc");
        stringArray2[41] = sprpcba.cfr_renamed_9("\u30d5");
        stringArray2[42] = sprrtea.cfr_renamed_9("\u309a");
        stringArray2[43] = sprpcba.cfr_renamed_9("\u30fb");
        stringArray2[44] = sprrtea.cfr_renamed_9("\u30ff");
        stringArray2[45] = sprpcba.cfr_renamed_9("\u30e8");
        stringArray2[46] = sprrtea.cfr_renamed_9("\u3096");
        stringArray2[47] = sprpcba.cfr_renamed_9("\u30b3");
        cfr_renamed_4 = stringArray2;
        String[] stringArray3 = new String[10];
        stringArray3[0] = sprrtea.cfr_renamed_9("\u302a");
        stringArray3[1] = sprpcba.cfr_renamed_9("\u4e0a");
        stringArray3[2] = sprrtea.cfr_renamed_9("\u4ea1");
        stringArray3[3] = sprpcba.cfr_renamed_9("\u4e03");
        stringArray3[4] = sprrtea.cfr_renamed_9("\u56f6");
        stringArray3[5] = sprpcba.cfr_renamed_9("\u4e9e");
        stringArray3[6] = sprrtea.cfr_renamed_9("\u5140");
        stringArray3[7] = sprpcba.cfr_renamed_9("\u4e09");
        stringArray3[8] = sprrtea.cfr_renamed_9("\u5146");
        stringArray3[9] = sprpcba.cfr_renamed_9("\u4e57");
        cfr_renamed_3 = stringArray3;
        String[] stringArray4 = new String[4];
        stringArray4[0] = "";
        stringArray4[1] = sprrtea.cfr_renamed_9("\u536c");
        stringArray4[2] = sprpcba.cfr_renamed_9("\u7674");
        stringArray4[3] = sprrtea.cfr_renamed_9("\u536e");
        cfr_renamed_1 = stringArray4;
        String[] stringArray5 = new String[3];
        stringArray5[0] = "";
        stringArray5[1] = sprpcba.cfr_renamed_9("\u4e0d");
        stringArray5[2] = sprrtea.cfr_renamed_9("\u5129");
        cfr_renamed_2 = stringArray5;
    }

    public static String cfr_renamed_17264(int arg0, int arg1) {
        int n;
        sprtvp sprtvp2 = sprlxo.cfr_renamed_17192(arg0, 1);
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = arg1 - sprtvp2.cfr_renamed_11861();
        while (n2 > 0) {
            sprghha.cfr_renamed_12279(stringBuilder, cfr_renamed_3[0]);
            n2 = --n;
        }
        int n3 = n = sprtvp2.cfr_renamed_11861() - 1;
        while (n3 >= 0) {
            int n4 = sprtvp2.cfr_renamed_576(n);
            sprghha.cfr_renamed_12279(stringBuilder, cfr_renamed_3[n4]);
            n3 = --n;
        }
        return stringBuilder.toString();
    }

    @sprtea
    public static String cfr_renamed_17259(int arg0) {
        if (arg0 == 0) {
            return "0";
        }
        return cfr_renamed_0[arg0 % cfr_renamed_0.length];
    }
}

