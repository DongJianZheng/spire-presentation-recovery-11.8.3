/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdfk;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprrq;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvao;
import com.spire.presentation.packages.sprvpk;
import com.spire.presentation.packages.sprwfk;
import com.spire.presentation.packages.sprwr;
import java.util.HashMap;
import java.util.Map;

public class spripk
extends sprdfk {
    public static final sprddm cfr_renamed_152;
    private final int cfr_renamed_112;
    public static final sprddm cfr_renamed_119;
    public static final sprddm cfr_renamed_91;
    private static final Map cfr_renamed_0;
    public static final sprddm cfr_renamed_1;
    private final int cfr_renamed_2;
    public static final sprddm cfr_renamed_3;
    private final sprddm cfr_renamed_4;

    static {
        cfr_renamed_119 = new sprddm(sprdl.cfr_renamed_1763, sprpen.cfr_renamed_4);
        cfr_renamed_3 = new sprddm(sprdl.cfr_renamed_131, sprpen.cfr_renamed_4);
        cfr_renamed_91 = new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4);
        cfr_renamed_1 = new sprddm(sprwr.cfr_renamed_728, sprpen.cfr_renamed_4);
        cfr_renamed_152 = new sprddm(sprwr.cfr_renamed_119, sprpen.cfr_renamed_4);
        cfr_renamed_0 = new HashMap();
        cfr_renamed_0.put(sprdl.cfr_renamed_1763, spruaf.cfr_renamed_279(20));
        cfr_renamed_0.put(sprdl.cfr_renamed_131, spruaf.cfr_renamed_279(32));
        cfr_renamed_0.put(sprdl.cfr_renamed_2956, spruaf.cfr_renamed_279(64));
        cfr_renamed_0.put(sprdl.cfr_renamed_3240, spruaf.cfr_renamed_279(28));
        cfr_renamed_0.put(sprdl.cfr_renamed_1223, spruaf.cfr_renamed_279(48));
        cfr_renamed_0.put(sprwr.cfr_renamed_105, spruaf.cfr_renamed_279(28));
        cfr_renamed_0.put(sprwr.cfr_renamed_728, spruaf.cfr_renamed_279(32));
        cfr_renamed_0.put(sprwr.cfr_renamed_145, spruaf.cfr_renamed_279(48));
        cfr_renamed_0.put(sprwr.cfr_renamed_119, spruaf.cfr_renamed_279(64));
        cfr_renamed_0.put(sprqo.cfr_renamed_4, spruaf.cfr_renamed_279(32));
        cfr_renamed_0.put(sprdt.cfr_renamed_114, spruaf.cfr_renamed_279(32));
        cfr_renamed_0.put(sprdt.cfr_renamed_102, spruaf.cfr_renamed_279(64));
        cfr_renamed_0.put(sprrq.cfr_renamed_723, spruaf.cfr_renamed_279(32));
    }

    public static int cfr_renamed_7356(sprlem arg0) {
        if (!cfr_renamed_0.containsKey(arg0)) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprvao.cfr_renamed_9("1G\u007f[>D+\b,A%M\u007fN0Z\u007fI3O0Z6\\7Ee\b")).append(arg0).toString());
        }
        return (Integer)cfr_renamed_0.get(arg0);
    }

    public int cfr_renamed_4598() {
        return this.cfr_renamed_112;
    }

    public /* synthetic */ spripk(sprvpk arg0, sprwfk arg1) {
        this(arg0);
    }

    public int cfr_renamed_1478() {
        return this.cfr_renamed_2;
    }

    public sprddm cfr_renamed_7387() {
        return this.cfr_renamed_4;
    }

    private /* synthetic */ spripk(sprvpk arg0) {
        sprvpk sprvpk2 = arg0;
        super(sprdl.cfr_renamed_3247);
        this.cfr_renamed_2 = sprvpk.cfr_renamed_9875(arg0);
        this.cfr_renamed_4 = sprvpk.cfr_renamed_9876(sprvpk2);
        if (sprvpk.cfr_renamed_9877(sprvpk2) < 0) {
            this.cfr_renamed_112 = spripk.cfr_renamed_7356(this.cfr_renamed_4.cfr_renamed_593());
            return;
        }
        this.cfr_renamed_112 = sprvpk.cfr_renamed_9877(arg0);
    }
}

