/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbk;
import com.spire.presentation.packages.sprgak;
import com.spire.presentation.packages.spritj;
import java.security.cert.CertPathParameters;
import java.security.cert.X509Certificate;
import java.util.Collections;
import java.util.Set;

public class sprivj
implements CertPathParameters {
    private final sprgak cfr_renamed_2;
    private final Set<X509Certificate> cfr_renamed_3;
    private final int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprivj(spritj spritj2) {
        void arg0;
        sprivj sprivj2 = this;
        void v1 = arg0;
        this.cfr_renamed_2 = spritj.cfr_renamed_9480((spritj)v1);
        sprivj2.cfr_renamed_3 = Collections.unmodifiableSet(spritj.cfr_renamed_9481((spritj)v1));
        sprivj2.cfr_renamed_4 = spritj.cfr_renamed_9482(spritj2);
    }

    public /* synthetic */ sprivj(spritj arg0, sprbbk arg1) {
        this(arg0);
    }

    public Set cfr_renamed_399() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_401() {
        return this.cfr_renamed_4;
    }

    @Override
    public Object clone() {
        return this;
    }

    public sprgak cfr_renamed_9128() {
        return this.cfr_renamed_2;
    }
}

