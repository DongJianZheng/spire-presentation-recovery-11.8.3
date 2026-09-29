/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprfhf;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprkn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprudn;
import com.spire.presentation.packages.sprwwm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.io.InputStream;

public class sprrfn
implements sprkn {
    private sprudn cfr_renamed_3;
    private sprden cfr_renamed_4;

    @Override
    public InputStream cfr_renamed_698() throws IOException {
        sprrfn sprrfn2 = this;
        this.cfr_renamed_3 = new sprudn(this.cfr_renamed_4, true);
        return this.cfr_renamed_3;
    }

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        return sprrfn.cfr_renamed_11307(this.cfr_renamed_4);
    }

    @Override
    public InputStream cfr_renamed_3231() throws IOException {
        sprrfn sprrfn2 = this;
        this.cfr_renamed_3 = new sprudn(this.cfr_renamed_4, false);
        return this.cfr_renamed_3;
    }

    @Override
    public int cfr_renamed_106() {
        return this.cfr_renamed_3.cfr_renamed_106();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprxgf cfr_renamed_119() {
        try {
            return this.cfr_renamed_2414();
        }
        catch (IOException iOException) {
            throw new sprhbn(new StringBuilder().insert(0, sprfhf.cfr_renamed_9("\u0001Q\rf+{8j!q&>+q&h-l<w&yhm<l-\u007f%><qh|1j->)l:\u007f1$h")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public static sprwwm cfr_renamed_11307(sprden arg0) throws IOException {
        sprudn sprudn2 = new sprudn(arg0, false);
        byte[] byArray = sprkqe.cfr_renamed_471(sprudn2);
        int n = sprudn2.cfr_renamed_106();
        return new sprwwm(byArray, n);
    }

    public sprrfn(sprden sprden2) {
        this.cfr_renamed_4 = sprden2;
    }
}

