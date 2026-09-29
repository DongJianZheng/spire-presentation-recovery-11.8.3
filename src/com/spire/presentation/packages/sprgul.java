/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprak;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spret;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjwl;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.spruwl;
import com.spire.presentation.packages.sprxxl;
import java.security.cert.CertificateEncodingException;
import java.security.cert.X509Certificate;

public class sprgul {
    private spruwl cfr_renamed_4;

    public sprxxl cfr_renamed_10655(sprcf arg0, sprtpl arg1) throws sprhjg {
        return this.cfr_renamed_4.cfr_renamed_10655(arg0, arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprgul(sprlj sprlj2, spret spret2) {
        void arg1;
        void arg0;
        sprgul sprgul2 = this;
        sprgul2.cfr_renamed_4 = new spruwl((sprlj)arg0, (spret)arg1);
    }

    public sprxxl cfr_renamed_10653(sprcf arg0, byte[] arg1) throws sprhjg {
        return this.cfr_renamed_4.cfr_renamed_10653(arg0, arg1);
    }

    public sprgul cfr_renamed_10654(sprddm arg0) {
        sprgul sprgul2 = this;
        sprgul2.cfr_renamed_4.cfr_renamed_10654(arg0);
        return sprgul2;
    }

    public sprgul cfr_renamed_3977(boolean arg0) {
        sprgul sprgul2 = this;
        sprgul2.cfr_renamed_4.cfr_renamed_3977(arg0);
        return sprgul2;
    }

    public sprgul cfr_renamed_10652(sprak arg0) {
        sprgul sprgul2 = this;
        sprgul2.cfr_renamed_4.cfr_renamed_10652(arg0);
        return sprgul2;
    }

    public sprgul(sprlj arg0) {
        this(arg0, new sprjwl());
    }

    public sprxxl cfr_renamed_10742(sprcf arg0, X509Certificate arg1) throws sprhjg, CertificateEncodingException {
        return this.cfr_renamed_10655(arg0, new sprowl(arg1));
    }

    public sprgul cfr_renamed_10650(sprak arg0) {
        sprgul sprgul2 = this;
        sprgul2.cfr_renamed_4.cfr_renamed_10650(arg0);
        return sprgul2;
    }
}

