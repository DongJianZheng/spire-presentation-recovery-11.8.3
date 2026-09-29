/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcud;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprjrd;
import com.spire.presentation.packages.sprmn;
import com.spire.presentation.packages.sprord;
import com.spire.presentation.packages.sprrrd;
import com.spire.presentation.packages.sprtvd;

public class sprqsd {
    private final sprcyd[] cfr_renamed_4;

    public int cfr_renamed_4256() {
        return this.cfr_renamed_4.length;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprord cfr_renamed_4266(sprmn[] arg0) {
        int n;
        sprcud sprcud2 = new sprcud(sprjrd.cfr_renamed_4265(this.cfr_renamed_4));
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = this.cfr_renamed_4.length - 1;
            while (n3 >= 0) {
                int n4;
                try {
                    sprcud2.cfr_renamed_4264(n4 == 0);
                    arg0[n].cfr_renamed_3232(sprcud2, this.cfr_renamed_4[n4]);
                }
                catch (sprrrd sprrrd2) {
                    return new sprord(sprcud2, n4, n, sprrrd2);
                }
                n3 = --n4;
            }
            n2 = ++n;
        }
        return new sprord(sprcud2);
    }

    private /* synthetic */ sprcyd[] cfr_renamed_4267(sprcyd[] arg0) {
        sprcyd[] sprcydArray = new sprcyd[arg0.length];
        System.arraycopy(arg0, 0, sprcydArray, 0, sprcydArray.length);
        return sprcydArray;
    }

    public sprcyd[] cfr_renamed_617() {
        sprqsd sprqsd2 = this;
        return sprqsd2.cfr_renamed_4267(sprqsd2.cfr_renamed_4);
    }

    public sprqsd(sprcyd[] sprcydArray) {
        sprqsd sprqsd2 = this;
        sprqsd2.cfr_renamed_4 = sprqsd2.cfr_renamed_4267(sprcydArray);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprord cfr_renamed_4268(sprmn[] arg0) {
        int n;
        sprcud sprcud2 = new sprcud(sprjrd.cfr_renamed_4265(this.cfr_renamed_4));
        sprtvd sprtvd2 = new sprtvd();
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = this.cfr_renamed_4.length - 1;
            while (n3 >= 0) {
                int n4;
                try {
                    sprcud2.cfr_renamed_4264(n4 == 0);
                    arg0[n].cfr_renamed_3232(sprcud2, this.cfr_renamed_4[n4]);
                }
                catch (sprrrd sprrrd2) {
                    sprtvd2.cfr_renamed_4260(sprrrd2);
                }
                n3 = --n4;
            }
            n2 = ++n;
        }
        return sprtvd2.cfr_renamed_1451();
    }
}

