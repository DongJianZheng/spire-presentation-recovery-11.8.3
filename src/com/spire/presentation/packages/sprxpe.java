/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spranj;
import com.spire.presentation.packages.sprape;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcpe;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.spriue;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sprpfm;
import com.spire.presentation.packages.sprpgm;
import com.spire.presentation.packages.sprqas;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprxgf;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateParsingException;
import java.security.cert.X509Certificate;
import java.util.Date;
import java.util.Iterator;
import javax.security.auth.x500.X500Principal;

public class sprxpe {
    private final spranj cfr_renamed_119;
    private String cfr_renamed_91;
    private final sprrr cfr_renamed_0;
    private sprddm cfr_renamed_1;
    private sprpfm cfr_renamed_2;
    private sprpgm cfr_renamed_3;
    private sprlem cfr_renamed_4;

    public void cfr_renamed_39(boolean[] arg0) {
        this.cfr_renamed_3.cfr_renamed_4994(this.cfr_renamed_27(arg0));
    }

    public sprxpe() {
        sprxpe sprxpe2 = this;
        this.cfr_renamed_0 = new sprdki();
        sprxpe2.cfr_renamed_119 = new spranj();
        this.cfr_renamed_3 = new sprpgm();
        this.cfr_renamed_2 = new sprpfm();
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_3 = new sprpgm();
        this.cfr_renamed_2.cfr_renamed_41();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_50(String arg0) {
        this.cfr_renamed_91 = arg0;
        try {
            this.cfr_renamed_4 = spriue.cfr_renamed_51(arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqas.cfr_renamed_9("\u0017\u0012)\u0012-\u000b,\\1\u0015%\u0012#\b7\u000e'\\6\u00052\u0019b\u000e'\r7\u00191\b'\u0018x\\")).append(arg0).toString());
        }
        this.cfr_renamed_1 = spriue.cfr_renamed_4995(this.cfr_renamed_4, arg0);
        sprxpe sprxpe2 = this;
        sprxpe2.cfr_renamed_3.cfr_renamed_4996(sprxpe2.cfr_renamed_1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_35(String arg0, boolean arg1, X509Certificate arg2) throws CertificateParsingException {
        byte[] byArray = arg2.getExtensionValue(arg0);
        if (byArray == null) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprokp.cfr_renamed_9("q%`8z.}2z}")).append(arg0).append(sprqas.cfr_renamed_9("b\u0012-\bb\f0\u00191\u0019,\b")).toString());
        }
        try {
            sprxgf sprxgf2 = sprape.cfr_renamed_36(byArray);
            this.cfr_renamed_4997(arg0, arg1, sprxgf2);
            return;
        }
        catch (IOException iOException) {
            throw new CertificateParsingException(iOException.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_7(PrivateKey arg0, String arg1, SecureRandom arg2) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        try {
            return this.cfr_renamed_8(arg0, arg1, arg2);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw noSuchProviderException;
        }
        catch (SignatureException signatureException) {
            throw signatureException;
        }
        catch (InvalidKeyException invalidKeyException) {
            throw invalidKeyException;
        }
        catch (GeneralSecurityException generalSecurityException) {
            throw new SecurityException(new StringBuilder().insert(0, sprokp.cfr_renamed_9("8l>q-`4{3.}")).append(generalSecurityException).toString());
        }
    }

    public void cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) {
        this.cfr_renamed_2.cfr_renamed_4998(new sprlem(arg0.cfr_renamed_19()), arg1, arg2);
    }

    public void cfr_renamed_45(Date arg0) {
        this.cfr_renamed_3.cfr_renamed_4999(new sprrcm(arg0));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 5;
        int n4 = n2;
        int n5 = 1 << 3 ^ 3;
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

    public X509Certificate cfr_renamed_37(PrivateKey arg0) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_38(arg0, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_14(PrivateKey arg0) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return this.cfr_renamed_7(arg0, "BC", null);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new SecurityException(sprqas.cfr_renamed_9("\u0000?b\f0\u00134\u0015&\u00190\\,\u00136\\+\u00121\b#\u0010.\u0019&]"));
        }
    }

