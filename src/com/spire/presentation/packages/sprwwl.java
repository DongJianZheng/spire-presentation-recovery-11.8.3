/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprmxl;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprxwl;
import java.util.ArrayList;
import java.util.List;

public class sprwwl {
    private final sprxwl cfr_renamed_1;
    private final List<spreyl> cfr_renamed_2;
    private final List<Integer> cfr_renamed_3;
    private final List<Integer> cfr_renamed_4;

    public void cfr_renamed_10897(int arg0, int arg1, spreyl arg2) {
        this.cfr_renamed_4.add(spruaf.cfr_renamed_279(arg0));
        this.cfr_renamed_3.add(spruaf.cfr_renamed_279(arg1));
        this.cfr_renamed_2.add(arg2);
    }

    public sprmxl cfr_renamed_1451() {
        if (this.cfr_renamed_2.isEmpty()) {
            return new sprmxl(this.cfr_renamed_1);
        }
        sprwwl sprwwl2 = this;
        sprwwl sprwwl3 = this;
        sprwwl sprwwl4 = this;
        return new sprmxl(this.cfr_renamed_1, sprwwl2.cfr_renamed_10898(sprwwl2.cfr_renamed_4), sprwwl3.cfr_renamed_10898(sprwwl3.cfr_renamed_3), sprwwl4.cfr_renamed_2.toArray(new spreyl[sprwwl4.cfr_renamed_2.size()]));
    }

    private /* synthetic */ int[] cfr_renamed_10898(List<Integer> arg0) {
        int n;
        int[] nArray = new int[arg0.size()];
        int n2 = n = 0;
        while (n2 != nArray.length) {
            int n3 = n++;
            nArray[n3] = arg0.get(n3);
            n2 = n;
        }
        return nArray;
    }

    public sprwwl(sprxwl sprxwl2) {
        sprwwl sprwwl2 = this;
        sprwwl sprwwl3 = this;
        sprwwl3.cfr_renamed_4 = new ArrayList<Integer>();
        sprwwl2.cfr_renamed_3 = new ArrayList<Integer>();
        sprwwl2.cfr_renamed_2 = new ArrayList<spreyl>();
        sprwwl2.cfr_renamed_1 = sprxwl2;
    }
}

