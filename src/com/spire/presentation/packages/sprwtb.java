/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpb;
import com.spire.presentation.packages.sprvpa;
import java.math.BigInteger;

public abstract class sprwtb
implements sprpb {
    public abstract sprwtb cfr_renamed_1048();

    public boolean cfr_renamed_287() {
        return this.cfr_renamed_1981() == 1;
    }

    public abstract int cfr_renamed_1938();

    public byte[] cfr_renamed_91() {
        return sprvpa.cfr_renamed_512((this.cfr_renamed_1938() + 7) / 8, this.cfr_renamed_1779());
    }

    public abstract sprwtb cfr_renamed_1833(sprwtb var1);

    public abstract BigInteger cfr_renamed_1779();

    public abstract sprwtb cfr_renamed_1817();

    public sprwtb cfr_renamed_1982(sprwtb arg0, sprwtb arg1) {
        return this.cfr_renamed_1048().cfr_renamed_1983(arg0.cfr_renamed_1833(arg1));
    }

    public abstract sprwtb cfr_renamed_1984(sprwtb var1);

    public String toString() {
        return this.cfr_renamed_1779().toString(16);
    }

    public abstract sprwtb cfr_renamed_1908();

    public boolean cfr_renamed_805() {
        return 0 == this.cfr_renamed_1779().signum();
    }

    public abstract sprwtb cfr_renamed_1983(sprwtb var1);

    public abstract sprwtb cfr_renamed_1773();

    public int cfr_renamed_1981() {
        return this.cfr_renamed_1779().bitLength();
    }

    public abstract String cfr_renamed_1985();

    public abstract sprwtb cfr_renamed_1986(sprwtb var1);

    public boolean cfr_renamed_1930() {
        return this.cfr_renamed_1779().testBit(0);
    }

    public sprwtb cfr_renamed_1987(sprwtb arg0, sprwtb arg1, sprwtb arg2) {
        return this.cfr_renamed_1833(arg0).cfr_renamed_1986(arg1.cfr_renamed_1833(arg2));
    }

    public abstract sprwtb cfr_renamed_952();

    public sprwtb cfr_renamed_1988(sprwtb arg0, sprwtb arg1) {
        return this.cfr_renamed_1048().cfr_renamed_1986(arg0.cfr_renamed_1833(arg1));
    }

    public sprwtb cfr_renamed_1989(sprwtb arg0, sprwtb arg1, sprwtb arg2) {
        return this.cfr_renamed_1833(arg0).cfr_renamed_1983(arg1.cfr_renamed_1833(arg2));
    }
}

