/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprqqn;
import com.spire.presentation.packages.sprrln;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;

@sprtea
public class sprlon
extends sprrln {
    private sprdsp cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14712(spryjn spryjn2) {
        void arg0;
        void v0 = arg0;
        v0.cfr_renamed_14058(sprebp.cfr_renamed_14063(this.cfr_renamed_14486()));
        v0.cfr_renamed_11835("[");
        if (this.cfr_renamed_4.cfr_renamed_11861() > 0) {
            int n;
            sprlon sprlon2 = this;
            int n2 = sprlon2.cfr_renamed_4.cfr_renamed_7861(sprlon2.cfr_renamed_4.cfr_renamed_11861() - 1);
            int n3 = n = 0;
            while (n3 <= n2) {
                int n4;
                if (this.cfr_renamed_4.cfr_renamed_14000(n)) {
                    arg0.cfr_renamed_11835(((sprqqn)this.cfr_renamed_4.cfr_renamed_576(n)).cfr_renamed_4570());
                    n4 = n;
                } else {
                    arg0.cfr_renamed_11835("null");
                    n4 = n;
                }
                if (n4 != n2) {
                    arg0.cfr_renamed_14055();
                }
                n3 = ++n;
            }
        }
        arg0.cfr_renamed_11835("]");
    }

    public sprlon(int n) {
        super(n);
        sprlon sprlon2 = this;
        sprlon2.cfr_renamed_4 = new sprdsp();
    }

    public void cfr_renamed_14709(int arg0, sprqqn arg1) {
        this.cfr_renamed_4.cfr_renamed_12962(arg0, arg1);
    }
}

