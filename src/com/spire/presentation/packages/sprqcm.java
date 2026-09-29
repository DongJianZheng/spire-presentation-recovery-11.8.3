/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqbm;
import com.spire.presentation.packages.spryez;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class sprqcm
extends sprqbm {
    private static final byte[] cfr_renamed_119 = new byte[12];
    private byte[] cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    public static final int cfr_renamed_4 = 1;

    public byte[] cfr_renamed_11094() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_11095() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprqcm(boolean bl, byte[] byArray) {
        void arg0;
        void arg1;
        sprqcm sprqcm2 = this;
        void v1 = arg1;
        super(1, (boolean)arg0, (byte[])arg1);
        this.cfr_renamed_2 = (arg1[1] & 0xFF) << 8 | arg1[0] & 0xFF;
        this.cfr_renamed_1 = v1[2] & 0xFF;
        sprqcm2.cfr_renamed_0 = v1[3] & 0xFF;
        sprqcm2.cfr_renamed_91 = new byte[byArray.length - this.cfr_renamed_2];
        sprqcm sprqcm3 = this;
        System.arraycopy(arg1, sprqcm3.cfr_renamed_2, sprqcm3.cfr_renamed_91, 0, this.cfr_renamed_91.length);
    }

    public sprqcm(int arg0, byte[] arg1) {
        this(sprqcm.cfr_renamed_11096(arg0, arg1));
    }

    public int cfr_renamed_4572() {
        return this.cfr_renamed_0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ byte[] cfr_renamed_11096(int arg0, byte[] arg1) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ByteArrayOutputStream byteArrayOutputStream2 = byteArrayOutputStream;
            ByteArrayOutputStream byteArrayOutputStream3 = byteArrayOutputStream;
            byteArrayOutputStream3.write(16);
            byteArrayOutputStream3.write(0);
            byteArrayOutputStream2.write(1);
            byteArrayOutputStream2.write(arg0);
            byteArrayOutputStream2.write(cfr_renamed_119);
            byteArrayOutputStream.write(arg1);
            return byteArrayOutputStream.toByteArray();
        }
        catch (IOException iOException) {
            throw new RuntimeException(spryez.cfr_renamed_9("aSu_xX4I{\u001dqSwRpX4I{\u001dvD`X4\\fOuD5"));
        }
    }

    public sprqcm(byte[] arg0) {
        this(false, arg0);
    }
}

