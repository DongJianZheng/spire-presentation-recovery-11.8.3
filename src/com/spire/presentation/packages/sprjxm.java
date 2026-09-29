/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spray;
import com.spire.presentation.packages.sprkz;
import com.spire.presentation.packages.sprsva;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtjp;
import com.spire.presentation.packages.sprvyo;

@sprtea
public abstract class sprjxm
implements sprkz {
    public int cfr_renamed_0;
    private sprvyo cfr_renamed_1;
    public int cfr_renamed_2;
    private spray cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjxm(sprvyo sprvyo2, spray spray2, int n, int n2) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        if (sprvyo2 == null) {
            throw new NullPointerException(sprtjp.cfr_renamed_9("C\u0006K\fO)C\u001fG\nZ"));
        }
        sprjxm sprjxm2 = this;
        this.cfr_renamed_1 = arg0;
        sprjxm2.cfr_renamed_3 = arg1;
        sprjxm2.cfr_renamed_0 = arg3;
        this.cfr_renamed_2 = arg2;
    }

    public sprjxm() {
    }

    @Override
    public spray cfr_renamed_12768() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprjxm(int n, int n2) {
        void arg0;
        sprjxm sprjxm2 = this;
        sprjxm2.cfr_renamed_2 = arg0;
        sprjxm2.cfr_renamed_0 = n2;
    }

    @Override
    public abstract Object cfr_renamed_12496();

    @Override
    public sprvyo cfr_renamed_12769() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    public sprjxm(sprvyo sprvyo2, spray spray2, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        if (sprvyo2 == null) {
            throw new NullPointerException(sprsva.cfr_renamed_9("\u0015\n\u001d\u0000\u0019%\u0015\u0013\u0011\u0006\f"));
        }
        sprjxm sprjxm2 = this;
        sprjxm sprjxm3 = this;
        sprjxm3.cfr_renamed_1 = arg0;
        sprjxm3.cfr_renamed_3 = arg1;
        sprjxm2.cfr_renamed_0 = arg0.cfr_renamed_1452();
        sprjxm2.cfr_renamed_2 = arg0.cfr_renamed_1942();
        this.cfr_renamed_4 = arg2;
    }

    public void cfr_renamed_11665() {
        if (this.cfr_renamed_1 != null) {
            this.cfr_renamed_1.cfr_renamed_11665();
            this.cfr_renamed_1 = null;
        }
    }

    @Override
    public boolean cfr_renamed_12770() {
        return this.cfr_renamed_4;
    }

    @Override
    public int cfr_renamed_1942() {
        return this.cfr_renamed_2;
    }

    @Override
    public int cfr_renamed_1452() {
        return this.cfr_renamed_0;
    }

    public sprvyo cfr_renamed_12771() {
        return this.cfr_renamed_1;
    }
}

