/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprklg;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprukaa;

public class sprwld
implements spruc {
    public int cfr_renamed_93;
    public long cfr_renamed_86;
    public long cfr_renamed_152;
    public int cfr_renamed_112;
    public long cfr_renamed_119;
    public long cfr_renamed_91;
    public long cfr_renamed_0;
    public long cfr_renamed_1;
    public final int cfr_renamed_2;
    public long cfr_renamed_3;
    public final int cfr_renamed_4;

    @Override
    public void cfr_renamed_1524(sprt arg0) throws IllegalArgumentException {
        if (!(arg0 instanceof sprnld)) {
            throw new IllegalArgumentException(sprukaa.cfr_renamed_9("oc)a)~;4h~=`<3*vhr&3!};g)}+vh|.3\u0003v1C)a)~-g-a"));
        }
        byte[] byArray = ((sprnld)arg0).cfr_renamed_1521();
        if (byArray.length != 16) {
            throw new IllegalArgumentException(sprklg.cfr_renamed_9("\u001bb]`]\u007fO5\u001c\u007fIaH2^w\u001cs\u001c#\u000e*\u0011pUf\u001cyYk"));
        }
        sprwld sprwld2 = this;
        sprwld2.cfr_renamed_119 = sprtsa.cfr_renamed_443(byArray, 0);
        sprwld2.cfr_renamed_152 = sprtsa.cfr_renamed_443(byArray, 8);
        this.cfr_renamed_41();
    }

    public static long cfr_renamed_3467(long arg0, int arg1) {
        return arg0 << arg1 | arg0 >>> -arg1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_1219(byte[] byArray, int n) throws sprjkd, IllegalStateException {
        void arg1;
        void arg0;
        sprtsa.cfr_renamed_444(this.cfr_renamed_1206(), (byte[])arg0, (int)arg1);
        return 8;
    }

    public sprwld() {
        sprwld sprwld2 = this;
        sprwld sprwld3 = this;
        this.cfr_renamed_3 = 0L;
        sprwld3.cfr_renamed_93 = 0;
        sprwld3.cfr_renamed_112 = 0;
        sprwld2.cfr_renamed_2 = 2;
        sprwld2.cfr_renamed_4 = 4;
    }

    public void cfr_renamed_3468(int arg0) {
        int n;
        sprwld sprwld2 = this;
        long l = sprwld2.cfr_renamed_0;
        long l2 = sprwld2.cfr_renamed_1;
        long l3 = sprwld2.cfr_renamed_86;
        long l4 = sprwld2.cfr_renamed_91;
        int n2 = n = 0;
        while (n2 < arg0) {
            l += l2;
            l3 += l4;
            l2 = sprwld.cfr_renamed_3467(l2, 13);
            l4 = sprwld.cfr_renamed_3467(l4, 16);
            l2 ^= l;
            l4 ^= l3;
            l = sprwld.cfr_renamed_3467(l, 32);
            l3 += l2;
            l += l4;
            l2 = sprwld.cfr_renamed_3467(l2, 17);
            l4 = sprwld.cfr_renamed_3467(l4, 21);
            l2 ^= l3;
            l4 ^= l;
            l3 = sprwld.cfr_renamed_3467(l3, 32);
            n2 = ++n;
        }
        sprwld sprwld3 = this;
        this.cfr_renamed_0 = l;
        sprwld3.cfr_renamed_1 = l2;
        sprwld3.cfr_renamed_86 = l3;
        this.cfr_renamed_91 = l4;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        sprwld sprwld2 = this;
        sprwld2.cfr_renamed_3 >>>= 8;
        sprwld2.cfr_renamed_3 |= ((long)arg0 & 0xFFL) << 56;
        if (++sprwld2.cfr_renamed_93 == 8) {
            this.cfr_renamed_3469();
            this.cfr_renamed_93 = 0;
        }
    }

    public void cfr_renamed_3469() {
        sprwld sprwld2 = this;
        ++sprwld2.cfr_renamed_112;
        sprwld2.cfr_renamed_91 ^= this.cfr_renamed_3;
        sprwld2.cfr_renamed_3468(sprwld2.cfr_renamed_2);
        sprwld2.cfr_renamed_0 ^= this.cfr_renamed_3;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalStateException {
        int n = 0;
        int n2 = arg2 & 0xFFFFFFF8;
        if (this.cfr_renamed_93 == 0) {
            int n3 = n;
            while (n3 < n2) {
                int n4 = arg1 + n;
                this.cfr_renamed_3 = sprtsa.cfr_renamed_443(arg0, n4);
                this.cfr_renamed_3469();
                n3 = n += 8;
            }
            int n5 = n;
            while (n5 < arg2) {
                sprwld sprwld2 = this;
                sprwld2.cfr_renamed_3 >>>= 8;
                long l = (long)arg0[arg1 + n] & 0xFFL;
                sprwld2.cfr_renamed_3 |= l << 56;
                n5 = ++n;
            }
            this.cfr_renamed_93 = arg2 - n2;
            return;
        }
        int n6 = this.cfr_renamed_93 << 3;
        int n7 = n;
        while (n7 < n2) {
            long l = sprtsa.cfr_renamed_443(arg0, arg1 + n);
            this.cfr_renamed_3 = l << n6 | this.cfr_renamed_3 >>> -n6;
            this.cfr_renamed_3469();
            this.cfr_renamed_3 = l;
            n7 = n += 8;
        }
        int n8 = n;
        while (n8 < arg2) {
            sprwld sprwld3 = this;
            sprwld3.cfr_renamed_3 >>>= 8;
            sprwld3.cfr_renamed_3 |= ((long)arg0[arg1 + n] & 0xFFL) << 56;
            if (++sprwld3.cfr_renamed_93 == 8) {
                this.cfr_renamed_3469();
                this.cfr_renamed_93 = 0;
            }
            n8 = ++n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprukaa.cfr_renamed_9("\u001bz8[)` >")).append(this.cfr_renamed_2).append("-").append(this.cfr_renamed_4).toString();
    }

    @Override
    public int cfr_renamed_2404() {
        return 8;
    }

    /*
     * WARNING - void declaration
     */
    public sprwld(int n, int n2) {
        void arg0;
        sprwld sprwld2 = this;
        sprwld sprwld3 = this;
        this.cfr_renamed_3 = 0L;
        sprwld3.cfr_renamed_93 = 0;
        sprwld3.cfr_renamed_112 = 0;
        sprwld2.cfr_renamed_2 = arg0;
        sprwld2.cfr_renamed_4 = n2;
    }

    public long cfr_renamed_1206() throws sprjkd, IllegalStateException {
        sprwld sprwld2 = this;
        sprwld2.cfr_renamed_3 >>>= 7 - this.cfr_renamed_93 << 3;
        sprwld2.cfr_renamed_3 >>>= 8;
        sprwld2.cfr_renamed_3 |= ((long)((this.cfr_renamed_112 << 3) + this.cfr_renamed_93) & 0xFFL) << 56;
        sprwld2.cfr_renamed_3469();
        sprwld2.cfr_renamed_86 ^= 0xFFL;
        sprwld2.cfr_renamed_3468(sprwld2.cfr_renamed_4);
        long l = sprwld2.cfr_renamed_0 ^ this.cfr_renamed_1 ^ this.cfr_renamed_86 ^ this.cfr_renamed_91;
        sprwld2.cfr_renamed_41();
        return l;
    }

    @Override
    public void cfr_renamed_41() {
        sprwld sprwld2 = this;
        sprwld sprwld3 = this;
        sprwld sprwld4 = this;
        sprwld4.cfr_renamed_0 = sprwld4.cfr_renamed_119 ^ 0x736F6D6570736575L;
        sprwld4.cfr_renamed_1 = sprwld4.cfr_renamed_152 ^ 0x646F72616E646F6DL;
        sprwld4.cfr_renamed_86 = sprwld4.cfr_renamed_119 ^ 0x6C7967656E657261L;
        sprwld3.cfr_renamed_91 = sprwld4.cfr_renamed_152 ^ 0x7465646279746573L;
        sprwld3.cfr_renamed_3 = 0L;
        sprwld2.cfr_renamed_93 = 0;
        sprwld2.cfr_renamed_112 = 0;
    }
}

