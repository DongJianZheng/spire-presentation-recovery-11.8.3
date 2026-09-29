/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfhf;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnez;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;

public class spredd
implements spruc {
    private byte[] cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private byte[] cfr_renamed_112;
    private byte cfr_renamed_119;
    private byte cfr_renamed_91;
    private byte cfr_renamed_0;
    private byte cfr_renamed_1;
    private byte cfr_renamed_2;
    private byte cfr_renamed_3;
    private byte cfr_renamed_4;

    @Override
    public void cfr_renamed_1221(byte arg0) throws IllegalStateException {
        spredd spredd2 = this;
        spredd spredd3 = this;
        spredd spredd4 = this;
        spredd3.cfr_renamed_3 = spredd3.cfr_renamed_112[spredd4.cfr_renamed_3 + spredd4.cfr_renamed_112[this.cfr_renamed_0 & 0xFF] & 0xFF];
        spredd spredd5 = this;
        spredd spredd6 = this;
        byte by = (byte)(arg0 ^ spredd5.cfr_renamed_112[spredd5.cfr_renamed_112[spredd6.cfr_renamed_112[spredd6.cfr_renamed_3 & 0xFF] & 0xFF] + 1 & 0xFF]);
        spredd spredd7 = this;
        spredd2.cfr_renamed_91 = spredd3.cfr_renamed_112[spredd7.cfr_renamed_91 + this.cfr_renamed_4 & 0xFF];
        spredd spredd8 = this;
        spredd2.cfr_renamed_4 = spredd7.cfr_renamed_112[spredd8.cfr_renamed_4 + spredd8.cfr_renamed_119 & 0xFF];
        spredd spredd9 = this;
        spredd2.cfr_renamed_119 = spredd2.cfr_renamed_112[spredd9.cfr_renamed_119 + spredd9.cfr_renamed_2 & 0xFF];
        spredd spredd10 = this;
        spredd2.cfr_renamed_2 = spredd2.cfr_renamed_112[spredd10.cfr_renamed_2 + spredd10.cfr_renamed_3 + by & 0xFF];
        spredd spredd11 = this;
        spredd2.cfr_renamed_152[this.cfr_renamed_1 & 0x1F] = (byte)(spredd11.cfr_renamed_152[spredd11.cfr_renamed_1 & 0x1F] ^ this.cfr_renamed_2);
        spredd spredd12 = this;
        spredd2.cfr_renamed_152[this.cfr_renamed_1 + 1 & 0x1F] = (byte)(spredd12.cfr_renamed_152[spredd12.cfr_renamed_1 + 1 & 0x1F] ^ this.cfr_renamed_119);
        spredd spredd13 = this;
        spredd2.cfr_renamed_152[this.cfr_renamed_1 + 2 & 0x1F] = (byte)(spredd13.cfr_renamed_152[spredd13.cfr_renamed_1 + 2 & 0x1F] ^ this.cfr_renamed_4);
        spredd spredd14 = this;
        spredd2.cfr_renamed_152[this.cfr_renamed_1 + 3 & 0x1F] = (byte)(spredd14.cfr_renamed_152[spredd14.cfr_renamed_1 + 3 & 0x1F] ^ this.cfr_renamed_91);
        spredd2.cfr_renamed_1 = (byte)(spredd2.cfr_renamed_1 + 4 & 0x1F);
        byte by2 = spredd2.cfr_renamed_112[this.cfr_renamed_0 & 0xFF];
        spredd spredd15 = this;
        spredd2.cfr_renamed_112[this.cfr_renamed_0 & 0xFF] = spredd15.cfr_renamed_112[spredd15.cfr_renamed_3 & 0xFF];
        spredd2.cfr_renamed_112[this.cfr_renamed_3 & 0xFF] = by2;
        spredd2.cfr_renamed_0 = (byte)(spredd2.cfr_renamed_0 + 1 & 0xFF);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3464(byte[] byArray, byte[] byArray2) {
        byte by;
        int n;
        spredd spredd2 = this;
        spredd2.cfr_renamed_3 = 0;
        spredd2.cfr_renamed_112 = new byte[256];
        int n2 = n = 0;
        while (n2 < 256) {
            int n3 = n++;
            this.cfr_renamed_112[n3] = (byte)n3;
            n2 = n;
        }
        int n4 = n = 0;
        while (n4 < 768) {
            void arg0;
            spredd spredd3 = this;
            void v5 = arg0;
            this.cfr_renamed_3 = spredd3.cfr_renamed_112[spredd3.cfr_renamed_3 + this.cfr_renamed_112[n & 0xFF] + v5[n % ((void)v5).length] & 0xFF];
            spredd spredd4 = this;
            by = spredd4.cfr_renamed_112[n & 0xFF];
            spredd spredd5 = this;
            spredd4.cfr_renamed_112[n & 0xFF] = spredd5.cfr_renamed_112[this.cfr_renamed_3 & 0xFF];
            spredd5.cfr_renamed_112[this.cfr_renamed_3 & 0xFF] = by;
            n4 = ++n;
        }
        int n5 = n = 0;
        while (n5 < 768) {
            void arg1;
            spredd spredd6 = this;
            void v10 = arg1;
            this.cfr_renamed_3 = spredd6.cfr_renamed_112[spredd6.cfr_renamed_3 + this.cfr_renamed_112[n & 0xFF] + v10[n % ((void)v10).length] & 0xFF];
            spredd spredd7 = this;
            by = spredd7.cfr_renamed_112[n & 0xFF];
            spredd spredd8 = this;
            spredd7.cfr_renamed_112[n & 0xFF] = spredd8.cfr_renamed_112[this.cfr_renamed_3 & 0xFF];
            spredd8.cfr_renamed_112[this.cfr_renamed_3 & 0xFF] = by;
            n5 = ++n;
        }
        this.cfr_renamed_0 = 0;
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) throws IllegalArgumentException {
        if (!(arg0 instanceof sprnjd)) {
            throw new IllegalArgumentException(sprfhf.cfr_renamed_9("\u001eS\u0018]eS\t]hW&w<>8\u007f:\u007f%{<{:mhs=m<>!p+r=z->)phW\u001e"));
        }
        sprnjd sprnjd2 = (sprnjd)arg0;
        sprnld sprnld2 = (sprnld)sprnjd2.cfr_renamed_284();
        if (!(sprnjd2.cfr_renamed_284() instanceof sprnld)) {
            throw new IllegalArgumentException(sprnez.cfr_renamed_9("5\u00063\bN\u0006\"\bC\u0002\r\"\u0017k\u0013*\u0011*\u000e.\u0017.\u00118C&\u00168\u0017k\n%\u0000'\u0016/\u0006k\u0002k\b.\u001a"));
        }
        this.cfr_renamed_93 = sprnjd2.cfr_renamed_1205();
        if (this.cfr_renamed_93 == null || this.cfr_renamed_93.length < 1 || this.cfr_renamed_93.length > 768) {
            throw new IllegalArgumentException(sprfhf.cfr_renamed_9("H\u0005N\u000b3\u0005_\u000b>:{9k!l-mh/hj'>\u007f(p>*g<{;>'xhW\u001e"));
        }
        this.cfr_renamed_86 = sprnld2.cfr_renamed_1521();
        this.cfr_renamed_41();
    }

    @Override
    public String cfr_renamed_1315() {
        return sprnez.cfr_renamed_9("\u001d.\u001b f.\n ");
    }

    @Override
    public void cfr_renamed_41() {
        int n;
        spredd spredd2 = this;
        spredd spredd3 = this;
        this.cfr_renamed_3464(spredd3.cfr_renamed_86, spredd3.cfr_renamed_93);
        spredd2.cfr_renamed_0 = 0;
        this.cfr_renamed_91 = 0;
        spredd2.cfr_renamed_4 = 0;
        spredd2.cfr_renamed_119 = 0;
        spredd2.cfr_renamed_2 = 0;
        spredd2.cfr_renamed_1 = 0;
        this.cfr_renamed_152 = new byte[32];
        int n2 = n = 0;
        while (n2 < 32) {
            this.cfr_renamed_152[n++] = 0;
            n2 = n;
        }
    }

    @Override
    public int cfr_renamed_1219(byte[] arg0, int arg1) throws sprjkd, IllegalStateException {
        int n;
        int n2;
        int n3 = n2 = 1;
        while (n3 < 25) {
            spredd spredd2 = this;
            spredd spredd3 = this;
            spredd spredd4 = this;
            spredd2.cfr_renamed_3 = spredd2.cfr_renamed_112[spredd3.cfr_renamed_3 + spredd4.cfr_renamed_112[spredd4.cfr_renamed_0 & 0xFF] & 0xFF];
            spredd spredd5 = this;
            spredd2.cfr_renamed_91 = spredd3.cfr_renamed_112[spredd5.cfr_renamed_91 + spredd5.cfr_renamed_4 + n2 & 0xFF];
            spredd spredd6 = this;
            spredd2.cfr_renamed_4 = spredd2.cfr_renamed_112[spredd6.cfr_renamed_4 + spredd6.cfr_renamed_119 + n2 & 0xFF];
            spredd spredd7 = this;
            spredd2.cfr_renamed_119 = spredd2.cfr_renamed_112[spredd7.cfr_renamed_119 + spredd7.cfr_renamed_2 + n2 & 0xFF];
            spredd spredd8 = this;
            spredd2.cfr_renamed_2 = spredd2.cfr_renamed_112[spredd8.cfr_renamed_2 + spredd8.cfr_renamed_3 + n2 & 0xFF];
            spredd spredd9 = this;
            spredd2.cfr_renamed_152[this.cfr_renamed_1 & 0x1F] = (byte)(spredd9.cfr_renamed_152[spredd9.cfr_renamed_1 & 0x1F] ^ this.cfr_renamed_2);
            spredd spredd10 = this;
            spredd2.cfr_renamed_152[this.cfr_renamed_1 + 1 & 0x1F] = (byte)(spredd10.cfr_renamed_152[spredd10.cfr_renamed_1 + 1 & 0x1F] ^ this.cfr_renamed_119);
            spredd spredd11 = this;
            spredd2.cfr_renamed_152[this.cfr_renamed_1 + 2 & 0x1F] = (byte)(spredd11.cfr_renamed_152[spredd11.cfr_renamed_1 + 2 & 0x1F] ^ this.cfr_renamed_4);
            spredd spredd12 = this;
            spredd2.cfr_renamed_152[this.cfr_renamed_1 + 3 & 0x1F] = (byte)(spredd12.cfr_renamed_152[spredd12.cfr_renamed_1 + 3 & 0x1F] ^ this.cfr_renamed_91);
            spredd2.cfr_renamed_1 = (byte)(spredd2.cfr_renamed_1 + 4 & 0x1F);
            n = spredd2.cfr_renamed_112[this.cfr_renamed_0 & 0xFF];
            spredd spredd13 = this;
            spredd2.cfr_renamed_112[this.cfr_renamed_0 & 0xFF] = spredd13.cfr_renamed_112[spredd13.cfr_renamed_3 & 0xFF];
            spredd2.cfr_renamed_112[this.cfr_renamed_3 & 0xFF] = n;
            spredd2.cfr_renamed_0 = (byte)(spredd2.cfr_renamed_0 + 1 & 0xFF);
            n3 = ++n2;
        }
        int n4 = n2 = 0;
        while (n4 < 768) {
            spredd spredd14 = this;
            spredd spredd15 = this;
            spredd14.cfr_renamed_3 = spredd14.cfr_renamed_112[spredd15.cfr_renamed_3 + this.cfr_renamed_112[n2 & 0xFF] + this.cfr_renamed_152[n2 & 0x1F] & 0xFF];
            n = spredd15.cfr_renamed_112[n2 & 0xFF];
            spredd spredd16 = this;
            spredd14.cfr_renamed_112[n2 & 0xFF] = spredd16.cfr_renamed_112[spredd16.cfr_renamed_3 & 0xFF];
            spredd14.cfr_renamed_112[this.cfr_renamed_3 & 0xFF] = n;
            n4 = ++n2;
        }
        byte[] byArray = new byte[20];
        int n5 = n = 0;
        while (n5 < 20) {
            spredd spredd17 = this;
            spredd spredd18 = this;
            spredd17.cfr_renamed_3 = spredd18.cfr_renamed_112[spredd18.cfr_renamed_3 + this.cfr_renamed_112[n & 0xFF] & 0xFF];
            spredd spredd19 = this;
            spredd spredd20 = this;
            byArray[n] = spredd19.cfr_renamed_112[spredd19.cfr_renamed_112[spredd20.cfr_renamed_112[spredd20.cfr_renamed_3 & 0xFF] & 0xFF] + 1 & 0xFF];
            byte by = spredd17.cfr_renamed_112[n & 0xFF];
            spredd spredd21 = this;
            spredd17.cfr_renamed_112[n & 0xFF] = spredd21.cfr_renamed_112[this.cfr_renamed_3 & 0xFF];
            spredd21.cfr_renamed_112[this.cfr_renamed_3 & 0xFF] = by;
            n5 = ++n;
        }
        System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
        this.cfr_renamed_41();
        return byArray.length;
    }

    @Override
    public void cfr_renamed_1197(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalStateException {
        int n;
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(sprfhf.cfr_renamed_9("w&n=jh|=x.{:><q'>;v'l<"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            this.cfr_renamed_1221(arg0[n++]);
            n2 = n;
        }
    }

    public spredd() {
        spredd spredd2 = this;
        this.cfr_renamed_0 = 0;
        spredd2.cfr_renamed_112 = null;
        spredd2.cfr_renamed_3 = 0;
    }

    @Override
    public int cfr_renamed_2404() {
        return 20;
    }
}

