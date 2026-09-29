/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprfwk;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprpcka;
import com.spire.presentation.packages.sprtpk;

public class sprnrk
extends sprkuh {
    private spraq cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public sprbj cfr_renamed_1518(int arg0, int arg1) {
        byte[] byArray = this.cfr_renamed_3504((arg0 /= 8) + (arg1 /= 8));
        return new sprkpk(new sprtpk(byArray, 0, arg0), byArray, arg0, arg1);
    }

    public sprnrk() {
        this(sprkkk.cfr_renamed_5701());
    }

    private /* synthetic */ void cfr_renamed_3505(byte[] arg0, int arg1, byte[] arg2, byte[] arg3, int arg4) {
        int n;
        if (arg1 == 0) {
            throw new IllegalArgumentException(sprpcka.cfr_renamed_9("HIDO@IHRO\u001dBRTSU\u001dLHRI\u0001_D\u001d@I\u0001QD\\RI\u0001\f\u000f"));
        }
        if (arg0 != null) {
            this.cfr_renamed_3.cfr_renamed_1197(arg0, 0, arg0.length);
        }
        this.cfr_renamed_3.cfr_renamed_1197(arg2, 0, arg2.length);
        sprnrk sprnrk2 = this;
        this.cfr_renamed_3.cfr_renamed_1219(sprnrk2.cfr_renamed_4, 0);
        System.arraycopy(sprnrk2.cfr_renamed_4, 0, arg3, arg4, this.cfr_renamed_4.length);
        int n2 = n = 1;
        while (n2 < arg1) {
            sprnrk sprnrk3 = this;
            sprnrk3.cfr_renamed_3.cfr_renamed_1197(sprnrk3.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            sprnrk sprnrk4 = this;
            sprnrk4.cfr_renamed_3.cfr_renamed_1219(sprnrk4.cfr_renamed_4, 0);
            int n3 = 0;
            int n4 = n3;
            while (n4 != this.cfr_renamed_4.length) {
                int n5 = arg4 + n3;
                byte by = (byte)(arg3[n5] ^ this.cfr_renamed_4[n3]);
                arg3[n5] = by;
                n4 = ++n3;
            }
            n2 = ++n;
        }
    }

    @Override
    public sprbj cfr_renamed_1523(int arg0) {
        return this.cfr_renamed_249(arg0);
    }

    private /* synthetic */ byte[] cfr_renamed_3504(int n) {
        int n2;
        int n3 = this.cfr_renamed_3.cfr_renamed_2404();
        int n4 = (n + n3 - 1) / n3;
        byte[] byArray = new byte[4];
        byte[] byArray2 = new byte[n4 * n3];
        int n5 = 0;
        sprnrk sprnrk2 = this;
        sprtpk sprtpk2 = new sprtpk((byte[])sprnrk2.cfr_renamed_3);
        sprnrk2.cfr_renamed_3.cfr_renamed_5692(sprtpk2);
        int n6 = n2 = 1;
        while (n6 <= n4) {
            int n7 = 3;
            byte[] byArray3 = byArray;
            while (true) {
                int n8 = n7--;
                byArray3[n8] = (byte)(byArray3[n8] + 1);
                if (byArray3[n8] != 0) break;
                byArray3 = byArray;
            }
            sprnrk sprnrk3 = this;
            sprnrk3.cfr_renamed_3505(sprnrk3.cfr_renamed_2, (int)sprnrk3.cfr_renamed_4, byArray, byArray2, n5);
            n5 += n3;
            n6 = ++n2;
        }
        return byArray2;
    }

    @Override
    public sprbj cfr_renamed_249(int arg0) {
        byte[] byArray = this.cfr_renamed_3504(arg0 /= 8);
        return new sprtpk(byArray, 0, arg0);
    }

    public sprnrk(sprgf arg0) {
        this.cfr_renamed_3 = new sprfwk(arg0);
        this.cfr_renamed_4 = new byte[this.cfr_renamed_3.cfr_renamed_2404()];
    }
}

