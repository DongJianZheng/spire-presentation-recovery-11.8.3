/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfum;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprseca;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtkm;
import com.spire.presentation.packages.sprxgf;

public class sprsom
extends sprqqe {
    private final sprhmm cfr_renamed_1;
    private sproug cfr_renamed_2;
    private final sprktm cfr_renamed_3;
    private sprfum cfr_renamed_4;

    private /* synthetic */ sprsom(sprszm arg0) {
        sprszm sprszm2 = arg0;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        this.cfr_renamed_1 = sprhmm.cfr_renamed_23(sprszm2.cfr_renamed_85(1));
        if (sprszm2.cfr_renamed_84() >= 3) {
            if (arg0.cfr_renamed_84() == 3) {
                sprco sprco2 = arg0.cfr_renamed_85(2);
                if (sprco2 instanceof sproug) {
                    this.cfr_renamed_2 = sproug.cfr_renamed_23(sprco2);
                    return;
                }
                this.cfr_renamed_4 = sprfum.cfr_renamed_23(sprco2);
                return;
            }
            sprszm sprszm3 = arg0;
            this.cfr_renamed_4 = sprfum.cfr_renamed_23(sprszm3.cfr_renamed_85(2));
            this.cfr_renamed_2 = sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(3));
        }
    }

    public sprktm cfr_renamed_4420() {
        return this.cfr_renamed_3;
    }

    public sprfum cfr_renamed_4895() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprsom(sprktm sprktm2, sprhmm sprhmm2, sprfum sprfum2, sproug sproug2) {
        void arg3;
        void arg2;
        void arg0;
        void arg1;
        if (sprktm2 == null) {
            throw new IllegalArgumentException(sprtkm.cfr_renamed_9("\u0004<F-W\rF.j;\u0004\u007f@>M1L+\u0003=F\u007fM*O3"));
        }
        if (arg1 == null) {
            throw new IllegalArgumentException(sprseca.cfr_renamed_9("Qg\u0002u\u0002a\u00053Vw\u0017z\u0018{\u00024\u0014qVz\u0003x\u001a"));
        }
        sprsom sprsom2 = this;
        this.cfr_renamed_3 = arg0;
        sprsom2.cfr_renamed_1 = arg1;
        sprsom2.cfr_renamed_4 = arg2;
        this.cfr_renamed_2 = arg3;
    }

    public static sprsom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprsom) {
            return (sprsom)arg0;
        }
        if (arg0 != null) {
            return new sprsom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprsom(sprktm arg0, sprhmm arg1) {
        this(arg0, arg1, null, null);
    }

    public sprhmm cfr_renamed_648() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(4);
        sprsom sprsom2 = this;
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm2.cfr_renamed_5004(sprsom2.cfr_renamed_1);
        if (sprsom2.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        if (this.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        return new sprcen(sprrvm2);
    }
}

