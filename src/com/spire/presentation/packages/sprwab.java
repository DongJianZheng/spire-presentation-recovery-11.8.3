/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlc;
import java.nio.ByteBuffer;

public class sprwab {
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprlc cfr_renamed_4;

    public byte[] cfr_renamed_1322(int arg0) {
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2 = byteBuffer = ByteBuffer.allocate(arg0);
        while (byteBuffer2.hasRemaining()) {
            sprwab sprwab2;
            ByteBuffer byteBuffer3 = ByteBuffer.allocate(this.cfr_renamed_3.length + 4);
            byteBuffer3.put(this.cfr_renamed_3);
            byteBuffer3.putInt(this.cfr_renamed_2);
            byte[] byArray = byteBuffer3.array();
            byte[] byArray2 = new byte[this.cfr_renamed_4.cfr_renamed_1218()];
            this.cfr_renamed_4.cfr_renamed_1197(byArray, 0, byArray.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray2, 0);
            if (byteBuffer.remaining() < byArray2.length) {
                sprwab2 = this;
                ByteBuffer byteBuffer4 = byteBuffer;
                byteBuffer4.put(byArray2, 0, byteBuffer4.remaining());
            } else {
                byteBuffer.put(byArray2);
                sprwab2 = this;
            }
            ++sprwab2.cfr_renamed_2;
            byteBuffer2 = byteBuffer;
        }
        return byteBuffer.array();
    }

    /*
     * WARNING - void declaration
     */
    public sprwab(byte[] byArray, sprlc sprlc2) {
        void arg0;
        sprwab sprwab2 = this;
        this.cfr_renamed_2 = 0;
        sprwab2.cfr_renamed_3 = arg0;
        sprwab2.cfr_renamed_4 = sprlc2;
    }
}

