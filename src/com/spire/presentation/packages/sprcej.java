/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprafn;
import com.spire.presentation.packages.spraym;
import com.spire.presentation.packages.sprbcn;
import com.spire.presentation.packages.sprbdn;
import com.spire.presentation.packages.sprbqm;
import com.spire.presentation.packages.sprbr;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdfk;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprean;
import com.spire.presentation.packages.spreek;
import com.spire.presentation.packages.sprgp;
import com.spire.presentation.packages.sprgt;
import com.spire.presentation.packages.sprihj;
import com.spire.presentation.packages.spripk;
import com.spire.presentation.packages.spritm;
import com.spire.presentation.packages.sprkbn;
import com.spire.presentation.packages.sprkcn;
import com.spire.presentation.packages.sprkek;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprlak;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprllm;
import com.spire.presentation.packages.sprlxk;
import com.spire.presentation.packages.sprmfk;
import com.spire.presentation.packages.sprnan;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprnrk;
import com.spire.presentation.packages.sprnwj;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sproo;
import com.spire.presentation.packages.sprow;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprqom;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprqxn;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprsx;
import com.spire.presentation.packages.sprsym;
import com.spire.presentation.packages.sprtnk;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruyi;
import com.spire.presentation.packages.spruzm;
import com.spire.presentation.packages.sprvsl;
import com.spire.presentation.packages.sprwpm;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprwvj;
import com.spire.presentation.packages.sprxej;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryck;
import com.spire.presentation.packages.spryp;
import com.spire.presentation.packages.spryrm;
import com.spire.presentation.packages.sprzcn;
import com.spire.presentation.packages.sprzfl;
import com.spire.presentation.packages.sprzg;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigInteger;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.KeyStoreSpi;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.Signature;
import java.security.UnrecoverableKeyException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.DSAKey;
import java.security.interfaces.RSAKey;
import java.security.spec.PKCS8EncodedKeySpec;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.Mac;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.SecretKeySpec;

