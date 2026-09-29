/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprage;
import com.spire.presentation.packages.spraiaa;
import com.spire.presentation.packages.spraje;
import com.spire.presentation.packages.sprbbe;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprcje;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdob;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprfbe;
import com.spire.presentation.packages.sprgbe;
import com.spire.presentation.packages.sprgdc;
import com.spire.presentation.packages.sprgde;
import com.spire.presentation.packages.sprgle;
import com.spire.presentation.packages.sprhc;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkee;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprmne;
import com.spire.presentation.packages.sprmpb;
import com.spire.presentation.packages.sprnje;
import com.spire.presentation.packages.sprnle;
import com.spire.presentation.packages.sproce;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprpve;
import com.spire.presentation.packages.sprqzo;
import com.spire.presentation.packages.sprrhc;
import com.spire.presentation.packages.sprrvca;
import com.spire.presentation.packages.sprs;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.sprtke;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprume;
import com.spire.presentation.packages.sprvbe;
import com.spire.presentation.packages.sprvkb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwb;
import com.spire.presentation.packages.sprwoe;
import com.spire.presentation.packages.sprwub;
import com.spire.presentation.packages.sprxac;
import com.spire.presentation.packages.sprxle;
import com.spire.presentation.packages.sprxqa;
import com.spire.presentation.packages.sprxue;
import com.spire.presentation.packages.sprylb;
import com.spire.presentation.packages.sprzie;
import com.spire.presentation.packages.sprzra;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.spec.InvalidKeySpecException;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

