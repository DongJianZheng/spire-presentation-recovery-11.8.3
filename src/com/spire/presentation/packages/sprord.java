/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcud;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprrrd;
import java.util.Collections;
import java.util.Set;

public class sprord {
    private int[] cfr_renamed_1;
    private final boolean cfr_renamed_2;
    private final sprrrd cfr_renamed_3;
    private final Set cfr_renamed_4;

    public Exception cfr_renamed_4261() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3;
        }
        if (!this.cfr_renamed_4.isEmpty()) {
            return new sprrrd(sprhky.cfr_renamed_9("(2\u0015=\u00138\u00119\u0019|>.\u0014(\u0014?\u001c0]\u0019\u0005(\u00182\u000e5\u00122\u000e"));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprord(sprcud sprcud2, int[] nArray, int[] nArray2, sprrrd[] sprrrdArray) {
        void arg3;
        void arg0;
        sprord sprord2 = this;
        sprord sprord3 = this;
        sprord3.cfr_renamed_4 = Collections.unmodifiableSet(arg0.cfr_renamed_4262());
        sprord3.cfr_renamed_2 = 0;
        sprord2.cfr_renamed_3 = arg3[0];
        sprord2.cfr_renamed_1 = nArray;
    }

    public boolean cfr_renamed_1974() {
        return this.cfr_renamed_2;
    }

    public boolean cfr_renamed_4263() {
        return this.cfr_renamed_1 != null;
    }

    public Set cfr_renamed_4262() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprord(sprcud sprcud2, int n, int n2, sprrrd sprrrd2) {
        void arg0;
        sprord sprord2 = this;
        this.cfr_renamed_4 = Collections.unmodifiableSet(arg0.cfr_renamed_4262());
        sprord2.cfr_renamed_2 = false;
        sprord2.cfr_renamed_3 = sprrrd2;
    }

    /*
     * WARNING - void declaration
     */
    public sprord(sprcud sprcud2) {
        void arg0;
        this.cfr_renamed_4 = Collections.unmodifiableSet(arg0.cfr_renamed_4262());
        this.cfr_renamed_2 = this.cfr_renamed_4.isEmpty();
        this.cfr_renamed_3 = null;
    }
}

