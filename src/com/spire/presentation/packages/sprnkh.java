/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfh;
import com.spire.presentation.packages.sprckh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprijh;
import com.spire.presentation.packages.sprlih;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpeh;
import com.spire.presentation.packages.sprpug;
import com.spire.presentation.packages.sprqdh;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprtjh;
import com.spire.presentation.packages.sprwlh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprxkh;
import com.spire.presentation.packages.sprycn;

public class sprnkh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_79 = 6;
    public static final int cfr_renamed_107 = 0;
    private final int cfr_renamed_132;
    public static final int cfr_renamed_102 = 4;
    public static final int cfr_renamed_93 = 9;
    private final sprco cfr_renamed_86;
    public static final int cfr_renamed_152 = 3;
    public static final int cfr_renamed_112 = 1;
    public static final int cfr_renamed_119 = 10;
    public static final int cfr_renamed_91 = 11;
    public static final int cfr_renamed_0 = 7;
    public static final int cfr_renamed_1 = 5;
    public static final int cfr_renamed_2 = 12;
    public static final int cfr_renamed_3 = 2;
    public static final int cfr_renamed_4 = 8;

    public sprco cfr_renamed_8451() {
        return this.cfr_renamed_86;
    }

    /*
     * WARNING - void declaration
     */
    public sprnkh(int n, sprco sprco2) {
        void arg0;
        sprnkh sprnkh2 = this;
        sprnkh2.cfr_renamed_132 = arg0;
        sprnkh2.cfr_renamed_86 = sprco2;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprnkh sprnkh2 = this;
        return new sprycn(sprnkh2.cfr_renamed_132, sprnkh2.cfr_renamed_86);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_132;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprnkh(sprnvm sprnvm2) {
        sprnkh sprnkh2 = this;
        sprnkh2.cfr_renamed_132 = sprnvm2.cfr_renamed_312();
        switch (sprnkh2.cfr_renamed_132) {
            case 0: {
                void arg0;
                this.cfr_renamed_86 = sprcfh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_86 = sprtjh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_86 = sprwlh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_86 = sprpeh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 5: {
                void arg0;
                this.cfr_renamed_86 = sprlih.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 6: {
                void arg0;
                this.cfr_renamed_86 = sprqdh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 7: {
                void arg0;
                this.cfr_renamed_86 = sprijh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 8: {
                void arg0;
                this.cfr_renamed_86 = sprckh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 9: {
                void arg0;
                this.cfr_renamed_86 = sprxkh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprpug.cfr_renamed_9("{PwQ{]8VwL8QuHt]u]vL}\\8")).append(this.cfr_renamed_132).toString());
    }

    public static sprnkh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnkh) {
            return (sprnkh)arg0;
        }
        if (arg0 != null) {
            return new sprnkh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }
}

