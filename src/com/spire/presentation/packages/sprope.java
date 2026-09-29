/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprdle;
import com.spire.presentation.packages.sprksa;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprrqe;
import com.spire.presentation.packages.sprvco;
import com.spire.presentation.packages.sprvva;
import java.io.IOException;
import java.io.OutputStream;

public class sprope {
    private OutputStream cfr_renamed_4;

    public void cfr_renamed_4783(sprvva arg0) throws IOException {
        if (arg0 != null) {
            sprope sprope2 = this;
            arg0.cfr_renamed_4613(new sprdle(sprope2, sprope2.cfr_renamed_4));
            return;
        }
        throw new IOException(sprvco.cfr_renamed_9("\u0005%\u0007<K?\t:\u000e3\u001fp\u000f5\u001f5\b$\u000e4"));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_4784(int n, int n2, byte[] byArray) throws IOException {
        void arg2;
        void arg1;
        void arg0;
        sprope sprope2 = this;
        sprope2.cfr_renamed_4781((int)arg0, (int)arg1);
        sprope2.cfr_renamed_4782(byArray.length);
        this.cfr_renamed_4923((byte[])arg2);
    }

    public void cfr_renamed_2947() throws IOException {
        this.cfr_renamed_4.flush();
    }

    public sprope cfr_renamed_4785() {
        return new sprrqe(this.cfr_renamed_4);
    }

    public sprope cfr_renamed_4790() {
        return new sprpve(this.cfr_renamed_4);
    }

    public void cfr_renamed_4923(byte[] arg0) throws IOException {
        this.cfr_renamed_4.write(arg0);
    }

    public void cfr_renamed_4781(int arg0, int arg1) throws IOException {
        if (arg1 < 31) {
            this.cfr_renamed_4787(arg0 | arg1);
            return;
        }
        this.cfr_renamed_4787(arg0 | 0x1F);
        if (arg1 < 128) {
            this.cfr_renamed_4787(arg1);
            return;
        }
        byte[] byArray = new byte[5];
        int n = byArray.length;
        byArray[--n] = (byte)(arg1 & 0x7F);
        do {
            byArray[--n] = (byte)((arg1 >>= 7) & 0x7F | 0x80);
        } while (arg1 > 127);
        this.cfr_renamed_4924(byArray, n, byArray.length - n);
    }

    public void cfr_renamed_4907() throws IOException {
        sprope sprope2 = this;
        sprope2.cfr_renamed_4.write(5);
        sprope2.cfr_renamed_4.write(0);
    }

    public void cfr_renamed_4787(int arg0) throws IOException {
        this.cfr_renamed_4.write(arg0);
    }

    public void cfr_renamed_4782(int arg0) throws IOException {
        if (arg0 > 127) {
            int n;
            int n2;
            int n3 = 1;
            int n4 = n2 = arg0;
            while ((n2 = n4 >>> 8) != 0) {
                n4 = n2;
                ++n3;
            }
            this.cfr_renamed_4787((byte)(n3 | 0x80));
            int n5 = n = (n3 - 1) * 8;
            while (n5 >= 0) {
                int n6 = n;
                this.cfr_renamed_4787((byte)(arg0 >> n6));
                n5 = n -= 8;
            }
        } else {
            this.cfr_renamed_4787((byte)arg0);
        }
    }

    public void cfr_renamed_2149(spra arg0) throws IOException {
        if (arg0 != null) {
            arg0.cfr_renamed_119().cfr_renamed_4613(this);
            return;
        }
        throw new IOException(sprksa.cfr_renamed_9("\u000b_\tFEE\u0007@\u0000I\u0011\n\u0001O\u0011O\u0006^\u0000N"));
    }

    public void cfr_renamed_4924(byte[] arg0, int arg1, int arg2) throws IOException {
        this.cfr_renamed_4.write(arg0, arg1, arg2);
    }

    public void cfr_renamed_2637() throws IOException {
        this.cfr_renamed_4.close();
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_4614(int n, byte[] byArray) throws IOException {
        void arg1;
        void arg0;
        sprope sprope2 = this;
        sprope2.cfr_renamed_4787((int)arg0);
        sprope2.cfr_renamed_4782(byArray.length);
        this.cfr_renamed_4923((byte[])arg1);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4;
        int cfr_ignored_0 = 5 << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 5;
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

    public sprope(OutputStream outputStream) {
        this.cfr_renamed_4 = outputStream;
    }
}

