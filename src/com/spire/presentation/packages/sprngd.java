/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbvh;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprhzz;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprt;

public class sprngd
implements sprqk {
    public byte cfr_renamed_0;
    public byte cfr_renamed_1;
    public byte[] cfr_renamed_2;
    public byte[] cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public sprngd() {
        sprngd sprngd2 = this;
        this.cfr_renamed_0 = 0;
        sprngd2.cfr_renamed_3 = null;
        sprngd2.cfr_renamed_1 = 0;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprhzz.cfr_renamed_9("IqO\u007f");
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_3464(byte[] byArray, byte[] byArray2) {
        byte by;
        int n;
        sprngd sprngd2 = this;
        sprngd2.cfr_renamed_1 = 0;
        sprngd2.cfr_renamed_3 = new byte[256];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = n++;
            this.cfr_renamed_3[n3] = (byte)n3;
            n2 = n;
        }
        int n4 = n = 0;
        while (n4 < 768) {
            void arg0;
            sprngd sprngd3 = this;
            void v5 = arg0;
            this.cfr_renamed_1 = sprngd3.cfr_renamed_3[sprngd3.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v5[n % ((void)v5).length] & 0xFF];
            sprngd sprngd4 = this;
            by = sprngd4.cfr_renamed_3[n & 0xFF];
            sprngd sprngd5 = this;
            sprngd4.cfr_renamed_3[n & 0xFF] = sprngd5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprngd5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n4 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 768) {
            void arg1;
            sprngd sprngd6 = this;
            void v10 = arg1;
            this.cfr_renamed_1 = sprngd6.cfr_renamed_3[sprngd6.cfr_renamed_1 + this.cfr_renamed_3[n & 0xFF] + v10[n % ((void)v10).length] & 0xFF];
            sprngd sprngd7 = this;
            by = sprngd7.cfr_renamed_3[n & 0xFF];
            sprngd sprngd8 = this;
            sprngd7.cfr_renamed_3[n & 0xFF] = sprngd8.cfr_renamed_3[this.cfr_renamed_1 & 0xFF];
            sprngd8.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by;
            n5 = ++n;
        }
        this.cfr_renamed_0 = 0;
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (!(arg1 instanceof sprnjd)) {
            throw new IllegalArgumentException(sprbvh.cfr_renamed_9("\u0003\u001e\u0005\u0010u:;:!s%2'286!6' u>  !s<=6? 70s4=u\u001a\u0003"));
        }
        sprnjd sprnjd2 = (sprnjd)arg1;
        if (!(sprnjd2.cfr_renamed_284() instanceof sprnld)) {
            throw new IllegalArgumentException(sprhzz.cfr_renamed_9("jRl\\\u001cvRvH?L~N~QzHzNl\u001crIlH?Uq_sI{Y?]?WzE"));
        }
        sprnld sprnld2 = (sprnld)sprnjd2.cfr_renamed_284();
        this.cfr_renamed_4 = sprnjd2.cfr_renamed_1205();
        if (this.cfr_renamed_4 == null || this.cfr_renamed_4.length < 1 || this.cfr_renamed_4.length > 768) {
            throw new IllegalArgumentException(sprbvh.cfr_renamed_9("\u0005\u0018\u0003\u0016s'6$&<!0 ubu':sbems7*!6&s:5u\u001a\u0003"));
        }
        sprngd sprngd2 = this;
        sprngd2.cfr_renamed_2 = sprnld2.cfr_renamed_1521();
        sprngd2.cfr_renamed_3464(sprngd2.cfr_renamed_2, this.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_41() {
        sprngd sprngd2 = this;
        sprngd2.cfr_renamed_3464(this.cfr_renamed_2, sprngd2.cfr_renamed_4);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(sprhzz.cfr_renamed_9("vRoIk\u001c}IyZzN?HpS?OwSmH"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new spreid(sprbvh.cfr_renamed_9(":&!# 'u1 536's!<:s&;:!!"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            sprngd sprngd2 = this;
            sprngd sprngd3 = this;
            sprngd sprngd4 = this;
            sprngd2.cfr_renamed_1 = sprngd2.cfr_renamed_3[sprngd3.cfr_renamed_1 + sprngd4.cfr_renamed_3[sprngd4.cfr_renamed_0 & 0xFF] & 0xFF];
            sprngd sprngd5 = this;
            byte by = sprngd3.cfr_renamed_3[sprngd5.cfr_renamed_3[sprngd5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] & 0xFF] + 1 & 0xFF];
            byte by2 = sprngd2.cfr_renamed_3[this.cfr_renamed_0 & 0xFF];
            sprngd sprngd6 = this;
            sprngd2.cfr_renamed_3[this.cfr_renamed_0 & 0xFF] = sprngd6.cfr_renamed_3[sprngd6.cfr_renamed_1 & 0xFF];
            sprngd2.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by2;
            sprngd2.cfr_renamed_0 = (byte)(sprngd2.cfr_renamed_0 + 1 & 0xFF);
            int n3 = n + arg4;
            byte by3 = (byte)(arg0[n + arg1] ^ by);
            arg3[n3] = by3;
            n2 = ++n;
        }
        return arg2;
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        sprngd sprngd2 = this;
        sprngd sprngd3 = this;
        sprngd sprngd4 = this;
        sprngd2.cfr_renamed_1 = sprngd2.cfr_renamed_3[sprngd3.cfr_renamed_1 + sprngd4.cfr_renamed_3[sprngd4.cfr_renamed_0 & 0xFF] & 0xFF];
        sprngd sprngd5 = this;
        byte by = sprngd3.cfr_renamed_3[sprngd5.cfr_renamed_3[sprngd5.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] & 0xFF] + 1 & 0xFF];
        byte by2 = sprngd2.cfr_renamed_3[this.cfr_renamed_0 & 0xFF];
        sprngd sprngd6 = this;
        sprngd2.cfr_renamed_3[this.cfr_renamed_0 & 0xFF] = sprngd6.cfr_renamed_3[sprngd6.cfr_renamed_1 & 0xFF];
        sprngd2.cfr_renamed_3[this.cfr_renamed_1 & 0xFF] = by2;
        sprngd2.cfr_renamed_0 = (byte)(sprngd2.cfr_renamed_0 + 1 & 0xFF);
        return (byte)(arg0 ^ by);
    }
}

