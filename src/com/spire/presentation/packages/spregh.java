/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprenh;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrdh;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class spregh
extends sprqqe {
    private final sprktm cfr_renamed_3;
    private final sprjfh cfr_renamed_4;

    public static spregh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spregh) {
            return (spregh)arg0;
        }
        if (arg0 != null) {
            return new spregh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public static sprrdh cfr_renamed_7843() {
        return new sprrdh();
    }

    public sprktm cfr_renamed_8429() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public spregh(sprjfh sprjfh2, sprktm sprktm2) {
        void arg0;
        spregh spregh2 = this;
        spregh2.cfr_renamed_4 = arg0;
        spregh2.cfr_renamed_3 = sprktm2;
    }

    public sprjfh cfr_renamed_8428() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = sprenh.cfr_renamed_23(this.cfr_renamed_3);
        return new sprcen(sprcoArray);
    }

    /*
     * WARNING - void declaration
     */
    public spregh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprrgo.cfr_renamed_9("R^GCTRRB\u0017URWBCYER\u0006DOMC\u0017IQ\u0006\u0005"));
        }
        this.cfr_renamed_4 = sprjfh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        if (arg0.cfr_renamed_84() == 2) {
            this.cfr_renamed_3 = sprenh.cfr_renamed_8135(sprktm.class, arg0.cfr_renamed_85(1));
            return;
        }
        this.cfr_renamed_3 = null;
    }
}

