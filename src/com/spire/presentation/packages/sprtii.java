/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdab;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprywc;

public class sprtii
implements sprjs {
    private sprgf cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        int n;
        if (arg0.length - arg2 < arg1) {
            throw new sprwjl(sprywc.cfr_renamed_9("\u0019a\u0002d\u0003`Vv\u0003r\u0010q\u00044\u0002{\u00194\u0005y\u0017x\u001a"));
        }
        long l = (long)arg2 * 8L;
        if (l > (long)this.cfr_renamed_2.cfr_renamed_1218() * 8L * 0x80000000L) {
            throw new IllegalArgumentException(sprdab.cfr_renamed_9("]4f1g52-w/u5zaf.}a~ `&w"));
        }
        int n2 = (int)(l / (long)this.cfr_renamed_2.cfr_renamed_1218());
        byte[] byArray = null;
        byArray = new byte[this.cfr_renamed_2.cfr_renamed_1218()];
        int n3 = n = 1;
        while (n3 <= n2) {
            sprtii sprtii2 = this;
            sprtii2.cfr_renamed_2.cfr_renamed_1197(sprtii2.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            sprtii sprtii3 = this;
            sprtii3.cfr_renamed_2.cfr_renamed_1221((byte)(n & 0xFF));
            sprtii3.cfr_renamed_2.cfr_renamed_1221((byte)(n >> 8 & 0xFF));
            sprtii3.cfr_renamed_2.cfr_renamed_1221((byte)(n >> 16 & 0xFF));
            sprtii3.cfr_renamed_2.cfr_renamed_1221((byte)(n >> 24 & 0xFF));
            sprtii3.cfr_renamed_2.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            this.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
            if (arg2 - arg1 > byArray.length) {
                System.arraycopy(byArray, 0, arg0, arg1, byArray.length);
                arg1 += byArray.length;
            } else {
                int n4 = arg1;
                System.arraycopy(byArray, 0, arg0, n4, arg2 - n4);
            }
            n3 = ++n;
        }
        this.cfr_renamed_2.cfr_renamed_41();
        return arg2;
    }

    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_2;
    }

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        if (!(arg0 instanceof sprook)) {
            throw new IllegalArgumentException(sprywc.cfr_renamed_9("=P04\u0006u\u0004u\u001bq\u0002q\u0004gVf\u0013e\u0003}\u0004q\u00124\u0010{\u00044\u0011q\u0018q\u0004u\u0002{\u0004"));
        }
        sprook sprook2 = (sprook)arg0;
        sprtii sprtii2 = this;
        sprtii2.cfr_renamed_4 = sprook2.cfr_renamed_2343();
        sprtii2.cfr_renamed_3 = sprook2.cfr_renamed_1205();
    }

    public sprtii(sprgf sprgf2) {
        this.cfr_renamed_2 = sprgf2;
    }
}

