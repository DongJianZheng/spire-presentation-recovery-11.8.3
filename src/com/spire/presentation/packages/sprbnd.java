/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbfd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sprmuea;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprple;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;

public class sprbnd
implements spruc {
    private int cfr_renamed_112;
    private sprnld cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private sprnld cfr_renamed_0;
    private sprmf cfr_renamed_1;
    private sprff cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    public sprbnd(sprff arg0, int arg1) {
        this(arg0, arg1, null);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1524(sprt sprt2) {
        void v0;
        sprnld sprnld2;
        sprnld sprnld3;
        sprnld sprnld4;
        void arg0;
        this.cfr_renamed_41();
        if (!(sprt2 instanceof sprnld) && !(arg0 instanceof sprnjd)) {
            throw new IllegalArgumentException(sprmuea.cfr_renamed_9("f\u0002d\u0002{\u00106\u000ec\u0010bCt\u00066\u0002xC\u007f\re\u0017w\ru\u00066\fpC]\u0006o3w\u0011w\u000es\u0017s\u00116\fdCF\u0002d\u0002{\u0006b\u0006d\u0010A\nb\u000b_5"));
        }
        byte[] byArray = (arg0 instanceof sprnld ? (sprnld4 = (sprnld)arg0) : (sprnld3 = (sprnld)((sprnjd)arg0).cfr_renamed_284())).cfr_renamed_1521();
        if (byArray.length == 16) {
            sprnld2 = new sprnld(byArray, 0, 8);
            v0 = arg0;
            sprbnd sprbnd2 = this;
            sprbnd sprbnd3 = this;
            sprbnd2.cfr_renamed_0 = new sprnld(byArray, 8, 8);
            sprbnd2.cfr_renamed_119 = sprnld2;
        } else if (byArray.length == 24) {
            sprnld2 = new sprnld(byArray, 0, 8);
            v0 = arg0;
            sprbnd sprbnd4 = this;
            sprbnd4.cfr_renamed_0 = new sprnld(byArray, 8, 8);
            sprbnd4.cfr_renamed_119 = new sprnld(byArray, 16, 8);
        } else {
            throw new IllegalArgumentException(sprple.cfr_renamed_9("NI|\fhYvX%N`\f`EqD`^%\u001d4\u001e%Cw\f4\u001a=\fgEq\fiCkK"));
        }
        sprbnd sprbnd5 = this;
        if (v0 instanceof sprnjd) {
            sprbnd5.cfr_renamed_2.cfr_renamed_1217(true, new sprnjd(sprnld2, ((sprnjd)arg0).cfr_renamed_1205()));
            return;
        }
        sprbnd5.cfr_renamed_2.cfr_renamed_1217(true, sprnld2);
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_112;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprbfd sprbfd2;
        sprbnd sprbnd2 = this;
        int n = sprbnd2.cfr_renamed_2.cfr_renamed_1195();
        if (sprbnd2.cfr_renamed_1 == null) {
            sprbnd sprbnd3 = this;
            while (sprbnd3.cfr_renamed_4 < n) {
                sprbnd sprbnd4 = this;
                sprbnd sprbnd5 = this;
                sprbnd3 = sprbnd5;
                sprbnd4.cfr_renamed_3[sprbnd5.cfr_renamed_4] = 0;
                ++sprbnd4.cfr_renamed_4;
            }
        } else {
            if (this.cfr_renamed_4 == n) {
                sprbnd sprbnd6 = this;
                sprbnd6.cfr_renamed_2.cfr_renamed_3064(sprbnd6.cfr_renamed_3, 0, this.cfr_renamed_91, 0);
                this.cfr_renamed_4 = 0;
            }
            sprbnd sprbnd7 = this;
            sprbnd7.cfr_renamed_1.cfr_renamed_3210(sprbnd7.cfr_renamed_3, this.cfr_renamed_4);
        }
        sprbnd sprbnd8 = this;
        sprbnd8.cfr_renamed_2.cfr_renamed_3064(sprbnd8.cfr_renamed_3, 0, this.cfr_renamed_91, 0);
        sprbfd sprbfd3 = sprbfd2 = new sprbfd();
        sprbfd3.cfr_renamed_1217(false, this.cfr_renamed_0);
        sprbfd3.cfr_renamed_3064(this.cfr_renamed_91, 0, this.cfr_renamed_91, 0);
        sprbfd sprbfd4 = sprbfd2;
        sprbfd4.cfr_renamed_1217(true, this.cfr_renamed_119);
        sprbfd4.cfr_renamed_3064(this.cfr_renamed_91, 0, this.cfr_renamed_91, 0);
        sprbnd sprbnd9 = this;
        System.arraycopy(sprbnd9.cfr_renamed_91, 0, arg0, arg1, this.cfr_renamed_112);
        sprbnd9.cfr_renamed_41();
        return sprbnd8.cfr_renamed_112;
    }

    public sprbnd(sprff arg0, sprmf arg1) {
        sprff sprff2 = arg0;
        this(sprff2, sprff2.cfr_renamed_1195() * 8, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprbnd(sprff sprff2, int n, sprmf sprmf2) {
        void arg1;
        void arg2;
        void arg0;
        if (n % 8 != 0) {
            throw new IllegalArgumentException(sprmuea.cfr_renamed_9("[\"UCe\nl\u00066\u000ec\u0010bCt\u00066\u000ec\u000fb\nf\u000fsCy\u00056["));
        }
        if (!(arg0 instanceof sprbfd)) {
            throw new IllegalArgumentException(sprple.cfr_renamed_9("fEuD`^%Ap_q\fgI%Ek_qMkO`\fjJ%h@\u007f@BbEkI"));
        }
        sprbnd sprbnd2 = this;
        sprbnd sprbnd3 = this;
        this.cfr_renamed_2 = new sprgnd((sprff)arg0);
        sprbnd3.cfr_renamed_1 = arg2;
        sprbnd3.cfr_renamed_112 = arg1 / 8;
        sprbnd2.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        sprbnd2.cfr_renamed_3 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_4 = 0;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprmuea.cfr_renamed_9("*E,/T/TW\u000fqP");
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_2.cfr_renamed_41();
    }

    public sprbnd(sprff arg0) {
        sprff sprff2 = arg0;
        this(sprff2, sprff2.cfr_renamed_1195() * 8, null);
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprple.cfr_renamed_9("odB\"X%DdZ`\fd\fkIbMqEsI%Ek\\pX%@`BbXm\r"));
        }
        int n = this.cfr_renamed_2.cfr_renamed_1195();
        int n2 = 0;
        int n3 = n - this.cfr_renamed_4;
        if (arg2 > n3) {
            sprbnd sprbnd2 = this;
            System.arraycopy(arg0, arg1, sprbnd2.cfr_renamed_3, sprbnd2.cfr_renamed_4, n3);
            n2 += this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_3, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_4 = 0;
            arg1 += n3;
            int n4 = arg2 -= n3;
            while (n4 > n) {
                n2 += this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_91, 0);
                arg1 += n;
                n4 = arg2 -= n;
            }
        }
        sprbnd sprbnd3 = this;
        System.arraycopy(arg0, arg1, sprbnd3.cfr_renamed_3, sprbnd3.cfr_renamed_4, arg2);
        this.cfr_renamed_4 += arg2;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprbnd sprbnd2 = this;
        if (sprbnd2.cfr_renamed_4 == sprbnd2.cfr_renamed_3.length) {
            sprbnd sprbnd3 = this;
            sprbnd3.cfr_renamed_2.cfr_renamed_3064(sprbnd3.cfr_renamed_3, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_4 = 0;
        }
        this.cfr_renamed_3[this.cfr_renamed_4++] = arg0;
    }
}

