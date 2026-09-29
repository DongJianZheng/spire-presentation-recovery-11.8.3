/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.spropo;
import com.spire.presentation.packages.sprshl;
import com.spire.presentation.packages.sprsm;
import com.spire.presentation.packages.sprtqg;
import java.io.IOException;
import java.io.OutputStream;

public class sprpbh {
    private static final byte[] cfr_renamed_2 = sprfqe.cfr_renamed_488(sprshl.cfr_renamed_9("zGx3x0x3yOx2x0yCyE|F{ExCx3xBxCyD|F|F|F|F"));
    private final int cfr_renamed_3;
    private final sprsm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_7996(byte[] arg0, byte[] arg1) throws sprtqg {
        try {
            return sprpbh.cfr_renamed_7997(this.cfr_renamed_4, arg0, sprpbh.cfr_renamed_7880(this.cfr_renamed_3), arg1);
        }
        catch (IOException iOException) {
            throw new sprtqg(new StringBuilder().insert(0, spropo.cfr_renamed_9("R<t!g0~+ydg!e\"x6z-y#7\u000fS\u0002-d")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public byte[] cfr_renamed_7998(spreuh arg0, byte[] arg1) throws sprtqg {
        return this.cfr_renamed_7996(arg0.cfr_renamed_1969().cfr_renamed_91(), arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprpbh(sprsm sprsm2, int n) {
        void arg0;
        sprpbh sprpbh2 = this;
        sprpbh2.cfr_renamed_4 = arg0;
        sprpbh2.cfr_renamed_3 = n;
    }

    private static /* synthetic */ byte[] cfr_renamed_7997(sprsm arg0, byte[] arg1, int arg2, byte[] arg3) throws IOException {
        OutputStream outputStream;
        sprsm sprsm2 = arg0;
        OutputStream outputStream2 = outputStream = sprsm2.cfr_renamed_470();
        OutputStream outputStream3 = outputStream;
        OutputStream outputStream4 = outputStream;
        outputStream4.write(0);
        outputStream4.write(0);
        outputStream3.write(0);
        outputStream3.write(1);
        outputStream2.write(arg1);
        outputStream2.write(arg3);
        byte[] byArray = sprsm2.cfr_renamed_580();
        byte[] byArray2 = new byte[arg2];
        System.arraycopy(byArray, 0, byArray2, 0, byArray2.length);
        return byArray2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_7880(int arg0) throws sprtqg {
        switch (arg0) {
            case 7: {
                return 16;
            }
            case 8: {
                return 24;
            }
            case 9: {
                return 32;
            }
        }
        throw new sprtqg(new StringBuilder().insert(0, sprshl.cfr_renamed_9(";\u0018%\u0018!\u0001 V=\u000f#\u001b+\u0002<\u001f-V/\u001a)\u0019<\u001f:\u001e#V\u00072tV")).append(arg0).toString());
    }
}

