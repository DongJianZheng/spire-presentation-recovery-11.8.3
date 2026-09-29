/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprjxl;
import com.spire.presentation.packages.sprmwd;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprxwl;
import java.util.Collections;
import java.util.Set;

public class sprmxl {
    private spreyl[] cfr_renamed_112;
    private int[] cfr_renamed_119;
    private final spreyl cfr_renamed_91;
    private final boolean cfr_renamed_0;
    private int[] cfr_renamed_1;
    private final Set cfr_renamed_2;
    private final int cfr_renamed_3;
    private final int cfr_renamed_4;

    public spreyl cfr_renamed_4261() {
        if (this.cfr_renamed_91 != null) {
            return this.cfr_renamed_91;
        }
        if (!this.cfr_renamed_2.isEmpty()) {
            return new spreyl(sprmwd.cfr_renamed_9("\bm5b3g1f9#\u001eq4w4`<o}F%w8m.j2m."));
        }
        return null;
    }

    public int cfr_renamed_10899() {
        return this.cfr_renamed_4;
    }

    public spreyl[] cfr_renamed_10900() {
        if (this.cfr_renamed_112 != null) {
            spreyl[] spreylArray = new spreyl[this.cfr_renamed_112.length];
            System.arraycopy(this.cfr_renamed_112, 0, spreylArray, 0, this.cfr_renamed_112.length);
            return spreylArray;
        }
        if (!this.cfr_renamed_2.isEmpty()) {
            spreyl[] spreylArray = new spreyl[1];
            spreylArray[0] = new spreyl(sprjxl.cfr_renamed_9("V\u000fk\u0000m\u0005o\u0004gA@\u0013j\u0015j\u0002b\r#${\u0015f\u000fp\bl\u000fp"));
            return spreylArray;
        }
        return null;
    }

    public int[] cfr_renamed_10901() {
        return sproze.cfr_renamed_535(this.cfr_renamed_1);
    }

    public boolean cfr_renamed_4263() {
        return this.cfr_renamed_119 != null;
    }

    public int cfr_renamed_10902() {
        return this.cfr_renamed_3;
    }

    public Set cfr_renamed_4262() {
        return this.cfr_renamed_2;
    }

    public int[] cfr_renamed_10903() {
        return sproze.cfr_renamed_535(this.cfr_renamed_119);
    }

    /*
     * WARNING - void declaration
     */
    public sprmxl(sprxwl sprxwl2, int[] nArray, int[] nArray2, spreyl[] spreylArray) {
        void arg2;
        void arg1;
        void arg3;
        void arg0;
        sprmxl sprmxl2 = this;
        sprmxl sprmxl3 = this;
        sprmxl sprmxl4 = this;
        sprmxl sprmxl5 = this;
        sprmxl5.cfr_renamed_2 = Collections.unmodifiableSet(arg0.cfr_renamed_4262());
        sprmxl5.cfr_renamed_0 = 0;
        sprmxl4.cfr_renamed_91 = arg3[0];
        sprmxl4.cfr_renamed_3 = arg1[0];
        sprmxl3.cfr_renamed_4 = arg2[0];
        sprmxl3.cfr_renamed_112 = arg3;
        sprmxl2.cfr_renamed_119 = arg1;
        sprmxl2.cfr_renamed_1 = nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public sprmxl(sprxwl sprxwl2) {
        void arg0;
        sprmxl sprmxl2 = this;
        this.cfr_renamed_2 = Collections.unmodifiableSet(arg0.cfr_renamed_4262());
        this.cfr_renamed_0 = this.cfr_renamed_2.isEmpty();
        this.cfr_renamed_3 = -1;
        sprmxl2.cfr_renamed_4 = -1;
        sprmxl2.cfr_renamed_91 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprmxl(sprxwl sprxwl2, int n, int n2, spreyl spreyl2) {
        void arg2;
        void arg1;
        void arg0;
        sprmxl sprmxl2 = this;
        sprmxl sprmxl3 = this;
        this.cfr_renamed_2 = Collections.unmodifiableSet(arg0.cfr_renamed_4262());
        sprmxl3.cfr_renamed_0 = false;
        sprmxl3.cfr_renamed_3 = arg1;
        sprmxl2.cfr_renamed_4 = arg2;
        sprmxl2.cfr_renamed_91 = spreyl2;
    }

    public boolean cfr_renamed_1974() {
        return this.cfr_renamed_0;
    }
}

