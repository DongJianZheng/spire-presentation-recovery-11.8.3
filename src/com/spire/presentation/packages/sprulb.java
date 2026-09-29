/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprgb;
import com.spire.presentation.packages.sprhrb;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprkkaa;
import com.spire.presentation.packages.sprklg;
import com.spire.presentation.packages.sprmpb;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprqk;
import com.spire.presentation.packages.sprvqb;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

public class sprulb
extends sprhrb
implements sprgb {
    private sprqk cfr_renamed_137;
    private int cfr_renamed_79;
    private PBEParameterSpec cfr_renamed_1;
    private Class[] cfr_renamed_2;
    private String cfr_renamed_3;
    private sprnjd cfr_renamed_4;

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            sprulb sprulb2 = this;
            byte[] byArray = sprulb2.engineUpdate(arg0, arg1, arg2);
            sprulb2.cfr_renamed_137.cfr_renamed_41();
            return byArray;
        }
        this.cfr_renamed_137.cfr_renamed_41();
        return new byte[0];
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void engineInit(int var1_1, Key var2_2, AlgorithmParameterSpec var3_3, SecureRandom var4_4) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block21: {
            block22: {
                block20: {
                    v0 = this;
                    this.cfr_renamed_1 = null;
                    v0.cfr_renamed_3 = null;
                    v0.cfr_renamed_145 = null;
                    if (!(var2_2 instanceof SecretKey)) {
                        throw new InvalidKeyException(new StringBuilder().insert(0, sprkkaa.cfr_renamed_9("g&UcJ,^cM/K,^*X+Ac")).append(arg1.getAlgorithm()).append(sprklg.cfr_renamed_9("\u001c|Sf\u001caI{Hs^~Y2Z}N2OkQ\u007fYfN{_2Y|NkLfU}R<")).toString());
                    }
                    if (!(arg1 instanceof sprmpb)) break block20;
                    var6_5 = (sprmpb)arg1;
                    if (var6_5.cfr_renamed_113() != null) {
                        v1 = var6_5;
                        v2 = v1;
                        this.cfr_renamed_3 = v1.cfr_renamed_113().cfr_renamed_19();
                    } else {
                        this.cfr_renamed_3 = var6_5.getAlgorithm();
                        v2 = var6_5;
                    }
                    if (v2.cfr_renamed_2292() != null) {
                        v3 = var6_5;
                        v4 = v3;
                        var5_7 /* !! */  = v3.cfr_renamed_2292();
                        v5 = this;
                        v5.cfr_renamed_1 = new PBEParameterSpec(var6_5.getSalt(), var6_5.getIterationCount());
                    } else if (arg2 instanceof PBEParameterSpec) {
                        var5_7 /* !! */  = sprvqb.cfr_renamed_2293((sprmpb)var6_5, (AlgorithmParameterSpec)arg2, this.cfr_renamed_137.cfr_renamed_1315());
                        this.cfr_renamed_1 = (PBEParameterSpec)arg2;
                        v4 = var6_5;
                    } else {
                        throw new InvalidAlgorithmParameterException(sprkkaa.cfr_renamed_9("|\u0001ic^&]6E1I0\f\u0013n\u0006\f3M1M.I7I1_cX,\f!Ic_&Xm"));
                    }
                    if (v4.cfr_renamed_2294() != 0) {
                        this.cfr_renamed_4 = (sprnjd)var5_7 /* !! */ ;
                    }
                    ** GOTO lbl45
                }
                if (arg2 == null) {
                    var5_7 /* !! */  = new sprnld(arg1.getEncoded());
                    v6 = this;
                } else if (arg2 instanceof IvParameterSpec) {
                    var5_7 /* !! */  = new sprnjd(new sprnld(arg1.getEncoded()), ((IvParameterSpec)arg2).getIV());
                    this.cfr_renamed_4 = (sprnjd)var5_7 /* !! */ ;
                    v6 = this;
                } else {
                    throw new InvalidAlgorithmParameterException(sprklg.cfr_renamed_9("gRyR}K|\u001cb]`]\u007fYfY`\u001cfEbY<"));
lbl45:
                    // 1 sources

                    v6 = this;
                }
                if (v6.cfr_renamed_79 == 0 || var5_7 /* !! */  instanceof sprnjd) break block21;
                var6_5 = arg3;
                if (var6_5 == null) {
                    var6_5 = new SecureRandom();
                }
                if (arg0 != true && arg0 != 3) break block22;
                var7_8 = new byte[this.cfr_renamed_79];
                var6_5.nextBytes(var7_8);
                var5_7 /* !! */  = new sprnjd(var5_7 /* !! */ , var7_8);
                this.cfr_renamed_4 = var5_7 /* !! */ ;
                v7 = arg0;
                ** GOTO lbl64
            }
            throw new InvalidAlgorithmParameterException(sprkkaa.cfr_renamed_9("-Cce\u0015\f0I7\f4D&BcC-IcI;\\&O7I'"));
        }
        try {
            v7 = arg0;
lbl64:
            // 2 sources

            switch (v7) {
                case 1: 
                case 3: {
                    while (false) {
                    }
                    this.cfr_renamed_137.cfr_renamed_1217(true, var5_7 /* !! */ );
                    return;
                }
                case 2: 
                case 4: {
                    this.cfr_renamed_137.cfr_renamed_1217(false, var5_7 /* !! */ );
                    return;
                }
            }
            throw new InvalidParameterException(new StringBuilder().insert(0, sprklg.cfr_renamed_9("gRyR}K|\u001c}L\u007fSvY2")).append((int)arg0).append(sprkkaa.cfr_renamed_9("c\\\"_0I'")).toString());
        }
        catch (Exception var6_6) {
            throw new InvalidKeyException(var6_6.getMessage());
        }
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return arg0;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        if (!arg0.equalsIgnoreCase(sprklg.cfr_renamed_9("\\SB]vX{Ru"))) {
            throw new NoSuchPaddingException(new StringBuilder().insert(0, sprkkaa.cfr_renamed_9("|\"H'E-Kc")).append(arg0).append(sprklg.cfr_renamed_9("2I|W|SeR<")).toString());
        }
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length * 8;
    }

    /*
     * WARNING - void declaration
     */
    public sprulb(sprqk sprqk2, int n) {
        void arg1;
        void arg0;
        Class[] classArray = new Class[4];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = IvParameterSpec.class;
        classArray[3] = PBEParameterSpec.class;
        this.cfr_renamed_2 = classArray;
        sprulb sprulb2 = this;
        sprulb sprulb3 = this;
        this.cfr_renamed_79 = 0;
        sprulb3.cfr_renamed_1 = null;
        sprulb3.cfr_renamed_3 = null;
        sprulb2.cfr_renamed_137 = arg0;
        sprulb2.cfr_renamed_79 = arg1;
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = new byte[arg2];
        this.cfr_renamed_137.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
        return byArray;
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        if (arg2 != 0) {
            this.cfr_renamed_137.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
        }
        this.cfr_renamed_137.cfr_renamed_41();
        return arg2;
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
    public byte[] engineGetIV() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_1205();
        }
        return null;
    }

    @Override
    public void engineSetMode(String arg0) {
        if (!arg0.equalsIgnoreCase(sprkkaa.cfr_renamed_9("\u0006o\u0001"))) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprklg.cfr_renamed_9("q]|\u001bf\u001caIbL}Nf\u001c\u007fSvY2")).append(arg0).toString());
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        if (this.cfr_renamed_145 == null && this.cfr_renamed_1 != null) {
            try {
                AlgorithmParameters algorithmParameters = AlgorithmParameters.getInstance(this.cfr_renamed_3, "BC");
                algorithmParameters.init(this.cfr_renamed_1);
                return algorithmParameters;
            }
            catch (Exception exception) {
                return null;
            }
        }
        return this.cfr_renamed_145;
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
                while (n2 != this.cfr_renamed_2.length) {
                    try {
                        algorithmParameterSpec2 = algorithmParameterSpec = (AlgorithmParameterSpec)arg2.getParameterSpec(this.cfr_renamed_2[n]);
                        break block5;
                    }
                    catch (Exception exception) {
                        n2 = ++n;
                    }
                }
                algorithmParameterSpec2 = algorithmParameterSpec;
            }
            if (algorithmParameterSpec2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprkkaa.cfr_renamed_9(" M-\u000b7\f+M-H/Ic\\\"^\"A&X&^c")).append(arg2.toString()).toString());
            }
        }
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
        this.cfr_renamed_145 = arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        try {
            this.cfr_renamed_137.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
            return arg2;
        }
        catch (sprjkd sprjkd2) {
            throw new ShortBufferException(sprjkd2.getMessage());
        }
    }

    @Override
    public int engineGetBlockSize() {
        return 0;
    }
}

