/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprsko
extends sprsmn {
    private boolean cfr_renamed_1;
    private sprwvn cfr_renamed_2;
    private sprwvn cfr_renamed_3;
    private sprwvn cfr_renamed_4;

    public void cfr_renamed_16019(sprxln arg0) {
        arg0.cfr_renamed_13121(this);
    }

    public sprwvn cfr_renamed_16020() {
        return this.cfr_renamed_2;
    }

    public sprwvn cfr_renamed_13187() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        this.cfr_renamed_1 = true;
    }

    private /* synthetic */ void cfr_renamed_16021(sprsuja arg0, int arg1) {
        if (this.cfr_renamed_1) {
            arg1 = 0;
            this.cfr_renamed_1 = false;
        }
        sprovja.cfr_renamed_11658(this.cfr_renamed_13187(), arg0);
        sprovja.cfr_renamed_11658(this.cfr_renamed_16022(), arg1);
        sprovja.cfr_renamed_11658(this.cfr_renamed_16020(), 0);
    }

    public sprsko() {
        sprsko sprsko2 = this;
        this.cfr_renamed_4 = new sprwvn();
        sprsko2.cfr_renamed_3 = new sprwvn();
        this.cfr_renamed_2 = new sprwvn();
    }

    @Override
    public void cfr_renamed_13173(sprlsn sprlsn2) {
        boolean bl = this.cfr_renamed_1;
        if (sprlsn2.cfr_renamed_13174() && !bl) {
            this.cfr_renamed_16020().set(this.cfr_renamed_16020().size() - 1, (Object)8);
        }
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            this.cfr_renamed_16021(arg0.cfr_renamed_13187().cfr_renamed_576(n++), 1);
            n2 = n;
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_13175(sprxnn sprxnn2) {
        void arg0;
        sprsko sprsko2 = this;
        void v1 = arg0;
        this.cfr_renamed_16021(arg0.cfr_renamed_13167(), 1);
        this.cfr_renamed_16021(v1.cfr_renamed_13169(), 3);
        sprsko2.cfr_renamed_16021(v1.cfr_renamed_13170(), 3);
        sprsko2.cfr_renamed_16021(sprxnn2.cfr_renamed_13171(), 3);
    }

    public sprwvn cfr_renamed_16022() {
        return this.cfr_renamed_3;
    }
}

