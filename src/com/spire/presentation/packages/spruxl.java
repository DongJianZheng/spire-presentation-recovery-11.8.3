/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdvm;
import com.spire.presentation.packages.sprhnm;
import com.spire.presentation.packages.sprhvm;
import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprksb;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprznl;
import java.io.IOException;

public class spruxl {
    private final sprhnm cfr_renamed_4;

    public spruxl(sprhnm sprhnm2) {
        this.cfr_renamed_4 = sprhnm2;
    }

    public sprhvm cfr_renamed_4409() {
        return this.cfr_renamed_4.cfr_renamed_4409();
    }

    public spruxl(byte[] arg0) throws IOException {
        this(spruxl.cfr_renamed_1443(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprhnm cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprhnm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprznl(new StringBuilder().insert(0, sprksb.cfr_renamed_9("\u00119\u0010>\u0013*\u0011=\u0018x\u00189\b9Fx")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprznl(new StringBuilder().insert(0, sprjej.cfr_renamed_9("2z3}0i2~;;;z+ze;")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public boolean cfr_renamed_4418() {
        return this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410() != null;
    }

    public sprhnm cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprdvm cfr_renamed_2573() {
        return this.cfr_renamed_4.cfr_renamed_2573();
    }
}

