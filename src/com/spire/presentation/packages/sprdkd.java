/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtaz;

public class sprdkd
implements sprqk {
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private static final int cfr_renamed_3 = 256;
    private byte[] cfr_renamed_4;

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg1 instanceof sprnld) {
            this.cfr_renamed_1 = ((sprnld)arg1).cfr_renamed_1521();
            sprdkd sprdkd2 = this;
            sprdkd2.cfr_renamed_2402(sprdkd2.cfr_renamed_1);
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqyo.cfr_renamed_9("1\u0004.\u000b4\u0003<J(\u000b*\u000b5\u000f,\u000f*J(\u000b+\u0019=\u000ex\u001e7J\n)lJ1\u00041\u001exGx")).append(arg1.getClass().getName()).toString());
    }

    @Override
    public void cfr_renamed_41() {
        sprdkd sprdkd2 = this;
        sprdkd2.cfr_renamed_2402(sprdkd2.cfr_renamed_1);
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        sprdkd sprdkd2 = this;
        sprdkd2.cfr_renamed_2 = sprdkd2.cfr_renamed_2 + 1 & 0xFF;
        sprdkd2.cfr_renamed_0 = sprdkd2.cfr_renamed_4[this.cfr_renamed_2] + this.cfr_renamed_0 & 0xFF;
        byte by = sprdkd2.cfr_renamed_4[this.cfr_renamed_2];
        sprdkd sprdkd3 = this;
        sprdkd2.cfr_renamed_4[sprdkd3.cfr_renamed_2] = sprdkd3.cfr_renamed_4[this.cfr_renamed_0];
        sprdkd2.cfr_renamed_4[this.cfr_renamed_0] = by;
        sprdkd sprdkd4 = this;
        sprdkd sprdkd5 = this;
        return (byte)(arg0 ^ sprdkd4.cfr_renamed_4[sprdkd4.cfr_renamed_4[this.cfr_renamed_2] + sprdkd5.cfr_renamed_4[sprdkd5.cfr_renamed_0] & 0xFF]);
    }

    public sprdkd() {
        sprdkd sprdkd2 = this;
        sprdkd sprdkd3 = this;
        sprdkd3.cfr_renamed_4 = null;
        sprdkd3.cfr_renamed_2 = 0;
        sprdkd2.cfr_renamed_0 = 0;
        sprdkd2.cfr_renamed_1 = null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2402(byte[] byArray) {
        int n;
        int n2;
        void arg0;
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = 0;
        this.cfr_renamed_0 = 0;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = new byte[256];
        }
        int n3 = n2 = 0;
        while (n3 < 256) {
            int n4 = n2++;
            this.cfr_renamed_4[n4] = (byte)n4;
            n3 = n2;
        }
        n2 = 0;
        int n5 = 0;
        int n6 = n = 0;
        while (n6 < 256) {
            n5 = (arg0[n2] & 0xFF) + this.cfr_renamed_4[n] + n5 & 0xFF;
            sprdkd sprdkd2 = this;
            byte by = sprdkd2.cfr_renamed_4[n];
            sprdkd sprdkd3 = this;
            sprdkd2.cfr_renamed_4[n] = sprdkd3.cfr_renamed_4[n5];
            sprdkd3.cfr_renamed_4[n5] = by;
            n2 = (n2 + 1) % ((void)arg0).length;
            n6 = ++n;
        }
    }

    @Override
    public String cfr_renamed_1315() {
        return sprtaz.cfr_renamed_9("hI\u000e");
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (arg1 + arg2 > arg0.length) {
            throw new sprjkd(sprqyo.cfr_renamed_9("\u00036\u001a-\u001ex\b-\f>\u000f*J,\u00057J+\u00027\u0018,"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new spreid(sprtaz.cfr_renamed_9("U\u007fNzO~\u001ahOl\\oH*NeU*IbUxN"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            sprdkd sprdkd2 = this;
            sprdkd2.cfr_renamed_2 = sprdkd2.cfr_renamed_2 + 1 & 0xFF;
            sprdkd2.cfr_renamed_0 = sprdkd2.cfr_renamed_4[this.cfr_renamed_2] + this.cfr_renamed_0 & 0xFF;
            byte by = sprdkd2.cfr_renamed_4[this.cfr_renamed_2];
            sprdkd sprdkd3 = this;
            sprdkd2.cfr_renamed_4[sprdkd3.cfr_renamed_2] = sprdkd3.cfr_renamed_4[this.cfr_renamed_0];
            sprdkd2.cfr_renamed_4[this.cfr_renamed_0] = by;
            int n3 = n + arg4;
            sprdkd sprdkd4 = this;
            sprdkd sprdkd5 = this;
            byte by2 = (byte)(arg0[n + arg1] ^ sprdkd4.cfr_renamed_4[sprdkd4.cfr_renamed_4[this.cfr_renamed_2] + sprdkd5.cfr_renamed_4[sprdkd5.cfr_renamed_0] & 0xFF]);
            arg3[n3] = by2;
            n2 = ++n;
        }
        return arg2;
    }
}

