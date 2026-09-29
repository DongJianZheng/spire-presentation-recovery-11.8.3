/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdrc;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprjtm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqtm;
import com.spire.presentation.packages.sprvmm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprlrm
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_119 = 1;
    public static final int cfr_renamed_91 = 2;
    private sprco cfr_renamed_0;
    public static final int cfr_renamed_1 = 4;
    public static final int cfr_renamed_2 = 3;
    private int cfr_renamed_3;
    public static final int cfr_renamed_4 = 0;

    public int cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    public sprco cfr_renamed_97() {
        return this.cfr_renamed_0;
    }

    public static sprlrm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprlrm.cfr_renamed_23(sprnvm.cfr_renamed_5085(arg0, true));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprlrm sprlrm2 = this;
        return new sprycn(false, sprlrm2.cfr_renamed_3, sprlrm2.cfr_renamed_0);
    }

    public sprlrm(sprvmm sprvmm2) {
        sprlrm sprlrm2 = this;
        sprlrm2.cfr_renamed_3 = 1;
        sprlrm2.cfr_renamed_0 = sprvmm2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprlrm(sprnvm sprnvm2) {
        sprlrm sprlrm2 = this;
        sprlrm2.cfr_renamed_3 = sprnvm2.cfr_renamed_312();
        switch (sprlrm2.cfr_renamed_3) {
            case 0: {
                void arg0;
                this.cfr_renamed_0 = sprgbf.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_0 = sprvmm.cfr_renamed_279(sprktm.cfr_renamed_5085((sprnvm)arg0, false).cfr_renamed_5023());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_0 = sprgbf.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_0 = sprqtm.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
            case 4: {
                void arg0;
                this.cfr_renamed_0 = sprjtm.cfr_renamed_5085((sprnvm)arg0, false);
                return;
            }
        }
        throw new IllegalArgumentException(sprdrc.cfr_renamed_9("'\u000b9\u000b=\u0012<E&\u00045E;\u000br5\u001d5\u001d5 \f$.7\u001c"));
    }

    public static sprlrm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprlrm) {
            return (sprlrm)arg0;
        }
        if (arg0 != null) {
            return new sprlrm(sprnvm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprlrm(sprqtm sprqtm2) {
        sprlrm sprlrm2 = this;
        sprlrm2.cfr_renamed_3 = 3;
        sprlrm2.cfr_renamed_0 = sprqtm2;
    }
}

