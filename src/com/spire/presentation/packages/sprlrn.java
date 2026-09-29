/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprepn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprpln;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtnn;
import com.spire.presentation.packages.sprtt;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.spryxp;

@sprtea
public class sprlrn
extends sprtnn
implements Cloneable {
    private sprwbp[] cfr_renamed_1;
    private sprsuja cfr_renamed_2;
    private sprxln cfr_renamed_3;
    private sprwbp cfr_renamed_4;

    public void cfr_renamed_13860(sprwbp arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public void cfr_renamed_13861(sprwbp[] arg0) {
        this.cfr_renamed_1 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprlrn(sprxln sprxln2, sprsuja sprsuja2) {
        super(4);
        void arg1;
        void arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_2 = arg1;
        this.cfr_renamed_13862(4);
    }

    public boolean cfr_renamed_13863() {
        if (this.cfr_renamed_6493() == null || this.cfr_renamed_6493().cfr_renamed_11861() == 0) {
            return true;
        }
        sprgeja sprgeja2 = new sprepn().cfr_renamed_13544(this.cfr_renamed_6493());
        return !spryxp.cfr_renamed_13464(sprgeja2.cfr_renamed_1942()) && !spryxp.cfr_renamed_13464(sprgeja2.cfr_renamed_1452());
    }

    public sprsuja cfr_renamed_13552() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_13864(sprxln arg0) {
        this.cfr_renamed_3 = arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Object cfr_renamed_12100() {
        try {
            return this.clone();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            throw new IllegalStateException(cloneNotSupportedException);
        }
    }

    @Override
    public void cfr_renamed_13865(sprtt arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            int n3 = n++;
            this.cfr_renamed_1[n3] = arg0.cfr_renamed_13866(this.cfr_renamed_1[n3]);
            n2 = n;
        }
        sprtt sprtt2 = arg0;
        this.cfr_renamed_4 = sprtt2.cfr_renamed_13866(this.cfr_renamed_4);
        super.cfr_renamed_13865(sprtt2);
    }

    public sprwbp cfr_renamed_13867() {
        return this.cfr_renamed_4;
    }

    public sprxln cfr_renamed_6493() {
        return this.cfr_renamed_3;
    }

    public sprwbp[] cfr_renamed_13868() {
        return this.cfr_renamed_1;
    }

    @Override
    public sprpln cfr_renamed_12099() {
        ((sprlrn)this.cfr_renamed_12100()).cfr_renamed_3 = this.cfr_renamed_3.cfr_renamed_13532();
        return (sprlrn)this.cfr_renamed_12100();
    }

    public void cfr_renamed_13596(sprsuja arg0) {
        this.cfr_renamed_2 = arg0;
    }
}

