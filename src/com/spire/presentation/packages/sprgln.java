/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;

@sprtea
public class sprgln
implements Cloneable {
    private String cfr_renamed_2;
    private boolean cfr_renamed_3 = true;
    private String cfr_renamed_4;

    @sprtea
    public String cfr_renamed_97() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public sprgln cfr_renamed_12099() {
        return (sprgln)this.cfr_renamed_12100();
    }

    @sprtea
    public void cfr_renamed_11893(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

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
    public void cfr_renamed_12807(String arg0) {
        this.cfr_renamed_2 = arg0;
    }

    @sprtea
    public boolean cfr_renamed_11946() {
        return this.cfr_renamed_3;
    }

    @sprtea
    public void cfr_renamed_11640(String arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public String cfr_renamed_313() {
        return this.cfr_renamed_4;
    }
}

