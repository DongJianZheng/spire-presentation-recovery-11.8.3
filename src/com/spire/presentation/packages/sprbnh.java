/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spradh;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhmh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprudda;
import com.spire.presentation.packages.sprvrg;
import com.spire.presentation.packages.sprxdh;
import com.spire.presentation.packages.sprxgf;

public class sprbnh
extends sprqqe {
    private final sprhmh cfr_renamed_1;
    private final sprvrg cfr_renamed_2;
    private final sprvrg cfr_renamed_3;
    private final sprxdh cfr_renamed_4;

    public sprvrg cfr_renamed_2132() {
        return this.cfr_renamed_3;
    }

    public static sprbnh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbnh) {
            return (sprbnh)arg0;
        }
        if (arg0 != null) {
            return new sprbnh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[4];
        sprcoArray[0] = this.cfr_renamed_1;
        sprcoArray[1] = this.cfr_renamed_3;
        sprcoArray[2] = this.cfr_renamed_2;
        sprcoArray[3] = this.cfr_renamed_4;
        return new sprcen(sprcoArray);
    }

    public static spradh cfr_renamed_7843() {
        return new spradh();
    }

    public sprxdh cfr_renamed_8434() {
        return this.cfr_renamed_4;
    }

    public sprhmh cfr_renamed_3() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprbnh(sprhmh sprhmh2, sprvrg sprvrg2, sprvrg sprvrg3, sprxdh sprxdh2) {
        void arg2;
        void arg1;
        void arg0;
        sprbnh sprbnh2 = this;
        sprbnh sprbnh3 = this;
        sprbnh3.cfr_renamed_1 = arg0;
        sprbnh3.cfr_renamed_3 = arg1;
        sprbnh2.cfr_renamed_2 = arg2;
        sprbnh2.cfr_renamed_4 = sprxdh2;
    }

    public sprvrg cfr_renamed_2133() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbnh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(sprudda.cfr_renamed_9("J%_8L)J9\u000f.J,Z8A>J}\\4U8\u000f2I}\u001b"));
        }
        void v0 = arg0;
        sprbnh sprbnh2 = this;
        sprbnh2.cfr_renamed_1 = sprhmh.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprbnh2.cfr_renamed_3 = sprvrg.cfr_renamed_23(arg0.cfr_renamed_85(1));
        this.cfr_renamed_2 = sprvrg.cfr_renamed_23(v0.cfr_renamed_85(2));
        this.cfr_renamed_4 = sprxdh.cfr_renamed_23(v0.cfr_renamed_85(3));
    }
}

