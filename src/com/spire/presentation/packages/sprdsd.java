/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcud;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprmn;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprrj;
import com.spire.presentation.packages.sprrrd;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtje;
import com.spire.presentation.packages.sprvsd;
import java.math.BigInteger;

public class sprdsd
implements sprmn {
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    private /* synthetic */ int cfr_renamed_4257(int arg0) {
        if (arg0 != 0) {
            return arg0 - 1;
        }
        return 0;
    }

    @Override
    public void cfr_renamed_3232(sprcud arg0, sprcyd arg1) throws sprrrd {
        sprcud sprcud2 = arg0;
        sprcud2.cfr_renamed_4247(sprtie.cfr_renamed_102);
        sprcud2.cfr_renamed_4247(sprtie.cfr_renamed_133);
        if (!sprcud2.cfr_renamed_4248() && !sprvsd.cfr_renamed_4245(arg1)) {
            int n;
            Object object;
            sprdsd sprdsd2 = this;
            sprdsd2.cfr_renamed_2 = sprdsd2.cfr_renamed_4257(sprdsd2.cfr_renamed_2);
            sprdsd2.cfr_renamed_3 = sprdsd2.cfr_renamed_4257(sprdsd2.cfr_renamed_3);
            sprdsd2.cfr_renamed_4 = sprdsd2.cfr_renamed_4257(sprdsd2.cfr_renamed_4);
            sprtje sprtje2 = sprtje.cfr_renamed_2757(arg1.cfr_renamed_98());
            if (sprtje2 != null) {
                BigInteger bigInteger;
                object = sprtje2.cfr_renamed_4258();
                if (object != null && ((BigInteger)object).intValue() < this.cfr_renamed_2) {
                    this.cfr_renamed_2 = ((BigInteger)object).intValue();
                }
                if ((bigInteger = sprtje2.cfr_renamed_4259()) != null && bigInteger.intValue() < this.cfr_renamed_3) {
                    this.cfr_renamed_3 = bigInteger.intValue();
                }
            }
            if ((object = arg1.cfr_renamed_100(sprtie.cfr_renamed_133)) != null && (n = sprooe.cfr_renamed_23(((sprtie)object).cfr_renamed_372()).cfr_renamed_97().intValue()) < this.cfr_renamed_4) {
                this.cfr_renamed_4 = n;
            }
        }
    }

    @Override
    public void cfr_renamed_462(sprrj arg0) {
        sprdsd sprdsd2 = (sprdsd)arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprdsd(int n, boolean bl, boolean bl2, boolean bl3) {
        void v1;
        void arg3;
        void arg0;
        void v0;
        void arg2;
        if (bl) {
            v0 = arg2;
            this.cfr_renamed_2 = 0;
        } else {
            this.cfr_renamed_2 = arg0 + true;
            v0 = arg2;
        }
        if (v0 != false) {
            v1 = arg3;
            this.cfr_renamed_4 = 0;
        } else {
            this.cfr_renamed_4 = arg0 + true;
            v1 = arg3;
        }
        if (v1 != false) {
            this.cfr_renamed_3 = 0;
            return;
        }
        this.cfr_renamed_3 = arg0 + true;
    }

    @Override
    public sprrj cfr_renamed_461() {
        return new sprdsd(0);
    }

    public sprdsd(int arg0) {
        this(arg0, false, false, false);
    }
}

