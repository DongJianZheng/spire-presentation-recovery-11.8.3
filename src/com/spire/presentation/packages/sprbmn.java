/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbsn;
import com.spire.presentation.packages.sprgln;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryln;

@sprtea
public class sprbmn
extends sprbsn {
    private spryln cfr_renamed_4;

    @Override
    public void cfr_renamed_12808(Object arg0) {
    }

    public void cfr_renamed_12929(int arg0, Object arg1) {
    }

    public int cfr_renamed_12930(Object arg0) {
        return 0;
    }

    @Override
    public boolean cfr_renamed_12927(Object arg0) {
        return false;
    }

    public Object cfr_renamed_12151(int arg0) {
        return null;
    }

    @Override
    public boolean cfr_renamed_12926(Object arg0) {
        return false;
    }

    @Override
    public void cfr_renamed_12928(Object[] arg0, int arg1) {
    }

    @sprtea
    public sprbmn cfr_renamed_12878(spryln arg0) {
        int n;
        sprbmn sprbmn2 = (sprbmn)super.cfr_renamed_12099();
        sprbmn2.cfr_renamed_4 = arg0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_12925().size()) {
            sprgln sprgln2 = (sprgln)this.cfr_renamed_12925().cfr_renamed_12151(n);
            sprbmn2.cfr_renamed_12808(sprgln2.cfr_renamed_12099());
            n2 = ++n;
        }
        return sprbmn2;
    }

    @sprtea
    public sprgln cfr_renamed_12881(String arg0, String arg1, boolean arg2) {
        sprgln sprgln2;
        sprgln sprgln3 = sprgln2 = new sprgln();
        sprgln sprgln4 = sprgln2;
        sprgln4.cfr_renamed_11640(arg0);
        sprgln4.cfr_renamed_12807(arg1);
        sprgln3.cfr_renamed_11893(arg2);
        this.cfr_renamed_12808(sprgln3);
        return sprgln3;
    }

    public void cfr_renamed_12924(int arg0, Object arg1) {
    }

    @sprtea
    public sprbmn(spryln spryln2) {
        this.cfr_renamed_4 = spryln2;
    }

    @sprtea
    public sprgln cfr_renamed_1600(String arg0) {
        for (sprgln sprgln2 : this) {
            if (!sprraia.cfr_renamed_12945(arg0, sprgln2.cfr_renamed_313(), (short)5)) continue;
            return sprgln2;
        }
        return null;
    }

    @Override
    public int size() {
        return 0;
    }
}

