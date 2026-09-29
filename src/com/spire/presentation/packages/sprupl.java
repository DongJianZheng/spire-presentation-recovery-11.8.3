/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcql;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprmxl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtr;
import com.spire.presentation.packages.sprwwl;
import com.spire.presentation.packages.sprxwl;

public class sprupl {
    private final sprtpl[] cfr_renamed_4;

    public sprtpl[] cfr_renamed_617() {
        sprupl sprupl2 = this;
        return sprupl2.cfr_renamed_10905(sprupl2.cfr_renamed_4);
    }

    public sprupl(sprtpl[] sprtplArray) {
        sprupl sprupl2 = this;
        sprupl2.cfr_renamed_4 = sprupl2.cfr_renamed_10905(sprtplArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmxl cfr_renamed_10906(sprtr[] arg0) {
        int n;
        sprxwl sprxwl2 = new sprxwl(sprcql.cfr_renamed_10904(this.cfr_renamed_4));
        sprwwl sprwwl2 = new sprwwl(sprxwl2);
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = this.cfr_renamed_4.length - 1;
            while (n3 >= 0) {
                int n4;
                try {
                    sprxwl2.cfr_renamed_4264(n4 == 0);
                    arg0[n].cfr_renamed_10893(sprxwl2, this.cfr_renamed_4[n4]);
                }
                catch (spreyl spreyl2) {
                    sprwwl2.cfr_renamed_10897(n4, n, spreyl2);
                }
                n3 = --n4;
            }
            n2 = ++n;
        }
        return sprwwl2.cfr_renamed_1451();
    }

    private /* synthetic */ sprtpl[] cfr_renamed_10905(sprtpl[] arg0) {
        sprtpl[] sprtplArray = new sprtpl[arg0.length];
        System.arraycopy(arg0, 0, sprtplArray, 0, sprtplArray.length);
        return sprtplArray;
    }

    public int cfr_renamed_4256() {
        return this.cfr_renamed_4.length;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprmxl cfr_renamed_10907(sprtr[] arg0) {
        int n;
        sprxwl sprxwl2 = new sprxwl(sprcql.cfr_renamed_10904(this.cfr_renamed_4));
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = this.cfr_renamed_4.length - 1;
            while (n3 >= 0) {
                int n4;
                try {
                    sprxwl2.cfr_renamed_4264(n4 == 0);
                    arg0[n].cfr_renamed_10893(sprxwl2, this.cfr_renamed_4[n4]);
                }
                catch (spreyl spreyl2) {
                    return new sprmxl(sprxwl2, n4, n, spreyl2);
                }
                n3 = --n4;
            }
            n2 = ++n;
        }
        return new sprmxl(sprxwl2);
    }
}

