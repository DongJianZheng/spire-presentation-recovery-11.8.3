/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprauq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcxm;
import com.spire.presentation.packages.sprerk;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtpk;

public class sprnwk
implements spraq {
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private sprmr cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private byte[] cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.length) {
            this.cfr_renamed_3[n++] = 0;
            n2 = n;
        }
        this.cfr_renamed_2 = 0;
        this.cfr_renamed_119.cfr_renamed_41();
    }

    public void cfr_renamed_10120(sprbj arg0) {
        if (arg0 != null && !(arg0 instanceof sprtpk)) {
            throw new IllegalArgumentException(sprauq.cfr_renamed_9("\u000eV,xmv\"\u007f(;\"u!bmk(i r9hmp(bmo\";/~mh(oc"));
        }
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        int n;
        byte[] byArray;
        sprnwk sprnwk2 = this;
        int n2 = sprnwk2.cfr_renamed_119.cfr_renamed_1195();
        if (sprnwk2.cfr_renamed_2 == n2) {
            byArray = this.cfr_renamed_0;
        } else {
            sprnwk sprnwk3 = this;
            new sprerk().cfr_renamed_3210(sprnwk3.cfr_renamed_3, sprnwk3.cfr_renamed_2);
            byArray = this.cfr_renamed_112;
        }
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_152.length) {
            int n4 = n;
            byte by = (byte)(this.cfr_renamed_3[n4] ^ byArray[n]);
            this.cfr_renamed_3[n4] = by;
            n3 = ++n;
        }
        sprnwk sprnwk4 = this;
        sprnwk4.cfr_renamed_119.cfr_renamed_3064(sprnwk4.cfr_renamed_3, 0, this.cfr_renamed_152, 0);
        sprnwk sprnwk5 = this;
        System.arraycopy(sprnwk5.cfr_renamed_152, 0, arg0, arg1, this.cfr_renamed_1);
        sprnwk5.cfr_renamed_41();
        return sprnwk4.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprnwk(sprmr sprmr2, int n) {
        void arg0;
        void arg1;
        if (n % 8 != 0) {
            throw new IllegalArgumentException(sprcxm.cfr_renamed_9("o\u0018ayQ0X<\u00024W*Vy@<\u00024W5V0R5GyM?\u0002a"));
        }
        if (arg1 > arg0.cfr_renamed_1195() * 8) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprauq.cfr_renamed_9("V\fXmh$a(; n>omy(;!~>hmt?;(j8z!;9tm")).append(arg0.cfr_renamed_1195() * 8).toString());
        }
        sprnwk sprnwk2 = this;
        void v1 = arg0;
        sprnwk sprnwk3 = this;
        this.cfr_renamed_119 = sprhqk.cfr_renamed_7530((sprmr)arg0);
        sprnwk3.cfr_renamed_1 = arg1 / 8;
        sprnwk3.cfr_renamed_4 = sprnwk.cfr_renamed_10121(arg0.cfr_renamed_1195());
        this.cfr_renamed_152 = new byte[v1.cfr_renamed_1195()];
        sprnwk2.cfr_renamed_3 = new byte[v1.cfr_renamed_1195()];
        sprnwk2.cfr_renamed_91 = new byte[arg0.cfr_renamed_1195()];
        this.cfr_renamed_2 = 0;
    }

    private /* synthetic */ byte[] cfr_renamed_3482(byte[] arg0) {
        byte[] byArray;
        byte[] byArray2 = byArray = new byte[arg0.length];
        int n = -sprnwk.cfr_renamed_3403(arg0, byArray) & 0xFF;
        int n2 = arg0.length - 3;
        byArray2[n2] = (byte)(byArray2[n2] ^ this.cfr_renamed_4[1] & n);
        int n3 = arg0.length - 2;
        byArray[n3] = (byte)(byArray[n3] ^ this.cfr_renamed_4[2] & n);
        int n4 = arg0.length - 1;
        byArray[n4] = (byte)(byArray[n4] ^ this.cfr_renamed_4[3] & n);
        return byArray;
    }

    private static /* synthetic */ int cfr_renamed_3403(byte[] arg0, byte[] arg1) {
        int n = arg0.length;
        int n2 = 0;
        while (--n >= 0) {
            int n3 = arg0[n] & 0xFF;
            arg1[n] = (byte)(n3 << 1 | n2);
            n2 = n3 >>> 7 & 1;
        }
        return n2;
    }

    @Override
    public void cfr_renamed_1221(byte arg0) {
        sprnwk sprnwk2 = this;
        if (sprnwk2.cfr_renamed_2 == sprnwk2.cfr_renamed_3.length) {
            sprnwk sprnwk3 = this;
            sprnwk3.cfr_renamed_119.cfr_renamed_3064(sprnwk3.cfr_renamed_3, 0, this.cfr_renamed_152, 0);
            this.cfr_renamed_2 = 0;
        }
        this.cfr_renamed_3[this.cfr_renamed_2++] = arg0;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprcxm.cfr_renamed_9("\u001aC7\u0005-\u00021C/GyCyL<E8V0T<\u00020L)W-\u00025G7E-Jx"));
        }
        int n = this.cfr_renamed_119.cfr_renamed_1195();
        int n2 = n - this.cfr_renamed_2;
        if (arg2 > n2) {
            sprnwk sprnwk2 = this;
            System.arraycopy(arg0, arg1, sprnwk2.cfr_renamed_3, this.cfr_renamed_2, n2);
            sprnwk2.cfr_renamed_119.cfr_renamed_3064(this.cfr_renamed_3, 0, this.cfr_renamed_152, 0);
            this.cfr_renamed_2 = 0;
            arg1 += n2;
            int n3 = arg2 -= n2;
            while (n3 > n) {
                this.cfr_renamed_119.cfr_renamed_3064(arg0, arg1, this.cfr_renamed_152, 0);
                arg1 += n;
                n3 = arg2 -= n;
            }
        }
        sprnwk sprnwk3 = this;
        System.arraycopy(arg0, arg1, sprnwk3.cfr_renamed_3, sprnwk3.cfr_renamed_2, arg2);
        this.cfr_renamed_2 += arg2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ byte[] cfr_renamed_10121(int arg0) {
        switch (arg0 * 8) {
            case 64: {
                int n;
                int n2 = n = 27;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 128: {
                int n;
                int n2 = n = 135;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 160: {
                int n;
                int n2 = n = 45;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 192: {
                int n;
                int n2 = n = 135;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 224: {
                int n;
                int n2 = n = 777;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 256: {
                int n;
                int n2 = n = 1061;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 320: {
                int n;
                int n2 = n = 27;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 384: {
                int n;
                int n2 = n = 4109;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 448: {
                int n;
                int n2 = n = 2129;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 512: {
                int n;
                int n2 = n = 293;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 768: {
                int n;
                int n2 = n = 655377;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 1024: {
                int n;
                int n2 = n = 524355;
                return sprpxe.cfr_renamed_453(n2);
            }
            case 2048: {
                int n;
                int n2 = n = 548865;
                return sprpxe.cfr_renamed_453(n2);
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprauq.cfr_renamed_9("\u0018u&u\"l#;/w\"x&;>r7~m}\"imX\u0000Z\u000e!m")).append(arg0 * 8).toString());
    }

    public sprnwk(sprmr arg0) {
        sprmr sprmr2 = arg0;
        this(sprmr2, sprmr2.cfr_renamed_1195() * 8);
    }

    @Override
    public void cfr_renamed_5692(sprbj arg0) {
        sprnwk sprnwk2 = this;
        sprnwk2.cfr_renamed_10120(arg0);
        sprnwk2.cfr_renamed_119.cfr_renamed_5535(true, arg0);
        byte[] byArray = new byte[sprnwk2.cfr_renamed_91.length];
        sprnwk sprnwk3 = this;
        sprnwk3.cfr_renamed_119.cfr_renamed_3064(sprnwk3.cfr_renamed_91, 0, byArray, 0);
        sprnwk sprnwk4 = this;
        sprnwk4.cfr_renamed_0 = sprnwk4.cfr_renamed_3482(byArray);
        sprnwk4.cfr_renamed_112 = sprnwk4.cfr_renamed_3482(sprnwk4.cfr_renamed_0);
        sprnwk4.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_2404() {
        return this.cfr_renamed_1;
    }

    @Override
    public String cfr_renamed_1315() {
        return this.cfr_renamed_119.cfr_renamed_1315();
    }
}

