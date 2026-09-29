/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprmcs;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class sprlzd {
    public static final sprcyd[] cfr_renamed_2 = new sprcyd[0];
    public static Set cfr_renamed_3 = Collections.unmodifiableSet(new HashSet());
    public static List cfr_renamed_4 = Collections.unmodifiableList(new ArrayList());

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static Date cfr_renamed_4269(sprrpe arg0) {
        try {
            return arg0.cfr_renamed_110();
        }
        catch (Exception exception) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprmcs.cfr_renamed_9("EcC~PoItN;PiOxEhSrN|\u0000\\EuEiAwIaE\u007ftrM~\u001a;")).append(exception.getMessage()).toString());
        }
    }

    public static List cfr_renamed_582(sprszd arg0) {
        if (arg0 == null) {
            return cfr_renamed_4;
        }
        return Collections.unmodifiableList(Arrays.asList(arg0.cfr_renamed_583()));
    }

    public static Set cfr_renamed_4234(sprszd arg0) {
        if (arg0 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableSet(new HashSet<sprtzd>(Arrays.asList(arg0.cfr_renamed_665())));
    }

    public static Set cfr_renamed_4236(sprszd arg0) {
        if (arg0 == null) {
            return cfr_renamed_3;
        }
        return Collections.unmodifiableSet(new HashSet<sprtzd>(Arrays.asList(arg0.cfr_renamed_662())));
    }
}

