/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnac;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprbig
extends sprqqe {
    private final byte[] cfr_renamed_112;
    private final long cfr_renamed_119;
    private final long cfr_renamed_91;
    private final byte[] cfr_renamed_0;
    private final byte[] cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final int cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = new sprrvm();
        if (this.cfr_renamed_91 >= 0L) {
            sprrvm3.cfr_renamed_5004(new sprktm(1L));
        } else {
            sprrvm3.cfr_renamed_5004(new sprktm(0L));
        }
        sprrvm sprrvm4 = sprrvm2 = new sprrvm();
        sprrvm4.cfr_renamed_5004(new sprktm(this.cfr_renamed_119));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_112));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_1));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        sprrvm4.cfr_renamed_5004(new sprfvg(this.cfr_renamed_0));
        if (this.cfr_renamed_91 >= 0L) {
            sprrvm2.cfr_renamed_5004(new sprycn(0 != 0, 0, (sprco)new sprktm(this.cfr_renamed_91)));
        }
        sprrvm sprrvm5 = sprrvm3;
        sprrvm5.cfr_renamed_5004(new sprcen(sprrvm2));
        sprrvm5.cfr_renamed_5004(new sprycn(true, 0, (sprco)new sprfvg(this.cfr_renamed_4)));
        return new sprcen(sprrvm3);
    }

    public byte[] cfr_renamed_5774() {
        return sproze.cfr_renamed_158(this.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbig(sprszm sprszm2) {
        void v3;
        sprszm sprszm3;
        void arg0;
        sprktm sprktm2 = sprktm.cfr_renamed_23(sprszm2.cfr_renamed_85(0));
        if (!sprktm2.cfr_renamed_7241(0) && !sprktm2.cfr_renamed_7241(1)) {
            throw new IllegalArgumentException(sprbvh.cfr_renamed_9(" =>=:$;s#6' <<;s:5u 0\" 6;00"));
        }
        this.cfr_renamed_3 = sprktm2.cfr_renamed_5023();
        if (arg0.cfr_renamed_84() != 2 && arg0.cfr_renamed_84() != 3) {
            throw new IllegalArgumentException(sprnac.cfr_renamed_9("\u001ac\b&\u0002c\u0000s\u0014h\u0012cQq\u0003i\u001faQu\u0018|\u0014"));
        }
        sprszm sprszm4 = sprszm3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        sprbig sprbig2 = this;
        sprszm sprszm5 = sprszm3;
        this.cfr_renamed_119 = sprktm.cfr_renamed_23(sprszm3.cfr_renamed_85(0)).cfr_renamed_7242();
        this.cfr_renamed_112 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(sprszm5.cfr_renamed_85(1)).cfr_renamed_186());
        sprbig2.cfr_renamed_1 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(sprszm5.cfr_renamed_85(2)).cfr_renamed_186());
        sprbig2.cfr_renamed_2 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(sprszm3.cfr_renamed_85(3)).cfr_renamed_186());
        this.cfr_renamed_0 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_23(sprszm4.cfr_renamed_85(4)).cfr_renamed_186());
        if (sprszm4.cfr_renamed_84() == 6) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_23(sprszm3.cfr_renamed_85(5));
            if (sprnvm2.cfr_renamed_312() != 0) {
                throw new IllegalArgumentException(sprbvh.cfr_renamed_9(" =>=:$;s!22s<=u\u000b\u0018\u0000\u0006\u0003':#2!6\u001e6,"));
            }
            this.cfr_renamed_91 = sprktm.cfr_renamed_5085(sprnvm2, false).cfr_renamed_7242();
            v3 = arg0;
        } else if (sprszm3.cfr_renamed_84() == 5) {
            v3 = arg0;
            this.cfr_renamed_91 = -1L;
        } else {
            throw new IllegalArgumentException(sprnac.cfr_renamed_9("\u001ac\bU\u0014wQu\u0019i\u0004j\u0015&\u0013cQ3Qi\u0003&G&\u0018hQj\u0014h\u0016r\u0019"));
        }
        if (v3.cfr_renamed_84() == 3) {
            this.cfr_renamed_4 = sproze.cfr_renamed_158(sprfvg.cfr_renamed_5085(sprnvm.cfr_renamed_23(arg0.cfr_renamed_85(2)), true).cfr_renamed_186());
            return;
        }
        this.cfr_renamed_4 = null;
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprbig(long l, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5, long l2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprbig sprbig2 = this;
        sprbig sprbig3 = this;
        sprbig sprbig4 = this;
        sprbig sprbig5 = this;
        sprbig5.cfr_renamed_3 = 1;
        sprbig5.cfr_renamed_119 = arg0;
        sprbig4.cfr_renamed_112 = sproze.cfr_renamed_158((byte[])arg1);
        sprbig4.cfr_renamed_1 = sproze.cfr_renamed_158((byte[])arg2);
        sprbig3.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg3);
        sprbig3.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg4);
        sprbig2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg5);
        sprbig2.cfr_renamed_91 = l2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbig(long l, byte[] byArray, byte[] byArray2, byte[] byArray3, byte[] byArray4, byte[] byArray5) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprbig sprbig2 = this;
        sprbig sprbig3 = this;
        sprbig sprbig4 = this;
        sprbig sprbig5 = this;
        sprbig5.cfr_renamed_3 = 0;
        sprbig5.cfr_renamed_119 = arg0;
        sprbig4.cfr_renamed_112 = sproze.cfr_renamed_158((byte[])arg1);
        sprbig4.cfr_renamed_1 = sproze.cfr_renamed_158((byte[])arg2);
        sprbig3.cfr_renamed_2 = sproze.cfr_renamed_158((byte[])arg3);
        sprbig3.cfr_renamed_0 = sproze.cfr_renamed_158((byte[])arg4);
        sprbig2.cfr_renamed_4 = sproze.cfr_renamed_158((byte[])arg5);
        sprbig2.cfr_renamed_91 = -1L;
    }

    public byte[] cfr_renamed_5769() {
        return sproze.cfr_renamed_158(this.cfr_renamed_2);
    }

    public long cfr_renamed_320() {
        return this.cfr_renamed_119;
    }

    public byte[] cfr_renamed_5978() {
        return sproze.cfr_renamed_158(this.cfr_renamed_4);
    }

    public long cfr_renamed_5797() {
        return this.cfr_renamed_91;
    }

    public byte[] cfr_renamed_1411() {
        return sproze.cfr_renamed_158(this.cfr_renamed_0);
    }

    public static sprbig cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbig) {
            return (sprbig)arg0;
        }
        if (arg0 != null) {
            return new sprbig(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public byte[] cfr_renamed_5768() {
        return sproze.cfr_renamed_158(this.cfr_renamed_112);
    }
}

