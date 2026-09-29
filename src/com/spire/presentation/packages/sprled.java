/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchd;
import com.spire.presentation.packages.sprdsh;
import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprib;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.spruyda;

public class sprled
implements sprib {
    private int cfr_renamed_2;
    private sprlc cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public sprlc cfr_renamed_580() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprled(sprlc sprlc2) {
        void arg0;
        sprled sprled2 = this;
        sprled2.cfr_renamed_3 = arg0;
        sprled2.cfr_renamed_2 = sprlc2.cfr_renamed_1218();
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        if (!(arg0 instanceof sprchd)) {
            throw new IllegalArgumentException(spruyda.cfr_renamed_9("EhN\u000fxNzNeJ|Jz\\(]m^}FzJl\u000fn@z\u000fEhN\u001eOJfJzN|@z"));
        }
        sprchd sprchd2 = (sprchd)arg0;
        this.cfr_renamed_4 = sprchd2.cfr_renamed_2113();
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        if (arg0.length - arg2 < arg1) {
            throw new sprjkd(sprdsh.cfr_renamed_9("L4W1V5\u0003#V'E$QaW.LaP,B-O"));
        }
        sprled sprled2 = this;
        byte[] byArray = new byte[sprled2.cfr_renamed_2];
        byte[] byArray2 = new byte[4];
        int n = 0;
        sprled2.cfr_renamed_3.cfr_renamed_41();
        if (arg2 > this.cfr_renamed_2) {
            do {
                sprled sprled3 = this;
                sprled3.cfr_renamed_3279(n, byArray2);
                sprled3.cfr_renamed_3.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
                this.cfr_renamed_3.cfr_renamed_1197(byArray2, 0, byArray2.length);
                this.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
                int n2 = arg1 + n * this.cfr_renamed_2;
                System.arraycopy(byArray, 0, arg0, n2, this.cfr_renamed_2);
            } while (++n < arg2 / this.cfr_renamed_2);
        }
        if (n * this.cfr_renamed_2 < arg2) {
            sprled sprled4 = this;
            sprled4.cfr_renamed_3279(n, byArray2);
            sprled4.cfr_renamed_3.cfr_renamed_1197(this.cfr_renamed_4, 0, this.cfr_renamed_4.length);
            this.cfr_renamed_3.cfr_renamed_1197(byArray2, 0, byArray2.length);
            this.cfr_renamed_3.cfr_renamed_1219(byArray, 0);
            System.arraycopy(byArray, 0, arg0, arg1 + n * this.cfr_renamed_2, arg2 - n * this.cfr_renamed_2);
        }
        return arg2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ void cfr_renamed_3279(int n, byte[] byArray) {
        void arg0;
        void arg1;
        void v0 = arg1;
        void v1 = arg1;
        v1[0] = (byte)(arg0 >>> 24);
        v1[1] = (byte)(arg0 >>> 16);
        v0[2] = (byte)(arg0 >>> 8);
        v0[3] = (byte)(arg0 >>> 0);
    }
}

