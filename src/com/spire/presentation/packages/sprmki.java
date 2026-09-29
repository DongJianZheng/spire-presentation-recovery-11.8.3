/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcom;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprfai;
import com.spire.presentation.packages.sprgbi;
import com.spire.presentation.packages.sprhcaa;
import com.spire.presentation.packages.sprjdi;
import com.spire.presentation.packages.sprjlk;
import com.spire.presentation.packages.sprjy;
import com.spire.presentation.packages.sprknk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmfi;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprrqr;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprshi;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwci;
import com.spire.presentation.packages.spryy;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.PrivateKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.CipherSpi;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public abstract class sprmki
extends CipherSpi
implements sprjy {
    public int cfr_renamed_724;
    private byte[] cfr_renamed_953;
    private final sprrr cfr_renamed_133;
    public spryy cfr_renamed_185;
    public int spr\ufe34;
    private sprfai cfr_renamed_82;
    private int cfr_renamed_126;
    public int cfr_renamed_88;
    public int cfr_renamed_31;
    public AlgorithmParameters cfr_renamed_2;
    private boolean cfr_renamed_3;
    private Class[] cfr_renamed_4;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        if (this.cfr_renamed_82 == null) {
            throw new IllegalStateException(sprhcaa.cfr_renamed_9("K9QvV#U&J$Q3AvL8\u00057\u0005!W7U&L8BvH9A3"));
        }
        this.cfr_renamed_82.write(arg0, arg1, arg2);
        try {
            int n;
            byte[] byArray;
            if (this.cfr_renamed_3) {
                try {
                    sprmki sprmki2 = this;
                    byArray = sprmki2.cfr_renamed_185.cfr_renamed_1575(sprmki2.cfr_renamed_82.cfr_renamed_9247(), 0, this.cfr_renamed_82.size());
                    n = arg4;
                }
                catch (Exception exception) {
                    throw new IllegalBlockSizeException(exception.getMessage());
                }
            }
            try {
                sprmki sprmki3 = this;
                byArray = sprmki3.cfr_renamed_185.cfr_renamed_1579(sprmki3.cfr_renamed_82.cfr_renamed_9247(), 0, this.cfr_renamed_82.size());
                n = arg4;
            }
            catch (sprull sprull2) {
                throw new BadPaddingException(sprull2.getMessage());
            }
            if (n + byArray.length > arg3.length) {
                throw new ShortBufferException(sprrqr.cfr_renamed_9("\u000eN\u0015K\u0014OAY\u0014]\u0007^\u0013\u001b\u0015T\u000e\u001b\u0012S\u000eI\u0015\u001b\u0007T\u0013\u001b\bU\u0011N\u0015\u0015"));
            }
            System.arraycopy(byArray, 0, arg3, arg4, byArray.length);
            int n2 = byArray.length;
            return n2;
        }
        finally {
            this.cfr_renamed_82.cfr_renamed_9248();
        }
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        if (this.cfr_renamed_82 == null) {
            throw new IllegalStateException(sprhcaa.cfr_renamed_9("K9QvV#U&J$Q3AvL8\u00057\u0005!W7U&L8BvH9A3"));
        }
        if (arg0 != null) {
            this.cfr_renamed_82.write(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_3) {
            try {
                sprmki sprmki2 = this;
                byte[] byArray = sprmki2.cfr_renamed_185.cfr_renamed_1575(sprmki2.cfr_renamed_82.cfr_renamed_9247(), 0, this.cfr_renamed_82.size());
                return byArray;
            }
            catch (Exception exception) {
                throw new IllegalBlockSizeException(exception.getMessage());
            }
        }
        sprmki sprmki3 = this;
        byte[] byArray = sprmki3.cfr_renamed_185.cfr_renamed_1579(sprmki3.cfr_renamed_82.cfr_renamed_9247(), 0, this.cfr_renamed_82.size());
        return byArray;
        catch (sprull sprull2) {
            throw new BadPaddingException(sprull2.getMessage());
        }
        finally {
            this.cfr_renamed_82.cfr_renamed_9248();
        }
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] byArray = arg0.getEncoded();
        if (byArray == null) {
            throw new InvalidKeyException(sprrqr.cfr_renamed_9("x\u0000U\u000fT\u0015\u001b\u0016I\u0000KAP\u0004BM\u001b\u000fN\rWA^\u000fX\u000e_\bU\u0006\u0015"));
        }
        try {
            if (this.cfr_renamed_185 != null) return this.cfr_renamed_185.cfr_renamed_1575(byArray, 0, byArray.length);
            return this.engineDoFinal(byArray, 0, byArray.length);
        }
        catch (BadPaddingException badPaddingException) {
            throw new IllegalBlockSizeException(badPaddingException.getMessage());
        }
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        if (this.cfr_renamed_82 == null) {
            throw new IllegalStateException(sprhcaa.cfr_renamed_9("K9QvV#U&J$Q3AvL8\u00057\u0005!W7U&L8BvH9A3"));
        }
        this.cfr_renamed_82.write(arg0, arg1, arg2);
        return 0;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length * 8;
    }

    @Override
    public byte[] engineGetIV() {
        return sproze.cfr_renamed_158(this.cfr_renamed_953);
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (arg2 != null && (algorithmParameterSpec = sprmfi.cfr_renamed_9238(arg2, this.cfr_renamed_4)) == null) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("X\u0000UFOAS\u0000U\u0005W\u0004\u001b\u0011Z\u0013Z\f^\u0015^\u0013\u001b")).append(arg2.toString()).toString());
        }
        this.cfr_renamed_2 = arg2;
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprhcaa.cfr_renamed_9("5D8\u0002\"\u0005%P&U9W\"\u0005;J2@v")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block22: {
            void var5_16;
            block23: {
                Object object;
                if (arg1 instanceof sprgbi) {
                    object = (sprgbi)arg1;
                    if (arg2 instanceof PBEParameterSpec) {
                        sprbj sprbj2 = sprjdi.cfr_renamed_9249((sprgbi)object, arg2, this.cfr_renamed_185.cfr_renamed_1315());
                    } else {
                        if (((sprgbi)object).cfr_renamed_2292() == null) {
                            throw new InvalidAlgorithmParameterException(sprrqr.cfr_renamed_9("1y$\u001b\u0013^\u0010N\bI\u0004HAk#~AK\u0000I\u0000V\u0004O\u0004I\u0012\u001b\u0015TAY\u0004\u001b\u0012^\u0015\u0015"));
                        }
                        sprbj sprbj3 = ((sprgbi)object).cfr_renamed_2292();
                    }
                } else {
                    sprtpk sprtpk2 = new sprtpk(arg1.getEncoded());
                }
                if (arg2 instanceof IvParameterSpec) {
                    void var5_10;
                    object = (IvParameterSpec)arg2;
                    this.cfr_renamed_953 = ((IvParameterSpec)object).getIV();
                    sprkpk sprkpk2 = new sprkpk((sprbj)var5_10, this.cfr_renamed_953);
                }
                if (arg2 instanceof sprwci) {
                    void var5_14;
                    object = (sprwci)arg2;
                    byte[] byArray = ((sprwci)object).cfr_renamed_3345();
                    if (byArray != null) {
                        void var5_12;
                        sprjlk sprjlk2 = new sprjlk((sprbj)var5_12, byArray);
                    }
                    sprknk sprknk2 = new sprknk((sprbj)var5_14, ((sprwci)object).cfr_renamed_9207());
                }
                if (!(var5_16 instanceof sprtpk) || this.cfr_renamed_126 == 0) break block22;
                if (arg0 == 3) break block23;
                if (arg0 != 1) break block22;
            }
            this.cfr_renamed_953 = new byte[this.cfr_renamed_126];
            arg3.nextBytes(this.cfr_renamed_953);
            sprkpk sprkpk3 = new sprkpk((sprbj)var5_16, this.cfr_renamed_953);
        }
        if (arg3 != null) {
            void var5_18;
            sprbgk sprbgk2 = new sprbgk((sprbj)var5_18, arg3);
        }
        try {
            switch (arg0) {
                case 3: {
                    void var5_20;
                    this.cfr_renamed_185.cfr_renamed_5535(true, (sprbj)var5_20);
                    this.cfr_renamed_82 = null;
                    this.cfr_renamed_3 = true;
                    return;
                }
                case 4: {
                    void var5_20;
                    this.cfr_renamed_185.cfr_renamed_5535(false, (sprbj)var5_20);
                    this.cfr_renamed_82 = null;
                    this.cfr_renamed_3 = false;
                    return;
                }
                case 1: {
                    void var5_20;
                    this.cfr_renamed_185.cfr_renamed_5535(true, (sprbj)var5_20);
                    sprmki sprmki2 = this;
                    sprmki2.cfr_renamed_82 = new sprfai();
                    this.cfr_renamed_3 = true;
                    return;
                }
                case 2: {
                    void var5_20;
                    this.cfr_renamed_185.cfr_renamed_5535(false, (sprbj)var5_20);
                    this.cfr_renamed_82 = new sprfai();
                    this.cfr_renamed_3 = false;
                    return;
                }
            }
            throw new InvalidParameterException(sprhcaa.cfr_renamed_9("p8N8J!KvH9A3\u0005&D$D;@\"@$\u0005&D%V3AvQ9\u0005?K?Qx"));
        }
        catch (Exception exception) {
            throw new sprshi(exception.getMessage(), exception);
        }
    }

    public sprmki(spryy arg0) {
        this(arg0, 0);
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        try {
            this.engineInit(arg0, arg1, (AlgorithmParameterSpec)null, arg2);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new sprshi(invalidAlgorithmParameterException.getMessage(), invalidAlgorithmParameterException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        byte[] byArray;
        try {
            byArray = this.cfr_renamed_185 == null ? this.engineDoFinal(arg0, 0, arg0.length) : this.cfr_renamed_185.cfr_renamed_1579(arg0, 0, arg0.length);
        }
        catch (sprull sprull2) {
            throw new InvalidKeyException(sprull2.getMessage());
        }
        catch (BadPaddingException badPaddingException) {
            throw new InvalidKeyException(badPaddingException.getMessage());
        }
        catch (IllegalBlockSizeException illegalBlockSizeException) {
            throw new InvalidKeyException(illegalBlockSizeException.getMessage());
        }
        if (arg2 == 3) {
            return new SecretKeySpec(byArray, arg1);
        }
        if (arg1.equals("") && arg2 == 2) {
            try {
                sprcom sprcom2 = sprcom.cfr_renamed_23(byArray);
                PrivateKey privateKey = sprsci.cfr_renamed_5729(sprcom2);
                if (privateKey == null) throw new InvalidKeyException(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("\u0000W\u0006T\u0013R\u0015S\f\u001b")).append(sprcom2.cfr_renamed_1254().cfr_renamed_593()).append(sprhcaa.cfr_renamed_9("\u00058J\"\u0005%P&U9W\"@2")).toString());
                return privateKey;
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprrqr.cfr_renamed_9("r\u000fM\u0000W\b_AP\u0004BA^\u000fX\u000e_\bU\u0006\u0015"));
            }
        }
        try {
            KeyFactory keyFactory = this.cfr_renamed_133.cfr_renamed_1511(arg1);
            if (arg2 == 1) {
                return keyFactory.generatePublic(new X509EncodedKeySpec(byArray));
            }
            if (arg2 != 2) throw new InvalidKeyException(new StringBuilder().insert(0, sprhcaa.cfr_renamed_9("\u0003K=K9R8\u0005=@/\u0005\"\\&@v")).append(arg2).toString());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(byArray));
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprhcaa.cfr_renamed_9("\u0003K=K9R8\u0005=@/\u0005\"\\&@v")).append(noSuchProviderException.getMessage()).toString());
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("n\u000fP\u000fT\u0016UAP\u0004BAO\u0018K\u0004\u001b")).append(invalidKeySpecException.getMessage()).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprmki sprmki2;
        if (this.cfr_renamed_2 == null && this.cfr_renamed_953 != null) {
            String string = this.cfr_renamed_185.cfr_renamed_1315();
            if (string.indexOf(47) >= 0) {
                String string2 = string;
                string = string2.substring(0, string2.indexOf(47));
            }
            try {
                sprmki sprmki3 = this;
                sprmki3.cfr_renamed_2 = sprmki3.cfr_renamed_9250(string);
                sprmki3.cfr_renamed_2.init(new IvParameterSpec(this.cfr_renamed_953));
                sprmki2 = this;
                return sprmki2.cfr_renamed_2;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprmki2 = this;
        return sprmki2.cfr_renamed_2;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("1Z\u0005_\bU\u0006\u001b")).append(arg0).append(sprhcaa.cfr_renamed_9("vP8N8J!Kx")).toString());
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
    }

    public sprmki() {
        Class[] classArray = new Class[5];
        classArray[0] = sprwci.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        classArray[4] = IvParameterSpec.class;
        this.cfr_renamed_4 = classArray;
        sprmki sprmki2 = this;
        sprmki sprmki3 = this;
        this.cfr_renamed_724 = 2;
        sprmki3.cfr_renamed_31 = 1;
        sprmki3.cfr_renamed_2 = null;
        sprmki2.cfr_renamed_185 = null;
        sprmki2.cfr_renamed_82 = null;
        sprmki sprmki4 = this;
        sprmki2.cfr_renamed_133 = new sprdki();
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        if (this.cfr_renamed_82 == null) {
            throw new IllegalStateException(sprrqr.cfr_renamed_9("\u000fT\u0015\u001b\u0012N\u0011K\u000eI\u0015^\u0005\u001b\bUAZAL\u0013Z\u0011K\bU\u0006\u001b\fT\u0005^"));
        }
        this.cfr_renamed_82.write(arg0, arg1, arg2);
        return null;
    }

    public final AlgorithmParameters cfr_renamed_9250(String arg0) throws NoSuchAlgorithmException, NoSuchProviderException {
        return this.cfr_renamed_133.cfr_renamed_1540(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprmki(spryy spryy2, int n) {
        void arg1;
        void arg0;
        Class[] classArray = new Class[5];
        classArray[0] = sprwci.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        classArray[4] = IvParameterSpec.class;
        this.cfr_renamed_4 = classArray;
        sprmki sprmki2 = this;
        sprmki sprmki3 = this;
        sprmki sprmki4 = this;
        this.cfr_renamed_724 = 2;
        sprmki4.cfr_renamed_31 = 1;
        sprmki4.cfr_renamed_2 = null;
        sprmki3.cfr_renamed_185 = null;
        sprmki3.cfr_renamed_82 = null;
        sprmki sprmki5 = this;
        sprmki3.cfr_renamed_133 = new sprdki();
        sprmki2.cfr_renamed_185 = arg0;
        sprmki2.cfr_renamed_126 = arg1;
    }
}

