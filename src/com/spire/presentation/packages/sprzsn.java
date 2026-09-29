/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkdo;
import com.spire.presentation.packages.sprown;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwao;

@sprtea
public class sprzsn<T> {
    private sprszm cfr_renamed_3;
    private sprkdo cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    public T cfr_renamed_15469() {
        sprown sprown2 = null;
        switch (this.cfr_renamed_4.cfr_renamed_112) {
            case 0: {
                if (this.cfr_renamed_3.cfr_renamed_84() != 2) return (T)sprown2;
                sprown2 = new sprown(this.cfr_renamed_3);
                return (T)sprown2;
            }
            case 1: {
                if (this.cfr_renamed_3.cfr_renamed_84() != 4) return (T)sprown2;
                sprown2 = new sprown(this.cfr_renamed_3);
                return (T)sprown2;
            }
        }
        return (T)sprown2;
    }

    public sprszm cfr_renamed_15470() {
        return this.cfr_renamed_3;
    }

    public sprkdo cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     */
    public T cfr_renamed_15471() {
        sprwao sprwao2 = null;
        switch (this.cfr_renamed_4.cfr_renamed_112) {
            case 0: {
                if (this.cfr_renamed_3.cfr_renamed_84() != 2) return (T)sprwao2;
                sprwao2 = new sprwao(this.cfr_renamed_3);
                return (T)sprwao2;
            }
            case 1: {
                if (this.cfr_renamed_3.cfr_renamed_84() < 4) return (T)sprwao2;
                sprwao2 = new sprwao(this.cfr_renamed_3);
                return (T)sprwao2;
            }
        }
        return (T)sprwao2;
    }

    /*
     * WARNING - void declaration
     */
    public sprzsn(sprkdo sprkdo2, sprszm sprszm2) {
        void arg0;
        sprzsn sprzsn2 = this;
        sprzsn2.cfr_renamed_4 = arg0;
        sprzsn2.cfr_renamed_3 = sprszm2;
    }
}

