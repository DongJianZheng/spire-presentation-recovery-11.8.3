/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdiaa;
import com.spire.presentation.packages.sprhel;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.spridc;
import com.spire.presentation.packages.spriil;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprtcl;
import com.spire.presentation.packages.sprxq;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzxe;

public class sprnml
extends sprtcl {
    private long cfr_renamed_105;
    private long cfr_renamed_93;
    private long cfr_renamed_86;
    private int cfr_renamed_112;
    private long cfr_renamed_119;
    private long cfr_renamed_91;
    private long cfr_renamed_0;
    private long cfr_renamed_2;
    private long cfr_renamed_3;

    private static /* synthetic */ int cfr_renamed_3795(byte[] arg0) {
        return sprpxe.cfr_renamed_446(arg0, arg0.length - 5);
    }

    @Override
    public byte[] cfr_renamed_2426() {
        sprnml sprnml2 = this;
        int n = sprnml2.cfr_renamed_3792();
        byte[] byArray = new byte[n + 4 + 1];
        sprnml2.cfr_renamed_3793(byArray);
        sprpxe.cfr_renamed_442(sprnml2.cfr_renamed_112 * 8, byArray, n);
        byArray[byArray.length - 1] = (byte)this.cfr_renamed_86.ordinal();
        return byArray;
    }

    private static /* synthetic */ void cfr_renamed_3790(int arg0, byte[] arg1, int arg2, int arg3) {
        int n = Math.min(4, arg3);
        while (--n >= 0) {
            int n2 = 8 * (3 - n);
            arg1[arg2 + n] = (byte)(arg0 >>> n2);
        }
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprnml(this);
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, sprdiaa.cfr_renamed_9("  2EFYAG")).append(Integer.toString(this.cfr_renamed_112 * 8)).toString();
    }

    /*
     * WARNING - void declaration
     */
    public sprnml(sprnml sprnml2) {
        void arg0;
        sprnml sprnml3 = this;
        void v1 = arg0;
        super((sprtcl)v1);
        sprnml3.cfr_renamed_112 = v1.cfr_renamed_112;
        sprybl.cfr_renamed_9170(sprnml3.cfr_renamed_10476());
        sprnml3.cfr_renamed_5183(sprnml2);
    }

    @Override
    public sprxq cfr_renamed_10476() {
        sprnml sprnml2 = this;
        return sprhel.cfr_renamed_10472(sprnml2, this.cfr_renamed_1218() * 8, (spriil)sprnml2.cfr_renamed_86);
    }

    /*
     * WARNING - void declaration
     */
    public sprnml(int n, spriil spriil2) {
        void arg0;
        if (n >= 512) {
            throw new IllegalArgumentException(spridc.cfr_renamed_9("+C=f,D.^!\n*K'D&^iH,\nw\u0017i\u001fx\u0018"));
        }
        if (arg0 % 8 != false) {
            throw new IllegalArgumentException(sprdiaa.cfr_renamed_9("\n\u001a\u001c?\r\u001d\u000f\u0007\u0000S\u0006\u0016\r\u0017\u001bS\u001c\u001cH\u0011\rS\tS\u0005\u0006\u0004\u0007\u0001\u0003\u0004\u0016H\u001c\u000eSP"));
        }
        if (arg0 == 384) {
            throw new IllegalArgumentException(spridc.cfr_renamed_9("+C=f,D.^!\n*K'D&^iH,\nz\u0012}\n<Y,\n\u001ab\b\u0019q\u001eiC'Y=O(N"));
        }
        sprnml sprnml2 = this;
        sprnml2.cfr_renamed_112 = arg0 / 8;
        sprybl.cfr_renamed_9170(sprnml2.cfr_renamed_10476());
        sprnml2.cfr_renamed_3794(sprnml2.cfr_renamed_112 * 8);
        sprnml2.cfr_renamed_41();
    }

    @Override
    public int cfr_renamed_1218() {
        return this.cfr_renamed_112;
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) {
        sprnml sprnml2 = this;
        sprnml2.cfr_renamed_3120();
        sprnml.cfr_renamed_3791(sprnml2.cfr_renamed_132, arg0, arg1, this.cfr_renamed_112);
        sprnml.cfr_renamed_3791(sprnml2.cfr_renamed_152, arg0, arg1 + 8, this.cfr_renamed_112 - 8);
        sprnml.cfr_renamed_3791(sprnml2.cfr_renamed_137, arg0, arg1 + 16, this.cfr_renamed_112 - 16);
        sprnml.cfr_renamed_3791(sprnml2.cfr_renamed_1, arg0, arg1 + 24, this.cfr_renamed_112 - 24);
        sprnml.cfr_renamed_3791(sprnml2.cfr_renamed_102, arg0, arg1 + 32, this.cfr_renamed_112 - 32);
        sprnml.cfr_renamed_3791(sprnml2.cfr_renamed_107, arg0, arg1 + 40, this.cfr_renamed_112 - 40);
        sprnml.cfr_renamed_3791(sprnml2.cfr_renamed_4, arg0, arg1 + 48, this.cfr_renamed_112 - 48);
        sprnml.cfr_renamed_3791(sprnml2.cfr_renamed_79, arg0, arg1 + 56, this.cfr_renamed_112 - 56);
        sprnml2.cfr_renamed_41();
        return sprnml2.cfr_renamed_112;
    }

    @Override
    public void cfr_renamed_41() {
        sprnml sprnml2 = this;
        super.cfr_renamed_41();
        sprnml2.cfr_renamed_132 = sprnml2.cfr_renamed_3;
        sprnml2.cfr_renamed_152 = sprnml2.cfr_renamed_2;
        sprnml2.cfr_renamed_137 = sprnml2.cfr_renamed_93;
        sprnml2.cfr_renamed_1 = sprnml2.cfr_renamed_105;
        sprnml2.cfr_renamed_102 = sprnml2.cfr_renamed_119;
        sprnml2.cfr_renamed_107 = sprnml2.cfr_renamed_86;
        sprnml2.cfr_renamed_4 = sprnml2.cfr_renamed_91;
        sprnml2.cfr_renamed_79 = sprnml2.cfr_renamed_0;
    }

    public sprnml(byte[] arg0) {
        this(sprnml.cfr_renamed_3795(arg0), spriil.values()[arg0[arg0.length - 1]]);
        sprnml sprnml2 = this;
        sprybl.cfr_renamed_9170(sprnml2.cfr_renamed_10476());
        sprnml2.cfr_renamed_3797(arg0);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3794(int n) {
        void arg0;
        sprnml sprnml2;
        sprnml sprnml3 = this;
        sprnml sprnml4 = this;
        sprnml sprnml5 = this;
        sprnml sprnml6 = this;
        sprnml sprnml7 = this;
        sprnml sprnml8 = this;
        sprnml sprnml9 = this;
        sprnml sprnml10 = this;
        sprnml10.cfr_renamed_132 = -3482333909917012819L;
        sprnml10.cfr_renamed_152 = 2216346199247487646L;
        sprnml9.cfr_renamed_137 = -7364697282686394994L;
        sprnml9.cfr_renamed_1 = 65953792586715988L;
        sprnml8.cfr_renamed_102 = -816286391624063116L;
        sprnml8.cfr_renamed_107 = 4512832404995164602L;
        sprnml7.cfr_renamed_4 = -5033199132376557362L;
        sprnml7.cfr_renamed_79 = -124578254951840548L;
        sprnml6.cfr_renamed_1221((byte)83);
        sprnml6.cfr_renamed_1221((byte)72);
        sprnml5.cfr_renamed_1221((byte)65);
        sprnml5.cfr_renamed_1221((byte)45);
        sprnml4.cfr_renamed_1221((byte)53);
        sprnml4.cfr_renamed_1221((byte)49);
        sprnml3.cfr_renamed_1221((byte)50);
        sprnml3.cfr_renamed_1221((byte)47);
        if (n > 100) {
            sprnml sprnml11 = this;
            sprnml2 = sprnml11;
            sprnml sprnml12 = this;
            sprnml12.cfr_renamed_1221((byte)(arg0 / 100 + 48));
            sprnml11.cfr_renamed_1221((byte)((arg0 %= 100) / 10 + 48));
            sprnml12.cfr_renamed_1221((byte)((arg0 %= 10) + 48));
        } else if (arg0 > 10) {
            sprnml sprnml13 = this;
            sprnml2 = sprnml13;
            sprnml13.cfr_renamed_1221((byte)(arg0 / 10 + 48));
            sprnml13.cfr_renamed_1221((byte)((arg0 %= 10) + 48));
        } else {
            sprnml sprnml14 = this;
            sprnml2 = sprnml14;
            sprnml14.cfr_renamed_1221((byte)(arg0 + 48));
        }
        sprnml2.cfr_renamed_3120();
        sprnml sprnml15 = this;
        sprnml15.cfr_renamed_3 = sprnml15.cfr_renamed_132;
        sprnml15.cfr_renamed_2 = sprnml15.cfr_renamed_152;
        sprnml15.cfr_renamed_93 = sprnml15.cfr_renamed_137;
        sprnml15.cfr_renamed_105 = sprnml15.cfr_renamed_1;
        sprnml15.cfr_renamed_119 = sprnml15.cfr_renamed_102;
        sprnml15.cfr_renamed_86 = sprnml15.cfr_renamed_107;
        sprnml15.cfr_renamed_91 = sprnml15.cfr_renamed_4;
        sprnml15.cfr_renamed_0 = sprnml15.cfr_renamed_79;
    }

    public sprnml(int arg0) {
        this(arg0, spriil.cfr_renamed_0);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprnml sprnml2 = (sprnml)arg0;
        if (this.cfr_renamed_112 != sprnml2.cfr_renamed_112) {
            throw new sprzxe(sprdiaa.cfr_renamed_9("\f\u001a\u000f\u0016\u001b\u0007$\u0016\u0006\u0014\u001c\u001bH\u001a\u0006\u0012\u0018\u0003\u001a\u001c\u0018\u0001\u0001\u0012\u001c\u0016H\u001a\u0006S\u0007\u0007\u0000\u0016\u001a"));
        }
        sprnml sprnml3 = this;
        sprnml sprnml4 = sprnml2;
        sprnml sprnml5 = this;
        sprnml sprnml6 = sprnml2;
        sprnml sprnml7 = this;
        sprnml sprnml8 = sprnml2;
        super.cfr_renamed_10488(sprnml2);
        this.cfr_renamed_3 = sprnml8.cfr_renamed_3;
        sprnml7.cfr_renamed_2 = sprnml8.cfr_renamed_2;
        sprnml7.cfr_renamed_93 = sprnml2.cfr_renamed_93;
        this.cfr_renamed_105 = sprnml6.cfr_renamed_105;
        sprnml5.cfr_renamed_119 = sprnml6.cfr_renamed_119;
        sprnml5.cfr_renamed_86 = sprnml2.cfr_renamed_86;
        sprnml3.cfr_renamed_91 = sprnml4.cfr_renamed_91;
        sprnml3.cfr_renamed_0 = sprnml4.cfr_renamed_0;
    }

    private static /* synthetic */ void cfr_renamed_3791(long arg0, byte[] arg1, int arg2, int arg3) {
        if (arg3 > 0) {
            sprnml.cfr_renamed_3790((int)(arg0 >>> 32), arg1, arg2, arg3);
            if (arg3 > 4) {
                sprnml.cfr_renamed_3790((int)(arg0 & 0xFFFFFFFFL), arg1, arg2 + 4, arg3 - 4);
            }
        }
    }
}

