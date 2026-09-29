/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgsa;
import com.spire.presentation.packages.spryvc;
import java.security.cert.CertPath;

public class sprdna
extends sprgsa {
    private int cfr_renamed_3;
    private CertPath cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdna(spryvc spryvc2, CertPath certPath, int n) {
        void arg1;
        void arg2;
        void arg0;
        sprdna sprdna2 = this;
        super((spryvc)arg0);
        sprdna2.cfr_renamed_3 = -1;
        sprdna2.cfr_renamed_4 = null;
        if (certPath == null || arg2 == -1) {
            throw new IllegalArgumentException();
        }
        if (arg2 < -1 || arg1 != null && arg2 >= arg1.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_4 = arg1;
        this.cfr_renamed_3 = arg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprdna(spryvc spryvc2, Throwable throwable, CertPath certPath, int n) {
        void arg2;
        void arg3;
        void arg1;
        void arg0;
        sprdna sprdna2 = this;
        super((spryvc)arg0, (Throwable)arg1);
        sprdna2.cfr_renamed_3 = -1;
        sprdna2.cfr_renamed_4 = null;
        if (certPath == null || arg3 == -1) {
            throw new IllegalArgumentException();
        }
        if (arg3 < -1 || arg2 != null && arg3 >= arg2.getCertificates().size()) {
            throw new IndexOutOfBoundsException();
        }
        this.cfr_renamed_4 = arg2;
        this.cfr_renamed_3 = arg3;
    }

    public CertPath cfr_renamed_315() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprdna(spryvc spryvc2, Throwable throwable) {
        void arg1;
        void arg0;
        sprdna sprdna2 = this;
        super((spryvc)arg0, (Throwable)arg1);
        sprdna2.cfr_renamed_3 = -1;
        sprdna2.cfr_renamed_4 = null;
    }

    /*
     * WARNING - void declaration
     */
    public sprdna(spryvc spryvc2) {
        void arg0;
        sprdna sprdna2 = this;
        super((spryvc)arg0);
        sprdna2.cfr_renamed_3 = -1;
        sprdna2.cfr_renamed_4 = null;
    }

    public int cfr_renamed_320() {
        return this.cfr_renamed_3;
    }
}

