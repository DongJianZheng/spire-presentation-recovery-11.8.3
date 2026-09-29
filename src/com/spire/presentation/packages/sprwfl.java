/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralz;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprruk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprwcq;

public class sprwfl
extends sprruk {
    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, spralz.cfr_renamed_9("a\u0015C>J\u001c")).append(this.cfr_renamed_119).toString();
    }

    @Override
    public void cfr_renamed_3603() {
        if (this.cfr_renamed_2[12] == 0 && this.cfr_renamed_2[13] == 0) {
            throw new IllegalStateException(sprwcq.cfr_renamed_9("v+c:z/c\u007fc07-r;b<r\u007ft0b1c:e\u007fg>d+7%r-xq"));
        }
        this.cfr_renamed_2[12] = this.cfr_renamed_2[12] - 1;
        if (this.cfr_renamed_2[12] == -1) {
            this.cfr_renamed_2[13] = this.cfr_renamed_2[13] - 1;
        }
    }

    @Override
    public void cfr_renamed_3602() {
        this.cfr_renamed_2[12] = this.cfr_renamed_2[12] + 1;
        if (this.cfr_renamed_2[12] == 0) {
            this.cfr_renamed_2[13] = this.cfr_renamed_2[13] + 1;
        }
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void cfr_renamed_10346(long arg0) {
        sprwfl sprwfl2;
        int n = (int)(arg0 >>> 32);
        int n2 = (int)arg0;
        if (n != 0) {
            if (((long)this.cfr_renamed_2[13] & 0xFFFFFFFFL) < ((long)n & 0xFFFFFFFFL)) throw new IllegalStateException(spralz.cfr_renamed_9("C\tV\u0018O\rV]V\u0012\u0002\u000fG\u0019W\u001eG]A\u0012W\u0013V\u0018P]R\u001cQ\t\u0002\u0007G\u000fMS"));
            sprwfl sprwfl3 = this;
            sprwfl2 = sprwfl3;
            sprwfl3.cfr_renamed_2[13] = sprwfl3.cfr_renamed_2[13] - n;
        } else {
            sprwfl2 = this;
        }
        if (((long)sprwfl2.cfr_renamed_2[12] & 0xFFFFFFFFL) >= ((long)n2 & 0xFFFFFFFFL)) {
            this.cfr_renamed_2[12] = this.cfr_renamed_2[12] - n2;
            return;
        }
        if (this.cfr_renamed_2[13] == 0) throw new IllegalStateException(sprwcq.cfr_renamed_9("v+c:z/c\u007fc07-r;b<r\u007ft0b1c:e\u007fg>d+7%r-xq"));
        sprwfl sprwfl4 = this;
        sprwfl4.cfr_renamed_2[13] = sprwfl4.cfr_renamed_2[13] - 1;
        sprwfl4.cfr_renamed_2[12] = sprwfl4.cfr_renamed_2[12] - n2;
    }

    public sprwfl() {
    }

    @Override
    public void cfr_renamed_10345(long arg0) {
        int n = (int)(arg0 >>> 32);
        int n2 = (int)arg0;
        if (n > 0) {
            this.cfr_renamed_2[13] = this.cfr_renamed_2[13] + n;
        }
        sprwfl sprwfl2 = this;
        int n3 = sprwfl2.cfr_renamed_2[12];
        sprwfl2.cfr_renamed_2[12] = sprwfl2.cfr_renamed_2[12] + n2;
        if (n3 != 0 && this.cfr_renamed_2[12] < n3) {
            this.cfr_renamed_2[13] = this.cfr_renamed_2[13] + 1;
        }
    }

    @Override
    public void cfr_renamed_3606() {
        this.cfr_renamed_2[13] = 0;
        this.cfr_renamed_2[12] = 0;
    }

    public sprwfl(int arg0) {
        super(arg0);
    }

    @Override
    public long cfr_renamed_3374() {
        return (long)this.cfr_renamed_2[13] << 32 | (long)this.cfr_renamed_2[12] & 0xFFFFFFFFL;
    }

    public static void cfr_renamed_3698(int arg0, int[] arg1, int[] arg2) {
        int n;
        if (arg1.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg2.length != 16) {
            throw new IllegalArgumentException();
        }
        if (arg0 % 2 != 0) {
            throw new IllegalArgumentException(spralz.cfr_renamed_9("3W\u0010@\u0018P]M\u001b\u0002\u000fM\bL\u0019Q]O\bQ\t\u0002\u001fG]G\u000bG\u0013"));
        }
        int n2 = arg1[0];
        int n3 = arg1[1];
        int n4 = arg1[2];
        int n5 = arg1[3];
        int n6 = arg1[4];
        int n7 = arg1[5];
        int n8 = arg1[6];
        int n9 = arg1[7];
        int n10 = arg1[8];
        int n11 = arg1[9];
        int n12 = arg1[10];
        int n13 = arg1[11];
        int n14 = arg1[12];
        int n15 = arg1[13];
        int n16 = arg1[14];
        int n17 = arg1[15];
        int n18 = n = arg0;
        while (n18 > 0) {
            n14 = spruaf.cfr_renamed_494(n14 ^ (n2 += n6), 16);
            n6 = spruaf.cfr_renamed_494(n6 ^ (n10 += n14), 12);
            n14 = spruaf.cfr_renamed_494(n14 ^ (n2 += n6), 8);
            n6 = spruaf.cfr_renamed_494(n6 ^ (n10 += n14), 7);
            n15 = spruaf.cfr_renamed_494(n15 ^ (n3 += n7), 16);
            n7 = spruaf.cfr_renamed_494(n7 ^ (n11 += n15), 12);
            n15 = spruaf.cfr_renamed_494(n15 ^ (n3 += n7), 8);
            n7 = spruaf.cfr_renamed_494(n7 ^ (n11 += n15), 7);
            n16 = spruaf.cfr_renamed_494(n16 ^ (n4 += n8), 16);
            n8 = spruaf.cfr_renamed_494(n8 ^ (n12 += n16), 12);
            n16 = spruaf.cfr_renamed_494(n16 ^ (n4 += n8), 8);
            n8 = spruaf.cfr_renamed_494(n8 ^ (n12 += n16), 7);
            n17 = spruaf.cfr_renamed_494(n17 ^ (n5 += n9), 16);
            n9 = spruaf.cfr_renamed_494(n9 ^ (n13 += n17), 12);
            n17 = spruaf.cfr_renamed_494(n17 ^ (n5 += n9), 8);
            n9 = spruaf.cfr_renamed_494(n9 ^ (n13 += n17), 7);
            n17 = spruaf.cfr_renamed_494(n17 ^ (n2 += n7), 16);
            n7 = spruaf.cfr_renamed_494(n7 ^ (n12 += n17), 12);
            n17 = spruaf.cfr_renamed_494(n17 ^ (n2 += n7), 8);
            n7 = spruaf.cfr_renamed_494(n7 ^ (n12 += n17), 7);
            n14 = spruaf.cfr_renamed_494(n14 ^ (n3 += n8), 16);
            n8 = spruaf.cfr_renamed_494(n8 ^ (n13 += n14), 12);
            n14 = spruaf.cfr_renamed_494(n14 ^ (n3 += n8), 8);
            n8 = spruaf.cfr_renamed_494(n8 ^ (n13 += n14), 7);
            n15 = spruaf.cfr_renamed_494(n15 ^ (n4 += n9), 16);
            n9 = spruaf.cfr_renamed_494(n9 ^ (n10 += n15), 12);
            n15 = spruaf.cfr_renamed_494(n15 ^ (n4 += n9), 8);
            n9 = spruaf.cfr_renamed_494(n9 ^ (n10 += n15), 7);
            n16 = spruaf.cfr_renamed_494(n16 ^ (n5 += n6), 16);
            n6 = spruaf.cfr_renamed_494(n6 ^ (n11 += n16), 12);
            n16 = spruaf.cfr_renamed_494(n16 ^ (n5 += n6), 8);
            n6 = spruaf.cfr_renamed_494(n6 ^ (n11 += n16), 7);
            n18 = n -= 2;
        }
        arg2[0] = n2 + arg1[0];
        arg2[1] = n3 + arg1[1];
        arg2[2] = n4 + arg1[2];
        arg2[3] = n5 + arg1[3];
        arg2[4] = n6 + arg1[4];
        arg2[5] = n7 + arg1[5];
        arg2[6] = n8 + arg1[6];
        arg2[7] = n9 + arg1[7];
        arg2[8] = n10 + arg1[8];
        arg2[9] = n11 + arg1[9];
        arg2[10] = n12 + arg1[10];
        arg2[11] = n13 + arg1[11];
        arg2[12] = n14 + arg1[12];
        arg2[13] = n15 + arg1[13];
        arg2[14] = n16 + arg1[14];
        arg2[15] = n17 + arg1[15];
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_3604(byte[] byArray) {
        void arg0;
        sprwfl sprwfl2 = this;
        sprwfl sprwfl3 = this;
        sprwfl.cfr_renamed_3698(sprwfl2.cfr_renamed_119, sprwfl2.cfr_renamed_2, sprwfl3.cfr_renamed_152);
        sprpxe.cfr_renamed_449(sprwfl3.cfr_renamed_152, (byte[])arg0, 0);
    }

    @Override
    public void cfr_renamed_3471(byte[] arg0, byte[] arg1) {
        if (arg0 != null) {
            if (arg0.length != 16 && arg0.length != 32) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, this.cfr_renamed_1315()).append(sprwcq.cfr_renamed_9("7-r.b6e:d\u007f&m/\u007fu6c\u007fx-7m\"i7=~+74r&")).toString());
            }
            this.cfr_renamed_10347(arg0.length, this.cfr_renamed_2, 0);
            byte[] byArray = arg0;
            sprpxe.cfr_renamed_438(byArray, 0, this.cfr_renamed_2, 4, 4);
            sprpxe.cfr_renamed_438(byArray, arg0.length - 16, this.cfr_renamed_2, 8, 4);
        }
        sprpxe.cfr_renamed_438(arg1, 0, this.cfr_renamed_2, 14, 2);
    }
}

