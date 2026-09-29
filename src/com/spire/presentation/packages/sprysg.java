/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbyg;
import com.spire.presentation.packages.sprldz;
import com.spire.presentation.packages.sprnsc;
import com.spire.presentation.packages.sprpik;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtqg;
import java.security.SecureRandom;

public abstract class sprysg {
    public sprsm cfr_renamed_91;
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public SecureRandom cfr_renamed_2;
    public sprpik cfr_renamed_3;
    public char[] cfr_renamed_4;

    public abstract byte[] cfr_renamed_7750(byte[] var1, byte[] var2, int var3, int var4) throws sprtqg;

    public byte[] cfr_renamed_7752(byte[] arg0, byte[] arg1, byte[] arg2, int arg3, int arg4) throws sprtqg {
        throw new sprtqg(sprldz.cfr_renamed_9("*=,!6#;: =o<)s96= &<!s|s$66 o= 'o :#?<='*7a"));
    }

    public byte[] cfr_renamed_1521() throws sprtqg {
        sprysg sprysg2 = this;
        sprysg sprysg3 = this;
        return sprbyg.cfr_renamed_7889(sprysg2.cfr_renamed_91, sprysg2.cfr_renamed_1, sprysg3.cfr_renamed_3, sprysg3.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprysg(int n, sprsm sprsm2, int n2, SecureRandom secureRandom, char[] cArray) {
        void arg2;
        void arg1;
        void arg3;
        void arg4;
        void arg0;
        sprysg sprysg2 = this;
        sprysg sprysg3 = this;
        sprysg3.cfr_renamed_1 = arg0;
        sprysg3.cfr_renamed_4 = arg4;
        sprysg2.cfr_renamed_2 = arg3;
        sprysg2.cfr_renamed_91 = arg1;
        if (n2 < 0 || arg2 > 255) {
            throw new IllegalArgumentException(sprnsc.cfr_renamed_9("\u0016n\u000e\u001f\n)\u000b(E*\u00040\u00109E3\u0010(\u00165\u00019E3\u0003|\u0017=\u000b;\u0000|U|\u00113EnPiK"));
        }
        this.cfr_renamed_0 = arg2;
    }

    public sprysg(int arg0, sprsm arg1, SecureRandom arg2, char[] arg3) {
        this(arg0, arg1, 96, arg2, arg3);
    }

    public byte[] cfr_renamed_7753(byte[] arg0, int arg1, int arg2) throws sprtqg {
        if (this.cfr_renamed_3 == null) {
            byte[] byArray = new byte[8];
            this.cfr_renamed_2.nextBytes(byArray);
            sprysg sprysg2 = this;
            this.cfr_renamed_3 = new sprpik(this.cfr_renamed_91.cfr_renamed_593(), byArray, this.cfr_renamed_0);
        }
        sprysg sprysg3 = this;
        return sprysg3.cfr_renamed_7750(sprysg3.cfr_renamed_1521(), arg0, arg1, arg2);
    }

    public abstract byte[] cfr_renamed_7751();

    public int cfr_renamed_593() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_579() {
        if (this.cfr_renamed_91 != null) {
            return this.cfr_renamed_91.cfr_renamed_593();
        }
        return -1;
    }

    public sprpik cfr_renamed_7738() {
        return this.cfr_renamed_3;
    }
}

