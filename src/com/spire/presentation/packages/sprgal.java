/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbql;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjhk;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprzcf;

public class sprgal
implements sprjs {
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprgf cfr_renamed_4;

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        if (arg0.length - arg2 < arg1) {
            throw new sprwjl(sprzcf.cfr_renamed_9("\u000eF\u0015C\u0014GAQ\u0014U\u0007V\u0013\u0013\u0015\\\u000e\u0013\u0012^\u0000_\r"));
        }
        sprgal sprgal2 = this;
        byte[] byArray = new byte[sprgal2.cfr_renamed_2];
        byte[] byArray2 = new byte[4];
        int n = 0;
        sprgal2.cfr_renamed_4.cfr_renamed_41();
        if (arg2 > this.cfr_renamed_2) {
            do {
                sprgal sprgal3 = this;
                sprgal3.cfr_renamed_3279(n, byArray2);
                sprgal3.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
                this.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
                this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
                int n2 = arg1 + n * this.cfr_renamed_2;
                System.arraycopy(byArray, 0, arg0, n2, this.cfr_renamed_2);
            } while (++n < arg2 / this.cfr_renamed_2);
        }
        if (n * this.cfr_renamed_2 < arg2) {
            sprgal sprgal4 = this;
            sprgal4.cfr_renamed_3279(n, byArray2);
            sprgal4.cfr_renamed_4.cfr_renamed_1197(this.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            this.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            System.arraycopy(byArray, 0, arg0, arg1 + n * this.cfr_renamed_2, arg2 - n * this.cfr_renamed_2);
        }
        return arg2;
    }

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        if (!(arg0 instanceof sprjhk)) {
            throw new IllegalArgumentException(sprbql.cfr_renamed_9("jqa\u0016WWUWJSSSUE\u0007DBGR_USC\u0016AYU\u0016jqa\u0007`SISUWSYU"));
        }
        sprjhk sprjhk2 = (sprjhk)arg0;
        this.cfr_renamed_3 = sprjhk2.cfr_renamed_2113();
    }

    /*
     * WARNING - void declaration
     */
    public sprgal(sprgf sprgf2) {
        void arg0;
        sprgal sprgal2 = this;
        sprgal2.cfr_renamed_4 = arg0;
        sprgal2.cfr_renamed_2 = sprgf2.cfr_renamed_1218();
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

    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_4;
    }
}

