/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbeh;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfan;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqad;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprteh;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;

public class sprwgh
extends sprqqe
implements sprlm {
    public static final int cfr_renamed_91 = 1;
    private final int cfr_renamed_0;
    public static final int cfr_renamed_1 = 0;
    private final sprco cfr_renamed_2;
    public static final int cfr_renamed_3 = 3;
    public static final int cfr_renamed_4 = 2;

    @Override
    public sprxgf cfr_renamed_119() {
        sprwgh sprwgh2 = this;
        return new sprycn(sprwgh2.cfr_renamed_0, sprwgh2.cfr_renamed_2).cfr_renamed_119();
    }

    public static sprwgh cfr_renamed_8327(sprteh arg0) {
        return new sprwgh(1, arg0);
    }

    public int cfr_renamed_8227() {
        return this.cfr_renamed_0;
    }

    public static sprwgh cfr_renamed_8328() {
        return new sprwgh(3, sprpen.cfr_renamed_4);
    }

    public static sprwgh cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprwgh) {
            return (sprwgh)arg0;
        }
        if (arg0 != null) {
            return new sprwgh(sprnvm.cfr_renamed_6501(arg0, 128));
        }
        return null;
    }

    public static sprwgh cfr_renamed_8329(sprbeh arg0) {
        return new sprwgh(0, arg0);
    }

    public static sprwgh cfr_renamed_8330(sproug arg0) {
        return new sprwgh(2, arg0);
    }

    public static sprwgh cfr_renamed_8331(byte[] arg0) {
        return new sprwgh(2, new sprfvg(arg0));
    }

    public sprco cfr_renamed_8332() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public sprwgh(int n, sprco sprco2) {
        void arg0;
        sprwgh sprwgh2 = this;
        sprwgh2.cfr_renamed_0 = arg0;
        sprwgh2.cfr_renamed_2 = sprco2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ sprwgh(sprnvm sprnvm2) {
        sprwgh sprwgh2 = this;
        sprwgh2.cfr_renamed_0 = sprnvm2.cfr_renamed_312();
        switch (sprwgh2.cfr_renamed_0) {
            case 0: {
                void arg0;
                this.cfr_renamed_2 = sprbeh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 1: {
                void arg0;
                this.cfr_renamed_2 = sprteh.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 2: {
                void arg0;
                this.cfr_renamed_2 = sprfvg.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
            case 3: {
                void arg0;
                this.cfr_renamed_2 = sprfan.cfr_renamed_23(arg0.cfr_renamed_8225());
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqad.cfr_renamed_9("\u000eJ\u0011E\u000bM\u0003\u0004\u0004L\bM\u0004AGR\u0006H\u0012AG")).append(this.cfr_renamed_0).toString());
    }
}

