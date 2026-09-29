/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhhm;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprylp;

public class sprrkm
extends sprqqe
implements sprlm {
    private final spraem cfr_renamed_3;
    private final sprhhm cfr_renamed_4;

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_4 != null) {
            return new sprycn(true, 0, (sprco)this.cfr_renamed_4);
        }
        return new sprycn(1 != 0, 1, (sprco)this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprrkm(sprnvm sprnvm2) {
        void arg0;
        switch (sprnvm2.cfr_renamed_312()) {
            case 0: {
                this.cfr_renamed_4 = sprhhm.cfr_renamed_5085((sprnvm)arg0, true);
                this.cfr_renamed_3 = null;
                return;
            }
            case 1: {
                this.cfr_renamed_4 = null;
                this.cfr_renamed_3 = spraem.cfr_renamed_5085((sprnvm)arg0, true);
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprylp.cfr_renamed_9("\u001bg\u0005g\u0001~\u0000)\u001ah\t)")).append(arg0.cfr_renamed_312()).toString());
    }

    public spraem cfr_renamed_102() {
        return this.cfr_renamed_3;
    }

    public sprhhm cfr_renamed_11355() {
        return this.cfr_renamed_4;
    }

    public static sprrkm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprrkm) {
            return (sprrkm)arg0;
        }
        if (arg0 != null) {
            return new sprrkm(sprnvm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprrkm(sprhhm sprhhm2, spraem spraem2) {
        void arg0;
        void v1;
        void arg1;
        boolean bl;
        if (sprhhm2 == null) {
            bl = true;
            v1 = arg1;
        } else {
            bl = false;
            v1 = arg1;
        }
        if (bl == (v1 == null)) {
            throw new IllegalArgumentException(spruaf.cfr_renamed_9("nn\u007fonu+c{i+hy'btxrnu+j~t\u007f'ib+tns"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }
}

