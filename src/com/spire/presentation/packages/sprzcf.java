/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgf;
import java.nio.ByteBuffer;

public class sprzcf {
    private sprgf cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzcf(byte[] byArray, sprgf sprgf2) {
        void arg0;
        sprzcf sprzcf2 = this;
        this.cfr_renamed_4 = 0;
        sprzcf2.cfr_renamed_3 = arg0;
        sprzcf2.cfr_renamed_2 = sprgf2;
    }

    public byte[] cfr_renamed_1322(int arg0) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = byteBuffer = ByteBuffer.allocate(arg0);
        while (byteBuffer2.hasRemaining()) {
            sprzcf sprzcf2;
            ByteBuffer byteBuffer3 = ByteBuffer.allocate(this.cfr_renamed_3.length + 4);
            byteBuffer3.put(this.cfr_renamed_3);
            byteBuffer3.putInt(this.cfr_renamed_4);
            byte[] byArray = byteBuffer3.array();
            byte[] byArray2 = new byte[this.cfr_renamed_2.cfr_renamed_1218()];
            this.cfr_renamed_2.cfr_renamed_1197(byArray, 0, byArray.length);
            this.cfr_renamed_2.cfr_renamed_1219(byArray2, 0);
            if (byteBuffer.remaining() < byArray2.length) {
                sprzcf2 = this;
                ByteBuffer byteBuffer4 = byteBuffer;
                byteBuffer4.put(byArray2, 0, byteBuffer4.remaining());
            } else {
                byteBuffer.put(byArray2);
                sprzcf2 = this;
            }
            ++sprzcf2.cfr_renamed_4;
            byteBuffer2 = byteBuffer;
        }
        return byteBuffer.array();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = 4 << 4 ^ 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1;
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
}

