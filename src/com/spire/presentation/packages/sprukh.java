/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhmh;
import com.spire.presentation.packages.sprnkh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.spryffa;
import com.spire.presentation.packages.sprzdh;

public class sprukh
extends sprqqe {
    private final sprnkh cfr_renamed_3;
    private final sprhmh cfr_renamed_4;

    public static sprukh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprukh) {
            return (sprukh)arg0;
        }
        if (arg0 != null) {
            if (arg0 instanceof sprzdh) {
                return new sprukh(sprszm.cfr_renamed_23(((sprzdh)arg0).cfr_renamed_480()));
            }
            return new sprukh(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprukh(sprhmh sprhmh2, sprnkh sprnkh2) {
        void arg0;
        sprukh sprukh2 = this;
        sprukh2.cfr_renamed_4 = arg0;
        sprukh2.cfr_renamed_3 = sprnkh2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprukh(sprszm sprszm2) {
        void arg0;
        if (sprszm2.cfr_renamed_84() != 2) {
            throw new IllegalArgumentException(spryffa.cfr_renamed_9("\u0018n\rs\u001eb\u0018r]e\u0018g\bs\u0013u\u00186\u000e\u007f\u0007s]y\u001b6O"));
        }
        void v0 = arg0;
        this.cfr_renamed_4 = sprhmh.cfr_renamed_23(v0.cfr_renamed_85(0));
        this.cfr_renamed_3 = sprnkh.cfr_renamed_23(v0.cfr_renamed_85(1));
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprco[] sprcoArray = new sprco[2];
        sprcoArray[0] = this.cfr_renamed_4;
        sprcoArray[1] = this.cfr_renamed_3;
        return new sprcen(sprcoArray);
    }

    public sprhmh cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    public sprnkh cfr_renamed_480() {
        return this.cfr_renamed_3;
    }
}

