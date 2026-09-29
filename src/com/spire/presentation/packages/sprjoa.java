/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprccha;
import com.spire.presentation.packages.sprfee;
import com.spire.presentation.packages.sprfjb;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprgtb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjra;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sproje;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprude;
import com.spire.presentation.packages.spruib;
import com.spire.presentation.packages.spruzd;
import com.spire.presentation.packages.sprvce;
import com.spire.presentation.packages.sprxbe;
import com.spire.presentation.packages.sprxsa;
import java.io.IOException;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.SignatureException;
import java.security.cert.CRLException;
import java.security.cert.X509CRL;
import java.security.cert.X509CRLEntry;
import java.util.Date;
import java.util.Iterator;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

public class sprjoa {
    private sprtzd cfr_renamed_0;
    private sprije cfr_renamed_1;
    private sprvce cfr_renamed_2;
    private sprfee cfr_renamed_3;
    private String cfr_renamed_4;

    public void cfr_renamed_59(BigInteger arg0, Date arg1, int arg2, Date arg3) {
        this.cfr_renamed_3.cfr_renamed_60(new sprooe(arg0), new spruzd(arg1), arg2, new sprrpe(arg3));
    }

    public void cfr_renamed_61(Date arg0) {
        this.cfr_renamed_3.cfr_renamed_62(new spruzd(arg0));
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_3 = new sprfee();
        this.cfr_renamed_2.cfr_renamed_41();
    }

    private /* synthetic */ X509CRL cfr_renamed_63(sprxbe arg0, byte[] arg1) throws CRLException {
        sprlre sprlre2;
        sprlre sprlre3 = sprlre2 = new sprlre();
        sprlre3.cfr_renamed_49(arg0);
        sprlre3.cfr_renamed_49(this.cfr_renamed_1);
        sprlre sprlre4 = sprlre2;
        sprlre3.cfr_renamed_49(new sprmra(arg1));
        return new sprgtb(new sproje(new sprpse(sprlre2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CRL cfr_renamed_64(PrivateKey arg0) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return this.cfr_renamed_65(arg0, "BC", null);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new SecurityException(sprjze.cfr_renamed_9("a:\u0003\tQ\u0016U\u0010G\u001cQYM\u0016WYJ\u0017P\rB\u0015O\u001cGX"));
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
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprccha.cfr_renamed_9("0\u0005=C'D#\u0016<\u00076\u0017 D#\u0016:\n0\r#\u0005?^s")).append(iOException).toString());
        }
    }

    public void cfr_renamed_18(sprtzd arg0, boolean arg1, byte[] arg2) {
        this.cfr_renamed_2.cfr_renamed_18(new sprtzd(arg0.cfr_renamed_19()), arg1, arg2);
    }

    public void cfr_renamed_6(sprtzd arg0, boolean arg1, spra arg2) {
        this.cfr_renamed_2.cfr_renamed_6(new sprtzd(arg0.cfr_renamed_19()), arg1, arg2);
    }

    private /* synthetic */ sprxbe cfr_renamed_66() {
        if (!this.cfr_renamed_2.cfr_renamed_29()) {
            sprjoa sprjoa2 = this;
            sprjoa2.cfr_renamed_3.cfr_renamed_30(sprjoa2.cfr_renamed_2.cfr_renamed_31());
        }
        return this.cfr_renamed_3.cfr_renamed_67();
    }

