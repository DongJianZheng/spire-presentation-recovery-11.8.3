/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprd;
import com.spire.presentation.packages.sprerz;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprksa;
import com.spire.presentation.packages.sprlyja;
import com.spire.presentation.packages.sproqa;
import com.spire.presentation.packages.sprwua;
import java.io.IOException;
import java.io.InputStream;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;

public class sprhpa {
    private static volatile boolean cfr_renamed_3;
    private static volatile boolean cfr_renamed_4;

    public static byte[] cfr_renamed_704(InputStream arg0, int arg1) throws IOException {
        byte[] byArray = new byte[arg1];
        if (arg0.read(byArray) != byArray.length) {
            throw new IOException(sprerz.cfr_renamed_9("&}\u001c2\r|\u0007g\u000fzHp\u0011f\raHf\u00072\u001aw\tvF"));
        }
        return byArray;
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

    public static int[] cfr_renamed_706(int arg0, int arg1, int arg2, SecureRandom arg3) {
        int n;
        int n2;
        Integer n3 = spriwa.cfr_renamed_279(1);
        Integer n4 = spriwa.cfr_renamed_279(-1);
        Integer n5 = spriwa.cfr_renamed_279(0);
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

    public static sprd cfr_renamed_707(int arg0, int arg1, int arg2, boolean arg3, SecureRandom arg4) {
        if (arg3) {
            return sproqa.cfr_renamed_708(arg0, arg1, arg2, arg4);
        }
        return sprwua.cfr_renamed_708(arg0, arg1, arg2, arg4);
    }

    public static boolean cfr_renamed_709() {
        if (!cfr_renamed_4) {
            String string = System.getProperty(sprlyja.cfr_renamed_9(",]mO1M+"));
            String string2 = System.getProperty(sprerz.cfr_renamed_9("\u001bg\u0006<\t`\u000bzFv\tf\t<\u0005}\fw\u0004"));
            cfr_renamed_3 = sprlyja.cfr_renamed_9("\"C'\u0018w").equals(string) || sprerz.cfr_renamed_9("jP$7$\\").equals(string) || sprlyja.cfr_renamed_9("3^ \u0018w").equals(string) || sprerz.cfr_renamed_9("$\\").equals(string2);
            cfr_renamed_4 = true;
        }
        return cfr_renamed_3;
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
        return sprksa.cfr_renamed_712((int)arg0, (int)arg1).cfr_renamed_4;
    }
}

