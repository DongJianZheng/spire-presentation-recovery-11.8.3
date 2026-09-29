/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgmm;
import com.spire.presentation.packages.sprrnl;
import com.spire.presentation.packages.sprsom;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.spryql;
import java.util.ArrayList;
import java.util.List;

public class sprrwl {
    private final sprxpm[] cfr_renamed_3;
    private final List<sprsom> cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprrwl(sprtpl ... sprtplArray) {
        void arg0;
        int n;
        sprrwl sprrwl2 = this;
        this.cfr_renamed_4 = new ArrayList<sprsom>();
        this.cfr_renamed_3 = new sprxpm[sprtplArray.length];
        int n2 = n = 0;
        while (n2 != ((void)arg0).length) {
            int n3 = n;
            sprxpm sprxpm2 = new sprxpm(arg0[n].cfr_renamed_568());
            this.cfr_renamed_3[n3] = sprxpm2;
            n2 = ++n;
        }
    }

    public spryql cfr_renamed_1451() {
        sprrwl sprrwl2;
        sprgmm sprgmm2;
        if (this.cfr_renamed_3.length != 0) {
            sprrwl sprrwl3 = this;
            sprgmm2 = new sprgmm(sprrwl3.cfr_renamed_3, sprrwl3.cfr_renamed_4.toArray(new sprsom[0]));
            sprrwl2 = this;
        } else {
            sprgmm2 = new sprgmm(null, this.cfr_renamed_4.toArray(new sprsom[0]));
            sprrwl2 = this;
        }
        sprrwl2.cfr_renamed_4.clear();
        return new spryql(sprgmm2);
    }

    public sprrwl cfr_renamed_10999(sprrnl arg0) {
        sprrwl sprrwl2 = this;
        sprrwl2.cfr_renamed_4.add(arg0.cfr_renamed_568());
        return sprrwl2;
    }
}

