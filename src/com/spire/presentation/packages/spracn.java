/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcaz;
import com.spire.presentation.packages.sprexm;
import com.spire.presentation.packages.sprgfn;
import com.spire.presentation.packages.sprggn;
import com.spire.presentation.packages.sprmdf;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprurca;

@sprtea
public final class spracn {
    public int cfr_renamed_79;
    @sprtea
    public sprgfn cfr_renamed_107;
    @sprtea
    public sprexm cfr_renamed_132;
    @sprtea
    public long cfr_renamed_102;
    public long cfr_renamed_93;
    public byte[] cfr_renamed_86;
    public long cfr_renamed_152;
    public byte[] cfr_renamed_112;
    public int cfr_renamed_119;
    public int cfr_renamed_91;
    public int cfr_renamed_0;
    public int cfr_renamed_1;
    public int cfr_renamed_2;
    public String cfr_renamed_3;
    public int cfr_renamed_4;

    public int cfr_renamed_11563() {
        spracn spracn2 = this;
        return spracn2.cfr_renamed_11564(spracn2.cfr_renamed_2);
    }

    @sprtea
    public int cfr_renamed_11565(byte[] arg0, int arg1, int arg2) {
        int n = this.cfr_renamed_0;
        if (n > arg2) {
            n = arg2;
        }
        if (n == 0) {
            return 0;
        }
        spracn spracn2 = this;
        spracn2.cfr_renamed_0 -= n;
        if (spracn2.cfr_renamed_132.cfr_renamed_11566()) {
            this.cfr_renamed_102 = sprggn.cfr_renamed_11567(this.cfr_renamed_102, this.cfr_renamed_86, this.cfr_renamed_91, n);
        }
        spracn spracn3 = this;
        spracn spracn4 = this;
        System.arraycopy(spracn3.cfr_renamed_86, spracn4.cfr_renamed_91, arg0, arg1, n);
        spracn4.cfr_renamed_91 += n;
        spracn3.cfr_renamed_152 += (long)n;
        return n;
    }

    private /* synthetic */ int cfr_renamed_11568(boolean arg0) {
        if (this.cfr_renamed_107 != null) {
            throw new sprurca(sprmdf.cfr_renamed_9("\u0017G;\b#I7\b G:\b-I\"Dna A:A/D'R+l+N\"I:Mf\u0001nI(\\+ZnK/D\"A Ona A:A/D'R+a N\"I:Mf\u0001`"));
        }
        spracn spracn2 = this;
        spracn2.cfr_renamed_132 = new sprexm();
        spracn2.cfr_renamed_132.cfr_renamed_11569(arg0);
        spracn spracn3 = this;
        spracn spracn4 = this;
        return spracn2.cfr_renamed_132.cfr_renamed_11570(spracn4, spracn3.cfr_renamed_4, spracn3.cfr_renamed_2, spracn4.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_11571(int n, int n2, boolean bl) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = arg1;
        return this.cfr_renamed_11568(bl);
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_11572(int n, int n2) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_2 = arg1;
        return this.cfr_renamed_11568(true);
    }

    /*
     * WARNING - void declaration
     */
    public spracn(int n) {
        void arg0;
        spracn spracn2 = this;
        this.cfr_renamed_4 = 6;
        spracn2.cfr_renamed_2 = 15;
        spracn2.cfr_renamed_1 = 0;
        if (n == 0) {
            int n2 = this.cfr_renamed_11573();
            if (n2 != 0) {
                throw new sprurca(sprcaz.cfr_renamed_9("X\u0000u\u000ft\u0015;\bu\bo\bz\rr\u001b~A}\u000eiA\u007f\u0004}\rz\u0015~O"));
            }
        } else if (arg0 == true) {
            int n3 = this.cfr_renamed_11563();
            if (n3 != 0) {
                throw new sprurca(sprmdf.cfr_renamed_9("k/F G:\b'F'\\'I\"A4MnN!ZnA N\"I:M`"));
            }
        } else {
            throw new sprurca(sprcaz.cfr_renamed_9("(u\u0017z\rr\u0005;;w\by2o\u0013~\u0000v'w\u0000m\u000eiO"));
        }
    }

    public int cfr_renamed_11574() {
        if (this.cfr_renamed_107 == null) {
            throw new sprurca(sprmdf.cfr_renamed_9("\u0000Gna N\"I:Mn{:I:Mo"));
        }
        int n = this.cfr_renamed_107.cfr_renamed_11575();
        this.cfr_renamed_107 = null;
        return n;
    }

    public int cfr_renamed_11576(boolean arg0) {
        spracn spracn2 = this;
        return spracn2.cfr_renamed_11577(spracn2.cfr_renamed_2, arg0);
    }

    public int cfr_renamed_11578(byte[] arg0) {
        if (this.cfr_renamed_107 != null) {
            return this.cfr_renamed_107.cfr_renamed_11578(arg0);
        }
        if (this.cfr_renamed_132 != null) {
            return this.cfr_renamed_132.cfr_renamed_11578(arg0);
        }
        throw new sprurca(sprcaz.cfr_renamed_9("U\u000e;(u\u0007w\u0000o\u0004;\u000eiA_\u0004}\rz\u0015~Ah\u0015z\u0015~@"));
    }

    public int cfr_renamed_11579() {
        if (this.cfr_renamed_132 == null) {
            throw new sprurca(sprmdf.cfr_renamed_9("\u0000Gnl+N\"I:Mn{:I:Mo"));
        }
        int n = this.cfr_renamed_132.cfr_renamed_11575();
        this.cfr_renamed_132 = null;
        return n;
    }

    public int cfr_renamed_11577(int arg0, boolean arg1) {
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_132 != null) {
            throw new sprurca(sprcaz.cfr_renamed_9("8t\u0014;\fz\u0018;\u000ft\u0015;\u0002z\rwAR\u000fr\u0015r\u0000w\ba\u0004R\u000f}\rz\u0015~I2Az\u0007o\u0004iAx\u0000w\rr\u000f|AR\u000fr\u0015r\u0000w\ba\u0004_\u0004}\rz\u0015~I2O"));
        }
        this.cfr_renamed_107 = new sprgfn(arg1);
        return this.cfr_renamed_107.cfr_renamed_11580(this, arg0);
    }

