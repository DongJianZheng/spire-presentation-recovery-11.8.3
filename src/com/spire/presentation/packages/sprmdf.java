/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spral;
import com.spire.presentation.packages.spraxo;
import com.spire.presentation.packages.sprchf;
import com.spire.presentation.packages.sprfef;
import com.spire.presentation.packages.sprfsz;
import com.spire.presentation.packages.sprsxe;
import com.spire.presentation.packages.spruaf;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class sprmdf {
    private static volatile boolean cfr_renamed_3;
    private static volatile boolean cfr_renamed_4;

    public static boolean cfr_renamed_709() {
        if (!cfr_renamed_4) {
            String string = System.getProperty(sprfsz.cfr_renamed_9("V]\u0017OKMQ"));
            String string2 = System.getProperty(spraxo.cfr_renamed_9("&j;14m6w{{4k418p1z9"));
            cfr_renamed_3 = sprfsz.cfr_renamed_9("XC]\u0018\r").equals(string) || spraxo.cfr_renamed_9("gm)\n)a").equals(string) || sprfsz.cfr_renamed_9("I^Z\u0018\r").equals(string) || spraxo.cfr_renamed_9(")a").equals(string2);
            cfr_renamed_4 = true;
        }
        return cfr_renamed_3;
    }

    public static int cfr_renamed_705(int arg0, int arg1, int arg2) {
        int n;
        int n2 = 1;
        int n3 = n = 0;
        while (n3 < arg1) {
            n2 = n2 * arg0 % arg2;
            n3 = ++n;
        }
        return n2;
    }

    public static spral cfr_renamed_707(int arg0, int arg1, int arg2, boolean arg3, SecureRandom arg4) {
        if (arg3) {
            return sprsxe.cfr_renamed_708(arg0, arg1, arg2, arg4);
        }
        return sprchf.cfr_renamed_708(arg0, arg1, arg2, arg4);
    }

    public static long cfr_renamed_710(long arg0, int arg1, long arg2) {
        int n;
        long l = 1L;
        int n2 = n = 0;
        while (n2 < arg1) {
            l = l * arg0 % arg2;
            n2 = ++n;
        }
        return l;
    }

    public static int cfr_renamed_711(int arg0, int arg1) {
        if ((arg0 %= arg1) < 0) {
            arg0 += arg1;
        }
        return sprfef.cfr_renamed_712((int)arg0, (int)arg1).cfr_renamed_3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 3;
        int cfr_ignored_0 = 4 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ (2 ^ 5) << 1;
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

    public static int[] cfr_renamed_706(int arg0, int arg1, int arg2, SecureRandom arg3) {
        int n;
        int n2;
        Integer n3 = spruaf.cfr_renamed_279(1);
        Integer n4 = spruaf.cfr_renamed_279(-1);
        Integer n5 = spruaf.cfr_renamed_279(0);
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        int n6 = n2 = 0;
        while (n6 < arg1) {
            arrayList.add(n3);
            n6 = ++n2;
        }
        int n7 = n2 = 0;
        while (n7 < arg2) {
            arrayList.add(n4);
            n7 = ++n2;
        }
        ArrayList<Integer> arrayList2 = arrayList;
        while (arrayList2.size() < arg0) {
            ArrayList<Integer> arrayList3 = arrayList;
            arrayList2 = arrayList3;
            arrayList3.add(n5);
        }
        Collections.shuffle(arrayList, arg3);
        int[] nArray = new int[arg0];
        int n8 = n = 0;
        while (n8 < arg0) {
            int n9 = n++;
            nArray[n9] = (Integer)arrayList.get(n9);
            n8 = n;
        }
        return nArray;
    }

    public static byte[] cfr_renamed_704(InputStream arg0, int arg1) throws IOException {
        byte[] byArray = new byte[arg1];
        if (arg0.read(byArray) != byArray.length) {
            throw new IOException(sprfsz.cfr_renamed_9("wAM\u000e\\@V[^F\u0019L@Z\\]\u0019ZV\u000eKKXJ\u0017"));
        }
        return byArray;
    }
}

