/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdxba;
import com.spire.presentation.packages.sprilaa;
import com.spire.presentation.packages.sprxl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class spretf
implements sprxl {
    private final String cfr_renamed_2;
    private final int cfr_renamed_3;
    private static final Map<String, spretf> cfr_renamed_4;

    public static spretf cfr_renamed_5870(String arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            throw new NullPointerException(sprdxba.cfr_renamed_9("\f\\\n_\u001fY\u0019X\u0000~\f]\b\u0010P\rM^\u0018\\\u0001"));
        }
        return cfr_renamed_4.get(spretf.cfr_renamed_5871(arg0, arg1, arg2, arg3));
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spretf(int n, String string) {
        void arg0;
        spretf spretf2 = this;
        spretf2.cfr_renamed_3 = arg0;
        spretf2.cfr_renamed_2 = string;
    }

    static {
        HashMap<String, spretf> hashMap = new HashMap<String, spretf>();
        hashMap.put(spretf.cfr_renamed_5871("SHA-256", 32, 16, 67), new spretf(0x1000001, sprilaa.cfr_renamed_9(",=/!+-(::@V@ND$%JD")));
        hashMap.put(spretf.cfr_renamed_5871("SHA-512", 64, 16, 131), new spretf(0x2000002, sprdxba.cfr_renamed_9("g\"d>`2c%q_\u001dX\u0001_o:\u0001[")));
        hashMap.put(spretf.cfr_renamed_5871("SHAKE128", 32, 16, 67), new spretf(0x3000003, sprilaa.cfr_renamed_9(",=/!+-(::9>CIJ$%JD")));
        hashMap.put(spretf.cfr_renamed_5871("SHAKE256", 64, 16, 131), new spretf(0x4000004, sprdxba.cfr_renamed_9("g\"d>`2c%q&u_\u0005[o:\u0001[")));
        cfr_renamed_4 = Collections.unmodifiableMap(hashMap);
    }

    @Override
    public int cfr_renamed_4721() {
        return this.cfr_renamed_3;
    }

    @Override
    public String toString() {
        return this.cfr_renamed_2;
    }

    private static /* synthetic */ String cfr_renamed_5871(String arg0, int arg1, int arg2, int arg3) {
        if (arg0 == null) {
            throw new NullPointerException(sprilaa.cfr_renamed_9("\u0013\u0017\u0015\u0014\u0000\u0012\u0006\u0013\u001f5\u0013\u0016\u0017[OFR\u0015\u0007\u0017\u001e"));
        }
        return new StringBuilder().insert(0, arg0).append("-").append(arg1).append("-").append(arg2).append("-").append(arg3).toString();
    }
}

