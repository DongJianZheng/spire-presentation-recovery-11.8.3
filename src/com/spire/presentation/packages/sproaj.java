/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraw;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprbvk;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdal;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdwk;
import com.spire.presentation.packages.sprfwk;
import com.spire.presentation.packages.sprgbj;
import com.spire.presentation.packages.sprkuh;
import com.spire.presentation.packages.sprmve;
import com.spire.presentation.packages.sprngj;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvhm;
import com.spire.presentation.packages.sprvzy;
import com.spire.presentation.packages.sprwil;
import com.spire.presentation.packages.sprwlb;
import com.spire.presentation.packages.sprybl;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
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
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import java.util.Date;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sproaj
extends KeyStoreSpi
implements spraw {
    public static final int cfr_renamed_96 = 3;
    public Hashtable cfr_renamed_105;
    private static final String cfr_renamed_137 = "PBEWithSHAAnd3-KeyTripleDES-CBC";
    public SecureRandom cfr_renamed_79;
    public static final int cfr_renamed_107 = 1;
    private static final int cfr_renamed_132 = 20;
    public static final int cfr_renamed_102 = 2;
    public static final int cfr_renamed_93 = 0;
    private static final int cfr_renamed_86 = 2;
    private static final String cfr_renamed_152 = "PBEWithSHAAndTwofish-CBC";
    private static final int cfr_renamed_112 = 1024;
    public static final int cfr_renamed_119 = 0;
    private static final int cfr_renamed_91 = 20;
    private final sprrr cfr_renamed_0;
    public static final int cfr_renamed_1 = 1;
    public int cfr_renamed_2;
    public static final int cfr_renamed_3 = 4;
    public static final int cfr_renamed_4 = 2;

    @Override
    public void engineDeleteEntry(String arg0) throws KeyStoreException {
        if (this.cfr_renamed_105.get(arg0) == null) {
            return;
        }
        this.cfr_renamed_105.remove(arg0);
    }

    @Override
    public boolean engineIsCertificateEntry(String arg0) {
        sprgbj sprgbj2 = (sprgbj)this.cfr_renamed_105.get(arg0);
        return sprgbj2 != null && sprgbj2.cfr_renamed_324() == 1;
    }

    @Override
    public Certificate engineGetCertificate(String arg0) {
        sprgbj sprgbj2 = (sprgbj)this.cfr_renamed_105.get(arg0);
        if (sprgbj2 != null) {
            if (sprgbj2.cfr_renamed_324() == 1) {
                return (Certificate)sprgbj2.cfr_renamed_2456();
            }
            Certificate[] certificateArray = sprgbj2.cfr_renamed_2454();
            if (certificateArray != null) {
                return certificateArray[0];
            }
        }
        return null;
    }

    @Override
    public void engineSetKeyEntry(String arg0, byte[] arg1, Certificate[] arg2) throws KeyStoreException {
        this.cfr_renamed_105.put(arg0, new sprgbj(this, arg0, arg1, arg2));
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    private /* synthetic */ Key cfr_renamed_2453(DataInputStream arg0) throws IOException {
        block9: {
            block8: {
                v0 = arg0;
                var2_2 = v0.read();
                var3_3 = v0.readUTF();
                var4_4 = v0.readUTF();
                var5_5 = new byte[v0.readInt()];
                v0.readFully(var5_5);
                if (!var3_3.equals(sprvzy.cfr_renamed_9("Se@} \u0016")) && !var3_3.equals(sprwlb.cfr_renamed_9("\u0019w\noq"))) break block8;
                var6_6 /* !! */  = new PKCS8EncodedKeySpec(var5_5);
                v1 = var2_2;
                ** GOTO lbl-1000
            }
            if (!var3_3.equals(sprvzy.cfr_renamed_9("v-\u001b3\u0017")) && !var3_3.equals(sprwlb.cfr_renamed_9("d|\fp"))) break block9;
            var6_6 /* !! */  = new X509EncodedKeySpec(var5_5);
            v1 = var2_2;
            ** GOTO lbl-1000
        }
        if (var3_3.equals(sprvzy.cfr_renamed_9("|By"))) {
            return new SecretKeySpec(var5_5, var4_4);
        }
        throw new IOException(new StringBuilder().insert(0, sprwlb.cfr_renamed_9("\u0002Y0\u001c/S;Q(Hi")).append(var3_3).append(sprvzy.cfr_renamed_9("#@lZ#\\fMlImGpKg\u000f")).toString());
lbl-1000:
        // 2 sources

        {
            switch (v1) lbl-1000:
            // 2 sources

            {
                case 0: {
                    if (false) ** GOTO lbl-1000
                    return sprsci.cfr_renamed_5729(sprcom.cfr_renamed_23(var5_5));
                }
                case 1: {
                    return sprsci.cfr_renamed_5726(sprvhm.cfr_renamed_23(var5_5));
                }
                case 2: {
                    return this.cfr_renamed_0.cfr_renamed_1495(var4_4).generateSecret(var6_6 /* !! */ );
                }
            }
            throw new IOException(new StringBuilder().insert(0, sprwlb.cfr_renamed_9("\u0002Y0\u001c=E9Yi")).append(var2_2).append(sprvzy.cfr_renamed_9("#@lZ#\\fMlImGpKg\u000f")).toString());
        }
    }

    @Override
    public String engineGetCertificateAlias(Certificate arg0) {
        Enumeration enumeration = this.cfr_renamed_105.elements();
        while (enumeration.hasMoreElements()) {
            Object object;
            sprgbj sprgbj2 = (sprgbj)enumeration.nextElement();
            if (!(sprgbj2.cfr_renamed_2456() instanceof Certificate ? (object = (Certificate)sprgbj2.cfr_renamed_2456()).equals(arg0) : (object = sprgbj2.cfr_renamed_2454()) != null && object[0].equals(arg0))) continue;
            return sprgbj2.cfr_renamed_2458();
        }
        return null;
    }

    @Override
    public boolean engineContainsAlias(String arg0) {
        return this.cfr_renamed_105.get(arg0) != null;
    }

    public Enumeration engineAliases() {
        return this.cfr_renamed_105.keys();
    }

    private /* synthetic */ void cfr_renamed_2450(Key arg0, DataOutputStream arg1) throws IOException {
        DataOutputStream dataOutputStream;
        byte[] byArray = arg0.getEncoded();
        if (byArray == null) {
            throw new IOException(sprvzy.cfr_renamed_9("[mOaBf\u000ewA#]wAqK#KmMlJj@d\u000elH#^qAwK`ZfJ#EfW"));
        }
        if (arg0 instanceof PrivateKey) {
            DataOutputStream dataOutputStream2 = arg1;
            dataOutputStream = dataOutputStream2;
            dataOutputStream2.write(0);
        } else if (arg0 instanceof PublicKey) {
            DataOutputStream dataOutputStream3 = arg1;
            dataOutputStream = dataOutputStream3;
            dataOutputStream3.write(1);
        } else {
            DataOutputStream dataOutputStream4 = arg1;
            dataOutputStream = dataOutputStream4;
            dataOutputStream4.write(2);
        }
        dataOutputStream.writeUTF(arg0.getFormat());
        DataOutputStream dataOutputStream5 = arg1;
        dataOutputStream5.writeUTF(arg0.getAlgorithm());
        dataOutputStream5.writeInt(byArray.length);
        arg1.write(byArray);
    }

    @Override
    public int engineSize() {
        return this.cfr_renamed_105.size();
    }

    public static /* synthetic */ Key cfr_renamed_9313(sproaj arg0, DataInputStream arg1) throws IOException {
        return arg0.cfr_renamed_2453(arg1);
    }

    @Override
    public Date engineGetCreationDate(String arg0) {
        sprgbj sprgbj2 = (sprgbj)this.cfr_renamed_105.get(arg0);
        if (sprgbj2 != null) {
            return sprgbj2.cfr_renamed_110();
        }
        return null;
    }

    public void cfr_renamed_2449(InputStream arg0) throws IOException {
        int n;
        DataInputStream dataInputStream = new DataInputStream(arg0);
        int n2 = n = dataInputStream.read();
        while (n2 > 0) {
            DataInputStream dataInputStream2;
            String string = dataInputStream.readUTF();
            DataInputStream dataInputStream3 = dataInputStream;
            Date date = new Date(dataInputStream3.readLong());
            int n3 = dataInputStream3.readInt();
            Certificate[] certificateArray = null;
            if (n3 != 0) {
                int n4;
                certificateArray = new Certificate[n3];
                int n5 = n4 = 0;
                while (n5 != n3) {
                    certificateArray[n4++] = this.cfr_renamed_2451(dataInputStream);
                    n5 = n4;
                }
            }
            switch (n) {
                case 1: {
                    sproaj sproaj2 = this;
                    while (false) {
                    }
                    Certificate certificate = sproaj2.cfr_renamed_2451(dataInputStream);
                    sproaj2.cfr_renamed_105.put(string, new sprgbj(this, string, date, 1, certificate));
                    dataInputStream2 = dataInputStream;
                    break;
                }
                case 2: {
                    sproaj sproaj3 = this;
                    Key key = sproaj3.cfr_renamed_2453(dataInputStream);
                    sproaj3.cfr_renamed_105.put(string, new sprgbj(this, string, date, 2, key, certificateArray));
                    dataInputStream2 = dataInputStream;
                    break;
                }
                case 3: 
                case 4: {
                    DataInputStream dataInputStream4 = dataInputStream;
                    dataInputStream2 = dataInputStream4;
                    byte[] byArray = new byte[dataInputStream4.readInt()];
                    dataInputStream4.readFully(byArray);
                    this.cfr_renamed_105.put(string, new sprgbj(this, string, date, n, byArray, certificateArray));
                    break;
                }
                default: {
                    throw new IOException(sprwlb.cfr_renamed_9("\u001cR\"R&K'\u001c&^#Y*HiH0L,\u001c RiO=S;Yg"));
                }
            }
            n2 = dataInputStream2.read();
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Cipher cfr_renamed_2455(String arg0, int arg1, char[] arg2, byte[] arg3, int arg4) throws IOException {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(arg2);
            sproaj sproaj2 = this;
            SecretKeyFactory secretKeyFactory = sproaj2.cfr_renamed_0.cfr_renamed_1495(arg0);
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arg3, arg4);
            Cipher cipher = sproaj2.cfr_renamed_0.cfr_renamed_1496(arg0);
            cipher.init(arg1, (Key)secretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipher;
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprvzy.cfr_renamed_9("kq\\l\\#GmGwGbBj]j@d\u000epZl\\f\u000elH#EfW#]wAqK9\u000e")).append(exception).toString());
        }
    }

    @Override
    public Key engineGetKey(String arg0, char[] arg1) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        sprgbj sprgbj2 = (sprgbj)this.cfr_renamed_105.get(arg0);
        if (sprgbj2 == null || sprgbj2.cfr_renamed_324() == 1) {
            return null;
        }
        return (Key)sprgbj2.cfr_renamed_2448(arg1);
    }

    @Override
    public boolean engineIsKeyEntry(String arg0) {
        sprgbj sprgbj2 = (sprgbj)this.cfr_renamed_105.get(arg0);
        return sprgbj2 != null && sprgbj2.cfr_renamed_324() != 1;
    }

    @Override
    public void engineStore(OutputStream arg0, char[] arg1) throws IOException {
        int n;
        DataOutputStream dataOutputStream = new DataOutputStream(arg0);
        byte[] byArray = new byte[20];
        int n2 = 1024 + (this.cfr_renamed_79.nextInt() & 0x3FF);
        this.cfr_renamed_79.nextBytes(byArray);
        DataOutputStream dataOutputStream2 = dataOutputStream;
        dataOutputStream2.writeInt(this.cfr_renamed_2);
        dataOutputStream2.writeInt(byArray.length);
        DataOutputStream dataOutputStream3 = dataOutputStream;
        dataOutputStream3.write(byArray);
        dataOutputStream3.writeInt(n2);
        sprfwk sprfwk2 = new sprfwk(new sprwil());
        sprdwk sprdwk2 = new sprdwk(sprfwk2);
        sprbvk sprbvk2 = new sprbvk(new sprwil());
        byte[] byArray2 = sprkuh.cfr_renamed_1516(arg1);
        sprbvk2.cfr_renamed_1515(byArray2, byArray, n2);
        if (this.cfr_renamed_2 < 2) {
            sprfwk sprfwk3 = sprfwk2;
            sprfwk3.cfr_renamed_5692(((sprkuh)sprbvk2).cfr_renamed_1523(sprfwk3.cfr_renamed_2404()));
        } else {
            sprfwk2.cfr_renamed_5692(((sprkuh)sprbvk2).cfr_renamed_1523(sprfwk2.cfr_renamed_2404() * 8));
        }
        int n3 = n = 0;
        while (n3 != byArray2.length) {
            byArray2[n++] = 0;
            n3 = n;
        }
        this.cfr_renamed_2457(new sprmve(dataOutputStream, sprdwk2));
        sprfwk sprfwk4 = sprfwk2;
        byte[] byArray3 = new byte[sprfwk4.cfr_renamed_2404()];
        sprfwk4.cfr_renamed_1219(byArray3, 0);
        DataOutputStream dataOutputStream4 = dataOutputStream;
        dataOutputStream4.write(byArray3);
        dataOutputStream4.close();
    }

    @Override
    public void cfr_renamed_1613(SecureRandom arg0) {
        this.cfr_renamed_79 = arg0;
    }

    @Override
    public void engineSetCertificateEntry(String arg0, Certificate arg1) throws KeyStoreException {
        sprgbj sprgbj2 = (sprgbj)this.cfr_renamed_105.get(arg0);
        if (sprgbj2 != null && sprgbj2.cfr_renamed_324() != 1) {
            throw new KeyStoreException(new StringBuilder().insert(0, sprwlb.cfr_renamed_9("\"Y0\u001c:H&N,\u001c(P;Y(X0\u001c!]:\u001c(\u001c\"Y0\u001c,R=N0\u001c>U=Ti]%U(Oi")).append(arg0).toString());
        }
        this.cfr_renamed_105.put(arg0, new sprgbj(this, arg0, arg1));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineLoad(InputStream inputStream, char[] cArray) throws IOException {
        void arg1;
        void arg0;
        this.cfr_renamed_105.clear();
        if (inputStream == null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream((InputStream)arg0);
        int n = dataInputStream.readInt();
        if (n != 2 && n != 0 && n != 1) {
            throw new IOException(sprvzy.cfr_renamed_9("yqAmI#Xf\\pGl@#Ae\u000ehKz\u000epZl\\f\u0000"));
        }
        int n2 = dataInputStream.readInt();
        if (n2 <= 0) {
            throw new IOException(sprwlb.cfr_renamed_9("\u0000R?]%U-\u001c:]%HiX,H,_=Y-"));
        }
        byte[] byArray = new byte[n2];
        DataInputStream dataInputStream2 = dataInputStream;
        dataInputStream2.readFully(byArray);
        int n3 = dataInputStream2.readInt();
        sprfwk sprfwk2 = new sprfwk(new sprwil());
        if (arg1 != null && ((void)arg1).length != 0) {
            byte[] byArray2;
            sprbj sprbj2;
            byte[] byArray3 = sprkuh.cfr_renamed_1516((char[])arg1);
            sprbvk sprbvk2 = new sprbvk(new sprwil());
            sprbvk2.cfr_renamed_1515(byArray3, byArray, n3);
            if (n != 2) {
                sprbj2 = ((sprkuh)sprbvk2).cfr_renamed_1523(sprfwk2.cfr_renamed_2404());
                byArray2 = byArray3;
            } else {
                sprbj2 = ((sprkuh)sprbvk2).cfr_renamed_1523(sprfwk2.cfr_renamed_2404() * 8);
                byArray2 = byArray3;
            }
            sproze.cfr_renamed_492(byArray2, (byte)0);
            sprfwk sprfwk3 = sprfwk2;
            sprfwk3.cfr_renamed_5692(sprbj2);
            sprdal sprdal2 = new sprdal(dataInputStream, sprfwk2);
            this.cfr_renamed_2449(sprdal2);
            byte[] byArray4 = new byte[sprfwk3.cfr_renamed_2404()];
            sprfwk3.cfr_renamed_1219(byArray4, 0);
            byte[] byArray5 = new byte[sprfwk2.cfr_renamed_2404()];
            dataInputStream.readFully(byArray5);
            if (!sproze.cfr_renamed_559(byArray4, byArray5)) {
                this.cfr_renamed_105.clear();
                throw new IOException(sprvzy.cfr_renamed_9("HKz}wAqK#GmZfIqGwW#MkK`E#HbGoKg\u0000"));
            }
        } else {
            this.cfr_renamed_2449(dataInputStream);
            byte[] byArray6 = new byte[sprfwk2.cfr_renamed_2404()];
            dataInputStream.readFully(byArray6);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_2459(Certificate arg0, DataOutputStream arg1) throws IOException {
        try {
            byte[] byArray = arg0.getEncoded();
            DataOutputStream dataOutputStream = arg1;
            dataOutputStream.writeUTF(arg0.getType());
            dataOutputStream.writeInt(byArray.length);
            arg1.write(byArray);
            return;
        }
        catch (CertificateEncodingException certificateEncodingException) {
            throw new IOException(certificateEncodingException.toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ Certificate cfr_renamed_2451(DataInputStream arg0) throws IOException {
        DataInputStream dataInputStream = arg0;
        String string = dataInputStream.readUTF();
        byte[] byArray = new byte[dataInputStream.readInt()];
        dataInputStream.readFully(byArray);
        try {
            CertificateFactory certificateFactory = this.cfr_renamed_0.cfr_renamed_1550(string);
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byArray);
            return certificateFactory.generateCertificate(byteArrayInputStream);
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new IOException(noSuchProviderException.toString());
        }
        catch (CertificateException certificateException) {
            throw new IOException(certificateException.toString());
        }
    }

    public static /* synthetic */ void cfr_renamed_9314(sproaj arg0, Key arg1, DataOutputStream arg2) throws IOException {
        arg0.cfr_renamed_2450(arg1, arg2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_2457(OutputStream arg0) throws IOException {
        Enumeration enumeration = this.cfr_renamed_105.elements();
        DataOutputStream dataOutputStream = new DataOutputStream(arg0);
        block5: while (true) {
            sprgbj sprgbj2;
            sprgbj sprgbj3;
            if (!enumeration.hasMoreElements()) {
                dataOutputStream.write(0);
                return;
            }
            sprgbj sprgbj4 = sprgbj3 = (sprgbj)enumeration.nextElement();
            DataOutputStream dataOutputStream2 = dataOutputStream;
            dataOutputStream2.write(sprgbj3.cfr_renamed_324());
            dataOutputStream2.writeUTF(sprgbj3.cfr_renamed_2458());
            dataOutputStream.writeLong(sprgbj4.cfr_renamed_110().getTime());
            Certificate[] certificateArray = sprgbj4.cfr_renamed_2454();
            if (certificateArray == null) {
                sprgbj2 = sprgbj3;
                dataOutputStream.writeInt(0);
            } else {
                int n;
                dataOutputStream.writeInt(certificateArray.length);
                int n2 = n = 0;
                while (n2 != certificateArray.length) {
                    this.cfr_renamed_2459(certificateArray[n++], dataOutputStream);
                    n2 = n;
                }
                sprgbj2 = sprgbj3;
            }
            switch (sprgbj2.cfr_renamed_324()) {
                case 1: {
                    this.cfr_renamed_2459((Certificate)sprgbj3.cfr_renamed_2456(), dataOutputStream);
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_2450((Key)sprgbj3.cfr_renamed_2456(), dataOutputStream);
                    continue block5;
                }
                case 3: 
                case 4: {
                    byte[] byArray = (byte[])sprgbj3.cfr_renamed_2456();
                    dataOutputStream.writeInt(byArray.length);
                    dataOutputStream.write(byArray);
                    continue block5;
                }
            }
            break;
        }
        throw new IOException(sprwlb.cfr_renamed_9("\u001cR\"R&K'\u001c&^#Y*HiH0L,\u001c RiO=S;Yg"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineSetKeyEntry(String arg0, Key arg1, char[] arg2, Certificate[] arg3) throws KeyStoreException {
        if (arg1 instanceof PrivateKey) {
            if (arg3 == null) {
                throw new KeyStoreException(sprvzy.cfr_renamed_9("mA#Mf\\wGeG`OwK#MkOj@#Hl\\#^qGuOwK#EfW"));
            }
            if (arg1.getEncoded() == null) {
                this.cfr_renamed_105.put(arg0, new sprgbj(this, arg0, new Date(), 2, arg1, arg3));
                return;
            }
        }
        try {
            this.cfr_renamed_105.put(arg0, new sprgbj(this, arg0, arg1, arg2, arg3));
            return;
        }
        catch (Exception exception) {
            throw new sprngj(exception.toString(), exception);
        }
    }

    public sproaj(int n) {
        sproaj sproaj2 = this;
        sproaj sproaj3 = this;
        sproaj3.cfr_renamed_105 = new Hashtable();
        sproaj2.cfr_renamed_79 = sprybl.cfr_renamed_2794();
        sproaj2.cfr_renamed_0 = new sprdki();
        sproaj2.cfr_renamed_2 = n;
    }

    @Override
    public Certificate[] engineGetCertificateChain(String arg0) {
        sprgbj sprgbj2 = (sprgbj)this.cfr_renamed_105.get(arg0);
        if (sprgbj2 != null) {
            return sprgbj2.cfr_renamed_2454();
        }
        return null;
    }
}

