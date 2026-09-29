/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhem;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwhja;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprtgm
extends sprqqe
implements sprlm {
    public sprxgf cfr_renamed_3;
    public sprco cfr_renamed_4;

    public sprtgm(sprhem sprhem2) {
        this.cfr_renamed_4 = sprhem2;
        sprtgm sprtgm2 = this;
        this.cfr_renamed_3 = new sprycn(0 != 0, 0, this.cfr_renamed_4);
    }

    public sprtgm(spraem arg0) {
        sprtgm sprtgm2 = this;
        sprtgm sprtgm3 = this;
        sprtgm2.cfr_renamed_4 = arg0;
        sprtgm2.cfr_renamed_3 = sprtgm3.cfr_renamed_4.cfr_renamed_119();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_3;
    }

    public sprco cfr_renamed_102() {
        return this.cfr_renamed_4;
    }

    public static sprtgm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprtgm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    public static sprtgm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprtgm) {
            return (sprtgm)arg0;
        }
        if (arg0 instanceof sprhem) {
            return new sprtgm(sprhem.cfr_renamed_23(arg0));
        }
        if (arg0 instanceof spraem) {
            return new sprtgm((spraem)arg0);
        }
        if (arg0 instanceof sprnvm) {
            return new sprtgm(sprhem.cfr_renamed_5085((sprnvm)arg0, false));
        }
        if (arg0 instanceof sprszm) {
            return new sprtgm(spraem.cfr_renamed_23(arg0));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprwhja.cfr_renamed_9("[DEDA]@\nAHDOM^\u000eC@\nHKM^AXW\u0010\u000e")).append(arg0.getClass().getName()).toString());
    }
}

