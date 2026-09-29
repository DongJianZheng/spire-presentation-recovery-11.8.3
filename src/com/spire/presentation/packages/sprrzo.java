/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjgga;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtzja;
import com.spire.presentation.packages.sprujo;
import com.spire.presentation.packages.sprvso;

@sprtea
public class sprrzo {
    public static void cfr_renamed_18367(String arg0, Object ... arg1) {
    }

    public static Object[] cfr_renamed_18289(Object[] arg0, Object[] arg1) {
        Object[] objectArray = new Object[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, objectArray, 0, arg0.length);
        System.arraycopy(arg1, 0, objectArray, arg0.length, arg1.length);
        return objectArray;
    }

    public static long[] cfr_renamed_18656(sprujo arg0, int arg1) {
        int n;
        long[] lArray = new long[arg1];
        int n2 = n = 0;
        while (n2 < lArray.length) {
            lArray[n++] = arg0.cfr_renamed_13220();
            n2 = n;
        }
        return lArray;
    }

    public static int cfr_renamed_18657(sprujo arg0) {
        return (arg0.cfr_renamed_12137() & 0xFF) << 16 | arg0.cfr_renamed_13218() & 0xFFFF;
    }

    public static String cfr_renamed_18658(long arg0) {
        byte[] byArray = sprtzja.cfr_renamed_11787(arg0);
        sprjgga.cfr_renamed_537(byArray);
        return sprszca.cfr_renamed_11605().cfr_renamed_11595(byArray, 0, byArray.length);
    }

    public static float cfr_renamed_18659(sprujo arg0) {
        return (float)arg0.cfr_renamed_12254() / 16384.0f;
    }

    @sprtea
    public static void cfr_renamed_18268(String arg0) {
    }

    public static Object[] cfr_renamed_18660(Object[] arg0, int arg1) {
        int n = arg0.length;
        Object[] objectArray = new Object[n + arg1];
        System.arraycopy(arg0, 0, objectArray, 0, n);
        return objectArray;
    }

    public static int[] cfr_renamed_18661(sprujo arg0, int arg1) {
        int n;
        int[] nArray = new int[arg1];
        int n2 = n = 0;
        while (n2 < nArray.length) {
            nArray[n++] = arg0.cfr_renamed_13218();
            n2 = n;
        }
        return nArray;
    }

    public static sprvso cfr_renamed_18662(sprujo arg0) {
        return new sprvso(arg0.cfr_renamed_12254(), arg0.cfr_renamed_12254(), arg0.cfr_renamed_12254(), arg0.cfr_renamed_12254());
    }

    public static int[] cfr_renamed_18291(int[] arg0, int[] arg1) {
        int[] nArray = new int[arg0.length + arg1.length];
        System.arraycopy(arg0, 0, nArray, 0, arg0.length);
        System.arraycopy(arg1, 0, nArray, arg0.length, arg1.length);
        return nArray;
    }

    public static long[] cfr_renamed_18663(sprujo arg0, int arg1) {
        int n;
        long[] lArray = new long[arg1];
        int n2 = n = 0;
        while (n2 < lArray.length) {
            lArray[n++] = arg0.cfr_renamed_13218() & 0xFFFF;
            n2 = n;
        }
        return lArray;
    }

    private /* synthetic */ sprrzo() {
    }

    public static long cfr_renamed_18664(String arg0) {
        byte[] byArray = sprszca.cfr_renamed_11605().cfr_renamed_11606(arg0);
        sprjgga.cfr_renamed_537(byArray);
        return sprtzja.cfr_renamed_12136(byArray, 0);
    }

    public static float cfr_renamed_18665(sprujo arg0) {
        return (float)(arg0.cfr_renamed_13220() & 0xFFFFFFFFL) / 65536.0f;
    }
}