    public X509Certificate cfr_renamed_42(PrivateKey arg0, String arg1) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_7(arg0, arg1, null);
    }

    public void cfr_renamed_5000(sprlem arg0, boolean arg1, X509Certificate arg2) throws CertificateParsingException {
        this.cfr_renamed_35(arg0.cfr_renamed_19(), arg1, arg2);
    }

    public void cfr_renamed_10(BigInteger arg0) {
        if (arg0.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException(sprokp.cfr_renamed_9("g8f4u143a0v8f}y(g)4?q}u}d2g4`4b844z)q:q/"));
        }
        this.cfr_renamed_3.cfr_renamed_5001(new sprktm(arg0));
    }

    public void cfr_renamed_55(boolean[] arg0) {
        this.cfr_renamed_3.cfr_renamed_5002(this.cfr_renamed_27(arg0));
    }

    private /* synthetic */ X509Certificate cfr_renamed_5003(sprdzl arg0, byte[] arg1) throws Exception {
        sprrvm sprrvm2 = new sprrvm();
        sprxpe sprxpe2 = this;
        sprrvm2.cfr_renamed_5004(arg0);
        sprrvm2.cfr_renamed_5004(sprxpe2.cfr_renamed_1);
        sprrvm sprrvm3 = sprrvm2;
        sprrvm2.cfr_renamed_5004(new sprdye(arg1));
        return (X509Certificate)sprxpe2.cfr_renamed_119.engineGenerateCertificate(new ByteArrayInputStream(new sprcen(sprrvm2).cfr_renamed_104("DER")));
    }

    public void cfr_renamed_12(Date arg0) {
        this.cfr_renamed_3.cfr_renamed_5005(new sprrcm(arg0));
    }

    public X509Certificate cfr_renamed_20(PrivateKey arg0, String arg1) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_8(arg0, arg1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_21(PublicKey arg0) throws IllegalArgumentException {
        try {
            this.cfr_renamed_3.cfr_renamed_5006(sprvhm.cfr_renamed_23(new sprrzm(arg0.getEncoded()).cfr_renamed_24()));
            return;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqas.cfr_renamed_9("7\u0012#\u001e.\u0019b\b-\\2\u000e-\u001f'\u000f1\\)\u0019;\\o\\")).append(exception.toString()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_15(PrivateKey arg0, SecureRandom arg1) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return this.cfr_renamed_7(arg0, "BC", arg1);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new SecurityException(sprokp.cfr_renamed_9("V\u001e4-f2b4p8f}z2`}}3g)u1x8p|"));
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_4997(String string, boolean bl, sprco sprco2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4998(new sprlem((String)arg0), (boolean)arg1, (sprco)arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_43(X500Principal arg0) {
        try {
            this.cfr_renamed_3.cfr_renamed_5007(new sprdzh(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqas.cfr_renamed_9("\u001f#\u0012e\bb\f0\u0013!\u00191\u000fb\f0\u0015,\u001f+\f#\u0010x\\")).append(iOException).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_8(PrivateKey arg0, String arg1, SecureRandom arg2) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprdzl sprdzl2 = this.cfr_renamed_28();
        try {
            sprxpe sprxpe2 = this;
            byte[] byArray = spriue.cfr_renamed_5008(sprxpe2.cfr_renamed_4, sprxpe2.cfr_renamed_91, arg1, arg0, arg2, sprdzl2);
            return this.cfr_renamed_5003(sprdzl2, byArray);
        }
        catch (IOException iOException) {
            throw new sprcpe(sprokp.cfr_renamed_9("8l>q-`4{348z>{9}3s}@\u001fG}w8f)"), iOException);
        }
    }

    private /* synthetic */ sprdzl cfr_renamed_28() {
        if (!this.cfr_renamed_2.cfr_renamed_29()) {
            sprxpe sprxpe2 = this;
            sprxpe2.cfr_renamed_3.cfr_renamed_5009(sprxpe2.cfr_renamed_2.cfr_renamed_31());
        }
        return this.cfr_renamed_3.cfr_renamed_32();
    }

    private /* synthetic */ sprdye cfr_renamed_27(boolean[] arg0) {
        int n;
        byte[] byArray = new byte[(arg0.length + 7) / 8];
        int n2 = n = 0;
        while (n2 != arg0.length) {
            int n3 = n / 8;
            byArray[n3] = (byte)(byArray[n3] | (arg0[n] ? 1 << 7 - n % 8 : 0));
            n2 = ++n;
        }
        n = arg0.length % 8;
        if (n == 0) {
            return new sprdye(byArray);
        }
        return new sprdye(byArray, 8 - n);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16(X500Principal arg0) {
        try {
            this.cfr_renamed_3.cfr_renamed_5010(new sprdzh(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprokp.cfr_renamed_9(">u33)4-f2w8g.4-f4z>}-u1.}")).append(iOException).toString());
        }
    }

    public void cfr_renamed_5011(sprjii arg0) {
        this.cfr_renamed_3.cfr_renamed_5007(arg0);
    }

    public void cfr_renamed_5012(sprjii arg0) {
        this.cfr_renamed_3.cfr_renamed_5010(arg0);
    }

    public Iterator cfr_renamed_25() {
        return spriue.cfr_renamed_26();
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_33(String string, boolean bl, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_5013(new sprlem((String)arg0), (boolean)arg1, (byte[])arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_38(PrivateKey arg0, SecureRandom arg1) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprdzl sprdzl2 = this.cfr_renamed_28();
        try {
            sprxpe sprxpe2 = this;
            byte[] byArray = spriue.cfr_renamed_5014(sprxpe2.cfr_renamed_4, sprxpe2.cfr_renamed_91, arg0, arg1, sprdzl2);
            return this.cfr_renamed_5003(sprdzl2, byArray);
        }
        catch (IOException iOException) {
            throw new sprcpe(sprqas.cfr_renamed_9("\u0019:\u001f'\f6\u0015-\u0012b\u0019,\u001f-\u0018+\u0012%\\\u0016>\u0011\\!\u00190\b"), iOException);
        }
    }

    public void cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) {
        this.cfr_renamed_2.cfr_renamed_5013(new sprlem(arg0.cfr_renamed_19()), arg1, arg2);
    }
}

