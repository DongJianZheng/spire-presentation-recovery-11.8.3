/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbee;
import com.spire.presentation.packages.sprbnb;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprcnx;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spresa;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprfyha;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.spruzd;
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

public class sprsra {
    private String cfr_renamed_1;
    private sprtzd cfr_renamed_2;
    private sprfke cfr_renamed_3;
    private sprije cfr_renamed_4;

    public X509Certificate cfr_renamed_37(PrivateKey arg0) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_38(arg0, null);
    }

    public Iterator cfr_renamed_25() {
        return sprjra.cfr_renamed_26();
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
            throw new SecurityException(new StringBuilder().insert(0, sprcnx.cfr_renamed_9(" 4&)58,#+ve")).append(generalSecurityException).toString());
        }
    }

    public sprsra() {
        sprsra sprsra2 = this;
        sprsra2.cfr_renamed_3 = new sprfke();
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
            throw new SecurityException(sprfyha.cfr_renamed_9(")KKx\u0019g\u001da\u000fm\u0019(\u0005g\u001f(\u0002f\u0018|\nd\u0007m\u000f)"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16(X500Principal arg0) {
        try {
            this.cfr_renamed_3.cfr_renamed_17(new sprfjb(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcnx.cfr_renamed_9("&-+k1l5>*/ ?6l5>,\"&%5-)ve")).append(iOException).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_43(X500Principal arg0) {
        try {
            this.cfr_renamed_3.cfr_renamed_44(new sprfjb(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprfyha.cfr_renamed_9("k\nfL|Kx\u0019g\bm\u0018{Kx\u0019a\u0005k\u0002x\ndQ(")).append(iOException).toString());
        }
    }

    public void cfr_renamed_54(spruib arg0) {
        this.cfr_renamed_3.cfr_renamed_44(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_21(PublicKey arg0) {
        try {
            this.cfr_renamed_3.cfr_renamed_22(new sprdce((sprbne)new sprgle(new ByteArrayInputStream(arg0.getEncoded())).cfr_renamed_24()));
            return;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprcnx.cfr_renamed_9("9+-'  l1#e<7#&)6?e' 5eae")).append(exception.toString()).toString());
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
            throw new SecurityException(sprfyha.cfr_renamed_9(")KKx\u0019g\u001da\u000fm\u0019(\u0005g\u001f(\u0002f\u0018|\nd\u0007m\u000f)"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_8(PrivateKey arg0, String arg1, SecureRandom arg2) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprbee sprbee2 = this.cfr_renamed_3.cfr_renamed_32();
        try {
            sprsra sprsra2 = this;
            byte[] byArray = sprjra.cfr_renamed_47(sprsra2.cfr_renamed_2, sprsra2.cfr_renamed_1, arg1, arg0, arg2, sprbee2);
            return this.cfr_renamed_48(sprbee2, byArray);
        }
        catch (IOException iOException) {
            throw new spresa(sprcnx.cfr_renamed_9(" 4&)58,#+l \"&#!%++e\u0018\u0007\u001fe/ >1"), iOException);
        }
    }

    public void cfr_renamed_10(BigInteger arg0) {
        if (arg0.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException(sprfyha.cfr_renamed_9("\u0018m\u0019a\ndKf\u001ee\tm\u0019(\u0006}\u0018|Kj\u000e(\n(\u001bg\u0018a\u001fa\u001dmKa\u0005|\u000eo\u000ez"));
        }
        this.cfr_renamed_3.cfr_renamed_11(new sprooe(arg0));
    }

    public void cfr_renamed_58(spruib arg0) {
        this.cfr_renamed_3.cfr_renamed_17(arg0);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 1;
        int cfr_ignored_0 = (2 ^ 5) << 3;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (2 << 2 ^ 3);
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

    public void cfr_renamed_41() {
        sprsra sprsra2 = this;
        sprsra2.cfr_renamed_3 = new sprfke();
    }

    public X509Certificate cfr_renamed_42(PrivateKey arg0, String arg1) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_7(arg0, arg1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_50(String arg0) {
        this.cfr_renamed_1 = arg0;
        try {
            this.cfr_renamed_2 = sprjra.cfr_renamed_51(arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(sprcnx.cfr_renamed_9("\u0019+'+#2\"e?,++-197)e8<< l7)49 ?1)!"));
        }
        this.cfr_renamed_4 = sprjra.cfr_renamed_52(this.cfr_renamed_2, arg0);
        sprsra sprsra2 = this;
        sprsra2.cfr_renamed_3.cfr_renamed_53(sprsra2.cfr_renamed_4);
    }

    public void cfr_renamed_12(Date arg0) {
        this.cfr_renamed_3.cfr_renamed_13(new spruzd(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_38(PrivateKey arg0, SecureRandom arg1) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprbee sprbee2 = this.cfr_renamed_3.cfr_renamed_32();
        try {
            sprsra sprsra2 = this;
            byte[] byArray = sprjra.cfr_renamed_57(sprsra2.cfr_renamed_2, sprsra2.cfr_renamed_1, arg0, arg1, sprbee2);
            return this.cfr_renamed_48(sprbee2, byArray);
        }
        catch (IOException iOException) {
            throw new spresa(sprfyha.cfr_renamed_9("m\u0013k\u000ex\u001fa\u0004fKm\u0005k\u0004l\u0002f\f(?J8(\bm\u0019|"), iOException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ X509Certificate cfr_renamed_48(sprbee arg0, byte[] arg1) throws CertificateEncodingException {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(arg0);
        sprlre3.cfr_renamed_49(this.cfr_renamed_4);
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprmra(arg1));
        try {
            return new sprbnb(sprcge.cfr_renamed_23(new sprpse(sprlre2)));
        }
        catch (CertificateParsingException certificateParsingException) {
            throw new spresa(sprcnx.cfr_renamed_9(")=/ <1%*\"e<7#!9&%++e/ >1%#%&-1)e#'& /1"), certificateParsingException);
        }
    }

    public X509Certificate cfr_renamed_20(PrivateKey arg0, String arg1) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_8(arg0, arg1, null);
    }

    public void cfr_renamed_45(Date arg0) {
        this.cfr_renamed_3.cfr_renamed_46(new spruzd(arg0));
    }
}

