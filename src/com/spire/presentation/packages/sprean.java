/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprkgn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprkxm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;
import java.util.Date;

public class sprean
extends sprqqe {
    private final String cfr_renamed_91;
    private final BigInteger cfr_renamed_0;
    private final sproug cfr_renamed_1;
    private final String cfr_renamed_2;
    private final sprjfn cfr_renamed_3;
    private final sprjfn cfr_renamed_4;

    public static sprean cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprean) {
            return (sprean)arg0;
        }
        if (arg0 != null) {
            return new sprean(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprean(sprszm sprszm2) {
        void arg0;
        sprean sprean2 = this;
        void v1 = arg0;
        sprean sprean3 = this;
        void v3 = arg0;
        this.cfr_renamed_0 = sprktm.cfr_renamed_23(v3.cfr_renamed_85(0)).cfr_renamed_97();
        sprean3.cfr_renamed_91 = sprkgn.cfr_renamed_23(v3.cfr_renamed_85(1)).cfr_renamed_314();
        sprean3.cfr_renamed_3 = sprjfn.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_4 = sprjfn.cfr_renamed_23(v1.cfr_renamed_85(3));
        sprean2.cfr_renamed_1 = sproug.cfr_renamed_23(v1.cfr_renamed_85(4));
        sprean2.cfr_renamed_2 = sprszm2.cfr_renamed_84() == 6 ? sprkgn.cfr_renamed_23(arg0.cfr_renamed_85(5)).cfr_renamed_314() : null;
    }

    public sprjfn cfr_renamed_9310() {
        return this.cfr_renamed_3;
    }

    public String cfr_renamed_4028() {
        return this.cfr_renamed_91;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        sprean sprean2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm sprrvm4 = sprrvm2;
        sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_0));
        sprrvm4.cfr_renamed_5004(new spraen(this.cfr_renamed_91));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        sprrvm2.cfr_renamed_5004(sprean2.cfr_renamed_1);
        if (sprean2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(new spraen(this.cfr_renamed_2));
        }
        return new sprcen(sprrvm2);
    }

    public String cfr_renamed_11363() {
        return this.cfr_renamed_2;
    }

    public sprjfn cfr_renamed_9300() {
        return this.cfr_renamed_4;
    }

    public byte[] cfr_renamed_2609() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1.cfr_renamed_186());
    }

    /*
     * WARNING - void declaration
     */
    public sprean(BigInteger bigInteger, String string, Date date, Date date2, byte[] byArray, String string2) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprean sprean2 = this;
        sprean sprean3 = this;
        sprean3.cfr_renamed_0 = arg0;
        sprean3.cfr_renamed_91 = arg1;
        sprean sprean4 = this;
        sprean3.cfr_renamed_3 = new sprkxm((Date)arg2);
        sprean2.cfr_renamed_4 = new sprkxm((Date)arg3);
        sprean2.cfr_renamed_1 = new sprfvg(sproze.cfr_renamed_158((byte[])arg4));
        sprean2.cfr_renamed_2 = string2;
    }

    public BigInteger cfr_renamed_324() {
        return this.cfr_renamed_0;
    }
}

