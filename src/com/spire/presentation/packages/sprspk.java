/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcih;
import com.spire.presentation.packages.sprhd;
import com.spire.presentation.packages.sprjfh;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprshk;

public class sprspk
implements sprhd<sprshk> {
    private final sprjfh cfr_renamed_4;

    public boolean cfr_renamed_9603(sprshk arg0) {
        if (arg0.cfr_renamed_8278().cfr_renamed_8227() == 2) {
            return sproze.cfr_renamed_92(sprcih.cfr_renamed_23(arg0.cfr_renamed_8278().cfr_renamed_8278()).cfr_renamed_7267().cfr_renamed_8282(), this.cfr_renamed_4.cfr_renamed_8282());
        }
        return false;
    }

    public sprspk(sprjfh sprjfh2) {
        this.cfr_renamed_4 = sprjfh2;
    }

    @Override
    public Object clone() {
        return this;
    }

    public int hashCode() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.hashCode();
        }
        return 0;
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        sprspk sprspk2 = (sprspk)arg0;
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.equals(sprspk2.cfr_renamed_4);
        }
        return sprspk2.cfr_renamed_4 == null;
    }

    /*
     * WARNING - void declaration
     */
    public sprspk(byte[] byArray) {
        this(new sprjfh((byte[])arg0));
        void arg0;
    }
}

