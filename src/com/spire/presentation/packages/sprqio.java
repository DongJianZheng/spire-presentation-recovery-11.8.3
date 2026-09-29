/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprruha;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvvja;

@sprtea
public class sprqio {
    @sprtea
    public static String cfr_renamed_15124(String arg0, int arg1, int arg2) {
        int n = arg1;
        return arg0.substring(n, n + (arg2 - n));
    }

    @sprtea
    public static String cfr_renamed_15125(byte[] arg0, int arg1, int arg2) {
        return sprszca.cfr_renamed_11605().cfr_renamed_11595(arg0, arg1, arg2);
    }

    @sprtea
    public static byte[] cfr_renamed_11606(String arg0) {
        return sprqio.cfr_renamed_15126(sprszca.cfr_renamed_11605(), arg0);
    }

    private static /* synthetic */ byte[] cfr_renamed_15126(sprszca arg0, String arg1) {
        sprszca sprszca2 = arg0;
        byte[] byArray = new byte[sprszca2.cfr_renamed_15127(arg1)];
        String string = arg1;
        sprszca2.cfr_renamed_14311(string, 0, string.length(), byArray, 0);
        return byArray;
    }

    @sprtea
    public static String cfr_renamed_15128(byte[] arg0, int arg1, int arg2, String arg3) {
        return sprszca.cfr_renamed_11625(arg3).cfr_renamed_11595(arg0, arg1, arg2);
    }

    @sprtea
    public static byte[] cfr_renamed_15129(String arg0, sprszca arg1) {
        return sprqio.cfr_renamed_15126(arg1, arg0);
    }

    @sprtea
    public static boolean cfr_renamed_15130(String arg0, String arg1, int arg2) {
        return sprraia.cfr_renamed_15131(arg0, arg1, arg2, (short)4) == arg2;
    }

    @sprtea
    public static String cfr_renamed_15132(byte[] byArray) {
        byte[] arg0;
        return sprqio.cfr_renamed_15125(arg0, 0, arg0.length);
    }

    private /* synthetic */ sprqio() {
    }

    @sprtea
    public static String[] cfr_renamed_15133(String arg0, String arg1, boolean arg2) {
        String[] stringArray = sprruha.cfr_renamed_15134(arg0, arg1);
        if (arg2 && stringArray.length > 1) {
            int n;
            int n2 = n = stringArray.length;
            while (n2 > 0) {
                if (stringArray[n - 1].length() > 0) {
                    if (n >= stringArray.length) break;
                    String[][] stringArrayArray = new String[1][];
                    stringArrayArray[0] = stringArray;
                    String[][] stringArrayArray2 = stringArrayArray;
                    sprvvja.cfr_renamed_13047(stringArrayArray2, n);
                    stringArray = stringArrayArray2[0];
                    return stringArray;
                }
                n2 = --n;
            }
        }
        return stringArray;
    }

    @sprtea
    public static byte[] cfr_renamed_15135(String arg0, String arg1) {
        return sprqio.cfr_renamed_15126(sprszca.cfr_renamed_11625(arg1), arg0);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public static String cfr_renamed_15136(byte[] byArray, String string) {
        void arg1;
        byte[] arg0;
        return sprqio.cfr_renamed_15128(arg0, 0, arg0.length, (String)arg1);
    }
}

