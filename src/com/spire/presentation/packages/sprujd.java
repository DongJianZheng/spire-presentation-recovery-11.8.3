/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprild;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprnnp;
import com.spire.presentation.packages.sprrtea;
import com.spire.presentation.packages.sprt;

public class sprujd
implements sprff {
    private boolean cfr_renamed_0;
    private int cfr_renamed_1;
    private int[] cfr_renamed_2;
    private static final int cfr_renamed_3 = -1640531527;
    private static final int cfr_renamed_4 = -1209970333;

    private /* synthetic */ int cfr_renamed_3562(byte[] arg0, int arg1) {
        return arg0[arg1] & 0xFF | (arg0[arg1 + 1] & 0xFF) << 8 | (arg0[arg1 + 2] & 0xFF) << 16 | (arg0[arg1 + 3] & 0xFF) << 24;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3393(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        sprujd sprujd2 = this;
        int n4 = this.cfr_renamed_3562(byArray, n) + sprujd2.cfr_renamed_2[0];
        int n5 = sprujd2.cfr_renamed_3562(byArray, (int)(arg1 + 4)) + this.cfr_renamed_2[1];
        int n6 = n3 = 1;
        while (n6 <= this.cfr_renamed_1) {
            sprujd sprujd3 = this;
            n4 = this.cfr_renamed_494(n4 ^ n5, n5) + sprujd3.cfr_renamed_2[2 * n3];
            int n7 = 2 * n3 + 1;
            n5 = sprujd3.cfr_renamed_494(n5 ^ n4, n4) + this.cfr_renamed_2[n7];
            n6 = ++n3;
        }
        this.cfr_renamed_3582(n4, (byte[])arg2, (int)arg3);
        this.cfr_renamed_3582(n5, (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    @Override
    public void cfr_renamed_41() {
    }

    private /* synthetic */ void cfr_renamed_2402(byte[] arg0) {
        int n;
        int n2;
        int[] nArray = new int[(arg0.length + 3) / 4];
        int n3 = n2 = 0;
        while (n3 != arg0.length) {
            int n4 = n2 / 4;
            int n5 = nArray[n4] + ((arg0[n2] & 0xFF) << 8 * (n2 % 4));
            nArray[n4] = n5;
            n3 = ++n2;
        }
        this.cfr_renamed_2 = new int[2 * (this.cfr_renamed_1 + 1)];
        this.cfr_renamed_2[0] = -1209970333;
        int n6 = n2 = 1;
        while (n6 < this.cfr_renamed_2.length) {
            sprujd sprujd2 = this;
            int n7 = n2++;
            sprujd2.cfr_renamed_2[n7] = sprujd2.cfr_renamed_2[n7 - 1] + -1640531527;
            n6 = n2;
        }
        n2 = nArray.length > this.cfr_renamed_2.length ? 3 * nArray.length : 3 * this.cfr_renamed_2.length;
        int n8 = 0;
        int n9 = 0;
        int n10 = 0;
        int n11 = 0;
        int n12 = n = 0;
        while (n12 < n2) {
            sprujd sprujd3 = this;
            int n13 = n10;
            int n14 = sprujd3.cfr_renamed_494(sprujd3.cfr_renamed_2[n13] + n8 + n9, 3);
            this.cfr_renamed_2[n13] = n14;
            n8 = n14;
            n9 = nArray[n11] = this.cfr_renamed_494(nArray[n11] + n8 + n9, n8 + n9);
            n10 = (n10 + 1) % this.cfr_renamed_2.length;
            n11 = (n11 + 1) % nArray.length;
            n12 = ++n;
        }
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        sprujd sprujd2;
        if (arg1 instanceof sprild) {
            sprild sprild2 = (sprild)arg1;
            sprujd sprujd3 = this;
            sprujd2 = sprujd3;
            sprujd3.cfr_renamed_1 = sprild2.cfr_renamed_3343();
            sprujd3.cfr_renamed_2402(sprild2.cfr_renamed_1521());
        } else if (arg1 instanceof sprnld) {
            sprnld sprnld2 = (sprnld)arg1;
            sprujd sprujd4 = this;
            sprujd2 = sprujd4;
            sprujd4.cfr_renamed_2402(sprnld2.cfr_renamed_1521());
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprnnp.cfr_renamed_9("!0>?$7,~8?:?%;<;:~8?;--:h*'~\u001a\u001d}mz~!0!*hsh")).append(arg1.getClass().getName()).toString());
        }
        sprujd2.cfr_renamed_0 = arg0;
    }

    @Override
    public int cfr_renamed_1195() {
        return 8;
    }

    private /* synthetic */ int cfr_renamed_494(int arg0, int arg1) {
        return arg0 << (arg1 & 0x1F) | arg0 >>> 32 - (arg1 & 0x1F);
    }

    @Override
    public String cfr_renamed_1315() {
        return sprrtea.cfr_renamed_9("\u001bn|\u0000z\u001f");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3582(int n, byte[] byArray, int n2) {
        void arg0;
        void arg2;
        void arg1;
        void v0 = arg1;
        void v1 = arg2;
        arg1[arg2] = (byte)arg0;
        arg1[v1 + true] = (byte)(arg0 >> 8);
        v0[v1 + 2] = (byte)(arg0 >> 16);
        v0[n2 + 3] = (byte)(arg0 >> 24);
    }

    @Override
    public int cfr_renamed_3064(byte[] arg0, int arg1, byte[] arg2, int arg3) {
        if (this.cfr_renamed_0) {
            return this.cfr_renamed_3393(arg0, arg1, arg2, arg3);
        }
        return this.cfr_renamed_3396(arg0, arg1, arg2, arg3);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ int cfr_renamed_3396(byte[] byArray, int n, byte[] byArray2, int n2) {
        void arg3;
        void arg2;
        int n3;
        void arg1;
        void arg0;
        sprujd sprujd2 = this;
        int n4 = sprujd2.cfr_renamed_3562((byte[])arg0, (int)arg1);
        int n5 = sprujd2.cfr_renamed_3562(byArray, (int)(arg1 + 4));
        int n6 = n3 = sprujd2.cfr_renamed_1;
        while (n6 >= 1) {
            sprujd sprujd3 = this;
            n5 = sprujd3.cfr_renamed_493(n5 - sprujd3.cfr_renamed_2[2 * n3 + 1], n4) ^ n4;
            int n7 = sprujd3.cfr_renamed_493(n4 - this.cfr_renamed_2[2 * n3], n5);
            n4 = n7 ^ n5;
            n6 = --n3;
        }
        sprujd sprujd4 = this;
        sprujd4.cfr_renamed_3582(n4 - sprujd4.cfr_renamed_2[0], (byte[])arg2, (int)arg3);
        this.cfr_renamed_3582(n5 - this.cfr_renamed_2[1], (byte[])arg2, (int)(arg3 + 4));
        return 8;
    }

    private /* synthetic */ int cfr_renamed_493(int arg0, int arg1) {
        return arg0 >>> (arg1 & 0x1F) | arg0 << 32 - (arg1 & 0x1F);
    }

    public sprujd() {
        sprujd sprujd2 = this;
        sprujd2.cfr_renamed_1 = 12;
        sprujd2.cfr_renamed_2 = null;
    }
}

