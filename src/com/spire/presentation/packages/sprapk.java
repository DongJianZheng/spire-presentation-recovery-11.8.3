/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprniia;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzkk;
import java.io.IOException;
import java.security.SecureRandom;

public class sprapk
extends SecureRandom {
    private static byte[] cfr_renamed_0 = new byte[0];
    private sprzkk cfr_renamed_1;
    private int cfr_renamed_2;
    private final SecureRandom cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public byte[] cfr_renamed_9880() {
        return this.cfr_renamed_1.toByteArray();
    }

    public sprapk() {
        this(sprybl.cfr_renamed_2794());
    }

    public byte[] cfr_renamed_9881() {
        sprapk sprapk2 = this;
        if (sprapk2.cfr_renamed_2 == sprapk2.cfr_renamed_4.length) {
            return this.cfr_renamed_1.toByteArray();
        }
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    /*
     * Unable to fully structure code
     */
    @Override
    public final void nextBytes(byte[] arg0) {
        block4: {
            v0 = this;
            if (v0.cfr_renamed_2 < v0.cfr_renamed_4.length) break block4;
            v1 = this;
            v2 = v1;
            v1.cfr_renamed_3.nextBytes(arg0);
            ** GOTO lbl23
        }
        v3 = var2_2 = 0;
        while (v3 != arg0.length) {
            v4 = this;
            if (v4.cfr_renamed_2 >= v4.cfr_renamed_4.length) break;
            arg0[var2_2++] = this.cfr_renamed_4[this.cfr_renamed_2++];
            v3 = var2_2;
        }
        if (var2_2 != arg0.length) {
            var3_4 = new byte[arg0.length - var2_2];
            this.cfr_renamed_3.nextBytes(var3_4);
            System.arraycopy(var3_4, 0, arg0, var2_2, var3_4.length);
        }
        try {
            v2 = this;
lbl23:
            // 2 sources

            v2.cfr_renamed_1.write(arg0);
            return;
        }
        catch (IOException var2_3) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprniia.cfr_renamed_9("Q\bE\u0004H\u0003\u0004\u0012KFV\u0003G\tV\u0002\u0004\u0012V\u0007J\u0015G\u0014M\u0016P\\\u0004")).append(var2_3.getMessage()).toString());
        }
    }

    public sprapk(SecureRandom secureRandom) {
        sprapk sprapk2 = this;
        sprapk sprapk3 = this;
        sprapk3.cfr_renamed_1 = new sprzkk(null);
        sprapk2.cfr_renamed_2 = 0;
        sprapk2.cfr_renamed_3 = secureRandom;
        sprapk2.cfr_renamed_4 = cfr_renamed_0;
    }

    public void cfr_renamed_722() {
        sprapk sprapk2 = this;
        sproze.cfr_renamed_492(sprapk2.cfr_renamed_4, (byte)0);
        sprapk2.cfr_renamed_1.cfr_renamed_722();
    }

    /*
     * WARNING - void declaration
     */
    public sprapk(byte[] byArray, SecureRandom secureRandom) {
        void arg1;
        sprapk sprapk2 = this;
        sprapk sprapk3 = this;
        this.cfr_renamed_1 = new sprzkk(null);
        this.cfr_renamed_2 = 0;
        sprapk2.cfr_renamed_3 = arg1;
        sprapk2.cfr_renamed_4 = sproze.cfr_renamed_158(byArray);
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_2 = 0;
        if (this.cfr_renamed_2 == this.cfr_renamed_4.length) {
            this.cfr_renamed_4 = this.cfr_renamed_1.toByteArray();
        }
        this.cfr_renamed_1.reset();
    }
}

