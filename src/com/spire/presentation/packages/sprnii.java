/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.charts.entity.ChartLegend;
import com.spire.presentation.packages.spramk;
import com.spire.presentation.packages.sprcwj;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgbi;
import com.spire.presentation.packages.sprjdi;
import com.spire.presentation.packages.sprjy;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmfi;
import com.spire.presentation.packages.sprmki;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.spruck;
import com.spire.presentation.packages.sprvv;
import com.spire.presentation.packages.sprybl;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

public class sprnii
extends sprmki
implements sprjy {
    private String cfr_renamed_724;
    private sprvv cfr_renamed_953;
    private PBEParameterSpec cfr_renamed_133;
    private int cfr_renamed_185;
    private int cfr_renamed_82;
    private int cfr_renamed_126;
    private sprkpk cfr_renamed_3;
    private Class[] cfr_renamed_4;

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        byte[] byArray = new byte[arg2];
        this.cfr_renamed_953.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprnii(sprvv sprvv2, int n, int n2, int n3) {
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        Class[] classArray = new Class[4];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = IvParameterSpec.class;
        classArray[3] = PBEParameterSpec.class;
        this.cfr_renamed_4 = classArray;
        sprnii sprnii2 = this;
        sprnii sprnii3 = this;
        sprnii sprnii4 = this;
        this.cfr_renamed_185 = 0;
        sprnii4.cfr_renamed_133 = null;
        sprnii4.cfr_renamed_724 = null;
        sprnii3.cfr_renamed_953 = arg0;
        sprnii3.cfr_renamed_185 = arg1;
        sprnii2.cfr_renamed_82 = arg2;
        sprnii2.cfr_renamed_126 = arg3;
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        block7: {
            block9: {
                block8: {
                    if (this.cfr_renamed_2 != null) break block7;
                    if (this.cfr_renamed_133 != null) {
                        try {
                            v0 = this;
                            var1_1 = v0.cfr_renamed_9250(v0.cfr_renamed_724);
                            var1_1.init(this.cfr_renamed_133);
                            return var1_1;
                        }
                        catch (Exception var1_2) {
                            return null;
                        }
                    }
                    if (this.cfr_renamed_3 == null) break block7;
                    var1_3 = this.cfr_renamed_953.cfr_renamed_1315();
                    if (var1_3.indexOf(47) >= 0) {
                        v1 = var1_3;
                        var1_3 = v1.substring(0, v1.indexOf(47));
                    }
                    if (!var1_3.startsWith(spramk.cfr_renamed_9("jEHnAL\u001e\u0018\u001a\u0014"))) break block8;
                    var1_3 = ChartLegend.cfr_renamed_9("9Y\u001br\u0012PM\u0004I\b");
                    v2 = this;
                    ** GOTO lbl30
                }
                if (!var1_3.startsWith(spramk.cfr_renamed_9("j[L@C"))) break block9;
                var1_3 = ChartLegend.cfr_renamed_9("v\bP\u0013_\f\u0000");
                v2 = this;
                ** GOTO lbl30
            }
            if (var1_3.startsWith(spramk.cfr_renamed_9("an"))) {
                var2_4 = var1_3.indexOf(45);
                var1_3 = new StringBuilder().insert(0, var1_3.substring(0, var2_4)).append(var1_3.substring(var2_4 + 1)).toString();
            }
            try {
                v2 = this;
lbl30:
                // 3 sources

                v2.cfr_renamed_2 = this.cfr_renamed_9250(var1_3);
                this.cfr_renamed_2.init(new IvParameterSpec(this.cfr_renamed_3.cfr_renamed_1205()));
                v3 = this;
                return v3.cfr_renamed_2;
            }
            catch (Exception var2_5) {
                throw new RuntimeException(var2_5.toString());
            }
        }
        v3 = this;
        return v3.cfr_renamed_2;
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (arg2 != null && (algorithmParameterSpec = sprmfi.cfr_renamed_9238(arg2, this.cfr_renamed_4)) == null) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, ChartLegend.cfr_renamed_9("R\u001b_]EZY\u001b_\u001e]\u001f\u0011\nP\bP\u0017T\u000eT\b\u0011")).append(arg2.toString()).toString());
        }
        this.engineInit(arg0, arg1, algorithmParameterSpec, arg3);
        this.cfr_renamed_2 = arg2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        if (arg4 + arg2 > arg3.length) {
            throw new ShortBufferException(spramk.cfr_renamed_9("FX]]\\Y\tO\\KOH[\r]BF\rZEF_]\rOB[\r@CYX]\u0003"));
        }
        try {
            this.cfr_renamed_953.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
            return arg2;
        }
        catch (sprddl sprddl2) {
            throw new IllegalStateException(sprddl2.getMessage());
        }
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            sprnii sprnii2 = this;
            byte[] byArray = sprnii2.engineUpdate(arg0, arg1, arg2);
            sprnii2.cfr_renamed_953.cfr_renamed_41();
            return byArray;
        }
        this.cfr_renamed_953.cfr_renamed_41();
        return new byte[0];
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length * 8;
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        if (!arg0.equalsIgnoreCase(ChartLegend.cfr_renamed_9("\u007f\u0015a\u001bU\u001eX\u0014V"))) {
            throw new NoSuchPaddingException(new StringBuilder().insert(0, spramk.cfr_renamed_9("yLMI@CN\r")).append(arg0).append(ChartLegend.cfr_renamed_9("\u0011\u000f_\u0011_\u0015F\u0014\u001f")).toString());
        }
    }

    @Override
    public byte[] engineGetIV() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3.cfr_renamed_1205();
        }
        return null;
    }

    public sprnii(sprvv arg0, int arg1) {
        this(arg0, arg1, -1, -1);
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
            throw new InvalidKeyException(invalidAlgorithmParameterException.getMessage());
        }
    }

    public sprnii(sprvv arg0, int arg1, int arg2) {
        this(arg0, arg1, arg2, -1);
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        if (!arg0.equalsIgnoreCase(spramk.cfr_renamed_9("hjo")) && !arg0.equals(ChartLegend.cfr_renamed_9("4~4t"))) {
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, spramk.cfr_renamed_9("NHC\u000eY\t^\\]YB[Y\t@FIL\r")).append(arg0).toString());
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void engineInit(int var1_1, Key var2_2, AlgorithmParameterSpec var3_3, SecureRandom var4_4) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block25: {
            block26: {
                block23: {
                    block24: {
                        block22: {
                            v0 = this;
                            this.cfr_renamed_133 = null;
                            v0.cfr_renamed_724 = null;
                            v0.cfr_renamed_2 = null;
                            if (!(var2_2 instanceof SecretKey)) {
                                throw new InvalidKeyException(new StringBuilder().insert(0, ChartLegend.cfr_renamed_9("1T\u0003\u0011\u001c^\b\u0011\u001b]\u001d^\bX\u000eY\u0017\u0011")).append(arg1.getAlgorithm()).append(spramk.cfr_renamed_9("\tCFY\t^\\D]LKAL\rOB[\rZTD@LY[DJ\rLC[TYY@BG\u0003")).toString());
                            }
                            if (!(arg1 instanceof spruck)) break block22;
                            var6_5 = (spruck)arg1;
                            this.cfr_renamed_133 = (PBEParameterSpec)arg2;
                            if (var6_5 instanceof sprcwj && this.cfr_renamed_133 == null) {
                                v1 = this;
                                v1.cfr_renamed_133 = new PBEParameterSpec(((sprcwj)var6_5).getSalt(), ((sprcwj)var6_5).getIterationCount());
                            }
                            v2 = this;
                            v3 = this;
                            var5_7 /* !! */  = sprjdi.cfr_renamed_9251(var6_5.getEncoded(), 2, v2.cfr_renamed_126, v2.cfr_renamed_82, this.cfr_renamed_185 * 8, v3.cfr_renamed_133, v3.cfr_renamed_953.cfr_renamed_1315());
                            v4 = this;
                            break block23;
                        }
                        if (!(arg1 instanceof sprgbi)) break block24;
                        var6_5 = (sprgbi)arg1;
                        if (var6_5.cfr_renamed_113() != null) {
                            v5 = var6_5;
                            v6 = v5;
                            this.cfr_renamed_724 = v5.cfr_renamed_113().cfr_renamed_19();
                        } else {
                            this.cfr_renamed_724 = var6_5.getAlgorithm();
                            v6 = var6_5;
                        }
                        if (v6.cfr_renamed_2292() != null) {
                            v7 = var6_5;
                            v8 = v7;
                            var5_7 /* !! */  = v7.cfr_renamed_2292();
                            this.cfr_renamed_133 = new PBEParameterSpec(var6_5.getSalt(), var6_5.getIterationCount());
                        } else if (arg2 instanceof PBEParameterSpec) {
                            var5_7 /* !! */  = sprjdi.cfr_renamed_9249((sprgbi)var6_5, (AlgorithmParameterSpec)arg2, this.cfr_renamed_953.cfr_renamed_1315());
                            this.cfr_renamed_133 = (PBEParameterSpec)arg2;
                            v8 = var6_5;
                        } else {
                            throw new InvalidAlgorithmParameterException(ChartLegend.cfr_renamed_9("*s?\u0011\bT\u000bD\u0013C\u001fBZa8tZA\u001bC\u001b\\\u001fE\u001fC\t\u0011\u000e^ZS\u001f\u0011\tT\u000e\u001f"));
                        }
                        if (v8.cfr_renamed_2294() != 0) {
                            this.cfr_renamed_3 = (sprkpk)var5_7 /* !! */ ;
                        }
                        ** GOTO lbl58
                    }
                    if (arg2 == null) {
                        if (this.cfr_renamed_126 > 0) {
                            throw new InvalidKeyException(spramk.cfr_renamed_9("hANB[D]ED\r[HXX@_L^\tL\t}kh\tFLT"));
                        }
                        var5_7 /* !! */  = new sprtpk(arg1.getEncoded());
                        v4 = this;
                    } else if (arg2 instanceof IvParameterSpec) {
                        var5_7 /* !! */  = new sprkpk(new sprtpk(arg1.getEncoded()), ((IvParameterSpec)arg2).getIV());
                        this.cfr_renamed_3 = (sprkpk)var5_7 /* !! */ ;
                        v4 = this;
                    } else {
                        throw new InvalidAlgorithmParameterException(ChartLegend.cfr_renamed_9("D\u0014Z\u0014^\r_ZA\u001bC\u001b\\\u001fE\u001fCZE\u0003A\u001f\u001f"));
lbl58:
                        // 1 sources

                        v4 = this;
                    }
                }
                if (v4.cfr_renamed_185 == 0 || var5_7 /* !! */  instanceof sprkpk) break block25;
                var6_5 = arg3;
                if (var6_5 == null) {
                    var6_5 = sprybl.cfr_renamed_2794();
                }
                if (arg0 != true && arg0 != 3) break block26;
                var7_8 = new byte[this.cfr_renamed_185];
                var6_5.nextBytes(var7_8);
                var5_7 /* !! */  = new sprkpk(var5_7 /* !! */ , var7_8);
                this.cfr_renamed_3 = var5_7 /* !! */ ;
                v9 = arg0;
                ** GOTO lbl78
            }
            throw new InvalidAlgorithmParameterException(spramk.cfr_renamed_9("CF\r`{\t^LY\tZAHG\rFCL\rLUYHJYLI"));
        }
        try {
            v9 = arg0;
lbl78:
            // 2 sources

            switch (v9) {
                case 1: 
                case 3: {
                    while (false) {
                    }
                    this.cfr_renamed_953.cfr_renamed_5535(true, var5_7 /* !! */ );
                    return;
                }
                case 2: 
                case 4: {
                    this.cfr_renamed_953.cfr_renamed_5535(false, var5_7 /* !! */ );
                    return;
                }
            }
            throw new InvalidParameterException(new StringBuilder().insert(0, ChartLegend.cfr_renamed_9("D\u0014Z\u0014^\r_Z^\n\\\u0015U\u001f\u0011")).append((int)arg0).append(spramk.cfr_renamed_9("\rYLZ^LI")).toString());
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
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        if (arg4 + arg2 > arg3.length) {
            throw new ShortBufferException(ChartLegend.cfr_renamed_9("\u0015D\u000eA\u000fEZS\u000fW\u001cT\b\u0011\u000e^\u0015\u0011\tY\u0015C\u000e\u0011\u001c^\b\u0011\u0013_\nD\u000e\u001f"));
        }
        if (arg2 != 0) {
            this.cfr_renamed_953.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
        }
        this.cfr_renamed_953.cfr_renamed_41();
        return arg2;
    }
}

