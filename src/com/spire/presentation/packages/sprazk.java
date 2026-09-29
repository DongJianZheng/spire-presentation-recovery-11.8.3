/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracda;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfdl;
import com.spire.presentation.packages.sprkrl;
import com.spire.presentation.packages.sprlrk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprybl;

public class sprazk
implements sprvv {
    private boolean cfr_renamed_91;
    private int cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private static final int cfr_renamed_2 = 256;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_41() {
        sprazk sprazk2 = this;
        sprazk2.cfr_renamed_2402(sprazk2.cfr_renamed_1);
    }

    @Override
    public byte cfr_renamed_3243(byte arg0) {
        sprazk sprazk2 = this;
        sprazk2.cfr_renamed_0 = sprazk2.cfr_renamed_0 + 1 & 0xFF;
        sprazk2.cfr_renamed_4 = sprazk2.cfr_renamed_3[this.cfr_renamed_0] + this.cfr_renamed_4 & 0xFF;
        byte by = sprazk2.cfr_renamed_3[this.cfr_renamed_0];
        sprazk sprazk3 = this;
        sprazk2.cfr_renamed_3[sprazk3.cfr_renamed_0] = sprazk3.cfr_renamed_3[this.cfr_renamed_4];
        sprazk2.cfr_renamed_3[this.cfr_renamed_4] = by;
        sprazk sprazk4 = this;
        sprazk sprazk5 = this;
        return (byte)(arg0 ^ sprazk4.cfr_renamed_3[sprazk4.cfr_renamed_3[this.cfr_renamed_0] + sprazk5.cfr_renamed_3[sprazk5.cfr_renamed_4] & 0xFF]);
    }

    @Override
    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        int n;
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprkrl.cfr_renamed_9(")<0'4r\"'&4% `&/=`!(=2&"));
        }
        if (arg4 + arg2 > arg3.length) {
            throw new sprwjl(spracda.cfr_renamed_9("!\u001c:\u0019;\u001dn\u000b;\u000f(\f<I:\u0006!I=\u0001!\u001b:"));
        }
        int n2 = n = 0;
        while (n2 < arg2) {
            sprazk sprazk2 = this;
            sprazk2.cfr_renamed_0 = sprazk2.cfr_renamed_0 + 1 & 0xFF;
            sprazk2.cfr_renamed_4 = sprazk2.cfr_renamed_3[this.cfr_renamed_0] + this.cfr_renamed_4 & 0xFF;
            byte by = sprazk2.cfr_renamed_3[this.cfr_renamed_0];
            sprazk sprazk3 = this;
            sprazk2.cfr_renamed_3[sprazk3.cfr_renamed_0] = sprazk3.cfr_renamed_3[this.cfr_renamed_4];
            sprazk2.cfr_renamed_3[this.cfr_renamed_4] = by;
            int n3 = n + arg4;
            sprazk sprazk4 = this;
            sprazk sprazk5 = this;
            byte by2 = (byte)(arg0[n + arg1] ^ sprazk4.cfr_renamed_3[sprazk4.cfr_renamed_3[this.cfr_renamed_0] + sprazk5.cfr_renamed_3[sprazk5.cfr_renamed_4] & 0xFF]);
            arg3[n3] = by2;
            n2 = ++n;
        }
        return arg2;
    }

    @Override
    public String cfr_renamed_1315() {
        return sprkrl.cfr_renamed_9("\u0000\u0003f");
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_2402(byte[] byArray) {
        int n;
        int n2;
        void arg0;
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_0 = 0;
        this.cfr_renamed_4 = 0;
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = new byte[256];
        }
        int n3 = n2 = 0;
        while (n3 < 256) {
            int n4 = n2++;
            this.cfr_renamed_3[n4] = (byte)n4;
            n3 = n2;
        }
        n2 = 0;
        int n5 = 0;
        int n6 = n = 0;
        while (n6 < 256) {
            n5 = (arg0[n2] & 0xFF) + this.cfr_renamed_3[n] + n5 & 0xFF;
            sprazk sprazk2 = this;
            byte by = sprazk2.cfr_renamed_3[n];
            sprazk sprazk3 = this;
            sprazk2.cfr_renamed_3[n] = sprazk3.cfr_renamed_3[n5];
            sprazk3.cfr_renamed_3[n5] = by;
            n2 = (n2 + 1) % ((void)arg0).length;
            n6 = ++n;
        }
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg1 instanceof sprtpk) {
            this.cfr_renamed_1 = ((sprtpk)arg1).cfr_renamed_1521();
            sprazk sprazk2 = this;
            sprazk2.cfr_renamed_91 = arg0;
            sprazk2.cfr_renamed_2402(sprazk2.cfr_renamed_1);
            sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 20, arg1, sprlrk.cfr_renamed_9915(arg0)));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, spracda.cfr_renamed_9("'\u00078\b\"\u0000*I>\b<\b#\f:\f<I>\b=\u001a+\rn\u001d!I\u001c*zI'\u0007'\u001dnDn")).append(arg1.getClass().getName()).toString());
    }

    public sprazk() {
        sprazk sprazk2 = this;
        sprazk sprazk3 = this;
        sprazk3.cfr_renamed_3 = null;
        sprazk3.cfr_renamed_0 = 0;
        sprazk2.cfr_renamed_4 = 0;
        sprazk2.cfr_renamed_1 = null;
        sprybl.cfr_renamed_9170(new sprfdl(this.cfr_renamed_1315(), 20));
    }
}

