/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraw;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprcpm;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprdzl;
import com.spire.presentation.packages.spregm;
import com.spire.presentation.packages.sprelm;
import com.spire.presentation.packages.sprerm;
import com.spire.presentation.packages.sprfcn;
import com.spire.presentation.packages.sprfdi;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprfwm;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprhfd;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.spritm;
import com.spire.presentation.packages.sprjcf;
import com.spire.presentation.packages.sprkam;
import com.spire.presentation.packages.sprkkk;
import com.spire.presentation.packages.sprkyz;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprllm;
import com.spire.presentation.packages.sprnyl;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprof;
import com.spire.presentation.packages.sprolj;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpdm;
import com.spire.presentation.packages.sprpej;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprprh;
import com.spire.presentation.packages.sprqcn;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqrm;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprscj;
import com.spire.presentation.packages.sprswh;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtom;
import com.spire.presentation.packages.spruck;
import com.spire.presentation.packages.spruom;
import com.spire.presentation.packages.spruyi;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvim;
import com.spire.presentation.packages.sprvom;
import com.spire.presentation.packages.sprwvj;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryrm;
import com.spire.presentation.packages.sprysm;
import com.spire.presentation.packages.sprzej;
import com.spire.presentation.packages.sprzen;
import com.spire.presentation.packages.sprzne;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
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
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;

