/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjkg;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqwl;
import com.spire.presentation.packages.sprsvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybn;
import java.io.IOException;

public class sprsxm
extends sprqqe
implements sprlm {
    private final sprsvm cfr_renamed_3;
    private final sprybn cfr_renamed_4;

    public sprybn cfr_renamed_11361() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprsxm(sprybn sprybn2) {
        void arg0;
        sprsxm sprsxm2 = this;
        sprsxm2.cfr_renamed_4 = arg0;
        sprsxm2.cfr_renamed_3 = null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_119();
        }
        return this.cfr_renamed_3.cfr_renamed_119();
    }

    public static sprsxm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsxm) {
            return (sprsxm)arg0;
        }
        if (arg0 != null) {
            if (arg0 instanceof sprco) {
                sprxgf sprxgf2 = ((sprco)arg0).cfr_renamed_119();
                if (sprxgf2 instanceof sprktm) {
                    return new sprsxm(sprybn.cfr_renamed_23(sprxgf2));
                }
                if (sprxgf2 instanceof sprszm) {
                    return new sprsxm(sprsvm.cfr_renamed_23(sprxgf2));
                }
            }
            if (arg0 instanceof byte[]) {
                try {
                    return sprsxm.cfr_renamed_23(sprxgf.cfr_renamed_184((byte[])arg0));
                }
                catch (IOException iOException) {
                    throw new IllegalArgumentException(sprjkg.cfr_renamed_9("xifibpc'hinhinc`-nc'jbyNctyfcdh/$"));
                }
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqwl.cfr_renamed_9("f\u000ex\u000e|\u0017}@|\u0002y\u0005p\u00143\t}@t\u0005g)}\u0013g\u0001}\u0003vH:Z3")).append(arg0.getClass().getName()).toString());
        }
        return null;
    }

    public sprsxm(sprsvm sprsvm2) {
        sprsxm sprsxm2 = this;
        sprsxm2.cfr_renamed_4 = null;
        sprsxm2.cfr_renamed_3 = sprsvm2;
    }

    public boolean cfr_renamed_11424() {
        return this.cfr_renamed_4 != null;
    }

    public sprsvm cfr_renamed_11405() {
        return this.cfr_renamed_3;
    }
}

