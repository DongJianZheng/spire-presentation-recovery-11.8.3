/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprtkm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzgia;

public class sprcem
extends sprqqe
implements sprlm {
    public sprco cfr_renamed_2;
    public static final int cfr_renamed_3 = 1;
    public static final int cfr_renamed_4 = 0;

    public int cfr_renamed_4495() {
        return ((sprktm)this.cfr_renamed_2).cfr_renamed_5023();
    }

    public boolean cfr_renamed_4493() {
        return this.cfr_renamed_2 instanceof sprktm;
    }

    public sprcem(sprlem sprlem2) {
        this.cfr_renamed_2 = sprlem2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_2.cfr_renamed_119();
    }

    public static sprcem cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprcem) {
            return (sprcem)arg0;
        }
        if (arg0 instanceof sprktm) {
            sprktm sprktm2 = sprktm.cfr_renamed_23(arg0);
            int n = sprktm2.cfr_renamed_5023();
            return new sprcem(n);
        }
        if (arg0 instanceof sprlem) {
            sprlem sprlem2 = sprlem.cfr_renamed_23(arg0);
            return new sprcem(sprlem2);
        }
        throw new IllegalArgumentException(sprzgia.cfr_renamed_9(":N$N W!\u0000 B%E,ToI!\u0000(E;i!S;A!C*"));
    }

    /*
     * WARNING - void declaration
     */
    public sprcem(int n) {
        void arg0;
        if (n == 0 || arg0 == true) {
            this.cfr_renamed_2 = new sprktm((long)arg0);
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtkm.cfr_renamed_9("*M4M0T\u007fs-F;F9J1F;a6L2F+Q6@\u000bZ/F\u007f\u0019\u007f")).append((int)arg0).toString());
    }

    public sprlem cfr_renamed_4494() {
        return (sprlem)this.cfr_renamed_2;
    }
}

