/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprqte;
import com.spire.presentation.packages.sprulk;
import java.security.cert.CertPath;

public class sprbre
extends sprqte {
    private CertPath cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprbre(sprulk sprulk2, CertPath certPath, int n) {
        void arg1;
        void arg2;
        void arg0;
        sprbre sprbre2 = this;
        super((sprulk)arg0);
        sprbre2.cfr_renamed_4 = -1;
        sprbre2.cfr_renamed_3 = null;
        if (certPath == null || arg2 == -1) {
            throw new IllegalArgumentException();
        }
        if (arg2 < -1 || arg2 >= arg1.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_3 = arg1;
        this.cfr_renamed_4 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbre(sprulk sprulk2) {
        void arg0;
        sprbre sprbre2 = this;
        super((sprulk)arg0);
        sprbre2.cfr_renamed_4 = -1;
        sprbre2.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprbre(sprulk sprulk2, Throwable throwable) {
        void arg1;
        void arg0;
        sprbre sprbre2 = this;
        super((sprulk)arg0, (Throwable)arg1);
        sprbre2.cfr_renamed_4 = -1;
        sprbre2.cfr_renamed_3 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprbre(sprulk sprulk2, Throwable throwable, CertPath certPath, int n) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        sprbre sprbre2 = this;
        super((sprulk)arg0, (Throwable)arg1);
        sprbre2.cfr_renamed_4 = -1;
        sprbre2.cfr_renamed_3 = null;
        if (certPath == null || arg3 == -1) {
            throw new IllegalArgumentException();
        }
        if (arg3 < -1 || arg3 >= arg2.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_3 = arg2;
        this.cfr_renamed_4 = arg3;
    }

    public int cfr_renamed_320() {
        return this.cfr_renamed_4;
    }

    public CertPath cfr_renamed_315() {
        return this.cfr_renamed_3;
    }
}

