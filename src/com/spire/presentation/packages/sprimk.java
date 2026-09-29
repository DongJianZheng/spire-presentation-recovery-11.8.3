/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjk;
import com.spire.presentation.packages.sprckm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfnm;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhsm;
import com.spire.presentation.packages.sprkom;
import com.spire.presentation.packages.sprnwj;
import com.spire.presentation.packages.sprqum;
import com.spire.presentation.packages.sprqz;
import com.spire.presentation.packages.sprrnm;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzik;
import com.spire.presentation.packages.sprzkm;
import java.io.OutputStream;

public class sprimk {
    private sprhsm cfr_renamed_119;
    private sprckm cfr_renamed_91;
    private sprqum cfr_renamed_0;
    private sprfnm cfr_renamed_1;
    private static final byte[] cfr_renamed_2;
    private sprrnm cfr_renamed_3;
    private sprrnm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprimk(sprhsm sprhsm2, sprfnm sprfnm2, sprqum sprqum2, sprckm sprckm2, sprrnm sprrnm2, sprrnm sprrnm3) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprimk sprimk2 = this;
        sprimk sprimk3 = this;
        sprimk sprimk4 = this;
        sprimk4.cfr_renamed_119 = arg0;
        sprimk4.cfr_renamed_1 = arg1;
        sprimk3.cfr_renamed_0 = arg2;
        sprimk3.cfr_renamed_91 = arg3;
        sprimk2.cfr_renamed_3 = arg4;
        sprimk2.cfr_renamed_4 = sprrnm3;
    }

    private /* synthetic */ sprkom cfr_renamed_2576() {
        sprycn sprycn2 = new sprycn(false, 64, 41, (sprco)new sprfvg(cfr_renamed_2));
        sprimk sprimk2 = this;
        sprimk sprimk3 = this;
        sprimk sprimk4 = this;
        return new sprkom(sprycn2, sprimk2.cfr_renamed_119, sprimk2.cfr_renamed_1, sprimk3.cfr_renamed_0, sprimk3.cfr_renamed_91, sprimk4.cfr_renamed_3, sprimk4.cfr_renamed_4);
    }

    static {
        byte[] byArray = new byte[1];
        byArray[0] = 0;
        cfr_renamed_2 = byArray;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprzik cfr_renamed_9828(sprqz arg0) throws sprbjk {
        try {
            sprkom sprkom2 = this.cfr_renamed_2576();
            OutputStream outputStream = arg0.cfr_renamed_470();
            outputStream.write(sprkom2.cfr_renamed_104("DER"));
            outputStream.close();
            return new sprzik(new sprzkm(sprkom2, arg0.cfr_renamed_79()));
        }
        catch (Exception exception) {
            throw new sprbjk(new StringBuilder().insert(0, sprnwj.cfr_renamed_9("f#r/\u007f(39|mc?|.v>`m`$t#r9f?vw3")).append(exception.getMessage()).toString(), exception);
        }
    }
}

