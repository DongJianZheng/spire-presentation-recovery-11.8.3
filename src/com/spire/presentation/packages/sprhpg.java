/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprknf;
import com.spire.presentation.packages.sprmig;
import com.spire.presentation.packages.sprnig;
import com.spire.presentation.packages.sprowl;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprthg;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvao;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvng;
import com.spire.presentation.packages.sprwbk;
import com.spire.presentation.packages.sprxil;
import java.security.GeneralSecurityException;
import java.security.Provider;
import java.security.PublicKey;
import java.security.Signature;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.List;

public class sprhpg {
    private sprvng cfr_renamed_4;

    public static /* synthetic */ sprge cfr_renamed_7456(sprhpg arg0, sprddm arg1, PublicKey arg2) throws sprhjg {
        return arg0.cfr_renamed_7457(arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprhpg cfr_renamed_1498(Provider provider) {
        void arg0;
        this.cfr_renamed_4 = new sprvng(new sprkhi((Provider)arg0));
        return this;
    }

    private /* synthetic */ sprge cfr_renamed_7457(sprddm arg0, PublicKey arg1) throws sprhjg {
        int n;
        if (arg1 instanceof sprwbk) {
            int n2;
            List<PublicKey> list = ((sprwbk)arg1).cfr_renamed_7458();
            sprszm sprszm2 = sprszm.cfr_renamed_23(arg0.cfr_renamed_284());
            Signature[] signatureArray = new Signature[sprszm2.cfr_renamed_84()];
            int n3 = n2 = 0;
            while (n3 != sprszm2.cfr_renamed_84()) {
                sprddm sprddm2 = sprddm.cfr_renamed_23(sprszm2.cfr_renamed_85(n2));
                signatureArray[n2] = list.get(n2) != null ? this.cfr_renamed_7459(sprddm2, list.get(n2)) : null;
                n3 = ++n2;
            }
            return new sprthg(signatureArray);
        }
        sprszm sprszm3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_284());
        Signature[] signatureArray = new Signature[sprszm3.cfr_renamed_84()];
        int n4 = n = 0;
        while (n4 != sprszm3.cfr_renamed_84()) {
            sprddm sprddm3 = sprddm.cfr_renamed_23(sprszm3.cfr_renamed_85(n));
            try {
                signatureArray[n] = this.cfr_renamed_7459(sprddm3, arg1);
            }
            catch (Exception exception) {
                signatureArray[n] = null;
            }
            n4 = ++n;
        }
        return new sprthg(signatureArray);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3;
        int cfr_ignored_0 = 1 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 4 << 4 ^ (3 << 2 ^ 3);
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

    public static /* synthetic */ Signature cfr_renamed_7460(sprhpg arg0, sprddm arg1, PublicKey arg2) throws sprhjg {
        return arg0.cfr_renamed_7459(arg1, arg2);
    }

    public sprhpg() {
        sprhpg sprhpg2 = this;
        sprhpg2.cfr_renamed_4 = new sprvng(new sprrul());
    }

    public static /* synthetic */ Signature cfr_renamed_7461(sprhpg arg0, sprddm arg1, PublicKey arg2) {
        return arg0.cfr_renamed_7427(arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    public sprhpg cfr_renamed_1499(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprvng(new sprxil((String)arg0));
        return this;
    }

    public sprhk cfr_renamed_1559(PublicKey arg0) throws sprhjg {
        return new sprmig(this, arg0);
    }

    public static /* synthetic */ sprvng cfr_renamed_7462(sprhpg arg0) {
        return arg0.cfr_renamed_4;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Signature cfr_renamed_7427(sprddm arg0, PublicKey arg1) {
        try {
            Signature signature = this.cfr_renamed_4.cfr_renamed_7433(arg0);
            if (signature == null) return signature;
            signature.initVerify(arg1);
            return signature;
        }
        catch (Exception exception) {
            return null;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhk cfr_renamed_1561(X509Certificate arg0) throws sprhjg {
        try {
            sprowl sprowl2 = new sprowl(arg0);
            return new sprnig(this, sprowl2, arg0);
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new sprhjg(new StringBuilder().insert(0, sprvao.cfr_renamed_9("<I1F0\\\u007fX-G<M,[\u007fK:Z+A9A<I+Me\b")).append(certificateEncodingException.getMessage()).toString(), certificateEncodingException);
        }
    }

    public sprhk cfr_renamed_7463(sprvhm arg0) throws sprhjg {
        sprhpg sprhpg2 = this;
        return sprhpg2.cfr_renamed_1559(sprhpg2.cfr_renamed_4.cfr_renamed_7429(arg0));
    }

    public sprhk cfr_renamed_7464(sprtpl arg0) throws sprhjg, CertificateException {
        sprhpg sprhpg2 = this;
        return sprhpg2.cfr_renamed_1561(sprhpg2.cfr_renamed_4.cfr_renamed_7441(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Signature cfr_renamed_7459(sprddm arg0, PublicKey arg1) throws sprhjg {
        try {
            Signature signature = this.cfr_renamed_4.cfr_renamed_7442(arg0);
            signature.initVerify(arg1);
            return signature;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new sprhjg(new StringBuilder().insert(0, sprknf.cfr_renamed_9("Q\u0003W\u001eD\u000f]\u0014Z[[\u0015\u0014\bQ\u000fA\u000b\u000e[")).append(generalSecurityException).toString(), generalSecurityException);
        }
    }
}

