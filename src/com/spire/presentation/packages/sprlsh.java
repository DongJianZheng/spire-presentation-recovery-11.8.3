/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprck;
import com.spire.presentation.packages.sprhdf;
import java.math.BigInteger;

public abstract class sprlsh
implements sprck {
    public boolean cfr_renamed_1930() {
        return this.cfr_renamed_1779().testBit(0);
    }

    public boolean cfr_renamed_805() {
        return 0 == this.cfr_renamed_1779().signum();
    }

    public String toString() {
        return this.cfr_renamed_1779().toString(16);
    }

    public sprlsh cfr_renamed_8931(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_1048().cfr_renamed_8663(arg0.cfr_renamed_8682(arg1));
    }

    public abstract sprlsh cfr_renamed_1817();

    public abstract sprlsh cfr_renamed_952();

    public sprlsh cfr_renamed_8662(int arg0) {
        int n;
        sprlsh sprlsh2 = this;
        int n2 = n = 0;
        while (n2 < arg0) {
            sprlsh2 = sprlsh2.cfr_renamed_1048();
            n2 = ++n;
        }
        return sprlsh2;
    }

    public abstract sprlsh cfr_renamed_8682(sprlsh var1);

    public byte[] cfr_renamed_91() {
        return sprhdf.cfr_renamed_512((this.cfr_renamed_1938() + 7) / 8, this.cfr_renamed_1779());
    }

    public sprlsh cfr_renamed_8932(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        return this.cfr_renamed_8682(arg0).cfr_renamed_8663(arg1.cfr_renamed_8682(arg2));
    }

    public sprlsh cfr_renamed_8933(sprlsh arg0, sprlsh arg1) {
        return this.cfr_renamed_1048().cfr_renamed_8934(arg0.cfr_renamed_8682(arg1));
    }

    public abstract sprlsh cfr_renamed_1908();

    public int cfr_renamed_1981() {
        return this.cfr_renamed_1779().bitLength();
    }

    public abstract int cfr_renamed_1938();

    public abstract sprlsh cfr_renamed_1048();

    public abstract sprlsh cfr_renamed_1773();

    public boolean cfr_renamed_287() {
        return this.cfr_renamed_1981() == 1;
    }

    public sprlsh cfr_renamed_8935(sprlsh arg0, sprlsh arg1, sprlsh arg2) {
        return this.cfr_renamed_8682(arg0).cfr_renamed_8934(arg1.cfr_renamed_8682(arg2));
    }

    public abstract sprlsh cfr_renamed_8663(sprlsh var1);

    public abstract BigInteger cfr_renamed_1779();

    public abstract String cfr_renamed_1985();

    public abstract sprlsh cfr_renamed_8934(sprlsh var1);

    public abstract sprlsh cfr_renamed_8936(sprlsh var1);
}

