/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprced;
import com.spire.presentation.packages.sprcye;
import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprib;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprund;
import com.spire.presentation.packages.sprupn;

public class spromd
implements sprib {
    private byte[] cfr_renamed_0;
    private sprced cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnld cfr_renamed_3512(byte[] byArray, byte[] byArray2) {
        spromd spromd2;
        void arg1;
        this.cfr_renamed_1.cfr_renamed_1524(new sprnld((byte[])arg1));
        if (byArray == null) {
            spromd spromd3 = this;
            spromd2 = spromd3;
            spromd3.cfr_renamed_1.cfr_renamed_1524(new sprnld(new byte[this.cfr_renamed_3]));
        } else {
            void arg0;
            spromd spromd4 = this;
            spromd2 = spromd4;
            spromd4.cfr_renamed_1.cfr_renamed_1524(new sprnld((byte[])arg0));
        }
        void v3 = arg1;
        spromd2.cfr_renamed_1.cfr_renamed_1197((byte[])v3, 0, ((void)v3).length);
        spromd spromd5 = this;
        byte[] byArray3 = new byte[spromd5.cfr_renamed_3];
        spromd5.cfr_renamed_1.cfr_renamed_1219(byArray3, 0);
        return new sprnld(byArray3);
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        if (this.cfr_renamed_4 + arg2 > 255 * this.cfr_renamed_3) {
            throw new sprjkd(sprupn.cfr_renamed_9("a?m2\t\u0019H\r\t\u001bG\u0018PTK\u0011\t\u0001Z\u0011MTO\u001b[T\u001bA\u001cT\u0003Ta\u0015Z\u001ce\u0011GTK\r]\u0011ZTF\u0012\t\u001b\\\u0000Y\u0001]"));
        }
        spromd spromd2 = this;
        if (spromd2.cfr_renamed_4 % spromd2.cfr_renamed_3 == 0) {
            this.cfr_renamed_3513();
        }
        int n = arg2;
        spromd spromd3 = this;
        spromd spromd4 = this;
        int n2 = spromd3.cfr_renamed_4 % spromd4.cfr_renamed_3;
        spromd spromd5 = this;
        int n3 = Math.min(spromd3.cfr_renamed_3 - spromd5.cfr_renamed_4 % spromd5.cfr_renamed_3, n);
        System.arraycopy(spromd4.cfr_renamed_2, n2, arg0, arg1, n3);
        spromd3.cfr_renamed_4 += n3;
        arg1 += n3;
        int n4 = n -= n3;
        while (n4 > 0) {
            spromd spromd6 = this;
            spromd6.cfr_renamed_3513();
            n3 = Math.min(spromd6.cfr_renamed_3, n);
            System.arraycopy(spromd6.cfr_renamed_2, 0, arg0, arg1, n3);
            spromd6.cfr_renamed_4 += n3;
            arg1 += n3;
            n4 = n -= n3;
        }
        return arg2;
    }

    /*
     * WARNING - void declaration
     */
    public spromd(sprlc sprlc2) {
        void arg0;
        spromd spromd2 = this;
        this.cfr_renamed_1 = new sprced((sprlc)arg0);
        this.cfr_renamed_3 = sprlc2.cfr_renamed_1218();
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        spromd spromd2;
        if (!(arg0 instanceof sprund)) {
            throw new IllegalArgumentException(sprcye.cfr_renamed_9("\u0014>\u00183|\u0005=\u0007=\u00189\u00019\u0007/U.\u0010-\u00005\u00079\u0011|\u00133\u0007|=\u00171\u001a7%\u00019\u0006\u001b\u00102\u0010.\u0014(\u001a."));
        }
        sprund sprund2 = (sprund)arg0;
        if (sprund2.cfr_renamed_3366()) {
            spromd spromd3 = this;
            spromd2 = spromd3;
            spromd3.cfr_renamed_1.cfr_renamed_1524(new sprnld(sprund2.cfr_renamed_3362()));
        } else {
            spromd spromd4 = this;
            spromd2 = spromd4;
            spromd4.cfr_renamed_1.cfr_renamed_1524(this.cfr_renamed_3512(sprund2.cfr_renamed_1477(), sprund2.cfr_renamed_3362()));
        }
        spromd2.cfr_renamed_0 = sprund2.cfr_renamed_3365();
        this.cfr_renamed_4 = 0;
        this.cfr_renamed_2 = new byte[this.cfr_renamed_3];
    }

    public sprlc cfr_renamed_580() {
        return this.cfr_renamed_1.cfr_renamed_3069();
    }

    private /* synthetic */ void cfr_renamed_3513() throws sprjkd {
        spromd spromd2 = this;
        int n = spromd2.cfr_renamed_4 / spromd2.cfr_renamed_3 + 1;
        if (n >= 256) {
            throw new sprjkd(sprupn.cfr_renamed_9("a?m2\t\u0017H\u001aG\u001b]TN\u0011G\u0011[\u0015]\u0011\t\u0019F\u0006LT]\u001cH\u001a\tF\u001cA\t\u0016E\u001bJ\u001fZTF\u0012\t<H\u0007A8L\u001a\t\u0007@\u000eL"));
        }
        if (this.cfr_renamed_4 != 0) {
            spromd spromd3 = this;
            spromd3.cfr_renamed_1.cfr_renamed_1197(spromd3.cfr_renamed_2, 0, this.cfr_renamed_3);
        }
        spromd spromd4 = this;
        spromd4.cfr_renamed_1.cfr_renamed_1197(spromd4.cfr_renamed_0, 0, this.cfr_renamed_0.length);
        spromd spromd5 = this;
        spromd5.cfr_renamed_1.cfr_renamed_1221((byte)n);
        spromd5.cfr_renamed_1.cfr_renamed_1219(this.cfr_renamed_2, 0);
    }
}

