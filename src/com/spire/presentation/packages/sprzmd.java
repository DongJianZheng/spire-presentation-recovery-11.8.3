/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqnd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtpa;
import com.spire.presentation.packages.sprzyd;
import java.math.BigInteger;

public class sprzmd
implements sprt {
    private static final int cfr_renamed_112 = 160;
    private sprqnd cfr_renamed_119;
    private BigInteger cfr_renamed_91;
    private BigInteger cfr_renamed_0;
    private BigInteger cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private BigInteger cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprzmd(BigInteger bigInteger, BigInteger bigInteger2, BigInteger bigInteger3, int n, int n2, BigInteger bigInteger4, sprqnd sprqnd2) {
        void arg6;
        void arg5;
        void arg2;
        void arg1;
        void arg3;
        void arg0;
        void arg4;
        if (n2 != 0) {
            if (BigInteger.valueOf(2L ^ (long)(arg4 - true)).compareTo((BigInteger)arg0) == 1) {
                throw new IllegalArgumentException(sprzyd.cfr_renamed_9("\u00101\u00027G5G/\u00065\u0012<G*\u0017<\u00040\u00010\u0002=Ky\u000e-G4\u0012*\u0013y\u00148\u00130\u0014?\u001eyU\u0007O5JhNy[dG)"));
            }
            if (arg4 < arg3) {
                throw new IllegalArgumentException(sprtpa.cfr_renamed_9("\u0013\u0013\u0001\u0015D\u0017D\r\u0005\u0017\u0011\u001eD\b\u0014\u001e\u0007\u0012\u0002\u0012\u0001\u001fH[\r\u000fD\u0016\u0005\u0002D\u0015\u000b\u000fD\u0019\u0001[\b\u001e\u0017\bD\u000f\f\u001a\n[\t[\u0012\u001a\b\u000e\u0001"));
            }
        }
        sprzmd sprzmd2 = this;
        sprzmd sprzmd3 = this;
        sprzmd sprzmd4 = this;
        sprzmd4.cfr_renamed_1 = arg1;
        sprzmd4.cfr_renamed_0 = arg0;
        sprzmd3.cfr_renamed_4 = arg2;
        sprzmd3.cfr_renamed_3 = arg3;
        sprzmd2.cfr_renamed_2 = arg4;
        sprzmd2.cfr_renamed_91 = arg5;
        this.cfr_renamed_119 = arg6;
    }

    public sprzmd(BigInteger arg0, BigInteger arg1, BigInteger arg2, BigInteger arg3, sprqnd arg4) {
        this(arg0, arg1, arg2, 160, 0, arg3, arg4);
    }

    public int hashCode() {
        return this.cfr_renamed_1155().hashCode() ^ this.cfr_renamed_1145().hashCode() ^ (this.cfr_renamed_1604() != null ? this.cfr_renamed_1604().hashCode() : 0);
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_3;
    }

    public BigInteger cfr_renamed_1155() {
        return this.cfr_renamed_0;
    }

    public sprzmd(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3) {
        this(arg0, arg1, arg2, sprzmd.cfr_renamed_3376(arg3), arg3, null, null);
    }

    public BigInteger cfr_renamed_1604() {
        return this.cfr_renamed_4;
    }

    public BigInteger cfr_renamed_1145() {
        return this.cfr_renamed_1;
    }

    public sprzmd(BigInteger arg0, BigInteger arg1, BigInteger arg2, int arg3, int arg4) {
        this(arg0, arg1, arg2, arg3, arg4, null, null);
    }

    public sprzmd(BigInteger arg0, BigInteger arg1, BigInteger arg2) {
        this(arg0, arg1, arg2, 0);
    }

    public int cfr_renamed_2331() {
        return this.cfr_renamed_2;
    }

    public sprqnd cfr_renamed_3371() {
        return this.cfr_renamed_119;
    }

    public sprzmd(BigInteger arg0, BigInteger arg1) {
        this(arg0, arg1, null, 0);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprzmd)) {
            return false;
        }
        sprzmd sprzmd2 = (sprzmd)arg0;
        if (this.cfr_renamed_1604() != null ? !this.cfr_renamed_1604().equals(sprzmd2.cfr_renamed_1604()) : sprzmd2.cfr_renamed_1604() != null) {
            return false;
        }
        return sprzmd2.cfr_renamed_1155().equals(this.cfr_renamed_0) && sprzmd2.cfr_renamed_1145().equals(this.cfr_renamed_1);
    }

    public BigInteger cfr_renamed_2616() {
        return this.cfr_renamed_91;
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
}

