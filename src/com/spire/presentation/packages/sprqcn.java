/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgbf;
import com.spire.presentation.packages.sprgzm;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sproen;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprufn;
import com.spire.presentation.packages.sprwwm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprqcn
extends sprszm {
    @Override
    public void cfr_renamed_11218(sproen arg0, boolean arg1) throws IOException {
        arg0.cfr_renamed_11429(arg1, 48, this.cfr_renamed_4);
    }

    public sprqcn(sprco[] arg0) {
        super(arg0);
    }

    public sprqcn() {
    }

    @Override
    public spridn cfr_renamed_11221() {
        return new sprufn(false, this.cfr_renamed_11216());
    }

    @Override
    public int cfr_renamed_11213(boolean arg0) throws IOException {
        int n = arg0 ? 4 : 3;
        int n2 = 0;
        int n3 = this.cfr_renamed_4.length;
        int n4 = n2;
        while (n4 < n3) {
            sprxgf sprxgf2 = this.cfr_renamed_4[n2].cfr_renamed_119();
            n += sprxgf2.cfr_renamed_11213(true);
            n4 = ++n2;
        }
        return n;
    }

    public sprqcn(sprrvm arg0) {
        super(arg0);
    }

    public sprqcn(sprco arg0) {
        super(arg0);
    }

    @Override
    public sprgzm cfr_renamed_11215() {
        return ((sprszm)this.cfr_renamed_4612()).cfr_renamed_11215();
    }

    @Override
    public sproug cfr_renamed_11220() {
        return new sprfwm(this.cfr_renamed_11289());
    }

    @Override
    public sprgbf cfr_renamed_11222() {
        return new sprwwm(this.cfr_renamed_11291());
    }
}

