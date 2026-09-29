/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprjhb;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprzgia;
import com.spire.presentation.packages.sprzy;
import java.io.IOException;

public class sprusm {
    private boolean cfr_renamed_0;
    private sprqp cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private boolean cfr_renamed_3;
    private Object cfr_renamed_4;

    public sprzy cfr_renamed_617() throws IOException {
        sprju sprju2;
        sprusm sprusm2 = this;
        sprusm2.cfr_renamed_3 = true;
        sprusm2.cfr_renamed_4 = sprusm2.cfr_renamed_1.cfr_renamed_24();
        if (sprusm2.cfr_renamed_4 instanceof sprju && (sprju2 = (sprju)this.cfr_renamed_4).cfr_renamed_10764(0)) {
            this.cfr_renamed_4 = null;
            return (sprzy)sprju2.cfr_renamed_11266(false, 17);
        }
        return null;
    }

    public sprzy cfr_renamed_621() throws IOException {
        if (!this.cfr_renamed_3 || !this.cfr_renamed_0) {
            throw new IOException(sprzgia.cfr_renamed_9("G*T\fE=T<\bf\u0000.N+\u000f RoG*T\fR#Sg\toH.SoN ToB*E!\u0000,A#L*Da"));
        }
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        return (sprzy)this.cfr_renamed_4;
    }

    public sprzy cfr_renamed_4139() throws IOException {
        sprco sprco2 = this.cfr_renamed_1.cfr_renamed_24();
        if (sprco2 instanceof spridn) {
            return ((spridn)sprco2).cfr_renamed_4828();
        }
        return (sprzy)sprco2;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprusm(sprqp sprqp2) throws IOException {
        void arg0;
        sprusm sprusm2 = this;
        sprusm2.cfr_renamed_1 = arg0;
        sprusm2.cfr_renamed_2 = (sprktm)sprqp2.cfr_renamed_24();
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    public sprjvm cfr_renamed_2589() throws IOException {
        return new sprjvm((sprqp)this.cfr_renamed_1.cfr_renamed_24());
    }

    public sprzy cfr_renamed_4145() throws IOException {
        sprju sprju2;
        if (!this.cfr_renamed_3) {
            throw new IOException(sprjhb.cfr_renamed_9("nI}ol^}_!\u0005)Dh_)BfX)NlIg\fjMe@lH'"));
        }
        this.cfr_renamed_0 = true;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_4 instanceof sprju && (sprju2 = (sprju)this.cfr_renamed_4).cfr_renamed_10764(1)) {
            this.cfr_renamed_4 = null;
            return (sprzy)sprju2.cfr_renamed_11266(false, 17);
        }
        return null;
    }

    public static sprusm cfr_renamed_23(Object arg0) throws IOException {
        if (arg0 instanceof sprszm) {
            return new sprusm(((sprszm)arg0).cfr_renamed_4828());
        }
        if (arg0 instanceof sprqp) {
            return new sprusm((sprqp)arg0);
        }
        throw new IOException(new StringBuilder().insert(0, sprzgia.cfr_renamed_9("U!K!O8NoO-J*C;\u0000*N,O:N;E=E+\u001ao")).append(arg0.getClass().getName()).toString());
    }
}

