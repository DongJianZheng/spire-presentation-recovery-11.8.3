/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprar;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprghm;
import com.spire.presentation.packages.sprjah;
import com.spire.presentation.packages.sprklk;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmam;
import com.spire.presentation.packages.sprmzn;
import com.spire.presentation.packages.sprrfi;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.math.BigInteger;

public abstract class sprtem
extends sprklk
implements sprar {
    public BigInteger cfr_renamed_3;
    public sprlem cfr_renamed_4;

    public static byte[] cfr_renamed_11085(sprmam arg0) throws IOException {
        int n = arg0.read();
        if (n < 0) {
            throw new IOException(sprmzn.cfr_renamed_9("\u0018b\bt\u001di\u000ex\bhMi\u0003h@c\u000b!\u001ex\u001fi\fa"));
        }
        if (n == 0 || n == 255) {
            throw new IOException(sprrfi.cfr_renamed_9("t`f``p2pjaw{a|}{a5|zf5kpf5{xbywxw{fpv"));
        }
        if (n > 127) {
            throw new IOException(sprmzn.cfr_renamed_9("y\u0003\u007f\u0018|\u001dc\u001fx\bhMC$H"));
        }
        byte[] byArray = new byte[n + 2];
        arg0.cfr_renamed_11040(byArray, 2, byArray.length - 2);
        byte[] byArray2 = byArray;
        byArray2[0] = 6;
        byArray[1] = (byte)n;
        return byArray2;
    }

    public BigInteger cfr_renamed_7976() {
        return this.cfr_renamed_3;
    }

    @Override
    public String cfr_renamed_7832() {
        return sprrfi.cfr_renamed_9("BRB");
    }

    /*
     * WARNING - void declaration
     */
    public sprtem(sprlem sprlem2, spreuh spreuh2) {
        void arg1;
        sprtem sprtem2 = this;
        this.cfr_renamed_3 = new BigInteger(1, arg1.cfr_renamed_1972(false));
        this.cfr_renamed_4 = sprlem2;
    }

    /*
     * WARNING - void declaration
     */
    public sprtem(sprmam sprmam2) throws IOException {
        void arg0;
        this.cfr_renamed_4 = sprlem.cfr_renamed_23(sprxgf.cfr_renamed_184(sprtem.cfr_renamed_11085(sprmam2)));
        sprtem sprtem2 = this;
        this.cfr_renamed_3 = new sprghm((sprmam)arg0).cfr_renamed_97();
    }

    /*
     * WARNING - void declaration
     */
    public sprtem(sprlem sprlem2, BigInteger bigInteger) {
        void arg1;
        sprtem sprtem2 = this;
        sprtem2.cfr_renamed_3 = arg1;
        sprtem2.cfr_renamed_4 = sprlem2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_91() {
        try {
            return super.cfr_renamed_91();
        }
        catch (IOException iOException) {
            return null;
        }
    }

    @Override
    public void cfr_renamed_11038(sprjah arg0) throws IOException {
        byte[] byArray = this.cfr_renamed_4.cfr_renamed_91();
        arg0.write(byArray, 1, byArray.length - 1);
        sprghm sprghm2 = new sprghm(this.cfr_renamed_3);
        arg0.cfr_renamed_7759(sprghm2);
    }

    public sprlem cfr_renamed_7813() {
        return this.cfr_renamed_4;
    }
}

