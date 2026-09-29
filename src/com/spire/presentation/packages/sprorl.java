/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprjol;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprpaia;
import com.spire.presentation.packages.sprpxl;
import com.spire.presentation.packages.sprrcba;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtr;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprxwl;
import java.util.Collection;
import java.util.Iterator;

public class sprorl
implements sprtr {
    private sprnbm cfr_renamed_3;
    private sprug cfr_renamed_4;

    public static /* synthetic */ sprnbm cfr_renamed_10895(sprorl arg0) {
        return arg0.cfr_renamed_3;
    }

    @Override
    public sprhx cfr_renamed_461() {
        sprorl sprorl2 = this;
        return new sprorl(sprorl2.cfr_renamed_3, sprorl2.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprorl(sprnbm sprnbm2, sprug sprug2) {
        void arg0;
        sprorl sprorl2 = this;
        sprorl2.cfr_renamed_3 = arg0;
        sprorl2.cfr_renamed_4 = sprug2;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprorl sprorl2 = (sprorl)arg0;
        sprorl sprorl3 = this;
        sprorl3.cfr_renamed_3 = sprorl2.cfr_renamed_3;
        sprorl3.cfr_renamed_4 = sprorl2.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_10893(sprxwl arg0, sprtpl arg1) throws spreyl {
        Collection collection = this.cfr_renamed_4.cfr_renamed_3216(new sprjol(this));
        if (collection.isEmpty()) {
            throw new spreyl(new StringBuilder().insert(0, sprpaia.cfr_renamed_9("9.6\\\u001c\u0013\b\\")).append(this.cfr_renamed_3).append(sprrcba.cfr_renamed_9("&ai{&iizhk")).toString());
        }
        Iterator iterator = collection.iterator();
        while (iterator.hasNext()) {
            if (((sprpxl)iterator.next()).cfr_renamed_4235(arg1.cfr_renamed_114()) == null) continue;
            throw new spreyl(sprpaia.cfr_renamed_9("?\u001f\u000e\u000e\u0015\u001c\u0015\u0019\u001d\u000e\u0019Z\u000e\u001f\n\u0015\u0017\u001f\u0018"));
        }
        this.cfr_renamed_3 = arg1.cfr_renamed_1485();
    }
}

