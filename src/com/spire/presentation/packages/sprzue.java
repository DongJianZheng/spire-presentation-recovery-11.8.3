/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprald;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprchk;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprdzh;
import com.spire.presentation.packages.sprffm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhyh;
import com.spire.presentation.packages.spriue;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprjii;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sprmgm;
import com.spire.presentation.packages.sprpfm;
import com.spire.presentation.packages.sprrcm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtfm;
import com.spire.presentation.packages.sprure;
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

public class sprzue {
    private sprlem cfr_renamed_91;
    private sprpfm cfr_renamed_0;
    private final sprrr cfr_renamed_1;
    private sprmgm cfr_renamed_2;
    private sprddm cfr_renamed_3;
    private String cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_4997(String string, boolean bl, sprco sprco2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4998(new sprlem((String)arg0), (boolean)arg1, (sprco)arg2);
    }

    public void cfr_renamed_73(BigInteger arg0, Date arg1, int arg2) {
        this.cfr_renamed_2.cfr_renamed_5015(new sprktm(arg0), new sprrcm(arg1), arg2);
    }

    public void cfr_renamed_71(Date arg0) {
        this.cfr_renamed_2.cfr_renamed_5016(new sprrcm(arg0));
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
            throw new SecurityException(sprald.cfr_renamed_9("m\u0004\u000f7](Y.K\"]gA([gF)\\3N+C\"Kf"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CRL cfr_renamed_38(PrivateKey arg0, SecureRandom arg1) throws CRLException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprtfm sprtfm2 = this.cfr_renamed_66();
        try {
            sprzue sprzue2 = this;
            byte[] byArray = spriue.cfr_renamed_5014(sprzue2.cfr_renamed_91, sprzue2.cfr_renamed_4, arg0, arg1, sprtfm2);
            return this.cfr_renamed_5017(sprtfm2, byArray);
        }
        catch (IOException iOException) {
            throw new sprure(sprchk.cfr_renamed_9("\u0005}\br\thF{\u0003r\u0003n\u0007h\u0003<%N*<\u0003r\u0005s\u0002u\b{"), iOException);
        }
    }

    public sprzue() {
        sprzue sprzue2 = this;
        this.cfr_renamed_1 = new sprdki();
        sprzue2.cfr_renamed_2 = new sprmgm();
        this.cfr_renamed_0 = new sprpfm();
    }

    public void cfr_renamed_5018(BigInteger arg0, Date arg1, sprmbm arg2) {
        this.cfr_renamed_2.cfr_renamed_5019(new sprktm(arg0), new sprrcm(arg1), sprhgm.cfr_renamed_23(arg2));
    }

    private /* synthetic */ sprtfm cfr_renamed_66() {
        if (!this.cfr_renamed_0.cfr_renamed_29()) {
            sprzue sprzue2 = this;
            sprzue2.cfr_renamed_2.cfr_renamed_5009(sprzue2.cfr_renamed_0.cfr_renamed_31());
        }
        return this.cfr_renamed_2.cfr_renamed_67();
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

    public X509CRL cfr_renamed_68(PrivateKey arg0, String arg1) throws NoSuchProviderException, SecurityException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_65(arg0, arg1, null);
    }

    public void cfr_renamed_5011(sprjii arg0) {
        this.cfr_renamed_2.cfr_renamed_5007(arg0);
    }

    public void cfr_renamed_41() {
        this.cfr_renamed_2 = new sprmgm();
        this.cfr_renamed_0.cfr_renamed_41();
    }

    public void cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) {
        this.cfr_renamed_0.cfr_renamed_4998(new sprlem(arg0.cfr_renamed_19()), arg1, arg2);
    }

    public X509CRL cfr_renamed_37(PrivateKey arg0) throws CRLException, IllegalStateException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_38(arg0, null);
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
                sprrzm sprrzm2 = new sprrzm(x509CRLEntry.getEncoded());
                try {
                    this.cfr_renamed_2.cfr_renamed_5020(sprszm.cfr_renamed_23(sprrzm2.cfr_renamed_24()));
                }
                catch (IOException iOException) {
                    throw new CRLException(new StringBuilder().insert(0, sprald.cfr_renamed_9("J?L\"_3F(Ag_5@$J4\\.A \u000f\"A$@#F)Hg@!\u000f\u0004}\u000b\u0015g")).append(iOException.toString()).toString());
                }
            }
        }
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
            throw new SecurityException(new StringBuilder().insert(0, sprchk.cfr_renamed_9("y\u001e\u007f\u0003l\u0012u\tr\\<")).append(generalSecurityException).toString());
        }
    }

    public void cfr_renamed_61(Date arg0) {
        this.cfr_renamed_2.cfr_renamed_5021(new sprrcm(arg0));
    }

    public X509CRL cfr_renamed_20(PrivateKey arg0, String arg1) throws CRLException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        return this.cfr_renamed_8(arg0, arg1, null);
    }

    private /* synthetic */ X509CRL cfr_renamed_5017(sprtfm arg0, byte[] arg1) throws CRLException {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(arg0);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_3);
        sprrvm sprrvm4 = sprrvm2;
        sprrvm3.cfr_renamed_5004(new sprdye(arg1));
        return new sprhyh(sprffm.cfr_renamed_23(new sprcen(sprrvm2)));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_50(String arg0) {
        this.cfr_renamed_4 = arg0;
        try {
            this.cfr_renamed_91 = spriue.cfr_renamed_51(arg0);
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(sprald.cfr_renamed_9("z)D)@0Ag\\.H)N3Z5Jg[>_\"\u000f5J6Z\"\\3J#"));
        }
        this.cfr_renamed_3 = spriue.cfr_renamed_4995(this.cfr_renamed_91, arg0);
        sprzue sprzue2 = this;
        sprzue2.cfr_renamed_2.cfr_renamed_4996(sprzue2.cfr_renamed_3);
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
            throw new SecurityException(sprchk.cfr_renamed_9("$_Fl\u0014s\u0010u\u0002y\u0014<\bs\u0012<\u000fr\u0015h\u0007p\ny\u0002="));
        }
    }

    public void cfr_renamed_59(BigInteger arg0, Date arg1, int arg2, Date arg3) {
        this.cfr_renamed_2.cfr_renamed_5022(new sprktm(arg0), new sprrcm(arg1), arg2, new sprjfn(arg3));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_43(X500Principal arg0) {
        try {
            this.cfr_renamed_2.cfr_renamed_5007(new sprdzh(arg0.getEncoded()));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprald.cfr_renamed_9("$N)\b3\u000f7](L\"\\4\u000f7].A$F7N+\u0015g")).append(iOException).toString());
        }
    }

    public void cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) {
        this.cfr_renamed_0.cfr_renamed_5013(new sprlem(arg0.cfr_renamed_19()), arg1, arg2);
    }

    public Iterator cfr_renamed_25() {
        return spriue.cfr_renamed_26();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public X509CRL cfr_renamed_8(PrivateKey arg0, String arg1, SecureRandom arg2) throws CRLException, IllegalStateException, NoSuchProviderException, NoSuchAlgorithmException, SignatureException, InvalidKeyException {
        sprtfm sprtfm2 = this.cfr_renamed_66();
        try {
            sprzue sprzue2 = this;
            byte[] byArray = spriue.cfr_renamed_5008(sprzue2.cfr_renamed_91, sprzue2.cfr_renamed_4, arg1, arg0, arg2, sprtfm2);
            return this.cfr_renamed_5017(sprtfm2, byArray);
        }
        catch (IOException iOException) {
            throw new sprure(sprchk.cfr_renamed_9("\u0005}\br\thF{\u0003r\u0003n\u0007h\u0003<%N*<\u0003r\u0005s\u0002u\b{"), iOException);
        }
    }
}