@sprtea
public class spreej
extends KeyStoreSpi
implements sprdl,
sprhl,
spraw {
    public static final int cfr_renamed_2473 = 1;
    private sprlem cfr_renamed_3064;
    private final sprrr cfr_renamed_3034;
    private sprddm cfr_renamed_284;
    private static final int cfr_renamed_2152 = 20;
    private sprzej cfr_renamed_3232;
    public static final int cfr_renamed_3233 = 0;
    public static final int cfr_renamed_2824 = 3;
    private int cfr_renamed_2341;
    private sprzej cfr_renamed_3234;
    private sprlem cfr_renamed_3235;
    public static final String cfr_renamed_107 = "com.spire.psmodel.security.pkcs12.max_it_count";
    public static final int cfr_renamed_132 = 2;
    public static final int cfr_renamed_102 = 4;
    public static final int cfr_renamed_93 = 1;
    private static final int cfr_renamed_86 = 51200;
    private sprzej cfr_renamed_152;
    public static final int cfr_renamed_112 = 2;
    public SecureRandom cfr_renamed_119;
    private Hashtable cfr_renamed_91;
    private Hashtable cfr_renamed_0;
    public static final int cfr_renamed_1 = 0;
    private int cfr_renamed_2;
    private static final sprscj cfr_renamed_3 = new sprscj();
    private CertificateFactory cfr_renamed_4;

    public Enumeration engineAliases() {
        Enumeration enumeration;
        Hashtable<Object, String> hashtable = new Hashtable<Object, String>();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3234.cfr_renamed_2434();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            hashtable.put(enumeration3.nextElement(), sprkyz.cfr_renamed_9("(%94"));
        }
        enumeration = this.cfr_renamed_152.cfr_renamed_2434();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            if (hashtable.get(string) != null) continue;
            hashtable.put(string, "key");
        }
        return hashtable.keys();
    }

    @Override
    public void engineSetKeyEntry(String arg0, Key arg1, char[] arg2, Certificate[] arg3) throws KeyStoreException {
        if (!(arg1 instanceof PrivateKey)) {
            throw new KeyStoreException(sprhfd.cfr_renamed_9("8g+\u007fY\u001eHH\u0007I\u001b\f\u0006C\u001c\f\u001bY\u0018\\\u0007^\u001c\f\u0006C\u0006\u00018^\u0001Z\tX\rg\rU\u001b"));
        }
        if (arg1 instanceof PrivateKey && arg3 == null) {
            throw new KeyStoreException(sprkyz.cfr_renamed_9("%/k#.2?)-)(!?%k##!\".k&$2k09)=!?%k+.9"));
        }
        if (this.cfr_renamed_152.cfr_renamed_1600(arg0) != null) {
            this.engineDeleteEntry(arg0);
        }
        this.cfr_renamed_152.cfr_renamed_2441(arg0, arg1);
        if (arg3 != null) {
            int n;
            this.cfr_renamed_3234.cfr_renamed_2441(arg0, arg3[0]);
            int n2 = n = 0;
            while (n2 != arg3.length) {
                this.cfr_renamed_91.put(new sprpej(this, arg3[n].getPublicKey()), arg3[n++]);
                n2 = n;
            }
        }
    }

    @Override
    public void engineDeleteEntry(String arg0) throws KeyStoreException {
        Certificate certificate;
        String string;
        Certificate certificate2 = (Certificate)this.cfr_renamed_3234.cfr_renamed_2437(arg0);
        if (certificate2 != null) {
            this.cfr_renamed_91.remove(new sprpej(this, certificate2.getPublicKey()));
        }
        if ((Key)this.cfr_renamed_152.cfr_renamed_2437(arg0) != null && (string = (String)this.cfr_renamed_3232.cfr_renamed_2437(arg0)) != null && (certificate = (Certificate)this.cfr_renamed_0.remove(string)) != null) {
            this.cfr_renamed_91.remove(new sprpej(this, certificate.getPublicKey()));
        }
    }

    @Override
    public void engineStore(KeyStore.LoadStoreParameter arg0) throws IOException, NoSuchAlgorithmException, CertificateException {
        spreej spreej2;
        char[] cArray;
        KeyStore.LoadStoreParameter loadStoreParameter;
        sprolj sprolj2;
        if (arg0 == null) {
            throw new IllegalArgumentException(sprhfd.cfr_renamed_9("\u000b\u0018M\u001aM\u0005\u000bHM\u001aKHO\tB\u0006C\u001c\f\nIHB\u001d@\u0004"));
        }
        if (!(arg0 instanceof sprolj) && !(arg0 instanceof sprswh)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("\u000e$`85;0$2?`-/9`l0*2*-l`$&k420.`")).append(arg0.getClass().getName()).toString());
        }
        if (arg0 instanceof sprolj) {
            sprolj2 = (sprolj)arg0;
            loadStoreParameter = arg0;
        } else {
            sprolj2 = new sprolj(((sprswh)arg0).cfr_renamed_470(), arg0.getProtectionParameter(), ((sprswh)arg0).cfr_renamed_2288());
            loadStoreParameter = arg0;
        }
        KeyStore.ProtectionParameter protectionParameter = loadStoreParameter.getProtectionParameter();
        if (protectionParameter == null) {
            cArray = null;
            spreej2 = this;
        } else if (protectionParameter instanceof KeyStore.PasswordProtection) {
            cArray = ((KeyStore.PasswordProtection)protectionParameter).getPassword();
            spreej2 = this;
        } else {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("b\u0007\f\u001bY\u0018\\\u0007^\u001c\f\u000eC\u001a\f\u0018^\u0007X\rO\u001cE\u0007BH\\\t^\tA\rX\r^HC\u000e\f\u001cU\u0018IH")).append(protectionParameter.getClass().getName()).toString());
        }
        spreej2.cfr_renamed_2435(sprolj2.cfr_renamed_470(), cArray, sprolj2.cfr_renamed_2447());
    }

    private /* synthetic */ byte[] cfr_renamed_9267(sprlem arg0, byte[] arg1, int arg2, char[] arg3, boolean arg4, byte[] arg5) throws Exception {
        Mac mac;
        PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arg1, arg2);
        Mac mac2 = mac = this.cfr_renamed_3034.cfr_renamed_1508(arg0.cfr_renamed_19());
        Mac mac3 = mac;
        mac2.init(new spruck(arg3, arg4), pBEParameterSpec);
        mac2.update(arg5);
        return mac2.doFinal();
    }

    @Override
    public String engineGetCertificateAlias(Certificate arg0) {
        String string;
        Certificate certificate;
        spreej spreej2 = this;
        Enumeration enumeration = spreej2.cfr_renamed_3234.cfr_renamed_2445();
        Enumeration enumeration2 = spreej2.cfr_renamed_3234.cfr_renamed_2434();
        while (enumeration.hasMoreElements()) {
            certificate = (Certificate)enumeration.nextElement();
            string = (String)enumeration2.nextElement();
            if (!certificate.equals(arg0)) continue;
            return string;
        }
        spreej spreej3 = this;
        enumeration = spreej3.cfr_renamed_0.elements();
        enumeration2 = spreej3.cfr_renamed_0.keys();
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
    private /* synthetic */ void cfr_renamed_2435(OutputStream arg0, char[] arg1, boolean arg2) throws IOException {
        sprcpm sprcpm2;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        Object object5;
        Enumeration enumeration;
        Object object6;
        spruom[] spruomArray;
        Object object7;
        Object object8;
        Object object9;
        Object object10;
        sprddm sprddm2;
        Object object11;
        Object object12;
        Object object13;
        Object object14;
        byte[] byArray;
        Enumeration enumeration2;
        Enumeration enumeration3;
        sprrvm sprrvm2;
        block36: {
            Object object15;
            Object object16;
            Enumeration enumeration4;
            sprrvm sprrvm3;
            Enumeration enumeration5;
            block35: {
                block34: {
                    block33: {
                        if (this.cfr_renamed_152.cfr_renamed_84() != 0) break block33;
                        if (arg1 != null) break block34;
                        enumeration5 = this.cfr_renamed_3234.cfr_renamed_2434();
                        sprrvm3 = new sprrvm();
                        enumeration4 = enumeration5;
                        break block35;
                    }
                    if (arg1 == null) {
                        throw new NullPointerException(sprhfd.cfr_renamed_9("\u0006CH\\\t_\u001b[\u0007^\f\f\u001bY\u0018\\\u0004E\rHHJ\u0007^H|#o;\u000fY\u001eHg\rU;X\u0007^\r"));
                    }
                }
                sprrvm2 = new sprrvm();
                enumeration2 = enumeration3 = this.cfr_renamed_152.cfr_renamed_2434();
                break block36;
            }
            while (enumeration4.hasMoreElements()) {
                try {
                    object16 = (String)enumeration5.nextElement();
                    object15 = (Certificate)this.cfr_renamed_3234.cfr_renamed_1600((String)object16);
                    sprkam sprkam2 = this.cfr_renamed_9268((String)object16, (Certificate)object15);
                    sprrvm3.cfr_renamed_5004(sprkam2);
                    enumeration4 = enumeration5;
                }
                catch (CertificateEncodingException certificateEncodingException) {
                    throw new IOException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("\u000e29/9`..(//)%'k#.2?)-)(!?%q`")).append(certificateEncodingException.toString()).toString());
                }
            }
            if (arg2) {
                object16 = new spruom(sprdl.cfr_renamed_287, new sprfvg(new sprcen(sprrvm3).cfr_renamed_91()));
                object15 = new sprysm(new spruom(sprdl.cfr_renamed_287, new sprfvg(new sprcen((sprco)object16).cfr_renamed_91())), null);
                ((sprqqe)object15).cfr_renamed_8489(arg0, "DER");
                return;
            }
            object16 = new spruom(sprdl.cfr_renamed_287, new sprfwm(new sprqcn(sprrvm3).cfr_renamed_91()));
            object15 = new sprysm(new spruom(sprdl.cfr_renamed_287, new sprfwm(new sprqcn((sprco)object16).cfr_renamed_91())), null);
            ((sprqqe)object15).cfr_renamed_8489(arg0, "BER");
            return;
        }
        while (enumeration2.hasMoreElements()) {
            Object object17;
            byArray = new byte[20];
            this.cfr_renamed_119.nextBytes(byArray);
            object14 = (String)enumeration3.nextElement();
            object13 = (PrivateKey)this.cfr_renamed_152.cfr_renamed_1600((String)object14);
            object12 = new sprqrm(byArray, 51200);
            spreej spreej2 = this;
            object11 = spreej2.cfr_renamed_9269(spreej2.cfr_renamed_3064.cfr_renamed_19(), (Key)object13, (sprqrm)object12, arg1);
            sprddm2 = new sprddm(this.cfr_renamed_3064, ((sprqrm)object12).cfr_renamed_119());
            object10 = new sprllm(sprddm2, (byte[])object11);
            boolean bl = false;
            object9 = new sprrvm();
            if (object13 instanceof sprof) {
                object8 = (sprof)object13;
                object17 = (sprfcn)object8.cfr_renamed_9064(cfr_renamed_470);
                if (object17 == null || !((sprfcn)object17).cfr_renamed_314().equals(object14)) {
                    object8.cfr_renamed_9065(cfr_renamed_470, new sprzen((String)object14));
                }
                if (object8.cfr_renamed_9064((sprlem)((Object)cfr_renamed_91)) == null) {
                    object7 = this.engineGetCertificate((String)object14);
                    object8.cfr_renamed_9065((sprlem)((Object)cfr_renamed_91), this.cfr_renamed_2433(((Certificate)object7).getPublicKey()));
                }
                Object object18 = object8.cfr_renamed_2158();
                while (object18.hasMoreElements()) {
                    spruomArray = (sprlem)object7.nextElement();
                    object6 = new sprrvm();
                    object18 = object7;
                    ((sprrvm)object6).cfr_renamed_5004((sprco)spruomArray);
                    ((sprrvm)object6).cfr_renamed_5004(new sprocn(object8.cfr_renamed_9064((sprlem)spruomArray)));
                    bl = true;
                    ((sprrvm)object9).cfr_renamed_5004(new sprcen((sprrvm)object6));
                }
            }
            if (!bl) {
                object8 = new sprrvm();
                object17 = this.engineGetCertificate((String)object14);
                Object object19 = object9;
                Object object20 = object8;
                ((sprrvm)object20).cfr_renamed_5004((sprco)((Object)cfr_renamed_91));
                ((sprrvm)object20).cfr_renamed_5004(new sprocn(this.cfr_renamed_2433(((Certificate)object17).getPublicKey())));
                ((sprrvm)object19).cfr_renamed_5004(new sprcen((sprrvm)object8));
                object8 = new sprrvm();
                ((sprrvm)object8).cfr_renamed_5004(cfr_renamed_470);
                ((sprrvm)object8).cfr_renamed_5004(new sprocn(new sprzen((String)object14)));
                ((sprrvm)object19).cfr_renamed_5004(new sprcen((sprrvm)object8));
            }
            object8 = new sprkam(cfr_renamed_2541, ((sprllm)object10).cfr_renamed_119(), new sprocn((sprrvm)object9));
            enumeration2 = enumeration3;
            sprrvm2.cfr_renamed_5004((sprco)object8);
        }
        byArray = new sprcen(sprrvm2).cfr_renamed_104("DER");
        object14 = new sprfwm(byArray);
        object13 = new byte[20];
        this.cfr_renamed_119.nextBytes((byte[])object13);
        object12 = new sprrvm();
        object11 = new sprqrm((byte[])object13, 51200);
        spreej spreej3 = this;
        sprddm2 = new sprddm(spreej3.cfr_renamed_3235, ((sprqrm)object11).cfr_renamed_119());
        object10 = new Hashtable();
        Enumeration enumeration6 = enumeration = spreej3.cfr_renamed_152.cfr_renamed_2434();
        while (enumeration6.hasMoreElements()) {
            try {
                object9 = (String)enumeration.nextElement();
                object8 = this.engineGetCertificate((String)object9);
                boolean bl = false;
                object7 = new sprtom(cfr_renamed_1197, new sprfvg(((Certificate)object8).getEncoded()));
                spruomArray = new sprrvm();
                if (object8 instanceof sprof) {
                    object6 = (sprof)object8;
                    object5 = (sprfcn)object6.cfr_renamed_9064(cfr_renamed_470);
                    if (object5 == null || !((sprfcn)object5).cfr_renamed_314().equals(object9)) {
                        object6.cfr_renamed_9065(cfr_renamed_470, new sprzen((String)object9));
                    }
                    if (object6.cfr_renamed_9064((sprlem)((Object)cfr_renamed_91)) == null) {
                        object6.cfr_renamed_9065((sprlem)((Object)cfr_renamed_91), this.cfr_renamed_2433(((Certificate)object8).getPublicKey()));
                    }
                    Enumeration enumeration7 = object6.cfr_renamed_2158();
                    while (enumeration7.hasMoreElements()) {
                        object3 = (sprlem)object4.nextElement();
                        object2 = new sprrvm();
                        enumeration7 = object4;
                        sprrvm sprrvm4 = object2;
                        sprrvm4.cfr_renamed_5004((sprco)object3);
                        sprrvm4.cfr_renamed_5004(new sprocn(object6.cfr_renamed_9064((sprlem)object3)));
                        spruomArray.cfr_renamed_5004(new sprcen((sprrvm)object2));
                        bl = true;
                    }
                }
                if (!bl) {
                    object6 = new sprrvm();
                    sprrvm sprrvm5 = spruomArray;
                    Object object21 = object6;
                    ((sprrvm)object21).cfr_renamed_5004((sprco)((Object)cfr_renamed_91));
                    ((sprrvm)object21).cfr_renamed_5004(new sprocn(this.cfr_renamed_2433(((Certificate)object8).getPublicKey())));
                    sprrvm5.cfr_renamed_5004(new sprcen((sprrvm)object6));
                    object6 = new sprrvm();
                    ((sprrvm)object6).cfr_renamed_5004(cfr_renamed_470);
                    ((sprrvm)object6).cfr_renamed_5004(new sprocn(new sprzen((String)object9)));
                    sprrvm5.cfr_renamed_5004(new sprcen((sprrvm)object6));
                }
                object6 = new sprkam(cfr_renamed_593, ((sprtom)object7).cfr_renamed_119(), new sprocn((sprrvm)spruomArray));
                ((sprrvm)object12).cfr_renamed_5004((sprco)object6);
                ((Hashtable)object10).put(object8, object8);
                enumeration6 = enumeration;
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IOException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("\u000e29/9`..(//)%'k#.2?)-)(!?%q`")).append(certificateEncodingException.toString()).toString());
            }
        }
        Enumeration enumeration8 = enumeration = this.cfr_renamed_3234.cfr_renamed_2434();
        while (enumeration8.hasMoreElements()) {
            try {
                object9 = (String)enumeration.nextElement();
                object8 = (Certificate)this.cfr_renamed_3234.cfr_renamed_1600((String)object9);
                if (this.cfr_renamed_152.cfr_renamed_1600((String)object9) != null) {
                    enumeration8 = enumeration;
                    continue;
                }
                sprkam sprkam3 = this.cfr_renamed_9268((String)object9, (Certificate)object8);
                ((sprrvm)object12).cfr_renamed_5004(sprkam3);
                ((Hashtable)object10).put(object8, object8);
                enumeration8 = enumeration;
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IOException(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("i\u001a^\u0007^HI\u0006O\u0007H\u0001B\u000f\f\u000bI\u001aX\u0001J\u0001O\tX\r\u0016H")).append(certificateEncodingException.toString()).toString());
            }
        }
        spreej spreej4 = this;
        object9 = spreej4.cfr_renamed_9270();
        Enumeration enumeration9 = enumeration = spreej4.cfr_renamed_91.keys();
        while (enumeration9.hasMoreElements()) {
            try {
                object8 = (sprpej)enumeration.nextElement();
                Certificate certificate = (Certificate)this.cfr_renamed_91.get(object8);
                if (!object9.contains(certificate)) {
                    enumeration9 = enumeration;
                    continue;
                }
                if (((Hashtable)object10).get(certificate) != null) {
                    enumeration9 = enumeration;
                    continue;
                }
                object7 = new sprtom(cfr_renamed_1197, new sprfvg(certificate.getEncoded()));
                spruomArray = new sprrvm();
                if (certificate instanceof sprof) {
                    object6 = (sprof)((Object)certificate);
                    Object object22 = object6.cfr_renamed_2158();
                    while (object22.hasMoreElements()) {
                        object4 = (sprlem)object5.nextElement();
                        if (((sprxgf)object4).cfr_renamed_5078(sprdl.cfr_renamed_91)) {
                            object22 = object5;
                            continue;
                        }
                        object3 = new sprrvm();
                        object22 = object5;
                        Object object23 = object3;
                        ((sprrvm)object23).cfr_renamed_5004((sprco)object4);
                        ((sprrvm)object23).cfr_renamed_5004(new sprocn(object6.cfr_renamed_9064((sprlem)object4)));
                        spruomArray.cfr_renamed_5004(new sprcen((sprrvm)object3));
                    }
                }
                object6 = new sprkam(cfr_renamed_593, ((sprtom)object7).cfr_renamed_119(), new sprocn((sprrvm)spruomArray));
                ((sprrvm)object12).cfr_renamed_5004((sprco)object6);
                enumeration9 = enumeration;
            }
            catch (CertificateEncodingException certificateEncodingException) {
                throw new IOException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("\u000e29/9`..(//)%'k#.2?)-)(!?%q`")).append(certificateEncodingException.toString()).toString());
            }
        }
        object8 = new sprcen((sprrvm)object12).cfr_renamed_104("DER");
        byte[] byArray2 = this.cfr_renamed_9271(true, sprddm2, arg1, false, (byte[])object8);
        object7 = new sprerm(cfr_renamed_287, sprddm2, new sprfwm(byArray2));
        spruom[] spruomArray2 = new spruom[2];
        spruomArray2[0] = new spruom(cfr_renamed_287, (sprco)object14);
        spruomArray2[1] = new spruom(cfr_renamed_3249, ((sprerm)object7).cfr_renamed_119());
        spruomArray = spruomArray2;
        object6 = new sprelm(spruomArray);
        object5 = ((sprqqe)object6).cfr_renamed_104(arg2 ? "DER" : "BER");
        object4 = new spruom(cfr_renamed_287, new sprfwm((byte[])object5));
        spreej spreej5 = this;
        object3 = new byte[spreej5.cfr_renamed_2];
        spreej5.cfr_renamed_119.nextBytes((byte[])object3);
        object2 = ((sproug)((spruom)object4).cfr_renamed_480()).cfr_renamed_186();
        try {
            spreej spreej6 = this;
            object = spreej6.cfr_renamed_9267(spreej6.cfr_renamed_284.cfr_renamed_593(), (byte[])object3, this.cfr_renamed_2341, arg1, false, (byte[])object2);
            sprdim sprdim2 = new sprdim(this.cfr_renamed_284, (byte[])object);
            sprcpm2 = new sprcpm(sprdim2, (byte[])object3, this.cfr_renamed_2341);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("I\u001a^\u0007^HO\u0007B\u001bX\u001aY\u000bX\u0001B\u000f\f%m+\u0016H")).append(exception.toString()).toString());
        }
        sprysm sprysm2 = new sprysm((spruom)object4, sprcpm2);
        object = sprysm2;
        sprysm2.cfr_renamed_8489(arg0, arg2 ? "DER" : "BER");
    }

    @Override
    public boolean engineIsCertificateEntry(String arg0) {
        return this.cfr_renamed_3234.cfr_renamed_1600(arg0) != null && this.cfr_renamed_152.cfr_renamed_1600(arg0) == null;
    }

    @Override
    public void cfr_renamed_1613(SecureRandom arg0) {
        this.cfr_renamed_119 = arg0;
    }

    @Override
    public Date engineGetCreationDate(String arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprkyz.cfr_renamed_9("!')*3k}v`%5',"));
        }
        if (this.cfr_renamed_152.cfr_renamed_1600(arg0) == null && this.cfr_renamed_3234.cfr_renamed_1600(arg0) == null) {
            return null;
        }
        return new Date();
    }

    private /* synthetic */ Cipher cfr_renamed_9272(int arg0, char[] arg1, sprddm arg2) throws NoSuchAlgorithmException, InvalidKeySpecException, NoSuchPaddingException, InvalidKeyException, InvalidAlgorithmParameterException, NoSuchProviderException {
        spreej spreej2;
        SecretKey secretKey;
        spritm spritm2 = spritm.cfr_renamed_23(arg2.cfr_renamed_284());
        spryrm spryrm2 = spryrm.cfr_renamed_23(spritm2.cfr_renamed_2429().cfr_renamed_284());
        sprddm sprddm2 = sprddm.cfr_renamed_23(spritm2.cfr_renamed_2430());
        SecretKeyFactory secretKeyFactory = this.cfr_renamed_3034.cfr_renamed_1495(spritm2.cfr_renamed_2429().cfr_renamed_593().cfr_renamed_19());
        if (spryrm2.cfr_renamed_2431()) {
            secretKey = secretKeyFactory.generateSecret(new PBEKeySpec(arg1, spryrm2.cfr_renamed_1477(), this.cfr_renamed_9273(spryrm2.cfr_renamed_1478()), cfr_renamed_3.cfr_renamed_7385(sprddm2)));
            spreej2 = this;
        } else {
            secretKey = secretKeyFactory.generateSecret(new sprfdi(arg1, spryrm2.cfr_renamed_1477(), this.cfr_renamed_9273(spryrm2.cfr_renamed_1478()), cfr_renamed_3.cfr_renamed_7385(sprddm2), spryrm2.cfr_renamed_2386()));
            spreej2 = this;
        }
        Cipher cipher = spreej2.cfr_renamed_3034.cfr_renamed_1496(spritm2.cfr_renamed_2430().cfr_renamed_593().cfr_renamed_19());
        sprco sprco2 = spritm2.cfr_renamed_2430().cfr_renamed_284();
        if (sprco2 instanceof sproug) {
            Cipher cipher2 = cipher;
            cipher2.init(arg0, (Key)secretKey, new IvParameterSpec(sproug.cfr_renamed_23(sprco2).cfr_renamed_186()));
            return cipher2;
        }
        sprvom sprvom2 = sprvom.cfr_renamed_23(sprco2);
        Cipher cipher3 = cipher;
        cipher3.init(arg0, (Key)secretKey, new sprprh(sprvom2.cfr_renamed_2105(), sprvom2.cfr_renamed_1205()));
        return cipher3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_9269(String arg0, Key arg1, sprqrm arg2, char[] arg3) throws IOException {
        PBEKeySpec pBEKeySpec = new PBEKeySpec(arg3);
        try {
            Cipher cipher;
            spreej spreej2 = this;
            SecretKeyFactory secretKeyFactory = spreej2.cfr_renamed_3034.cfr_renamed_1495(arg0);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arg2.cfr_renamed_1205(), arg2.cfr_renamed_1490().intValue());
            Cipher cipher2 = cipher = spreej2.cfr_renamed_3034.cfr_renamed_1496(arg0);
            cipher2.init(3, (Key)secretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipher2.wrap(arg1);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("I\u0010O\r\\\u001cE\u0007BHI\u0006O\u001aU\u0018X\u0001B\u000f\f\fM\u001cMH\u0001H")).append(exception.toString()).toString());
        }
    }

    private /* synthetic */ sprkam cfr_renamed_9268(String arg0, Certificate arg1) throws CertificateEncodingException {
        Object object;
        Object object2;
        sprqqe sprqqe2;
        Object object3;
        sprtom sprtom2 = new sprtom(cfr_renamed_1197, new sprfvg(arg1.getEncoded()));
        sprrvm sprrvm2 = new sprrvm();
        boolean bl = false;
        if (arg1 instanceof sprof) {
            object3 = (sprof)((Object)arg1);
            sprqqe2 = (sprfcn)object3.cfr_renamed_9064(cfr_renamed_470);
            if (!(sprqqe2 != null && ((sprfcn)sprqqe2).cfr_renamed_314().equals(arg0) || arg0 == null)) {
                object3.cfr_renamed_9065(cfr_renamed_470, new sprzen(arg0));
            }
            Object object4 = object2 = object3.cfr_renamed_2158();
            while (object4.hasMoreElements()) {
                object = (sprlem)object2.nextElement();
                if (((sprxgf)object).cfr_renamed_5078(sprdl.cfr_renamed_91)) {
                    object4 = object2;
                    continue;
                }
                sprrvm sprrvm3 = new sprrvm();
                object4 = object2;
                sprrvm3.cfr_renamed_5004((sprco)object);
                sprrvm3.cfr_renamed_5004(new sprocn(object3.cfr_renamed_9064((sprlem)object)));
                sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
                bl = true;
            }
        }
        if (!bl) {
            Object object5 = object3 = new sprrvm();
            ((sprrvm)object5).cfr_renamed_5004(cfr_renamed_470);
            ((sprrvm)object5).cfr_renamed_5004(new sprocn(new sprzen(arg0)));
            sprrvm2.cfr_renamed_5004(new sprcen((sprrvm)object3));
        }
        if (arg1 instanceof X509Certificate) {
            object3 = sprdzl.cfr_renamed_23(((X509Certificate)arg1).getTBSCertificate());
            sprqqe2 = ((sprdzl)object3).cfr_renamed_98();
            if (sprqqe2 != null) {
                sprrvm sprrvm4;
                object2 = ((sprhgm)sprqqe2).cfr_renamed_5024(sprrdm.cfr_renamed_114);
                if (object2 != null) {
                    sprrvm4 = new sprrvm();
                    Object object6 = object = sprrvm4;
                    ((sprrvm)object6).cfr_renamed_5004(sprow.cfr_renamed_91);
                    ((sprrvm)object6).cfr_renamed_5004(new sprocn(sprnyl.cfr_renamed_23(((sprrdm)object2).cfr_renamed_372()).cfr_renamed_4524()));
                    sprrvm2.cfr_renamed_5004(new sprcen((sprrvm)object));
                } else {
                    sprrvm4 = new sprrvm();
                    Object object7 = object = sprrvm4;
                    ((sprrvm)object7).cfr_renamed_5004(sprow.cfr_renamed_91);
                    ((sprrvm)object7).cfr_renamed_5004(new sprocn(sprpdm.cfr_renamed_86));
                    sprrvm2.cfr_renamed_5004(new sprcen((sprrvm)object));
                }
            } else {
                Object object8 = object2 = new sprrvm();
                ((sprrvm)object8).cfr_renamed_5004(sprow.cfr_renamed_91);
                ((sprrvm)object8).cfr_renamed_5004(new sprocn(sprpdm.cfr_renamed_86));
                sprrvm2.cfr_renamed_5004(new sprcen((sprrvm)object2));
            }
        }
        return new sprkam(cfr_renamed_593, sprtom2.cfr_renamed_119(), new sprocn(sprrvm2));
    }

    private static /* synthetic */ byte[] cfr_renamed_9274(sprvhm arg0) {
        sprgf sprgf2 = sprkkk.cfr_renamed_5701();
        byte[] byArray = new byte[sprgf2.cfr_renamed_1218()];
        byte[] byArray2 = arg0.cfr_renamed_2314().cfr_renamed_81();
        sprgf2.cfr_renamed_1197(byArray2, 0, byArray2.length);
        sprgf2.cfr_renamed_1219(byArray, 0);
        return byArray;
    }

    @Override
    public void engineSetCertificateEntry(String arg0, Certificate arg1) throws KeyStoreException {
        if (this.cfr_renamed_152.cfr_renamed_1600(arg0) != null) {
            throw new KeyStoreException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("\u0014#%9%k)8`*` %2`..?22`<)?(k4#%k.*-.`")).append(arg0).append(".").toString());
        }
        spreej spreej2 = this;
        spreej2.cfr_renamed_3234.cfr_renamed_2441(arg0, arg1);
        spreej2.cfr_renamed_91.put(new sprpej(this, arg1.getPublicKey()), arg1);
    }

    @Override
    public void engineSetKeyEntry(String arg0, byte[] arg1, Certificate[] arg2) throws KeyStoreException {
        throw new RuntimeException(sprhfd.cfr_renamed_9("\u0007\\\r^\tX\u0001C\u0006\f\u0006C\u001c\f\u001bY\u0018\\\u0007^\u001cI\f"));
    }

    public PrivateKey cfr_renamed_9275(sprddm arg0, byte[] arg1, char[] arg2, boolean arg3) throws IOException {
        sprlem sprlem2;
        block4: {
            sprlem2 = arg0.cfr_renamed_593();
            try {
                if (!sprlem2.cfr_renamed_5966(sprdl.cfr_renamed_2920)) break block4;
                sprqrm sprqrm2 = sprqrm.cfr_renamed_23(arg0.cfr_renamed_284());
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(sprqrm2.cfr_renamed_1205(), this.cfr_renamed_9273(sprqrm2.cfr_renamed_1490()));
                Cipher cipher = this.cfr_renamed_3034.cfr_renamed_1496(sprlem2.cfr_renamed_19());
                spruck spruck2 = new spruck(arg2, arg3);
                Cipher cipher2 = cipher;
                cipher2.init(4, (Key)spruck2, pBEParameterSpec);
                return (PrivateKey)cipher2.unwrap(arg1, "", 2);
            }
            catch (Exception exception) {
                throw new IOException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("%3#.0?)$.k5%79!;0\".,`;2\"6*4.` %2`f`")).append(exception.toString()).toString());
            }
        }
        if (sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_112)) {
            Cipher cipher = this.cfr_renamed_9272(4, arg2, arg0);
            return (PrivateKey)cipher.unwrap(arg1, "", 2);
        }
        throw new IOException(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("\rT\u000bI\u0018X\u0001C\u0006\f\u001dB\u001f^\t\\\u0018E\u0006KH\\\u001aE\u001eM\u001cIHG\rUH\u0001HO\tB\u0006C\u001c\f\u001aI\u000bC\u000fB\u0001_\r\u0016H")).append(sprlem2).toString());
    }

    @Override
    public boolean engineIsKeyEntry(String arg0) {
        return this.cfr_renamed_152.cfr_renamed_1600(arg0) != null;
    }

    public boolean engineProbe(InputStream arg0) throws IOException {
        return false;
    }

    private /* synthetic */ Set cfr_renamed_9270() {
        Object object;
        String string;
        HashSet<Object> hashSet = new HashSet<Object>();
        Enumeration enumeration = this.cfr_renamed_152.cfr_renamed_2434();
        while (enumeration.hasMoreElements()) {
            int n;
            string = (String)enumeration.nextElement();
            object = this.engineGetCertificateChain(string);
            int n2 = n = 0;
            while (n2 != ((Certificate[])object).length) {
                hashSet.add(object[n++]);
                n2 = n;
            }
        }
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3234.cfr_renamed_2434();
        while (enumeration2.hasMoreElements()) {
            string = (String)enumeration.nextElement();
            object = this.engineGetCertificate(string);
            enumeration2 = enumeration;
            hashSet.add(object);
        }
        return hashSet;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_9271(boolean arg0, sprddm arg1, char[] arg2, boolean arg3, byte[] arg4) throws IOException {
        int n;
        sprlem sprlem2 = arg1.cfr_renamed_593();
        int n2 = n = arg0 ? 1 : 2;
        if (sprlem2.cfr_renamed_5966(sprdl.cfr_renamed_2920)) {
            sprqrm sprqrm2 = sprqrm.cfr_renamed_23(arg1.cfr_renamed_284());
            try {
                Cipher cipher;
                PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(sprqrm2.cfr_renamed_1205(), sprqrm2.cfr_renamed_1490().intValue());
                spruck spruck2 = new spruck(arg2, arg3);
                Cipher cipher2 = cipher = this.cfr_renamed_3034.cfr_renamed_1496(sprlem2.cfr_renamed_19());
                cipher2.init(n, (Key)spruck2, pBEParameterSpec);
                return cipher2.doFinal(arg4);
            }
            catch (Exception exception) {
                throw new IOException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9(".8(%;4\"/%`/%(220?)%'k$*4*`f`")).append(exception.toString()).toString());
            }
        }
        if (!sprlem2.cfr_renamed_5078(sprdl.cfr_renamed_112)) {
            throw new IOException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("5%+%/<.k\u0010\t\u0005k!''$2\"4#-q`")).append(sprlem2).toString());
        }
        try {
            Cipher cipher = this.cfr_renamed_9272(n, arg2, arg1);
            return cipher.doFinal(arg4);
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("I\u0010O\r\\\u001cE\u0007BHH\rO\u001aU\u0018X\u0001B\u000f\f\fM\u001cMH\u0001H")).append(exception.toString()).toString());
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineLoad(InputStream arg0, char[] arg1) throws IOException {
        block65: {
            if (arg0 == null) {
                return;
            }
            var3_3 = new BufferedInputStream(arg0);
            var3_3.mark(10);
            var4_4 = var3_3.read();
            if (var4_4 < 0) {
                throw new EOFException(sprhfd.cfr_renamed_9("B\u0007\f\fM\u001cMHE\u0006\f\u0003I\u0011_\u001cC\u001aIH_\u001c^\rM\u0005"));
            }
            if (var4_4 != 48) {
                throw new IOException(sprkyz.cfr_renamed_9("849%*-k$$%8`%/?`9%;2.3..?`*`\u001b\u000b\b\u0013zrk+.9k3?/9%"));
            }
            var3_3.reset();
            var5_5 = new sprrzm(var3_3);
            try {
                var6_6 = sprysm.cfr_renamed_23(var5_5.cfr_renamed_24());
            }
            catch (Exception var7_7) {
                throw new IOException(var7_7.getMessage());
            }
            var7_8 = var6_6.cfr_renamed_1475();
            var8_9 = new Vector<sprqqe>();
            var9_10 = false;
            var10_11 = false;
            if (var6_6.cfr_renamed_1470() != null) {
                if (arg1 == null) {
                    throw new NullPointerException(sprhfd.cfr_renamed_9("B\u0007\f\u0018M\u001b_\u001fC\u001aHH_\u001d\\\u0018@\u0001I\f\f\u001fD\rBHC\u0006IHI\u0010\\\rO\u001cI\f"));
                }
                var11_12 /* !! */  = var6_6.cfr_renamed_1470();
                var12_14 = var11_12 /* !! */ .cfr_renamed_1472();
                this.cfr_renamed_284 = var12_14.cfr_renamed_1473();
                var13_15 = var11_12 /* !! */ .cfr_renamed_1477();
                this.cfr_renamed_2341 = this.cfr_renamed_9273(var11_12 /* !! */ .cfr_renamed_1478());
                this.cfr_renamed_2 = ((byte[])var13_15).length;
                var14_16 = ((sproug)var7_8.cfr_renamed_480()).cfr_renamed_186();
                try {
                    v0 = this;
                    var15_19 = v0.cfr_renamed_9267(v0.cfr_renamed_284.cfr_renamed_593(), (byte[])var13_15, this.cfr_renamed_2341, arg1, false, var14_16);
                    var16_23 /* !! */  = var12_14.cfr_renamed_580();
                    if (sproze.cfr_renamed_559((byte[])var15_19, var16_23 /* !! */ )) ** GOTO lbl51
                    if (arg1.length > 0) {
                        throw new IOException(sprkyz.cfr_renamed_9("\u001b\u000b\b\u0013zrk+.9k3?/9%k-*#k)%6*,\"$kmk79/%'k0*387$2/`$2k#$295;4.$k&\",.n"));
                    }
                    v1 = this;
                    v2 = v1.cfr_renamed_9267(v1.cfr_renamed_284.cfr_renamed_593(), (byte[])var13_15, this.cfr_renamed_2341, arg1, true, var14_16);
                    var15_19 = v2;
                    if (!sproze.cfr_renamed_559(v2, var16_23 /* !! */ )) {
                        throw new IOException(sprhfd.cfr_renamed_9("|#o;\u001dZ\f\u0003I\u0011\f\u001bX\u0007^\r\f\u0005M\u000b\f\u0001B\u001eM\u0004E\f\fE\f\u001f^\u0007B\u000f\f\u0018M\u001b_\u001fC\u001aHHC\u001a\f\u000bC\u001a^\u001d\\\u001cI\f\f\u000eE\u0004IF"));
                    }
                    var10_11 = true;
                }
                catch (IOException var15_20) {
                    throw var15_20;
                }
                catch (Exception var15_21) {
                    throw new IOException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9(".29/9`(/%3?2>#?)%'k\r\n\u0003q`")).append(var15_21.toString()).toString());
                }
            } else if (arg1 != null && arg1.length != 0 && !sprjcf.cfr_renamed_5159(sprhfd.cfr_renamed_9("\u000bC\u0005\u0002\u001b\\\u0001^\r\u0002\u0018_\u0005C\fI\u0004\u0002\u001bI\u000bY\u001aE\u001cUF\\\u0003O\u001b\u001dZ\u0002\u0001K\u0006C\u001aI7Y\u001bI\u0004I\u001b_7\\\t_\u001b[\f"))) {
                throw new IOException(sprkyz.cfr_renamed_9(";!83</9$k3>0;,\"%/`-/9` %23?/9%k4#!?`//.3k.$4k2.1>)9%k/%%"));
            }
