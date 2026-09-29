/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbjy;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprnih;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprvch;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryfh;

public class sprmnh
extends sprqqe {
    private final spryfh cfr_renamed_3;
    private final sprvch cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmnh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprbjy.cfr_renamed_9("(B=_.N(^mI(K8_#Y(\u001a>S7_mU+\u001a\u007f"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprvch.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = spryfh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprvch cfr_renamed_8472() {
        return this.cfr_renamed_4;
    }

    public spryfh cfr_renamed_8435() {
        return this.cfr_renamed_3;
    }

    public static sprnih cfr_renamed_7843() {
        return new sprnih();
    }

    /*
     * WARNING - void declaration
     */
    public sprmnh(sprvch sprvch2, spryfh spryfh2) {
        void arg0;
        sprmnh sprmnh2 = this;
        sprmnh2.cfr_renamed_4 = arg0;
        sprmnh2.cfr_renamed_3 = spryfh2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    public static sprmnh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprmnh) {
            return (sprmnh)arg0;
        }
        if (arg0 != null) {
            return new sprmnh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

