/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhm;
import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnsl;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtr;
import com.spire.presentation.packages.sprxwl;
import java.math.BigInteger;

public class sprzrl
implements sprtr {
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public sprzrl(int arg0) {
        this(arg0, false, false, false);
    }

    private /* synthetic */ int cfr_renamed_4257(int arg0) {
        if (arg0 != 0) {
            return arg0 - 1;
        }
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprzrl(int n, boolean bl, boolean bl2, boolean bl3) {
        void v1;
        void arg3;
        void arg0;
        void v0;
        void arg2;
        if (bl) {
            v0 = arg2;
            this.cfr_renamed_3 = 0;
        } else {
            this.cfr_renamed_3 = arg0 + true;
            v0 = arg2;
        }
        if (v0 != false) {
            v1 = arg3;
            this.cfr_renamed_2 = 0;
        } else {
            this.cfr_renamed_2 = arg0 + true;
            v1 = arg3;
        }
        if (v1 != false) {
            this.cfr_renamed_4 = 0;
            return;
        }
        this.cfr_renamed_4 = arg0 + true;
    }

    @Override
    public void cfr_renamed_10893(sprxwl arg0, sprtpl arg1) throws spreyl {
        sprxwl sprxwl2 = arg0;
        sprxwl2.cfr_renamed_10894(sprrdm.cfr_renamed_82);
        sprxwl2.cfr_renamed_10894(sprrdm.cfr_renamed_145);
        if (!sprxwl2.cfr_renamed_4248() && !sprnsl.cfr_renamed_10891(arg1)) {
            int n;
            Object object;
            sprzrl sprzrl2 = this;
            sprzrl2.cfr_renamed_3 = sprzrl2.cfr_renamed_4257(sprzrl2.cfr_renamed_3);
            sprzrl2.cfr_renamed_4 = sprzrl2.cfr_renamed_4257(sprzrl2.cfr_renamed_4);
            sprzrl2.cfr_renamed_2 = sprzrl2.cfr_renamed_4257(sprzrl2.cfr_renamed_2);
            sprbhm sprbhm2 = sprbhm.cfr_renamed_5322(arg1.cfr_renamed_98());
            if (sprbhm2 != null) {
                BigInteger bigInteger;
                object = sprbhm2.cfr_renamed_4258();
                if (object != null && ((BigInteger)object).intValue() < this.cfr_renamed_3) {
                    this.cfr_renamed_3 = ((BigInteger)object).intValue();
                }
                if ((bigInteger = sprbhm2.cfr_renamed_4259()) != null && bigInteger.intValue() < this.cfr_renamed_4) {
                    this.cfr_renamed_4 = bigInteger.intValue();
                }
            }
            if ((object = arg1.cfr_renamed_5024(sprrdm.cfr_renamed_145)) != null && (n = sprktm.cfr_renamed_23(((sprrdm)object).cfr_renamed_372()).cfr_renamed_5023()) < this.cfr_renamed_2) {
                this.cfr_renamed_2 = n;
            }
        }
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprzrl sprzrl2 = (sprzrl)arg0;
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprzrl(0);
    }
}

