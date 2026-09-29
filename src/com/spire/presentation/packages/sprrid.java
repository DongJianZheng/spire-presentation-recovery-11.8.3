/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdqd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprfvd;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprxdd;

public class sprrid
extends sprxdd {
    /*
     * WARNING - void declaration
     */
    public sprrid(sprff sprff2) {
        void arg0;
        sprrid sprrid2 = this;
        this.cfr_renamed_2 = arg0;
        sprrid2.cfr_renamed_4 = new byte[this.cfr_renamed_2.cfr_renamed_1195()];
        sprrid2.cfr_renamed_3 = 0;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprjkd, IllegalStateException, sprpjd {
        sprrid sprrid2;
        sprrid sprrid3 = this;
        int n = sprrid3.cfr_renamed_2.cfr_renamed_1195();
        int n2 = 0;
        if (sprrid3.cfr_renamed_91) {
            if (this.cfr_renamed_3 == n) {
                if (arg1 + 2 * n > arg0.length) {
                    throw new sprjkd(sprdqd.cfr_renamed_9("}xf}gy2ogkth`-fb}-ae}\u007ff"));
                }
                sprrid sprrid4 = this;
                n2 = sprrid4.cfr_renamed_2.cfr_renamed_3064(sprrid4.cfr_renamed_4, 0, arg0, arg1);
                sprrid4.cfr_renamed_3 = 0;
            }
            byte by = (byte)(n - this.cfr_renamed_3);
            sprrid sprrid5 = this;
            while (sprrid5.cfr_renamed_3 < n) {
                sprrid sprrid6 = this;
                sprrid sprrid7 = this;
                sprrid5 = sprrid7;
                sprrid6.cfr_renamed_4[sprrid7.cfr_renamed_3] = by;
                ++sprrid6.cfr_renamed_3;
            }
            sprrid sprrid8 = this;
            n2 += sprrid8.cfr_renamed_2.cfr_renamed_3064(sprrid8.cfr_renamed_4, 0, arg0, arg1 + n2);
            sprrid2 = this;
        } else {
            if (this.cfr_renamed_3 != n) {
                throw new sprjkd(sprfvd.cfr_renamed_9(".o1zbl.a!ebg,m-c2b'z'.+`bj'm0w2z+a,"));
            }
            sprrid sprrid9 = this;
            n2 = this.cfr_renamed_2.cfr_renamed_3064(sprrid9.cfr_renamed_4, 0, this.cfr_renamed_4, 0);
            this.cfr_renamed_3 = 0;
            int n3 = sprrid9.cfr_renamed_4[n - 1] & 0xFF;
            if (n3 < 0 || n3 > n) {
                throw new sprpjd(sprdqd.cfr_renamed_9("blv-pa}ny-qb`\u007fg}fhv"));
            }
            sprrid sprrid10 = this;
            sprrid2 = sprrid10;
            System.arraycopy(sprrid10.cfr_renamed_4, 0, arg0, arg1, n2 -= n3);
        }
        sprrid2.cfr_renamed_41();
        return n2;
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws sprjkd, IllegalStateException {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprfvd.cfr_renamed_9("\u0001o,)6.*o4kbob`'i#z+x'.+`2{6..k,i6fc"));
        }
        sprrid sprrid2 = this;
        int n = sprrid2.cfr_renamed_1195();
        int n2 = sprrid2.cfr_renamed_2345(arg2);
        if (n2 > 0 && arg4 + n2 > arg3.length) {
            throw new sprjkd(sprdqd.cfr_renamed_9("}xf}gy2ogkth`-fb}-ae}\u007ff"));
        }
        int n3 = 0;
        int n4 = this.cfr_renamed_4.length - this.cfr_renamed_3;
        if (arg2 > n4) {
            sprrid sprrid3 = this;
            System.arraycopy(arg0, arg1, sprrid3.cfr_renamed_4, sprrid3.cfr_renamed_3, n4);
            n3 += this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_4, 0, arg3, arg4);
            this.cfr_renamed_3 = 0;
            arg1 += n4;
            int n5 = arg2 -= n4;
            while (n5 > this.cfr_renamed_4.length) {
                n3 += this.cfr_renamed_2.cfr_renamed_3064(arg0, arg1, arg3, arg4 + n3);
                arg1 += n;
                n5 = arg2 -= n;
            }
        }
        sprrid sprrid4 = this;
        System.arraycopy(arg0, arg1, sprrid4.cfr_renamed_4, sprrid4.cfr_renamed_3, arg2);
        this.cfr_renamed_3 += arg2;
        return n3;
    }

    @Override
    public int cfr_renamed_2345(int arg0) {
        int n = arg0 + this.cfr_renamed_3;
        int n2 = n % this.cfr_renamed_4.length;
        if (n2 == 0) {
            return n - this.cfr_renamed_4.length;
        }
        return n - n2;
    }

    @Override
    public int cfr_renamed_1202(int arg0) {
        int n = arg0 + this.cfr_renamed_3;
        int n2 = n % this.cfr_renamed_4.length;
        if (n2 == 0) {
            if (this.cfr_renamed_91) {
                return n + this.cfr_renamed_4.length;
            }
            return n;
        }
        return n - n2 + this.cfr_renamed_4.length;
    }

    @Override
    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) throws sprjkd, IllegalStateException {
        int n = 0;
        sprrid sprrid2 = this;
        if (sprrid2.cfr_renamed_3 == sprrid2.cfr_renamed_4.length) {
            n = this.cfr_renamed_2.cfr_renamed_3064(this.cfr_renamed_4, 0, arg1, arg2);
            this.cfr_renamed_3 = 0;
        }
        this.cfr_renamed_4[this.cfr_renamed_3++] = arg0;
        return n;
    }
}

