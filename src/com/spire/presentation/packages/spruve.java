/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprkj;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprmsf;
import com.spire.presentation.packages.sprrvca;
import com.spire.presentation.packages.sprsdn;
import com.spire.presentation.packages.sprvqe;
import com.spire.presentation.packages.sprvre;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.spryte;

public class spruve
extends sprkra
implements sprkj {
    private spra cfr_renamed_4;

    public static spruve cfr_renamed_23(Object arg0) {
        if (arg0 == null || arg0 instanceof spruve) {
            return (spruve)arg0;
        }
        if (arg0 instanceof sprvre) {
            return new spruve((sprvre)arg0);
        }
        if (arg0 instanceof sprrvca) {
            return new spruve((sprrvca)arg0);
        }
        if (arg0 instanceof sprvqe) {
            return new spruve((sprvqe)arg0);
        }
        if (arg0 instanceof spryte) {
            return new spruve((spryte)arg0);
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprmsf.cfr_renamed_9("\u0011\r.\u00024\n<C\u0017\u00111\u00041\r9\u00177\u0011\u0011\u0007=\r,\n>\n=\u0011\u0017\u0011\u0013\u0006!Yx")).append(arg0.getClass().getName()).toString());
    }

    public static spruve cfr_renamed_341(spryte arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprsdn.cfr_renamed_9("4N\u0019\b\u0003\u000f\u001eB\u0007C\u001eL\u001e[\u001bVW[\u0016HW`\u0005F\u0010F\u0019N\u0003@\u0005f\u0013J\u0019[\u001eI\u001eJ\u0005`\u0005d\u0012V"));
        }
        return spruve.cfr_renamed_23(arg0.cfr_renamed_2456());
    }

    /*
     * WARNING - void declaration
     */
    public spruve(sprrvca sprrvca2) {
        void arg0;
        spruve spruve2 = this;
        spruve2.cfr_renamed_4 = new sprhse(0 != 0, 0, (spra)arg0);
    }

    public spruve(sprvre sprvre2) {
        this.cfr_renamed_4 = sprvre2;
    }

    public spruve(sprvva sprvva2) {
        this.cfr_renamed_4 = sprvva2;
    }

    public sprrvca cfr_renamed_3955() {
        if (this.cfr_renamed_4 instanceof spryte && ((spryte)this.cfr_renamed_4).cfr_renamed_312() == 0) {
            return sprrvca.cfr_renamed_341((spryte)this.cfr_renamed_4, false);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public spruve(sprvqe sprvqe2) {
        void arg0;
        spruve spruve2 = this;
        spruve2.cfr_renamed_4 = new sprhse(false, 1, (spra)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public spruve(sprxue sprxue2) {
        this(new sprrvca(arg0.cfr_renamed_186()));
        void arg0;
    }

    public sprvre cfr_renamed_4024() {
        if (this.cfr_renamed_4 instanceof sprvre) {
            return (sprvre)this.cfr_renamed_4;
        }
        return null;
    }

    public sprvqe cfr_renamed_4022() {
        if (this.cfr_renamed_4 instanceof spryte && ((spryte)this.cfr_renamed_4).cfr_renamed_312() == 1) {
            return sprvqe.cfr_renamed_341((spryte)this.cfr_renamed_4, false);
        }
        return null;
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public spra cfr_renamed_19() {
        return this.cfr_renamed_4;
    }
}

