/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprnvz;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprwgo;
import com.spire.presentation.packages.sprwjl;

public class sprlll
implements sprjs {
    private byte[] cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprgf cfr_renamed_4;

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

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        if (arg0 instanceof sprook) {
            sprook sprook2 = (sprook)arg0;
            sprlll sprlll2 = this;
            sprlll2.cfr_renamed_1 = sprook2.cfr_renamed_2343();
            sprlll2.cfr_renamed_3 = sprook2.cfr_renamed_1205();
            return;
        }
        throw new IllegalArgumentException(sprwgo.cfr_renamed_9("IYD=r|p|oxvxpn\"oglwtpxf=drp=exlxp|vrp"));
    }

    /*
     * WARNING - void declaration
     */
    public sprlll(sprgf sprgf2) {
        void arg0;
        sprlll sprlll2 = this;
        sprlll2.cfr_renamed_4 = arg0;
        sprlll2.cfr_renamed_2 = sprgf2.cfr_renamed_1218();
    }

    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        if (arg2 <= 0) {
            throw new IllegalArgumentException(sprnvz.cfr_renamed_9("\"$ a#4=5n#+apa~"));
        }
        if (arg0.length - arg2 < arg1) {
            throw new sprwjl(sprwgo.cfr_renamed_9("mhvmwi\"\u007fw{dxp=vrm=qpcqn"));
        }
        sprlll sprlll2 = this;
        byte[] byArray = new byte[sprlll2.cfr_renamed_2];
        byte[] byArray2 = new byte[4];
        int n = 1;
        int n2 = 0;
        sprlll2.cfr_renamed_4.cfr_renamed_41();
        if (arg2 > this.cfr_renamed_2) {
            do {
                sprlll sprlll3 = this;
                sprlll3.cfr_renamed_3279(n, byArray2);
                sprlll3.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
                sprlll sprlll4 = this;
                sprlll4.cfr_renamed_4.cfr_renamed_1197(sprlll4.cfr_renamed_1, 0, this.cfr_renamed_1.length);
                sprlll sprlll5 = this;
                sprlll5.cfr_renamed_4.cfr_renamed_1197(sprlll5.cfr_renamed_3, 0, this.cfr_renamed_3.length);
                this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
                System.arraycopy(byArray, 0, arg0, arg1 + n2, this.cfr_renamed_2);
                n2 += this.cfr_renamed_2;
            } while (n++ < arg2 / this.cfr_renamed_2);
        }
        if (n2 < arg2) {
            sprlll sprlll6 = this;
            sprlll6.cfr_renamed_3279(n, byArray2);
            sprlll6.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
            sprlll sprlll7 = this;
            sprlll7.cfr_renamed_4.cfr_renamed_1197(sprlll7.cfr_renamed_1, 0, this.cfr_renamed_1.length);
            sprlll sprlll8 = this;
            sprlll8.cfr_renamed_4.cfr_renamed_1197(sprlll8.cfr_renamed_3, 0, this.cfr_renamed_3.length);
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            System.arraycopy(byArray, 0, arg0, arg1 + n2, arg2 - n2);
        }
        return arg2;
    }
}

