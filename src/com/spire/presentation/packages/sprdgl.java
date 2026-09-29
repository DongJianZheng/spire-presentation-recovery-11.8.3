/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprap;
import com.spire.presentation.packages.sprjll;
import com.spire.presentation.packages.sprkoe;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.logging.Logger;

public abstract class sprdgl
implements sprap {
    public static final Logger cfr_renamed_3 = Logger.getLogger(sprdgl.class.getName());
    private final Set<String> cfr_renamed_4;

    public boolean cfr_renamed_10586(String arg0) {
        if (this.cfr_renamed_4.isEmpty()) {
            return false;
        }
        return this.cfr_renamed_4.contains(sprkoe.cfr_renamed_116(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprdgl(Set<String> set) {
        Iterator iterator;
        void arg0;
        if (set.isEmpty()) {
            this.cfr_renamed_4 = Collections.EMPTY_SET;
            return;
        }
        this.cfr_renamed_4 = new HashSet<String>(arg0.size());
        Iterator iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            Iterator iterator3 = iterator;
            iterator2 = iterator3;
            this.cfr_renamed_4.add(sprkoe.cfr_renamed_116(iterator3.next().toString()));
        }
        sprjll.cfr_renamed_10585(this.cfr_renamed_4);
    }
}

