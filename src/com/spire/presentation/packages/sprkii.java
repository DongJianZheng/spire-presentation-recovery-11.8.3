/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprdt;
import com.spire.presentation.packages.sprecia;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlep;
import com.spire.presentation.packages.sprqo;
import java.security.spec.AlgorithmParameterSpec;

public class sprkii
implements AlgorithmParameterSpec {
    private final sprlem cfr_renamed_2;
    private final sprlem cfr_renamed_3;
    private final sprlem cfr_renamed_4;

    public sprlem cfr_renamed_2107() {
        return this.cfr_renamed_2;
    }

    public sprlem cfr_renamed_2105() {
        return this.cfr_renamed_3;
    }

    private static /* synthetic */ sprlem cfr_renamed_9204(String arg0) {
        if (arg0.indexOf(sprecia.cfr_renamed_9("fYz^fY")) > 0) {
            return sprdt.cfr_renamed_3;
        }
        if (arg0.indexOf(sprlep.cfr_renamed_9("v9j9r=")) > 0) {
            return sprdt.cfr_renamed_4;
        }
        return sprqo.cfr_renamed_133;
    }

    private static /* synthetic */ sprlem cfr_renamed_9205(String arg0) {
        return spralm.cfr_renamed_2103(arg0);
    }

    public String cfr_renamed_9206() {
        return spralm.cfr_renamed_7555(this.cfr_renamed_2106());
    }

    public sprkii(sprlem arg0, sprlem arg1) {
        this(arg0, arg1, null);
    }

    public sprkii(String arg0) {
        this(sprkii.cfr_renamed_9205(arg0), sprkii.cfr_renamed_9204(arg0), null);
    }

    /*
     * WARNING - void declaration
     */
    public sprkii(sprlem sprlem2, sprlem sprlem3, sprlem sprlem4) {
        void arg1;
        void arg0;
        sprkii sprkii2 = this;
        this.cfr_renamed_4 = arg0;
        sprkii2.cfr_renamed_2 = arg1;
        sprkii2.cfr_renamed_3 = sprlem4;
    }

    public sprlem cfr_renamed_2106() {
        return this.cfr_renamed_4;
    }
}

