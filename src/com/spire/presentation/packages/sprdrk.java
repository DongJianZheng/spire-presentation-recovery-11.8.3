/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprael;
import com.spire.presentation.packages.sprawba;
import com.spire.presentation.packages.sprcal;
import com.spire.presentation.packages.sprgqk;
import com.spire.presentation.packages.spriw;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqcs;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;

public class sprdrk {
    private final short cfr_renamed_0;
    private long cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final byte[] cfr_renamed_3;
    private spriw cfr_renamed_4;

    private /* synthetic */ byte[] cfr_renamed_10163() {
        int n;
        sprdrk sprdrk2 = this;
        byte[] byArray = sprpxe.cfr_renamed_451(sprdrk2.cfr_renamed_1);
        int n2 = sprdrk2.cfr_renamed_3.length;
        byte[] byArray2 = sproze.cfr_renamed_158(this.cfr_renamed_3);
        int n3 = n = 0;
        while (n3 < 8) {
            int n4 = n2 - 8 + n;
            byte by = (byte)(byArray2[n4] ^ byArray[n]);
            byArray2[n4] = by;
            n3 = ++n;
        }
        return byArray2;
    }

    public byte[] cfr_renamed_10126(byte[] arg0, byte[] arg1) throws sprull {
        int n;
        sprkpk sprkpk2;
        switch (this.cfr_renamed_0) {
            case 1: 
            case 2: 
            case 3: {
                sprkpk2 = new sprkpk(new sprtpk(this.cfr_renamed_2), this.cfr_renamed_10163());
                break;
            }
            default: {
                throw new IllegalStateException(sprawba.cfr_renamed_9("$\t\u0011\u001e\u0013\u0005A\u001e\u000f\u001d\u0018Q\f\u001e\u0005\u0014MQ\u0002\u0010\u000f\u001f\u000e\u0005A\u0013\u0004Q\u0014\u0002\u0004\u0015A\u0005\u000eQ\u0012\u0014\u0000\u001dN\u001e\u0011\u0014\u000f"));
            }
        }
        this.cfr_renamed_4.cfr_renamed_5535(false, sprkpk2);
        this.cfr_renamed_4.cfr_renamed_2417(arg0, 0, arg0.length);
        byte[] byArray = new byte[this.cfr_renamed_4.cfr_renamed_1202(arg1.length)];
        int n2 = n = this.cfr_renamed_4.cfr_renamed_505(arg1, 0, arg1.length, byArray, 0);
        n = n2 + this.cfr_renamed_4.cfr_renamed_1219(byArray, n2);
        ++this.cfr_renamed_1;
        return byArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprdrk(short s, byte[] byArray, byte[] byArray2) {
        void arg0;
        void arg2;
        void arg1;
        sprdrk sprdrk2 = this;
        sprdrk sprdrk3 = this;
        this.cfr_renamed_1 = 0L;
        sprdrk3.cfr_renamed_2 = arg1;
        sprdrk3.cfr_renamed_3 = arg2;
        sprdrk2.cfr_renamed_0 = arg0;
        sprdrk2.cfr_renamed_1 = 0L;
        switch (s) {
            case 1: 
            case 2: {
                this.cfr_renamed_4 = new sprgqk(new sprael());
                return;
            }
            case 3: {
                this.cfr_renamed_4 = new sprcal();
                return;
            }
        }
    }

    public byte[] cfr_renamed_10125(byte[] arg0, byte[] arg1) throws sprull {
        sprkpk sprkpk2;
        switch (this.cfr_renamed_0) {
            case 1: 
            case 2: 
            case 3: {
                sprkpk2 = new sprkpk(new sprtpk(this.cfr_renamed_2), this.cfr_renamed_10163());
                break;
            }
            default: {
                throw new IllegalStateException(sprqcs.cfr_renamed_9("o3Z$X?\n$D'SkG$N.\u0006kI*D%E?\n)Ok_8O/\n?EkY.K'\u0005$Z.D"));
            }
        }
        this.cfr_renamed_4.cfr_renamed_5535(true, sprkpk2);
        this.cfr_renamed_4.cfr_renamed_2417(arg0, 0, arg0.length);
        byte[] byArray = new byte[this.cfr_renamed_4.cfr_renamed_1202(arg1.length)];
        int n = this.cfr_renamed_4.cfr_renamed_505(arg1, 0, arg1.length, byArray, 0);
        this.cfr_renamed_4.cfr_renamed_1219(byArray, n);
        ++this.cfr_renamed_1;
        return byArray;
    }
}

