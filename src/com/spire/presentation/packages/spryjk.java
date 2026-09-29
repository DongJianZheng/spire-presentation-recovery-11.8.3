/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhjea;
import com.spire.presentation.packages.sprjjo;
import com.spire.presentation.packages.sprsy;
import com.spire.presentation.packages.spryik;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.security.SecureRandom;
import java.security.Security;
import javax.net.ssl.KeyManager;
import javax.net.ssl.X509TrustManager;

public class spryjk {
    public String cfr_renamed_0 = "TLS";
    public SecureRandom cfr_renamed_1;
    public X509TrustManager[] cfr_renamed_2;
    public Provider cfr_renamed_3;
    public KeyManager[] cfr_renamed_4;

    public sprsy cfr_renamed_1451() {
        return new spryik(this);
    }

    public spryjk cfr_renamed_9703(String arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public spryjk cfr_renamed_9704(KeyManager arg0) {
        if (arg0 == null) {
            this.cfr_renamed_4 = null;
            return this;
        }
        KeyManager[] keyManagerArray = new KeyManager[1];
        keyManagerArray[0] = arg0;
        this.cfr_renamed_4 = keyManagerArray;
        return this;
    }

    public spryjk cfr_renamed_9705(SecureRandom arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public spryjk cfr_renamed_9706(String arg0) throws NoSuchProviderException {
        this.cfr_renamed_3 = Security.getProvider(arg0);
        if (this.cfr_renamed_3 == null) {
            throw new NoSuchProviderException(new StringBuilder().insert(0, sprhjea.cfr_renamed_9("\u000b=\u0012+a\u001e3\u00017\u0007%\u000b3N/\u00015N'\u00014\u0000%Ta")).append(arg0).toString());
        }
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spryjk(X509TrustManager x509TrustManager) {
        void arg0;
        if (x509TrustManager == null) {
            throw new NullPointerException(sprjjo.cfr_renamed_9("r\u0013S\u0012RAK\u0000H\u0000A\u0004T\u0012\u0006\u0002G\u000f\u0006\u000fI\u0015\u0006\u0003CAH\u0014J\r"));
        }
        X509TrustManager[] x509TrustManagerArray = new X509TrustManager[1];
        x509TrustManagerArray[0] = arg0;
        this.cfr_renamed_2 = x509TrustManagerArray;
    }

    public spryjk cfr_renamed_9707(KeyManager[] arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public spryjk cfr_renamed_9708(Provider arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spryjk(X509TrustManager[] x509TrustManagerArray) {
        void arg0;
        if (x509TrustManagerArray == null) {
            throw new NullPointerException(sprhjea.cfr_renamed_9(":3\u001b2\u001aa\u0003 \u0000 \t$\u001c2N\"\u000f/N/\u00015N#\u000ba\u00004\u0002-"));
        }
        this.cfr_renamed_2 = arg0;
    }
}

