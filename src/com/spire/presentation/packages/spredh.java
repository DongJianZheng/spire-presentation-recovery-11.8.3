/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprchh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprjch;
import com.spire.presentation.packages.sprpch;
import com.spire.presentation.packages.sprpkh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprsap;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvjh;
import com.spire.presentation.packages.sprvwg;
import com.spire.presentation.packages.sprxgf;

public class spredh
extends sprqqe {
    private final sprvjh cfr_renamed_1;
    private final sprvwg cfr_renamed_2;
    private final sprpkh cfr_renamed_3;
    private final sprjch cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public spredh(sprjch sprjch2, sprvjh sprvjh2, sprpkh sprpkh2, sprvwg sprvwg2) {
        void arg2;
        void arg1;
        void arg0;
        spredh spredh2 = this;
        spredh spredh3 = this;
        spredh3.cfr_renamed_4 = arg0;
        spredh3.cfr_renamed_1 = arg1;
        spredh2.cfr_renamed_3 = arg2;
        spredh2.cfr_renamed_2 = sprvwg2;
    }

    public sprpkh cfr_renamed_3489() {
        return this.cfr_renamed_3;
    }

    public sprvjh cfr_renamed_8270() {
        return this.cfr_renamed_1;
    }

    public static sprchh cfr_renamed_7843() {
        return new sprchh();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[4];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_1;
        sprcoArray[2] = this.cfr_renamed_3;
        sprcoArray[3] = this.cfr_renamed_2;
        return sprpch.cfr_renamed_8211(sprcoArray);
    }

    public static spredh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spredh) {
            return (spredh)arg0;
        }
        if (arg0 != null) {
            return new spredh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprjch cfr_renamed_8271() {
        return this.cfr_renamed_4;
    }

    public sprvwg cfr_renamed_79() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spredh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(sprsap.cfr_renamed_9("YQLL_]YM\u001cZYXILRJY\tO@FL\u001cFZ\t\b"));
        }
        void v0 = arg0;
        spredh spredh2 = this;
        spredh2.cfr_renamed_4 = sprjch.cfr_renamed_23(arg0.cfr_renamed_85(0));
        spredh2.cfr_renamed_1 = sprvjh.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_3 = sprpkh.cfr_renamed_23(v0.cfr_renamed_85(2));
        this.cfr_renamed_2 = sprvwg.cfr_renamed_23(v0.cfr_renamed_85(3));
    }
}

