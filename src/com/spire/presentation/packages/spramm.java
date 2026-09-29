/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhea;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproim;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprydf;
import com.spire.presentation.packages.sprzpm;

public class spramm
extends sprqqe
implements sprlm {
    private sproim cfr_renamed_2;
    private sprzpm cfr_renamed_3;
    private sprszm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spramm(sprnvm sprnvm2) {
        void arg0;
        if (sprnvm2.cfr_renamed_312() == 0) {
            this.cfr_renamed_3 = sprzpm.cfr_renamed_5085((sprnvm)arg0, false);
            return;
        }
        if (arg0.cfr_renamed_312() == 1) {
            this.cfr_renamed_2 = sproim.cfr_renamed_5085((sprnvm)arg0, false);
            return;
        }
        if (arg0.cfr_renamed_312() == 2) {
            this.cfr_renamed_4 = sprszm.cfr_renamed_5085((sprnvm)arg0, false);
            return;
        }
        throw new IllegalArgumentException(sprbhea.cfr_renamed_9("8m&m\"t##9b*#$mmF;j)f#`("));
    }

    public sprzpm cfr_renamed_685() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            return new sprycn(0 != 0, 0, (sprco)this.cfr_renamed_3);
        }
        if (this.cfr_renamed_2 != null) {
            return new sprycn(false, 1, (sprco)this.cfr_renamed_2);
        }
        return new sprycn(false, 2, (sprco)this.cfr_renamed_4);
    }

    public static spramm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprydf.cfr_renamed_9("k(g)k%()|%e`e5{4(\"m`m8x,a#a4d9(4i'o%l"));
        }
        return spramm.cfr_renamed_23(arg0.cfr_renamed_8225());
    }

    public spramm(sprzpm sprzpm2) {
        this.cfr_renamed_3 = sprzpm2;
    }

    public spramm(sproim sproim2) {
        this.cfr_renamed_2 = sproim2;
    }

    public static spramm cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spramm) {
            return (spramm)arg0;
        }
        if (arg0 instanceof sprnvm) {
            return new spramm(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        throw new IllegalArgumentException(sprbhea.cfr_renamed_9("8m&m\"t##\"a'f.wmj##*f9J#p9b#`("));
    }

    public sproim cfr_renamed_11331() {
        return this.cfr_renamed_2;
    }
}