    public spracn() {
        spracn spracn2 = this;
        this.cfr_renamed_4 = 6;
        spracn2.cfr_renamed_2 = 15;
        spracn2.cfr_renamed_1 = 0;
    }

    public long cfr_renamed_11581() {
        return this.cfr_renamed_102;
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_11582(int n, boolean bl) {
        void arg0;
        this.cfr_renamed_4 = arg0;
        return this.cfr_renamed_11568(bl);
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_11583(int n) {
        void arg0;
        this.cfr_renamed_4 = arg0;
        return this.cfr_renamed_11568(true);
    }

    public int cfr_renamed_11584(int arg0) {
        if (this.cfr_renamed_132 == null) {
            throw new sprurca(sprmdf.cfr_renamed_9("\u0000Gnl+N\"I:Mn{:I:Mo"));
        }
        return this.cfr_renamed_132.cfr_renamed_11584(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public int cfr_renamed_11564(int n) {
        void arg0;
        this.cfr_renamed_2 = arg0;
        return this.cfr_renamed_11577(n, true);
    }

    public int cfr_renamed_11573() {
        return this.cfr_renamed_11568(true);
    }

    public int cfr_renamed_11585() {
        if (this.cfr_renamed_107 == null) {
            throw new sprurca(sprcaz.cfr_renamed_9("/tAR\u000f}\rz\u0015~AH\u0015z\u0015~@"));
        }
        return this.cfr_renamed_107.cfr_renamed_11586();
    }

    @sprtea
    public void cfr_renamed_11587() {
        int n = this.cfr_renamed_132.cfr_renamed_84;
        if (n > this.cfr_renamed_119) {
            n = this.cfr_renamed_119;
        }
        if (n == 0) {
            return;
        }
        if (this.cfr_renamed_132.cfr_renamed_724.length <= this.cfr_renamed_132.cfr_renamed_956 || this.cfr_renamed_112.length <= this.cfr_renamed_79 || this.cfr_renamed_132.cfr_renamed_724.length < this.cfr_renamed_132.cfr_renamed_956 + n || this.cfr_renamed_112.length < this.cfr_renamed_79 + n) {
            Object[] objectArray = new Object[2];
            objectArray[0] = this.cfr_renamed_132.cfr_renamed_724.length;
            objectArray[1] = this.cfr_renamed_132.cfr_renamed_84;
            throw new sprurca(sprraia.cfr_renamed_11562(sprmdf.cfr_renamed_9("\u0007F8I\"A*\b\u001d\\/\\+\u0006n\u0000>M L'F)\u0006\u0002M O:@sS~Ub\b>M L'F)k!] \\sS\u007fUg"), objectArray));
        }
        spracn spracn2 = this;
        spracn spracn3 = this;
        spracn spracn4 = this;
        System.arraycopy(spracn2.cfr_renamed_132.cfr_renamed_724, spracn3.cfr_renamed_132.cfr_renamed_956, spracn4.cfr_renamed_112, spracn4.cfr_renamed_79, n);
        spracn2.cfr_renamed_79 += n;
        spracn3.cfr_renamed_132.cfr_renamed_956 += n;
        spracn2.cfr_renamed_93 += (long)n;
        spracn2.cfr_renamed_119 -= n;
        spracn2.cfr_renamed_132.cfr_renamed_84 -= n;
        if (spracn2.cfr_renamed_132.cfr_renamed_84 == 0) {
            this.cfr_renamed_132.cfr_renamed_956 = 0;
        }
    }

    public int cfr_renamed_11588(int arg0) {
        if (this.cfr_renamed_107 == null) {
            throw new sprurca(sprcaz.cfr_renamed_9("/tAR\u000f}\rz\u0015~AH\u0015z\u0015~@"));
        }
        return this.cfr_renamed_107.cfr_renamed_11588(arg0);
    }

    public int cfr_renamed_11589(int arg0, int arg1) {
        if (this.cfr_renamed_132 == null) {
            throw new sprurca(sprmdf.cfr_renamed_9("\u0000Gnl+N\"I:Mn{:I:Mo"));
        }
        return this.cfr_renamed_132.cfr_renamed_11590(arg0, arg1);
    }

    public void cfr_renamed_11591() {
        if (this.cfr_renamed_132 == null) {
            throw new sprurca(sprcaz.cfr_renamed_9("/tA_\u0004}\rz\u0015~AH\u0015z\u0015~@"));
        }
        this.cfr_renamed_132.cfr_renamed_41();
    }
}

