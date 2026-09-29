/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbee;
import com.spire.presentation.packages.sprbnb;
import com.spire.presentation.packages.sprcge;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.spresa;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjra;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmaca;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprphe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtua;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvce;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxik;
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

public class sprzqa {
    private sprtzd cfr_renamed_0;
    private sprvce cfr_renamed_1;
    private String cfr_renamed_2;
    private sprije cfr_renamed_3;
    private sprphe cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_5(String string, boolean bl, spra spra2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_6(new sprtzd((String)arg0), (boolean)arg1, (spra)arg2);
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
            throw new SecurityException(new StringBuilder().insert(0, sprmaca.cfr_renamed_9("CDEYVHOSH\u0006\u0006")).append(generalSecurityException).toString());
        }
    }

    public void cfr_renamed_10(BigInteger arg0) {
        if (arg0.compareTo(BigInteger.ZERO) <= 0) {
            throw new IllegalArgumentException(sprxik.cfr_renamed_9("O\u0018N\u0014]\u0011\u001c\u0013I\u0010^\u0018N]Q\bO\t\u001c\u001fY]]]L\u0012O\u0014H\u0014J\u0018\u001c\u0014R\tY\u001aY\u000f"));
        }
        this.cfr_renamed_4.cfr_renamed_11(new sprooe(arg0));
    }

    public void cfr_renamed_12(Date arg0) {
        this.cfr_renamed_4.cfr_renamed_13(new spruzd(arg0));
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
            throw new SecurityException(sprmaca.cfr_renamed_9("~e\u001cVNIJOXCN\u0006RIH\u0006UHOR]JPCX\u0007"));
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
            throw new SecurityException(sprxik.cfr_renamed_9("~>\u001c\rN\u0012J\u0014X\u0018N]R\u0012H]U\u0013O\t]\u0011P\u0018X\\"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_16(X500Principal arg0) {
        try {
            this.cfr_renamed_4.cfr_renamed_17(new sprfjb(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmaca.cfr_renamed_9("E]H\u001bR\u001cVNI_COU\u001cVNOREUV]J\u0006\u0006")).append(iOException).toString());
        }
    }

    public void cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) {
        this.cfr_renamed_1.cfr_renamed_18(new sprtzd(arg0.cfr_renamed_19()), arg1, arg2);
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
            this.cfr_renamed_4.cfr_renamed_22(sprdce.cfr_renamed_23(new sprgle(arg0.getEncoded()).cfr_renamed_24()));
            return;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxik.cfr_renamed_9("I\u0013]\u001fP\u0018\u001c\tS]L\u000fS\u001eY\u000eO]W\u0018E]\u0011]")).append(exception.toString()).toString());
        }
    }

    public Iterator cfr_renamed_25() {
        return sprjra.cfr_renamed_26();
    }

    private /* synthetic */ sprmra cfr_renamed_27(boolean[] arg0) {
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
            return new sprmra(byArray);
        }
        return new sprmra(byArray, 8 - n);
    }

    private /* synthetic */ sprbee cfr_renamed_28() {
        if (!this.cfr_renamed_1.cfr_renamed_29()) {
            sprzqa sprzqa2 = this;
            sprzqa2.cfr_renamed_4.cfr_renamed_30(sprzqa2.cfr_renamed_1.cfr_renamed_31());
        }
        return this.cfr_renamed_4.cfr_renamed_32();
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_33(String string, boolean bl, byte[] byArray) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_18(new sprtzd((String)arg0), (boolean)arg1, (byte[])arg2);
    }

    public void cfr_renamed_34(sprtzd arg0, boolean arg1, X509Certificate arg2) throws CertificateParsingException {
        this.cfr_renamed_35(arg0.cfr_renamed_19(), arg1, arg2);
    }

    public void cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) {
        this.cfr_renamed_1.cfr_renamed_6(new sprtzd(arg0.cfr_renamed_19()), arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_35(String arg0, boolean arg1, X509Certificate arg2) throws CertificateParsingException {
        byte[] byArray = arg2.getExtensionValue(arg0);
        if (byArray == null) {
            throw new CertificateParsingException(new StringBuilder().insert(0, sprmaca.cfr_renamed_9("Y^HCRUUIR\u0006")).append(arg0).append(sprxik.cfr_renamed_9("\u001c\u0013S\t\u001c\rN\u0018O\u0018R\t")).toString());
        }
        try {
            sprvva sprvva2 = sprtua.cfr_renamed_36(byArray);
            this.cfr_renamed_5(arg0, arg1, sprvva2);
            return;
        }
        catch (IOException iOException) {
            throw new CertificateParsingException(iOException.toString());
        }
    }

    public X509Certificate cfr_renamed_37(PrivateKey arg0) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_38(arg0, null);
    }

    public void cfr_renamed_39(boolean[] arg0) {
        this.cfr_renamed_4.cfr_renamed_40(this.cfr_renamed_27(arg0));
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_4 = new sprphe();
        this.cfr_renamed_1.cfr_renamed_41();
    }

    public X509Certificate cfr_renamed_42(PrivateKey arg0, String arg1) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_7(arg0, arg1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_43(X500Principal arg0) {
        try {
            this.cfr_renamed_4.cfr_renamed_44(new sprfjb(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprmaca.cfr_renamed_9("E]H\u001bR\u001cVNI_COU\u001cVNOREUV]J\u0006\u0006")).append(iOException).toString());
        }
    }

    public void cfr_renamed_45(Date arg0) {
        this.cfr_renamed_4.cfr_renamed_46(new spruzd(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_8(PrivateKey arg0, String arg1, SecureRandom arg2) throws CertificateEncodingException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprbee sprbee2 = this.cfr_renamed_28();
        try {
            sprzqa sprzqa2 = this;
            byte[] byArray = sprjra.cfr_renamed_47(sprzqa2.cfr_renamed_0, sprzqa2.cfr_renamed_2, arg1, arg0, arg2, sprbee2);
            return this.cfr_renamed_48(sprbee2, byArray);
        }
        catch (IOException iOException) {
            throw new spresa(sprxik.cfr_renamed_9("\u0018D\u001eY\rH\u0014S\u0013\u001c\u0018R\u001eS\u0019U\u0013[]h?o]_\u0018N\t"), iOException);
        }
    }

    private /* synthetic */ X509Certificate cfr_renamed_48(sprbee arg0, byte[] arg1) throws CertificateParsingException {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(arg0);
        sprlre3.cfr_renamed_49(this.cfr_renamed_3);
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprmra(arg1));
        return new sprbnb(sprcge.cfr_renamed_23(new sprpse(sprlre2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_50(String arg0) {
        this.cfr_renamed_2 = arg0;
        try {
            this.cfr_renamed_0 = sprjra.cfr_renamed_51(arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxik.cfr_renamed_9("i\u0013W\u0013S\nR]O\u0014[\u0013]\tI\u000fY]H\u0004L\u0018\u001c\u000fY\fI\u0018O\tY\u0019\u0006]")).append(arg0).toString());
        }
        this.cfr_renamed_3 = sprjra.cfr_renamed_52(this.cfr_renamed_0, arg0);
        sprzqa sprzqa2 = this;
        sprzqa2.cfr_renamed_4.cfr_renamed_53(sprzqa2.cfr_renamed_3);
    }

    public void cfr_renamed_54(spruib arg0) {
        this.cfr_renamed_4.cfr_renamed_44(arg0);
    }

    public sprzqa() {
        sprzqa sprzqa2 = this;
        this.cfr_renamed_4 = new sprphe();
        sprzqa2.cfr_renamed_1 = new sprvce();
    }

    public void cfr_renamed_55(boolean[] arg0) {
        this.cfr_renamed_4.cfr_renamed_56(this.cfr_renamed_27(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509Certificate cfr_renamed_38(PrivateKey arg0, SecureRandom arg1) throws CertificateEncodingException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprbee sprbee2 = this.cfr_renamed_28();
        try {
            sprzqa sprzqa2 = this;
            byte[] byArray = sprjra.cfr_renamed_57(sprzqa2.cfr_renamed_0, sprzqa2.cfr_renamed_2, arg0, arg1, sprbee2);
            return this.cfr_renamed_48(sprbee2, byArray);
        }
        catch (IOException iOException) {
            throw new spresa(sprmaca.cfr_renamed_9("CDEYVHOSH\u001cCRESBUH[\u0006hdo\u0006_CNR"), iOException);
        }
    }

    public void cfr_renamed_58(spruib arg0) {
        this.cfr_renamed_4.cfr_renamed_17(arg0);
    }
}

