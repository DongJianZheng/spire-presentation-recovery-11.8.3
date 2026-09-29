/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkaq;
import com.spire.presentation.packages.sprmmh;
import com.spire.presentation.packages.sprqfh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprijh
extends sprqqe {
    private final sprmmh cfr_renamed_3;
    private final sprqfh cfr_renamed_4;

    public sprmmh cfr_renamed_8449() {
        return this.cfr_renamed_3;
    }

    public static sprijh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprijh) {
            return (sprijh)arg0;
        }
        if (arg0 != null) {
            return new sprijh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprijh(sprmmh sprmmh2, sprqfh sprqfh2) {
        void arg0;
        sprijh sprijh2 = this;
        sprijh2.cfr_renamed_3 = arg0;
        sprijh2.cfr_renamed_4 = sprqfh2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_3;
        sprcoArray[1] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    public sprqfh cfr_renamed_8448() {
        return this.cfr_renamed_4;
    }

    public static spragh cfr_renamed_7843() {
        return new spragh();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprijh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprkaq.cfr_renamed_9("\na\u001f|\fm\n}Oj\nh\u001a|\u0001z\n9\u001cp\u0015|Ov\t9]"));
        }
        void v0 = arg0;
        this.cfr_renamed_3 = sprmmh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_4 = sprqfh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }
}

