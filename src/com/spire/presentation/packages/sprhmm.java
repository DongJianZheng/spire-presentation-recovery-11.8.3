/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqnm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruqm;
import com.spire.presentation.packages.sprwqm;
import com.spire.presentation.packages.sprxgf;
import java.math.BigInteger;

public class sprhmm
extends sprqqe {
    public spruqm cfr_renamed_2;
    public sprktm cfr_renamed_3;
    public sprgbf cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhmm(sprwqm sprwqm2, spruqm spruqm2) {
        void arg0;
        sprhmm sprhmm2 = this;
        sprhmm2.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_119());
        sprhmm2.cfr_renamed_2 = spruqm2;
    }

    public BigInteger cfr_renamed_648() {
        return this.cfr_renamed_3.cfr_renamed_97();
    }

    public spruqm cfr_renamed_647() {
        return this.cfr_renamed_2;
    }

    public sprgbf cfr_renamed_651() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(3);
        sprhmm sprhmm2 = this;
        sprrvm2.cfr_renamed_5004(sprhmm2.cfr_renamed_3);
        if (sprhmm2.cfr_renamed_2 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_2);
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        return new sprcen(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprhmm(sprszm sprszm2) {
        void arg0;
        sprhmm sprhmm2 = this;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        sprhmm2.cfr_renamed_2 = null;
        sprhmm2.cfr_renamed_4 = null;
        if (sprszm2.cfr_renamed_84() > 2) {
            sprhmm sprhmm3 = this;
            sprhmm3.cfr_renamed_2 = spruqm.cfr_renamed_23(arg0.cfr_renamed_85(1));
            sprhmm3.cfr_renamed_4 = sprgbf.cfr_renamed_23(arg0.cfr_renamed_85(2));
            return;
        }
        if (arg0.cfr_renamed_84() > 1) {
            sprco sprco2 = arg0.cfr_renamed_85(1);
            if (sprco2 instanceof sprgbf) {
                this.cfr_renamed_4 = sprgbf.cfr_renamed_23(sprco2);
                return;
            }
            this.cfr_renamed_2 = spruqm.cfr_renamed_23(sprco2);
        }
    }

    public static sprhmm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return sprhmm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public sprhmm(sprwqm sprwqm2) {
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(sprwqm2.cfr_renamed_119());
    }

    public static sprhmm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprhmm) {
            return (sprhmm)arg0;
        }
        if (arg0 != null) {
            return new sprhmm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprhmm(sprwqm sprwqm2, spruqm spruqm2, sprqnm sprqnm2) {
        void arg1;
        void arg0;
        sprhmm sprhmm2 = this;
        this.cfr_renamed_3 = sprktm.cfr_renamed_23(arg0.cfr_renamed_119());
        sprhmm2.cfr_renamed_2 = arg1;
        sprhmm2.cfr_renamed_4 = sprqnm2;
    }
}

