/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;

public class sprtvm
implements sprju {
    public final sprden cfr_renamed_2;
    public final int cfr_renamed_3;
    public final int cfr_renamed_4;

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
            throw new sprhbn(iOException.getMessage());
        }
    }

    @Override
    public sprco cfr_renamed_11266(boolean arg0, int arg1) throws IOException {
        if (arg0) {
            return this.cfr_renamed_2.cfr_renamed_11267(arg1);
        }
        return this.cfr_renamed_2.cfr_renamed_11427(arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprtvm(int n, int n2, sprden sprden2) {
        void arg1;
        void arg0;
        sprtvm sprtvm2 = this;
        this.cfr_renamed_3 = arg0;
        sprtvm2.cfr_renamed_4 = arg1;
        sprtvm2.cfr_renamed_2 = sprden2;
    }

    @Override
    public sprxgf cfr_renamed_2414() throws IOException {
        sprtvm sprtvm2 = this;
        return sprtvm2.cfr_renamed_2.cfr_renamed_11428(sprtvm2.cfr_renamed_3, this.cfr_renamed_4);
    }

    @Override
    public boolean cfr_renamed_10764(int arg0) {
        return this.cfr_renamed_3 == 128 && this.cfr_renamed_4 == arg0;
    }

    @Override
    public boolean cfr_renamed_11239(int arg0, int arg1) {
        return this.cfr_renamed_3 == arg0 && this.cfr_renamed_4 == arg1;
    }

    @Override
    public sprco cfr_renamed_11270() throws IOException {
        return this.cfr_renamed_2.cfr_renamed_24();
    }

    @Override
    public int cfr_renamed_8120() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprju cfr_renamed_11273(int arg0, int arg1) throws IOException {
        return new sprtvm(arg0, arg1, this.cfr_renamed_2);
    }

    @Override
    public sprju cfr_renamed_11271() throws IOException {
        return this.cfr_renamed_2.cfr_renamed_11272();
    }

    @Override
    public int cfr_renamed_312() {
        return this.cfr_renamed_4;
    }
}

