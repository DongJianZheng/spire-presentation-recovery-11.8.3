/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprief;
import com.spire.presentation.packages.sprse;
import com.spire.presentation.packages.sprzyg;
import java.util.Iterator;

public class sprtvg
implements sprse<sprzyg> {
    public sprzyg[] cfr_renamed_4;

    public sprzyg cfr_renamed_576(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    @Override
    public Iterator<sprzyg> iterator() {
        return new sprief<sprzyg>(this.cfr_renamed_4);
    }

    public int cfr_renamed_84() {
        return this.cfr_renamed_4.length;
    }

    /*
     * WARNING - void declaration
     */
    public sprtvg(sprzyg sprzyg2) {
        void arg0;
        this.cfr_renamed_4 = new sprzyg[1];
        this.cfr_renamed_4[0] = arg0;
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_4.length == 0;
    }

    /*
     * WARNING - void declaration
     */
    public sprtvg(sprzyg[] sprzygArray) {
        void arg0;
        this.cfr_renamed_4 = new sprzyg[sprzygArray.length];
        System.arraycopy(arg0, 0, this.cfr_renamed_4, 0, ((void)arg0).length);
    }
}

