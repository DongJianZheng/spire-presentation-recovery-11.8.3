/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlzz;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrkf;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprwyl
extends sprqqe
implements sprbr {
    private sprxgf cfr_renamed_1261;
    private sprlem cfr_renamed_1197;

    public sprwyl(int arg0, int arg1) {
        this(arg0, arg1, 0, 0);
    }

    public sprlem cfr_renamed_4028() {
        return this.cfr_renamed_1197;
    }

    /*
     * WARNING - void declaration
     */
    public sprwyl(BigInteger bigInteger) {
        void arg0;
        this.cfr_renamed_1197 = cfr_renamed_953;
        sprwyl sprwyl2 = this;
        sprwyl2.cfr_renamed_1261 = new sprktm((BigInteger)arg0);
    }

    public static sprwyl cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwyl) {
            return (sprwyl)arg0;
        }
        if (arg0 != null) {
            return new sprwyl(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprxgf cfr_renamed_284() {
        return this.cfr_renamed_1261;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1197);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_1261);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprwyl(sprszm sprszm2) {
        void arg0;
        sprwyl sprwyl2 = this;
        sprwyl2.cfr_renamed_1197 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprwyl2.cfr_renamed_1261 = sprszm2.cfr_renamed_85(1).cfr_renamed_119();
    }

    public sprwyl(int arg0, int arg1, int arg2, int arg3) {
        sprwyl sprwyl2;
        this.cfr_renamed_1197 = cfr_renamed_1442;
        sprrvm sprrvm2 = new sprrvm(3);
        sprrvm2.cfr_renamed_5004(new sprktm(arg0));
        if (arg2 == 0) {
            if (arg3 != 0) {
                throw new IllegalArgumentException(sprlzz.cfr_renamed_9("mNgOjSmSpEjT$K$VeLqEw"));
            }
            sprrvm sprrvm3 = sprrvm2;
            sprrvm3.cfr_renamed_5004(cfr_renamed_728);
            sprrvm3.cfr_renamed_5004(new sprktm(arg1));
            sprwyl2 = this;
        } else {
            if (arg2 <= arg1 || arg3 <= arg2) {
                throw new IllegalArgumentException(sprrkf.cfr_renamed_9("Z\u0002P\u0003]\u001fZ\u001fG\t]\u0018\u0013\u0007\u0013\u001aR\u0000F\t@"));
            }
            sprrvm sprrvm4 = sprrvm2;
            sprrvm4.cfr_renamed_5004(cfr_renamed_114);
            sprrvm sprrvm5 = new sprrvm(3);
            sprrvm5.cfr_renamed_5004(new sprktm(arg1));
            sprrvm5.cfr_renamed_5004(new sprktm(arg2));
            sprrvm5.cfr_renamed_5004(new sprktm(arg3));
            sprrvm4.cfr_renamed_5004(new sprcen(sprrvm5));
            sprwyl2 = this;
        }
        sprwyl2.cfr_renamed_1261 = new sprcen(sprrvm2);
    }
}

