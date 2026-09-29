/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajp;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprlm;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprxgf;
import java.util.Date;

public class sprnom
extends sprqqe
implements sprlm {
    private final sprjfn cfr_renamed_3;
    private final sprlvm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprnom(Date date) {
        this(new sprjfn((Date)arg0));
        void arg0;
    }

    public sprlvm cfr_renamed_652() {
        return this.cfr_renamed_4;
    }

    public String toString() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.toString();
        }
        return this.cfr_renamed_4.toString();
    }

    public sprnom(sprlvm sprlvm2) {
        sprnom sprnom2 = this;
        sprnom2.cfr_renamed_3 = null;
        sprnom2.cfr_renamed_4 = sprlvm2;
    }

    public static sprnom cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprnom) {
            return (sprnom)arg0;
        }
        if (arg0 instanceof sprjfn) {
            return new sprnom(sprjfn.cfr_renamed_23(arg0));
        }
        if (arg0 != null) {
            return new sprnom(sprlvm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprnom(sprjfn sprjfn2) {
        void arg0;
        sprnom sprnom2 = this;
        sprnom2.cfr_renamed_3 = arg0;
        sprnom2.cfr_renamed_4 = null;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3;
        }
        return this.cfr_renamed_4.cfr_renamed_119();
    }

    public static sprnom cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        if (!arg1) {
            throw new IllegalArgumentException(sprajp.cfr_renamed_9("a.m/a#\"/v#ofo3q2\"$gfg>r*k%k2n?\"2c!e#f"));
        }
        return sprnom.cfr_renamed_23(sprnvm.cfr_renamed_6501(arg0, 128).cfr_renamed_8225());
    }

    public sprjfn cfr_renamed_588() {
        return this.cfr_renamed_3;
    }
}

