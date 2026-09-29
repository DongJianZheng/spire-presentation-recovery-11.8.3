/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxfaa;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprgum
extends sprqqe
implements sprlm {
    private sprco cfr_renamed_4;

    public static sprgum cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprxfaa.cfr_renamed_9("bGnFbJ!FuJl\u000flZr[!Md\u000fdWqChLh[mV![`HfJe"));
        }
        return sprgum.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_4 instanceof sproug) {
            return new sprycn(true, 2, this.cfr_renamed_4);
        }
        return new sprycn(1 != 0, 1, this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_4604() {
        if (this.cfr_renamed_4 instanceof sproug) {
            return ((sproug)this.cfr_renamed_4).cfr_renamed_186();
        }
        return null;
    }

    public sprgum(sprnbm sprnbm2) {
        this.cfr_renamed_4 = sprnbm2;
    }

    public sprnbm cfr_renamed_313() {
        if (this.cfr_renamed_4 instanceof sproug) {
            return null;
        }
        return sprnbm.cfr_renamed_23(this.cfr_renamed_4);
    }

    public static sprgum cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprgum) {
            return (sprgum)arg0;
        }
        if (arg0 instanceof sprfvg) {
            return new sprgum((sprfvg)arg0);
        }
        if (arg0 instanceof sprnvm) {
            sprnvm sprnvm2 = (sprnvm)arg0;
            if (sprnvm2.cfr_renamed_312() == 1) {
                return new sprgum(sprnbm.cfr_renamed_5085(sprnvm2, true));
            }
            return new sprgum(sproug.cfr_renamed_5085(sprnvm2, true));
        }
        return new sprgum(sprnbm.cfr_renamed_23(arg0));
    }

    public sprgum(sproug sproug2) {
        this.cfr_renamed_4 = sproug2;
    }
}

