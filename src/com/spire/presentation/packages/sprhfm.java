/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraim;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcvz;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprfim;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprik;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprmvh;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwyl;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxgi;
import java.math.BigInteger;

public class sprhfm
extends sprqqe
implements sprbr {
    private static final BigInteger cfr_renamed_119 = BigInteger.valueOf(1L);
    private sprwyl cfr_renamed_91;
    private sprfim cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private sprgxh cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public static sprhfm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhfm) {
            return (sprhfm)arg0;
        }
        if (arg0 != null) {
            return new sprhfm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(6);
        sprhfm sprhfm2 = this;
        sprrvm sprrvm3 = sprrvm2;
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprktm(cfr_renamed_119));
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_91);
        sprhfm sprhfm3 = this;
        sprrvm3.cfr_renamed_5004(new spraim(sprhfm3.cfr_renamed_3, sprhfm3.cfr_renamed_2));
        sprrvm2.cfr_renamed_5004(sprhfm2.cfr_renamed_0);
        sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_4));
        if (sprhfm2.cfr_renamed_1 != null) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_1));
        }
        return new sprcen(sprrvm2);
    }

    public sprhfm(sprgxh arg0, sprfim arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, null, null);
    }

    public BigInteger cfr_renamed_1146() {
        return this.cfr_renamed_4;
    }

    public spraim cfr_renamed_11115() {
        sprhfm sprhfm2 = this;
        return new spraim(sprhfm2.cfr_renamed_3, sprhfm2.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprhfm(sprgxh sprgxh2, sprfim sprfim2, BigInteger bigInteger, BigInteger bigInteger2, byte[] byArray) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhfm sprhfm2 = this;
        sprhfm sprhfm3 = this;
        this.cfr_renamed_3 = arg0;
        sprhfm3.cfr_renamed_0 = arg1;
        sprhfm3.cfr_renamed_4 = arg2;
        sprhfm2.cfr_renamed_1 = arg3;
        sprhfm2.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg4);
        if (sprmvh.cfr_renamed_8673(sprgxh2)) {
            sprhfm sprhfm4 = this;
            sprhfm4.cfr_renamed_91 = new sprwyl(arg0.cfr_renamed_845().cfr_renamed_1762());
            return;
        }
        if (sprmvh.cfr_renamed_8665((sprgxh)arg0)) {
            int[] nArray = ((sprik)arg0.cfr_renamed_845()).cfr_renamed_1764().cfr_renamed_1765();
            if (nArray.length == 3) {
                this.cfr_renamed_91 = new sprwyl(nArray[2], nArray[1]);
                return;
            }
            if (nArray.length == 5) {
                this.cfr_renamed_91 = new sprwyl(nArray[4], nArray[1], nArray[2], nArray[3]);
                return;
            }
            throw new IllegalArgumentException(sprcvz.cfr_renamed_9("\nl){ev7k+m(k$nec+fer l1m(k$nea0p3g6\"$p \"6w5r*p1g!"));
        }
        throw new IllegalArgumentException(sprxgi.cfr_renamed_9("\u000e[\\J_]\u000e\u0018@K\tWO\u0018HV\tMGK\\HYW[LL\\\tLPHL"));
    }

    public sprfim cfr_renamed_9182() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_9181() {
        return null != this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhfm(sprszm sprszm2) {
        sprhfm sprhfm2;
        void arg0;
        if (!(sprszm2.cfr_renamed_85(0) instanceof sprktm) || !((sprktm)arg0.cfr_renamed_85(0)).cfr_renamed_7241(1)) {
            throw new IllegalArgumentException(sprcvz.cfr_renamed_9("'c!\"3g7q,m+\",leZ|G\u0006R$p$o v p6"));
        }
        this.cfr_renamed_4 = ((sprktm)arg0.cfr_renamed_85(4)).cfr_renamed_97();
        if (arg0.cfr_renamed_84() == 6) {
            this.cfr_renamed_1 = ((sprktm)arg0.cfr_renamed_85(5)).cfr_renamed_97();
        }
        sprhfm sprhfm3 = this;
        spraim spraim2 = new spraim(sprwyl.cfr_renamed_23(arg0.cfr_renamed_85(1)), sprhfm3.cfr_renamed_4, sprhfm3.cfr_renamed_1, sprszm.cfr_renamed_23(arg0.cfr_renamed_85(2)));
        this.cfr_renamed_3 = spraim2.cfr_renamed_1769();
        sprco sprco2 = arg0.cfr_renamed_85(3);
        if (sprco2 instanceof sprfim) {
            this.cfr_renamed_0 = (sprfim)sprco2;
            sprhfm2 = this;
        } else {
            this.cfr_renamed_0 = new sprfim(this.cfr_renamed_3, (sproug)sprco2);
            sprhfm2 = this;
        }
        sprhfm2.cfr_renamed_2 = spraim2.cfr_renamed_2113();
    }

    public sprgxh cfr_renamed_1769() {
        return this.cfr_renamed_3;
    }

    public byte[] cfr_renamed_2113() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public sprhfm(sprgxh arg0, sprfim arg1, BigInteger arg2, BigInteger arg3) {
        this(arg0, arg1, arg2, arg3, null);
    }

    public BigInteger cfr_renamed_1153() {
        return this.cfr_renamed_1;
    }

    public spreuh cfr_renamed_1145() {
        return this.cfr_renamed_0.cfr_renamed_2322();
    }

    public sprwyl cfr_renamed_11116() {
        return this.cfr_renamed_91;
    }
}

