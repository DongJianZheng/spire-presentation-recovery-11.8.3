/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprahh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprkmh;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprmnh;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqed;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprtfh;
import com.spire.presentation.packages.sprufh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprogh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_119 = 3;
    public static final int cfr_renamed_91 = 1;
    public static final int cfr_renamed_0 = 4;
    public static final int cfr_renamed_1 = 2;
    private final sprco cfr_renamed_2;
    public static final int cfr_renamed_3 = 0;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprogh(sprnvm sprnvm2) {
        sprogh sprogh2 = this;
        sprogh2.cfr_renamed_4 = sprnvm2.cfr_renamed_312();
        switch (sprogh2.cfr_renamed_4) {
            case 0: {
                void arg0;
                this.cfr_renamed_2 = sprahh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_2 = sprufh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_2 = sprmnh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_2 = sprtfh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 4: {
                void arg0;
                this.cfr_renamed_2 = sprkmh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqed.cfr_renamed_9("F\u0004Y\u000bC\u0003KJL\u0002@\u0003L\u000f\u000f\u001cN\u0006Z\u000f\u000f")).append(this.cfr_renamed_4).toString());
    }

    public static sprogh cfr_renamed_8458(sprufh arg0) {
        return new sprogh(1, arg0);
    }

    public static sprogh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprogh) {
            return (sprogh)arg0;
        }
        if (arg0 != null) {
            return new sprogh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprogh cfr_renamed_8459(sprmnh arg0) {
        return new sprogh(2, arg0);
    }

    public sprco cfr_renamed_8460() {
        return this.cfr_renamed_2;
    }

    public static sprogh cfr_renamed_8461(sprkmh arg0) {
        return new sprogh(4, arg0);
    }

    public static sprogh cfr_renamed_8462(sprahh arg0) {
        return new sprogh(0, arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprogh(int n, sprco sprco2) {
        void arg0;
        sprogh sprogh2 = this;
        sprogh2.cfr_renamed_4 = arg0;
        sprogh2.cfr_renamed_2 = sprco2;
    }

    public static sprogh cfr_renamed_8463(sprtfh arg0) {
        return new sprogh(3, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_4;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprogh sprogh2 = this;
        return new sprycn(sprogh2.cfr_renamed_4, sprogh2.cfr_renamed_2);
    }
}

