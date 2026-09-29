/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraun;
import com.spire.presentation.packages.sprhur;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sproxz;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxsn;

@sprtea
public class spruun
extends sprqqe
implements sprlm {
    private sprxsn cfr_renamed_3;
    private spraun cfr_renamed_4;

    public sprxsn cfr_renamed_15421() {
        return this.cfr_renamed_3;
    }

    public spraun cfr_renamed_626() {
        return this.cfr_renamed_4;
    }

    public spruun(sprxsn sprxsn2) {
        spruun spruun2 = this;
        spruun2.cfr_renamed_4 = null;
        spruun2.cfr_renamed_3 = sprxsn2;
    }

    /*
     * WARNING - void declaration
     */
    public spruun(spraun spraun2) {
        void arg0;
        spruun spruun2 = this;
        spruun2.cfr_renamed_4 = arg0;
        spruun2.cfr_renamed_3 = null;
    }

    public static spruun cfr_renamed_15420(sprktm arg0, Object arg1) {
        if (arg1 instanceof spruun) {
            return (spruun)arg1;
        }
        if (arg1 != null) {
            if (arg1 instanceof sprqqe) {
                int n = arg0.cfr_renamed_97().intValue();
                if (n == 1) {
                    return new spruun(spraun.cfr_renamed_23(arg1));
                }
                if (n == 2) {
                    return new spruun(sprxsn.cfr_renamed_23(arg1));
                }
                throw new IllegalArgumentException(new StringBuilder().insert(0, sproxz.cfr_renamed_9("`X~XzA{\u0016aOeS5_{\u0016rSa\u007f{EaW{Up\u001e<\f5")).append(arg1.getClass().getCanonicalName()).toString());
            }
            if (arg1 instanceof byte[]) {
                // empty if block
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhur.cfr_renamed_9("y>g>c'bpc2f5o$,9bpk5x\u0019b#x1b3ix%j,")).append(arg1.getClass().getCanonicalName()).toString());
        }
        return null;
    }

    public sprqqe cfr_renamed_1397() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4;
        }
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_15383() {
        return 0;
    }

    public boolean cfr_renamed_15388(sprqqe arg0) {
        return false;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return null;
    }
}

