/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfar;
import com.spire.presentation.packages.sprlte;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class sprkqe {
    private static int cfr_renamed_4 = 4096;

    public static int cfr_renamed_473(InputStream arg0, byte[] arg1, int arg2, int arg3) throws IOException {
        int n;
        int n2 = n = 0;
        while (n2 < arg3) {
            int n3 = arg0.read(arg1, arg2 + n, arg3 - n);
            if (n3 < 0) {
                return n;
            }
            n2 = n + n3;
        }
        return n;
    }

    public static void cfr_renamed_472(InputStream arg0, OutputStream arg1) throws IOException {
        sprkqe.cfr_renamed_5195(arg0, arg1, cfr_renamed_4);
    }

    public static void cfr_renamed_5196(ByteArrayOutputStream arg0, OutputStream arg1) throws IOException {
        arg0.writeTo(arg1);
    }

    public static void cfr_renamed_477(InputStream arg0) throws IOException {
        byte[] byArray = new byte[cfr_renamed_4];
        InputStream inputStream = arg0;
        while (inputStream.read(byArray, 0, byArray.length) >= 0) {
            inputStream = arg0;
        }
    }

    public static void cfr_renamed_5197(byte[] arg0, int arg1, int arg2) {
        if (arg0 == null) {
            throw new NullPointerException();
        }
        int n = arg0.length - arg1;
        int n2 = n - arg2;
        if ((arg1 | arg2 | n | n2) < 0) {
            throw new IndexOutOfBoundsException();
        }
    }

    public static void cfr_renamed_5195(InputStream arg0, OutputStream arg1, int arg2) throws IOException {
        int n;
        byte[] byArray = new byte[arg2];
        InputStream inputStream = arg0;
        while ((n = inputStream.read(byArray, 0, byArray.length)) >= 0) {
            inputStream = arg0;
            arg1.write(byArray, 0, n);
        }
    }

    public static int cfr_renamed_476(InputStream arg0, byte[] arg1) throws IOException {
        return sprkqe.cfr_renamed_473(arg0, arg1, 0, arg1.length);
    }

    public static byte[] cfr_renamed_471(InputStream arg0) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream;
        ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream = new ByteArrayOutputStream();
        sprkqe.cfr_renamed_472(arg0, byteArrayOutputStream2);
        return byteArrayOutputStream2.toByteArray();
    }

    public static byte[] cfr_renamed_474(InputStream arg0, int arg1) throws IOException {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        sprkqe.cfr_renamed_475(arg0, arg1, byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    public static long cfr_renamed_475(InputStream arg0, long arg1, OutputStream arg2) throws IOException {
        int n;
        long l = 0L;
        byte[] byArray = new byte[cfr_renamed_4];
        InputStream inputStream = arg0;
        while ((n = inputStream.read(byArray, 0, byArray.length)) >= 0) {
            if (arg1 - l < (long)n) {
                throw new sprlte(sprfar.cfr_renamed_9("#O\u0013OGa\u0011K\u0015H\u000bA\u0010"));
            }
            l += (long)n;
            inputStream = arg0;
            arg2.write(byArray, 0, n);
        }
        return l;
    }
}

