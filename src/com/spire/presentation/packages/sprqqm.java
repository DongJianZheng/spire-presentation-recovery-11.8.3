/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprepm;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprzy;
import java.io.IOException;

public class sprqqm {
    private sprqp cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprktm cfr_renamed_3;
    private sprco cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprqqm(sprqp sprqp2) throws IOException {
        void arg0;
        sprqqm sprqqm2 = this;
        sprqqm2.cfr_renamed_1 = arg0;
        sprqqm2.cfr_renamed_3 = sprktm.cfr_renamed_23(sprqp2.cfr_renamed_24());
    }

    public sprzy cfr_renamed_4171() throws IOException {
        if (!this.cfr_renamed_2) {
            this.cfr_renamed_4170();
        }
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        this.cfr_renamed_4 = null;
        return (sprzy)this.cfr_renamed_4;
    }

    public sprepm cfr_renamed_4172() throws IOException {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_4 != null) {
            sprqp sprqp2 = (sprqp)this.cfr_renamed_4;
            this.cfr_renamed_4 = null;
            return new sprepm(sprqp2);
        }
        return null;
    }

    public sprzy cfr_renamed_4176() throws IOException {
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4 = null;
            return (sprzy)sprvan.cfr_renamed_11332((sprju)this.cfr_renamed_4, 1, false, 17);
        }
        return null;
    }

    public sprpnm cfr_renamed_4170() throws IOException {
        sprju sprju2;
        this.cfr_renamed_2 = true;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_4 instanceof sprju && (sprju2 = (sprju)this.cfr_renamed_4).cfr_renamed_10764(0)) {
            this.cfr_renamed_4 = null;
            return sprpnm.cfr_renamed_23(((sprqp)sprju2.cfr_renamed_11266(false, 16)).cfr_renamed_2414());
        }
        return null;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_3;
    }
}

