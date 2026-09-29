/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreyl;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.SecureRandom;

public class sprmlk
extends SecureRandom {
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    public sprmlk(boolean arg0, byte[] arg1) {
        byte[][] byArrayArray = new byte[1][];
        byArrayArray[0] = arg1;
        this(arg0, byArrayArray);
    }

    public sprmlk(byte[][] arg0) {
        this(false, arg0);
    }

    @Override
    public void nextBytes(byte[] arg0) {
        sprmlk sprmlk2 = this;
        System.arraycopy(sprmlk2.cfr_renamed_3, sprmlk2.cfr_renamed_2, arg0, 0, arg0.length);
        this.cfr_renamed_2 += arg0.length;
    }

    public sprmlk(byte[] arg0) {
        byte[][] byArrayArray = new byte[1][];
        byArrayArray[0] = arg0;
        this(false, byArrayArray);
    }

    public boolean cfr_renamed_3302() {
        sprmlk sprmlk2 = this;
        return sprmlk2.cfr_renamed_2 == sprmlk2.cfr_renamed_3.length;
    }

    @Override
    public long nextLong() {
        long l = 0L;
        l = 0L | (long)this.cfr_renamed_3303() << 56;
        l |= (long)this.cfr_renamed_3303() << 48;
        l |= (long)this.cfr_renamed_3303() << 40;
        l |= (long)this.cfr_renamed_3303() << 32;
        l |= (long)this.cfr_renamed_3303() << 24;
        l |= (long)this.cfr_renamed_3303() << 16;
        l |= (long)this.cfr_renamed_3303() << 8;
        return l |= (long)this.cfr_renamed_3303();
    }

    @Override
    public byte[] generateSeed(int arg0) {
        byte[] byArray = new byte[arg0];
        this.nextBytes(byArray);
        return byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmlk(boolean arg0, byte[][] arg1) {
        int n;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int n2 = n = 0;
        while (n2 != arg1.length) {
            try {
                byteArrayOutputStream.write(arg1[n]);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(spreyl.cfr_renamed_9("{\\v\u001al\u001dk\\nX8KyQmX8\\jOyD6"));
            }
            n2 = ++n;
        }
        this.cfr_renamed_3 = byteArrayOutputStream.toByteArray();
        if (arg0) {
            this.cfr_renamed_4 = this.cfr_renamed_3.length % 4;
        }
    }

    @Override
    public int nextInt() {
        sprmlk sprmlk2;
        int n = 0;
        n = 0 | this.cfr_renamed_3303() << 24;
        n |= this.cfr_renamed_3303() << 16;
        if (this.cfr_renamed_4 == 2) {
            sprmlk sprmlk3 = this;
            sprmlk2 = sprmlk3;
            --sprmlk3.cfr_renamed_4;
        } else {
            n |= this.cfr_renamed_3303() << 8;
            sprmlk2 = this;
        }
        if (sprmlk2.cfr_renamed_4 == 1) {
            --this.cfr_renamed_4;
            return n;
        }
        return n |= this.cfr_renamed_3303();
    }

    private /* synthetic */ int cfr_renamed_3303() {
        return this.cfr_renamed_3[this.cfr_renamed_2++] & 0xFF;
    }
}

