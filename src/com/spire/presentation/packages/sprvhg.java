/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprlvd;
import com.spire.presentation.packages.sprseo;
import com.spire.presentation.packages.sprvm;
import com.spire.presentation.packages.spryye;

public class sprvhg
implements sprvm {
    private final sprgf cfr_renamed_2;
    private final sprgm cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprvhg(sprgm sprgm2, sprgf sprgf2) {
        void arg0;
        sprvhg sprvhg2 = this;
        sprvhg2.cfr_renamed_3 = arg0;
        sprvhg2.cfr_renamed_2 = sprgf2;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        this.cfr_renamed_2.cfr_renamed_1221(arg0);
    }

    @Override
    public void cfr_renamed_41() {
        this.cfr_renamed_2.cfr_renamed_41();
    }

    @Override
    public boolean cfr_renamed_1328(byte[] arg0) {
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprseo.cfr_renamed_9("\u0011;27&&<<2\u001f0!&327\u0006;2<0 u<:&u;;;!;4><!06u4: u$0 <4<14&<=;"));
        }
        sprvhg sprvhg2 = this;
        byte[] byArray = new byte[sprvhg2.cfr_renamed_2.cfr_renamed_1218()];
        sprvhg2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        return sprvhg2.cfr_renamed_3.cfr_renamed_129(byArray, arg0);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        void v0;
        spryye spryye2;
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprbj2 instanceof sprbgk) {
            spryye2 = (spryye)((sprbgk)arg1).cfr_renamed_284();
            v0 = arg0;
        } else {
            spryye2 = (spryye)arg1;
            v0 = arg0;
        }
        if (v0 != false && !spryye2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprlvd.cfr_renamed_9("\u0012\u0007&\u0000(\u0000&N\u0013\u000b0\u001b(\u001c$\u001da>3\u00077\u000f5\u000ba%$\u0017o"));
        }
        if (arg0 == false && spryye2.cfr_renamed_1352()) {
            throw new IllegalArgumentException(sprseo.cfr_renamed_9("\u00037';3;63!;:<u\u00000# ;'7&r\u0005'7><1u\u00190+{"));
        }
        sprvhg sprvhg2 = this;
        sprvhg2.cfr_renamed_41();
        sprvhg2.cfr_renamed_3.cfr_renamed_5535((boolean)arg0, (sprbj)arg1);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_1197(arg0, arg1, arg2);
    }

    @Override
    public byte[] cfr_renamed_1329() {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprlvd.cfr_renamed_9("*(\t$\u001d5\u0007/\t\f\u000b2\u001d \t$=(\t/\u000b3N/\u00015N(\u0000(\u001a(\u000f-\u00072\u000b%N'\u00013N2\u0007&\u0000 \u001a4\u001c$N&\u000b/\u000b3\u000f5\u0007.\u0000o"));
        }
        sprvhg sprvhg2 = this;
        byte[] byArray = new byte[sprvhg2.cfr_renamed_2.cfr_renamed_1218()];
        sprvhg2.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
        return sprvhg2.cfr_renamed_3.cfr_renamed_125(byArray);
    }
}