public class sprcej
extends KeyStoreSpi {
    private PublicKey cfr_renamed_96;
    private static final BigInteger cfr_renamed_105;
    private sprwpm cfr_renamed_137;
    private final Map<String, PrivateKey> cfr_renamed_79;
    private static final Map<sprlem, String> cfr_renamed_107;
    private sprddm cfr_renamed_132;
    private static final BigInteger cfr_renamed_102;
    private Date cfr_renamed_93;
    private Date cfr_renamed_86;
    private spryp cfr_renamed_152;
    private static final BigInteger cfr_renamed_112;
    private static final BigInteger cfr_renamed_119;
    private sprddm cfr_renamed_91;
    private static final BigInteger cfr_renamed_0;
    private final Map<String, sprean> cfr_renamed_1;
    private sprlem cfr_renamed_2;
    private final sprrr cfr_renamed_3;
    private static final Map<String, sprlem> cfr_renamed_4;

    private static /* synthetic */ String cfr_renamed_9278(sprlem arg0) {
        String string = cfr_renamed_107.get(arg0);
        if (string != null) {
            return string;
        }
        return arg0.cfr_renamed_19();
    }

    private /* synthetic */ sprkbn cfr_renamed_9279(sprllm arg0, Certificate[] arg1) throws CertificateEncodingException {
        int n;
        sprndm[] sprndmArray = new sprndm[arg1.length];
        int n2 = n = 0;
        while (n2 != arg1.length) {
            int n3 = n++;
            sprndmArray[n3] = sprndm.cfr_renamed_23(arg1[n3].getEncoded());
            n2 = n;
        }
        return new sprkbn(arg0, sprndmArray);
    }

    private /* synthetic */ SecureRandom cfr_renamed_9280() {
        return sprybl.cfr_renamed_2794();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public String engineGetCertificateAlias(Certificate arg0) {
        byte[] byArray;
        if (arg0 == null) {
            return null;
        }
        try {
            byArray = arg0.getEncoded();
        }
        catch (CertificateEncodingException certificateEncodingException) {
            return null;
        }
        Iterator<String> iterator = this.cfr_renamed_1.keySet().iterator();
        while (iterator.hasNext()) {
            String string = iterator.next();
            sprean sprean2 = this.cfr_renamed_1.get(string);
            if (sprean2.cfr_renamed_324().equals(cfr_renamed_0)) {
                if (!sproze.cfr_renamed_92(sprean2.cfr_renamed_2609(), byArray)) continue;
                return string;
            }
            if (!sprean2.cfr_renamed_324().equals(cfr_renamed_119) && !sprean2.cfr_renamed_324().equals(cfr_renamed_102)) continue;
            try {
                sprkbn sprkbn2 = sprkbn.cfr_renamed_23(sprean2.cfr_renamed_2609());
                if (!sproze.cfr_renamed_92(sprkbn2.cfr_renamed_2454()[0].cfr_renamed_119().cfr_renamed_91(), byArray)) continue;
                return string;
            }
            catch (IOException iOException) {
                continue;
            }
            break;
        }
        return null;
    }

    @Override
    public void engineDeleteEntry(String arg0) throws KeyStoreException {
        if (this.cfr_renamed_1.get(arg0) == null) {
            return;
        }
        this.cfr_renamed_79.remove(arg0);
        this.cfr_renamed_1.remove(arg0);
        sprcej sprcej2 = this;
        sprcej2.cfr_renamed_86 = new Date();
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineStore(OutputStream arg0, char[] arg1) throws IOException, NoSuchAlgorithmException, CertificateException {
        block3: {
            if (this.cfr_renamed_93 == null) {
                throw new IOException(sprqxn.cfr_renamed_9("\r^?h2T4^fU)OfR(R2R'W/A#_"));
            }
            v0 = this;
            var3_3 = v0.cfr_renamed_9281(v0.cfr_renamed_132, arg1);
            if (!sprow.cfr_renamed_957.cfr_renamed_5078(this.cfr_renamed_137.cfr_renamed_593())) break block3;
            v1 = this;
            v2 = v1;
            var4_4 = sprqom.cfr_renamed_23(v1.cfr_renamed_137.cfr_renamed_284());
            v1.cfr_renamed_137 = v1.cfr_renamed_9282(v1.cfr_renamed_137, var4_4.cfr_renamed_4600().intValue());
            ** GOTO lbl17
        }
        v3 = this;
        var4_4 = spryrm.cfr_renamed_23(v3.cfr_renamed_137.cfr_renamed_284());
        v3.cfr_renamed_137 = v3.cfr_renamed_9282(v3.cfr_renamed_137, var4_4.cfr_renamed_4600().intValue());
        try {
            v2 = this;
lbl17:
            // 2 sources

            v4 = this;
            var4_4 = v2.cfr_renamed_9283(var3_3.cfr_renamed_91(), v4.cfr_renamed_132, v4.cfr_renamed_137, arg1);
        }
        catch (NoSuchProviderException var5_5) {
            throw new IOException(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("L\u000eA\u0001@\u001b\u000f\fN\u0003L\u001aC\u000e[\n\u000f\u0002N\f\u0015O")).append(var5_5.getMessage()).toString());
        }
        v5 = this;
        var5_6 = new sprnan(var3_3, new sprsym(new spruzm(v5.cfr_renamed_132, v5.cfr_renamed_137, (byte[])var4_4)));
        v6 = arg0;
        v6.write(var5_6.cfr_renamed_91());
        v6.flush();
    }

    @Override
    public Enumeration<String> engineAliases() {
        Iterator<String> iterator = new HashSet<String>(this.cfr_renamed_1.keySet()).iterator();
        return new sprxej(this, iterator);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineGetKey(String arg0, char[] arg1) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        if (sprean2 == null) {
            return null;
        }
        if (sprean2.cfr_renamed_324().equals(cfr_renamed_119) || sprean2.cfr_renamed_324().equals(cfr_renamed_102)) {
            PrivateKey privateKey = this.cfr_renamed_79.get(arg0);
            if (privateKey != null) {
                return privateKey;
            }
            sprkbn sprkbn2 = sprkbn.cfr_renamed_23(sprean2.cfr_renamed_2609());
            sprllm sprllm2 = sprllm.cfr_renamed_23(sprkbn2.cfr_renamed_9284());
            try {
                sprcej sprcej2 = this;
                sprcom sprcom2 = sprcom.cfr_renamed_23(sprcej2.cfr_renamed_9285(sprqxn.cfr_renamed_9("\u0016i\u000fm\u0007o\u0003d\r~\u001fd\u0003u\u0005i\u001fk\u0012r\tu"), sprllm2.cfr_renamed_1445(), arg1, sprllm2.cfr_renamed_1446()));
                KeyFactory keyFactory = sprcej2.cfr_renamed_3.cfr_renamed_1511(sprcej.cfr_renamed_9278(sprcom2.cfr_renamed_1254().cfr_renamed_593()));
                PrivateKey privateKey2 = keyFactory.generatePrivate(new PKCS8EncodedKeySpec(sprcom2.cfr_renamed_91()));
                sprcej2.cfr_renamed_79.put(arg0, privateKey2);
                return privateKey2;
            }
            catch (Exception exception) {
                throw new UnrecoverableKeyException(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\u001aA\u000eM\u0003JO[\u0000\u000f\u001dJ\f@\u0019J\u001d\u000f\u001f]\u0006Y\u000e[\n\u000f\u0004J\u0016\u000fG")).append(arg0).append(sprqxn.cfr_renamed_9("\u0012|\u001b")).append(exception.getMessage()).toString());
            }
        }
        if (!sprean2.cfr_renamed_324().equals(cfr_renamed_112) && !sprean2.cfr_renamed_324().equals(cfr_renamed_105)) {
            throw new UnrecoverableKeyException(new StringBuilder().insert(0, sprqxn.cfr_renamed_9("y\u0005}\rhfp#B\u0015O)I#\u001b3U'Y*^fO)\u001b4^%T0^4\u001b5^%I#OfP#Bf\u0013")).append(arg0).append(sprvsl.cfr_renamed_9("\u0006U\u000f\u001bV\u001fJOA\u0000[O]\nL\u0000H\u0001F\u0015J\u000b")).toString());
        }
        sprkcn sprkcn2 = sprkcn.cfr_renamed_23(sprean2.cfr_renamed_2609());
        try {
            sprcej sprcej3 = this;
            sprafn sprafn2 = sprafn.cfr_renamed_23(sprcej3.cfr_renamed_9285(sprvsl.cfr_renamed_9("<j,}*{0d*v0j!l=v?{&`!"), sprkcn2.cfr_renamed_4000(), arg1, sprkcn2.cfr_renamed_9286()));
            SecretKeyFactory secretKeyFactory = sprcej3.cfr_renamed_3.cfr_renamed_1495(sprafn2.cfr_renamed_2373().cfr_renamed_19());
            return secretKeyFactory.generateSecret(new SecretKeySpec(sprafn2.cfr_renamed_9287(), sprafn2.cfr_renamed_2373().cfr_renamed_19()));
        }
        catch (Exception exception) {
            throw new UnrecoverableKeyException(new StringBuilder().insert(0, sprqxn.cfr_renamed_9("y\u0005}\rhfp#B\u0015O)I#\u001b3U'Y*^fO)\u001b4^%T0^4\u001b5^%I#OfP#Bf\u0013")).append(arg0).append(sprvsl.cfr_renamed_9("F\u0015O")).append(exception.getMessage()).toString());
        }
    }

    @Override
    public void engineStore(KeyStore.LoadStoreParameter arg0) throws CertificateException, NoSuchAlgorithmException, IOException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprqxn.cfr_renamed_9("aK'I'V#O#Ia\u001b'I!\u001b%Z(U)OfY#\u001b(N*W"));
        }
        if (arg0 instanceof sprnwj) {
            sprnwj sprnwj2 = (sprnwj)arg0;
            char[] cArray = spruyi.cfr_renamed_9263(arg0);
            sprcej sprcej2 = this;
            sprcej2.cfr_renamed_137 = sprcej2.cfr_renamed_9288(sprnwj2.cfr_renamed_9289(), 64);
            sprcej2.engineStore(sprnwj2.cfr_renamed_470(), cArray);
            return;
        }
        if (arg0 instanceof spreek) {
            sprcej sprcej3;
            spreek spreek2;
            spreek spreek3 = (spreek)arg0;
            if (spreek3.cfr_renamed_9290() != null) {
                spreek spreek4;
                spreek spreek5;
                spreek spreek6 = spreek3;
                this.cfr_renamed_91 = this.cfr_renamed_9291(spreek3.cfr_renamed_9290(), spreek3.cfr_renamed_9292());
                this.cfr_renamed_137 = this.cfr_renamed_9288(spreek6.cfr_renamed_9289(), 64);
                if (spreek6.cfr_renamed_9293() == sprlak.cfr_renamed_2) {
                    spreek5 = spreek3;
                    this.cfr_renamed_2 = sprwr.cfr_renamed_1228;
                } else {
                    this.cfr_renamed_2 = sprwr.cfr_renamed_185;
                    spreek5 = spreek3;
                }
                if (spreek5.cfr_renamed_9294() == sprkek.cfr_renamed_2) {
                    spreek4 = spreek3;
                    sprcej sprcej4 = this;
                    sprcej4.cfr_renamed_132 = new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4);
                } else {
                    this.cfr_renamed_132 = new sprddm(sprwr.cfr_renamed_119, sprpen.cfr_renamed_4);
                    spreek4 = spreek3;
                }
                char[] cArray = spruyi.cfr_renamed_9263(spreek4);
                sprcej sprcej5 = this;
                sprzcn sprzcn2 = sprcej5.cfr_renamed_9281(sprcej5.cfr_renamed_91, cArray);
                try {
                    sprbcn sprbcn2;
                    sprndm[] sprndmArray;
                    sprcej sprcej6 = this;
                    Signature signature = sprcej6.cfr_renamed_3.cfr_renamed_1539(sprcej6.cfr_renamed_91.cfr_renamed_593().cfr_renamed_19());
                    signature.initSign((PrivateKey)spreek3.cfr_renamed_9290());
                    signature.update(sprzcn2.cfr_renamed_91());
                    X509Certificate[] x509CertificateArray = spreek3.cfr_renamed_9295();
                    if (x509CertificateArray != null) {
                        int n;
                        sprndmArray = new sprndm[x509CertificateArray.length];
                        int n2 = n = 0;
                        while (n2 != sprndmArray.length) {
                            int n3 = n++;
                            sprndmArray[n3] = sprndm.cfr_renamed_23(x509CertificateArray[n3].getEncoded());
                            n2 = n;
                        }
                        sprbcn2 = new sprbcn(this.cfr_renamed_91, sprndmArray, signature.sign());
                    } else {
                        sprbcn2 = new sprbcn(this.cfr_renamed_91, signature.sign());
                    }
                    sprndmArray = new sprnan(sprzcn2, new sprsym(sprbcn2));
                    spreek spreek7 = spreek3;
                    spreek7.cfr_renamed_470().write(sprndmArray.cfr_renamed_91());
                    spreek7.cfr_renamed_470().flush();
                    return;
                }
                catch (GeneralSecurityException generalSecurityException) {
                    throw new IOException(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("J\u001d]\u0000]OL\u001dJ\u000e[\u0006A\b\u000f\u001cF\bA\u000e[\u001a]\n\u0015O")).append(generalSecurityException.getMessage()).toString(), generalSecurityException);
                }
            }
            spreek spreek8 = spreek3;
            char[] cArray = spruyi.cfr_renamed_9263(spreek8);
            this.cfr_renamed_137 = this.cfr_renamed_9288(spreek3.cfr_renamed_9289(), 64);
            if (spreek8.cfr_renamed_9293() == sprlak.cfr_renamed_2) {
                spreek2 = spreek3;
                this.cfr_renamed_2 = sprwr.cfr_renamed_1228;
            } else {
                this.cfr_renamed_2 = sprwr.cfr_renamed_185;
                spreek2 = spreek3;
            }
            if (spreek2.cfr_renamed_9294() == sprkek.cfr_renamed_2) {
                sprcej3 = this;
                this.cfr_renamed_132 = new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4);
            } else {
                sprcej3 = this;
                this.cfr_renamed_132 = new sprddm(sprwr.cfr_renamed_119, sprpen.cfr_renamed_4);
            }
            sprcej3.engineStore(spreek3.cfr_renamed_470(), cArray);
            return;
        }
        if (arg0 instanceof sprwvj) {
            sprwvj sprwvj2 = (sprwvj)arg0;
            this.engineStore(sprwvj2.cfr_renamed_470(), spruyi.cfr_renamed_9263(arg0));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprqxn.cfr_renamed_9("U)\u001b5N6K)I2\u001b T4\u001baK'I'V#O#Ia\u001b)]fO?K#\u001b")).append(arg0.getClass().getName()).toString());
    }

    public sprcej(sprrr sprrr2) {
        sprcej sprcej2 = this;
        sprcej sprcej3 = this;
        sprcej3.cfr_renamed_1 = new HashMap<String, sprean>();
        sprcej2.cfr_renamed_79 = new HashMap<String, PrivateKey>();
        sprcej2.cfr_renamed_2 = sprwr.cfr_renamed_1228;
        sprcej2.cfr_renamed_3 = sprrr2;
    }

    @Override
    public void engineLoad(KeyStore.LoadStoreParameter arg0) throws CertificateException, NoSuchAlgorithmException, IOException {
        if (arg0 == null) {
            this.engineLoad(null, null);
            return;
        }
        if (arg0 instanceof spreek) {
            sprcej sprcej2;
            spreek spreek2;
            spreek spreek3 = (spreek)arg0;
            char[] cArray = spruyi.cfr_renamed_9263(spreek3);
            spreek spreek4 = spreek3;
            this.cfr_renamed_137 = this.cfr_renamed_9288(spreek4.cfr_renamed_9289(), 64);
            if (spreek4.cfr_renamed_9293() == sprlak.cfr_renamed_2) {
                spreek2 = spreek3;
                this.cfr_renamed_2 = sprwr.cfr_renamed_1228;
            } else {
                this.cfr_renamed_2 = sprwr.cfr_renamed_185;
                spreek2 = spreek3;
            }
            if (spreek2.cfr_renamed_9294() == sprkek.cfr_renamed_2) {
                sprcej2 = this;
                this.cfr_renamed_132 = new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4);
            } else {
                sprcej2 = this;
                this.cfr_renamed_132 = new sprddm(sprwr.cfr_renamed_119, sprpen.cfr_renamed_4);
            }
            sprcej2.cfr_renamed_96 = (PublicKey)spreek3.cfr_renamed_9290();
            sprcej sprcej3 = this;
            sprcej3.cfr_renamed_152 = spreek3.cfr_renamed_9296();
            sprcej3.cfr_renamed_91 = sprcej3.cfr_renamed_9291(sprcej3.cfr_renamed_96, spreek3.cfr_renamed_9292());
            sprddm sprddm2 = sprcej3.cfr_renamed_132;
            sprlem sprlem2 = sprcej3.cfr_renamed_2;
            InputStream inputStream = spreek3.cfr_renamed_2920();
            sprcej3.engineLoad(inputStream, cArray);
            if (inputStream != null) {
                sprcej sprcej4 = this;
                if (!sprcej4.cfr_renamed_9297(spreek3.cfr_renamed_9289(), sprcej4.cfr_renamed_137) || !sprlem2.cfr_renamed_5078(this.cfr_renamed_2)) {
                    throw new IOException(sprvsl.cfr_renamed_9("L\u0000A\tF\bZ\u001dN\u001bF\u0000AO_\u000e]\u000eB\n[\n]\u001c\u000f\u000b@OA\u0000[OB\u000e[\fGOJ\u0017F\u001c[\u0006A\b\u000f\u001c[\u0000]\n"));
                }
            }
        } else {
            if (arg0 instanceof sprwvj) {
                sprwvj sprwvj2 = (sprwvj)arg0;
                this.engineLoad(sprwvj2.cfr_renamed_2920(), spruyi.cfr_renamed_9263(arg0));
                return;
            }
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqxn.cfr_renamed_9("U)\u001b5N6K)I2\u001b T4\u001baK'I'V#O#Ia\u001b)]fO?K#\u001b")).append(arg0.getClass().getName()).toString());
        }
    }

    private /* synthetic */ sprzcn cfr_renamed_9281(sprddm arg0, char[] arg1) throws IOException, NoSuchAlgorithmException {
        sprzcn sprzcn2;
        sprean[] spreanArray = this.cfr_renamed_1.values().toArray(new sprean[this.cfr_renamed_1.size()]);
        sprcej sprcej2 = this;
        sprwpm sprwpm2 = sprcej2.cfr_renamed_9282(sprcej2.cfr_renamed_137, 32);
        byte[] byArray = sprcej2.cfr_renamed_9298(sprwpm2, sprvsl.cfr_renamed_9("|;`=j0j!l=v?{&`!"), arg1 != null ? arg1 : new char[]{}, 32);
        sprcej sprcej3 = this;
        spraym spraym2 = new spraym(arg0, sprcej3.cfr_renamed_93, sprcej3.cfr_renamed_86, new sprbdn(spreanArray), null);
        try {
            if (this.cfr_renamed_2.cfr_renamed_5078(sprwr.cfr_renamed_1228)) {
                Cipher cipher = this.cfr_renamed_9299(sprqxn.cfr_renamed_9("z\u0003hix\u0005viu)k'_\"R(\\"), byArray);
                byte[] byArray2 = cipher.doFinal(spraym2.cfr_renamed_91());
                AlgorithmParameters algorithmParameters = cipher.getParameters();
                spritm spritm2 = new spritm(sprwpm2, new sprbqm(sprwr.cfr_renamed_1228, sprtnk.cfr_renamed_23(algorithmParameters.getEncoded())));
                sprzcn2 = new sprzcn(new sprddm(sprdl.cfr_renamed_112, spritm2), byArray2);
            } else {
                Cipher cipher = this.cfr_renamed_9299(sprvsl.cfr_renamed_9("n*|$x?"), byArray);
                byte[] byArray3 = cipher.doFinal(spraym2.cfr_renamed_91());
                spritm spritm3 = new spritm(sprwpm2, new sprbqm(sprwr.cfr_renamed_185));
                sprzcn2 = new sprzcn(new sprddm(sprdl.cfr_renamed_112, spritm3), byArray3);
            }
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new NoSuchAlgorithmException(noSuchPaddingException.toString());
        }
        catch (BadPaddingException badPaddingException) {
            throw new IOException(badPaddingException.toString());
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new IOException(illegalBlockSizeException.toString());
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new IOException(invalidKeyException.toString());
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new IOException(noSuchProviderException.toString());
        }
        return sprzcn2;
    }

    @Override
    public boolean engineContainsAlias(String arg0) {
        if (arg0 == null) {
            throw new NullPointerException(sprqxn.cfr_renamed_9("Z*R'HfM'W3^fR5\u001b(N*W"));
        }
        return this.cfr_renamed_1.containsKey(arg0);
    }

    private /* synthetic */ sprwpm cfr_renamed_9288(sprdfk arg0, int arg1) {
        if (sprow.cfr_renamed_957.cfr_renamed_5078(arg0.cfr_renamed_593())) {
            sprmfk sprmfk2 = (sprmfk)arg0;
            byte[] byArray = new byte[sprmfk2.cfr_renamed_4598()];
            this.cfr_renamed_9280().nextBytes(byArray);
            sprqom sprqom2 = new sprqom(byArray, sprmfk2.cfr_renamed_7383(), sprmfk2.cfr_renamed_1195(), sprmfk2.cfr_renamed_7384(), arg1);
            return new sprwpm(sprow.cfr_renamed_957, sprqom2);
        }
        spripk spripk2 = (spripk)arg0;
        byte[] byArray = new byte[spripk2.cfr_renamed_4598()];
        this.cfr_renamed_9280().nextBytes(byArray);
        return new sprwpm(sprdl.cfr_renamed_3247, new spryrm(byArray, spripk2.cfr_renamed_1478(), arg1, spripk2.cfr_renamed_7387()));
    }

    static {
        cfr_renamed_4 = new HashMap<String, sprlem>();
        cfr_renamed_107 = new HashMap<sprlem, String>();
        cfr_renamed_4.put(sprvsl.cfr_renamed_9("k*|*k*"), sprgt.cfr_renamed_102);
        cfr_renamed_4.put(sprqxn.cfr_renamed_9("o\u0014r\u0016w\u0003\u007f\u0003h"), sprgt.cfr_renamed_102);
        cfr_renamed_4.put(sprvsl.cfr_renamed_9("{+j."), sprgt.cfr_renamed_102);
        cfr_renamed_4.put("HMACSHA1", sprdl.cfr_renamed_1763);
        cfr_renamed_4.put(sprqxn.cfr_renamed_9("\u000ev\u0007x\u0015s\u0007\tt\u000f"), sprdl.cfr_renamed_3240);
        cfr_renamed_4.put("HMACSHA256", sprdl.cfr_renamed_131);
        cfr_renamed_4.put("HMACSHA384", sprdl.cfr_renamed_1223);
        cfr_renamed_4.put("HMACSHA512", sprdl.cfr_renamed_2956);
        cfr_renamed_4.put(sprvsl.cfr_renamed_9("|*j+"), sprgp.cfr_renamed_4);
        cfr_renamed_4.put(sprqxn.cfr_renamed_9("\u0005z\u000b~\nw\u000fzh\nt\u0003"), sprsx.cfr_renamed_2);
        cfr_renamed_4.put(sprvsl.cfr_renamed_9("l.b*c#f.\u0001^\u0016]"), sprsx.cfr_renamed_1);
        cfr_renamed_4.put(sprqxn.cfr_renamed_9("\u0005z\u000b~\nw\u000fzh\ts\r"), sprsx.cfr_renamed_4);
        cfr_renamed_4.put(sprvsl.cfr_renamed_9("n=f.\u0001^\u001dW"), sproo.cfr_renamed_126);
        cfr_renamed_4.put(sprqxn.cfr_renamed_9("\u0007i\u000fzh\n\u007f\t"), sproo.cfr_renamed_86);
        cfr_renamed_4.put(sprvsl.cfr_renamed_9("n=f.\u0001]\u001aY"), sproo.cfr_renamed_114);
        cfr_renamed_107.put(sprdl.cfr_renamed_1205, "RSA");
        cfr_renamed_107.put(sprbr.cfr_renamed_135, "EC");
        cfr_renamed_107.put(sprgt.cfr_renamed_152, sprqxn.cfr_renamed_9("\u0002s"));
        cfr_renamed_107.put(sprdl.cfr_renamed_1214, sprvsl.cfr_renamed_9("k'"));
        cfr_renamed_107.put(sprbr.cfr_renamed_84, "DSA");
        cfr_renamed_0 = BigInteger.valueOf(0L);
        cfr_renamed_119 = BigInteger.valueOf(1L);
        cfr_renamed_112 = BigInteger.valueOf(2L);
        cfr_renamed_102 = BigInteger.valueOf(3L);
        cfr_renamed_105 = BigInteger.valueOf(4L);
    }

    private /* synthetic */ byte[] cfr_renamed_9285(String arg0, sprddm arg1, char[] arg2, byte[] arg3) throws IOException {
        if (!arg1.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_112)) {
            throw new IOException(sprqxn.cfr_renamed_9("y\u0005}\rhfp#B\u0015O)I#\u001b%Z(U)OfI#X)\\(R<^fK4T2^%O/T(\u001b'W!T4R2S+\u0015"));
        }
        spritm spritm2 = spritm.cfr_renamed_23(arg1.cfr_renamed_284());
        sprbqm sprbqm2 = spritm2.cfr_renamed_2430();
        try {
            Object object;
            AlgorithmParameters algorithmParameters;
            Cipher cipher;
            sprcej sprcej2;
            if (sprbqm2.cfr_renamed_593().cfr_renamed_5078(sprwr.cfr_renamed_1228)) {
                sprcej sprcej3 = this;
                sprcej2 = sprcej3;
                cipher = sprcej3.cfr_renamed_3.cfr_renamed_1496(sprvsl.cfr_renamed_9(".j<\u0000,l\"\u0000!@?N\u000bK\u0006A\b"));
                algorithmParameters = sprcej3.cfr_renamed_3.cfr_renamed_1540(sprqxn.cfr_renamed_9("x\u0005v"));
                object = sprtnk.cfr_renamed_23(sprbqm2.cfr_renamed_284());
                algorithmParameters.init(((sprqqe)object).cfr_renamed_91());
            } else if (sprbqm2.cfr_renamed_593().cfr_renamed_5078(sprwr.cfr_renamed_185)) {
                sprcej sprcej4 = this;
                sprcej2 = sprcej4;
                cipher = sprcej4.cfr_renamed_3.cfr_renamed_1496(sprvsl.cfr_renamed_9("n*|$x?"));
                algorithmParameters = null;
            } else {
                throw new IOException(sprqxn.cfr_renamed_9("\u0004x\u0000p\u0015\u001b\r^?h2T4^fX'U(T2\u001b4^%T!U/A#\u001b6I)O#X2R)Uf^(X4B6O/T(\u001b'W!T4R2S+\u0015"));
            }
            object = sprcej2.cfr_renamed_9298(spritm2.cfr_renamed_2429(), arg0, arg2 != null ? arg2 : new char[]{}, 32);
            Cipher cipher2 = cipher;
            cipher2.init(2, (Key)new SecretKeySpec((byte[])object, sprvsl.cfr_renamed_9(".j<")), algorithmParameters);
            byte[] byArray = cipher2.doFinal(arg3);
            return byArray;
        }
        catch (IOException iOException) {
            throw iOException;
        }
        catch (Exception exception) {
            throw new IOException(exception.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Date engineGetCreationDate(String arg0) {
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        if (sprean2 == null) {
            return null;
        }
        try {
            return sprean2.cfr_renamed_9300().cfr_renamed_110();
        }
        catch (ParseException parseException) {
            return new Date();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineSetCertificateEntry(String arg0, Certificate arg1) throws KeyStoreException {
        Date date;
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        Date date2 = date = new Date();
        if (sprean2 != null) {
            if (!sprean2.cfr_renamed_324().equals(cfr_renamed_0)) {
                throw new KeyStoreException(new StringBuilder().insert(0, sprqxn.cfr_renamed_9("\u0004x\u0000p\u0015\u001b\r^?h2T4^fZ*I#Z\"BfS'HfZfP#Bf^(O4BfL/O.\u001b'W/Z5\u001b")).append(arg0).toString());
            }
            date = this.cfr_renamed_9301(sprean2, date);
        }
        try {
            this.cfr_renamed_1.put(arg0, new sprean(cfr_renamed_0, arg0, date, date2, arg1.getEncoded(), null));
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new sprihj(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("-l)d<\u000f$J\u0016|\u001b@\u001dJOZ\u0001N\rC\n\u000f\u001b@OG\u000eA\u000bC\n\u000f\fJ\u001d[\u0006I\u0006L\u000e[\n\u0015O")).append(certificateEncodingException.getMessage()).toString(), certificateEncodingException);
        }
        this.cfr_renamed_86 = date2;
    }

    @Override
    public int engineSize() {
        return this.cfr_renamed_1.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Certificate cfr_renamed_9302(Object arg0) {
        if (this.cfr_renamed_3 != null) {
            try {
                CertificateFactory certificateFactory = this.cfr_renamed_3.cfr_renamed_1550(sprqxn.cfr_renamed_9("ch\u000ev\u0002"));
                return certificateFactory.generateCertificate(new ByteArrayInputStream(sprndm.cfr_renamed_23(arg0).cfr_renamed_91()));
            }
            catch (Exception exception) {
                return null;
            }
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance(sprvsl.cfr_renamed_9("7\u0001Z\u001fV"));
            return certificateFactory.generateCertificate(new ByteArrayInputStream(sprndm.cfr_renamed_23(arg0).cfr_renamed_91()));
        }
        catch (Exception exception) {
            return null;
        }
    }

    private /* synthetic */ sprwpm cfr_renamed_9282(sprwpm arg0, int arg1) {
        if (sprow.cfr_renamed_957.cfr_renamed_5078(arg0.cfr_renamed_593())) {
            sprqom sprqom2 = sprqom.cfr_renamed_23(arg0.cfr_renamed_284());
            byte[] byArray = new byte[sprqom2.cfr_renamed_1477().length];
            this.cfr_renamed_9280().nextBytes(byArray);
            sprqom sprqom3 = new sprqom(byArray, sprqom2.cfr_renamed_7383(), sprqom2.cfr_renamed_1195(), sprqom2.cfr_renamed_7384(), BigInteger.valueOf(arg1));
            return new sprwpm(sprow.cfr_renamed_957, sprqom3);
        }
        spryrm spryrm2 = spryrm.cfr_renamed_23(arg0.cfr_renamed_284());
        byte[] byArray = new byte[spryrm2.cfr_renamed_1477().length];
        this.cfr_renamed_9280().nextBytes(byArray);
        spryrm spryrm3 = new spryrm(byArray, spryrm2.cfr_renamed_1478().intValue(), arg1, spryrm2.cfr_renamed_2386());
        return new sprwpm(sprdl.cfr_renamed_3247, spryrm3);
    }

    private /* synthetic */ Cipher cfr_renamed_9299(String arg0, byte[] arg1) throws NoSuchAlgorithmException, NoSuchPaddingException, InvalidKeyException, NoSuchProviderException {
        Cipher cipher = this.cfr_renamed_3.cfr_renamed_1496(arg0);
        cipher.init(1, new SecretKeySpec(arg1, sprqxn.cfr_renamed_9("z\u0003h")));
        return cipher;
    }

    private /* synthetic */ boolean cfr_renamed_9297(sprdfk arg0, sprwpm arg1) {
        if (!arg0.cfr_renamed_593().cfr_renamed_5078(arg1.cfr_renamed_593())) {
            return false;
        }
        if (sprow.cfr_renamed_957.cfr_renamed_5078(arg1.cfr_renamed_593())) {
            if (!(arg0 instanceof sprmfk)) {
                return false;
            }
            sprmfk sprmfk2 = (sprmfk)arg0;
            sprqom sprqom2 = sprqom.cfr_renamed_23(arg1.cfr_renamed_284());
            if (sprmfk2.cfr_renamed_4598() != sprqom2.cfr_renamed_1477().length || sprmfk2.cfr_renamed_1195() != sprqom2.cfr_renamed_1195().intValue() || sprmfk2.cfr_renamed_7383() != sprqom2.cfr_renamed_7383().intValue() || sprmfk2.cfr_renamed_7384() != sprqom2.cfr_renamed_7384().intValue()) {
                return false;
            }
        } else {
            if (!(arg0 instanceof spripk)) {
                return false;
            }
            spripk spripk2 = (spripk)arg0;
            spryrm spryrm2 = spryrm.cfr_renamed_23(arg1.cfr_renamed_284());
            if (spripk2.cfr_renamed_4598() != spryrm2.cfr_renamed_1477().length || spripk2.cfr_renamed_1478() != spryrm2.cfr_renamed_1478().intValue()) {
                return false;
            }
        }
        return true;
    }

    private /* synthetic */ byte[] cfr_renamed_9298(sprwpm arg0, String arg1, char[] arg2, int arg3) throws IOException {
        byte[] byArray = sprkuh.cfr_renamed_1516(arg2);
        byte[] byArray2 = sprkuh.cfr_renamed_1516(arg1.toCharArray());
        int n = arg3;
        if (sprow.cfr_renamed_957.cfr_renamed_5078(arg0.cfr_renamed_593())) {
            byte[] byArray3;
            sprqom sprqom2 = sprqom.cfr_renamed_23(arg0.cfr_renamed_284());
            if (sprqom2.cfr_renamed_4600() != null) {
                byArray3 = byArray;
                n = sprqom2.cfr_renamed_4600().intValue();
            } else {
                if (n == -1) {
                    throw new IOException(sprvsl.cfr_renamed_9("A\u0000\u000f\u0004J\u0016c\nA\b[\u0007\u000f\t@\u001aA\u000b\u000f\u0006AO|\f]\u0016_\u001b\u007f\u000e]\u000eB\u001c"));
                }
                byArray3 = byArray;
            }
            return sprlxk.cfr_renamed_3496(sproze.cfr_renamed_543(byArray3, byArray2), sprqom2.cfr_renamed_1477(), sprqom2.cfr_renamed_7383().intValue(), sprqom2.cfr_renamed_1195().intValue(), sprqom2.cfr_renamed_1195().intValue(), n);
        }
        if (arg0.cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_3247)) {
            spryrm spryrm2;
            spryrm spryrm3 = spryrm.cfr_renamed_23(arg0.cfr_renamed_284());
            if (spryrm3.cfr_renamed_4600() != null) {
                spryrm spryrm4 = spryrm3;
                spryrm2 = spryrm4;
                n = spryrm4.cfr_renamed_4600().intValue();
            } else {
                if (n == -1) {
                    throw new IOException(sprqxn.cfr_renamed_9("(TfP#B\n^(\\2Sf])N(_fR(\u001b\u0016Y-_ \t\u0016Z4Z+H"));
                }
                spryrm2 = spryrm3;
            }
            if (spryrm2.cfr_renamed_2386().cfr_renamed_593().cfr_renamed_5078(sprdl.cfr_renamed_2956)) {
                sprnrk sprnrk2;
                sprnrk sprnrk3 = sprnrk2 = new sprnrk(new sprocl());
                sprnrk3.cfr_renamed_1515(sproze.cfr_renamed_543(byArray, byArray2), spryrm3.cfr_renamed_1477(), spryrm3.cfr_renamed_1478().intValue());
                return ((sprtpk)sprnrk3.cfr_renamed_249(n * 8)).cfr_renamed_1521();
            }
            if (spryrm3.cfr_renamed_2386().cfr_renamed_593().cfr_renamed_5078(sprwr.cfr_renamed_119)) {
                sprnrk sprnrk4;
                sprnrk sprnrk5 = sprnrk4 = new sprnrk(new sprzfl(512));
                sprnrk5.cfr_renamed_1515(sproze.cfr_renamed_543(byArray, byArray2), spryrm3.cfr_renamed_1477(), spryrm3.cfr_renamed_1478().intValue());
                return ((sprtpk)sprnrk5.cfr_renamed_249(n * 8)).cfr_renamed_1521();
            }
            throw new IOException(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("-l)d<\u000f$J\u0016|\u001b@\u001dJU\u000f\u001aA\u001dJ\f@\bA\u0006U\nKOb.lO\u007f-d+\u000f?})\u0015O")).append(spryrm3.cfr_renamed_2386().cfr_renamed_593()).toString());
        }
        throw new IOException(sprqxn.cfr_renamed_9("\u0004x\u0000p\u0015\u001b\r^?h2T4^|\u001b3U4^%T!U/A#_fv\u0007xfk\u0004p\u0002\u0015"));
    }

    @Override
    public Certificate engineGetCertificate(String arg0) {
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        if (sprean2 != null) {
            if (sprean2.cfr_renamed_324().equals(cfr_renamed_119) || sprean2.cfr_renamed_324().equals(cfr_renamed_102)) {
                sprndm[] sprndmArray = sprkbn.cfr_renamed_23(sprean2.cfr_renamed_2609()).cfr_renamed_2454();
                return this.cfr_renamed_9302(sprndmArray[0]);
            }
            if (sprean2.cfr_renamed_324().equals(cfr_renamed_0)) {
                return this.cfr_renamed_9302(sprean2.cfr_renamed_2609());
            }
        }
        return null;
    }

    @Override
    public Certificate[] engineGetCertificateChain(String arg0) {
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        if (sprean2 != null && (sprean2.cfr_renamed_324().equals(cfr_renamed_119) || sprean2.cfr_renamed_324().equals(cfr_renamed_102))) {
            int n;
            sprndm[] sprndmArray = sprkbn.cfr_renamed_23(sprean2.cfr_renamed_2609()).cfr_renamed_2454();
            Certificate[] certificateArray = new X509Certificate[sprndmArray.length];
            int n2 = n = 0;
            while (n2 != certificateArray.length) {
                int n3 = n++;
                certificateArray[n3] = this.cfr_renamed_9302(sprndmArray[n3]);
                n2 = n;
            }
            return certificateArray;
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_9283(byte[] arg0, sprddm arg1, sprwpm arg2, char[] arg3) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        String string = arg1.cfr_renamed_593().cfr_renamed_19();
        Mac mac = this.cfr_renamed_3.cfr_renamed_1508(string);
        try {
            mac.init(new SecretKeySpec(this.cfr_renamed_9298(arg2, sprvsl.cfr_renamed_9("&a;j(}&{6p,g*l$"), arg3 != null ? arg3 : new char[]{}, -1), string));
            return mac.doFinal(arg0);
        }
        catch (InvalidKeyException invalidKeyException) {
            throw new IOException(new StringBuilder().insert(0, sprqxn.cfr_renamed_9("x'U(T2\u001b5^2\u001b3Kfv\u0007xfX'W%N*Z2R)U|\u001b")).append(invalidKeyException.getMessage()).toString());
        }
    }

    private /* synthetic */ void cfr_renamed_9303(byte[] arg0, spruzm arg1, char[] arg2) throws NoSuchAlgorithmException, IOException, NoSuchProviderException {
        if (!sproze.cfr_renamed_559(this.cfr_renamed_9283(arg0, arg1.cfr_renamed_4202(), arg1.cfr_renamed_9304(), arg2), arg1.cfr_renamed_1472())) {
            throw new IOException(sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\f@\u001d]\u001a_\u001bJ\u000b\u0015Ob.lOL\u000eC\fZ\u0003N\u001bF\u0000AOI\u000eF\u0003J\u000b"));
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineLoad(InputStream var1_1, char[] var2_2) throws IOException, NoSuchAlgorithmException, CertificateException {
        block20: {
            this.cfr_renamed_1.clear();
            this.cfr_renamed_79.clear();
            this.cfr_renamed_93 = null;
            this.cfr_renamed_86 = null;
            this.cfr_renamed_132 = null;
            if (arg0 == null) {
                v0 = this;
                v0.cfr_renamed_86 = v0.cfr_renamed_93 = new Date();
                v1 = this;
                v1.cfr_renamed_96 = null;
                this.cfr_renamed_152 = null;
                v1.cfr_renamed_132 = new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4);
                this.cfr_renamed_137 = this.cfr_renamed_9305(sprdl.cfr_renamed_3247, 64);
                return;
            }
            var3_3 = new sprrzm((InputStream)arg0);
            try {
                var4_4 = sprnan.cfr_renamed_23(var3_3.cfr_renamed_24());
            }
            catch (Exception var5_5) {
                throw new IOException(var5_5.getMessage());
            }
            var5_6 = var4_4.cfr_renamed_9306();
            if (var5_6.cfr_renamed_324() == 0) {
                var7_7 /* !! */  = spruzm.cfr_renamed_23(var5_6.cfr_renamed_9306());
                this.cfr_renamed_132 = var7_7 /* !! */ .cfr_renamed_4202();
                this.cfr_renamed_137 = var7_7 /* !! */ .cfr_renamed_9304();
                var6_8 = this.cfr_renamed_132;
                try {
                    this.cfr_renamed_9303(var4_4.cfr_renamed_9307().cfr_renamed_119().cfr_renamed_91(), var7_7 /* !! */ , (char[])arg1);
                }
                catch (NoSuchProviderException var8_9) {
                    throw new IOException(var8_9.getMessage());
                }
            }
            if (var5_6.cfr_renamed_324() != 1) {
                throw new IOException(sprqxn.cfr_renamed_9("y\u0005}\rhfp#B\u0015O)I#\u001b3U'Y*^fO)\u001b4^%T!U/A#\u001b/U2^!I/O?\u001b%S#X-\u0015"));
            }
            var7_7 /* !! */  = sprbcn.cfr_renamed_23(var5_6.cfr_renamed_9306());
            var6_8 = var7_7 /* !! */ .cfr_renamed_89();
            try {
                var8_10 = var7_7 /* !! */ .cfr_renamed_617();
                if (this.cfr_renamed_152 != null) {
                    if (var8_10 == null) {
                        throw new IOException(sprqxn.cfr_renamed_9("M'W/_'O)IfH6^%R R#_fY3OfU)\u001b%^4O/]%Z2^5\u001b/UfH2T4^"));
                    }
                    var9_12 = this.cfr_renamed_3.cfr_renamed_1550(sprvsl.cfr_renamed_9("7\u0001Z\u001fV"));
                    var10_14 = new X509Certificate[((sprndm[])var8_10).length];
                    v2 = var11_15 = 0;
                    while (v2 != ((X509Certificate[])var10_14).length) {
                        v3 = var11_15;
                        v4 = new ByteArrayInputStream(var8_10[var11_15].cfr_renamed_91());
                        var10_14[v3] = (X509Certificate)var9_12.generateCertificate(v4);
                        v2 = ++var11_15;
                    }
                    if (!this.cfr_renamed_152.cfr_renamed_9308((X509Certificate[])var10_14)) {
                        throw new IOException(sprqxn.cfr_renamed_9("%^4O/]/X'O#\u001b%S'R(\u001b/UfP#BfH2T4^fH/\\(Z2N4^fU)OfM'W/_"));
                    }
                    this.cfr_renamed_9309(var4_4.cfr_renamed_9307(), (sprbcn)var7_7 /* !! */ , var10_14[0].getPublicKey());
                } else {
                    this.cfr_renamed_9309(var4_4.cfr_renamed_9307(), (sprbcn)var7_7 /* !! */ , this.cfr_renamed_96);
                }
            }
            catch (GeneralSecurityException var8_11) {
                throw new IOException(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("\n]\u001d@\u001d\u000f\u0019J\u001dF\tV\u0006A\b\u000f\u001cF\bA\u000e[\u001a]\n\u0015O")).append(var8_11.getMessage()).toString(), var8_11);
            }
            v5 /* !! */  = var7_7 /* !! */  = var4_4.cfr_renamed_9307();
            if (!(var7_7 /* !! */  instanceof sprzcn)) break block20;
            var9_12 = (sprzcn)v5 /* !! */ ;
            var10_14 = var9_12.cfr_renamed_1445();
            v6 = this;
            v7 = v6;
            var8_10 = spraym.cfr_renamed_23(v6.cfr_renamed_9285(sprvsl.cfr_renamed_9("|;`=j0j!l=v?{&`!"), (sprddm)var10_14, (char[])arg1, var9_12.cfr_renamed_4178().cfr_renamed_186()));
            ** GOTO lbl75
        }
        var8_10 = spraym.cfr_renamed_23(v5 /* !! */ );
        try {
            v7 = this;
lbl75:
            // 2 sources

            v7.cfr_renamed_93 = var8_10.cfr_renamed_9310().cfr_renamed_110();
            this.cfr_renamed_86 = var8_10.cfr_renamed_9300().cfr_renamed_110();
        }
        catch (ParseException var9_13) {
            throw new IOException(sprqxn.cfr_renamed_9("\u0004x\u0000p\u0015\u001b\r^?h2T4^fN(Z$W#\u001b2TfK'I5^fH2T4^f_'O'\u001b/U T4V'O/T(\u0015"));
        }
        if (!var8_10.cfr_renamed_9311().equals(var6_8)) {
            throw new IOException(sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\u001c[\u0000]\nk\u000e[\u000e\u000f\u0006A\u001bJ\b]\u0006[\u0016\u000f\u000eC\b@\u001dF\u001bG\u0002\u000f\u000b@\n\\OA\u0000[OB\u000e[\fGO\\\u001b@\u001dJOF\u0001[\nH\u001dF\u001bVON\u0003H\u0000]\u0006[\u0007BA"));
        }
        v8 = var9_12 = var8_10.cfr_renamed_9312().iterator();
        while (true) {
            if (!v8.hasNext()) {
                return;
            }
            v9 = var9_12;
            v8 = v9;
            var10_14 = sprean.cfr_renamed_23(v9.next());
            this.cfr_renamed_1.put(var10_14.cfr_renamed_4028(), (sprean)var10_14);
        }
    }

    private /* synthetic */ sprwpm cfr_renamed_9305(sprlem arg0, int arg1) {
        byte[] byArray = new byte[64];
        this.cfr_renamed_9280().nextBytes(byArray);
        if (sprdl.cfr_renamed_3247.cfr_renamed_5078(arg0)) {
            return new sprwpm(sprdl.cfr_renamed_3247, new spryrm(byArray, 51200, arg1, new sprddm(sprdl.cfr_renamed_2956, sprpen.cfr_renamed_4)));
        }
        throw new IllegalStateException(new StringBuilder().insert(0, sprqxn.cfr_renamed_9("3U-U)L(\u001b\"^4R0Z2R)UfZ*\\)I/O.V|\u001b")).append(arg0).toString());
    }

    @Override
    public boolean engineIsCertificateEntry(String arg0) {
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        if (sprean2 != null) {
            return sprean2.cfr_renamed_324().equals(cfr_renamed_0);
        }
        return false;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineSetKeyEntry(String arg0, byte[] arg1, Certificate[] arg2) throws KeyStoreException {
        sprllm sprllm2;
        sprcej sprcej2;
        Date date;
        Date date2 = date = new Date();
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        if (sprean2 != null) {
            date = this.cfr_renamed_9301(sprean2, date);
        }
        if (arg2 == null) {
            try {
                this.cfr_renamed_1.put(arg0, new sprean(cfr_renamed_105, arg0, date, date2, arg1, null));
                sprcej2 = this;
            }
            catch (Exception exception) {
                throw new sprihj(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\nW\fJ\u001f[\u0006@\u0001\u000f\u001c[\u0000]\u0006A\b\u000f\u001f]\u0000[\nL\u001bJ\u000b\u000f\u001f]\u0006Y\u000e[\n\u000f\u0004J\u0016\u0015O")).append(exception.toString()).toString(), exception);
            }
        }
        try {
            sprllm2 = sprllm.cfr_renamed_23(arg1);
        }
        catch (Exception exception) {
            throw new sprihj(sprvsl.cfr_renamed_9("-l)d<\u000f$J\u0016|\u001b@\u001dJO_\u001dF\u0019N\u001bJOD\nVOJ\u0001L\u0000K\u0006A\b\u000f\u0002Z\u001c[OM\n\u000f\u000eAOj\u0001L\u001dV\u001f[\nK?]\u0006Y\u000e[\nd\nV&A\t@A"), exception);
        }
        {
            this.cfr_renamed_79.remove(arg0);
            this.cfr_renamed_1.put(arg0, new sprean(cfr_renamed_102, arg0, date, date2, this.cfr_renamed_9279(sprllm2, arg2).cfr_renamed_91(), null));
        }
        sprcej2 = this;
        sprcej2.cfr_renamed_86 = date2;
    }

    private /* synthetic */ sprddm cfr_renamed_9291(Key arg0, spryck arg1) throws IOException {
        if (arg0 == null) {
            return null;
        }
        if (arg0 instanceof sprzg) {
            if (arg1 == spryck.cfr_renamed_91) {
                return new sprddm(sprbr.cfr_renamed_724);
            }
            if (arg1 == spryck.cfr_renamed_1) {
                return new sprddm(sprwr.cfr_renamed_102);
            }
        }
        if (arg0 instanceof DSAKey) {
            if (arg1 == spryck.cfr_renamed_0) {
                return new sprddm(sprwr.cfr_renamed_1337);
            }
            if (arg1 == spryck.cfr_renamed_2) {
                return new sprddm(sprwr.cfr_renamed_1344);
            }
        }
        if (arg0 instanceof RSAKey) {
            if (arg1 == spryck.cfr_renamed_3) {
                return new sprddm(sprdl.cfr_renamed_84, sprpen.cfr_renamed_4);
            }
            if (arg1 == spryck.cfr_renamed_4) {
                return new sprddm(sprwr.cfr_renamed_41, sprpen.cfr_renamed_4);
            }
        }
        throw new IOException(sprqxn.cfr_renamed_9("N(P(T1UfH/\\(Z2N4^fZ*\\)I/O.V"));
    }

    @Override
    public void engineSetKeyEntry(String arg0, Key arg1, char[] arg2, Certificate[] arg3) throws KeyStoreException {
        sprcej sprcej2;
        Date date;
        Date date2 = date = new Date();
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        if (sprean2 != null) {
            date = this.cfr_renamed_9301(sprean2, date);
        }
        this.cfr_renamed_79.remove(arg0);
        if (arg1 instanceof PrivateKey) {
            if (arg3 == null) {
                throw new KeyStoreException(sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\u001dJ\u001eZ\u0006]\n\\ONOL\n]\u001bF\tF\fN\u001bJOL\u0007N\u0006AOI\u0000]O_\u001dF\u0019N\u001bJOD\nVO\\\u001b@\u001dN\bJA"));
            }
            try {
                sprllm sprllm2;
                Object object;
                sprcej sprcej3;
                byte[] byArray = arg1.getEncoded();
                sprcej sprcej4 = this;
                sprwpm sprwpm2 = sprcej4.cfr_renamed_9305(sprdl.cfr_renamed_3247, 32);
                byte[] byArray2 = sprcej4.cfr_renamed_9298(sprwpm2, sprqxn.cfr_renamed_9("\u0016i\u000fm\u0007o\u0003d\r~\u001fd\u0003u\u0005i\u001fk\u0012r\tu"), arg2 != null ? arg2 : new char[]{}, 32);
                if (this.cfr_renamed_2.cfr_renamed_5078(sprwr.cfr_renamed_1228)) {
                    sprcej sprcej5 = this;
                    sprcej3 = sprcej5;
                    object = sprcej5.cfr_renamed_9299(sprvsl.cfr_renamed_9(".j<\u0000,l\"\u0000!@?N\u000bK\u0006A\b"), byArray2);
                    byte[] byArray3 = ((Cipher)object).doFinal(byArray);
                    AlgorithmParameters algorithmParameters = ((Cipher)object).getParameters();
                    spritm spritm2 = new spritm(sprwpm2, new sprbqm(sprwr.cfr_renamed_1228, sprtnk.cfr_renamed_23(algorithmParameters.getEncoded())));
                    sprllm2 = new sprllm(new sprddm(sprdl.cfr_renamed_112, spritm2), byArray3);
                } else {
                    sprcej sprcej6 = this;
                    sprcej3 = sprcej6;
                    object = sprcej6.cfr_renamed_9299(sprqxn.cfr_renamed_9("\u0007~\u0015p\u0011k"), byArray2);
                    byte[] byArray4 = ((Cipher)object).doFinal(byArray);
                    spritm spritm3 = new spritm(sprwpm2, new sprbqm(sprwr.cfr_renamed_185));
                    sprllm2 = new sprllm(new sprddm(sprdl.cfr_renamed_112, spritm3), byArray4);
                }
                object = sprcej3.cfr_renamed_9279(sprllm2, arg3);
                this.cfr_renamed_1.put(arg0, new sprean(cfr_renamed_119, arg0, date, date2, ((sprqqe)object).cfr_renamed_91(), null));
                sprcej2 = this;
            }
            catch (Exception exception) {
                throw new sprihj(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\nW\fJ\u001f[\u0006@\u0001\u000f\u001c[\u0000]\u0006A\b\u000f\u001f]\u0006Y\u000e[\n\u000f\u0004J\u0016\u0015O")).append(exception.toString()).toString(), exception);
            }
        } else if (arg1 instanceof SecretKey) {
            if (arg3 != null) {
                throw new KeyStoreException(sprqxn.cfr_renamed_9("\u0004x\u0000p\u0015\u001b\r^?h2T4^fX'U(T2\u001b5O)I#\u001b%^4O/]/X'O#\u001b%S'R(\u001b1R2SfH#X4^2\u001b-^?\u0015"));
            }
            try {
                sprcej sprcej7;
                sprqqe sprqqe2;
                sprcej sprcej8;
                sprafn sprafn2;
                byte[] byArray = arg1.getEncoded();
                sprcej sprcej9 = this;
                sprwpm sprwpm3 = sprcej9.cfr_renamed_9305(sprdl.cfr_renamed_3247, 32);
                byte[] byArray5 = sprcej9.cfr_renamed_9298(sprwpm3, sprvsl.cfr_renamed_9("<j,}*{0d*v0j!l=v?{&`!"), arg2 != null ? arg2 : new char[]{}, 32);
                String string = sprkoe.cfr_renamed_116(arg1.getAlgorithm());
                if (string.indexOf(sprqxn.cfr_renamed_9("z\u0003h")) > -1) {
                    sprafn2 = new sprafn(sprwr.cfr_renamed_91, byArray);
                    sprcej8 = this;
                } else {
                    sprqqe2 = cfr_renamed_4.get(string);
                    if (sprqqe2 != null) {
                        sprafn2 = new sprafn((sprlem)sprqqe2, byArray);
                        sprcej8 = this;
                    } else {
                        sprqqe2 = cfr_renamed_4.get(new StringBuilder().insert(0, string).append(".").append(byArray.length * 8).toString());
                        if (sprqqe2 != null) {
                            sprafn2 = new sprafn((sprlem)sprqqe2, byArray);
                            sprcej8 = this;
                        } else {
                            throw new KeyStoreException(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\fN\u0001A\u0000[O]\nL\u0000H\u0001F\u0015JO\\\nL\u001dJ\u001b\u000f\u0004J\u0016\u000fG")).append(string).append(sprqxn.cfr_renamed_9("o\u001b T4\u001b5O)I'\\#\u0015")).toString());
                        }
                    }
                }
                sprcej sprcej10 = this;
                if (sprcej8.cfr_renamed_2.cfr_renamed_5078(sprwr.cfr_renamed_1228)) {
                    Cipher cipher = sprcej10.cfr_renamed_9299(sprvsl.cfr_renamed_9(".j<\u0000,l\"\u0000!@?N\u000bK\u0006A\b"), byArray5);
                    byte[] byArray6 = cipher.doFinal(sprafn2.cfr_renamed_91());
                    AlgorithmParameters algorithmParameters = cipher.getParameters();
                    spritm spritm4 = new spritm(sprwpm3, new sprbqm(sprwr.cfr_renamed_1228, sprtnk.cfr_renamed_23(algorithmParameters.getEncoded())));
                    sprqqe2 = new sprkcn(new sprddm(sprdl.cfr_renamed_112, spritm4), byArray6);
                    sprcej7 = this;
                } else {
                    Cipher cipher = sprcej10.cfr_renamed_9299(sprqxn.cfr_renamed_9("\u0007~\u0015p\u0011k"), byArray5);
                    byte[] byArray7 = cipher.doFinal(sprafn2.cfr_renamed_91());
                    spritm spritm5 = new spritm(sprwpm3, new sprbqm(sprwr.cfr_renamed_185));
                    sprqqe2 = new sprkcn(new sprddm(sprdl.cfr_renamed_112, spritm5), byArray7);
                    sprcej7 = this;
                }
                sprcej7.cfr_renamed_1.put(arg0, new sprean(cfr_renamed_112, arg0, date, date2, sprqqe2.cfr_renamed_91(), null));
                sprcej2 = this;
            }
            catch (Exception exception) {
                throw new sprihj(new StringBuilder().insert(0, sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\nW\fJ\u001f[\u0006@\u0001\u000f\u001c[\u0000]\u0006A\b\u000f\u001f]\u0006Y\u000e[\n\u000f\u0004J\u0016\u0015O")).append(exception.toString()).toString(), exception);
            }
        } else {
            throw new KeyStoreException(sprqxn.cfr_renamed_9("y\u0005}\rhfp#B\u0015O)I#\u001b3U'Y*^fO)\u001b4^%T!U/A#\u001b-^?\u0015"));
        }
        sprcej2.cfr_renamed_86 = date2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Date cfr_renamed_9301(sprean arg0, Date arg1) {
        try {
            return arg0.cfr_renamed_9310().cfr_renamed_110();
        }
        catch (ParseException parseException) {
            return arg1;
        }
    }

    private /* synthetic */ void cfr_renamed_9309(sprco arg0, sprbcn arg1, PublicKey arg2) throws GeneralSecurityException, IOException {
        Signature signature;
        Signature signature2 = signature = this.cfr_renamed_3.cfr_renamed_1539(arg1.cfr_renamed_89().cfr_renamed_593().cfr_renamed_19());
        signature.initVerify(arg2);
        signature2.update(arg0.cfr_renamed_119().cfr_renamed_104("DER"));
        if (!signature2.verify(arg1.cfr_renamed_79().cfr_renamed_186())) {
            throw new IOException(sprvsl.cfr_renamed_9("m,i$|Od\nV<[\u0000]\n\u000f\f@\u001d]\u001a_\u001bJ\u000b\u0015O\\\u0006H\u0001N\u001bZ\u001dJOL\u000eC\fZ\u0003N\u001bF\u0000AOI\u000eF\u0003J\u000b"));
        }
    }

    @Override
    public boolean engineIsKeyEntry(String arg0) {
        sprean sprean2 = this.cfr_renamed_1.get(arg0);
        if (sprean2 != null) {
            BigInteger bigInteger = sprean2.cfr_renamed_324();
            return bigInteger.equals(cfr_renamed_119) || bigInteger.equals(cfr_renamed_112) || bigInteger.equals(cfr_renamed_102) || bigInteger.equals(cfr_renamed_105);
        }
        return false;
    }
}

