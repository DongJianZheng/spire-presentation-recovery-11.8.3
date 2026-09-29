/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdsp;
import com.spire.presentation.packages.sprsfp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqo;
import java.util.Hashtable;

@sprtea
public class sprcun {
    private sprdsp cfr_renamed_3;
    private Hashtable<byte[], Integer> cfr_renamed_4;

    private static /* synthetic */ int cfr_renamed_15041(byte[] arg0) {
        return sprsfp.cfr_renamed_15042(arg0).hashCode();
    }

    public Object cfr_renamed_13485(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_13485(arg0);
    }

    private /* synthetic */ int cfr_renamed_15043(byte[] arg0) {
        int n;
        if (this.cfr_renamed_4.containsKey(arg0)) {
            return Integer.parseInt(this.cfr_renamed_4.get(arg0).toString());
        }
        int n2 = n = sprcun.cfr_renamed_15041(arg0);
        this.cfr_renamed_4.put(arg0, n2);
        return n2;
    }

    public Object cfr_renamed_13501(byte[] arg0, sprtqo arg1) {
        return this.cfr_renamed_3.cfr_renamed_576(this.cfr_renamed_15044(arg0, arg1));
    }

    private static /* synthetic */ int cfr_renamed_15045(int arg0, sprtqo arg1) {
        int n = arg1 != null && arg1.cfr_renamed_14231() ? arg1.hashCode() : 0;
        return arg0 * 397 ^ n;
    }

    public void cfr_renamed_13502(byte[] arg0, sprtqo arg1, Object arg2) {
        this.cfr_renamed_3.cfr_renamed_12962(this.cfr_renamed_15044(arg0, arg1), arg2);
    }

    public sprcun() {
        sprcun sprcun2 = this;
        this.cfr_renamed_4 = new Hashtable();
        sprcun2.cfr_renamed_3 = new sprdsp();
    }

    private /* synthetic */ int cfr_renamed_15044(byte[] arg0, sprtqo arg1) {
        return sprcun.cfr_renamed_15045(this.cfr_renamed_15043(arg0), arg1);
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_3.cfr_renamed_11861();
    }

    public boolean cfr_renamed_13889(byte[] arg0, sprtqo arg1) {
        return this.cfr_renamed_3.cfr_renamed_14000(this.cfr_renamed_15044(arg0, arg1));
    }
}

