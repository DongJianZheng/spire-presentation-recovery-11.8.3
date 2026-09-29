/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfoo;
import com.spire.presentation.packages.sprp;
import com.spire.presentation.packages.sprsvh;

public class sprnva {
    public int cfr_renamed_2;
    public sprp cfr_renamed_3;
    public byte[] cfr_renamed_4;

    public int cfr_renamed_504(byte arg0, byte[] arg1, int arg2) {
        int n = 0;
        this.cfr_renamed_4[this.cfr_renamed_2++] = arg0;
        sprnva sprnva2 = this;
        if (sprnva2.cfr_renamed_2 == sprnva2.cfr_renamed_4.length) {
            sprnva sprnva3 = this;
            n = sprnva3.cfr_renamed_3.cfr_renamed_499(sprnva3.cfr_renamed_4, 0, this.cfr_renamed_4.length, arg1, arg2);
            this.cfr_renamed_2 = 0;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprnva(sprp sprp2, int n) {
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        if (n % arg0.cfr_renamed_2() != 0) {
            throw new IllegalArgumentException(sprfoo.cfr_renamed_9("\u0016\\\u0012O\u0011[TZ\u001dS\u0011\t\u001aF\u0000\t\u0019\\\u0018]\u001dY\u0018LTF\u0012\t\u001dG\u0004\\\u0000\t\u0016E\u001bJ\u001f\t\u0007@\u000eL"));
        }
        this.cfr_renamed_4 = new byte[arg1];
        this.cfr_renamed_2 = 0;
    }

    public int cfr_renamed_505(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg2 < 0) {
            throw new IllegalArgumentException(sprsvh.cfr_renamed_9("%\u0014\bR\u0012U\u000e\u0014\u0010\u0010F\u0014F\u001b\u0003\u0012\u0007\u0001\u000f\u0003\u0003U\u000f\u001b\u0016\u0000\u0012U\n\u0010\b\u0012\u0012\u001dG"));
        }
        int n = 0;
        int n2 = this.cfr_renamed_4.length - this.cfr_renamed_2;
        if (arg2 > n2) {
            sprnva sprnva2 = this;
            System.arraycopy(arg0, arg1, sprnva2.cfr_renamed_4, sprnva2.cfr_renamed_2, n2);
            sprnva sprnva3 = this;
            n += sprnva3.cfr_renamed_3.cfr_renamed_499(sprnva3.cfr_renamed_4, 0, this.cfr_renamed_4.length, arg3, arg4);
            this.cfr_renamed_2 = 0;
            arg4 += n;
            int n3 = arg2 -= n2;
            int n4 = n3 - n3 % this.cfr_renamed_4.length;
            n += this.cfr_renamed_3.cfr_renamed_499(arg0, arg1 += n2, n4, arg3, arg4);
            arg2 -= n4;
            arg1 += n4;
        }
        if (arg2 != 0) {
            sprnva sprnva4 = this;
            System.arraycopy(arg0, arg1, sprnva4.cfr_renamed_4, this.cfr_renamed_2, arg2);
            sprnva4.cfr_renamed_2 += arg2;
        }
        return n;
    }
}

