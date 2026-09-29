/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprepm;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.spronq;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpnm;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprvan;
import com.spire.presentation.packages.sprzy;
import java.io.IOException;

public class sprtkm {
    private boolean cfr_renamed_0;
    private sprqp cfr_renamed_1;
    private sprktm cfr_renamed_2;
    private sprco cfr_renamed_3;
    private boolean cfr_renamed_4;

    public sprzy cfr_renamed_4190() throws IOException {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_3 instanceof sprju) {
            this.cfr_renamed_3 = null;
            return (sprzy)sprvan.cfr_renamed_11332((sprju)this.cfr_renamed_3, 1, false, 17);
        }
        if (!this.cfr_renamed_4) {
            throw new sprhbn(spronq.cfr_renamed_9("TnAstoAiF;XnFo\u0015yP;EiPhPuA;BrAs\u0015uZu\u0018\u007fToT;Vt[oPuA"));
        }
        return null;
    }

    public sproug cfr_renamed_1472() throws IOException {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_24();
        }
        sprco sprco2 = this.cfr_renamed_3;
        this.cfr_renamed_3 = null;
        return sproug.cfr_renamed_23(sprco2.cfr_renamed_119());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 3;
        int cfr_ignored_0 = 4 << 4 ^ (3 << 2 ^ 3);
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 << 2 ^ 3);
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    /*
     * WARNING - void declaration
     */
    public sprtkm(sprqp sprqp2) throws IOException {
        void arg0;
        this.cfr_renamed_1 = arg0;
        this.cfr_renamed_2 = sprktm.cfr_renamed_23(sprqp2.cfr_renamed_24());
        if (!this.cfr_renamed_2.cfr_renamed_7241(0)) {
            throw new sprhbn(sprbgp.cfr_renamed_9("\r78*\t,:' -<'(\u0006-6-b:'>1%-\"b\"7! )0l/918b.'lr"));
        }
    }

    public sprepm cfr_renamed_4189() throws IOException {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_3 != null) {
            sprqp sprqp2 = (sprqp)this.cfr_renamed_3;
            sprtkm sprtkm2 = this;
            sprtkm2.cfr_renamed_3 = null;
            sprepm sprepm2 = new sprepm(sprqp2);
            sprtkm2.cfr_renamed_4 = sprgz.cfr_renamed_3.cfr_renamed_5078(sprepm2.cfr_renamed_696());
            return sprepm2;
        }
        return null;
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_2;
    }

    public sprzy cfr_renamed_4171() throws IOException {
        if (!this.cfr_renamed_0) {
            this.cfr_renamed_4170();
        }
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_24();
        }
        this.cfr_renamed_3 = null;
        return (sprzy)this.cfr_renamed_3;
    }

    public sprzy cfr_renamed_4191() throws IOException {
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3 = null;
            return (sprzy)sprvan.cfr_renamed_11332((sprju)this.cfr_renamed_3, 2, false, 17);
        }
        return null;
    }

    public sprpnm cfr_renamed_4170() throws IOException {
        sprju sprju2;
        this.cfr_renamed_0 = true;
        if (this.cfr_renamed_3 == null) {
            this.cfr_renamed_3 = this.cfr_renamed_1.cfr_renamed_24();
        }
        if (this.cfr_renamed_3 instanceof sprju && (sprju2 = (sprju)this.cfr_renamed_3).cfr_renamed_10764(0)) {
            this.cfr_renamed_3 = null;
            return sprpnm.cfr_renamed_23(((sprqp)sprju2.cfr_renamed_11266(false, 16)).cfr_renamed_2414());
        }
        return null;
    }
}

