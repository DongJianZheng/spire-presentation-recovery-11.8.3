/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprced;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruc;
import com.spire.presentation.packages.sprxsb;

public class sprryca
extends sprxsb {
    private spruc cfr_renamed_3;
    private byte[] cfr_renamed_4;

    @Override
    public sprt cfr_renamed_1518(int arg0, int arg1) {
        byte[] byArray = this.cfr_renamed_3504((arg0 /= 8) + (arg1 /= 8));
        return new sprnjd(new sprnld(byArray, 0, arg0), byArray, arg0, arg1);
    }

    private /* synthetic */ byte[] cfr_renamed_3504(int n) {
        int n2;
        int n3 = this.cfr_renamed_3.cfr_renamed_2404();
        int n4 = (n + n3 - 1) / n3;
        byte[] byArray = new byte[4];
        byte[] byArray2 = new byte[n4 * n3];
        int n5 = 0;
        sprryca sprryca2 = this;
        sprnld sprnld2 = new sprnld(sprryca2.cfr_renamed_2);
        sprryca2.cfr_renamed_3.cfr_renamed_1524(sprnld2);
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
            sprryca sprryca3 = this;
            sprryca3.cfr_renamed_3505((byte[])sprryca3.cfr_renamed_3, (int)sprryca3.cfr_renamed_4, byArray, byArray2, n5);
            n5 += n3;
            n6 = ++n2;
        }
        return byArray2;
    }

    public sprryca() {
        this(new sprlid());
    }

    private /* synthetic */ void cfr_renamed_3505(byte[] arg0, int arg1, byte[] arg2, byte[] arg3, int arg4) {
        int n;
        if (arg1 == 0) {
            throw new IllegalArgumentException(sprqad.cfr_renamed_9("\u000eP\u0002V\u0006P\u000eK\t\u0004\u0004K\u0012J\u0013\u0004\nQ\u0014PGF\u0002\u0004\u0006PGH\u0002E\u0014PG\u0015I"));
        }
        if (arg0 != null) {
            this.cfr_renamed_3.cfr_renamed_1197(arg0, 0, arg0.length);
        }
        this.cfr_renamed_3.cfr_renamed_1197(arg2, 0, arg2.length);
        sprryca sprryca2 = this;
        this.cfr_renamed_3.cfr_renamed_1219(sprryca2.cfr_renamed_4, 0);
        System.arraycopy(sprryca2.cfr_renamed_4, 0, arg3, arg4, this.cfr_renamed_4.length);
        int n2 = n = 1;
        while (n2 < arg1) {
            sprryca sprryca3 = this;
            sprryca3.cfr_renamed_3.cfr_renamed_1197(sprryca3.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            sprryca sprryca4 = this;
            sprryca4.cfr_renamed_3.cfr_renamed_1219(sprryca4.cfr_renamed_4, 0);
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
    public sprt cfr_renamed_249(int arg0) {
        byte[] byArray = this.cfr_renamed_3504(arg0 /= 8);
        return new sprnld(byArray, 0, arg0);
    }

    public sprryca(sprlc arg0) {
        this.cfr_renamed_3 = new sprced(arg0);
        this.cfr_renamed_4 = new byte[this.cfr_renamed_3.cfr_renamed_2404()];
    }

    @Override
    public sprt cfr_renamed_1523(int arg0) {
        return this.cfr_renamed_249(arg0);
    }
}

