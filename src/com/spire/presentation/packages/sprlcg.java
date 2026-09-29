/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczf;
import com.spire.presentation.packages.sprhwf;
import com.spire.presentation.packages.sprkag;
import com.spire.presentation.packages.sproh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtff;
import com.spire.presentation.packages.sprvuf;
import com.spire.presentation.packages.sprzfl;

public class sprlcg
implements sproh {
    private final sprczf cfr_renamed_3;
    private final sprvuf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprlcg(sprczf sprczf2) {
        void arg0;
        sprlcg sprlcg2 = this;
        sprlcg2.cfr_renamed_4 = arg0.cfr_renamed_284();
        sprlcg2.cfr_renamed_3 = sprczf2;
    }

    private /* synthetic */ void cfr_renamed_6400(byte[] arg0, byte[] arg1, byte arg2) {
        int n;
        arg2 = (byte)(~arg2 + 1);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3 = n;
            byte by = (byte)(arg0[n3] ^ arg2 & (arg1[n] ^ arg0[n]));
            arg0[n3] = by;
            n2 = ++n;
        }
    }

    @Override
    public byte[] cfr_renamed_5685(byte[] arg0) {
        sprlcg sprlcg2 = this;
        sprtff sprtff2 = sprlcg2.cfr_renamed_4.cfr_renamed_3;
        byte[] byArray = sprlcg2.cfr_renamed_3.cfr_renamed_4;
        byte[] byArray2 = new byte[sprtff2.cfr_renamed_5430() + sprtff2.cfr_renamed_5436()];
        sprkag sprkag2 = new sprhwf(sprtff2).cfr_renamed_123(arg0, this.cfr_renamed_3.cfr_renamed_4);
        byte[] byArray3 = sprkag2.cfr_renamed_4;
        int n = sprkag2.cfr_renamed_3;
        sprzfl sprzfl2 = new sprzfl(256);
        byte[] byArray4 = new byte[sprzfl2.cfr_renamed_1218()];
        sprzfl2.cfr_renamed_1197(byArray3, 0, byArray3.length);
        sprzfl2.cfr_renamed_1219(byArray4, 0);
        int n2 = 0;
        int n3 = n2;
        while (n3 < sprtff2.cfr_renamed_5430()) {
            int n4 = n2++;
            byArray2[n4] = byArray[n4 + sprtff2.cfr_renamed_5427()];
            n3 = n2;
        }
        int n5 = n2 = 0;
        while (n5 < sprtff2.cfr_renamed_5436()) {
            int n6 = sprtff2.cfr_renamed_5430() + n2;
            byte by = arg0[n2];
            byArray2[n6] = by;
            n5 = ++n2;
        }
        sprzfl2.cfr_renamed_41();
        sprzfl2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprzfl2.cfr_renamed_1219(byArray3, 0);
        byte[] byArray5 = byArray4;
        this.cfr_renamed_6400(byArray5, byArray3, (byte)n);
        byte[] byArray6 = sproze.cfr_renamed_533(byArray4, 0, sprtff2.cfr_renamed_5437());
        sproze.cfr_renamed_3408(byArray5);
        return byArray6;
    }

    @Override
    public int cfr_renamed_5687() {
        return this.cfr_renamed_4.cfr_renamed_3.cfr_renamed_5436();
    }
}

