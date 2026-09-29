/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddn;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprmba;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzvm;

@sprtea
public class sprsan {
    private sprmba cfr_renamed_3;
    private sprddn cfr_renamed_4;

    public String cfr_renamed_12188() {
        return this.cfr_renamed_11615().cfr_renamed_12124();
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_3.cfr_renamed_41();
    }

    public boolean cfr_renamed_12189() {
        return this.cfr_renamed_3.hasNext();
    }

    public sprpdja cfr_renamed_12190() {
        sprpdja sprpdja2;
        sprpdja sprpdja3 = sprpdja2 = new sprpdja();
        this.cfr_renamed_12191(sprpdja3);
        sprpdja3.cfr_renamed_11548(0L);
        return sprpdja3;
    }

    public sprsan(spreen arg0) {
        sprsan sprsan2 = this;
        sprsan2.cfr_renamed_4 = new sprddn();
        this.cfr_renamed_4.cfr_renamed_12140(arg0, false);
        sprsan2.cfr_renamed_3 = sprsan2.cfr_renamed_4.cfr_renamed_12162();
    }

    public void cfr_renamed_12191(spreen arg0) {
        this.cfr_renamed_11615().cfr_renamed_11814(arg0);
    }

    public void cfr_renamed_12131(spreen arg0) {
        this.cfr_renamed_11615().cfr_renamed_12131(arg0);
    }

    private /* synthetic */ sprzvm cfr_renamed_11615() {
        return (sprzvm)this.cfr_renamed_3.next();
    }
}

