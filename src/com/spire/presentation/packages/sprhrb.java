/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprgb;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmpb;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprtza;
import com.spire.presentation.packages.sprvqb;
import com.spire.presentation.packages.spryn;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
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

public abstract class sprhrb
extends CipherSpi
implements sprgb {
    private int cfr_renamed_31;
    private byte[] cfr_renamed_272;
    public AlgorithmParameters cfr_renamed_145;
    public int cfr_renamed_114;
    private Class[] cfr_renamed_96;
    public int cfr_renamed_105;
    public int cfr_renamed_137;
    public spryn cfr_renamed_79;
    public int cfr_renamed_107;

    @Override
    public int engineGetOutputSize(int arg0) {
        return -1;
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
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException, NoSuchAlgorithmException {
        byte[] byArray;
        try {
            byArray = this.cfr_renamed_79 == null ? this.engineDoFinal(arg0, 0, arg0.length) : this.cfr_renamed_79.cfr_renamed_1579(arg0, 0, arg0.length);
        }
        catch (sprpjd sprpjd2) {
            throw new InvalidKeyException(sprpjd2.getMessage());
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
                sprmke sprmke2 = sprmke.cfr_renamed_23(byArray);
                PrivateKey privateKey = sprbrb.cfr_renamed_1253(sprmke2);
                if (privateKey == null) throw new InvalidKeyException(new StringBuilder().insert(0, sprsqaa.cfr_renamed_9("\u0011^\u0017]\u0002[\u0004Z\u001d\u0012")).append(sprmke2.cfr_renamed_1254().cfr_renamed_593()).append(sprtza.cfr_renamed_9("08\u007f\"0%e&`9b\"u2")).toString());
                return privateKey;
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprsqaa.cfr_renamed_9("{\u001eD\u0011^\u0019VPY\u0015KPW\u001eQ\u001fV\u0019\\\u0017\u001c"));
            }
        }
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(arg1, "BC");
            if (arg2 == 1) {
                return keyFactory.generatePublic(new X509EncodedKeySpec(byArray));
            }
            if (arg2 != 2) throw new InvalidKeyException(new StringBuilder().insert(0, sprtza.cfr_renamed_9("\u0003~=~9g80=u/0\"i&uv")).append(arg2).toString());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(byArray));
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprtza.cfr_renamed_9("\u0003~=~9g80=u/0\"i&uv")).append(noSuchProviderException.getMessage()).toString());
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprsqaa.cfr_renamed_9("g\u001eY\u001e]\u0007\\PY\u0015KPF\tB\u0015\u0012")).append(invalidKeySpecException.getMessage()).toString());
        }
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length;
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        throw new RuntimeException(sprsqaa.cfr_renamed_9("\u001e]\u0004\u0012\u0003G\u0000B\u001f@\u0004W\u0014\u0012\u0016]\u0002\u0012\u0007@\u0011B\u0000[\u001eU"));
    }

    @Override
    public AlgorithmParameters engineGetParameters() {
        return null;
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        throw new RuntimeException(sprtza.cfr_renamed_9("~9dvc#`&\u007f$d3tvv9bvg$q&`?~1"));
    }

    public sprhrb() {
        Class[] classArray = new Class[4];
        classArray[0] = IvParameterSpec.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        this.cfr_renamed_96 = classArray;
        sprhrb sprhrb2 = this;
        sprhrb sprhrb3 = this;
        sprhrb3.cfr_renamed_137 = 2;
        sprhrb3.cfr_renamed_107 = 1;
        sprhrb2.cfr_renamed_145 = null;
        sprhrb2.cfr_renamed_79 = null;
    }

    public sprhrb(spryn arg0) {
        this(arg0, 0);
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        return 0;
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        return null;
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
            throw new InvalidKeyException(sprsqaa.cfr_renamed_9("q\u0011\\\u001e]\u0004\u0012\u0007@\u0011BPY\u0015K\\\u0012\u001eG\u001c^PW\u001eQ\u001fV\u0019\\\u0017\u001c"));
        }
        try {
            if (this.cfr_renamed_79 != null) return this.cfr_renamed_79.cfr_renamed_1575(byArray, 0, byArray.length);
            return this.engineDoFinal(byArray, 0, byArray.length);
        }
        catch (BadPaddingException badPaddingException) {
            throw new IllegalBlockSizeException(badPaddingException.getMessage());
        }
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprtza.cfr_renamed_9("5q87\"0%e&`9b\"0;\u007f2uv")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprhrb(spryn spryn2, int n) {
        void arg1;
        void arg0;
        Class[] classArray = new Class[4];
        classArray[0] = IvParameterSpec.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        this.cfr_renamed_96 = classArray;
        sprhrb sprhrb2 = this;
        sprhrb sprhrb3 = this;
        sprhrb sprhrb4 = this;
        sprhrb4.cfr_renamed_137 = 2;
        sprhrb4.cfr_renamed_107 = 1;
        sprhrb3.cfr_renamed_145 = null;
        sprhrb3.cfr_renamed_79 = null;
        sprhrb2.cfr_renamed_79 = arg0;
        sprhrb2.cfr_renamed_31 = arg1;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprsqaa.cfr_renamed_9(" S\u0014V\u0019\\\u0017\u0012")).append(arg0).append(sprtza.cfr_renamed_9("ve8{8\u007f!~x")).toString());
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
            throw new IllegalArgumentException(invalidAlgorithmParameterException.getMessage());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (arg2 != null) {
            AlgorithmParameterSpec algorithmParameterSpec2;
            block5: {
                int n;
                int n2 = n = 0;
                while (n2 != this.cfr_renamed_96.length) {
                    try {
                        algorithmParameterSpec2 = algorithmParameterSpec = (AlgorithmParameterSpec)arg2.getParameterSpec(this.cfr_renamed_96[n]);
                        break block5;
                    }
                    catch (Exception exception) {
                        n2 = ++n;
                    }
                }
                algorithmParameterSpec2 = algorithmParameterSpec;
            }
            if (algorithmParameterSpec2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprsqaa.cfr_renamed_9("Q\u0011\\WFPZ\u0011\\\u0014^\u0015\u0012\u0000S\u0002S\u001dW\u0004W\u0002\u0012")).append(arg2.toString()).toString());
            }
        }
        this.cfr_renamed_145 = arg2;
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
    }

    @Override
    public byte[] engineGetIV() {
        return (byte[])this.cfr_renamed_272.clone();
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void var5_11;
        Object object;
        if (arg1 instanceof sprmpb) {
            object = (sprmpb)arg1;
            if (arg2 instanceof PBEParameterSpec) {
                sprt sprt2 = sprvqb.cfr_renamed_2293((sprmpb)object, arg2, this.cfr_renamed_79.cfr_renamed_1315());
            } else {
                if (((sprmpb)object).cfr_renamed_2292() == null) throw new InvalidAlgorithmParameterException(sprtza.cfr_renamed_9("@\u0014Uvb3a#y$u%0\u0006R\u00130&q$q;u\"u$cvd904uvc3dx"));
                sprt sprt3 = ((sprmpb)object).cfr_renamed_2292();
            }
        } else {
            sprnld sprnld2 = new sprnld(arg1.getEncoded());
        }
        if (arg2 instanceof IvParameterSpec) {
            void var5_9;
            object = (IvParameterSpec)arg2;
            sprnjd sprnjd2 = new sprnjd((sprt)var5_9, ((IvParameterSpec)object).getIV());
        }
        if (var5_11 instanceof sprnld && this.cfr_renamed_31 != 0) {
            sprhrb sprhrb2 = this;
            sprhrb2.cfr_renamed_272 = new byte[sprhrb2.cfr_renamed_31];
            arg3.nextBytes(sprhrb2.cfr_renamed_272);
            sprnjd sprnjd3 = new sprnjd((sprt)var5_11, this.cfr_renamed_272);
        }
        if (arg3 != null) {
            void var5_13;
            spraed spraed2 = new spraed((sprt)var5_13, arg3);
        }
        switch (arg0) {
            case 3: {
                void var5_15;
                while (false) {
                }
                this.cfr_renamed_79.cfr_renamed_1217(true, (sprt)var5_15);
                return;
            }
            case 4: {
                void var5_15;
                this.cfr_renamed_79.cfr_renamed_1217(false, (sprt)var5_15);
                return;
            }
            case 1: 
            case 2: {
                throw new IllegalArgumentException(sprsqaa.cfr_renamed_9("\u0015\\\u0017[\u001eWP]\u001e^\t\u0012\u0006S\u001c[\u0014\u0012\u0016]\u0002\u0012\u0007@\u0011B\u0000[\u001eU"));
            }
        }
        System.out.println(sprtza.cfr_renamed_9("3u3{w"));
    }
}

