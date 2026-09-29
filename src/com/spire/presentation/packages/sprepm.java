/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprvan;
import java.io.IOException;

public class sprepm {
    private sprlem cfr_renamed_2;
    private sprju cfr_renamed_3;
    private sprddm cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprepm(sprqp sprqp2) throws IOException {
        void arg0;
        this.cfr_renamed_2 = (sprlem)sprqp2.cfr_renamed_24();
        sprepm sprepm2 = this;
        sprepm2.cfr_renamed_4 = sprddm.cfr_renamed_23(arg0.cfr_renamed_24().cfr_renamed_119());
        sprepm2.cfr_renamed_3 = (sprju)arg0.cfr_renamed_24();
    }

    public sprco cfr_renamed_4174(int arg0) throws IOException {
        return sprvan.cfr_renamed_11332(this.cfr_renamed_3, 0, false, arg0);
    }

    public sprddm cfr_renamed_4173() {
        return this.cfr_renamed_4;
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_2;
    }
}

