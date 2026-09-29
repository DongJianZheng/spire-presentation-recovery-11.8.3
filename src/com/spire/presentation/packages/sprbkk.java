/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctc;
import com.spire.presentation.packages.spres;
import com.spire.presentation.packages.sprgmk;
import com.spire.presentation.packages.sprhhk;
import com.spire.presentation.packages.sprink;
import com.spire.presentation.packages.sprjkk;
import com.spire.presentation.packages.sprox;
import com.spire.presentation.packages.sprpmk;
import com.spire.presentation.packages.sprrvy;
import com.spire.presentation.packages.sprsy;
import com.spire.presentation.packages.spryjk;
import com.spire.presentation.packages.sprypk;
import com.spire.presentation.packages.spryz;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509TrustManager;

public class sprbkk
extends sprypk {
    public int cfr_renamed_112;
    public spryz cfr_renamed_119;
    public spres cfr_renamed_91;
    public Long cfr_renamed_0;
    public sprsy cfr_renamed_1;
    public spryjk cfr_renamed_2;
    public Set<String> cfr_renamed_3;
    public boolean cfr_renamed_4;

    public sprbkk cfr_renamed_9708(Provider arg0) {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprrvy.cfr_renamed_9("A}qywf2Tsqf}`k2Q`wsf}`2esa2vwt{|wv2{|2fzw2q}|af`gqf}`<"));
        }
        sprbkk sprbkk2 = this;
        sprbkk2.cfr_renamed_2.cfr_renamed_9708(arg0);
        return sprbkk2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbkk(String string, int n, X509TrustManager x509TrustManager) {
        void arg2;
        void arg1;
        void arg0;
        sprbkk sprbkk2 = this;
        sprbkk sprbkk3 = this;
        super((String)arg0 + ":" + (int)arg1);
        this.cfr_renamed_119 = new sprink(null);
        this.cfr_renamed_112 = 0;
        sprbkk2.cfr_renamed_3 = new HashSet<String>();
        sprbkk2.cfr_renamed_4 = true;
        sprbkk2.cfr_renamed_2 = new spryjk((X509TrustManager)arg2);
    }

    public sprbkk cfr_renamed_9703(String arg0) {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprctc.cfr_renamed_9("\r;=?; ~\u0012?7*;,-~\u0017,1? 1&~#?'~0;27:;0~=0t*<;t=;0'*&+7*;,z"));
        }
        sprbkk sprbkk2 = this;
        sprbkk2.cfr_renamed_2.cfr_renamed_9703(arg0);
        return sprbkk2;
    }

    public sprbkk cfr_renamed_9714(int arg0) {
        this.cfr_renamed_112 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprbkk(String string) {
        void arg0;
        sprbkk sprbkk2 = this;
        super((String)arg0);
        sprbkk sprbkk3 = this;
        this.cfr_renamed_119 = new sprink(null);
        this.cfr_renamed_112 = 0;
        sprbkk2.cfr_renamed_3 = new HashSet<String>();
        sprbkk2.cfr_renamed_4 = true;
        sprbkk2.cfr_renamed_2 = new spryjk(sprjkk.cfr_renamed_9715());
    }

    public sprbkk cfr_renamed_9716(boolean arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprbkk cfr_renamed_9717(String[] arg0) {
        sprbkk sprbkk2 = this;
        sprbkk2.cfr_renamed_3.addAll(Arrays.asList(arg0));
        return sprbkk2;
    }

    public sprbkk cfr_renamed_9718(spres arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public sprbkk cfr_renamed_9719(long arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprbkk(String string, sprsy sprsy2) {
        void arg1;
        void arg0;
        sprbkk sprbkk2 = this;
        super((String)arg0);
        sprbkk sprbkk3 = this;
        sprbkk3.cfr_renamed_119 = new sprink(null);
        sprbkk2.cfr_renamed_112 = 0;
        sprbkk2.cfr_renamed_3 = new HashSet<String>();
        sprbkk2.cfr_renamed_4 = true;
        if (sprsy2 == null) {
            throw new NullPointerException(sprrvy.cfr_renamed_9("\\}2a}qywf2tsqf}`k2q`wsf}`<"));
        }
        this.cfr_renamed_1 = arg1;
    }

    public sprbkk cfr_renamed_9707(KeyManager[] arg0) {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprctc.cfr_renamed_9("\r;=?; ~\u0012?7*;,-~\u0017,1? 1&~#?'~0;27:;0~=0t*<;t=;0'*&+7*;,z"));
        }
        sprbkk sprbkk2 = this;
        sprbkk2.cfr_renamed_2.cfr_renamed_9707(arg0);
        return sprbkk2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbkk(String string, X509TrustManager[] x509TrustManagerArray) {
        void arg1;
        void arg0;
        sprbkk sprbkk2 = this;
        super((String)arg0);
        sprbkk sprbkk3 = this;
        this.cfr_renamed_119 = new sprink(null);
        this.cfr_renamed_112 = 0;
        sprbkk2.cfr_renamed_3 = new HashSet<String>();
        sprbkk2.cfr_renamed_4 = true;
        sprbkk2.cfr_renamed_2 = new spryjk((X509TrustManager[])arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprbkk(String string, X509TrustManager x509TrustManager) {
        void arg1;
        void arg0;
        sprbkk sprbkk2 = this;
        super((String)arg0);
        sprbkk sprbkk3 = this;
        this.cfr_renamed_119 = new sprink(null);
        this.cfr_renamed_112 = 0;
        sprbkk2.cfr_renamed_3 = new HashSet<String>();
        sprbkk2.cfr_renamed_4 = true;
        sprbkk2.cfr_renamed_2 = new spryjk((X509TrustManager)arg1);
    }

    /*
     * WARNING - void declaration
     */
    public sprbkk(String string, int n, sprsy sprsy2) {
        void arg2;
        void arg1;
        void arg0;
        sprbkk sprbkk2 = this;
        super((String)arg0 + ":" + (int)arg1);
        this.cfr_renamed_119 = new sprink(null);
        sprbkk2.cfr_renamed_112 = 0;
        sprbkk2.cfr_renamed_3 = new HashSet<String>();
        sprbkk2.cfr_renamed_4 = true;
        if (sprsy2 == null) {
            throw new NullPointerException(sprrvy.cfr_renamed_9("\\}2a}qywf2tsqf}`k2q`wsf}`<"));
        }
        this.cfr_renamed_1 = arg2;
    }

    public sprbkk cfr_renamed_9705(SecureRandom arg0) {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprctc.cfr_renamed_9("\r;=?; ~\u0012?7*;,-~\u0017,1? 1&~#?'~0;27:;0~=0t*<;t=;0'*&+7*;,z"));
        }
        sprbkk sprbkk2 = this;
        sprbkk2.cfr_renamed_2.cfr_renamed_9705(arg0);
        return sprbkk2;
    }

    public sprbkk cfr_renamed_9706(String arg0) throws NoSuchProviderException {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprrvy.cfr_renamed_9("A}qywf2Tsqf}`k2Q`wsf}`2esa2vwt{|wv2{|2fzw2q}|af`gqf}`<"));
        }
        sprbkk sprbkk2 = this;
        sprbkk2.cfr_renamed_2.cfr_renamed_9706(arg0);
        return sprbkk2;
    }

    @Override
    public sprbkk cfr_renamed_9720(sprox arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public sprbkk cfr_renamed_9721(String arg0) {
        sprbkk sprbkk2 = this;
        sprbkk2.cfr_renamed_3.add(arg0);
        return sprbkk2;
    }

    /*
     * WARNING - void declaration
     */
    public sprbkk(String string, int n, X509TrustManager[] x509TrustManagerArray) {
        this((String)arg0 + ":" + (int)arg1, (X509TrustManager[])arg2);
        void arg2;
        void arg1;
        void arg0;
    }

    @Override
    public sprpmk cfr_renamed_1451() {
        if (this.cfr_renamed_91 == null) {
            sprbkk sprbkk2 = this;
            this.cfr_renamed_91 = new sprgmk(this);
        }
        if (this.cfr_renamed_1 == null) {
            this.cfr_renamed_1 = this.cfr_renamed_2.cfr_renamed_1451();
        }
        if (this.cfr_renamed_2 == null) {
            sprbkk sprbkk3 = this;
            sprbkk sprbkk4 = this;
            sprbkk sprbkk5 = this;
            this.cfr_renamed_2 = new sprhhk(this.cfr_renamed_119, sprbkk3.cfr_renamed_1, sprbkk3.cfr_renamed_112, sprbkk4.cfr_renamed_91, sprbkk4.cfr_renamed_3, sprbkk5.cfr_renamed_0, sprbkk5.cfr_renamed_4);
        }
        return super.cfr_renamed_1451();
    }

    public sprbkk cfr_renamed_9722(spryz arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public sprbkk cfr_renamed_9704(KeyManager arg0) {
        if (this.cfr_renamed_1 != null) {
            throw new IllegalStateException(sprctc.cfr_renamed_9("\r;=?; ~\u0012?7*;,-~\u0017,1? 1&~#?'~0;27:;0~=0t*<;t=;0'*&+7*;,z"));
        }
        sprbkk sprbkk2 = this;
        sprbkk2.cfr_renamed_2.cfr_renamed_9704(arg0);
        return sprbkk2;
    }
}

