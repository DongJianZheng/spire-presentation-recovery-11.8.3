/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbkh;
import com.spire.presentation.packages.sprfih;
import com.spire.presentation.packages.sprkgh;
import com.spire.presentation.packages.sprlfh;
import com.spire.presentation.packages.sproeh;
import com.spire.presentation.packages.sproz;
import com.spire.presentation.packages.sprsjh;
import com.spire.presentation.packages.sprsjk;
import com.spire.presentation.packages.sprzhk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class spregk {
    private final List<sprsjk> cfr_renamed_4;

    public spregk() {
        spregk spregk2 = this;
        spregk2.cfr_renamed_4 = new ArrayList<sprsjk>();
    }

    public void cfr_renamed_9604(sprsjk arg0) {
        this.cfr_renamed_4.add(arg0);
    }

    public sprzhk cfr_renamed_9605(sproz arg0, byte[] arg1) {
        Iterator<sprsjk> iterator;
        sproz sproz2 = arg0;
        byte[] byArray = sproz2.cfr_renamed_1512(arg1);
        byte[] byArray2 = sproz2.cfr_renamed_1521();
        byte[] byArray3 = sproz2.cfr_renamed_596();
        sprsjh sprsjh2 = sproeh.cfr_renamed_7843();
        Iterator<sprsjk> iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            sprsjk sprsjk2 = iterator.next();
            sprlfh[] sprlfhArray = new sprlfh[1];
            sprlfhArray[0] = sprsjk2.cfr_renamed_2588(byArray2);
            sprsjh2.cfr_renamed_9606(sprlfhArray);
            iterator2 = iterator;
        }
        return new sprzhk(sprfih.cfr_renamed_7843().cfr_renamed_9607(sprsjh2.cfr_renamed_9608()).cfr_renamed_9609(sprbkh.cfr_renamed_8260(sprkgh.cfr_renamed_7843().cfr_renamed_9610(byArray).cfr_renamed_9611(byArray3).cfr_renamed_9612())).cfr_renamed_9613());
    }
}

