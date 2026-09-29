/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraof;
import com.spire.presentation.packages.sprbyfa;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprirf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprljf;
import com.spire.presentation.packages.sprmqf;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvub;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxl;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class sprlpf {
    private final int cfr_renamed_152;
    private final int cfr_renamed_112;
    private final sprlem cfr_renamed_119;
    private static final Map<Integer, sprlpf> cfr_renamed_91;
    private final String cfr_renamed_0;
    private final sprirf cfr_renamed_1;
    private final int cfr_renamed_2;
    private final sprxl cfr_renamed_3;
    private final int cfr_renamed_4;

    static {
        HashMap<Integer, sprlpf> hashMap = new HashMap<Integer, sprlpf>();
        hashMap.put(spruaf.cfr_renamed_279(1), new sprlpf(10, sprwr.cfr_renamed_1226));
        hashMap.put(spruaf.cfr_renamed_279(2), new sprlpf(16, sprwr.cfr_renamed_1226));
        hashMap.put(spruaf.cfr_renamed_279(3), new sprlpf(20, sprwr.cfr_renamed_1226));
        hashMap.put(spruaf.cfr_renamed_279(4), new sprlpf(10, sprwr.cfr_renamed_272));
        hashMap.put(spruaf.cfr_renamed_279(5), new sprlpf(16, sprwr.cfr_renamed_272));
        hashMap.put(spruaf.cfr_renamed_279(6), new sprlpf(20, sprwr.cfr_renamed_272));
        hashMap.put(spruaf.cfr_renamed_279(7), new sprlpf(10, sprwr.cfr_renamed_1));
        hashMap.put(spruaf.cfr_renamed_279(8), new sprlpf(16, sprwr.cfr_renamed_1));
        hashMap.put(spruaf.cfr_renamed_279(9), new sprlpf(20, sprwr.cfr_renamed_1));
        hashMap.put(spruaf.cfr_renamed_279(10), new sprlpf(10, sprwr.spr\ufe34));
        hashMap.put(spruaf.cfr_renamed_279(11), new sprlpf(16, sprwr.spr\ufe34));
        hashMap.put(spruaf.cfr_renamed_279(12), new sprlpf(20, sprwr.spr\ufe34));
        cfr_renamed_91 = Collections.unmodifiableMap(hashMap);
    }

    public sprlpf(int arg0, sprgf arg1) {
        this(arg0, sprljf.cfr_renamed_5655(arg1.cfr_renamed_1315()));
    }

    public int cfr_renamed_1452() {
        return this.cfr_renamed_152;
    }

    public int cfr_renamed_1150() {
        return this.cfr_renamed_112;
    }

    public String cfr_renamed_3234() {
        return this.cfr_renamed_0;
    }

    public spraof cfr_renamed_5783() {
        return new spraof(this.cfr_renamed_1);
    }

    public int cfr_renamed_5786() {
        return this.cfr_renamed_1.cfr_renamed_5786();
    }

    public sprxl cfr_renamed_4721() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprlpf(int n, sprlem sprlem2) {
        void arg0;
        void arg1;
        if (n < 2) {
            throw new IllegalArgumentException(sprvub.cfr_renamed_9("9\u000e8\f9\u001fq\u0006$\u0018%K3\u000eqUlKc"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprbyfa.cfr_renamed_9(");*7>&mopr#'!>"));
        }
        sprlpf sprlpf2 = this;
        sprlpf sprlpf3 = this;
        this.cfr_renamed_152 = arg0;
        this.cfr_renamed_112 = this.cfr_renamed_5815();
        sprlpf3.cfr_renamed_0 = sprljf.cfr_renamed_5816((sprlem)arg1);
        sprlpf3.cfr_renamed_119 = arg1;
        sprlpf2.cfr_renamed_1 = new sprirf((sprlem)arg1);
        sprlpf2.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_5732();
        sprlpf2.cfr_renamed_2 = sprlpf2.cfr_renamed_1.cfr_renamed_1250();
        sprlpf sprlpf4 = this;
        sprlpf2.cfr_renamed_3 = sprmqf.cfr_renamed_5817(sprlpf2.cfr_renamed_0, sprlpf4.cfr_renamed_4, sprlpf4.cfr_renamed_2, this.cfr_renamed_1.cfr_renamed_5786(), (int)arg0);
    }

    public sprlem cfr_renamed_5651() {
        return this.cfr_renamed_119;
    }

    private /* synthetic */ int cfr_renamed_5815() {
        int n;
        int n2 = n = 2;
        while (n2 <= this.cfr_renamed_152) {
            if ((this.cfr_renamed_152 - n) % 2 == 0) {
                return n;
            }
            n2 = ++n;
        }
        throw new IllegalStateException(sprvub.cfr_renamed_9("\u00189\u0004$\u00075K?\u000e'\u000e#K9\n!\u001b4\u0005\u007fE\u007f"));
    }

    public int cfr_renamed_1250() {
        return this.cfr_renamed_2;
    }

    public int cfr_renamed_5732() {
        return this.cfr_renamed_4;
    }

    public static sprlpf cfr_renamed_5818(int arg0) {
        return cfr_renamed_91.get(spruaf.cfr_renamed_279(arg0));
    }
}

