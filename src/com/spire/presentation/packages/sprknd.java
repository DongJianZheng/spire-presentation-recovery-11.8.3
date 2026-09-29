/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgmg;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprmf;
import com.spire.presentation.packages.sproqj;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprwfd;
import com.spire.presentation.packages.sprxdd;

public class sprknd
extends sprxdd {
    public sprmf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprknd(sprff sprff2, sprmf sprmf2) {
        void arg1;
        void arg0;
        sprknd sprknd2 = this;
        sprknd sprknd3 = this;
        sprknd3.cfr_renamed_2 = arg0;
        sprknd3.cfr_renamed_4 = arg1;
        sprknd2.cfr_renamed_4 = new byte[arg0.cfr_renamed_1195()];
        sprknd2.cfr_renamed_3 = 0;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_3;
        int n2 = n % ((sprmf)this.cfr_renamed_4).length;
        if (n2 == 0) {
            if (this.cfr_renamed_91) {
                return n + ((sprmf)this.cfr_renamed_4).length;
            }
            return n;
        }
        return n - n2 + ((sprmf)this.cfr_renamed_4).length;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sproqj.cfr_renamed_9("f%KcQdM%S!\u0005%\u0005*@#D0L2@dL*U1QdI!K#Q,\u0004"));
        }
        sprknd sprknd2 = this;
        int n = sprknd2.cfr_renamed_1195();
        int n2 = sprknd2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new spreid(sprgmg.cfr_renamed_9("K.P+Q/\u00049Q=B>V{P4K{W3K)P"));
        }
        int n3 = 0;
        int n4 = ((sprmf)this.cfr_renamed_4).length - this.cfr_renamed_3;
        if (arg2 > n4) {
            sprknd sprknd3 = this;
            System.arraycopy(arg0, arg1, sprknd3.cfr_renamed_4, sprknd3.cfr_renamed_3, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, arg3, arg4);
            this.cfr_renamed_3 = 0;
            arg1 += n4;
            int n5 = arg2 -= n4;
            while (n5 > ((sprmf)this.cfr_renamed_4).length) {
                n3 += this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1, arg3, arg4 + n3);
                arg1 += n;
                n5 = arg2 -= n;
            }
        }
        sprknd sprknd4 = this;
        System.arraycopy(arg0, arg1, sprknd4.cfr_renamed_4, sprknd4.cfr_renamed_3, arg2);
        this.cfr_renamed_3 += arg2;
        return n3;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprjkd, IllegalStateException, sprpjd {
        sprknd sprknd2 = this;
        int n = sprknd2.cfr_renamed_2.cfr_renamed_1195();
        int n2 = 0;
        if (sprknd2.cfr_renamed_91) {
            if (this.cfr_renamed_3 == n) {
                if (arg1 + 2 * n > arg0.length) {
                    this.cfr_renamed_41();
                    throw new spreid(sproqj.cfr_renamed_9("J1Q4P0\u0005&P\"C!WdQ+JdV,J6Q"));
                }
                sprknd sprknd3 = this;
                n2 = sprknd3.cfr_renamed_2.cfr_renamed_3064((byte[])sprknd3.cfr_renamed_4, 0, arg0, arg1);
                sprknd3.cfr_renamed_3 = 0;
            }
            sprknd sprknd4 = this;
            sprknd4.cfr_renamed_4.cfr_renamed_3210((byte[])sprknd4.cfr_renamed_4, this.cfr_renamed_3);
            sprknd sprknd5 = this;
            n2 += sprknd5.cfr_renamed_2.cfr_renamed_3064((byte[])sprknd5.cfr_renamed_4, 0, arg0, arg1 + n2);
            this.cfr_renamed_41();
            return n2;
        }
        if (this.cfr_renamed_3 != n) {
            this.cfr_renamed_41();
            throw new sprjkd(sprgmg.cfr_renamed_9("H:W/\u00049H4G0\u00042J8K6T7A/A{M5\u0004?A8V\"T/M4J"));
        }
        n2 = this.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, (byte[])this.cfr_renamed_4, 0);
        this.cfr_renamed_3 = 0;
        {
            sprknd sprknd6 = this;
            System.arraycopy(this.cfr_renamed_4, 0, arg0, arg1, n2 -= sprknd6.cfr_renamed_4.cfr_renamed_3236((byte[])sprknd6.cfr_renamed_4));
        }
        this.cfr_renamed_41();
        return n2;
    }

    public sprknd(sprff arg0) {
        this(arg0, new sprwfd());
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprjkd, IllegalStateException {
        int n = 0;
        sprknd sprknd2 = this;
        if (sprknd2.cfr_renamed_3 == ((sprmf)sprknd2.cfr_renamed_4).length) {
            n = this.cfr_renamed_2.cfr_renamed_3064((byte[])this.cfr_renamed_4, 0, arg1, arg2);
            this.cfr_renamed_3 = 0;
        }
        this.cfr_renamed_4[this.cfr_renamed_3++] = (sprmf)arg0;
        return n;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_41();
        if (sprt2 instanceof spraed) {
            spraed spraed2 = (spraed)arg1;
            sprknd sprknd2 = this;
            sprknd2.cfr_renamed_4.cfr_renamed_3251(spraed2.cfr_renamed_1295());
            sprknd2.cfr_renamed_2.cfr_renamed_1217((boolean)arg0, spraed2.cfr_renamed_284());
            return;
        }
        sprknd sprknd3 = this;
        sprknd3.cfr_renamed_4.cfr_renamed_3251(null);
        sprknd3.cfr_renamed_2.cfr_renamed_1217((boolean)arg0, (sprt)arg1);
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_3;
        int n2 = n % ((sprmf)this.cfr_renamed_4).length;
        if (n2 == 0) {
            return Math.max(0, n - ((sprmf)this.cfr_renamed_4).length);
        }
        return n - n2;
    }
}

