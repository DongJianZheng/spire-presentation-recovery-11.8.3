/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprech;
import com.spire.presentation.packages.sprkch;
import com.spire.presentation.packages.sprnli;
import com.spire.presentation.packages.sproxg;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprghh
extends sprqqe {
    private final sproxg cfr_renamed_3;
    private final sprkch cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprghh(sprkch sprkch2, sproxg sproxg2) {
        void arg0;
        sprghh sprghh2 = this;
        sprghh2.cfr_renamed_4 = arg0;
        sprghh2.cfr_renamed_3 = sproxg2;
    }

    public sproxg cfr_renamed_8355() {
        return this.cfr_renamed_3;
    }

    public static sprghh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprghh) {
            return (sprghh)arg0;
        }
        if (arg0 != null) {
            return new sprghh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprech cfr_renamed_7843() {
        return new sprech();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprghh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprnli.cfr_renamed_9("lnysjblr)elg|sgul6z\u007fss)yo6;"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprkch.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sproxg.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprkch cfr_renamed_4624() {
        return this.cfr_renamed_4;
    }
}

