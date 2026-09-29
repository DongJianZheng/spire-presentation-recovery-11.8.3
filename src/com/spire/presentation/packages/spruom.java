/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfdn;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;
import java.util.Enumeration;

public class spruom
extends sprqqe
implements sprdl {
    private sprlem cfr_renamed_2888;
    private sprco cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ spruom(sprszm sprszm2) {
        void arg0;
        spruom spruom2 = this;
        spruom2.cfr_renamed_4 = true;
        Enumeration enumeration = sprszm2.cfr_renamed_329();
        spruom2.cfr_renamed_2888 = (sprlem)enumeration.nextElement();
        if (enumeration.hasMoreElements()) {
            this.cfr_renamed_3 = ((sprnvm)enumeration.nextElement()).cfr_renamed_8225();
        }
        this.cfr_renamed_4 = arg0 instanceof sprqcn;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2 = new sprrvm(2);
        spruom spruom2 = this;
        sprrvm2.cfr_renamed_5004(spruom2.cfr_renamed_2888);
        if (spruom2.cfr_renamed_3 != null) {
            sprrvm2.cfr_renamed_5004(new sprkdn(true, 0, this.cfr_renamed_3));
        }
        if (this.cfr_renamed_4) {
            return new sprqcn(sprrvm2);
        }
        return new sprfdn(sprrvm2);
    }

    /*
     * WARNING - void declaration
     */
    public spruom(sprlem sprlem2, sprco sprco2) {
        void arg0;
        spruom spruom2 = this;
        this.cfr_renamed_4 = true;
        spruom2.cfr_renamed_2888 = arg0;
        spruom2.cfr_renamed_3 = sprco2;
    }

    public sprco cfr_renamed_480() {
        return this.cfr_renamed_3;
    }

    public static spruom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruom) {
            return (spruom)arg0;
        }
        if (arg0 != null) {
            return new spruom(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_2888;
    }
}

