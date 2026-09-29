/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.ShapeAlignmentEnum;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprsdz;
import com.spire.presentation.packages.sprsuk;
import java.math.BigInteger;

public class sprwsk
implements sprbj {
    private int cfr_renamed_112;
    private sprsuk cfr_renamed_119;
    private static final int cfr_renamed_91 = 160;
    private int cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private BigInteger cfr_renamed_2;
    private BigInteger cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    public sprwsk(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, 0);
    }

    private static /* synthetic */ int cfr_renamed_3376(int arg0) {
        if (arg0 == 0) {
            return 160;
        }
        if (arg0 < 160) {
            return arg0;
        }
        return 160;
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_112;
    }

    public sprsuk cfr_renamed_3371() {
        return this.cfr_renamed_119;
    }

    public sprwsk(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3, int arg4) {
        this(arg0, arg1, arg2, arg3, arg4, null, null);
    }

    public BigInteger cfr_renamed_2616() {
        return this.cfr_renamed_1;
    }

    public int cfr_renamed_2331() {
        return this.cfr_renamed_0;
    }

    public sprwsk(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3) {
        this(arg0, arg1, arg2, sprwsk.cfr_renamed_3376(arg3), arg3, null, null);
    }

    public int hashCode() {
        return this.cfr_renamed_1155().hashCode() ^ this.cfr_renamed_1145().hashCode() ^ (this.cfr_renamed_1604() != null ? this.cfr_renamed_1604().hashCode() : 0);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprwsk)) {
            return false;
        }
        sprwsk sprwsk2 = (sprwsk)arg0;
        if (this.cfr_renamed_1604() != null ? !this.cfr_renamed_1604().equals(sprwsk2.cfr_renamed_1604()) : sprwsk2.cfr_renamed_1604() != null) {
            return false;
        }
        return sprwsk2.cfr_renamed_1155().equals(this.cfr_renamed_2) && sprwsk2.cfr_renamed_1145().equals(this.cfr_renamed_3);
    }

    public sprwsk(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, sprsuk arg4) {
        this(arg0, arg1, arg2, 160, 0, arg3, arg4);
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwsk(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int n, int n2, BigInteger bigInteger4, sprsuk sprsuk2) {
        void arg6;
        void arg5;
        void arg2;
        void arg1;
        void arg3;
        void arg0;
        void arg4;
        if (n2 != 0) {
            if (arg4 > arg0.bitLength()) {
                throw new IllegalArgumentException(ShapeAlignmentEnum.cfr_renamed_9("AcSe\u0016g\u0016}WgCn\u0016xFnUbPbSo\u001a+_\u007f\u0016fCxB+EjBbEmO+\u0004U\u001eg\u001b:\u001f+\n6\u0016{"));
            }
            if (arg4 < arg3) {
                throw new IllegalArgumentException(sprsdz.cfr_renamed_9("p\tb\u000f'\r'\u0017f\rr\u0004'\u0012w\u0004d\ba\bb\u0005+An\u0015'\ff\u0018'\u000fh\u0015'\u0003bAk\u0004t\u0012'\u0015o\u0000iAjAq\u0000k\u0014b"));
            }
        }
        if (arg3 > arg0.bitLength() && !sprjcf.cfr_renamed_5159(ShapeAlignmentEnum.cfr_renamed_9("Ud[%E{_yS%Fx[dRnZ%EnU~DbBr\u0018o^%WgZdATCeEjPni{i}WgCn"))) {
            throw new IllegalArgumentException(sprsdz.cfr_renamed_9("r\u000ft\u0000a\u0004'\u0011'\u0017f\rr\u0004'\u0012hAt\ff\rkAt\u0011b\u0002n\u0007n\u0002'\r'\u0013b\u0010r\bu\u0004c"));
        }
        sprwsk sprwsk2 = this;
        sprwsk sprwsk3 = this;
        sprwsk sprwsk4 = this;
        sprwsk4.cfr_renamed_3 = arg1;
        sprwsk4.cfr_renamed_2 = arg0;
        sprwsk3.cfr_renamed_4 = arg2;
        sprwsk3.cfr_renamed_112 = arg3;
        sprwsk2.cfr_renamed_0 = arg4;
        sprwsk2.cfr_renamed_1 = arg5;
        this.cfr_renamed_119 = arg6;
    }

    public sprwsk(BigInteger arg0, BigInteger arg1) {
        this(arg0, arg1, null, 0);
    }
}

