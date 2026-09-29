/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracd;
import com.spire.presentation.packages.sprghe;
import com.spire.presentation.packages.sprgpx;
import com.spire.presentation.packages.sprgue;
import com.spire.presentation.packages.sprgwe;
import com.spire.presentation.packages.spriad;
import com.spire.presentation.packages.sprkfe;
import com.spire.presentation.packages.sprobe;
import com.spire.presentation.packages.sprrc;
import com.spire.presentation.packages.sprtee;
import com.spire.presentation.packages.sprtpe;
import com.spire.presentation.packages.sprvae;
import java.io.OutputStream;

public class sprjtc {
    private sprobe cfr_renamed_119;
    private sprkfe cfr_renamed_91;
    private sprkfe cfr_renamed_0;
    private sprtee cfr_renamed_1;
    private sprghe cfr_renamed_2;
    private sprvae cfr_renamed_3;
    private static final byte[] cfr_renamed_4;

    static {
        byte[] byArray = new byte[1];
        byArray[0] = 0;
        cfr_renamed_4 = byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprjtc(sprtee sprtee2, sprvae sprvae2, sprobe sprobe2, sprghe sprghe2, sprkfe sprkfe2, sprkfe sprkfe3) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprjtc sprjtc2 = this;
        sprjtc sprjtc3 = this;
        sprjtc sprjtc4 = this;
        sprjtc4.cfr_renamed_1 = arg0;
        sprjtc4.cfr_renamed_3 = arg1;
        sprjtc3.cfr_renamed_119 = arg2;
        sprjtc3.cfr_renamed_2 = arg3;
        sprjtc2.cfr_renamed_91 = arg4;
        sprjtc2.cfr_renamed_0 = sprkfe3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spracd cfr_renamed_2575(sprrc arg0) throws spriad {
        try {
            sprtpe sprtpe2 = this.cfr_renamed_2576();
            OutputStream outputStream = arg0.cfr_renamed_470();
            outputStream.write(sprtpe2.cfr_renamed_104("DER"));
            outputStream.close();
            return new spracd(new sprgue(sprtpe2, arg0.cfr_renamed_79()));
        }
        catch (Exception exception) {
            throw new spriad(new StringBuilder().insert(0, sprgpx.cfr_renamed_9("\u0013\u0015\u0007\u0019\n\u001eF\u000f\t[\u0016\t\t\u0018\u0003\b\u0015[\u0015\u0012\u0001\u0015\u0007\u000f\u0013\t\u0003AF")).append(exception.getMessage()).toString(), exception);
        }
    }

    private /* synthetic */ sprtpe cfr_renamed_2576() {
        sprgwe sprgwe2 = new sprgwe(41, cfr_renamed_4);
        sprjtc sprjtc2 = this;
        sprjtc sprjtc3 = this;
        sprjtc sprjtc4 = this;
        return new sprtpe(sprgwe2, sprjtc2.cfr_renamed_1, sprjtc2.cfr_renamed_3, sprjtc3.cfr_renamed_119, sprjtc3.cfr_renamed_2, sprjtc4.cfr_renamed_91, sprjtc4.cfr_renamed_0);
    }
}

