/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbdd;
import com.spire.presentation.packages.sprbyca;
import com.spire.presentation.packages.sprced;
import com.spire.presentation.packages.sprdxb;
import com.spire.presentation.packages.sprhc;
import com.spire.presentation.packages.sprlid;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sprsyo;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spruva;
import com.spire.presentation.packages.sprxsb;
import com.spire.presentation.packages.sprzhd;
import com.spire.presentation.packages.sprzra;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.security.Key;
import java.security.KeyFactory;
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

public class spruec
extends KeyStoreSpi
implements sprhc {
    private static final String cfr_renamed_105 = "PBEWithSHAAnd3-KeyTripleDES-CBC";
    public static final int cfr_renamed_137 = 0;
    public static final int cfr_renamed_79 = 1;
    public static final int cfr_renamed_107 = 2;
    private static final int cfr_renamed_132 = 2;
    private static final String cfr_renamed_102 = "PBEWithSHAAndTwofish-CBC";
    public static final int cfr_renamed_93 = 2;
    private static final int cfr_renamed_86 = 20;
    public int cfr_renamed_152;
    public static final int cfr_renamed_112 = 0;
    private static final int cfr_renamed_119 = 1024;
    public static final int cfr_renamed_91 = 3;
    public static final int cfr_renamed_0 = 1;
    private static final int cfr_renamed_1 = 20;
    public static final int cfr_renamed_2 = 4;
    public Hashtable cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    @Override
    public Key engineGetKey(String arg0, char[] arg1) throws NoSuchAlgorithmException, UnrecoverableKeyException {
        sprdxb sprdxb2 = (sprdxb)this.cfr_renamed_3.get(arg0);
        if (sprdxb2 == null || sprdxb2.cfr_renamed_324() == 1) {
            return null;
        }
        return (Key)sprdxb2.cfr_renamed_2448(arg1);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineLoad(InputStream inputStream, char[] cArray) throws IOException {
        void arg1;
        void arg0;
        this.cfr_renamed_3.clear();
        if (inputStream == null) {
            return;
        }
        DataInputStream dataInputStream = new DataInputStream((InputStream)arg0);
        int n = dataInputStream.readInt();
        if (n != 2 && n != 0 && n != 1) {
            throw new IOException(sprsyo.cfr_renamed_9("\u0010_(C \r1H5^.B)\r(KgF\"Tg^3B5Hi"));
        }
        int n2 = dataInputStream.readInt();
        if (n2 <= 0) {
            throw new IOException(sprokp.cfr_renamed_9("\u0014z+u1}94.u1`}p8`8w)q9"));
        }
        byte[] byArray = new byte[n2];
        DataInputStream dataInputStream2 = dataInputStream;
        dataInputStream2.readFully(byArray);
        int n3 = dataInputStream2.readInt();
        sprced sprced2 = new sprced(new sprlid());
        if (arg1 != null && ((void)arg1).length != 0) {
            byte[] byArray2;
            sprt sprt2;
            byte[] byArray3 = sprxsb.cfr_renamed_1516((char[])arg1);
            sprbyca sprbyca2 = new sprbyca(new sprlid());
            sprbyca2.cfr_renamed_1515(byArray3, byArray, n3);
            if (n != 2) {
                sprt2 = ((sprxsb)sprbyca2).cfr_renamed_1523(sprced2.cfr_renamed_2404());
                byArray2 = byArray3;
            } else {
                sprt2 = ((sprxsb)sprbyca2).cfr_renamed_1523(sprced2.cfr_renamed_2404() * 8);
                byArray2 = byArray3;
            }
            sprzra.cfr_renamed_492(byArray2, (byte)0);
            sprced sprced3 = sprced2;
            sprced3.cfr_renamed_1524(sprt2);
            sprbdd sprbdd2 = new sprbdd(dataInputStream, sprced2);
            this.cfr_renamed_2449(sprbdd2);
            byte[] byArray4 = new byte[sprced3.cfr_renamed_2404()];
            sprced3.cfr_renamed_1219(byArray4, 0);
            byte[] byArray5 = new byte[sprced2.cfr_renamed_2404()];
            dataInputStream.readFully(byArray5);
            if (!sprzra.cfr_renamed_559(byArray4, byArray5)) {
                this.cfr_renamed_3.clear();
                throw new IOException(sprsyo.cfr_renamed_9("f\"T\u0014Y(_\"\r.C3H _.Y>\r$E\"N,\r!L.A\"Ii"));
            }
        } else {
            this.cfr_renamed_2449(dataInputStream);
            byte[] byArray6 = new byte[sprced2.cfr_renamed_2404()];
            dataInputStream.readFully(byArray6);
        }
    }

    @Override
    public void engineSetKeyEntry(String arg0, byte[] arg1, Certificate[] arg2) throws KeyStoreException {
        this.cfr_renamed_3.put(arg0, new sprdxb(this, arg0, arg1, arg2));
    }

    @Override
    public void cfr_renamed_1613(SecureRandom arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @Override
    public boolean engineIsKeyEntry(String arg0) {
        sprdxb sprdxb2 = (sprdxb)this.cfr_renamed_3.get(arg0);
        return sprdxb2 != null && sprdxb2.cfr_renamed_324() != 1;
    }

    @Override
    public void engineSetCertificateEntry(String arg0, Certificate arg1) throws KeyStoreException {
        sprdxb sprdxb2 = (sprdxb)this.cfr_renamed_3.get(arg0);
        if (sprdxb2 != null && sprdxb2.cfr_renamed_324() != 1) {
            throw new KeyStoreException(new StringBuilder().insert(0, sprokp.cfr_renamed_9("6q$4.`2f84<x/q<p$45u.4<46q$48z)f$4*})|}u1}<g}")).append(arg0).toString());
        }
        this.cfr_renamed_3.put(arg0, new sprdxb(this, arg0, arg1));
    }

    private /* synthetic */ void cfr_renamed_2450(Key arg0, DataOutputStream arg1) throws IOException {
        DataOutputStream dataOutputStream;
        Key key = arg0;
        byte[] byArray = key.getEncoded();
        if (key instanceof PrivateKey) {
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
    public Date engineGetCreationDate(String arg0) {
        sprdxb sprdxb2 = (sprdxb)this.cfr_renamed_3.get(arg0);
        if (sprdxb2 != null) {
            return sprdxb2.cfr_renamed_110();
        }
        return null;
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
            CertificateFactory certificateFactory = CertificateFactory.getInstance(string, "BC");
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

    public static /* synthetic */ Key cfr_renamed_2452(spruec arg0, DataInputStream arg1) throws IOException {
        return arg0.cfr_renamed_2453(arg1);
    }

    @Override
    public Certificate[] engineGetCertificateChain(String arg0) {
        sprdxb sprdxb2 = (sprdxb)this.cfr_renamed_3.get(arg0);
        if (sprdxb2 != null) {
            return sprdxb2.cfr_renamed_2454();
        }
        return null;
    }

    @Override
    public int engineSize() {
        return this.cfr_renamed_3.size();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Cipher cfr_renamed_2455(String arg0, int arg1, char[] arg2, byte[] arg3, int arg4) throws IOException {
        try {
            PBEKeySpec pBEKeySpec = new PBEKeySpec(arg2);
            String string = arg0;
            SecretKeyFactory secretKeyFactory = SecretKeyFactory.getInstance(string, "BC");
            PBEParameterSpec pBEParameterSpec = new PBEParameterSpec(arg3, arg4);
            Cipher cipher = Cipher.getInstance(string, "BC");
            cipher.init(arg1, (Key)secretKeyFactory.generateSecret(pBEKeySpec), pBEParameterSpec);
            return cipher;
        }
        catch (Exception exception) {
            throw new IOException(new StringBuilder().insert(0, sprsyo.cfr_renamed_9("\u0002_5B5\r.C.Y.L+D4D)Jg^3B5HgB!\r,H>\r4Y(_\"\u0017g")).append(exception).toString());
        }
    }

    public Enumeration engineAliases() {
        return this.cfr_renamed_3.keys();
    }

    @Override
    public Certificate engineGetCertificate(String arg0) {
        sprdxb sprdxb2 = (sprdxb)this.cfr_renamed_3.get(arg0);
        if (sprdxb2 != null) {
            if (sprdxb2.cfr_renamed_324() == 1) {
                return (Certificate)sprdxb2.cfr_renamed_2456();
            }
            Certificate[] certificateArray = sprdxb2.cfr_renamed_2454();
            if (certificateArray != null) {
                return certificateArray[0];
            }
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
                    spruec spruec2 = this;
                    while (false) {
                    }
                    Certificate certificate = spruec2.cfr_renamed_2451(dataInputStream);
                    spruec2.cfr_renamed_3.put(string, new sprdxb(this, string, date, 1, certificate));
                    dataInputStream2 = dataInputStream;
                    break;
                }
                case 2: {
                    spruec spruec3 = this;
                    Key key = spruec3.cfr_renamed_2453(dataInputStream);
                    spruec3.cfr_renamed_3.put(string, new sprdxb(this, string, date, 2, key, certificateArray));
                    dataInputStream2 = dataInputStream;
                    break;
                }
                case 3: 
                case 4: {
                    DataInputStream dataInputStream4 = dataInputStream;
                    dataInputStream2 = dataInputStream4;
                    byte[] byArray = new byte[dataInputStream4.readInt()];
                    dataInputStream4.readFully(byArray);
                    this.cfr_renamed_3.put(string, new sprdxb(this, string, date, n, byArray, certificateArray));
                    break;
                }
                default: {
                    throw new RuntimeException(sprokp.cfr_renamed_9("\bz6z2c342v7q>`}`$d844z}g){/qs"));
                }
            }
            n2 = dataInputStream2.read();
        }
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
                if (!var3_3.equals(sprsyo.cfr_renamed_9("}\fn\u0014\u000e\u007f")) && !var3_3.equals(sprokp.cfr_renamed_9("\r_\u001eGe"))) break block8;
                var6_6 /* !! */  = new PKCS8EncodedKeySpec(var5_5);
                v1 = var2_2;
                ** GOTO lbl-1000
            }
            if (!var3_3.equals(sprsyo.cfr_renamed_9("\u001f\u0003r\u001d~")) && !var3_3.equals(sprokp.cfr_renamed_9("Lh$d"))) break block9;
            var6_6 /* !! */  = new X509EncodedKeySpec(var5_5);
            v1 = var2_2;
            ** GOTO lbl-1000
        }
        if (var3_3.equals(sprsyo.cfr_renamed_9("\u0015l\u0010"))) {
            return new SecretKeySpec(var5_5, var4_4);
        }
        throw new IOException(new StringBuilder().insert(0, sprokp.cfr_renamed_9("\u0016q$4;{/y<`}")).append(var3_3).append(sprsyo.cfr_renamed_9("\r)B3\r5H$B C.^\"If")).toString());
lbl-1000:
        // 2 sources

        {
            switch (v1) lbl-1000:
            // 2 sources

            {
                case 0: {
                    if (false) ** GOTO lbl-1000
                    return KeyFactory.getInstance(var4_4, "BC").generatePrivate(var6_6 /* !! */ );
                }
                case 1: {
                    return KeyFactory.getInstance(var4_4, "BC").generatePublic(var6_6 /* !! */ );
                }
                case 2: {
                    return SecretKeyFactory.getInstance(var4_4, "BC").generateSecret(var6_6 /* !! */ );
                }
            }
            throw new IOException(new StringBuilder().insert(0, sprokp.cfr_renamed_9("\u0016q$4)m-q}")).append(var2_2).append(sprsyo.cfr_renamed_9("\r)B3\r5H$B C.^\"If")).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public void cfr_renamed_2457(OutputStream arg0) throws IOException {
        Enumeration enumeration = this.cfr_renamed_3.elements();
        DataOutputStream dataOutputStream = new DataOutputStream(arg0);
        block5: while (true) {
            sprdxb sprdxb2;
            sprdxb sprdxb3;
            if (!enumeration.hasMoreElements()) {
                dataOutputStream.write(0);
                return;
            }
            sprdxb sprdxb4 = sprdxb3 = (sprdxb)enumeration.nextElement();
            DataOutputStream dataOutputStream2 = dataOutputStream;
            dataOutputStream2.write(sprdxb3.cfr_renamed_324());
            dataOutputStream2.writeUTF(sprdxb3.cfr_renamed_2458());
            dataOutputStream.writeLong(sprdxb4.cfr_renamed_110().getTime());
            Certificate[] certificateArray = sprdxb4.cfr_renamed_2454();
            if (certificateArray == null) {
                sprdxb2 = sprdxb3;
                dataOutputStream.writeInt(0);
            } else {
                int n;
                dataOutputStream.writeInt(certificateArray.length);
                int n2 = n = 0;
                while (n2 != certificateArray.length) {
                    this.cfr_renamed_2459(certificateArray[n++], dataOutputStream);
                    n2 = n;
                }
                sprdxb2 = sprdxb3;
            }
            switch (sprdxb2.cfr_renamed_324()) {
                case 1: {
                    this.cfr_renamed_2459((Certificate)sprdxb3.cfr_renamed_2456(), dataOutputStream);
                    continue block5;
                }
                case 2: {
                    this.cfr_renamed_2450((Key)sprdxb3.cfr_renamed_2456(), dataOutputStream);
                    continue block5;
                }
                case 3: 
                case 4: {
                    byte[] byArray = (byte[])sprdxb3.cfr_renamed_2456();
                    dataOutputStream.writeInt(byArray.length);
                    dataOutputStream.write(byArray);
                    continue block5;
                }
            }
            break;
        }
        throw new RuntimeException(sprsyo.cfr_renamed_9("\u0012C,C(Z)\r(O-H$YgY>]\"\r.Cg^3B5Hi"));
    }

    public static /* synthetic */ void cfr_renamed_2460(spruec arg0, Key arg1, DataOutputStream arg2) throws IOException {
        arg0.cfr_renamed_2450(arg1, arg2);
    }

    public spruec(int n) {
        spruec spruec2 = this;
        spruec spruec3 = this;
        spruec2.cfr_renamed_3 = new Hashtable();
        spruec2.cfr_renamed_4 = new SecureRandom();
        spruec2.cfr_renamed_152 = n;
    }

    @Override
    public void engineStore(OutputStream arg0, char[] arg1) throws IOException {
        int n;
        DataOutputStream dataOutputStream = new DataOutputStream(arg0);
        byte[] byArray = new byte[20];
        int n2 = 1024 + (this.cfr_renamed_4.nextInt() & 0x3FF);
        this.cfr_renamed_4.nextBytes(byArray);
        DataOutputStream dataOutputStream2 = dataOutputStream;
        dataOutputStream2.writeInt(this.cfr_renamed_152);
        dataOutputStream2.writeInt(byArray.length);
        DataOutputStream dataOutputStream3 = dataOutputStream;
        dataOutputStream3.write(byArray);
        dataOutputStream3.writeInt(n2);
        sprced sprced2 = new sprced(new sprlid());
        sprzhd sprzhd2 = new sprzhd(sprced2);
        sprbyca sprbyca2 = new sprbyca(new sprlid());
        byte[] byArray2 = sprxsb.cfr_renamed_1516(arg1);
        sprbyca2.cfr_renamed_1515(byArray2, byArray, n2);
        if (this.cfr_renamed_152 < 2) {
            sprced sprced3 = sprced2;
            sprced3.cfr_renamed_1524(((sprxsb)sprbyca2).cfr_renamed_1523(sprced3.cfr_renamed_2404()));
        } else {
            sprced2.cfr_renamed_1524(((sprxsb)sprbyca2).cfr_renamed_1523(sprced2.cfr_renamed_2404() * 8));
        }
        int n3 = n = 0;
        while (n3 != byArray2.length) {
            byArray2[n++] = 0;
            n3 = n;
        }
        this.cfr_renamed_2457(new spruva(dataOutputStream, sprzhd2));
        sprced sprced4 = sprced2;
        byte[] byArray3 = new byte[sprced4.cfr_renamed_2404()];
        sprced4.cfr_renamed_1219(byArray3, 0);
        DataOutputStream dataOutputStream4 = dataOutputStream;
        dataOutputStream4.write(byArray3);
        dataOutputStream4.close();
    }

    @Override
    public String engineGetCertificateAlias(Certificate arg0) {
        Enumeration enumeration = this.cfr_renamed_3.elements();
        while (enumeration.hasMoreElements()) {
            Object object;
            sprdxb sprdxb2 = (sprdxb)enumeration.nextElement();
            if (!(sprdxb2.cfr_renamed_2456() instanceof Certificate ? (object = (Certificate)sprdxb2.cfr_renamed_2456()).equals(arg0) : (object = sprdxb2.cfr_renamed_2454()) != null && object[0].equals(arg0))) continue;
            return sprdxb2.cfr_renamed_2458();
        }
        return null;
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

    @Override
    public boolean engineContainsAlias(String arg0) {
        return this.cfr_renamed_3.get(arg0) != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineSetKeyEntry(String arg0, Key arg1, char[] arg2, Certificate[] arg3) throws KeyStoreException {
        if (arg1 instanceof PrivateKey && arg3 == null) {
            throw new KeyStoreException(sprokp.cfr_renamed_9("z24>q/`4r4w<`84>|<}34;{/4-f4b<`846q$"));
        }
        try {
            this.cfr_renamed_3.put(arg0, new sprdxb(this, arg0, arg1, arg2, arg3));
            return;
        }
        catch (Exception exception) {
            throw new KeyStoreException(exception.toString());
        }
    }

    @Override
    public boolean engineIsCertificateEntry(String arg0) {
        sprdxb sprdxb2 = (sprdxb)this.cfr_renamed_3.get(arg0);
        return sprdxb2 != null && sprdxb2.cfr_renamed_324() == 1;
    }

    @Override
    public void engineDeleteEntry(String arg0) throws KeyStoreException {
        if (this.cfr_renamed_3.get(arg0) == null) {
            return;
        }
        this.cfr_renamed_3.remove(arg0);
    }
}

