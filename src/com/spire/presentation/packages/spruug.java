/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprtma;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprzdh;
import com.spire.presentation.packages.sprzih;

public class spruug
extends sprqqe
implements sprlm {
    private final int cfr_renamed_1;
    public static final int cfr_renamed_2 = 1;
    private final sprco cfr_renamed_3;
    public static final int cfr_renamed_4 = 0;

    public static spruug cfr_renamed_8350(byte[] arg0) {
        return new spruug(0, new sprfvg(arg0));
    }

    /*
     * WARNING - void declaration
     */
    public spruug(int n, sprco sprco2) {
        void arg0;
        spruug spruug2 = this;
        spruug2.cfr_renamed_1 = arg0;
        spruug2.cfr_renamed_3 = sprco2;
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ spruug(sprnvm sprnvm2) {
        spruug spruug2 = this;
        spruug2.cfr_renamed_1 = sprnvm2.cfr_renamed_312();
        switch (spruug2.cfr_renamed_1) {
            case 0: {
                void arg0;
                this.cfr_renamed_3 = sprzdh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_3 = sprzih.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtma.cfr_renamed_9("3c,l6d>-9e5d9hz{;a/hz")).append(this.cfr_renamed_1).toString());
    }

    @Override
    public sprxgf cfr_renamed_119() {
        spruug spruug2 = this;
        return new sprycn(spruug2.cfr_renamed_1, spruug2.cfr_renamed_3);
    }

    public static spruug cfr_renamed_8351(sprzih arg0) {
        return new spruug(1, arg0);
    }

    public static spruug cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spruug) {
            return (spruug)arg0;
        }
        if (arg0 != null) {
            return new spruug(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static spruug cfr_renamed_8352(sproug arg0) {
        return new spruug(0, arg0);
    }

    public sprco cfr_renamed_8353() {
        return this.cfr_renamed_3;
    }
}

