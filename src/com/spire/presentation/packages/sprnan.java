/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraym;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsym;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwjaa;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprzcn;

public class sprnan
extends sprqqe {
    private final sprco cfr_renamed_3;
    private final sprsym cfr_renamed_4;

    public sprco cfr_renamed_9307() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprnan(sprszm sprszm2) {
        sprnan sprnan2;
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(sprwjaa.cfr_renamed_9("\u000ef\u000fa\fu\u000eb\u0007'\u0010b\u0012r\u0006i\u0000b"));
        }
        sprco sprco2 = arg0.cfr_renamed_85(0);
        if (sprco2 instanceof sprzcn) {
            sprnan2 = this;
            this.cfr_renamed_3 = sprco2;
        } else if (sprco2 instanceof spraym) {
            sprnan2 = this;
            this.cfr_renamed_3 = sprco2;
        } else {
            sprszm sprszm3 = sprszm.cfr_renamed_23(sprco2);
            if (sprszm3.cfr_renamed_84() == 2) {
                sprnan2 = this;
                this.cfr_renamed_3 = sprzcn.cfr_renamed_23(sprszm3);
            } else {
                sprnan2 = this;
                this.cfr_renamed_3 = spraym.cfr_renamed_23(sprszm3);
            }
        }
        sprnan2.cfr_renamed_4 = sprsym.cfr_renamed_23(arg0.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_4);
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public sprnan(sprzcn sprzcn2, sprsym sprsym2) {
        void arg0;
        sprnan sprnan2 = this;
        sprnan2.cfr_renamed_3 = arg0;
        sprnan2.cfr_renamed_4 = sprsym2;
    }

    /*
     * WARNING - void declaration
     */
    public sprnan(spraym spraym2, sprsym sprsym2) {
        void arg0;
        sprnan sprnan2 = this;
        sprnan2.cfr_renamed_3 = arg0;
        sprnan2.cfr_renamed_4 = sprsym2;
    }

    public static sprnan cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnan) {
            return (sprnan)arg0;
        }
        if (arg0 != null) {
            return new sprnan(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprsym cfr_renamed_9306() {
        return this.cfr_renamed_4;
    }
}