public class sprtcc
extends KeyStoreSpi
implements sprm,
sprs,
sprhc {
    private sprwub cfr_renamed_2414;
    public static final int cfr_renamed_2415 = 2;
    public static final int cfr_renamed_1157 = 3;
    public static final int cfr_renamed_2416 = 1;
    public static final int spr\u3027 = 0;
    public static final int cfr_renamed_2417 = 2;
    private Hashtable cfr_renamed_312;
    private static final int cfr_renamed_2418 = 1024;
    private Hashtable cfr_renamed_2419;
    private sprtzd cfr_renamed_2420;
    private sprwub cfr_renamed_2421;
    private static final int cfr_renamed_2422 = 20;
    public static final int cfr_renamed_2423 = 4;
    private static final sprxac cfr_renamed_2424;
    public SecureRandom cfr_renamed_2425;
    public static final int cfr_renamed_2426 = 1;
    public static final int cfr_renamed_1219 = 0;
    private sprtzd cfr_renamed_2427;
    private Hashtable cfr_renamed_2;
    private static final Provider cfr_renamed_3;
    private CertificateFactory cfr_renamed_4;

    private /* synthetic */ Cipher cfr_renamed_2428(int arg0, char[] arg1, sprije arg2) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException {
        sprgbe sprgbe2;
        SecretKey secretKey;
        sprgbe sprgbe3 = sprgbe.cfr_renamed_23(arg2.cfr_renamed_284());
        sprkee sprkee2 = sprkee.cfr_renamed_23(sprgbe3.cfr_renamed_2429().cfr_renamed_284());
        sprije sprije2 = sprije.cfr_renamed_23(sprgbe3.cfr_renamed_2430());
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(sprgbe3.cfr_renamed_2429().cfr_renamed_593().cfr_renamed_19(), cfr_renamed_3);
        if (sprkee2.cfr_renamed_2431()) {
            secretKey = secretKeyFactory.generateSecret(new PBEKeySpec(arg1, sprkee2.cfr_renamed_1477(), sprkee2.cfr_renamed_1478().intValue(), cfr_renamed_2424.cfr_renamed_1497(sprije2)));
            sprgbe2 = sprgbe3;
        } else {
            secretKey = secretKeyFactory.generateSecret(new sprylb(arg1, sprkee2.cfr_renamed_1477(), sprkee2.cfr_renamed_1478().intValue(), cfr_renamed_2424.cfr_renamed_1497(sprije2), sprkee2.cfr_renamed_2386()));
            sprgbe2 = sprgbe3;
        }
        Cipher cipher = Cipher.getInstance(sprgbe2.cfr_renamed_2430().cfr_renamed_593().cfr_renamed_19());
        sprgbe sprgbe4 = sprgbe3;
        sprije sprije3 = sprije.cfr_renamed_23(sprgbe4.cfr_renamed_2430());
        spra spra2 = sprgbe4.cfr_renamed_2430().cfr_renamed_284();
        if (spra2 instanceof sprxue) {
            Cipher cipher2 = cipher;
            cipher2.init(arg0, (Key)secretKey, new IvParameterSpec(sprxue.cfr_renamed_23(spra2).cfr_renamed_186()));
            return cipher2;
        }
        sprxle sprxle2 = sprxle.cfr_renamed_23(spra2);
        Cipher cipher3 = cipher;
        cipher3.init(arg0, (Key)secretKey, new sprdob(sprxle2.cfr_renamed_2105(), sprxle2.cfr_renamed_1205()));
        return cipher3;
    }

    public static /* synthetic */ sprrvca cfr_renamed_2432(sprtcc arg0, PublicKey arg1) {
        return arg0.cfr_renamed_2433(arg1);
    }

    @Override
    public void engineSetKeyEntry(String arg0, byte[] arg1, Certificate[] arg2) throws KeyStoreException {
        throw new RuntimeException(spraiaa.cfr_renamed_9("** ($.,5+z+51z6/5**(1?!"));
    }

    @Override
    public void cfr_renamed_1613(SecureRandom arg0) {
        this.cfr_renamed_2425 = arg0;
    }

    @Override
    public int engineSize() {
        Enumeration enumeration;
        Hashtable<Object, String> hashtable = new Hashtable<Object, String>();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2414.cfr_renamed_2434();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            hashtable.put(enumeration3.nextElement(), sprqzo.cfr_renamed_9("3.\"?"));
        }
        enumeration = this.cfr_renamed_2421.cfr_renamed_2434();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            if (hashtable.get(string) != null) continue;
            hashtable.put(string, "key");
        }
        return hashtable.size();
    }

    @Override
    public void engineStore(OutputStream arg0, char[] arg1) throws IOException {
        this.cfr_renamed_2435(arg0, arg1, false);
    }

    @Override
    public boolean engineIsCertificateEntry(String arg0) {
        return this.cfr_renamed_2414.cfr_renamed_1600(arg0) != null && this.cfr_renamed_2421.cfr_renamed_1600(arg0) == null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_2436(String arg0, Key arg1, sprfbe arg2, char[] arg3) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(arg3);
        try {
            Cipher cipher;
            String string = arg0;
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(string, cfr_renamed_3);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arg2.cfr_renamed_1205(), arg2.cfr_renamed_1490().intValue());
            Cipher cipher2 = cipher = Cipher.getInstance(string, cfr_renamed_3);
            cipher2.init(3, (Key)secretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipher2.wrap(arg1);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("?=9 *13*4e?+97#5.,4\"z!;1;ewe")).append(exception.toString()).toString());
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprtcc(Provider provider, sprtzd sprtzd2, sprtzd sprtzd3) {
        void arg1;
        sprtcc sprtcc2 = this;
        sprtcc sprtcc3 = this;
        this.cfr_renamed_2421 = new sprwub(null);
        sprtcc3.cfr_renamed_2 = new Hashtable();
        this.cfr_renamed_2414 = new sprwub(null);
        this.cfr_renamed_312 = new Hashtable();
        this.cfr_renamed_2419 = new Hashtable();
        this.cfr_renamed_2425 = new SecureRandom();
        sprtcc2.cfr_renamed_2420 = arg1;
        sprtcc2.cfr_renamed_2427 = sprtzd3;
        try {
            void arg0;
            if (arg0 != null) {
                this.cfr_renamed_4 = CertificateFactory.getInstance(sprqzo.cfr_renamed_9("\u0013~~`r"), (Provider)arg0);
                return;
            }
            this.cfr_renamed_4 = CertificateFactory.getInstance(spraiaa.cfr_renamed_9("\u001dtpj|"));
            return;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("3*>l$k395*$.p(59$k6*3??9)k}k")).append(exception.toString()).toString());
        }
    }

    public Enumeration engineAliases() {
        Enumeration enumeration;
        Hashtable<Object, String> hashtable = new Hashtable<Object, String>();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2414.cfr_renamed_2434();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            hashtable.put(enumeration3.nextElement(), spraiaa.cfr_renamed_9("9 (1"));
        }
        enumeration = this.cfr_renamed_2421.cfr_renamed_2434();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            if (hashtable.get(string) != null) continue;
            hashtable.put(string, "key");
        }
        return hashtable.keys();
    }

    @Override
    public void engineDeleteEntry(String arg0) throws KeyStoreException {
        Key key = (Key)this.cfr_renamed_2421.cfr_renamed_2437(arg0);
        Certificate certificate = (Certificate)this.cfr_renamed_2414.cfr_renamed_2437(arg0);
        if (certificate != null) {
            this.cfr_renamed_312.remove(new sprgdc(this, certificate.getPublicKey()));
        }
        if (key != null) {
            String string = (String)this.cfr_renamed_2.remove(arg0);
            if (string != null) {
                certificate = (Certificate)this.cfr_renamed_2419.remove(string);
            }
            if (certificate != null) {
                this.cfr_renamed_312.remove(new sprgdc(this, certificate.getPublicKey()));
            }
        }
    }

    @Override
    public Certificate engineGetCertificate(String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqzo.cfr_renamed_9(">><'p*<\"18p;18#.4k$$p,5?\u0013.\"?9-9(1?5e"));
        }
        Certificate certificate = (Certificate)this.cfr_renamed_2414.cfr_renamed_1600(arg0);
        if (certificate == null) {
            String string = (String)this.cfr_renamed_2.get(arg0);
            if (string != null) {
                certificate = (Certificate)this.cfr_renamed_2419.get(string);
                return certificate;
            }
            certificate = (Certificate)this.cfr_renamed_2419.get(arg0);
        }
        return certificate;
    }

    private /* synthetic */ void cfr_renamed_2435(OutputStream arg0, char[] arg1, boolean arg2) throws IOException {
        sprage sprage2;
        Object object;
        Object object2;
        sprkra sprkra2;
        Object object3;
        Object object4;
        Enumeration enumeration;
        Object object5;
        Object object6;
        sproce[] sproceArray;
        Object object7;
        Object object8;
        Object object9;
        sprije sprije2;
        Object object10;
        Object object11;
        Object object12;
        Object object13;
        byte[] byArray;
        Enumeration enumeration2;
        if (arg1 == null) {
            throw new NullPointerException(spraiaa.cfr_renamed_9("\u0014*z5;6)257>e)0*56,?!z#57z\u0015\u0011\u0006\tfkwz\u000e?<\t157?k"));
        }
        sprlre sprlre2 = new sprlre();
        Enumeration enumeration3 = enumeration2 = this.cfr_renamed_2421.cfr_renamed_2434();
        while (enumeration3.hasMoreElements()) {
            Object object14;
            byArray = new byte[20];
            this.cfr_renamed_2425.nextBytes(byArray);
            object13 = (String)enumeration2.nextElement();
            object12 = (PrivateKey)this.cfr_renamed_2421.cfr_renamed_1600((String)object13);
            object11 = new sprfbe(byArray, 1024);
            sprtcc sprtcc2 = this;
            object10 = sprtcc2.cfr_renamed_2436(sprtcc2.cfr_renamed_2420.cfr_renamed_19(), (Key)object12, (sprfbe)object11, arg1);
            sprije2 = new sprije(this.cfr_renamed_2420, ((sprfbe)object11).cfr_renamed_119());
            object9 = new sprbbe(sprije2, (byte[])object10);
            boolean bl = false;
            object8 = new sprlre();
            if (object12 instanceof sprwb) {
                object7 = (sprwb)object12;
                object14 = (sprmne)object7.cfr_renamed_1510(cfr_renamed_1456);
                if (object14 == null || !((sprmne)object14).cfr_renamed_314().equals(object13)) {
                    object7.cfr_renamed_2152(cfr_renamed_1456, new sprmne((String)object13));
                }
                if (object7.cfr_renamed_1510(cfr_renamed_135) == null) {
                    sproceArray = this.engineGetCertificate((String)object13);
                    object7.cfr_renamed_2152(cfr_renamed_135, this.cfr_renamed_2433(sproceArray.getPublicKey()));
                }
                Object object15 = object7.cfr_renamed_2158();
                while (object15.hasMoreElements()) {
                    object6 = (sprtzd)sproceArray.nextElement();
                    object5 = new sprlre();
                    object15 = sproceArray;
                    ((sprlre)object5).cfr_renamed_49((spra)object6);
                    ((sprlre)object5).cfr_renamed_49(new sprcwe(object7.cfr_renamed_1510((sprtzd)object6)));
                    bl = true;
                    ((sprlre)object8).cfr_renamed_49(new sprpse((sprlre)object5));
                }
            }
            if (!bl) {
                object7 = new sprlre();
                object14 = this.engineGetCertificate((String)object13);
                Object object16 = object8;
                Object object17 = object7;
                ((sprlre)object17).cfr_renamed_49(cfr_renamed_135);
                ((sprlre)object17).cfr_renamed_49(new sprcwe(this.cfr_renamed_2433(((Certificate)object14).getPublicKey())));
                ((sprlre)object16).cfr_renamed_49(new sprpse((sprlre)object7));
                object7 = new sprlre();
                ((sprlre)object7).cfr_renamed_49(cfr_renamed_1456);
                ((sprlre)object7).cfr_renamed_49(new sprcwe(new sprmne((String)object13)));
                ((sprlre)object16).cfr_renamed_49(new sprpse((sprlre)object7));
            }
            object7 = new spraje(cfr_renamed_614, ((sprbbe)object9).cfr_renamed_119(), new sprcwe((sprlre)object8));
            enumeration3 = enumeration2;
            sprlre2.cfr_renamed_49((spra)object7);
        }
        byArray = new sprpse(sprlre2).cfr_renamed_104("DER");
        object13 = new sprnle(byArray);
        object12 = new byte[20];
        this.cfr_renamed_2425.nextBytes((byte[])object12);
        object11 = new sprlre();
        object10 = new sprfbe((byte[])object12, 1024);
        sprtcc sprtcc3 = this;
        sprije2 = new sprije(sprtcc3.cfr_renamed_2427, ((sprfbe)object10).cfr_renamed_119());
        object9 = new Hashtable();
        Enumeration enumeration4 = enumeration = sprtcc3.cfr_renamed_2421.cfr_renamed_2434();
        while (enumeration4.hasMoreElements()) {
            try {
                object8 = (String)enumeration.nextElement();
                object7 = this.engineGetCertificate((String)object8);
                boolean bl = false;
                sproceArray = new sprtke(cfr_renamed_1454, new sprlqe(((Certificate)object7).getEncoded()));
                object6 = new sprlre();
                if (object7 instanceof sprwb) {
                    object5 = (sprwb)object7;
                    object4 = (sprmne)object5.cfr_renamed_1510(cfr_renamed_1456);
                    if (object4 == null || !((sprmne)object4).cfr_renamed_314().equals(object8)) {
                        object5.cfr_renamed_2152(cfr_renamed_1456, new sprmne((String)object8));
                    }
                    if (object5.cfr_renamed_1510(cfr_renamed_135) == null) {
                        object5.cfr_renamed_2152(cfr_renamed_135, this.cfr_renamed_2433(((Certificate)object7).getPublicKey()));
                    }
                    Enumeration enumeration5 = object5.cfr_renamed_2158();
                    while (enumeration5.hasMoreElements()) {
                        sprkra2 = (sprtzd)object3.nextElement();
                        object2 = new sprlre();
                        enumeration5 = object3;
                        sprlre sprlre3 = object2;
                        sprlre3.cfr_renamed_49(sprkra2);
                        sprlre3.cfr_renamed_49(new sprcwe(object5.cfr_renamed_1510((sprtzd)sprkra2)));
                        ((sprlre)object6).cfr_renamed_49(new sprpse((sprlre)object2));
                        bl = true;
                    }
                }
                if (!bl) {
                    object5 = new sprlre();
                    sprlre sprlre4 = object6;
                    Object object18 = object5;
                    ((sprlre)object18).cfr_renamed_49(cfr_renamed_135);
                    ((sprlre)object18).cfr_renamed_49(new sprcwe(this.cfr_renamed_2433(((Certificate)object7).getPublicKey())));
                    sprlre4.cfr_renamed_49(new sprpse((sprlre)object5));
                    object5 = new sprlre();
                    ((sprlre)object5).cfr_renamed_49(cfr_renamed_1456);
                    ((sprlre)object5).cfr_renamed_49(new sprcwe(new sprmne((String)object8)));
                    sprlre4.cfr_renamed_49(new sprpse((sprlre)object5));
                }
                object5 = new spraje(cfr_renamed_114, sproceArray.cfr_renamed_119(), new sprcwe((sprlre)object6));
                ((sprlre)object11).cfr_renamed_49((spra)object5);
                ((Hashtable)object9).put(object7, object7);
                enumeration4 = enumeration;
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IOException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("\u00159\"$\"k5%3$4\">,p(59$\"6\"3*$.jk")).append(certificateEncodingException.toString()).toString());
            }
        }
        Enumeration enumeration6 = enumeration = this.cfr_renamed_2414.cfr_renamed_2434();
        while (enumeration6.hasMoreElements()) {
            boolean bl;
            block33: {
                object8 = (String)enumeration.nextElement();
                object7 = (Certificate)this.cfr_renamed_2414.cfr_renamed_1600((String)object8);
                bl = false;
                if (this.cfr_renamed_2421.cfr_renamed_1600((String)object8) == null) break block33;
                enumeration6 = enumeration;
                continue;
            }
            try {
                sproceArray = new sprtke(cfr_renamed_1454, new sprlqe(((Certificate)object7).getEncoded()));
                object6 = new sprlre();
                if (object7 instanceof sprwb) {
                    object5 = (sprwb)object7;
                    object4 = (sprmne)object5.cfr_renamed_1510(cfr_renamed_1456);
                    if (object4 == null || !((sprmne)object4).cfr_renamed_314().equals(object8)) {
                        object5.cfr_renamed_2152(cfr_renamed_1456, new sprmne((String)object8));
                    }
                    Object object19 = object5.cfr_renamed_2158();
                    while (object19.hasMoreElements()) {
                        sprkra2 = (sprtzd)object3.nextElement();
                        if (((sprvva)sprkra2).equals(sprm.cfr_renamed_135)) {
                            object19 = object3;
                            continue;
                        }
                        object2 = new sprlre();
                        object19 = object3;
                        sprlre sprlre5 = object2;
                        sprlre5.cfr_renamed_49(sprkra2);
                        sprlre5.cfr_renamed_49(new sprcwe(object5.cfr_renamed_1510((sprtzd)sprkra2)));
                        ((sprlre)object6).cfr_renamed_49(new sprpse((sprlre)object2));
                        bl = true;
                    }
                }
                if (!bl) {
                    Object object20 = object5 = new sprlre();
                    ((sprlre)object20).cfr_renamed_49(cfr_renamed_1456);
                    ((sprlre)object20).cfr_renamed_49(new sprcwe(new sprmne((String)object8)));
                    ((sprlre)object6).cfr_renamed_49(new sprpse((sprlre)object5));
                }
                object5 = new spraje(cfr_renamed_114, sproceArray.cfr_renamed_119(), new sprcwe((sprlre)object6));
                ((sprlre)object11).cfr_renamed_49((spra)object5);
                ((Hashtable)object9).put(object7, object7);
                enumeration6 = enumeration;
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IOException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("\u001f7(*(e?+9*>,4\"z&?7.,<,9$. `e")).append(certificateEncodingException.toString()).toString());
            }
        }
        Enumeration enumeration7 = enumeration = this.cfr_renamed_312.keys();
        while (enumeration7.hasMoreElements()) {
            block34: {
                object8 = (sprgdc)enumeration.nextElement();
                object7 = (Certificate)this.cfr_renamed_312.get(object8);
                if (((Hashtable)object9).get(object7) == null) break block34;
                enumeration7 = enumeration;
                continue;
            }
            try {
                sprtke sprtke2 = new sprtke(cfr_renamed_1454, new sprlqe(((Certificate)object7).getEncoded()));
                sproceArray = new sprlre();
                if (object7 instanceof sprwb) {
                    object6 = (sprwb)object7;
                    Object object21 = object6.cfr_renamed_2158();
                    while (object21.hasMoreElements()) {
                        object4 = (sprtzd)object5.nextElement();
                        if (((sprvva)object4).equals(sprm.cfr_renamed_135)) {
                            object21 = object5;
                            continue;
                        }
                        object3 = new sprlre();
                        object21 = object5;
                        Object object22 = object3;
                        ((sprlre)object22).cfr_renamed_49((spra)object4);
                        ((sprlre)object22).cfr_renamed_49(new sprcwe(object6.cfr_renamed_1510((sprtzd)object4)));
                        sproceArray.cfr_renamed_49(new sprpse((sprlre)object3));
                    }
                }
                object6 = new spraje(cfr_renamed_114, sprtke2.cfr_renamed_119(), new sprcwe((sprlre)sproceArray));
                ((sprlre)object11).cfr_renamed_49((spra)object6);
                enumeration7 = enumeration;
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IOException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("\u00159\"$\"k5%3$4\">,p(59$\"6\"3*$.jk")).append(certificateEncodingException.toString()).toString());
            }
        }
        object8 = new sprpse((sprlre)object11).cfr_renamed_104("DER");
        object7 = this.cfr_renamed_2438(true, sprije2, arg1, false, (byte[])object8);
        sprvbe sprvbe2 = new sprvbe(cfr_renamed_1223, sprije2, new sprnle((byte[])object7));
        sproce[] sproceArray2 = new sproce[2];
        sproceArray2[0] = new sproce(cfr_renamed_1223, (spra)object13);
        sproceArray2[1] = new sproce(cfr_renamed_1449, sprvbe2.cfr_renamed_119());
        sproceArray = sproceArray2;
        object6 = new sprzie(sproceArray);
        object5 = new ByteArrayOutputStream();
        ((sprpve)(arg2 ? (object4 = new sprpve((OutputStream)object5)) : (object4 = new sprwoe((OutputStream)object5)))).cfr_renamed_2149((spra)object6);
        object3 = ((ByteArrayOutputStream)object5).toByteArray();
        sprkra2 = new sproce(cfr_renamed_1223, new sprnle((byte[])object3));
        object2 = new byte[20];
        int n = 1024;
        this.cfr_renamed_2425.nextBytes((byte[])object2);
        byte[] byArray2 = ((sprxue)((sproce)sprkra2).cfr_renamed_480()).cfr_renamed_186();
        try {
            object = sprtcc.cfr_renamed_2439(cfr_renamed_722, (byte[])object2, n, arg1, false, byArray2);
            sprije sprije3 = new sprije(cfr_renamed_722, sprume.cfr_renamed_3);
            sprnje sprnje2 = new sprnje(sprije3, (byte[])object);
            sprage2 = new sprage(sprnje2, (byte[])object2, n);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("?7(*(e9*46.7/&.,4\"z\b\u001b\u0006`e")).append(exception.toString()).toString());
        }
        object = new sprgde((sproce)sprkra2, sprage2);
        ((sprpve)(arg2 ? (object4 = new sprpve(arg0)) : (object4 = new sprwoe(arg0)))).cfr_renamed_2149((spra)object);
    }

    static {
        cfr_renamed_3 = new sprbrb();
        cfr_renamed_2424 = new sprxac();
    }

    @Override
    public Key engineGetKey(String arg0, char[] arg1) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqzo.cfr_renamed_9(">><'p*<\"18p;18#.4k$$p,5?\u001b.)e"));
        }
        return (Key)this.cfr_renamed_2421.cfr_renamed_1600(arg0);
    }

    public PrivateKey cfr_renamed_2440(sprije arg0, byte[] arg1, char[] arg2, boolean arg3) throws IOException {
        sprtzd sprtzd2;
        block4: {
            sprtzd2 = arg0.cfr_renamed_593();
            try {
                Cipher cipher;
                if (!sprtzd2.cfr_renamed_1493(sprm.cfr_renamed_580)) break block4;
                sprfbe sprfbe2 = sprfbe.cfr_renamed_23(arg0.cfr_renamed_284());
                PBEKeySpec pBEKeySpec = new PBEKeySpec(arg2);
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(sprtzd2.cfr_renamed_19(), cfr_renamed_3);
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(sprfbe2.cfr_renamed_1205(), sprfbe2.cfr_renamed_1490().intValue());
                SecretKey secretKey = secretKeyFactory.generateSecret(pBEKeySpec);
                ((sprmpb)secretKey).cfr_renamed_1502(arg3);
                Cipher cipher2 = cipher = Cipher.getInstance(sprtzd2.cfr_renamed_19(), cfr_renamed_3);
                cipher2.init(4, (Key)secretKey, pBEParameterSpec);
                return (PrivateKey)cipher2.unwrap(arg1, "", 2);
            }
            catch (Exception exception) {
                throw new IOException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9(" \"&?5.,5+z042($*53+=e*733;1?e1 #ewe")).append(exception.toString()).toString());
            }
        }
        if (sprtzd2.equals(sprm.cfr_renamed_1494)) {
            Cipher cipher = this.cfr_renamed_2428(4, arg2, arg0);
            return (PrivateKey)cipher.unwrap(arg1, "", 2);
        }
        throw new IOException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9(".((5;$\"?%p>><\"* ;9%7k 99=1?5k;.)k}k3*>%??p95(?,>\"#.jk")).append(sprtzd2).toString());
    }

    @Override
    public void engineSetKeyEntry(String arg0, Key arg1, char[] arg2, Certificate[] arg3) throws KeyStoreException {
        if (!(arg1 instanceof PrivateKey)) {
            throw new KeyStoreException(spraiaa.cfr_renamed_9("\u0015\u0011\u0006\tthe>*?6z+51z6/5**(1z+5+w\u0015(,,$. \u0011 #6"));
        }
        if (arg1 instanceof PrivateKey && arg3 == null) {
            throw new KeyStoreException(sprqzo.cfr_renamed_9(">$p(59$\"6\"3*$.p(8*9%p-?9p;\"\"&*$.p 52"));
        }
        if (this.cfr_renamed_2421.cfr_renamed_1600(arg0) != null) {
            this.engineDeleteEntry(arg0);
        }
        this.cfr_renamed_2421.cfr_renamed_2441(arg0, arg1);
        if (arg3 != null) {
            int n;
            this.cfr_renamed_2414.cfr_renamed_2441(arg0, arg3[0]);
            int n2 = n = 0;
            while (n2 != arg3.length) {
                this.cfr_renamed_312.put(new sprgdc(this, arg3[n].getPublicKey()), arg3[n++]);
                n2 = n;
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Certificate[] engineGetCertificateChain(String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(spraiaa.cfr_renamed_9("+/)6e;)3$)e*$)6?!z15e= .\u0006?7.,<,9$. \u0019-;,4k"));
        }
        if (!this.engineIsKeyEntry(arg0)) {
            return null;
        }
        Certificate certificate = this.engineGetCertificate(arg0);
        if (certificate == null) {
            return null;
        }
        Vector<Certificate> vector = new Vector<Certificate>();
        while (true) {
            Vector<Certificate> vector2;
            Certificate certificate2;
            block14: {
                block16: {
                    Object object;
                    Object object2;
                    Certificate[] certificateArray;
                    block17: {
                        int n;
                        block15: {
                            Object object3;
                            if (certificate == null) break block15;
                            certificateArray = (Certificate[])certificate;
                            certificate2 = null;
                            byte[] byArray = certificateArray.getExtensionValue(sprtie.cfr_renamed_96.cfr_renamed_19());
                            if (byArray != null) {
                                try {
                                    object2 = new sprgle(byArray);
                                    object3 = ((sprxue)((sprgle)object2).cfr_renamed_24()).cfr_renamed_186();
                                    object2 = new sprgle((byte[])object3);
                                    object = sprxqa.cfr_renamed_23(((sprgle)object2).cfr_renamed_24());
                                    if (((sprxqa)object).cfr_renamed_327() != null) {
                                        certificate2 = (Certificate)this.cfr_renamed_312.get(new sprgdc(this, ((sprxqa)object).cfr_renamed_327()));
                                    }
                                }
                                catch (IOException iOException) {
                                    throw new RuntimeException(iOException.toString());
                                }
                            }
                            if (certificate2 != null || (object2 = certificateArray.getIssuerDN()).equals(object3 = certificateArray.getSubjectDN())) break block16;
                            object = this.cfr_renamed_312.keys();
                            break block17;
                        }
                        certificateArray = new Certificate[vector.size()];
                        int n2 = n = 0;
                        while (true) {
                            if (n2 == certificateArray.length) {
                                return certificateArray;
                            }
                            int n3 = n++;
                            certificateArray[n3] = (Certificate)vector.elementAt(n3);
                            n2 = n;
                        }
                    }
                    while (object.hasMoreElements()) {
                        X509Certificate x509Certificate = (X509Certificate)this.cfr_renamed_312.get(object.nextElement());
                        if (!((Object)x509Certificate.getSubjectDN()).equals(object2)) continue;
                        try {
                            certificateArray.verify(x509Certificate.getPublicKey());
                            certificate2 = x509Certificate;
                            vector2 = vector;
                            break block14;
                        }
                        catch (Exception exception) {
                        }
                    }
                }
                vector2 = vector;
            }
            vector2.addElement(certificate);
            if (certificate2 != certificate) {
                certificate = certificate2;
                continue;
            }
            certificate = null;
        }
    }

    @Override
    public Date engineGetCreationDate(String arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprqzo.cfr_renamed_9("*<\"18pvmk>><'"));
        }
        if (this.cfr_renamed_2421.cfr_renamed_1600(arg0) == null && this.cfr_renamed_2414.cfr_renamed_1600(arg0) == null) {
            return null;
        }
        return new Date();
    }

    private static /* synthetic */ byte[] cfr_renamed_2439(sprtzd arg0, byte[] arg1, int arg2, char[] arg3, boolean arg4, byte[] arg5) throws Exception {
        Mac mac;
        SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(arg0.cfr_renamed_19(), cfr_renamed_3);
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arg1, arg2);
        PBEKeySpec pBEKeySpec = new PBEKeySpec(arg3);
        sprmpb sprmpb2 = (sprmpb)secretKeyFactory.generateSecret(pBEKeySpec);
        sprmpb2.cfr_renamed_1502(arg4);
        Mac mac2 = mac = Mac.getInstance(arg0.cfr_renamed_19(), cfr_renamed_3);
        mac2.init(sprmpb2, pBEParameterSpec);
        mac2.update(arg5);
        return mac2.doFinal();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineLoad(InputStream arg0, char[] arg1) throws IOException {
        int n;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        boolean bl;
        Vector<Object> vector;
        block59: {
            int n2;
            sprkra sprkra2;
            if (arg0 == null) {
                return;
            }
            if (arg1 == null) {
                throw new NullPointerException(spraiaa.cfr_renamed_9("\u0014*z5;6)257>e)0*56,?!z#57z\u0015\u0011\u0006\tfkwz\u000e?<\t157?k"));
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(arg0);
            bufferedInputStream.mark(10);
            if (bufferedInputStream.read() != 48) {
                throw new IOException(sprqzo.cfr_renamed_9("#?\".1&p/?.#k>$$k\". 9585%$k1k\u0000\u0000\u0013\u0018ayp 52p8$$\"."));
            }
            bufferedInputStream.reset();
            sprgle sprgle2 = new sprgle(bufferedInputStream);
            sprgde sprgde2 = sprgde.cfr_renamed_23((sprbne)sprgle2.cfr_renamed_24());
            sproce sproce2 = sprgde2.cfr_renamed_1475();
            vector = new Vector<Object>();
            bl = false;
            boolean bl2 = false;
            if (sprgde2.cfr_renamed_1470() != null) {
                sprkra2 = sprgde2.cfr_renamed_1470();
                object9 = sprkra2.cfr_renamed_1472();
                sprije sprije2 = ((sprnje)object9).cfr_renamed_1473();
                object8 = sprkra2.cfr_renamed_1477();
                int n3 = sprkra2.cfr_renamed_1478().intValue();
                byte[] byArray = ((sprxue)sproce2.cfr_renamed_480()).cfr_renamed_186();
                try {
                    object7 = sprtcc.cfr_renamed_2439(sprije2.cfr_renamed_593(), (byte[])object8, n3, arg1, false, byArray);
                    object6 = ((sprnje)object9).cfr_renamed_580();
                    if (!sprzra.cfr_renamed_559(object7, (byte[])object6)) {
                        if (arg1.length > 0) {
                            throw new IOException(spraiaa.cfr_renamed_9("\n\u000e\u0019\u0016kwz.?<z6.*( z(;&z,43;)3!zhz2(*4\"z5;6)257>e57z&57(0*1?!z#3)?k"));
                        }
                        object7 = sprtcc.cfr_renamed_2439(sprije2.cfr_renamed_593(), (byte[])object8, n3, arg1, true, byArray);
                        if (!sprzra.cfr_renamed_559(object7, (byte[])object6)) {
                            throw new IOException(sprqzo.cfr_renamed_9("\u0000\u0000\u0013\u0018ayp 52p8$$\".p&1(p\">=1'9/pfp<\"$>,p;18#<?94k?9p(?9\"> ?5/p-9'5e"));
                        }
                        bl2 = true;
                    }
                }
                catch (IOException iOException) {
                    throw iOException;
                }
                catch (Exception exception) {
                    throw new IOException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("?7(*(e9*46.7/&.,4\"z\b\u001b\u0006`e")).append(exception.toString()).toString());
                }
            }
            sprtcc sprtcc2 = this;
            sprtcc2.cfr_renamed_2421 = new sprwub(null);
            sprtcc sprtcc3 = this;
            sprtcc2.cfr_renamed_2 = new Hashtable();
            if (!sproce2.cfr_renamed_696().equals(cfr_renamed_1223)) break block59;
            sprgle2 = new sprgle(((sprxue)sproce2.cfr_renamed_480()).cfr_renamed_186());
            sprkra2 = sprzie.cfr_renamed_23(sprgle2.cfr_renamed_24());
            object9 = ((sprzie)sprkra2).cfr_renamed_2442();
            int n4 = n2 = 0;
            while (n4 != ((sproce[])object9).length) {
                block64: {
                    spra spra2;
                    sprvva sprvva2;
                    sprvva sprvva3;
                    Object object10;
                    Object object11;
                    int n5;
                    int n6;
                    sprbne sprbne2;
                    block63: {
                        int n7;
                        int n8;
                        Object object12;
                        block61: {
                            block62: {
                                block60: {
                                    if (!object9[n2].cfr_renamed_696().equals(cfr_renamed_1223)) break block60;
                                    sprgle sprgle3 = new sprgle(((sprxue)object9[n2].cfr_renamed_480()).cfr_renamed_186());
                                    object8 = sprgle3;
                                    object12 = (sprbne)sprgle3.cfr_renamed_24();
                                    n7 = n8 = 0;
                                    break block61;
                                }
                                if (!object9[n2].cfr_renamed_696().equals(cfr_renamed_1449)) break block62;
                                object8 = sprvbe.cfr_renamed_23(object9[n2].cfr_renamed_480());
                                byte[] byArray = this.cfr_renamed_2438(false, ((sprvbe)object8).cfr_renamed_1445(), arg1, bl2, ((sprvbe)object8).cfr_renamed_480().cfr_renamed_186());
                                object12 = byArray;
                                sprbne2 = (sprbne)sprvva.cfr_renamed_184(byArray);
                                n5 = n6 = 0;
                                break block63;
                            }
                            System.out.println(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("53$91k")).append(object9[n2].cfr_renamed_696().cfr_renamed_19()).toString());
                            System.out.println(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("?=.7;e")).append(sprcje.cfr_renamed_2138(((sproce)object9[n2]).cfr_renamed_480())).toString());
                            break block64;
                        }
                        while (n7 != ((sprbne)object12).cfr_renamed_84()) {
                            block57: {
                                block66: {
                                    block67: {
                                        block65: {
                                            spraje spraje2 = spraje.cfr_renamed_23(((sprbne)object12).cfr_renamed_85(n8));
                                            object7 = spraje2;
                                            if (!spraje2.cfr_renamed_1457().equals(cfr_renamed_614)) break block65;
                                            object6 = sprbbe.cfr_renamed_23(object7.cfr_renamed_1458());
                                            object5 = this.cfr_renamed_2440(((sprbbe)object6).cfr_renamed_1445(), ((sprbbe)object6).cfr_renamed_1446(), arg1, bl2);
                                            object4 = (sprwb)object5;
                                            object3 = null;
                                            object2 = null;
                                            if (object7.cfr_renamed_1461() == null) break block66;
                                            object = object7.cfr_renamed_1461().cfr_renamed_329();
                                            break block67;
                                        }
                                        if (object7.cfr_renamed_1457().equals(cfr_renamed_114)) {
                                            vector.addElement(object7);
                                            break block57;
                                        } else {
                                            System.out.println(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("53$91k9%p/1?1k")).append(object7.cfr_renamed_1457()).toString());
                                            System.out.println(sprcje.cfr_renamed_2138(object7));
                                        }
                                        break block57;
                                    }
                                    while (object.hasMoreElements()) {
                                        object11 = (sprbne)object.nextElement();
                                        object10 = (sprtzd)((sprbne)object11).cfr_renamed_85(0);
                                        sprvva3 = (sprere)((sprbne)object11).cfr_renamed_85(1);
                                        sprvva2 = null;
                                        if (((sprere)sprvva3).cfr_renamed_84() > 0) {
                                            sprvva2 = (sprvva)((sprere)sprvva3).cfr_renamed_85(0);
                                            spra2 = object4.cfr_renamed_1510((sprtzd)object10);
                                            if (spra2 != null) {
                                                if (!spra2.cfr_renamed_119().equals(sprvva2)) {
                                                    throw new IOException(sprqzo.cfr_renamed_9("1?$.=;$k$$p*4/p.(\"#?9%7k1?$99)%?5k'\"$#p/9-6.\".>?p=1'%."));
                                                }
                                            } else {
                                                object4.cfr_renamed_2152((sprtzd)object10, sprvva2);
                                            }
                                        }
                                        if (((sprvva)object10).equals(cfr_renamed_1456)) {
                                            object3 = ((sprmne)sprvva2).cfr_renamed_314();
                                            this.cfr_renamed_2421.cfr_renamed_2441((String)object3, object5);
                                            continue;
                                        }
                                        if (!((sprvva)object10).equals(cfr_renamed_135)) continue;
                                        object2 = (sprxue)sprvva2;
                                    }
                                }
                                if (object2 != null) {
                                    object = new String(sprmma.cfr_renamed_485(((sprxue)object2).cfr_renamed_186()));
                                    sprtcc sprtcc4 = this;
                                    if (object3 == null) {
                                        sprtcc4.cfr_renamed_2421.cfr_renamed_2441((String)object, object5);
                                    } else {
                                        sprtcc4.cfr_renamed_2.put(object3, object);
                                    }
                                } else {
                                    bl = true;
                                    this.cfr_renamed_2421.cfr_renamed_2441(spraiaa.cfr_renamed_9("/+7$(.?!"), object5);
                                }
                            }
                            n7 = ++n8;
                        }
                        break block64;
                    }
                    while (n5 != sprbne2.cfr_renamed_84()) {
                        block58: {
                            spra spra3;
                            block72: {
                                block70: {
                                    block71: {
                                        block69: {
                                            block68: {
                                                object6 = spraje.cfr_renamed_23(sprbne2.cfr_renamed_85(n6));
                                                if (!((spraje)object6).cfr_renamed_1457().equals(cfr_renamed_114)) break block68;
                                                vector.addElement(object6);
                                                break block58;
                                            }
                                            if (!((spraje)object6).cfr_renamed_1457().equals(cfr_renamed_614)) break block69;
                                            object5 = sprbbe.cfr_renamed_23(((spraje)object6).cfr_renamed_1458());
                                            object4 = this.cfr_renamed_2440(((sprbbe)object5).cfr_renamed_1445(), ((sprbbe)object5).cfr_renamed_1446(), arg1, bl2);
                                            object3 = (sprwb)object4;
                                            object2 = null;
                                            object = null;
                                            object11 = ((spraje)object6).cfr_renamed_1461().cfr_renamed_329();
                                            break block70;
                                        }
                                        if (!((spraje)object6).cfr_renamed_1457().equals(cfr_renamed_1328)) break block71;
                                        object5 = sprmke.cfr_renamed_23(((spraje)object6).cfr_renamed_1458());
                                        object4 = sprbrb.cfr_renamed_1253((sprmke)object5);
                                        object3 = (sprwb)object4;
                                        object2 = null;
                                        object = null;
                                        object11 = ((spraje)object6).cfr_renamed_1461().cfr_renamed_329();
                                        break block72;
                                    }
                                    System.out.println(new StringBuilder().insert(0, spraiaa.cfr_renamed_9(" \"1($z,4e?+97#5. >\u0001;1;e")).append(((spraje)object6).cfr_renamed_1457()).toString());
                                    System.out.println(sprcje.cfr_renamed_2138(object6));
                                    break block58;
                                }
                                while (object11.hasMoreElements()) {
                                    object10 = (sprbne)object11.nextElement();
                                    sprvva3 = (sprtzd)((sprbne)object10).cfr_renamed_85(0);
                                    sprvva2 = (sprere)((sprbne)object10).cfr_renamed_85(1);
                                    spra2 = null;
                                    if (((sprere)sprvva2).cfr_renamed_84() > 0) {
                                        spra2 = (sprvva)((sprere)sprvva2).cfr_renamed_85(0);
                                        spra3 = object3.cfr_renamed_1510((sprtzd)sprvva3);
                                        if (spra3 != null) {
                                            if (!spra3.cfr_renamed_119().equals(spra2)) {
                                                throw new IOException(spraiaa.cfr_renamed_9(";1. 75.e.*z$>!z \",)13+=e;1.73'/1?e-,.-z!3#< ( 41z3;)/ "));
                                            }
                                        } else {
                                            object3.cfr_renamed_2152((sprtzd)sprvva3, spra2);
                                        }
                                    }
                                    if (sprvva3.equals(cfr_renamed_1456)) {
                                        object2 = ((sprmne)spra2).cfr_renamed_314();
                                        this.cfr_renamed_2421.cfr_renamed_2441((String)object2, object4);
                                        continue;
                                    }
                                    if (!sprvva3.equals(cfr_renamed_135)) continue;
                                    object = (sprxue)spra2;
                                }
                                object10 = new String(sprmma.cfr_renamed_485(((sprxue)object).cfr_renamed_186()));
                                sprtcc sprtcc5 = this;
                                if (object2 == null) {
                                    sprtcc5.cfr_renamed_2421.cfr_renamed_2441((String)object10, object4);
                                    break block58;
                                } else {
                                    sprtcc5.cfr_renamed_2.put(object2, object10);
                                }
                                break block58;
                            }
                            while (object11.hasMoreElements()) {
                                object10 = sprbne.cfr_renamed_23(object11.nextElement());
                                sprvva3 = sprtzd.cfr_renamed_23(((sprbne)object10).cfr_renamed_85(0));
                                sprvva2 = sprere.cfr_renamed_23(((sprbne)object10).cfr_renamed_85(1));
                                spra2 = null;
                                if (((sprere)sprvva2).cfr_renamed_84() <= 0) continue;
                                spra2 = (sprvva)((sprere)sprvva2).cfr_renamed_85(0);
                                spra3 = object3.cfr_renamed_1510((sprtzd)sprvva3);
                                if (spra3 != null) {
                                    if (!spra3.cfr_renamed_119().equals(spra2)) {
                                        throw new IOException(sprqzo.cfr_renamed_9("1?$.=;$k$$p*4/p.(\"#?9%7k1?$99)%?5k'\"$#p/9-6.\".>?p=1'%."));
                                    }
                                } else {
                                    object3.cfr_renamed_2152((sprtzd)sprvva3, spra2);
                                }
                                if (sprvva3.equals(cfr_renamed_1456)) {
                                    object2 = ((sprmne)spra2).cfr_renamed_314();
                                    this.cfr_renamed_2421.cfr_renamed_2441((String)object2, object4);
                                    continue;
                                }
                                if (!sprvva3.equals(cfr_renamed_135)) continue;
                                object = (sprxue)spra2;
                            }
                            object10 = new String(sprmma.cfr_renamed_485(((sprxue)object).cfr_renamed_186()));
                            sprtcc sprtcc6 = this;
                            if (object2 == null) {
                                sprtcc6.cfr_renamed_2421.cfr_renamed_2441((String)object10, object4);
                            } else {
                                sprtcc6.cfr_renamed_2.put(object2, object10);
                            }
                        }
                        n5 = ++n6;
                    }
                }
                n4 = ++n2;
            }
        }
        sprtcc sprtcc7 = this;
        sprtcc7.cfr_renamed_2414 = new sprwub(null);
        sprtcc7.cfr_renamed_312 = new Hashtable();
        sprtcc7.cfr_renamed_2419 = new Hashtable();
        int n9 = n = 0;
        while (n9 != vector.size()) {
            Object object13;
            object9 = (spraje)vector.elementAt(n);
            sprtke sprtke2 = sprtke.cfr_renamed_23(((spraje)object9).cfr_renamed_1458());
            if (!sprtke2.cfr_renamed_2443().equals(cfr_renamed_1454)) {
                throw new RuntimeException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("\u0005%#> ;?9$.4k3.\"?9-9(1?5k$2 .jk")).append(sprtke2.cfr_renamed_2443()).toString());
            }
            try {
                object13 = new ByteArrayInputStream(((sprxue)sprtke2.cfr_renamed_1459()).cfr_renamed_186());
                object8 = this.cfr_renamed_4.generateCertificate((InputStream)object13);
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
            object13 = null;
            String string = null;
            if (((spraje)object9).cfr_renamed_1461() != null) {
                object7 = ((spraje)object9).cfr_renamed_1461().cfr_renamed_329();
                while (object7.hasMoreElements()) {
                    object6 = sprbne.cfr_renamed_23(object7.nextElement());
                    object5 = sprtzd.cfr_renamed_23(((sprbne)object6).cfr_renamed_85(0));
                    object4 = sprere.cfr_renamed_23(((sprbne)object6).cfr_renamed_85(1));
                    if (((sprere)object4).cfr_renamed_84() <= 0) continue;
                    object3 = (sprvva)((sprere)object4).cfr_renamed_85(0);
                    object2 = null;
                    if (object8 instanceof sprwb) {
                        object2 = (sprwb)object8;
                        object = object2.cfr_renamed_1510((sprtzd)object5);
                        if (object != null) {
                            if (!object.cfr_renamed_119().equals(object3)) {
                                throw new IOException(spraiaa.cfr_renamed_9(";1. 75.e.*z$>!z \",)13+=e;1.73'/1?e-,.-z!3#< ( 41z3;)/ "));
                            }
                        } else {
                            object2.cfr_renamed_2152((sprtzd)object5, (spra)object3);
                        }
                    }
                    if (((sprvva)object5).equals(cfr_renamed_1456)) {
                        string = ((sprmne)object3).cfr_renamed_314();
                        continue;
                    }
                    if (!((sprvva)object5).equals(cfr_renamed_135)) continue;
                    object13 = (sprxue)object3;
                }
            }
            this.cfr_renamed_312.put(new sprgdc(this, ((Certificate)object8).getPublicKey()), object8);
            if (bl) {
                if (this.cfr_renamed_2419.isEmpty()) {
                    object7 = new String(sprmma.cfr_renamed_485(this.cfr_renamed_2433(((Certificate)object8).getPublicKey()).cfr_renamed_327()));
                    this.cfr_renamed_2419.put(object7, object8);
                    this.cfr_renamed_2421.cfr_renamed_2441((String)object7, this.cfr_renamed_2421.cfr_renamed_2437(sprqzo.cfr_renamed_9("%%=*\" 5/")));
                }
            } else {
                if (object13 != null) {
                    object7 = new String(sprmma.cfr_renamed_485(((sprxue)object13).cfr_renamed_186()));
                    this.cfr_renamed_2419.put(object7, object8);
                }
                if (string != null) {
                    this.cfr_renamed_2414.cfr_renamed_2441(string, object8);
                }
            }
            n9 = ++n;
        }
        return;
    }

    @Override
    public void engineSetCertificateEntry(String arg0, Certificate arg1) throws KeyStoreException {
        if (this.cfr_renamed_2421.cfr_renamed_1600(arg0) != null) {
            throw new KeyStoreException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("\u00112 ( z,)e;e1 #e?+.7#e-,.-z12 z+;(?e")).append(arg0).append(".").toString());
        }
        sprtcc sprtcc2 = this;
        sprtcc2.cfr_renamed_2414.cfr_renamed_2441(arg0, arg1);
        sprtcc2.cfr_renamed_312.put(new sprgdc(this, arg1.getPublicKey()), arg1);
    }

    public static /* synthetic */ Provider cfr_renamed_2444() {
        return cfr_renamed_3;
    }

    @Override
    public String engineGetCertificateAlias(Certificate arg0) {
        String string;
        Certificate certificate;
        sprtcc sprtcc2 = this;
        Enumeration enumeration = sprtcc2.cfr_renamed_2414.cfr_renamed_2445();
        Enumeration enumeration2 = sprtcc2.cfr_renamed_2414.cfr_renamed_2434();
        while (enumeration.hasMoreElements()) {
            certificate = (Certificate)enumeration.nextElement();
            string = (String)enumeration2.nextElement();
            if (!certificate.equals(arg0)) continue;
            return string;
        }
        sprtcc sprtcc3 = this;
        enumeration = sprtcc3.cfr_renamed_2419.elements();
        enumeration2 = sprtcc3.cfr_renamed_2419.keys();
        while (enumeration.hasMoreElements()) {
            certificate = (Certificate)enumeration.nextElement();
            string = (String)enumeration2.nextElement();
            if (!certificate.equals(arg0)) continue;
            return string;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprrvca cfr_renamed_2433(PublicKey arg0) {
        try {
            sprdce sprdce2 = new sprdce((sprbne)sprvva.cfr_renamed_184(arg0.getEncoded()));
            return new sprrvca(sprtcc.cfr_renamed_2446(sprdce2));
        }
        catch (Exception exception) {
            throw new RuntimeException(sprqzo.cfr_renamed_9("59\"$\"k395*$\">,p 52"));
        }
    }

    @Override
    public boolean engineIsKeyEntry(String arg0) {
        return this.cfr_renamed_2421.cfr_renamed_1600(arg0) != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_2438(boolean arg0, sprije arg1, char[] arg2, boolean arg3, byte[] arg4) throws IOException {
        int n;
        sprtzd sprtzd2 = arg1.cfr_renamed_593();
        int n2 = n = arg0 ? 1 : 2;
        if (sprtzd2.cfr_renamed_1493(sprm.cfr_renamed_580)) {
            sprfbe sprfbe2 = sprfbe.cfr_renamed_23(arg1.cfr_renamed_284());
            PBEKeySpec pBEKeySpec = new PBEKeySpec(arg2);
            try {
                Cipher cipher;
                SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(sprtzd2.cfr_renamed_19(), cfr_renamed_3);
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(sprfbe2.cfr_renamed_1205(), sprfbe2.cfr_renamed_1490().intValue());
                sprmpb sprmpb2 = (sprmpb)secretKeyFactory.generateSecret(pBEKeySpec);
                sprmpb2.cfr_renamed_1502(arg3);
                Cipher cipher2 = cipher = Cipher.getInstance(sprtzd2.cfr_renamed_19(), cfr_renamed_3);
                cipher2.init(n, (Key)sprmpb2, pBEParameterSpec);
                return cipher2.doFinal(arg4);
            }
            catch (Exception exception) {
                throw new IOException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("?=9 *13*4e> 97#5.,4\"z!;1;ewe")).append(exception.toString()).toString());
            }
        }
        if (!sprtzd2.equals(sprm.cfr_renamed_1494)) {
            throw new IOException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("04.4*-+z\u0015\u0018\u0000z$6\"57312(`e")).append(sprtzd2).toString());
        }
        try {
            Cipher cipher = this.cfr_renamed_2428(n, arg2, arg1);
            return cipher.doFinal(arg4);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("533. ?9$>k4.39);$\">,p/1?1k}k")).append(exception.toString()).toString());
        }
    }

    @Override
    public void engineStore(KeyStore.LoadStoreParameter arg0) throws IOException, NoSuchAlgorithmException, CertificateException {
        sprtcc sprtcc2;
        char[] cArray;
        KeyStore.LoadStoreParameter loadStoreParameter;
        sprrhc sprrhc2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqzo.cfr_renamed_9("w;191&wk197k3*>%??p)5k>><'"));
        }
        if (!(arg0 instanceof sprrhc) && !(arg0 instanceof sprvkb)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, spraiaa.cfr_renamed_9("\u000b5e)0*557.e<*(e}5;7;(}e5#z1#5?e")).append(arg0.getClass().getName()).toString());
        }
        if (arg0 instanceof sprrhc) {
            sprrhc2 = (sprrhc)arg0;
            loadStoreParameter = arg0;
        } else {
            sprrhc2 = new sprrhc(((sprvkb)arg0).cfr_renamed_470(), arg0.getProtectionParameter(), ((sprvkb)arg0).cfr_renamed_2288());
            loadStoreParameter = arg0;
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            cArray = null;
            sprtcc2 = this;
        } else if (protectionParameter instanceof KeyStore.PasswordProtection) {
            cArray = ((KeyStore.PasswordProtection)protectionParameter).getPassword();
            sprtcc2 = this;
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqzo.cfr_renamed_9("\u001e$p8%; $\"?p-?9p;\"$$.3?9$>k *\"*=.$.\"k?-p?);5k")).append(protectionParameter.getClass().getName()).toString());
        }
        sprtcc2.cfr_renamed_2435(sprrhc2.cfr_renamed_470(), cArray, sprrhc2.cfr_renamed_2447());
    }

    private static /* synthetic */ byte[] cfr_renamed_2446(sprdce arg0) {
        sprlid sprlid2 = new sprlid();
        byte[] byArray = new byte[sprlid2.cfr_renamed_1218()];
        byte[] byArray2 = arg0.cfr_renamed_2314().cfr_renamed_81();
        sprlid2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprlid2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public boolean engineContainsAlias(String arg0) {
        return this.cfr_renamed_2414.cfr_renamed_1600(arg0) != null || this.cfr_renamed_2421.cfr_renamed_1600(arg0) != null;
    }
}

