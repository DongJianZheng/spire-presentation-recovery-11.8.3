/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwk;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.spretk;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprquq;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.spryio;

public class sprrxk
extends sprirk {
    private int cfr_renamed_4;

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(spryio.cfr_renamed_9("0B\u001d\u0004\u0007\u0003\u001bB\u0005FSBSM\u0016D\u0012W\u001aU\u0016\u0003\u001aM\u0003V\u0007\u0003\u001fF\u001dD\u0007KR"));
        }
        sprrxk sprrxk2 = this;
        int n = sprrxk2.cfr_renamed_1195();
        int n2 = sprrxk2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprwjl(sprquq.cfr_renamed_9("tiolnh;~nz}yi<ost<httno"));
        }
        int n3 = 0;
        int n4 = this.cfr_renamed_91.length - this.cfr_renamed_0;
        if (arg2 > n4) {
            sprrxk sprrxk3 = this;
            System.arraycopy(arg0, arg1, sprrxk3.cfr_renamed_91, sprrxk3.cfr_renamed_0, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, arg3, arg4);
            int n5 = n;
            System.arraycopy(this.cfr_renamed_91, n5, this.cfr_renamed_91, 0, n);
            this.cfr_renamed_0 = n5;
            arg1 += n4;
            int n6 = arg2 -= n4;
            while (n6 > n) {
                sprrxk sprrxk4 = this;
                System.arraycopy(arg0, arg1, sprrxk4.cfr_renamed_91, sprrxk4.cfr_renamed_0, n);
                sprrxk sprrxk5 = this;
                n3 += this.cfr_renamed_2.cfr_renamed_3064(sprrxk5.cfr_renamed_91, 0, arg3, arg4 + n3);
                int n7 = n;
                System.arraycopy(sprrxk5.cfr_renamed_91, n7, this.cfr_renamed_91, 0, n7);
                arg1 += n;
                n6 = arg2 -= n;
            }
        }
        sprrxk sprrxk6 = this;
        System.arraycopy(arg0, arg1, sprrxk6.cfr_renamed_91, sprrxk6.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
        return n3;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        return arg0 + this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprrxk(sprmr sprmr2) {
        void arg0;
        if (sprmr2 instanceof sprbwk || arg0 instanceof spretk) {
            throw new IllegalArgumentException(spryio.cfr_renamed_9("`\u0007P1O\u001c@\u0018`\u001aS\u001bF\u0001\u0003\u0010B\u001d\u0003\u001cM\u001fZSB\u0010@\u0016S\u0007\u00036`1\u000fSL\u0001\u00030a0\u0003\u0010J\u0003K\u0016Q\u0000"));
        }
        sprrxk sprrxk2 = this;
        this.cfr_renamed_2 = arg0;
        sprrxk2.cfr_renamed_4 = arg0.cfr_renamed_1195();
        sprrxk2.cfr_renamed_91 = new byte[this.cfr_renamed_4 * 2];
        this.cfr_renamed_0 = 0;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_0;
        int n2 = n % this.cfr_renamed_91.length;
        if (n2 == 0) {
            return n - this.cfr_renamed_91.length;
        }
        return n - n2;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl, IllegalStateException {
        int n = 0;
        sprrxk sprrxk2 = this;
        if (sprrxk2.cfr_renamed_0 == sprrxk2.cfr_renamed_91.length) {
            sprrxk sprrxk3 = this;
            sprrxk sprrxk4 = this;
            n = sprrxk3.cfr_renamed_2.cfr_renamed_3064(sprrxk4.cfr_renamed_91, 0, arg1, arg2);
            sprrxk sprrxk5 = this;
            System.arraycopy(sprrxk3.cfr_renamed_91, sprrxk5.cfr_renamed_4, sprrxk5.cfr_renamed_91, 0, this.cfr_renamed_4);
            sprrxk3.cfr_renamed_0 = sprrxk4.cfr_renamed_4;
        }
        this.cfr_renamed_91[this.cfr_renamed_0++] = arg0;
        return n;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException, sprull {
        sprrxk sprrxk2;
        if (this.cfr_renamed_0 + arg1 > arg0.length) {
            throw new sprwjl(sprquq.cfr_renamed_9("tiolnh;~nz}yi<os;ov}wp;uu<\u007fs]uu}w"));
        }
        sprrxk sprrxk3 = this;
        int n = sprrxk3.cfr_renamed_2.cfr_renamed_1195();
        int n2 = sprrxk3.cfr_renamed_0 - n;
        byte[] byArray = new byte[n];
        if (sprrxk3.cfr_renamed_119) {
            byte[] byArray2;
            int n3;
            sprrxk sprrxk4 = this;
            this.cfr_renamed_2.cfr_renamed_3064(sprrxk4.cfr_renamed_91, 0, byArray, 0);
            if (sprrxk4.cfr_renamed_0 < n) {
                throw new sprddl(spryio.cfr_renamed_9("M\u0016F\u0017\u0003\u0012WSO\u0016B\u0000WSL\u001dFSA\u001fL\u0010HSL\u0015\u0003\u001aM\u0003V\u0007\u0003\u0015L\u0001\u00030w "));
            }
            int n4 = n3 = this.cfr_renamed_0;
            while (n4 != this.cfr_renamed_91.length) {
                int n5 = n3++;
                this.cfr_renamed_91[n5] = byArray[n5 - n];
                n4 = n3;
            }
            int n6 = n3 = n;
            while (n6 != this.cfr_renamed_0) {
                int n7 = n3;
                byte by = (byte)(this.cfr_renamed_91[n7] ^ byArray[n3 - n]);
                this.cfr_renamed_91[n7] = by;
                n6 = ++n3;
            }
            sprrxk sprrxk5 = this;
            if (this.cfr_renamed_2 instanceof sprhqk) {
                sprmr sprmr2 = ((sprhqk)sprrxk5.cfr_renamed_2).cfr_renamed_2349();
                byArray2 = byArray;
                sprmr2.cfr_renamed_3064(this.cfr_renamed_91, n, arg0, arg1);
            } else {
                sprrxk5.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, n, arg0, arg1);
                byArray2 = byArray;
            }
            System.arraycopy(byArray2, 0, arg0, arg1 + n, n2);
            sprrxk2 = this;
        } else {
            int n8;
            int n9;
            byte[] byArray3 = new byte[n];
            sprrxk sprrxk6 = this;
            if (this.cfr_renamed_2 instanceof sprhqk) {
                sprmr sprmr3 = ((sprhqk)sprrxk6.cfr_renamed_2).cfr_renamed_2349();
                n9 = n;
                sprmr3.cfr_renamed_3064(this.cfr_renamed_91, 0, byArray, 0);
            } else {
                sprrxk6.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, byArray, 0);
                n9 = n;
            }
            int n10 = n8 = n9;
            while (n10 != this.cfr_renamed_0) {
                int n11 = n8 - n;
                byte by = (byte)(byArray[n8 - n] ^ this.cfr_renamed_91[n8]);
                byArray3[n11] = by;
                n10 = ++n8;
            }
            sprrxk sprrxk7 = this;
            sprrxk2 = sprrxk7;
            System.arraycopy(sprrxk7.cfr_renamed_91, n, byArray, 0, n2);
            sprrxk7.cfr_renamed_2.cfr_renamed_3064(byArray, 0, arg0, arg1);
            System.arraycopy(byArray3, 0, arg0, arg1 + n, n2);
        }
        int n12 = sprrxk2.cfr_renamed_0;
        this.cfr_renamed_41();
        return n12;
    }
}

