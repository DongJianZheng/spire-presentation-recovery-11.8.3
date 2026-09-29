/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprzy;
import java.io.IOException;

public class sprlkm {
    private sprco cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprqp cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public sprzy cfr_renamed_4191() throws IOException {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_1 != null) {
            this.cfr_renamed_1 = null;
            return (sprzy)sprvan.cfr_renamed_11332((sprnvm)this.cfr_renamed_1, 3, false, 17);
        }
        return null;
    }

    public sprzy cfr_renamed_4190() throws IOException {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_1 instanceof sprju) {
            this.cfr_renamed_1 = null;
            return (sprzy)sprvan.cfr_renamed_11332((sprju)this.cfr_renamed_1, 2, false, 17);
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    public sprlkm(sprqp sprqp2) throws IOException {
        void arg0;
        sprlkm sprlkm2 = this;
        sprlkm2.cfr_renamed_3 = arg0;
        sprlkm2.cfr_renamed_4 = sprktm.cfr_renamed_23(sprqp2.cfr_renamed_24());
    }

    public sprzy cfr_renamed_4171() throws IOException {
        if (!this.cfr_renamed_2) {
            this.cfr_renamed_4170();
        }
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_24();
        }
        this.cfr_renamed_1 = null;
        return (sprzy)this.cfr_renamed_1;
    }

    public sprddm cfr_renamed_4202() throws IOException {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_1 != null) {
            this.cfr_renamed_1 = null;
            return sprddm.cfr_renamed_23(((sprqp)this.cfr_renamed_1).cfr_renamed_119());
        }
        return null;
    }

    public sproug cfr_renamed_1472() throws IOException {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_24();
        }
        sprco sprco2 = this.cfr_renamed_1;
        this.cfr_renamed_1 = null;
        return sproug.cfr_renamed_23(sprco2.cfr_renamed_119());
    }

    public sprddm cfr_renamed_410() throws IOException {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_1 instanceof sprju) {
            this.cfr_renamed_1 = null;
            return sprddm.cfr_renamed_5085((sprnvm)this.cfr_renamed_1.cfr_renamed_119(), false);
        }
        return null;
    }

    public sprjvm cfr_renamed_4203() throws IOException {
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_1 != null) {
            sprqp sprqp2 = (sprqp)this.cfr_renamed_1;
            this.cfr_renamed_1 = null;
            return new sprjvm(sprqp2);
        }
        return null;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    public sprpnm cfr_renamed_4170() throws IOException {
        sprju sprju2;
        this.cfr_renamed_2 = true;
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_3.cfr_renamed_24();
        }
        if (this.cfr_renamed_1 instanceof sprju && (sprju2 = (sprju)this.cfr_renamed_1).cfr_renamed_10764(0)) {
            this.cfr_renamed_1 = null;
            return sprpnm.cfr_renamed_23(((sprqp)sprju2.cfr_renamed_11266(false, 16)).cfr_renamed_2414());
        }
        return null;
    }
}

