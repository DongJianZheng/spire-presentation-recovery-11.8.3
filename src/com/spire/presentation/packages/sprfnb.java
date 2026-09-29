/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrb;
import com.spire.presentation.packages.sprgb;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlrc;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprmpb;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprudda;
import com.spire.presentation.packages.sprvqb;
import java.io.Serializable;
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
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprfnb
extends CipherSpi
implements sprgb {
    private sprnjd cfr_renamed_145;
    private String cfr_renamed_114;
    private Class[] cfr_renamed_96;
    private PBEParameterSpec cfr_renamed_105;
    private AlgorithmParameters cfr_renamed_137;
    private sprqk cfr_renamed_79;
    private int cfr_renamed_107;

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws BadPaddingException {
        if (arg2 != 0) {
            this.cfr_renamed_79.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
        }
        this.cfr_renamed_79.cfr_renamed_41();
        return arg2;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    @Override
    public void engineInit(int n, Key key, AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidKeyException, InvalidAlgorithmParameterException {
        void v7;
        void arg0;
        void var5_11;
        Serializable serializable;
        sprfnb sprfnb2;
        void arg2;
        void arg1;
        sprfnb sprfnb3 = this;
        this.cfr_renamed_105 = null;
        sprfnb3.cfr_renamed_114 = null;
        sprfnb3.cfr_renamed_137 = null;
        if (!(key instanceof SecretKey)) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprudda.cfr_renamed_9("\u0016J$\u000f;@/\u000f<C:@/F)G0\u000f")).append(arg1.getAlgorithm()).append(sprlrc.cfr_renamed_9("\u0013\"\\8\u0013?F%G-Q VlU#Al@5^!V8A%PlV\"A5C8Z#]b")).toString());
        }
        if (!(arg1 instanceof sprmpb)) {
            if (arg2 == null) {
                sprnld sprnld2 = new sprnld(arg1.getEncoded());
                sprfnb2 = this;
            } else {
                sprnjd sprnjd2;
                if (!(arg2 instanceof IvParameterSpec)) throw new IllegalArgumentException(sprlrc.cfr_renamed_9("9]']#D\"\u0013<R>R!V8V>\u00138J<Vb"));
                this.cfr_renamed_145 = sprnjd2 = new sprnjd(new sprnld(arg1.getEncoded()), ((IvParameterSpec)arg2).getIV());
                sprfnb2 = this;
            }
        } else {
            Serializable serializable2;
            sprmpb sprmpb2;
            serializable = (sprmpb)arg1;
            if (((sprmpb)serializable).cfr_renamed_113() != null) {
                sprmpb sprmpb3 = serializable;
                sprmpb2 = sprmpb3;
                this.cfr_renamed_114 = sprmpb3.cfr_renamed_113().cfr_renamed_19();
            } else {
                this.cfr_renamed_114 = ((sprmpb)serializable).getAlgorithm();
                sprmpb2 = serializable;
            }
            if (sprmpb2.cfr_renamed_2292() != null) {
                sprmpb sprmpb4 = serializable;
                serializable2 = sprmpb4;
                sprt sprt2 = sprmpb4.cfr_renamed_2292();
                sprfnb sprfnb4 = this;
                sprfnb4.cfr_renamed_105 = new PBEParameterSpec(((sprmpb)serializable).getSalt(), ((sprmpb)serializable).getIterationCount());
            } else {
                if (!(arg2 instanceof PBEParameterSpec)) throw new InvalidAlgorithmParameterException(sprudda.cfr_renamed_9("\rm\u0018\u000f/J,Z4]8\\}\u007f\u001fj}_<]<B8[8].\u000f)@}M8\u000f.J)\u0001"));
                sprt sprt3 = sprvqb.cfr_renamed_2293((sprmpb)serializable, (AlgorithmParameterSpec)arg2, this.cfr_renamed_79.cfr_renamed_1315());
                this.cfr_renamed_105 = (PBEParameterSpec)arg2;
                serializable2 = serializable;
            }
            if (((sprmpb)serializable2).cfr_renamed_2294() != 0) {
                void var5_8;
                this.cfr_renamed_145 = (sprnjd)var5_8;
            }
            sprfnb2 = this;
        }
        if (sprfnb2.cfr_renamed_107 != 0 && !(var5_11 instanceof sprnjd)) {
            sprnjd sprnjd3;
            void arg3;
            serializable = arg3;
            if (serializable == null) {
                serializable = new SecureRandom();
            }
            if (arg0 != true && arg0 != 3) throw new InvalidAlgorithmParameterException(sprudda.cfr_renamed_9("A2\u000f\u0014y}\\8[}X5J3\u000f2A8\u000f8W-J>[8K"));
            byte[] byArray = new byte[this.cfr_renamed_107];
            ((SecureRandom)serializable).nextBytes(byArray);
            this.cfr_renamed_145 = sprnjd3 = new sprnjd((sprt)var5_11, byArray);
            v7 = arg0;
        } else {
            v7 = arg0;
        }
        switch (v7) {
            case 1: 
            case 3: {
                void var5_13;
                while (false) {
                }
                this.cfr_renamed_79.cfr_renamed_1217(true, (sprt)var5_13);
                return;
            }
            case 2: 
            case 4: {
                void var5_13;
                this.cfr_renamed_79.cfr_renamed_1217(false, (sprt)var5_13);
                return;
            }
        }
        System.out.println(sprlrc.cfr_renamed_9(")V)Xm"));
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length * 8;
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
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprudda.cfr_renamed_9("L<Az[}G<A9C8\u000f-N/N0J)J/\u000f")).append(arg2.toString()).toString());
            }
        }
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
        this.cfr_renamed_137 = arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        try {
            this.cfr_renamed_79.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
            return arg2;
        }
        catch (sprjkd sprjkd2) {
            throw new ShortBufferException(sprjkd2.getMessage());
        }
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return arg0;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        if (!arg0.equalsIgnoreCase(sprlrc.cfr_renamed_9("\u0002\\\u001cR(W%]+"))) {
            throw new NoSuchPaddingException(new StringBuilder().insert(0, sprudda.cfr_renamed_9("\rN9K4A:\u000f")).append(arg0).append(sprlrc.cfr_renamed_9("lF\"X\"\\;]b")).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        if (this.cfr_renamed_137 == null && this.cfr_renamed_105 != null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.cfr_renamed_114, "BC");
                algorithmParameters.init(this.cfr_renamed_105);
                return algorithmParameters;
            }
            catch (Exception exception) {
                return null;
            }
        }
        return this.cfr_renamed_137;
    }

    /*
     * WARNING - void declaration
     */
    public sprfnb(sprqk sprqk2, int n) {
        void arg1;
        void arg0;
        Class[] classArray = new Class[4];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = IvParameterSpec.class;
        classArray[3] = PBEParameterSpec.class;
        this.cfr_renamed_96 = classArray;
        sprfnb sprfnb2 = this;
        sprfnb sprfnb3 = this;
        this.cfr_renamed_107 = 0;
        sprfnb3.cfr_renamed_105 = null;
        sprfnb3.cfr_renamed_114 = null;
        sprfnb2.cfr_renamed_79 = arg0;
        sprfnb2.cfr_renamed_107 = arg1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineWrap(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] byArray = arg0.getEncoded();
        if (byArray == null) {
            throw new InvalidKeyException(sprudda.cfr_renamed_9("l<A3@)\u000f*]<_}D8Vq\u000f3Z1C}J3L2K4A:\u0001"));
        }
        try {
            return this.engineDoFinal(byArray, 0, byArray.length);
        }
        catch (BadPaddingException badPaddingException) {
            throw new IllegalBlockSizeException(badPaddingException.getMessage());
        }
    }

    @Override
    public void engineSetMode(String arg0) {
        if (!arg0.equalsIgnoreCase(sprlrc.cfr_renamed_9("\tp\u000e"))) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprudda.cfr_renamed_9("L<Az[}\\(_-@/[}B2K8\u000f")).append(arg0).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public Key engineUnwrap(byte[] arg0, String arg1, int arg2) throws InvalidKeyException {
        byte[] byArray;
        try {
            byArray = this.engineDoFinal(arg0, 0, arg0.length);
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
                if (privateKey == null) throw new InvalidKeyException(new StringBuilder().insert(0, sprlrc.cfr_renamed_9("R T#A%G$^l")).append(sprmke2.cfr_renamed_1254().cfr_renamed_593()).append(sprudda.cfr_renamed_9("}A2[}\\(_-@/[8K")).toString());
                return privateKey;
            }
            catch (Exception exception) {
                throw new InvalidKeyException(sprlrc.cfr_renamed_9("\u0005]:R Z(\u0013'V5\u0013)]/\\(Z\"Tb"));
            }
        }
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(arg1, "BC");
            if (arg2 == 1) {
                return keyFactory.generatePublic(new X509EncodedKeySpec(byArray));
            }
            if (arg2 != 2) throw new InvalidKeyException(new StringBuilder().insert(0, sprlrc.cfr_renamed_9("\u0019]']#D\"\u0013'V5\u00138J<Vl")).append(arg2).toString());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(byArray));
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprudda.cfr_renamed_9("z3D3@*A}D8V}[$_8\u000f")).append(noSuchProviderException.getMessage()).toString());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprlrc.cfr_renamed_9("\u0019]']#D\"\u0013'V5\u00138J<Vl")).append(noSuchAlgorithmException.getMessage()).toString());
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprudda.cfr_renamed_9("z3D3@*A}D8V}[$_8\u000f")).append(invalidKeySpecException.getMessage()).toString());
        }
    }

    @Override
    public byte[] engineGetIV() {
        if (this.cfr_renamed_145 != null) {
            return this.cfr_renamed_145.cfr_renamed_1205();
        }
        return null;
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = new byte[arg2];
        this.cfr_renamed_79.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
        return byArray;
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
            throw new InvalidKeyException(invalidAlgorithmParameterException.getMessage());
        }
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws BadPaddingException, IllegalBlockSizeException {
        if (arg2 != 0) {
            sprfnb sprfnb2 = this;
            byte[] byArray = sprfnb2.engineUpdate(arg0, arg1, arg2);
            sprfnb2.cfr_renamed_79.cfr_renamed_41();
            return byArray;
        }
        this.cfr_renamed_79.cfr_renamed_41();
        return new byte[0];
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }
}

