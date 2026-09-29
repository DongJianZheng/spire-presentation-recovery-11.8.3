/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbty;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprmtg;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sproyh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprfnh
extends sprqqe {
    private final sproug cfr_renamed_3;
    private final sproug cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfnh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sproyh.cfr_renamed_9("\u001fn\ns\u0019b\u001frZe\u001fg\u000fs\u0014u\u001f6\t\u007f\u0000sZy\u001c6H"));
        }
        sprfnh sprfnh2 = this;
        sprfnh2.cfr_renamed_4 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprfnh2.cfr_renamed_3 = sproug.cfr_renamed_23(arg0.cfr_renamed_85(1));
        if (this.cfr_renamed_4.cfr_renamed_186().length != 32) {
            throw new IllegalArgumentException(sprbty.cfr_renamed_9("3Q&\u00048\u0005k\u0013.QxCk\u00132\u0005.\u0002k\u001d$\u001f,"));
        }
        if (this.cfr_renamed_3.cfr_renamed_186().length != 32) {
            throw new IllegalArgumentException(sproyh.cfr_renamed_9("\u00036\u0017c\tbZt\u001f6I$Zt\u0003b\u001feZz\u0015x\u001d"));
        }
    }

    public sproug cfr_renamed_1980() {
        return this.cfr_renamed_4;
    }

    public static sprmtg cfr_renamed_7843() {
        return new sprmtg();
    }

    public sproug spr\u3181() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    public static sprfnh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfnh) {
            return (sprfnh)arg0;
        }
        if (arg0 != null) {
            return new sprfnh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprfnh(sproug sproug2, sproug sproug3) {
        void arg1;
        void arg0;
        if (sproug2 == null || arg0.cfr_renamed_186().length != 32) {
            throw new IllegalArgumentException(sprbty.cfr_renamed_9("3Q&\u00048\u0005k\u0013.QxCk\u00132\u0005.\u0002k\u001d$\u001f,"));
        }
        if (arg1 == null || arg1.cfr_renamed_186().length != 32) {
            throw new IllegalArgumentException(sproyh.cfr_renamed_9("\u00036\u0017c\tbZt\u001f6I$Zt\u0003b\u001feZz\u0015x\u001d"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }
}

