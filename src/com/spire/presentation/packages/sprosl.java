/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbcm;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtr;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprugb;
import com.spire.presentation.packages.sprwsia;
import com.spire.presentation.packages.sprxwl;

public class sprosl
implements sprtr {
    private boolean cfr_renamed_2;
    private Integer cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprosl(boolean bl) {
        sprosl sprosl2 = this;
        sprosl sprosl3 = this;
        sprosl3.cfr_renamed_4 = true;
        sprosl3.cfr_renamed_3 = null;
        sprosl2.cfr_renamed_2 = true;
        sprosl2.cfr_renamed_2 = bl;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_10893(sprxwl sprxwl2, sprtpl sprtpl2) throws spreyl {
        sprktm sprktm2;
        void arg1;
        void arg0;
        arg0.cfr_renamed_10894(sprrdm.cfr_renamed_133);
        if (!this.cfr_renamed_4) {
            throw new spreyl(sprugb.cfr_renamed_9("\u0012o#g3.3a>}$|1g>z#.&g?b1z5jj.9}#{5|pg#.>a$.1.\u0013O"));
        }
        sprbcm sprbcm2 = sprbcm.cfr_renamed_5322(arg1.cfr_renamed_98());
        boolean bl = this.cfr_renamed_4 = sprbcm2 != null && sprbcm2.cfr_renamed_296() || sprbcm2 == null && !this.cfr_renamed_2;
        if (this.cfr_renamed_3 != null && !arg1.cfr_renamed_1485().equals(arg1.cfr_renamed_102())) {
            if (this.cfr_renamed_3 < 0) {
                throw new spreyl(sprwsia.cfr_renamed_9("P'a/qfq)|5f4s/|2afd/}*s2w\"(fb'f.2*w(u2zfw>q#w\"w\""));
            }
            this.cfr_renamed_3 = spruaf.cfr_renamed_279(this.cfr_renamed_3 - 1);
        }
        if (sprbcm2 != null && sprbcm2.cfr_renamed_296() && (sprktm2 = sprbcm2.cfr_renamed_5086()) != null) {
            int n = sprktm2.cfr_renamed_5087();
            if (this.cfr_renamed_3 == null || n < this.cfr_renamed_3) {
                this.cfr_renamed_3 = spruaf.cfr_renamed_279(n);
            }
        }
    }

    public sprosl() {
        this(true);
    }

    @Override
    public sprhx cfr_renamed_461() {
        sprosl sprosl2 = new sprosl();
        sprosl sprosl3 = this;
        sprosl2.cfr_renamed_2 = sprosl3.cfr_renamed_2;
        sprosl2.cfr_renamed_4 = sprosl3.cfr_renamed_4;
        sprosl2.cfr_renamed_3 = this.cfr_renamed_3;
        return sprosl2;
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprosl sprosl2 = (sprosl)arg0;
        sprosl sprosl3 = this;
        sprosl sprosl4 = sprosl2;
        this.cfr_renamed_2 = sprosl4.cfr_renamed_2;
        sprosl3.cfr_renamed_4 = sprosl4.cfr_renamed_4;
        sprosl3.cfr_renamed_3 = sprosl2.cfr_renamed_3;
    }
}

