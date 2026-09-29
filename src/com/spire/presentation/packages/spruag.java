/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprlyf;
import com.spire.presentation.packages.sprutf;
import java.io.IOException;

public class spruag
implements sprjn {
    private final sprlyf cfr_renamed_3;
    private final sprbxf cfr_renamed_4;

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return sprutf.cfr_renamed_5939().cfr_renamed_6450(this.cfr_renamed_3.cfr_renamed_91()).cfr_renamed_6450(this.cfr_renamed_4.cfr_renamed_91()).cfr_renamed_1451();
    }

    public boolean equals(Object arg0) {
        if (this == arg0) {
            return true;
        }
        if (arg0 == null || this.getClass() != arg0.getClass()) {
            return false;
        }
        spruag spruag2 = (spruag)arg0;
        if (this.cfr_renamed_3 != null ? !this.cfr_renamed_3.equals(spruag2.cfr_renamed_3) : spruag2.cfr_renamed_3 != null) {
            return false;
        }
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.equals(spruag2.cfr_renamed_4);
        }
        return spruag2.cfr_renamed_4 == null;
    }

    /*
     * WARNING - void declaration
     */
    public spruag(sprlyf sprlyf2, sprbxf sprbxf2) {
        void arg0;
        spruag spruag2 = this;
        spruag2.cfr_renamed_3 = arg0;
        spruag2.cfr_renamed_4 = sprbxf2;
    }

    public int hashCode() {
        int n = this.cfr_renamed_3 != null ? this.cfr_renamed_3.hashCode() : 0;
        n = 31 * n + (this.cfr_renamed_4 != null ? this.cfr_renamed_4.hashCode() : 0);
        return n;
    }

    public sprbxf cfr_renamed_1157() {
        return this.cfr_renamed_4;
    }

    public sprlyf cfr_renamed_79() {
        return this.cfr_renamed_3;
    }
}