lbl51:
            // 4 sources

            v3 = this;
            v3.cfr_renamed_152 = new sprzej(null);
            v4 = this;
            v3.cfr_renamed_3232 = new sprzej(null);
            if (!var7_8.cfr_renamed_696().cfr_renamed_5078(spreej.cfr_renamed_287)) break block65;
            var11_12 /* !! */  = sproug.cfr_renamed_23(var7_8.cfr_renamed_480());
            var12_14 = sprelm.cfr_renamed_23(var11_12 /* !! */ .cfr_renamed_186());
            var13_15 = var12_14.cfr_renamed_2442();
            v5 = var14_17 = 0;
            while (v5 != ((byte[])var13_15).length) {
                block70: {
                    block69: {
                        block67: {
                            block68: {
                                block66: {
                                    if (!var13_15[var14_17].cfr_renamed_696().cfr_renamed_5078(spreej.cfr_renamed_287)) break block66;
                                    v6 = sproug.cfr_renamed_23(var13_15[var14_17].cfr_renamed_480());
                                    var15_19 = v6;
                                    var16_23 /* !! */  = (byte[])sprszm.cfr_renamed_23(v6.cfr_renamed_186());
                                    v7 = var17_24 = 0;
                                    break block67;
                                }
                                if (!var13_15[var14_17].cfr_renamed_696().cfr_renamed_5078(spreej.cfr_renamed_3249)) break block68;
                                var15_19 = sprerm.cfr_renamed_23(var13_15[var14_17].cfr_renamed_480());
                                v8 = this.cfr_renamed_9271(false, var15_19.cfr_renamed_1445(), arg1, var10_11, var15_19.cfr_renamed_480().cfr_renamed_186());
                                var16_23 /* !! */  = v8;
                                var17_25 = sprszm.cfr_renamed_23(v8);
                                v9 = var18_28 = 0;
                                break block69;
                            }
                            System.out.println(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("I\u0010X\u001aMH")).append(var13_15[var14_17].cfr_renamed_696().cfr_renamed_19()).toString());
                            System.out.println(new StringBuilder().insert(0, sprkyz.cfr_renamed_9(".8?2*`")).append(spregm.cfr_renamed_2138(var13_15[var14_17].cfr_renamed_480())).toString());
                            break block70;
                        }
                        while (v7 != var16_23 /* !! */ .cfr_renamed_84()) {
                            block63: {
                                block72: {
                                    block73: {
                                        block71: {
                                            var18_27 = sprkam.cfr_renamed_23(var16_23 /* !! */ .cfr_renamed_85(var17_24));
                                            if (!var18_27.cfr_renamed_1457().cfr_renamed_5078(spreej.cfr_renamed_2541)) break block71;
                                            v10 = var18_27;
                                            var19_30 = sprllm.cfr_renamed_23(v10.cfr_renamed_1458());
                                            var20_31 = this.cfr_renamed_9275(var19_30.cfr_renamed_1445(), var19_30.cfr_renamed_1446(), arg1, var10_11);
                                            var21_32 = null;
                                            var22_33 = null;
                                            if (v10.cfr_renamed_1461() == null) break block72;
                                            var23_34 = var18_27.cfr_renamed_1461().cfr_renamed_329();
                                            break block73;
                                        }
                                        if (var18_27.cfr_renamed_1457().cfr_renamed_5078(spreej.cfr_renamed_593)) {
                                            var8_9.addElement(var18_27);
                                            break block63;
                                        } else {
                                            System.out.println(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("I\u0010X\u001aMHE\u0006\f\fM\u001cMH")).append(var18_27.cfr_renamed_1457()).toString());
                                            System.out.println(spregm.cfr_renamed_2138(var18_27));
                                        }
                                        break block63;
                                    }
                                    while (var23_34.hasMoreElements()) {
                                        var24_35 = (sprszm)var23_34.nextElement();
                                        var25_36 = (sprlem)var24_35.cfr_renamed_85(0);
                                        var26_37 = (spridn)var24_35.cfr_renamed_85(1);
                                        var27_38 = null;
                                        if (var26_37.cfr_renamed_84() > 0) {
                                            var27_38 = (sprxgf)var26_37.cfr_renamed_85(0);
                                            if (var20_31 instanceof sprof) {
                                                var28_39 = (sprof)var20_31;
                                                var29_40 = var28_39.cfr_renamed_9064((sprlem)var25_36);
                                                if (var29_40 != null) {
                                                    if (!var29_40.cfr_renamed_119().cfr_renamed_5078(var27_38)) {
                                                        throw new IOException(sprhfd.cfr_renamed_9("M\u001cX\rA\u0018XHX\u0007\f\tH\f\f\rT\u0001_\u001cE\u0006KHM\u001cX\u001aE\nY\u001cIH[\u0001X\u0000\f\fE\u000eJ\r^\rB\u001c\f\u001eM\u0004Y\r"));
                                                    }
                                                } else {
                                                    var28_39.cfr_renamed_9065((sprlem)var25_36, var27_38);
                                                }
                                            }
                                        }
                                        if (var25_36.cfr_renamed_5078(spreej.cfr_renamed_470)) {
                                            var21_32 = ((sprfcn)var27_38).cfr_renamed_314();
                                            this.cfr_renamed_152.cfr_renamed_2441((String)var21_32, var20_31);
                                            continue;
                                        }
                                        if (!var25_36.cfr_renamed_5078((sprxgf)spreej.cfr_renamed_91)) continue;
                                        var22_33 = (sproug)var27_38;
                                    }
                                }
                                if (var22_33 != null) {
                                    var23_34 = new String(sprfqe.cfr_renamed_485(var22_33.cfr_renamed_186()));
                                    v11 = this;
                                    if (var21_32 == null) {
                                        v11.cfr_renamed_152.cfr_renamed_2441((String)var23_34, var20_31);
                                    } else {
                                        v11.cfr_renamed_3232.cfr_renamed_2441((String)var21_32, var23_34);
                                    }
                                } else {
                                    var9_10 = true;
                                    this.cfr_renamed_152.cfr_renamed_2441(sprkyz.cfr_renamed_9(">.&!9+.$"), var20_31);
                                }
                            }
                            v7 = ++var17_24;
                        }
                        break block70;
                    }
                    while (v9 != var17_25.cfr_renamed_84()) {
                        block64: {
                            block78: {
                                block76: {
                                    block77: {
                                        block75: {
                                            block74: {
                                                var19_30 = sprkam.cfr_renamed_23(var17_25.cfr_renamed_85(var18_28));
                                                if (!var19_30.cfr_renamed_1457().cfr_renamed_5078(spreej.cfr_renamed_593)) break block74;
                                                var8_9.addElement(var19_30);
                                                break block64;
                                            }
                                            if (!var19_30.cfr_renamed_1457().cfr_renamed_5078(spreej.cfr_renamed_2541)) break block75;
                                            var20_31 = sprllm.cfr_renamed_23(var19_30.cfr_renamed_1458());
                                            var21_32 = this.cfr_renamed_9275(var20_31.cfr_renamed_1445(), var20_31.cfr_renamed_1446(), arg1, var10_11);
                                            var22_33 = (sprof)var21_32;
                                            var23_34 = null;
                                            var24_35 = null;
                                            var25_36 = var19_30.cfr_renamed_1461().cfr_renamed_329();
                                            break block76;
                                        }
                                        if (!var19_30.cfr_renamed_1457().cfr_renamed_5078(spreej.cfr_renamed_1497)) break block77;
                                        var20_31 = sprcom.cfr_renamed_23(var19_30.cfr_renamed_1458());
                                        var21_32 = sprsci.cfr_renamed_5729((sprcom)var20_31);
                                        var22_33 = (sprof)var21_32;
                                        var23_34 = null;
                                        var24_35 = null;
                                        var25_36 = var19_30.cfr_renamed_1461().cfr_renamed_329();
                                        break block78;
                                    }
                                    System.out.println(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("%349!k)%`..(220?%/\u0004*4*`")).append(var19_30.cfr_renamed_1457()).toString());
                                    System.out.println(spregm.cfr_renamed_2138(var19_30));
                                    break block64;
                                }
                                while (var25_36.hasMoreElements()) {
                                    var26_37 = (sprszm)var25_36.nextElement();
                                    var27_38 = (sprlem)var26_37.cfr_renamed_85(0);
                                    var28_39 = (spridn)var26_37.cfr_renamed_85(1);
                                    var29_40 = null;
                                    if (var28_39.cfr_renamed_84() > 0) {
                                        var29_40 = (sprxgf)var28_39.cfr_renamed_85(0);
                                        var30_41 = var22_33.cfr_renamed_9064((sprlem)var27_38);
                                        if (var30_41 != null) {
                                            if (!var30_41.cfr_renamed_119().cfr_renamed_5078((sprxgf)var29_40)) {
                                                throw new IOException(sprkyz.cfr_renamed_9("*4?%&0?`?/k!/$k%3)84\".,`*4?2\"\">4.`<)?(k$\"&-%9%%4k6*,>%"));
                                            }
                                        } else {
                                            var22_33.cfr_renamed_9065((sprlem)var27_38, var29_40);
                                        }
                                    }
                                    if (var27_38.cfr_renamed_5078(spreej.cfr_renamed_470)) {
                                        var23_34 = ((sprfcn)var29_40).cfr_renamed_314();
                                        this.cfr_renamed_152.cfr_renamed_2441((String)var23_34, var21_32);
                                        continue;
                                    }
                                    if (!var27_38.cfr_renamed_5078((sprxgf)spreej.cfr_renamed_91)) continue;
                                    var24_35 = (sproug)var29_40;
                                }
                                var26_37 = new String(sprfqe.cfr_renamed_485(var24_35.cfr_renamed_186()));
                                v12 = this;
                                if (var23_34 == null) {
                                    v12.cfr_renamed_152.cfr_renamed_2441((String)var26_37, var21_32);
                                    break block64;
                                } else {
                                    v12.cfr_renamed_3232.cfr_renamed_2441((String)var23_34, var26_37);
                                }
                                break block64;
                            }
                            while (var25_36.hasMoreElements()) {
                                var26_37 = sprszm.cfr_renamed_23(var25_36.nextElement());
                                var27_38 = sprlem.cfr_renamed_23(var26_37.cfr_renamed_85(0));
                                var28_39 = spridn.cfr_renamed_23(var26_37.cfr_renamed_85(1));
                                var29_40 = null;
                                if (var28_39.cfr_renamed_84() <= 0) continue;
                                var29_40 = (sprxgf)var28_39.cfr_renamed_85(0);
                                var30_41 = var22_33.cfr_renamed_9064((sprlem)var27_38);
                                if (var30_41 != null) {
                                    if (!var30_41.cfr_renamed_119().cfr_renamed_5078((sprxgf)var29_40)) {
                                        throw new IOException(sprhfd.cfr_renamed_9("M\u001cX\rA\u0018XHX\u0007\f\tH\f\f\rT\u0001_\u001cE\u0006KHM\u001cX\u001aE\nY\u001cIH[\u0001X\u0000\f\fE\u000eJ\r^\rB\u001c\f\u001eM\u0004Y\r"));
                                    }
                                } else {
                                    var22_33.cfr_renamed_9065((sprlem)var27_38, var29_40);
                                }
                                if (var27_38.cfr_renamed_5078(spreej.cfr_renamed_470)) {
                                    var23_34 = ((sprfcn)var29_40).cfr_renamed_314();
                                    this.cfr_renamed_152.cfr_renamed_2441((String)var23_34, var21_32);
                                    continue;
                                }
                                if (!var27_38.cfr_renamed_5078((sprxgf)spreej.cfr_renamed_91)) continue;
                                var24_35 = (sproug)var29_40;
                            }
                            var26_37 = new String(sprfqe.cfr_renamed_485(var24_35.cfr_renamed_186()));
                            v13 = this;
                            if (var23_34 == null) {
                                v13.cfr_renamed_152.cfr_renamed_2441((String)var26_37, var21_32);
                            } else {
                                v13.cfr_renamed_3232.cfr_renamed_2441((String)var23_34, var26_37);
                            }
                        }
                        v9 = ++var18_28;
                    }
                }
                v5 = ++var14_17;
            }
        }
        v14 = this;
        v14.cfr_renamed_3234 = new sprzej(null);
        v14.cfr_renamed_91 = new Hashtable<K, V>();
        v14.cfr_renamed_0 = new Hashtable<K, V>();
        v15 = var11_13 = 0;
        while (true) {
            block79: {
                if (v15 == var8_9.size()) {
                    return;
                }
                var12_14 = (sprkam)var8_9.elementAt(var11_13);
                v16 = sprtom.cfr_renamed_23(var12_14.cfr_renamed_1458());
                var13_15 = v16;
                if (!v16.cfr_renamed_2443().cfr_renamed_5078(spreej.cfr_renamed_1197)) {
                    throw new RuntimeException(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("y\u0006_\u001d\\\u0018C\u001aX\rHHO\r^\u001cE\u000eE\u000bM\u001cIHX\u0011\\\r\u0016H")).append(var13_15.cfr_renamed_2443()).toString());
                }
                try {
                    var15_19 = new ByteArrayInputStream(((sproug)var13_15.cfr_renamed_1459()).cfr_renamed_186());
                    var14_18 = this.cfr_renamed_4.generateCertificate((InputStream)var15_19);
                }
                catch (Exception var15_22) {
                    throw new RuntimeException(var15_22.toString());
                }
                var15_19 = null;
                var16_23 /* !! */  = null;
                if (var12_14.cfr_renamed_1461() == null) break block79;
                var17_26 = var12_14.cfr_renamed_1461().cfr_renamed_329();
                block14: while (true) {
                    v17 = var17_26;
                    while (v17.hasMoreElements()) {
                        block80: {
                            var18_29 = sprszm.cfr_renamed_23(var17_26.nextElement());
                            var19_30 = sprlem.cfr_renamed_23(var18_29.cfr_renamed_85(0));
                            var20_31 = spridn.cfr_renamed_23(var18_29.cfr_renamed_85(1));
                            if (var20_31.cfr_renamed_84() <= 0) continue block14;
                            var21_32 = (sprxgf)var20_31.cfr_renamed_85(0);
                            var22_33 = null;
                            if (!(var14_18 instanceof sprof)) ** GOTO lbl279
                            var22_33 = (sprof)var14_18;
                            var23_34 = var22_33.cfr_renamed_9064((sprlem)var19_30);
                            if (var23_34 == null) break block80;
                            if (var19_30.cfr_renamed_5078((sprxgf)spreej.cfr_renamed_91)) {
                                var24_35 = sprfqe.cfr_renamed_503(((sproug)var21_32).cfr_renamed_186());
                                if (!sprzej.cfr_renamed_9276(this.cfr_renamed_152).containsKey(var24_35) && !sprzej.cfr_renamed_9276(this.cfr_renamed_3232).containsKey(var24_35)) {
                                    v17 = var17_26;
                                    continue;
                                }
                            }
                            if (!var23_34.cfr_renamed_119().cfr_renamed_5078((sprxgf)var21_32)) {
                                throw new IOException(sprkyz.cfr_renamed_9("*4?%&0?`?/k!/$k%3)84\".,`*4?2\"\">4.`<)?(k$\"&-%9%%4k6*,>%"));
                            }
                            ** GOTO lbl279
                        }
                        if (var20_31.cfr_renamed_84() > 1) {
                            v18 = var19_30;
                            v19 = v18;
                            var22_33.cfr_renamed_9065((sprlem)v18, (sprco)var20_31);
                        } else {
                            var22_33.cfr_renamed_9065((sprlem)var19_30, (sprco)var21_32);
lbl279:
                            // 3 sources

                            v19 = var19_30;
                        }
                        if (v19.cfr_renamed_5078(spreej.cfr_renamed_470)) {
                            var16_23 /* !! */  = (byte[])((sprfcn)var21_32).cfr_renamed_314();
                            continue block14;
                        }
                        if (!var19_30.cfr_renamed_5078((sprxgf)spreej.cfr_renamed_91)) continue block14;
                        var15_19 = (sproug)var21_32;
                        continue block14;
                    }
                    break;
                }
            }
            this.cfr_renamed_91.put(new sprpej(this, var14_18.getPublicKey()), var14_18);
            if (var9_10) {
                if (this.cfr_renamed_0.isEmpty()) {
                    var17_26 = new String(sprfqe.cfr_renamed_485(this.cfr_renamed_2433(var14_18.getPublicKey()).cfr_renamed_327()));
                    this.cfr_renamed_0.put(var17_26, var14_18);
                    this.cfr_renamed_152.cfr_renamed_2441((String)var17_26, this.cfr_renamed_152.cfr_renamed_2437(sprhfd.cfr_renamed_9("Y\u0006A\t^\u0003I\f")));
                }
            } else {
                if (var15_19 != null) {
                    var17_26 = new String(sprfqe.cfr_renamed_485(var15_19.cfr_renamed_186()));
                    this.cfr_renamed_0.put(var17_26, var14_18);
                }
                if (var16_23 /* !! */  != null) {
                    this.cfr_renamed_3234.cfr_renamed_2441((String)var16_23 /* !! */ , var14_18);
                }
            }
            v15 = ++var11_13;
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprvim cfr_renamed_2433(PublicKey arg0) {
        try {
            sprvhm sprvhm2 = sprvhm.cfr_renamed_23(arg0.getEncoded());
            return new sprvim(spreej.cfr_renamed_9274(sprvhm2));
        }
        catch (Exception exception) {
            throw new RuntimeException(sprkyz.cfr_renamed_9(".29/9`(2.!?)%'k+.9"));
        }
    }

    @Override
    public int engineSize() {
        Enumeration enumeration;
        Hashtable<Object, String> hashtable = new Hashtable<Object, String>();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_3234.cfr_renamed_2434();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            hashtable.put(enumeration3.nextElement(), sprhfd.cfr_renamed_9("O\r^\u001c"));
        }
        enumeration = this.cfr_renamed_152.cfr_renamed_2434();
        while (enumeration.hasMoreElements()) {
            String string = (String)enumeration.nextElement();
            if (hashtable.get(string) != null) continue;
            hashtable.put(string, "key");
        }
        return hashtable.size();
    }

    @Override
    public Key engineGetKey(String arg0, char[] arg1) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprkyz.cfr_renamed_9("%5',k!')*3k0*38%/`?/k'.4\u0000%2n"));
        }
        return (Key)this.cfr_renamed_152.cfr_renamed_1600(arg0);
    }

    private /* synthetic */ int cfr_renamed_9273(BigInteger arg0) {
        int n = arg0.intValue();
        if (n < 0) {
            throw new IllegalStateException(sprhfd.cfr_renamed_9("B\rK\tX\u0001Z\r\f\u0001X\r^\tX\u0001C\u0006\f\u000bC\u001dB\u001c\f\u000eC\u001dB\f"));
        }
        BigInteger bigInteger = sprjcf.cfr_renamed_5154(cfr_renamed_107);
        if (bigInteger != null && bigInteger.intValue() < n) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9("\"4.2*4\"/%`(/>.?`")).append(n).append(sprhfd.cfr_renamed_9("\f\u000f^\rM\u001cI\u001a\f\u001cD\tBH")).append(bigInteger.intValue()).toString());
        }
        return n;
    }

    public static /* synthetic */ sprvim cfr_renamed_9277(spreej arg0, PublicKey arg1) {
        return arg0.cfr_renamed_2433(arg1);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Certificate[] engineGetCertificateChain(String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprkyz.cfr_renamed_9(".>,'`*,\"!8`;!83.$k4$`,%?\u0003.2?)-)(!?%\b(*)%n"));
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
            block12: {
                block14: {
                    Object object;
                    Object object2;
                    Certificate[] certificateArray;
                    block15: {
                        int n;
                        block13: {
                            Object object3;
                            if (certificate == null) break block13;
                            certificateArray = (Certificate[])certificate;
                            certificate2 = null;
                            byte[] byArray = certificateArray.getExtensionValue(sprrdm.cfr_renamed_105.cfr_renamed_19());
                            if (byArray != null && null != (object2 = ((sprzne)(object3 = sprzne.cfr_renamed_23(((sproug)(object = sproug.cfr_renamed_23(byArray))).cfr_renamed_186()))).cfr_renamed_327())) {
                                certificate2 = (Certificate)this.cfr_renamed_91.get(new sprpej(this, (byte[])object2));
                            }
                            if (certificate2 != null || (object = certificateArray.getIssuerDN()).equals(object3 = certificateArray.getSubjectDN())) break block14;
                            object2 = this.cfr_renamed_91.keys();
                            break block15;
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
                    while (object2.hasMoreElements()) {
                        X509Certificate x509Certificate = (X509Certificate)this.cfr_renamed_91.get(object2.nextElement());
                        if (!((Object)x509Certificate.getSubjectDN()).equals(object)) continue;
                        try {
                            certificateArray.verify(x509Certificate.getPublicKey());
                            certificate2 = x509Certificate;
                            vector2 = vector;
                            break block12;
                        }
                        catch (Exception exception) {
                        }
                    }
                }
                vector2 = vector;
            }
            if (vector2.contains(certificate)) {
                certificate = null;
                continue;
            }
            vector.addElement(certificate);
            if (certificate2 != certificate) {
                certificate = certificate2;
                continue;
            }
            certificate = null;
        }
    }

    @Override
    public Certificate engineGetCertificate(String arg0) {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprhfd.cfr_renamed_9("B\u001d@\u0004\f\t@\u0001M\u001b\f\u0018M\u001b_\rHHX\u0007\f\u000fI\u001co\r^\u001cE\u000eE\u000bM\u001cIF"));
        }
        Certificate certificate = (Certificate)this.cfr_renamed_3234.cfr_renamed_1600(arg0);
        if (certificate == null) {
            String string = (String)this.cfr_renamed_3232.cfr_renamed_1600(arg0);
            if (string != null) {
                certificate = (Certificate)this.cfr_renamed_0.get(string);
                return certificate;
            }
            certificate = (Certificate)this.cfr_renamed_0.get(arg0);
        }
        return certificate;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spreej(sprrr sprrr2, sprlem sprlem2, sprlem sprlem3) {
        void arg1;
        spreej spreej2 = this;
        spreej spreej3 = this;
        spreej spreej4 = this;
        this.cfr_renamed_3034 = new sprdki();
        spreej4.cfr_renamed_152 = new sprzej(null);
        this.cfr_renamed_3232 = new sprzej(null);
        this.cfr_renamed_3234 = new sprzej(null);
        this.cfr_renamed_91 = new Hashtable();
        this.cfr_renamed_0 = new Hashtable();
        this.cfr_renamed_119 = sprybl.cfr_renamed_2794();
        this.cfr_renamed_284 = new sprddm(sprgt.cfr_renamed_0, sprpen.cfr_renamed_4);
        spreej3.cfr_renamed_2341 = 102400;
        spreej3.cfr_renamed_2 = 20;
        spreej2.cfr_renamed_3064 = arg1;
        spreej2.cfr_renamed_3235 = sprlem3;
        try {
            void arg0;
            this.cfr_renamed_4 = arg0.cfr_renamed_1550(sprkyz.cfr_renamed_9("\u0018eu{y"));
            return;
        }
        catch (Exception exception) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprhfd.cfr_renamed_9("O\tBOXHO\u001aI\tX\r\f\u000bI\u001aXHJ\tO\u001cC\u001aUH\u0001H")).append(exception.toString()).toString());
        }
    }

    @Override
    public void engineLoad(KeyStore.LoadStoreParameter arg0) throws IOException, NoSuchAlgorithmException, CertificateException {
        if (arg0 == null) {
            this.engineLoad(null, null);
            return;
        }
        if (arg0 instanceof sprwvj) {
            sprwvj sprwvj2 = (sprwvj)arg0;
            this.engineLoad(sprwvj2.cfr_renamed_2920(), spruyi.cfr_renamed_9263(arg0));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprkyz.cfr_renamed_9(".$`85;0$2?`-/9`l0*2*-l`$&k420.`")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public boolean engineContainsAlias(String arg0) {
        return this.cfr_renamed_3234.cfr_renamed_1600(arg0) != null || this.cfr_renamed_152.cfr_renamed_1600(arg0) != null;
    }

    @Override
    public void engineStore(OutputStream arg0, char[] arg1) throws IOException {
        this.cfr_renamed_2435(arg0, arg1, false);
    }
}

