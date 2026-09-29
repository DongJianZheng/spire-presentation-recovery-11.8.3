/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToHtmlOption;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdsg;
import com.spire.presentation.packages.sprgah;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryd;

public class sprbbh
extends sprqqe
implements spryd {
    private final sprdsg cfr_renamed_3;
    private final sprdsg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprbbh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(SaveToHtmlOption.cfr_renamed_9("\n\u0017\u001f\n\f\u001b\n\u000bO\u001c\n\u001e\u001a\n\u0001\f\nO\u001c\u0006\u0015\nO\u0000\tO]"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprdsg.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprdsg.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    public sprdsg cfr_renamed_8365() {
        return this.cfr_renamed_3;
    }

    public sprdsg cfr_renamed_8366() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprbbh(sprdsg sprdsg2, sprdsg sprdsg3) {
        void arg0;
        sprbbh sprbbh2 = this;
        sprbbh2.cfr_renamed_4 = arg0;
        sprbbh2.cfr_renamed_3 = sprdsg3;
    }

    public static sprgah cfr_renamed_7843() {
        return new sprgah();
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    public static sprbbh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprbbh) {
            return (sprbbh)arg0;
        }
        if (arg0 != null) {
            return new sprbbh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

