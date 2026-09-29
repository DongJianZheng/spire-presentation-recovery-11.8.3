/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdkea;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprppy;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sproqg
extends sprqqe
implements sprlm {
    private final int cfr_renamed_2;
    public static final int cfr_renamed_3 = 0;
    private final sprco cfr_renamed_4;

    public int cfr_renamed_8227() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sproqg(int n, sprco sprco2) {
        void arg0;
        sproqg sproqg2 = this;
        sproqg2.cfr_renamed_2 = arg0;
        sproqg2.cfr_renamed_4 = sprco2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sproqg(sprnvm sprnvm2) {
        sproqg sproqg2 = this;
        sproqg2.cfr_renamed_2 = sprnvm2.cfr_renamed_312();
        if (sproqg2.cfr_renamed_2 == 0) {
            void arg0;
            sproug sproug2 = sprfvg.cfr_renamed_23(arg0.cfr_renamed_8225());
            if (sproug2.cfr_renamed_186().length != 16) {
                throw new IllegalArgumentException(sprdkea.cfr_renamed_9("it{ :)kre1{ezxfv(\u007fge( >1jh|t{"));
            }
            this.cfr_renamed_4 = sproug2;
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprppy.cfr_renamed_9("l7s8i0ayf1j0f<%/d5p<%")).append(this.cfr_renamed_2).toString());
    }

    public static sproqg cfr_renamed_8341(byte[] arg0) {
        return new sproqg(0, new sprfvg(arg0));
    }

    public static sproqg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sproqg) {
            return (sproqg)arg0;
        }
        if (arg0 != null) {
            return new sproqg(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public sprco cfr_renamed_8342() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sproqg sproqg2 = this;
        return new sprycn(sproqg2.cfr_renamed_2, sproqg2.cfr_renamed_4);
    }

    public static sproqg cfr_renamed_8343(sproug arg0) {
        return new sproqg(0, arg0);
    }
}

