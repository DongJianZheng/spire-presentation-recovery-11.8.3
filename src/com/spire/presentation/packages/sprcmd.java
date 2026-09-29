/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnd;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprwd;
import com.spire.presentation.packages.sprzpf;

public class sprcmd
extends sprcnd
implements sprwd {
    private int cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private final int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final sprff cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_1315()).append(sprzpf.cfr_renamed_9("4\nR\u001a")).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprcmd(sprff sprff2) {
        void arg0;
        sprcmd sprcmd2 = this;
        sprcmd sprcmd3 = this;
        super((sprff)arg0);
        sprcmd2.cfr_renamed_4 = arg0;
        sprcmd2.cfr_renamed_2 = sprcmd3.cfr_renamed_4.cfr_renamed_1195();
        sprcmd2.cfr_renamed_3 = new byte[sprcmd2.cfr_renamed_2];
        sprcmd2.cfr_renamed_1 = new byte[sprcmd2.cfr_renamed_2];
        this.cfr_renamed_0 = new byte[this.cfr_renamed_2];
        this.cfr_renamed_91 = 0;
    }

    private /* synthetic */ void cfr_renamed_3390() {
        int n;
        if (this.cfr_renamed_1[0] == 0) {
            int n2;
            n = 0;
            int n3 = n2 = this.cfr_renamed_1.length - 1;
            while (n3 > 0) {
                if (this.cfr_renamed_1[n2] != 0) {
                    n = 1;
                }
                n3 = --n2;
            }
            if (n == 0) {
                throw new IllegalStateException(sprhky.cfr_renamed_9("=\t(\u00181\r(](\u0012|\u000f9\u0019)\u001e9]?\u0012)\u0013(\u0018.],\u001c/\t|\u00079\u000f3S"));
            }
        }
        int n4 = n = this.cfr_renamed_1.length - 1;
        while (n4 >= 0) {
            int n5 = n--;
            this.cfr_renamed_1[n5] = (byte)(this.cfr_renamed_1[n5] - 1);
            if (this.cfr_renamed_1[n5] != -1) break;
            n4 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int cfr_renamed_3064(byte[] byArray, int n, byte[] byArray2, int n2) throws sprjkd, IllegalStateException {
        void arg3;
        void arg2;
        void arg1;
        sprcmd sprcmd2 = this;
        sprcmd2.cfr_renamed_505(byArray, (int)arg1, sprcmd2.cfr_renamed_2, (byte[])arg2, (int)arg3);
        return sprcmd2.cfr_renamed_2;
    }

    @Override
    public long cfr_renamed_3275(long l) {
        sprcmd sprcmd2 = this;
        sprcmd2.cfr_renamed_41();
        return sprcmd2.cfr_renamed_3273(l);
    }

    @Override
    public int cfr_renamed_1195() {
        return this.cfr_renamed_4.cfr_renamed_1195();
    }

    @Override
    public byte cfr_renamed_3272(byte arg0) throws sprjkd, IllegalStateException {
        if (this.cfr_renamed_91 == 0) {
            sprcmd sprcmd2 = this;
            this.cfr_renamed_4.cfr_renamed_3064(sprcmd2.cfr_renamed_1, 0, this.cfr_renamed_0, 0);
            return (byte)(sprcmd2.cfr_renamed_0[this.cfr_renamed_91++] ^ arg0);
        }
        byte by = (byte)(this.cfr_renamed_0[this.cfr_renamed_91++] ^ arg0);
        sprcmd sprcmd3 = this;
        if (sprcmd3.cfr_renamed_91 == sprcmd3.cfr_renamed_1.length) {
            this.cfr_renamed_91 = 0;
            this.cfr_renamed_3391();
        }
        return by;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) throws IllegalArgumentException {
        if (arg1 instanceof sprnjd) {
            sprnjd sprnjd2 = (sprnjd)arg1;
            System.arraycopy(sprnjd2.cfr_renamed_1205(), 0, this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            if (sprnjd2.cfr_renamed_284() != null) {
                this.cfr_renamed_4.cfr_renamed_1217(true, sprnjd2.cfr_renamed_284());
            }
            this.cfr_renamed_41();
            return;
        }
        throw new IllegalArgumentException(sprzpf.cfr_renamed_9("H\u0010Xyv6\u007f<;+~(n0i<hyK8i8v<o<i*L0o1R\u000f"));
    }

    @Override
    public long cfr_renamed_3274() {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_3.length];
        System.arraycopy(this.cfr_renamed_1, 0, byArray, 0, byArray.length);
        int n2 = n = byArray.length - 1;
        while (n2 >= 1) {
            int n3 = byArray[n] - this.cfr_renamed_3[n];
            if (n3 < 0) {
                int n4 = n - 1;
                n3 += 256;
                byArray[n4] = (byte)(byArray[n4] - 1);
            }
            byArray[n--] = (byte)n3;
            n2 = n;
        }
        return sprtsa.cfr_renamed_456(byArray, byArray.length - 8) * (long)this.cfr_renamed_2 + (long)this.cfr_renamed_91;
    }

    private /* synthetic */ void cfr_renamed_3392(long arg0) {
        long l;
        if (arg0 >= 0L) {
            long l2;
            long l3 = (arg0 + (long)this.cfr_renamed_91) / (long)this.cfr_renamed_2;
            long l4 = l2 = 0L;
            while (l4 != l3) {
                this.cfr_renamed_3391();
                l4 = l2 + 1L;
            }
            this.cfr_renamed_91 = (int)(arg0 + (long)this.cfr_renamed_91 - (long)this.cfr_renamed_2 * l3);
            return;
        }
        long l5 = (-arg0 - (long)this.cfr_renamed_91) / (long)this.cfr_renamed_2;
        long l6 = l = 0L;
        while (l6 != l5) {
            this.cfr_renamed_3390();
            l6 = l + 1L;
        }
        int n = (int)((long)this.cfr_renamed_91 + arg0 + (long)this.cfr_renamed_2 * l5);
        if (n >= 0) {
            this.cfr_renamed_91 = 0;
            return;
        }
        this.cfr_renamed_3390();
        this.cfr_renamed_91 = this.cfr_renamed_2 + n;
    }

    @Override
    public void cfr_renamed_41() {
        System.arraycopy(this.cfr_renamed_3, 0, this.cfr_renamed_1, 0, this.cfr_renamed_1.length);
        this.cfr_renamed_4.cfr_renamed_41();
        this.cfr_renamed_91 = 0;
    }

    @Override
    public long cfr_renamed_3273(long arg0) {
        sprcmd sprcmd2 = this;
        long l = arg0;
        sprcmd2.cfr_renamed_3392(l);
        sprcmd2.cfr_renamed_4.cfr_renamed_3064(this.cfr_renamed_1, 0, this.cfr_renamed_0, 0);
        return l;
    }

    private /* synthetic */ void cfr_renamed_3391() {
        int n;
        int n2 = n = this.cfr_renamed_1.length - 1;
        while (n2 >= 0) {
            int n3 = n--;
            this.cfr_renamed_1[n3] = (byte)(this.cfr_renamed_1[n3] + 1);
            if (this.cfr_renamed_1[n3] != 0) break;
            n2 = n;
        }
    }
}

