/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcs;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprndo;
import com.spire.presentation.packages.sprpug;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprxyk;

public class sprgrk
extends sprirk {
    public sprcs cfr_renamed_4;

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_0;
        int n2 = n % this.cfr_renamed_91.length;
        if (n2 == 0) {
            return Math.max(0, n - this.cfr_renamed_91.length);
        }
        return n - n2;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprddl, IllegalStateException {
        int n = 0;
        sprgrk sprgrk2 = this;
        if (sprgrk2.cfr_renamed_0 == sprgrk2.cfr_renamed_91.length) {
            n = this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, arg1, arg2);
            this.cfr_renamed_0 = 0;
        }
        this.cfr_renamed_91[this.cfr_renamed_0++] = arg0;
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprgrk(sprmr sprmr2, sprcs sprcs2) {
        void arg1;
        void arg0;
        sprgrk sprgrk2 = this;
        sprgrk sprgrk3 = this;
        sprgrk3.cfr_renamed_2 = arg0;
        sprgrk3.cfr_renamed_4 = arg1;
        sprgrk2.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        sprgrk2.cfr_renamed_0 = 0;
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

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) throws IllegalArgumentException {
        void arg1;
        void arg0;
        this.cfr_renamed_119 = arg0;
        this.cfr_renamed_41();
        if (sprbj2 instanceof sprbgk) {
            sprbgk sprbgk2 = (sprbgk)arg1;
            sprgrk sprgrk2 = this;
            sprgrk2.cfr_renamed_4.cfr_renamed_3251(sprbgk2.cfr_renamed_1295());
            sprgrk2.cfr_renamed_2.cfr_renamed_5535((boolean)arg0, sprbgk2.cfr_renamed_284());
            return;
        }
        sprgrk sprgrk3 = this;
        sprgrk3.cfr_renamed_4.cfr_renamed_3251(null);
        sprgrk3.cfr_renamed_2.cfr_renamed_5535((boolean)arg0, (sprbj)arg1);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprddl, IllegalStateException, sprull {
        sprgrk sprgrk2 = this;
        int n = sprgrk2.cfr_renamed_2.cfr_renamed_1195();
        int n2 = 0;
        if (sprgrk2.cfr_renamed_119) {
            if (this.cfr_renamed_0 == n) {
                if (arg1 + 2 * n > arg0.length) {
                    this.cfr_renamed_41();
                    throw new sprwjl(sprpug.cfr_renamed_9("wMlHmL8Zm^~]j\u0018lWw\u0018kPwJl"));
                }
                sprgrk sprgrk3 = this;
                n2 = sprgrk3.cfr_renamed_2.cfr_renamed_3064(sprgrk3.cfr_renamed_91, 0, arg0, arg1);
                sprgrk3.cfr_renamed_0 = 0;
            }
            sprgrk sprgrk4 = this;
            sprgrk4.cfr_renamed_4.cfr_renamed_3210(sprgrk4.cfr_renamed_91, this.cfr_renamed_0);
            sprgrk sprgrk5 = this;
            n2 += sprgrk5.cfr_renamed_2.cfr_renamed_3064(sprgrk5.cfr_renamed_91, 0, arg0, arg1 + n2);
            this.cfr_renamed_41();
            return n2;
        }
        if (this.cfr_renamed_0 != n) {
            this.cfr_renamed_41();
            throw new sprddl(sprndo.cfr_renamed_9("M\u0007R\u0012\u0001\u0004M\tB\r\u0001\u000fO\u0005N\u000bQ\nD\u0012DFH\b\u0001\u0002D\u0005S\u001fQ\u0012H\tO"));
        }
        n2 = this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_91, 0, this.cfr_renamed_91, 0);
        this.cfr_renamed_0 = 0;
        {
            sprgrk sprgrk6 = this;
            System.arraycopy(this.cfr_renamed_91, 0, arg0, arg1, n2 -= sprgrk6.cfr_renamed_4.cfr_renamed_3236(sprgrk6.cfr_renamed_91));
        }
        this.cfr_renamed_41();
        return n2;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprddl, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprpug.cfr_renamed_9("[Yv\u001fl\u0018pYn]8Y8V}_yLqN}\u0018qVhMl\u0018t]v_lP9"));
        }
        sprgrk sprgrk2 = this;
        int n = sprgrk2.cfr_renamed_1195();
        int n2 = sprgrk2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprwjl(sprndo.cfr_renamed_9("N\u0013U\u0016T\u0012\u0001\u0004T\u0000G\u0003SFU\tNFR\u000eN\u0014U"));
        }
        int n3 = 0;
        int n4 = this.cfr_renamed_91.length - this.cfr_renamed_0;
        if (arg2 > n4) {
            sprgrk sprgrk3 = this;
            System.arraycopy(arg0, arg1, sprgrk3.cfr_renamed_91, sprgrk3.cfr_renamed_0, n4);
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
        sprgrk sprgrk4 = this;
        System.arraycopy(arg0, arg1, sprgrk4.cfr_renamed_91, sprgrk4.cfr_renamed_0, arg2);
        this.cfr_renamed_0 += arg2;
        return n3;
    }

    public sprgrk(sprmr arg0) {
        this(arg0, new sprxyk());
    }
}

