/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprrfz;
import com.spire.presentation.packages.spruaf;
import java.util.Hashtable;

public class sprymk {
    public static final Hashtable cfr_renamed_4 = new Hashtable();

    public static boolean cfr_renamed_3306(byte[] arg0, int arg1) {
        return arg0 != null && arg0.length > arg1;
    }

    public static int cfr_renamed_9962(sprgf arg0) {
        return (Integer)cfr_renamed_4.get(arg0.cfr_renamed_1315());
    }

    public static byte[] cfr_renamed_9963(sprgf arg0, byte[] arg1, int arg2) {
        int n;
        int n2;
        byte[] byArray = new byte[(arg2 + 7) / 8];
        int n3 = byArray.length / arg0.cfr_renamed_1218();
        int n4 = 1;
        byte[] byArray2 = new byte[arg0.cfr_renamed_1218()];
        int n5 = n2 = 0;
        while (n5 <= n3) {
            sprgf sprgf2 = arg0;
            int n6 = arg2;
            sprgf sprgf3 = arg0;
            arg0.cfr_renamed_1221((byte)n4);
            sprgf3.cfr_renamed_1221((byte)(arg2 >> 24));
            sprgf3.cfr_renamed_1221((byte)(arg2 >> 16));
            arg0.cfr_renamed_1221((byte)(n6 >> 8));
            sprgf2.cfr_renamed_1221((byte)n6);
            sprgf2.cfr_renamed_1197(arg1, 0, arg1.length);
            arg0.cfr_renamed_1219(byArray2, 0);
            n = byArray.length - n2 * byArray2.length > byArray2.length ? byArray2.length : byArray.length - n2 * byArray2.length;
            ++n4;
            System.arraycopy(byArray2, 0, byArray, n2 * byArray2.length, n);
            n5 = ++n2;
        }
        if (arg2 % 8 != 0) {
            int n7;
            n2 = 8 - arg2 % 8;
            n = 0;
            int n8 = n7 = 0;
            while (n8 != byArray.length) {
                int n9 = byArray[n7] & 0xFF;
                byArray[n7++] = (byte)(n9 >>> n2 | n << 8 - n2);
                n = n9;
                n8 = n7;
            }
        }
        return byArray;
    }

    static {
        cfr_renamed_4.put("SHA-1", spruaf.cfr_renamed_279(128));
        cfr_renamed_4.put("SHA-224", spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put("SHA-256", spruaf.cfr_renamed_279(256));
        cfr_renamed_4.put("SHA-384", spruaf.cfr_renamed_279(256));
        cfr_renamed_4.put("SHA-512", spruaf.cfr_renamed_279(256));
        cfr_renamed_4.put(sprrfz.cfr_renamed_9("1p#\u0015W\tP\u0017P\nV"), spruaf.cfr_renamed_279(192));
        cfr_renamed_4.put("SHA-512/256", spruaf.cfr_renamed_279(256));
    }

    public static int cfr_renamed_9964(spraq arg0) {
        String string;
        String string2 = string = arg0.cfr_renamed_1315();
        return (Integer)cfr_renamed_4.get(string2.substring(0, string2.indexOf("/")));
    }
}

