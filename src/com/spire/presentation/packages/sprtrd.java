/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqb;
import com.spire.presentation.packages.sprbqd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdsb;
import com.spire.presentation.packages.sprei;
import com.spire.presentation.packages.sprhah;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprizc;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprqrd;
import com.spire.presentation.packages.sprswd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwrd;
import com.spire.presentation.packages.sprxme;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprypd;
import com.spire.presentation.packages.sprzxd;
import java.io.IOException;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;

public abstract class sprtrd
implements sprei {
    public sprzxd cfr_renamed_2;
    public sprzxd cfr_renamed_3;
    private PrivateKey cfr_renamed_4;

    @Override
    public sprije cfr_renamed_3241() {
        return sprmke.cfr_renamed_23(this.cfr_renamed_4.getEncoded()).cfr_renamed_1254();
    }

    public sprtrd cfr_renamed_1499(String arg0) {
        this.cfr_renamed_2 = new sprzxd(new sprbqd(arg0));
        this.cfr_renamed_3 = this.cfr_renamed_2;
        return this;
    }

    private /* synthetic */ Key cfr_renamed_4060(sprtzd arg0, SecretKey arg1, sprtzd arg2, byte[] arg3) throws sprlqd, InvalidKeyException, NoSuchAlgorithmException {
        Cipher cipher;
        Cipher cipher2 = cipher = this.cfr_renamed_2.cfr_renamed_4059(arg0);
        cipher2.init(4, arg1);
        return cipher2.unwrap(arg3, this.cfr_renamed_2.cfr_renamed_4061(arg2), 3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_4062(sprije arg0, sprije arg1, sprdce arg2, sprxue arg3, byte[] arg4) throws sprlqd {
        try {
            sprtzd sprtzd2 = sprije.cfr_renamed_23(arg0.cfr_renamed_284()).cfr_renamed_593();
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(arg2.cfr_renamed_91());
            sprtrd sprtrd2 = this;
            PublicKey publicKey = sprtrd2.cfr_renamed_2.cfr_renamed_4063(arg0.cfr_renamed_593()).generatePublic(x509EncodedKeySpec);
            SecretKey secretKey = sprtrd2.cfr_renamed_4064(arg0, sprtzd2, publicKey, arg3, this.cfr_renamed_4);
            return sprtrd2.cfr_renamed_4060(sprtzd2, secretKey, arg1.cfr_renamed_593(), arg4);
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new sprlqd(sprizc.cfr_renamed_9("}}p;j<xupx>}r{qnwhvq0"), noSuchAlgorithmException);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new sprlqd(sprhah.cfr_renamed_9(";\u0002)G9\t&\u0006<\u000e4G9\tp\n5\u0014#\u00067\u0002~"), invalidKeyException);
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new sprlqd(sprizc.cfr_renamed_9("sluyup}jsl<uyg<ml{\u007f>upj\u007fpwx0"), invalidKeySpecException);
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new sprlqd(sprhah.cfr_renamed_9("\"\u0002!\u00129\u00155\u0003p\u00171\u00034\u000e>\u0000p\t?\u0013p\u0014%\u0017 \b\"\u00135\u0003~"), noSuchPaddingException);
        }
        catch (Exception exception) {
            throw new sprlqd(sprizc.cfr_renamed_9("qnw{wr\u007fhqn>w{e>upj\u007fpwx0"), exception);
        }
    }

    public sprtrd cfr_renamed_4051(Provider arg0) {
        this.cfr_renamed_3 = sprwrd.cfr_renamed_4052(arg0);
        return this;
    }

    public sprtrd(PrivateKey privateKey) {
        sprtrd sprtrd2 = this;
        sprtrd2.cfr_renamed_2 = new sprzxd(new sprypd());
        this.cfr_renamed_3 = this.cfr_renamed_2;
        this.cfr_renamed_4 = privateKey;
    }

    private /* synthetic */ SecretKey cfr_renamed_4064(sprije arg0, sprtzd arg1, PublicKey arg2, sprxue arg3, PrivateKey arg4) throws sprlqd, GeneralSecurityException, IOException {
        Object object;
        if (arg0.cfr_renamed_593().cfr_renamed_19().equals(sprswd.cfr_renamed_112)) {
            object = arg3.cfr_renamed_186();
            sprxme sprxme2 = sprxme.cfr_renamed_23(sprvva.cfr_renamed_184((byte[])object));
            sprdce sprdce2 = new sprdce(this.cfr_renamed_3241(), sprxme2.cfr_renamed_2096().cfr_renamed_1157().cfr_renamed_81());
            X509EncodedKeySpec x509EncodedKeySpec = new X509EncodedKeySpec(sprdce2.cfr_renamed_91());
            PublicKey publicKey = this.cfr_renamed_2.cfr_renamed_4063(arg0.cfr_renamed_593()).generatePublic(x509EncodedKeySpec);
            arg2 = new spraqb(arg2, publicKey);
            PrivateKey privateKey = arg4;
            arg4 = new sprdsb(privateKey, privateKey);
        }
        Object object2 = object = (Object)this.cfr_renamed_2.cfr_renamed_4058(arg0.cfr_renamed_593());
        ((KeyAgreement)object).init(arg4);
        ((KeyAgreement)object2).doPhase(arg2, true);
        return ((KeyAgreement)object2).generateSecret(arg1.cfr_renamed_19());
    }

    public sprtrd cfr_renamed_4045(String arg0) {
        this.cfr_renamed_3 = sprwrd.cfr_renamed_4046(arg0);
        return this;
    }

    public sprtrd cfr_renamed_1498(Provider arg0) {
        this.cfr_renamed_2 = new sprzxd(new sprqrd(arg0));
        this.cfr_renamed_3 = this.cfr_renamed_2;
        return this;
    }
}

