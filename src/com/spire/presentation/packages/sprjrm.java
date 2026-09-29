/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprawc;
import com.spire.presentation.packages.sprbxm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprldn;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprusc;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprjrm
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_1 = 1;
    public static final int cfr_renamed_2 = 0;
    public static final int cfr_renamed_3 = 2;
    private sprnvm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjrm(sprnvm sprnvm2) {
        void arg0;
        if (sprnvm2.cfr_renamed_312() > 2) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprawc.cfr_renamed_9("a`G!W`D!MtNcFs\u0019!")).append(arg0.cfr_renamed_312()).toString());
        }
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprjrm(int n) {
        void arg0;
        sprjrm sprjrm2 = this;
        sprjrm2.cfr_renamed_4 = new sprycn(0 != 0, 0, (sprco)new sprktm((long)arg0));
    }

    /*
     * WARNING - void declaration
     */
    public sprjrm(sprjfn sprjfn2) {
        void arg0;
        sprjrm sprjrm2 = this;
        sprjrm2.cfr_renamed_4 = new sprycn(false, 2, (sprco)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprjrm(boolean bl, String string) {
        sprrvm sprrvm2;
        void arg1;
        void arg0;
        if (string.length() > 2) {
            throw new IllegalArgumentException(sprusc.cfr_renamed_9("n\u0000x\u0001y\u001dtOn\u000ecOb\u0001a\u0016-\rhO?On\u0007l\u001dl\fy\n\u007f\u001c"));
        }
        if (arg0 != false) {
            sprjrm sprjrm2 = this;
            sprjrm2.cfr_renamed_4 = new sprycn(false, 1, (sprco)new sprcen(new sprldn((String)arg1, true)));
            return;
        }
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(sprbxm.cfr_renamed_4);
        sprrvm3.cfr_renamed_5004(new sprldn((String)arg1, true));
        this.cfr_renamed_4 = new sprycn(false, 1, (sprco)new sprcen(sprrvm2));
    }

    public sprjfn cfr_renamed_4478() {
        if (this.cfr_renamed_4.cfr_renamed_312() != 2) {
            return null;
        }
        return sprjfn.cfr_renamed_5085(this.cfr_renamed_4, false);
    }

    public int cfr_renamed_4630() {
        if (this.cfr_renamed_4.cfr_renamed_312() != 0) {
            return -1;
        }
        return sprktm.cfr_renamed_5085(this.cfr_renamed_4, false).cfr_renamed_5023();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        return this.cfr_renamed_4;
    }

    public int cfr_renamed_324() {
        return this.cfr_renamed_4.cfr_renamed_312();
    }

    public static sprjrm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof sprjrm) {
            return (sprjrm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new sprjrm(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprawc.cfr_renamed_9("hOmFfBm\u0003nAkFbW!Jo\u0003fFujoPuBo@d\u0019!")).append(arg0.getClass().getName()).toString());
    }

    public sprszm cfr_renamed_4631() {
        if (this.cfr_renamed_4.cfr_renamed_312() != 1) {
            return null;
        }
        return sprszm.cfr_renamed_5085(this.cfr_renamed_4, false);
    }
}

