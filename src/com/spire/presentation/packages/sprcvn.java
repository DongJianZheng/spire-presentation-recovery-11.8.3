/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrn;
import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprkso;
import com.spire.presentation.packages.sprmiaa;
import com.spire.presentation.packages.sproxn;
import com.spire.presentation.packages.sprsyo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprybo;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprcvn
extends sprybo {
    private sproxn cfr_renamed_4;

    public sprcvn(sproxn sproxn2) {
        super(true);
        this.cfr_renamed_4 = sproxn2;
    }

    @Override
    public void cfr_renamed_14890(sprcrn arg0) {
        int n;
        spryjn spryjn2 = arg0.cfr_renamed_13380();
        sprdsp sprdsp2 = this.cfr_renamed_4.cfr_renamed_13907();
        spryjn2.cfr_renamed_14085(sprmiaa.cfr_renamed_9("m&k6tsq\u007fxtpu~wd"), sprebp.cfr_renamed_14063(sprdsp2.cfr_renamed_11861()));
        int n2 = n = 0;
        while (n2 < sprdsp2.cfr_renamed_11861()) {
            sprdsp sprdsp3 = sprdsp2;
            int n3 = sprdsp3.cfr_renamed_7861(n);
            int[] nArray = (int[])sprdsp3.cfr_renamed_13485(n);
            if (arg0.cfr_renamed_2820().cfr_renamed_14358()) {
                int[] nArray2 = new int[nArray.length];
                int n4 = 0;
                int n5 = nArray2.length;
                int n6 = n4;
                while (n6 < n5) {
                    int n7 = nArray[n4];
                    if (sprkso.cfr_renamed_14891(n7, this.cfr_renamed_4.cfr_renamed_14856().cfr_renamed_13261().cfr_renamed_13460()) > 0) {
                        nArray2[n4] = n7;
                    }
                    n6 = ++n4;
                }
                nArray = nArray2;
            }
            spryjn2.cfr_renamed_14059(sprsyo.cfr_renamed_9("\u0011<\u001d:\u0013{VvPy"), sprebp.cfr_renamed_14247(n3), sprcvn.cfr_renamed_14892(nArray));
            n2 = ++n;
        }
        spryjn2.cfr_renamed_11735(sprmiaa.cfr_renamed_9("sxrtpu~wd"));
    }
}

