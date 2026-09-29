/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartLegend;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprqom
extends sprqqe {
    private final BigInteger cfr_renamed_0;
    private final BigInteger cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final BigInteger cfr_renamed_3;
    private final BigInteger cfr_renamed_4;

    public static sprqom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprqom) {
            return (sprqom)arg0;
        }
        if (arg0 != null) {
            return new sprqom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public BigInteger cfr_renamed_7383() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_4600() {
        return this.cfr_renamed_0;
    }

    public BigInteger cfr_renamed_7384() {
        return this.cfr_renamed_4;
    }

    public sprqom(byte[] arg0, int arg1, int arg2, int arg3) {
        this(arg0, BigInteger.valueOf(arg1), BigInteger.valueOf(arg2), BigInteger.valueOf(arg3), null);
    }

    public byte[] cfr_renamed_1477() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprqom(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4 && arg0.cfr_renamed_84() != 5) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, ChartLegend.cfr_renamed_9("X\u0014G\u001b]\u0013UZB\u001f@\u000fT\u0014R\u001f\u000bZB\u0013K\u001f\u0011G\u0011")).append(arg0.cfr_renamed_84()).toString());
        }
        void v0 = arg0;
        sprqom sprqom2 = this;
        sprqom2.cfr_renamed_2 = sproze.cfr_renamed_158(sproug.cfr_renamed_23(arg0.cfr_renamed_85(0)).cfr_renamed_186());
        sprqom2.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(1)).cfr_renamed_97();
        this.cfr_renamed_1 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(2)).cfr_renamed_97();
        this.cfr_renamed_4 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(3)).cfr_renamed_97();
        if (arg0.cfr_renamed_84() == 5) {
            this.cfr_renamed_0 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(4)).cfr_renamed_97();
            return;
        }
        this.cfr_renamed_0 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprqom(byte[] byArray, BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, BigInteger bigInteger4) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprqom sprqom2 = this;
        sprqom sprqom3 = this;
        this.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg0);
        sprqom3.cfr_renamed_3 = arg1;
        sprqom3.cfr_renamed_1 = arg2;
        sprqom2.cfr_renamed_4 = arg3;
        sprqom2.cfr_renamed_0 = bigInteger4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(5);
        sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        if (this.cfr_renamed_0 != null) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_0));
        }
        return new sprcen(sprrvm2);
    }

    public BigInteger cfr_renamed_1195() {
        return this.cfr_renamed_1;
    }

    public sprqom(byte[] arg0, int arg1, int arg2, int arg3, int arg4) {
        this(arg0, BigInteger.valueOf(arg1), BigInteger.valueOf(arg2), BigInteger.valueOf(arg3), BigInteger.valueOf(arg4));
    }
}

