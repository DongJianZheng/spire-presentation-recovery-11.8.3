/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdne;
import com.spire.presentation.packages.sprlue;
import com.spire.presentation.packages.sprnkha;
import com.spire.presentation.packages.sprpdaa;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprzle;
import java.io.IOException;

public class sprnqd {
    private final sprzle cfr_renamed_4;

    public sprdne cfr_renamed_4409() {
        return this.cfr_renamed_4.cfr_renamed_4409();
    }

    public sprzle cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprlue cfr_renamed_2573() {
        return this.cfr_renamed_4.cfr_renamed_2573();
    }

    public sprnqd(byte[] arg0) throws IOException {
        this(sprnqd.cfr_renamed_1443(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprzle cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprzle.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, sprnkha.cfr_renamed_9("5m4j7~5i<,<m,mb,")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprpdaa.cfr_renamed_9("\u0010!\u0011&\u00122\u0010%\u0019`\u0019!\t!G`")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public sprnqd(sprzle sprzle2) {
        this.cfr_renamed_4 = sprzle2;
    }

    public boolean cfr_renamed_4418() {
        return this.cfr_renamed_4.cfr_renamed_4409().cfr_renamed_4410() != null;
    }
}