    public X509CRL cfr_renamed_37(PrivateKey arg0) throws CRLException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_38(arg0, null);
    }

    public X509CRL cfr_renamed_68(PrivateKey arg0, String arg1) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_65(arg0, arg1, null);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CRL cfr_renamed_8(PrivateKey arg0, String arg1, SecureRandom arg2) throws CRLException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprxbe sprxbe2 = this.cfr_renamed_66();
        try {
            sprjoa sprjoa2 = this;
            byte[] byArray = sprjra.cfr_renamed_47(sprjoa2.cfr_renamed_0, sprjoa2.cfr_renamed_4, arg1, arg0, arg2, sprxbe2);
            return this.cfr_renamed_63(sprxbe2, byArray);
        }
        catch (IOException iOException) {
            throw new sprxsa(sprjze.cfr_renamed_9("@\u0018M\u0017L\r\u0003\u001eF\u0017F\u000bB\rFY`+oYF\u0017@\u0016G\u0010M\u001e"), iOException);
        }
    }

    public Iterator cfr_renamed_25() {
        return sprjra.cfr_renamed_26();
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_69(X509CRL arg0) throws CRLException {
        Set<? extends X509CRLEntry> set = arg0.getRevokedCertificates();
        if (set != null) {
            for (X509CRLEntry x509CRLEntry : set) {
                sprgle sprgle2 = new sprgle(x509CRLEntry.getEncoded());
                try {
                    this.cfr_renamed_3.cfr_renamed_70(sprbne.cfr_renamed_23(sprgle2.cfr_renamed_24()));
                }
                catch (IOException iOException) {
                    throw new CRLException(new StringBuilder().insert(0, sprccha.cfr_renamed_9("\u0001+\u00076\u0014'\r<\ns\u0014!\u000b0\u0001 \u0017:\n4D6\n0\u000b7\r=\u0003s\u000b5D\u00106\u001f^s")).append(iOException.toString()).toString());
                }
            }
        }
    }

    public X509CRL cfr_renamed_20(PrivateKey arg0, String arg1) throws CRLException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_8(arg0, arg1, null);
    }

    public void cfr_renamed_71(Date arg0) {
        this.cfr_renamed_3.cfr_renamed_72(new spruzd(arg0));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_50(String arg0) {
        this.cfr_renamed_4 = arg0;
        try {
            this.cfr_renamed_0 = sprjra.cfr_renamed_51(arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(sprjze.cfr_renamed_9("v\u0017H\u0017L\u000eMYP\u0010D\u0017B\rV\u000bFYW\u0000S\u001c\u0003\u000bF\bV\u001cP\rF\u001d"));
        }
        this.cfr_renamed_1 = sprjra.cfr_renamed_52(this.cfr_renamed_0, arg0);
        sprjoa sprjoa2 = this;
        sprjoa2.cfr_renamed_3.cfr_renamed_53(sprjoa2.cfr_renamed_1);
    }

    public void cfr_renamed_73(BigInteger arg0, Date arg1, int arg2) {
        this.cfr_renamed_3.cfr_renamed_74(new sprooe(arg0), new spruzd(arg1), arg2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CRL cfr_renamed_75(PrivateKey arg0, SecureRandom arg1) throws SecurityException, SignatureException, InvalidKeyException {
        try {
            return this.cfr_renamed_65(arg0, "BC", arg1);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new SecurityException(sprccha.cfr_renamed_9("&\u0010D#\u0016<\u0012:\u00006\u0016s\n<\u0010s\r=\u0017'\u0005?\b6\u0000r"));
        }
    }

    public void cfr_renamed_76(BigInteger arg0, Date arg1, sprude arg2) {
        this.cfr_renamed_3.cfr_renamed_77(new sprooe(arg0), new spruzd(arg1), sprszd.cfr_renamed_23(arg2));
    }

    public void cfr_renamed_54(spruib arg0) {
        this.cfr_renamed_3.cfr_renamed_44(arg0);
    }

    public sprjoa() {
        sprjoa sprjoa2 = this;
        this.cfr_renamed_3 = new sprfee();
        sprjoa2.cfr_renamed_2 = new sprvce();
    }

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
    public X509CRL cfr_renamed_65(PrivateKey arg0, String arg1, SecureRandom arg2) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
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
            throw new SecurityException(new StringBuilder().insert(0, sprjze.cfr_renamed_9("\u001c[\u001aF\tW\u0010L\u0017\u0019Y")).append(generalSecurityException).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CRL cfr_renamed_38(PrivateKey arg0, SecureRandom arg1) throws CRLException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprxbe sprxbe2 = this.cfr_renamed_66();
        try {
            sprjoa sprjoa2 = this;
            byte[] byArray = sprjra.cfr_renamed_57(sprjoa2.cfr_renamed_0, sprjoa2.cfr_renamed_4, arg0, arg1, sprxbe2);
            return this.cfr_renamed_63(sprxbe2, byArray);
        }
        catch (IOException iOException) {
            throw new sprxsa(sprccha.cfr_renamed_9("\u00072\n=\u000b'D4\u0001=\u0001!\u0005'\u0001s'\u0001(s\u0001=\u0007<\u0000:\n4"), iOException);
        }
    }
}

