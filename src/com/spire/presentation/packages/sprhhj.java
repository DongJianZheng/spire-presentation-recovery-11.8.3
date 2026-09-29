/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreej;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprwdj;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateException;
import java.util.Date;
import java.util.Enumeration;

public class sprhhj
extends KeyStoreSpi {
    private final sprwdj cfr_renamed_1;
    private final KeyStoreSpi cfr_renamed_2;
    public static final String cfr_renamed_3 = "keystore.type.compat";
    private KeyStoreSpi cfr_renamed_4;

    @Override
    public boolean engineIsCertificateEntry(String arg0) {
        return this.cfr_renamed_4.engineIsCertificateEntry(arg0);
    }

    @Override
    public void engineStore(KeyStore.LoadStoreParameter arg0) throws IOException, NoSuchAlgorithmException, CertificateException {
        this.cfr_renamed_4.engineStore(arg0);
    }

    @Override
    public void engineLoad(InputStream arg0, char[] arg1) throws IOException, NoSuchAlgorithmException, CertificateException {
        sprhhj sprhhj2;
        if (arg0 == null) {
            sprhhj sprhhj3 = this;
            sprhhj3.cfr_renamed_4 = sprhhj3.cfr_renamed_2;
            sprhhj3.cfr_renamed_4.engineLoad(null, arg1);
            return;
        }
        if (sprjcf.cfr_renamed_5159(cfr_renamed_3) || !(this.cfr_renamed_2 instanceof spreej)) {
            InputStream inputStream;
            if (!arg0.markSupported()) {
                arg0 = new BufferedInputStream(arg0);
            }
            arg0.mark(8);
            if (this.cfr_renamed_1.engineProbe(arg0)) {
                inputStream = arg0;
                this.cfr_renamed_4 = this.cfr_renamed_1;
            } else {
                this.cfr_renamed_4 = this.cfr_renamed_2;
                inputStream = arg0;
            }
            inputStream.reset();
            sprhhj2 = this;
        } else {
            sprhhj sprhhj4 = this;
            sprhhj2 = sprhhj4;
            sprhhj4.cfr_renamed_4 = sprhhj4.cfr_renamed_2;
        }
        sprhhj2.cfr_renamed_4.engineLoad(arg0, arg1);
    }

    @Override
    public boolean engineContainsAlias(String arg0) {
        return this.cfr_renamed_4.engineContainsAlias(arg0);
    }

    @Override
    public Date engineGetCreationDate(String arg0) {
        return this.cfr_renamed_4.engineGetCreationDate(arg0);
    }

    @Override
    public void engineSetKeyEntry(String arg0, Key arg1, char[] arg2, Certificate[] arg3) throws KeyStoreException {
        this.cfr_renamed_4.engineSetKeyEntry(arg0, arg1, arg2, arg3);
    }

    @Override
    public void engineSetKeyEntry(String arg0, byte[] arg1, Certificate[] arg2) throws KeyStoreException {
        this.cfr_renamed_4.engineSetKeyEntry(arg0, arg1, arg2);
    }

    public boolean engineProbe(InputStream arg0) throws IOException {
        if (this.cfr_renamed_4 instanceof spreej) {
            return ((spreej)this.cfr_renamed_4).engineProbe(arg0);
        }
        return false;
    }

    @Override
    public int engineSize() {
        return this.cfr_renamed_4.engineSize();
    }

    @Override
    public String engineGetCertificateAlias(Certificate arg0) {
        return this.cfr_renamed_4.engineGetCertificateAlias(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprhhj(sprrr sprrr2, KeyStoreSpi keyStoreSpi) {
        void arg1;
        void arg0;
        sprhhj sprhhj2 = this;
        sprhhj sprhhj3 = this;
        sprhhj3.cfr_renamed_1 = new sprwdj((sprrr)arg0);
        sprhhj2.cfr_renamed_2 = arg1;
        sprhhj2.cfr_renamed_4 = keyStoreSpi;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 2 << 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 1;
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

    @Override
    public void engineStore(OutputStream arg0, char[] arg1) throws IOException, NoSuchAlgorithmException, CertificateException {
        this.cfr_renamed_4.engineStore(arg0, arg1);
    }

    @Override
    public Certificate engineGetCertificate(String arg0) {
        return this.cfr_renamed_4.engineGetCertificate(arg0);
    }

    @Override
    public Key engineGetKey(String arg0, char[] arg1) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        return this.cfr_renamed_4.engineGetKey(arg0, arg1);
    }

    @Override
    public boolean engineIsKeyEntry(String arg0) {
        return this.cfr_renamed_4.engineIsKeyEntry(arg0);
    }

    @Override
    public Certificate[] engineGetCertificateChain(String arg0) {
        return this.cfr_renamed_4.engineGetCertificateChain(arg0);
    }

    @Override
    public Enumeration<String> engineAliases() {
        return this.cfr_renamed_4.engineAliases();
    }

    @Override
    public void engineDeleteEntry(String arg0) throws KeyStoreException {
        this.cfr_renamed_4.engineDeleteEntry(arg0);
    }

    @Override
    public void engineSetCertificateEntry(String arg0, Certificate arg1) throws KeyStoreException {
        this.cfr_renamed_4.engineSetCertificateEntry(arg0, arg1);
    }

    @Override
    public void engineLoad(KeyStore.LoadStoreParameter arg0) throws IOException, NoSuchAlgorithmException, CertificateException {
        this.cfr_renamed_4.engineLoad(arg0);
    }
}

