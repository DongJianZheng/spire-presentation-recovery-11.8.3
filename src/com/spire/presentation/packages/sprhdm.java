/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprljg;
import com.spire.presentation.packages.sprmwy;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprhdm
extends sprqqe {
    private sprktm cfr_renamed_3;
    private sprgbf cfr_renamed_4;

    public static sprhdm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhdm) {
            return (sprhdm)arg0;
        }
        if (arg0 != null) {
            return new sprhdm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprhdm(sprdye sprdye2, sprktm sprktm2) {
        void arg0;
        void arg1;
        if (sprdye2 == null) {
            throw new IllegalArgumentException(sprljg.cfr_renamed_9("?O}Y|\u001b8_yRvSl\u001czY8RmPt"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprmwy.cfr_renamed_9("@W\u0000B\td\bR\tS\u0002U@\u0007\u0004F\tI\bSGE\u0002\u0007\tR\u000bK"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    /*
     * WARNING - void declaration
     */
    public sprhdm(byte[] byArray, int n) {
        void arg1;
        void arg0;
        if (byArray == null) {
            throw new IllegalArgumentException(sprljg.cfr_renamed_9("?O}Y|\u001b8_yRvSl\u001czY8RmPt"));
        }
        sprhdm sprhdm2 = this;
        sprhdm2.cfr_renamed_4 = new sprdye((byte[])arg0);
        sprhdm sprhdm3 = this;
        sprhdm2.cfr_renamed_3 = new sprktm((long)arg1);
    }

    public static sprhdm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprhdm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_2618() {
        return this.cfr_renamed_3.cfr_renamed_162();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhdm(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmwy.cfr_renamed_9("e\u0006CGT\u0002V\u0012B\tD\u0002\u0007\u0014N\u001dB]\u0007")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprgbf.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public byte[] cfr_renamed_2113() {
        return this.cfr_renamed_4.cfr_renamed_81();
    }
}

