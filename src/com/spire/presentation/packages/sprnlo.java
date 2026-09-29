/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprlrn;
import com.spire.presentation.packages.sprmrn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryjo;

@sprtea
public class sprnlo
extends spryjo {
    private int[] cfr_renamed_2;
    private int[] cfr_renamed_3;
    private int[] cfr_renamed_4;

    @Override
    public sprmrn cfr_renamed_16288(sprsuja[] arg0, sprwbp[] arg1) {
        int n;
        sprmrn sprmrn2 = new sprmrn();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.length) {
            sprlrn sprlrn2;
            sprsuja sprsuja2 = arg0[this.cfr_renamed_4[n]];
            sprsuja sprsuja3 = arg0[this.cfr_renamed_3[n]];
            sprsuja sprsuja4 = arg0[this.cfr_renamed_2[n]];
            sprwbp sprwbp2 = arg1[this.cfr_renamed_4[n]];
            sprwbp sprwbp3 = arg1[this.cfr_renamed_3[n]];
            sprwbp sprwbp4 = arg1[this.cfr_renamed_2[n]];
            sprsuja[] sprsujaArray = new sprsuja[3];
            sprsujaArray[0] = sprsuja2;
            sprsujaArray[1] = sprsuja3;
            sprsujaArray[2] = sprsuja4;
            sprxln sprxln2 = sprxln.cfr_renamed_13644(sprsujaArray, false, true);
            sprlrn sprlrn3 = sprlrn2 = new sprlrn(sprxln2.cfr_renamed_12099(), sprsuja2);
            sprlrn3.cfr_renamed_13860(sprwbp2);
            sprwbp[] sprwbpArray = new sprwbp[3];
            sprwbpArray[0] = sprwbp2;
            sprwbpArray[1] = sprwbp3;
            sprwbpArray[2] = sprwbp4;
            sprlrn3.cfr_renamed_13861(sprwbpArray);
            sprxln2.cfr_renamed_12550(sprlrn2.cfr_renamed_13863() ? sprlrn2 : null);
            sprmrn2.cfr_renamed_12507(sprxln2);
            n2 = ++n;
        }
        return sprmrn2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_16289(sprhio sprhio2, int n) {
        int n2;
        void arg1;
        sprnlo sprnlo2 = this;
        void v1 = arg1;
        this.cfr_renamed_4 = new int[v1];
        sprnlo2.cfr_renamed_3 = new int[v1];
        sprnlo2.cfr_renamed_2 = new int[arg1];
        int n3 = n2 = 0;
        while (n3 < arg1) {
            void arg0;
            sprnlo sprnlo3 = this;
            sprnlo3.cfr_renamed_4[n2] = arg0.cfr_renamed_12261();
            sprnlo3.cfr_renamed_3[n2] = arg0.cfr_renamed_12261();
            sprnlo3.cfr_renamed_2[n2++] = arg0.cfr_renamed_12261();
            n3 = n2;
        }
    }
}

