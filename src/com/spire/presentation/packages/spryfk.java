/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhry;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprkfk;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprltm;
import com.spire.presentation.packages.sprrqm;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;

public class spryfk
implements sprjn {
    private final sprltm cfr_renamed_3;
    private final HashMap<sprlem, sprrqm> cfr_renamed_4;

    public spryfk(sprltm arg0) throws sprkfk {
        int n;
        this.cfr_renamed_3 = arg0;
        spryfk spryfk2 = this;
        this.cfr_renamed_4 = new HashMap(arg0.cfr_renamed_84());
        sprrqm[] sprrqmArray = this.cfr_renamed_3.cfr_renamed_9807();
        int n2 = n = 0;
        while (n2 != sprrqmArray.length) {
            sprrqm sprrqm2 = sprrqmArray[n];
            if (sprrqm2.cfr_renamed_9808()) {
                this.cfr_renamed_4.put(sprrqm2.cfr_renamed_4721(), sprrqm2);
            } else {
                this.cfr_renamed_4.put(sprrqm2.cfr_renamed_9809().cfr_renamed_204(), sprrqm2);
            }
            n2 = ++n;
        }
    }

    public Collection<sprlem> cfr_renamed_9810() {
        return this.cfr_renamed_4.keySet();
    }

    public boolean cfr_renamed_9811(sprlem arg0) {
        if (this.cfr_renamed_4.containsKey(arg0)) {
            return !this.cfr_renamed_4.get(arg0).cfr_renamed_9808();
        }
        return false;
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_3.cfr_renamed_91();
    }

    public spryfk(byte[] arg0) throws sprkfk {
        this(spryfk.cfr_renamed_1443(arg0));
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.cfr_renamed_84() == 0;
    }

    public boolean cfr_renamed_9812(sprlem arg0) {
        return this.cfr_renamed_4.containsKey(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprltm cfr_renamed_1443(byte[] arg0) throws sprkfk {
        try {
            return sprltm.cfr_renamed_23(sprxgf.cfr_renamed_184(arg0));
        }
        catch (Exception exception) {
            throw new sprkfk(new StringBuilder().insert(0, sprhry.cfr_renamed_9("@[A\\BH@_I\u001aI[Y[\u0017\u001a")).append(exception.getMessage()).toString(), exception);
        }
    }
}

