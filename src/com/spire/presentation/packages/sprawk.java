/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjaa;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprzpj;

public class sprawk
extends sprirk {
    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl, IllegalStateException {
        int n = 0;
        sprawk sprawk2 = this;
        if (sprawk2.cfr_renamed_0 == sprawk2.cfr_renamed_91.length) {
            n = this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, arg1, arg2);
            this.cfr_renamed_0 = 0;
        }
        this.cfr_renamed_91[this.cfr_renamed_0++] = arg0;
        return n;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprzpj.cfr_renamed_9("+[\u0006\u001d\u001c\u001a\u0000[\u001e_H[HT\r]\tN\u0001L\r\u001a\u0001T\u0018O\u001c\u001a\u0004_\u0006]\u001cRI"));
        }
        sprawk sprawk2 = this;
        int n = sprawk2.cfr_renamed_1195();
        int n2 = sprawk2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprwjl(sprcjaa.cfr_renamed_9("L\u0017W\u0012V\u0016\u0003\u0000V\u0004E\u0007QBW\rLBP\nL\u0010W"));
        }
        int n3 = 0;
        int n4 = this.cfr_renamed_91.length - this.cfr_renamed_0;
        if (arg2 > n4) {
            sprawk sprawk3 = this;
            System.arraycopy(arg0, arg1, sprawk3.cfr_renamed_91, sprawk3.cfr_renamed_0, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, arg3, arg4);
            this.cfr_renamed_0 = 0;
            arg1 += n4;
            int n5 = arg2 -= n4;
            while (n5 > this.cfr_renamed_91.length) {
                n3 += this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1, arg3, arg4 + n3);
                arg1 += n;
                n5 = arg2 -= n;
            }
        }
        sprawk sprawk4 = this;
        System.arraycopy(arg0, arg1, sprawk4.cfr_renamed_91, sprawk4.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
        return n3;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_0;
        int n2 = n % this.cfr_renamed_91.length;
        if (n2 == 0) {
            if (this.cfr_renamed_119) {
                return n + this.cfr_renamed_91.length;
            }
            return n;
        }
        return n - n2 + this.cfr_renamed_91.length;
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

    /*
     * WARNING - void declaration
     */
    public sprawk(sprmr sprmr2) {
        void arg0;
        sprawk sprawk2 = this;
        this.cfr_renamed_2 = arg0;
        sprawk2.cfr_renamed_91 = new byte[this.cfr_renamed_2.cfr_renamed_1195()];
        sprawk2.cfr_renamed_0 = 0;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException, sprull {
        sprawk sprawk2;
        sprawk sprawk3 = this;
        int n = sprawk3.cfr_renamed_2.cfr_renamed_1195();
        int n2 = 0;
        if (sprawk3.cfr_renamed_119) {
            if (this.cfr_renamed_0 == n) {
                if (arg1 + 2 * n > arg0.length) {
                    throw new sprwjl(sprzpj.cfr_renamed_9("\u0007O\u001cJ\u001dNHX\u001d\\\u000e_\u001a\u001a\u001cU\u0007\u001a\u001bR\u0007H\u001c"));
                }
                sprawk sprawk4 = this;
                n2 = sprawk4.cfr_renamed_2.cfr_renamed_3064(sprawk4.cfr_renamed_91, 0, arg0, arg1);
                sprawk4.cfr_renamed_0 = 0;
            }
            byte by = (byte)(n - this.cfr_renamed_0);
            sprawk sprawk5 = this;
            while (sprawk5.cfr_renamed_0 < n) {
                sprawk sprawk6 = this;
                sprawk sprawk7 = this;
                sprawk5 = sprawk7;
                sprawk6.cfr_renamed_91[sprawk7.cfr_renamed_0] = by;
                ++sprawk6.cfr_renamed_0;
            }
            sprawk sprawk8 = this;
            n2 += sprawk8.cfr_renamed_2.cfr_renamed_3064(sprawk8.cfr_renamed_91, 0, arg0, arg1 + n2);
            sprawk2 = this;
        } else {
            if (this.cfr_renamed_0 != n) {
                throw new sprddl(sprcjaa.cfr_renamed_9("O\u0003P\u0016\u0003\u0000O\r@\t\u0003\u000bM\u0001L\u000fS\u000eF\u0016FBJ\f\u0003\u0006F\u0001Q\u001bS\u0016J\rM"));
            }
            sprawk sprawk9 = this;
            n2 = this.cfr_renamed_2.cfr_renamed_3064(sprawk9.cfr_renamed_91, 0, this.cfr_renamed_91, 0);
            this.cfr_renamed_0 = 0;
            int n3 = sprawk9.cfr_renamed_91[n - 1] & 0xFF;
            if (n3 > n) {
                throw new sprull(sprzpj.cfr_renamed_9("\u0018[\f\u001a\nV\u0007Y\u0003\u001a\u000bU\u001aH\u001dJ\u001c_\f"));
            }
            sprawk sprawk10 = this;
            sprawk2 = sprawk10;
            System.arraycopy(sprawk10.cfr_renamed_91, 0, arg0, arg1, n2 -= n3);
        }
        sprawk2.cfr_renamed_41();
        return n2;
    }
}

