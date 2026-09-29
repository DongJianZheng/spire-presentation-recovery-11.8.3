/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgvk;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.spryeo;

public class sprjvk
extends sprgvk {
    private static final byte[] cfr_renamed_0;
    private static final byte[] cfr_renamed_1;
    private static final byte[] cfr_renamed_2;
    private static final byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_10274(byte arg0, byte arg1, byte arg2, byte arg3) {
        return (arg0 & 0xFF) << 23 | (arg1 & 0xFF) << 16 | (arg2 & 0xFF) << 8 | arg3 & 0xFF;
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprjvk(this);
    }

    public sprjvk() {
        this.cfr_renamed_4 = cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_10275() {
        return 625;
    }

    static {
        byte[] byArray = new byte[16];
        byArray[0] = 34;
        byArray[1] = 47;
        byArray[2] = 36;
        byArray[3] = 42;
        byArray[4] = 109;
        byArray[5] = 64;
        byArray[6] = 64;
        byArray[7] = 64;
        byArray[8] = 64;
        byArray[9] = 64;
        byArray[10] = 64;
        byArray[11] = 64;
        byArray[12] = 64;
        byArray[13] = 82;
        byArray[14] = 16;
        byArray[15] = 48;
        cfr_renamed_3 = byArray;
        byte[] byArray2 = new byte[16];
        byArray2[0] = 34;
        byArray2[1] = 47;
        byArray2[2] = 37;
        byArray2[3] = 42;
        byArray2[4] = 109;
        byArray2[5] = 64;
        byArray2[6] = 64;
        byArray2[7] = 64;
        byArray2[8] = 64;
        byArray2[9] = 64;
        byArray2[10] = 64;
        byArray2[11] = 64;
        byArray2[12] = 64;
        byArray2[13] = 82;
        byArray2[14] = 16;
        byArray2[15] = 48;
        cfr_renamed_2 = byArray2;
        byte[] byArray3 = new byte[16];
        byArray3[0] = 35;
        byArray3[1] = 47;
        byArray3[2] = 36;
        byArray3[3] = 42;
        byArray3[4] = 109;
        byArray3[5] = 64;
        byArray3[6] = 64;
        byArray3[7] = 64;
        byArray3[8] = 64;
        byArray3[9] = 64;
        byArray3[10] = 64;
        byArray3[11] = 64;
        byArray3[12] = 64;
        byArray3[13] = 82;
        byArray3[14] = 16;
        byArray3[15] = 48;
        cfr_renamed_0 = byArray3;
        byte[] byArray4 = new byte[16];
        byArray4[0] = 35;
        byArray4[1] = 47;
        byArray4[2] = 37;
        byArray4[3] = 42;
        byArray4[4] = 109;
        byArray4[5] = 64;
        byArray4[6] = 64;
        byArray4[7] = 64;
        byArray4[8] = 64;
        byArray4[9] = 64;
        byArray4[10] = 64;
        byArray4[11] = 64;
        byArray4[12] = 64;
        byArray4[13] = 82;
        byArray4[14] = 16;
        byArray4[15] = 48;
        cfr_renamed_1 = byArray4;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        super.cfr_renamed_5183(arg0);
        this.cfr_renamed_4 = ((sprjvk)arg0).cfr_renamed_4;
    }

    @Override
    public String cfr_renamed_1315() {
        return spryeo.cfr_renamed_9("|\u0001EY\u0014A\u0010");
    }

    @Override
    public void cfr_renamed_10276(int[] arg0, byte[] arg1, byte[] arg2) {
        if (arg1 == null || arg1.length != 32) {
            throw new IllegalArgumentException(sprrica.cfr_renamed_9("c}I8[}M;\u0002n\u0010}@$V8Q}K.\u00023G8F8F"));
        }
        if (arg2 == null || arg2.length != 25) {
            throw new IllegalArgumentException(spryeo.cfr_renamed_9("g\u001a\u0006=pTI\u0012\u0006F\u0013TD\rR\u0011UTO\u0007\u0006\u001aC\u0011B\u0011B"));
        }
        arg0[0] = sprjvk.cfr_renamed_10274(arg1[0], this.cfr_renamed_4[0], arg1[21], arg1[16]);
        arg0[1] = sprjvk.cfr_renamed_10274(arg1[1], this.cfr_renamed_4[1], arg1[22], arg1[17]);
        arg0[2] = sprjvk.cfr_renamed_10274(arg1[2], this.cfr_renamed_4[2], arg1[23], arg1[18]);
        arg0[3] = sprjvk.cfr_renamed_10274(arg1[3], this.cfr_renamed_4[3], arg1[24], arg1[19]);
        arg0[4] = sprjvk.cfr_renamed_10274(arg1[4], this.cfr_renamed_4[4], arg1[25], arg1[20]);
        arg0[5] = sprjvk.cfr_renamed_10274(arg2[0], (byte)(this.cfr_renamed_4[5] | arg2[17] & 0x3F), arg1[5], arg1[26]);
        arg0[6] = sprjvk.cfr_renamed_10274(arg2[1], (byte)(this.cfr_renamed_4[6] | arg2[18] & 0x3F), arg1[6], arg1[27]);
        arg0[7] = sprjvk.cfr_renamed_10274(arg2[10], (byte)(this.cfr_renamed_4[7] | arg2[19] & 0x3F), arg1[7], arg2[2]);
        arg0[8] = sprjvk.cfr_renamed_10274(arg1[8], (byte)(this.cfr_renamed_4[8] | arg2[20] & 0x3F), arg2[3], arg2[11]);
        arg0[9] = sprjvk.cfr_renamed_10274(arg1[9], (byte)(this.cfr_renamed_4[9] | arg2[21] & 0x3F), arg2[12], arg2[4]);
        arg0[10] = sprjvk.cfr_renamed_10274(arg2[5], (byte)(this.cfr_renamed_4[10] | arg2[22] & 0x3F), arg1[10], arg1[28]);
        arg0[11] = sprjvk.cfr_renamed_10274(arg1[11], (byte)(this.cfr_renamed_4[11] | arg2[23] & 0x3F), arg2[6], arg2[13]);
        arg0[12] = sprjvk.cfr_renamed_10274(arg1[12], (byte)(this.cfr_renamed_4[12] | arg2[24] & 0x3F), arg2[7], arg2[14]);
        arg0[13] = sprjvk.cfr_renamed_10274(arg1[13], this.cfr_renamed_4[13], arg2[15], arg2[8]);
        arg0[14] = sprjvk.cfr_renamed_10274(arg1[14], (byte)(this.cfr_renamed_4[14] | arg1[31] >>> 4 & 0xF), arg2[16], arg2[9]);
        arg0[15] = sprjvk.cfr_renamed_10274(arg1[15], (byte)(this.cfr_renamed_4[15] | arg1[31] & 0xF), arg1[30], arg1[29]);
    }

    public sprjvk(sprjvk arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public sprjvk(int n) {
        void arg0;
        switch (n) {
            case 32: {
                this.cfr_renamed_4 = cfr_renamed_2;
                return;
            }
            case 64: {
                this.cfr_renamed_4 = cfr_renamed_0;
                return;
            }
            case 128: {
                this.cfr_renamed_4 = cfr_renamed_1;
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprrica.cfr_renamed_9("\bL.W-R2P)G9\u00021G3E)Jg\u0002")).append((int)arg0).toString());
    }
}

