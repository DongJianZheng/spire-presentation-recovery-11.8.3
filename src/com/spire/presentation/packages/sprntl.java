/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfvd;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprtpl;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sprntl {
    public static Set cfr_renamed_2;
    public static final sprtpl[] cfr_renamed_3;
    public static List cfr_renamed_4;

    public static Set cfr_renamed_10879(sprhgm arg0) {
        if (arg0 == null) {
            return cfr_renamed_2;
        }
        return Collections.unmodifiableSet(new HashSet<sprlem>(Arrays.asList(arg0.cfr_renamed_665())));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date cfr_renamed_10908(sprjfn arg0) {
        try {
            return arg0.cfr_renamed_110();
        }
        catch (Exception exception) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprfvd.cfr_renamed_9("k:m'~6g-`b~0a!k1}+`%.\u0005k,k0o.g8k&Z+c'4b")).append(exception.getMessage()).toString());
        }
    }

    static {
        cfr_renamed_3 = new sprtpl[0];
        cfr_renamed_2 = Collections.unmodifiableSet(new HashSet());
        cfr_renamed_4 = Collections.unmodifiableList(new ArrayList());
    }

    public static List cfr_renamed_5274(sprhgm arg0) {
        if (arg0 == null) {
            return cfr_renamed_4;
        }
        return Collections.unmodifiableList(Arrays.asList(arg0.cfr_renamed_583()));
    }

    public static Set cfr_renamed_10880(sprhgm arg0) {
        if (arg0 == null) {
            return cfr_renamed_2;
        }
        return Collections.unmodifiableSet(new HashSet<sprlem>(Arrays.asList(arg0.cfr_renamed_662())));
    }
}

