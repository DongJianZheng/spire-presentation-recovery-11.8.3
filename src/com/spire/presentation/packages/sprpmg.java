/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprjfd;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxpo;
import com.spire.presentation.packages.sprycn;

public class sprpmg
extends sprqqe {
    private final byte[] cfr_renamed_112;
    private final byte[] cfr_renamed_119;
    private final byte[] cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final int cfr_renamed_1;
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public int cfr_renamed_320() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_5797() {
        return this.cfr_renamed_2;
    }

    public byte[] cfr_renamed_5768() {
        return sproze.cfr_renamed_158(this.cfr_renamed_91);
    }

    /*
     * WARNING - void declaration
     */
    public sprpmg(int n, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprpmg sprpmg2 = this;
        sprpmg sprpmg3 = this;
        sprpmg sprpmg4 = this;
        sprpmg sprpmg5 = this;
        sprpmg5.cfr_renamed_1 = 0;
        sprpmg5.cfr_renamed_3 = arg0;
        sprpmg4.cfr_renamed_91 = sproze.cfr_renamed_158((byte[])arg1);
        sprpmg4.cfr_renamed_119 = sproze.cfr_renamed_158((byte[])arg2);
        sprpmg3.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg3);
        sprpmg3.cfr_renamed_112 = sproze.cfr_renamed_158((byte[])arg4);
        sprpmg2.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg5);
        sprpmg2.cfr_renamed_2 = -1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = new sprrvm();
        if (this.cfr_renamed_2 >= 0) {
            sprrvm3.cfr_renamed_5004(new sprktm(1L));
        } else {
            sprrvm3.cfr_renamed_5004(new sprktm(0L));
        }
        sprrvm sprrvm4 = sprrvm2 = new sprrvm();
        sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_91));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_119));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_4));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_112));
        if (this.cfr_renamed_2 >= 0) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)new sprktm(this.cfr_renamed_2)));
        }
        sprrvm sprrvm5 = sprrvm3;
        sprrvm5.cfr_renamed_5004(new sprcen(sprrvm2));
        sprrvm5.cfr_renamed_5004(new sprycn(true, 0, (sprco)new sprfvg(this.cfr_renamed_0)));
        return new sprcen(sprrvm3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprpmg(sprszm sprszm2) {
        void v3;
        sprszm sprszm3;
        void arg0;
        sprktm sprktm2 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (!sprktm2.cfr_renamed_7241(0) && !sprktm2.cfr_renamed_7241(1)) {
            throw new IllegalArgumentException(sprjfd.cfr_renamed_9("\\$B$F=Gj_/[9@%GjF,\t9L;\\/G)L"));
        }
        this.cfr_renamed_1 = sprktm2.cfr_renamed_5023();
        if (arg0.cfr_renamed_84() != 2 && arg0.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprxpo.cfr_renamed_9("<..k$.&>2%4.w<%$9,w8>12"));
        }
        sprszm sprszm4 = sprszm3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        sprpmg sprpmg2 = this;
        sprszm sprszm5 = sprszm3;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(sprszm3.cfr_renamed_85(0)).cfr_renamed_5023();
        this.cfr_renamed_91 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(sprszm5.cfr_renamed_85(1)).cfr_renamed_186());
        sprpmg2.cfr_renamed_119 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(sprszm5.cfr_renamed_85(2)).cfr_renamed_186());
        sprpmg2.cfr_renamed_4 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(sprszm3.cfr_renamed_85(3)).cfr_renamed_186());
        this.cfr_renamed_112 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(sprszm4.cfr_renamed_85(4)).cfr_renamed_186());
        if (sprszm4.cfr_renamed_84() == 6) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(sprszm3.cfr_renamed_85(5));
            if (sprnvm2.cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(sprjfd.cfr_renamed_9("\\$B$F=Gj]+Nj@$\t\u0012d\u0019z\u001a[#_+]/b/P"));
            }
            this.cfr_renamed_2 = sprktm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_5023();
            v3 = arg0;
        } else if (sprszm3.cfr_renamed_84() == 5) {
            v3 = arg0;
            this.cfr_renamed_2 = -1;
        } else {
            throw new IllegalArgumentException(sprxpo.cfr_renamed_9("<..\u00182:w8?$\"'3k5.w~w$%kak>%w'2%0??"));
        }
        if (v3.cfr_renamed_84() == 3) {
            this.cfr_renamed_0 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_5085(sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(2)), true).cfr_renamed_186());
            return;
        }
        this.cfr_renamed_0 = null;
    }

    public byte[] cfr_renamed_5978() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprpmg(int n, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5, int n2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprpmg sprpmg2 = this;
        sprpmg sprpmg3 = this;
        sprpmg sprpmg4 = this;
        sprpmg sprpmg5 = this;
        sprpmg5.cfr_renamed_1 = 1;
        sprpmg5.cfr_renamed_3 = arg0;
        sprpmg4.cfr_renamed_91 = sproze.cfr_renamed_158((byte[])arg1);
        sprpmg4.cfr_renamed_119 = sproze.cfr_renamed_158((byte[])arg2);
        sprpmg3.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg3);
        sprpmg3.cfr_renamed_112 = sproze.cfr_renamed_158((byte[])arg4);
        sprpmg2.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg5);
        sprpmg2.cfr_renamed_2 = n2;
    }

    public byte[] cfr_renamed_1411() {
        return sproze.cfr_renamed_158(this.cfr_renamed_112);
    }

    public byte[] cfr_renamed_5774() {
        return sproze.cfr_renamed_158(this.cfr_renamed_119);
    }

    public static sprpmg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprpmg) {
            return (sprpmg)arg0;
        }
        if (arg0 != null) {
            return new sprpmg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_5769() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }
}

