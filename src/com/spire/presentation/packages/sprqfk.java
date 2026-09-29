/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkoe;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.math.BigInteger;

public class sprqfk {
    private final ByteArrayOutputStream cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_9848(byte[] arg0) {
        this.cfr_renamed_9849(arg0.length);
        try {
            this.cfr_renamed_4.write(arg0);
            return;
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException.getMessage(), iOException);
        }
    }

    public sprqfk() {
        sprqfk sprqfk2 = this;
        sprqfk2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    public byte[] cfr_renamed_9850() {
        return this.cfr_renamed_9851(8);
    }

    public void cfr_renamed_9852(BigInteger arg0) {
        this.cfr_renamed_9848(arg0.toByteArray());
    }

    public void cfr_renamed_9849(int arg0) {
        sprqfk sprqfk2 = this;
        sprqfk2.cfr_renamed_4.write(arg0 >>> 24 & 0xFF);
        sprqfk2.cfr_renamed_4.write(arg0 >>> 16 & 0xFF);
        sprqfk2.cfr_renamed_4.write(arg0 >>> 8 & 0xFF);
        sprqfk2.cfr_renamed_4.write(arg0 & 0xFF);
    }

    public void cfr_renamed_9853(String arg0) {
        this.cfr_renamed_9848(sprkoe.cfr_renamed_433(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_9854(byte[] arg0) {
        try {
            this.cfr_renamed_4.write(arg0);
            return;
        }
        catch (IOException iOException) {
            throw new IllegalStateException(iOException.getMessage(), iOException);
        }
    }

    public byte[] cfr_renamed_9851(int arg0) {
        int n = this.cfr_renamed_4.size() % arg0;
        if (0 != n) {
            int n2;
            int n3 = arg0 - n;
            int n4 = n2 = 1;
            while (n4 <= n3) {
                this.cfr_renamed_4.write(n2++);
                n4 = n2;
            }
        }
        return this.cfr_renamed_4.toByteArray();
    }

    public byte[] cfr_renamed_81() {
        return this.cfr_renamed_4.toByteArray();
    }
}

