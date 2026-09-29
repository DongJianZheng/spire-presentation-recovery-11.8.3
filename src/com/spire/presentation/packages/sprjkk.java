/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbmia;
import com.spire.presentation.packages.sprfam;
import com.spire.presentation.packages.sprnyl;
import com.spire.presentation.packages.sprpdm;
import com.spire.presentation.packages.sprthk;
import com.spire.presentation.packages.sprtlk;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprzgia;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.UnrecoverableKeyException;
import java.security.cert.CRL;
import java.security.cert.CertificateException;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.Iterator;
import java.util.Set;
import javax.net.ssl.KeyManagerFactory;
import javax.net.ssl.X509TrustManager;

public class sprjkk {
    public static X509TrustManager cfr_renamed_9715() {
        return new sprtlk();
    }

    public static X509TrustManager[] cfr_renamed_9725(Set<TrustAnchor> arg0, CRL[] arg1) {
        Iterator<TrustAnchor> iterator;
        X509Certificate[] x509CertificateArray = new X509Certificate[arg0.size()];
        int n = 0;
        Iterator<TrustAnchor> iterator2 = iterator = arg0.iterator();
        while (iterator2.hasNext()) {
            TrustAnchor trustAnchor = iterator.next();
            iterator2 = iterator;
            x509CertificateArray[n++] = trustAnchor.getTrustedCert();
        }
        X509TrustManager[] x509TrustManagerArray = new X509TrustManager[1];
        x509TrustManagerArray[0] = new sprthk(arg0, arg1, x509CertificateArray);
        return x509TrustManagerArray;
    }

    public static KeyManagerFactory cfr_renamed_9726(String arg0, String arg1, KeyStore arg2, char[] arg3) throws UnrecoverableKeyException, NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        KeyManagerFactory keyManagerFactory = null;
        (arg0 == null && arg1 == null ? (keyManagerFactory = KeyManagerFactory.getInstance(KeyManagerFactory.getDefaultAlgorithm())) : (arg1 == null ? (keyManagerFactory = KeyManagerFactory.getInstance(arg0)) : (keyManagerFactory = KeyManagerFactory.getInstance(arg0, arg1)))).init(arg2, arg3);
        return keyManagerFactory;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void cfr_renamed_9727(X509Certificate arg0) throws CertificateException {
        try {
            sprnyl sprnyl2;
            sprtpl sprtpl2 = new sprtpl(arg0.getEncoded());
            sprfam sprfam2 = sprfam.cfr_renamed_5322(sprtpl2.cfr_renamed_98());
            if (sprfam2 != null) {
                if (sprfam2.cfr_renamed_4249(4)) {
                    throw new CertificateException(sprbmia.cfr_renamed_9("l\u000f^JR\u0019F\rBJJ\u001fT\u001e\u0007\u0004H\u001e\u0007\tH\u0004S\u000bN\u0004\u0007\u0001B\u0013d\u000fU\u001et\u0003@\u0004"));
                }
                if (!sprfam2.cfr_renamed_4249(128) && !sprfam2.cfr_renamed_4249(32)) {
                    throw new CertificateException(sprzgia.cfr_renamed_9("\u0004E6\u0000:S.G*\u0000\"U<ToB*\u0000!O!Ec\u0000+I(I;A#s&G!A;U=EoO=\u0000$E6e!C&P'E=M*N;"));
                }
            }
            if ((sprnyl2 = sprnyl.cfr_renamed_5322(sprtpl2.cfr_renamed_98())) == null) return;
            if (sprnyl2.cfr_renamed_5276(sprpdm.cfr_renamed_1)) return;
            if (sprnyl2.cfr_renamed_5276(sprpdm.cfr_renamed_114)) return;
            if (sprnyl2.cfr_renamed_5276(sprpdm.cfr_renamed_105)) return;
            throw new CertificateException(sprbmia.cfr_renamed_9("d\u000fU\u001eN\fN\tF\u001eBJB\u0012S\u000fI\u000eB\u000e\u0007\u0001B\u0013\u0007\u001fT\u000b@\u000f\u0007\u0007R\u0019SJN\u0004D\u0006R\u000eBJT\u000fU\u001cB\u0018f\u001fS\u0002\u000bJJ\u0019t-dJH\u0018\u0007\u0004T9`)"));
        }
        catch (CertificateException certificateException) {
            throw certificateException;
        }
        catch (Exception exception) {
            throw new CertificateException(exception.getMessage(), exception);
        }
    }
}

