/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;

@sprtea
public abstract class sprcqn
implements Cloneable {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    @sprtea
    public abstract void cfr_renamed_11640(String var1);

    @sprtea
    public abstract sprszca cfr_renamed_12805();

    @sprtea
    public abstract void cfr_renamed_12820(sprszca var1);

    @sprtea
    public abstract void cfr_renamed_12816(spreen var1);

    @sprtea
    public abstract String cfr_renamed_313();

    @sprtea
    public abstract void cfr_renamed_12821(spreen var1);

    @sprtea
    public sprcqn cfr_renamed_12099() {
        return (sprcqn)this.cfr_renamed_12100();
    }
}

