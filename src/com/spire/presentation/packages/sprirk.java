/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcw;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtig;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvkba;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;

@sprtea
public class sprirk {
    public boolean cfr_renamed_119;
    public byte[] cfr_renamed_91;
    public int cfr_renamed_0;
    public boolean cfr_renamed_1;
    public sprmr cfr_renamed_2;
    public boolean cfr_renamed_3;
    public sprcw cfr_renamed_4;

    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprtig.cfr_renamed_9("F\"kdqcm\"s&%\"%-`$d7l5`cl-u6qci&k$q+$"));
        }
        sprirk sprirk2 = this;
        int n = sprirk2.cfr_renamed_1195();
        int n2 = sprirk2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprwjl(sprvkba.cfr_renamed_9("eG~B\u007fF*P\u007fTlWx\u0012~]e\u0012yZe@~"));
        }
        int n3 = 0;
        int n4 = this.cfr_renamed_91.length - this.cfr_renamed_0;
        if (arg2 > n4) {
            sprirk sprirk3 = this;
            System.arraycopy(arg0, arg1, sprirk3.cfr_renamed_91, sprirk3.cfr_renamed_0, n4);
            sprirk sprirk4 = this;
            n3 += this.cfr_renamed_2.cfr_renamed_3064(sprirk4.cfr_renamed_91, 0, arg3, arg4);
            this.cfr_renamed_0 = 0;
            arg2 -= n4;
            arg1 += n4;
            if (sprirk4.cfr_renamed_4 != null) {
                int n5 = arg2 / this.cfr_renamed_4.cfr_renamed_10005();
                if (n5 > 0) {
                    n3 += this.cfr_renamed_4.cfr_renamed_10004(arg0, arg1, n5, arg3, arg4 + n3);
                    int n6 = n5 * this.cfr_renamed_4.cfr_renamed_10005();
                    arg2 -= n6;
                    arg1 += n6;
                }
            } else {
                int n7 = arg2;
                while (n7 > this.cfr_renamed_91.length) {
                    n3 += this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1, arg3, arg4 + n3);
                    arg1 += n;
                    n7 = arg2 -= n;
                }
            }
        }
        sprirk sprirk5 = this;
        System.arraycopy(arg0, arg1, sprirk5.cfr_renamed_91, sprirk5.cfr_renamed_0, arg2);
        sprirk sprirk6 = this;
        sprirk6.cfr_renamed_0 += arg2;
        if (sprirk6.cfr_renamed_0 == this.cfr_renamed_91.length) {
            sprirk sprirk7 = this;
            n3 += sprirk7.cfr_renamed_2.cfr_renamed_3064(sprirk7.cfr_renamed_91, 0, arg3, arg4 + n3);
            this.cfr_renamed_0 = 0;
        }
        return n3;
    }

    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_91.length) {
            this.cfr_renamed_91[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_0 = 0;
        this.cfr_renamed_2.cfr_renamed_41();
    }

    public sprirk() {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException, sprull {
        try {
            int n = 0;
            if (arg1 + this.cfr_renamed_0 > arg0.length) {
                throw new sprwjl(sprtig.cfr_renamed_9("j6q3p7%!p%c&wcq,jcv+j1qcc,wca,C*k\"ik,"));
            }
            if (this.cfr_renamed_0 != 0) {
                if (!this.cfr_renamed_3) {
                    throw new sprddl(sprvkba.cfr_renamed_9("nS~S*\\eF*Pf]iY*AcHo\u0012k^cUdWn"));
                }
                sprirk sprirk2 = this;
                sprirk2.cfr_renamed_2.cfr_renamed_3064(sprirk2.cfr_renamed_91, 0, this.cfr_renamed_91, 0);
                sprirk sprirk3 = this;
                n = sprirk3.cfr_renamed_0;
                sprirk3.cfr_renamed_0 = 0;
                System.arraycopy(sprirk3.cfr_renamed_91, 0, arg0, arg1, n);
            }
            int n2 = n;
            return n2;
        }
        finally {
            this.cfr_renamed_41();
        }
    }

    public void cfr_renamed_5535(boolean arg0, sprbj arg1) throws IllegalArgumentException {
        sprirk sprirk2 = this;
        sprirk2.cfr_renamed_119 = arg0;
        sprirk2.cfr_renamed_41();
        sprirk2.cfr_renamed_2.cfr_renamed_5535(arg0, arg1);
    }

    public int cfr_renamed_2345(int arg0) {
        int n;
        int n2;
        int n3 = arg0 + this.cfr_renamed_0;
        if (this.cfr_renamed_1) {
            if (this.cfr_renamed_119) {
                n2 = n3 % this.cfr_renamed_91.length - (this.cfr_renamed_2.cfr_renamed_1195() + 2);
                n = n3;
            } else {
                n2 = n3 % this.cfr_renamed_91.length;
                n = n3;
            }
        } else {
            n2 = n3 % this.cfr_renamed_91.length;
            n = n3;
        }
        return n - n2;
    }

    public sprmr cfr_renamed_2349() {
        return this.cfr_renamed_2;
    }

    public sprirk(sprmr arg0) {
        sprirk sprirk2;
        this.cfr_renamed_2 = arg0;
        if (this.cfr_renamed_2 instanceof sprcw) {
            this.cfr_renamed_4 = (sprcw)arg0;
            sprirk sprirk3 = this;
            sprirk2 = sprirk3;
            sprirk3.cfr_renamed_91 = new byte[sprirk3.cfr_renamed_4.cfr_renamed_10005()];
        } else {
            sprirk2 = this;
            sprirk sprirk4 = this;
            sprirk4.cfr_renamed_4 = null;
            sprirk4.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        }
        sprirk2.cfr_renamed_0 = 0;
        String string = arg0.cfr_renamed_1315();
        int n = string.indexOf(47) + 1;
        boolean bl = this.cfr_renamed_1 = n > 0 && string.startsWith(sprtig.cfr_renamed_9("U\u0004U"), n);
        if (this.cfr_renamed_1 || arg0 instanceof sprvv) {
            this.cfr_renamed_3 = true;
            return;
        }
        this.cfr_renamed_3 = n > 0 && string.startsWith(sprvkba.cfr_renamed_9("EBo\\ZuZ"), n);
    }

    public int cfr_renamed_1202(int arg0) {
        if (this.cfr_renamed_1 && this.cfr_renamed_119) {
            return arg0 + this.cfr_renamed_0 + (this.cfr_renamed_2.cfr_renamed_1195() + 2);
        }
        return arg0 + this.cfr_renamed_0;
    }

    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl, IllegalStateException {
        int n = 0;
        this.cfr_renamed_91[this.cfr_renamed_0++] = arg0;
        sprirk sprirk2 = this;
        if (sprirk2.cfr_renamed_0 == sprirk2.cfr_renamed_91.length) {
            n = this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, arg1, arg2);
            this.cfr_renamed_0 = 0;
        }
        return n;
    }

    public int cfr_renamed_1195() {
        return this.cfr_renamed_2.cfr_renamed_1195();
    }
}

