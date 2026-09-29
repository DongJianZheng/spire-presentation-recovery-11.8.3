/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjja;

@sprtea
public class sprdoo
implements Cloneable {
    private int cfr_renamed_119;
    private int cfr_renamed_91;
    private boolean cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private sprvjja cfr_renamed_3;
    private int cfr_renamed_4;

    public Integer cfr_renamed_16923() {
        return this.cfr_renamed_1;
    }

    public void cfr_renamed_16924(int arg0) {
        this.cfr_renamed_91 = arg0;
    }

    public void cfr_renamed_16925(sprvjja arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public Integer cfr_renamed_16926() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_16430(boolean arg0) {
        this.cfr_renamed_0 = arg0;
    }

    public Integer cfr_renamed_16927() {
        return this.cfr_renamed_2;
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

    public sprvjja cfr_renamed_16928() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_16929() {
        return this.cfr_renamed_0;
    }

    public Integer cfr_renamed_16930() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public boolean cfr_renamed_16931() {
        return this.cfr_renamed_16928() != null || this.cfr_renamed_16932() != null || this.cfr_renamed_16927() != null || this.cfr_renamed_16923() != null || this.cfr_renamed_16926() != null;
    }

    @sprtea
    public sprdoo cfr_renamed_12099() {
        return (sprdoo)this.cfr_renamed_12100();
    }

    public void cfr_renamed_16007(int arg0) {
        this.cfr_renamed_1 = arg0;
    }

    public void cfr_renamed_15987(int arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public void cfr_renamed_16431(int arg0) {
        this.cfr_renamed_119 = arg0;
    }

    public void cfr_renamed_16933(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public Integer cfr_renamed_16932() {
        return this.cfr_renamed_91;
    }
}

