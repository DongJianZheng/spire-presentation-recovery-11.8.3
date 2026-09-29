/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprac;
import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprcgd;
import com.spire.presentation.packages.sprcmd;
import com.spire.presentation.packages.sprdob;
import com.spire.presentation.packages.sprdrb;
import com.spire.presentation.packages.spreid;
import com.spire.presentation.packages.sprepaa;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgb;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprhkd;
import com.spire.presentation.packages.sprhld;
import com.spire.presentation.packages.sprhrb;
import com.spire.presentation.packages.sprigd;
import com.spire.presentation.packages.sprikd;
import com.spire.presentation.packages.sprild;
import com.spire.presentation.packages.sprjc;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprkkd;
import com.spire.presentation.packages.sprlfd;
import com.spire.presentation.packages.sprljd;
import com.spire.presentation.packages.sprmnja;
import com.spire.presentation.packages.sprmpb;
import com.spire.presentation.packages.sprncd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprnob;
import com.spire.presentation.packages.sprodd;
import com.spire.presentation.packages.sprpid;
import com.spire.presentation.packages.sprpj;
import com.spire.presentation.packages.sprpob;
import com.spire.presentation.packages.sprrfd;
import com.spire.presentation.packages.sprsdd;
import com.spire.presentation.packages.sprsld;
import com.spire.presentation.packages.sprvkd;
import com.spire.presentation.packages.sprvqb;
import com.spire.presentation.packages.sprwid;
import com.spire.presentation.packages.sprxdd;
import com.spire.presentation.packages.sprxfd;
import com.spire.presentation.packages.spryed;
import com.spire.presentation.packages.spryve;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzcd;
import java.nio.ByteBuffer;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKey;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;

public class sprntb
extends sprhrb
implements sprgb {
    private Class[] cfr_renamed_114;
    private sprnjd cfr_renamed_96;
    private sprac cfr_renamed_105;
    private sprff cfr_renamed_137;
    private int cfr_renamed_79;
    private sprjc cfr_renamed_119;
    private boolean cfr_renamed_91;
    private String cfr_renamed_0;
    private static final Class cfr_renamed_1 = sprntb.cfr_renamed_2406(sprmnja.cfr_renamed_9("\f9\u00109\u001ev\u0005*\u001f(\u00127H+\u0016=\u0005v!\u001b+\b\u0007*\u00075\u0003,\u0003*5(\u0003;"));
    private String cfr_renamed_2;
    private PBEParameterSpec cfr_renamed_3;
    private sprxfd cfr_renamed_4;

    private /* synthetic */ boolean cfr_renamed_2407(String arg0) {
        return sprmnja.cfr_renamed_9("\u001b%\u0015").equals(arg0) || sprepaa.cfr_renamed_9("e8x").equals(arg0) || sprmnja.cfr_renamed_9("\u001f%\u0015").equals(arg0) || sprepaa.cfr_renamed_9("o:b").equals(arg0);
    }

    public static /* synthetic */ Class cfr_renamed_2408(String arg0) {
        return sprntb.cfr_renamed_2406(arg0);
    }

    @Override
    public byte[] engineGetIV() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_596();
        }
        if (this.cfr_renamed_96 != null) {
            return this.cfr_renamed_96.cfr_renamed_1205();
        }
        return null;
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

    /*
     * WARNING - void declaration
     */
    public sprntb(sprac sprac2) {
        void arg0;
        Class[] classArray = new Class[6];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = IvParameterSpec.class;
        classArray[3] = PBEParameterSpec.class;
        classArray[4] = sprdob.class;
        classArray[5] = cfr_renamed_1;
        this.cfr_renamed_114 = classArray;
        sprntb sprntb2 = this;
        sprntb sprntb3 = this;
        sprntb sprntb4 = this;
        sprntb4.cfr_renamed_79 = 0;
        sprntb4.cfr_renamed_3 = null;
        sprntb3.cfr_renamed_2 = null;
        sprntb3.cfr_renamed_0 = null;
        sprntb2.cfr_renamed_137 = arg0.cfr_renamed_1397();
        sprntb2.cfr_renamed_105 = arg0;
        sprntb sprntb5 = this;
        sprntb2.cfr_renamed_119 = new sprdrb(arg0.cfr_renamed_1397());
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
            block6: {
                int n;
                int n2 = n = 0;
                while (n2 != this.cfr_renamed_114.length) {
                    if (this.cfr_renamed_114[n] != null) {
                        try {
                            algorithmParameterSpec2 = algorithmParameterSpec = (AlgorithmParameterSpec)arg2.getParameterSpec(this.cfr_renamed_114[n]);
                            break block6;
                        }
                        catch (Exception exception) {
                            // empty catch block
                        }
                    }
                    n2 = ++n;
                }
                algorithmParameterSpec2 = algorithmParameterSpec;
            }
            if (algorithmParameterSpec2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprmnja.cfr_renamed_9(";\u00076A,F0\u00076\u00024\u0003x\u00169\u00149\u000b=\u0012=\u0014x")).append(arg2.toString()).toString());
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
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        try {
            int n = 0;
            if (arg2 != 0) {
                n = this.cfr_renamed_119.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
            }
            return n + this.cfr_renamed_119.cfr_renamed_1219(arg3, arg4 + n);
        }
        catch (spreid spreid2) {
            throw new ShortBufferException(spreid2.getMessage());
        }
        catch (sprjkd sprjkd2) {
            throw new IllegalBlockSizeException(sprjkd2.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprntb(sprff sprff2) {
        void arg0;
        Class[] classArray = new Class[6];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = IvParameterSpec.class;
        classArray[3] = PBEParameterSpec.class;
        classArray[4] = sprdob.class;
        classArray[5] = cfr_renamed_1;
        this.cfr_renamed_114 = classArray;
        sprntb sprntb2 = this;
        sprntb sprntb3 = this;
        this.cfr_renamed_79 = 0;
        sprntb3.cfr_renamed_3 = null;
        sprntb3.cfr_renamed_2 = null;
        sprntb2.cfr_renamed_0 = null;
        sprntb2.cfr_renamed_137 = arg0;
        sprntb sprntb4 = this;
        sprntb2.cfr_renamed_119 = new sprdrb((sprff)arg0);
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return this.cfr_renamed_119.cfr_renamed_1202(arg0);
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprepaa.cfr_renamed_9("n6p8d=i7g"))) {
            if (this.cfr_renamed_119.cfr_renamed_2409()) {
                sprntb sprntb2 = this;
                sprntb2.cfr_renamed_119 = new sprdrb(new sprxdd(this.cfr_renamed_119.cfr_renamed_2349()));
                return;
            }
        } else {
            if (string.equals(sprmnja.cfr_renamed_9("\u000f/\f.\u001b2\u000b"))) {
                this.cfr_renamed_119 = new sprdrb(new sprhkd(this.cfr_renamed_119.cfr_renamed_2349()));
                return;
            }
            sprntb sprntb3 = this;
            sprntb3.cfr_renamed_91 = true;
            if (sprntb3.cfr_renamed_2407(sprntb3.cfr_renamed_0)) {
                throw new NoSuchPaddingException(sprepaa.cfr_renamed_9("o\u0017L\u0000\u00007O)A\u001dD\u0010N\u001e\u0000\u001aA\u0017\u0000\u001bEYU\nE\u001d\u0000\u000eI\rHYa<a=\u0000\u0014O\u001dE\n\u000e"));
            }
            if (string.equals(sprmnja.cfr_renamed_9("6\u0013%\u000bS\b'\u001c\"\u0011(\u001f")) || string.equals(sprepaa.cfr_renamed_9(")k:sNp8d=i7g"))) {
                this.cfr_renamed_119 = new sprdrb(this.cfr_renamed_119.cfr_renamed_2349());
                return;
            }
            if (string.equals(sprmnja.cfr_renamed_9("\u0002#\n)\u001a?\f#\b'\u001c\"\u0011(\u001f"))) {
                this.cfr_renamed_119 = new sprdrb(this.cfr_renamed_119.cfr_renamed_2349(), new sprzcd());
                return;
            }
            if (string.equals(sprepaa.cfr_renamed_9("i*oH\u0010H\u0012Op8d=i7g")) || string.equals(sprmnja.cfr_renamed_9("\u00115\u0017WhWjPuT\b'\u001c\"\u0011(\u001f"))) {
                this.cfr_renamed_119 = new sprdrb(this.cfr_renamed_119.cfr_renamed_2349(), new sprsdd());
                return;
            }
            if (string.equals(sprepaa.cfr_renamed_9("!\u0019W\u0012Jp8d=i7g")) || string.equals(sprmnja.cfr_renamed_9("\u0000_jU\b'\u001c\"\u0011(\u001f"))) {
                this.cfr_renamed_119 = new sprdrb(this.cfr_renamed_119.cfr_renamed_2349(), new sprpid());
                return;
            }
            if (string.equals(sprepaa.cfr_renamed_9("0s6\u0017A\u0011O\rMp8d=i7g")) || string.equals(sprmnja.cfr_renamed_9("/\u000b)aQaQuW\b'\u001c\"\u0011(\u001f"))) {
                this.cfr_renamed_119 = new sprdrb(this.cfr_renamed_119.cfr_renamed_2349(), new sprigd());
                return;
            }
            if (string.equals(sprepaa.cfr_renamed_9("-b:p8d=i7g"))) {
                this.cfr_renamed_119 = new sprdrb(this.cfr_renamed_119.cfr_renamed_2349(), new sprlfd());
                return;
            }
            throw new NoSuchPaddingException(new StringBuilder().insert(0, sprmnja.cfr_renamed_9("69\u0002<\u000f6\u0001x")).append(arg0).append(sprepaa.cfr_renamed_9("\u0000\fN\u0012N\u0016W\u0017\u000e")).toString());
        }
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        int n = this.cfr_renamed_119.cfr_renamed_2345(arg2);
        if (n > 0) {
            byte[] byArray = new byte[n];
            int n2 = this.cfr_renamed_119.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
            if (n2 == 0) {
                return null;
            }
            if (n2 != byArray.length) {
                byte[] byArray2 = new byte[n2];
                System.arraycopy(byArray, 0, byArray2, 0, n2);
                return byArray2;
            }
            return byArray;
        }
        this.cfr_renamed_119.cfr_renamed_505(arg0, arg1, arg2, null, 0);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        int n = 0;
        byte[] byArray = new byte[this.engineGetOutputSize(arg2)];
        if (arg2 != 0) {
            n = this.cfr_renamed_119.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
        }
        try {
            n += this.cfr_renamed_119.cfr_renamed_1219(byArray, n);
        }
        catch (sprjkd sprjkd2) {
            throw new IllegalBlockSizeException(sprjkd2.getMessage());
        }
        if (n == byArray.length) {
            return byArray;
        }
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, 0, byArray2, 0, n);
        return byArray2;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void engineInit(int var1_1, Key var2_2, AlgorithmParameterSpec var3_3, SecureRandom var4_4) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block53: {
            block51: {
                block54: {
                    block55: {
                        block52: {
                            block47: {
                                block50: {
                                    block48: {
                                        block49: {
                                            v0 = this;
                                            v1 = this;
                                            v1.cfr_renamed_3 = null;
                                            v1.cfr_renamed_2 = null;
                                            v0.cfr_renamed_145 = null;
                                            v0.cfr_renamed_4 = null;
                                            if (!(var2_2 instanceof SecretKey)) {
                                                throw new InvalidKeyException(new StringBuilder().insert(0, sprmnja.cfr_renamed_9("-=\u001fx\u00007\u0014x\u00074\u00017\u00141\u00120\u000bx")).append(arg1.getAlgorithm()).append(sprepaa.cfr_renamed_9("YN\u0016TYS\fI\rA\u001bL\u001c\u0000\u001fO\u000b\u0000\nY\u0014M\u001cT\u000bI\u001a\u0000\u001cN\u000bY\tT\u0010O\u0017\u000e")).toString());
                                            }
                                            if (arg2 == null && this.cfr_renamed_137.cfr_renamed_1315().startsWith(sprmnja.cfr_renamed_9("4\u001bSuPl"))) {
                                                throw new InvalidAlgorithmParameterException(sprepaa.cfr_renamed_9("+cL\u0000\u000bE\bU\u0010R\u001cSYA\u0017\u0000+cLp\u0018R\u0018M\u001cT\u001cR\ns\tE\u001a\u0000\rOYB\u001c\u0000\tA\nS\u001cDYI\u0017\u000e"));
                                            }
                                            if (!(arg1 instanceof sprmpb)) break block47;
                                            var6_5 = (sprmpb)arg1;
                                            if (var6_5.cfr_renamed_113() != null) {
                                                v2 = var6_5;
                                                v3 = v2;
                                                this.cfr_renamed_2 = v2.cfr_renamed_113().cfr_renamed_19();
                                            } else {
                                                this.cfr_renamed_2 = var6_5.getAlgorithm();
                                                v3 = var6_5;
                                            }
                                            if (v3.cfr_renamed_2292() == null) break block48;
                                            var5_8 /* !! */  = var6_5.cfr_renamed_2292();
                                            if (!(arg2 instanceof IvParameterSpec)) break block49;
                                            var7_9 = (IvParameterSpec)arg2;
                                            v4 /* !! */  = var5_8 /* !! */  = new sprnjd(var5_8 /* !! */ , var7_9.getIV());
                                            break block50;
                                        }
                                        if (arg2 instanceof sprdob) {
                                            var7_9 = (sprdob)arg2;
                                            var5_8 /* !! */  = new sprrfd(var5_8 /* !! */ , var7_9.cfr_renamed_2387());
                                            if (var7_9.cfr_renamed_1205() != null && this.cfr_renamed_79 != 0) {
                                                var5_8 /* !! */  = new sprnjd(var5_8 /* !! */ , var7_9.cfr_renamed_1205());
                                            }
                                        }
                                        ** GOTO lbl39
                                    }
                                    if (arg2 instanceof PBEParameterSpec) {
                                        this.cfr_renamed_3 = (PBEParameterSpec)arg2;
                                        v4 /* !! */  = var5_8 /* !! */  = sprvqb.cfr_renamed_2293((sprmpb)var6_5, (AlgorithmParameterSpec)arg2, this.cfr_renamed_119.cfr_renamed_2349().cfr_renamed_1315());
                                    } else {
                                        throw new InvalidAlgorithmParameterException(sprmnja.cfr_renamed_9("6\u001a#x\u0014=\u0017-\u000f*\u0003+F\b$\u001dF(\u0007*\u00075\u0003,\u0003*\u0015x\u00127F:\u0003x\u0015=\u0012v"));
lbl39:
                                        // 1 sources

                                        v4 /* !! */  = var5_8 /* !! */ ;
                                    }
                                }
                                if (v4 /* !! */  instanceof sprnjd) {
                                    this.cfr_renamed_96 = (sprnjd)var5_8 /* !! */ ;
                                }
                                break block51;
                            }
                            if (arg2 != null) break block52;
                            var5_8 /* !! */  = new sprnld(arg1.getEncoded());
                            v5 = this;
                            break block53;
                        }
                        if (!(arg2 instanceof IvParameterSpec)) break block54;
                        if (this.cfr_renamed_79 == 0) break block55;
                        var6_5 = (IvParameterSpec)arg2;
                        if (var6_5.getIV().length != this.cfr_renamed_79) {
                            v6 = this;
                            if (!v6.cfr_renamed_2407(v6.cfr_renamed_0)) {
                                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprepaa.cfr_renamed_9("i/\u0000\u0014U\nTYB\u001c\u0000")).append(this.cfr_renamed_79).append(sprmnja.cfr_renamed_9("F:\u001f,\u0003+F4\t6\u0001v")).toString());
                            }
                        }
                        if (arg1 instanceof sprpob) {
                            v7 = new sprnjd(null, var6_5.getIV());
                            var5_8 /* !! */  = v7;
                            this.cfr_renamed_96 = (sprnjd)var5_8 /* !! */ ;
                        } else {
                            v7 = new sprnjd(new sprnld(arg1.getEncoded()), var6_5.getIV());
                            var5_8 /* !! */  = v7;
                            this.cfr_renamed_96 = (sprnjd)var5_8 /* !! */ ;
                        }
                        break block51;
                    }
                    if (this.cfr_renamed_0 != null && this.cfr_renamed_0.equals(sprepaa.cfr_renamed_9("e:b"))) {
                        throw new InvalidAlgorithmParameterException(sprmnja.cfr_renamed_9("\u001d%\u001aF5\t<\u0003x\u00027\u0003+F6\t,F-\u0015=F9\bx/\u000e"));
                    }
                    var5_8 /* !! */  = new sprnld(arg1.getEncoded());
                    v5 = this;
                    break block53;
                }
                if (arg2 instanceof sprdob) {
                    var6_5 = (sprdob)arg2;
                    var5_8 /* !! */  = new sprrfd(new sprnld(arg1.getEncoded()), ((sprdob)arg2).cfr_renamed_2387());
                    if (var6_5.cfr_renamed_1205() != null && this.cfr_renamed_79 != 0) {
                        var5_8 /* !! */  = new sprnjd(var5_8 /* !! */ , var6_5.cfr_renamed_1205());
                        this.cfr_renamed_96 = (sprnjd)var5_8 /* !! */ ;
                    }
                } else if (arg2 instanceof RC2ParameterSpec) {
                    var6_5 = (RC2ParameterSpec)arg2;
                    var5_8 /* !! */  = new sprkkd(arg1.getEncoded(), ((RC2ParameterSpec)arg2).getEffectiveKeyBits());
                    if (var6_5.getIV() != null && this.cfr_renamed_79 != 0) {
                        var5_8 /* !! */  = new sprnjd(var5_8 /* !! */ , var6_5.getIV());
                        this.cfr_renamed_96 = (sprnjd)var5_8 /* !! */ ;
                    }
                } else if (arg2 instanceof RC5ParameterSpec) {
                    var6_5 = (RC5ParameterSpec)arg2;
                    var5_8 /* !! */  = new sprild(arg1.getEncoded(), ((RC5ParameterSpec)arg2).getRounds());
                    if (this.cfr_renamed_137.cfr_renamed_1315().startsWith(sprepaa.cfr_renamed_9("r:\u0015"))) {
                        if (this.cfr_renamed_137.cfr_renamed_1315().equals(sprmnja.cfr_renamed_9("4\u001bSuUj"))) {
                            if (var6_5.getWordSize() != 32) {
                                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprepaa.cfr_renamed_9("r:\u0015YA\u0015R\u001cA\u001dYYS\u001cTYU\t\u0000\u001fO\u000b\u0000\u0018\u0000\u000eO\u000bDYS\u0010Z\u001c\u0000\u0016FY\u0013K\u0000\u0017O\r\u0000")).append(var6_5.getWordSize()).append(".").toString());
                            }
                        } else if (this.cfr_renamed_137.cfr_renamed_1315().equals(sprmnja.cfr_renamed_9("4\u001bSuPl")) && var6_5.getWordSize() != 64) {
                            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprepaa.cfr_renamed_9("r:\u0015YA\u0015R\u001cA\u001dYYS\u001cTYU\t\u0000\u001fO\u000b\u0000\u0018\u0000\u000eO\u000bDYS\u0010Z\u001c\u0000\u0016FY\u0016M\u0000\u0017O\r\u0000")).append(var6_5.getWordSize()).append(".").toString());
                        }
                    } else {
                        throw new InvalidAlgorithmParameterException(sprmnja.cfr_renamed_9("4\u001bSx\u00169\u00149\u000b=\u0012=\u0014+F(\u0007+\u0015=\u0002x\u00127F9F;\u000f(\u000e=\u0014x\u00120\u0007,F1\u0015x\b7\u0012x4\u001bSv"));
                    }
                    if (var6_5.getIV() != null && this.cfr_renamed_79 != 0) {
                        var5_8 /* !! */  = new sprnjd(var5_8 /* !! */ , var6_5.getIV());
                        this.cfr_renamed_96 = (sprnjd)var5_8 /* !! */ ;
                    }
                } else if (sprntb.cfr_renamed_1 != null && sprntb.cfr_renamed_1.isInstance(arg2)) {
                    v8 = this;
                    if (!v8.cfr_renamed_2407(v8.cfr_renamed_0) && !(this.cfr_renamed_119 instanceof sprnob)) {
                        throw new InvalidAlgorithmParameterException(sprepaa.cfr_renamed_9(">c4p\u0018R\u0018M\u001cT\u001cR*P\u001cCYC\u0018NYO\u0017L\u0000\u0000\u001bEYU\nE\u001d\u0000\u000eI\rHYa<a=\u0000\u0014O\u001dE\n\u000e"));
                    }
                    try {
                        var6_5 = sprntb.cfr_renamed_1.getDeclaredMethod(sprmnja.cfr_renamed_9("?\u0003,2\u0014\u00036"), new Class[0]);
                        var7_9 = sprntb.cfr_renamed_1.getDeclaredMethod(sprepaa.cfr_renamed_9("G\u001cT0v"), new Class[0]);
                        v9 = this;
                        if (arg1 instanceof sprpob) {
                            v10 = this;
                            v9.cfr_renamed_4 = new sprxfd(null, (Integer)var6_5.invoke(arg2, new Object[0]), (byte[])var7_9.invoke(arg2, new Object[0]));
                            var5_8 /* !! */  = v9.cfr_renamed_4;
                        }
                        v9.cfr_renamed_4 = new sprxfd(new sprnld(arg1.getEncoded()), (Integer)var6_5.invoke(arg2, new Object[0]), (byte[])var7_9.invoke(arg2, new Object[0]));
                        var5_8 /* !! */  = v9.cfr_renamed_4;
                    }
                    catch (Exception var6_6) {
                        throw new InvalidAlgorithmParameterException(sprmnja.cfr_renamed_9("%9\b6\t,F(\u00147\u0005=\u0015+F\u001f%\u001569\u00149\u000b=\u0012=\u0014\u000b\u0016=\u0005v"));
                    }
                } else {
                    throw new InvalidAlgorithmParameterException(sprepaa.cfr_renamed_9("U\u0017K\u0017O\u000eNYP\u0018R\u0018M\u001cT\u001cRYT\u0000P\u001c\u000e"));
                }
            }
            v5 = this;
        }
        if (v5.cfr_renamed_79 == 0 || var5_8 /* !! */  instanceof sprnjd || var5_8 /* !! */  instanceof sprxfd) ** GOTO lbl150
        var6_5 = arg3;
        if (var6_5 == null) {
            var6_5 = new SecureRandom();
        }
        if (arg0 == true || arg0 == 3) {
            var7_9 = new byte[this.cfr_renamed_79];
            var6_5.nextBytes((byte[])var7_9);
            var5_8 /* !! */  = new sprnjd(var5_8 /* !! */ , (byte[])var7_9);
            this.cfr_renamed_96 = var5_8 /* !! */ ;
            v11 = arg3;
        } else {
            if (this.cfr_renamed_119.cfr_renamed_2349().cfr_renamed_1315().indexOf(sprmnja.cfr_renamed_9("6\u001f6\u001b \u001a")) < 0) {
                throw new InvalidAlgorithmParameterException(sprepaa.cfr_renamed_9("N\u0016\u00000vYS\u001cTYW\u0011E\u0017\u0000\u0016N\u001c\u0000\u001cX\tE\u001aT\u001cD"));
            }
lbl150:
            // 3 sources

            v11 = arg3;
        }
        if (v11 != null && this.cfr_renamed_91) {
            var5_8 /* !! */  = new spraed(var5_8 /* !! */ , (SecureRandom)arg3);
        }
        try {
            switch (arg0) {
                case 1: 
                case 3: {
                    while (false) {
                    }
                    this.cfr_renamed_119.cfr_renamed_1217(true, var5_8 /* !! */ );
                    return;
                }
                case 2: 
                case 4: {
                    this.cfr_renamed_119.cfr_renamed_1217(false, var5_8 /* !! */ );
                    return;
                }
            }
            throw new InvalidParameterException(new StringBuilder().insert(0, sprmnja.cfr_renamed_9("-\b3\b7\u00116F7\u00165\t<\u0003x")).append((int)arg0).append(sprepaa.cfr_renamed_9("\u0000\tA\nS\u001cD")).toString());
        }
        catch (Exception var6_7) {
            throw new InvalidKeyException(var6_7.getMessage());
        }
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        this.cfr_renamed_0 = sprywa.cfr_renamed_116(arg0);
        if (this.cfr_renamed_0.equals(sprmnja.cfr_renamed_9("\u001d%\u001a"))) {
            this.cfr_renamed_79 = 0;
            sprntb sprntb2 = this;
            this.cfr_renamed_119 = new sprdrb(this.cfr_renamed_137);
            return;
        }
        if (this.cfr_renamed_0.equals(sprepaa.cfr_renamed_9("c;c"))) {
            this.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
            this.cfr_renamed_119 = new sprdrb(new sprgnd(this.cfr_renamed_137));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprmnja.cfr_renamed_9("\u0017 \u001a"))) {
            sprntb sprntb3 = this;
            sprntb3.cfr_renamed_79 = sprntb3.cfr_renamed_137.cfr_renamed_1195();
            if (sprntb3.cfr_renamed_0.length() != 3) {
                int n = Integer.parseInt(this.cfr_renamed_0.substring(3));
                this.cfr_renamed_119 = new sprdrb(new sprwid(this.cfr_renamed_137, n));
                return;
            }
            this.cfr_renamed_119 = new sprdrb(new sprwid(this.cfr_renamed_137, 8 * this.cfr_renamed_137.cfr_renamed_1195()));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprepaa.cfr_renamed_9("c?b"))) {
            sprntb sprntb4 = this;
            sprntb4.cfr_renamed_79 = sprntb4.cfr_renamed_137.cfr_renamed_1195();
            if (sprntb4.cfr_renamed_0.length() != 3) {
                int n = Integer.parseInt(this.cfr_renamed_0.substring(3));
                this.cfr_renamed_119 = new sprdrb(new sprcgd(this.cfr_renamed_137, n));
                return;
            }
            this.cfr_renamed_119 = new sprdrb(new sprcgd(this.cfr_renamed_137, 8 * this.cfr_renamed_137.cfr_renamed_1195()));
            return;
        }
        sprntb sprntb5 = this;
        if (this.cfr_renamed_0.startsWith(sprmnja.cfr_renamed_9("\b!\b"))) {
            boolean bl = sprntb5.cfr_renamed_0.equalsIgnoreCase(sprepaa.cfr_renamed_9(")g)c?b\u000eI\rH0v"));
            this.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
            this.cfr_renamed_119 = new sprdrb(new sprikd(this.cfr_renamed_137, bl));
            return;
        }
        if (sprntb5.cfr_renamed_0.equalsIgnoreCase(sprmnja.cfr_renamed_9(")(\u000366\u001f6\u001b \u001a"))) {
            this.cfr_renamed_79 = 0;
            this.cfr_renamed_119 = new sprdrb(new sprodd(this.cfr_renamed_137));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprepaa.cfr_renamed_9("s0c"))) {
            sprntb sprntb6 = this;
            sprntb6.cfr_renamed_79 = sprntb6.cfr_renamed_137.cfr_renamed_1195();
            if (sprntb6.cfr_renamed_79 < 16) {
                throw new IllegalArgumentException(sprmnja.cfr_renamed_9("19\u00146\u000f6\u0001bF\u000b/\u001bK\u0015\t<\u0003x\u00059\bx\u0004=\u00057\u000b=F9F,\u00117\u00121\u000b=K(\u0007<F1\u0000x\u00120\u0003x\u00044\t;\r+\u000f\"\u0003x\t>F,\u000e=F;\u000f(\u000e=\u0014x\u000f+F,\t7F+\u000b9\n4Hx3+\u0003x\u0007x\u00051\u00160\u0003*F/\u000f,\u000ex\u0007x\u00044\t;\rx\u00151\u001c=F7\u0000x\u0007,F4\u00039\u0015,FiT`F:\u000f,\u0015xN=H?Hx'\u001d5q"));
            }
            this.cfr_renamed_119 = new sprdrb(new sprxdd(new sprcmd(this.cfr_renamed_137)));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprepaa.cfr_renamed_9("c-r"))) {
            this.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
            this.cfr_renamed_119 = new sprdrb(new sprxdd(new sprcmd(this.cfr_renamed_137)));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprmnja.cfr_renamed_9("!\u0017 \u001a"))) {
            this.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
            this.cfr_renamed_119 = new sprdrb(new sprxdd(new sprncd(this.cfr_renamed_137)));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprepaa.cfr_renamed_9(">c?b"))) {
            this.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
            this.cfr_renamed_119 = new sprdrb(new sprxdd(new sprvkd(this.cfr_renamed_137)));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprmnja.cfr_renamed_9("\u001b2\u000b"))) {
            this.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
            this.cfr_renamed_119 = new sprdrb(new sprhkd(new sprgnd(this.cfr_renamed_137)));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprepaa.cfr_renamed_9("c:m"))) {
            this.cfr_renamed_79 = 13;
            this.cfr_renamed_119 = new sprnob(new sprljd(this.cfr_renamed_137));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprmnja.cfr_renamed_9("\u0017%\u001a"))) {
            if (this.cfr_renamed_105 != null) {
                sprntb sprntb7 = this;
                sprntb7.cfr_renamed_79 = 15;
                sprntb sprntb8 = this;
                sprntb7.cfr_renamed_119 = new sprnob(new spryed(sprntb8.cfr_renamed_137, sprntb8.cfr_renamed_105.cfr_renamed_1397()));
                return;
            }
            throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprepaa.cfr_renamed_9("C\u0018N^TYS\fP\tO\u000bTYM\u0016D\u001c\u0000")).append(arg0).toString());
        }
        if (this.cfr_renamed_0.startsWith(sprmnja.cfr_renamed_9("\u001d'\u0000"))) {
            this.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
            this.cfr_renamed_119 = new sprnob(new sprsld(this.cfr_renamed_137));
            return;
        }
        if (this.cfr_renamed_0.startsWith(sprepaa.cfr_renamed_9("g:m"))) {
            this.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
            this.cfr_renamed_119 = new sprnob(new sprhld(this.cfr_renamed_137));
            return;
        }
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprmnja.cfr_renamed_9(";\u00076A,F+\u0013(\u00167\u0014,F5\t<\u0003x")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprntb(sprxdd sprxdd2, int n) {
        void arg1;
        void arg0;
        Class[] classArray = new Class[6];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = IvParameterSpec.class;
        classArray[3] = PBEParameterSpec.class;
        classArray[4] = sprdob.class;
        classArray[5] = cfr_renamed_1;
        this.cfr_renamed_114 = classArray;
        sprntb sprntb2 = this;
        sprntb sprntb3 = this;
        sprntb sprntb4 = this;
        sprntb4.cfr_renamed_79 = 0;
        sprntb4.cfr_renamed_3 = null;
        sprntb3.cfr_renamed_2 = null;
        sprntb3.cfr_renamed_0 = null;
        sprntb2.cfr_renamed_137 = arg0.cfr_renamed_2349();
        sprntb sprntb5 = this;
        sprntb2.cfr_renamed_119 = new sprdrb((sprxdd)arg0);
        sprntb2.cfr_renamed_79 = arg1 / 8;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprntb sprntb2;
        if (this.cfr_renamed_145 == null) {
            if (this.cfr_renamed_3 != null) {
                try {
                    sprntb sprntb3 = this;
                    sprntb3.cfr_renamed_145 = AlgorithmParameters.getInstance(sprntb3.cfr_renamed_2, "BC");
                    sprntb3.cfr_renamed_145.init(this.cfr_renamed_3);
                    sprntb2 = this;
                    return sprntb2.cfr_renamed_145;
                }
                catch (Exception exception) {
                    return null;
                }
            }
            if (this.cfr_renamed_96 != null) {
                String string = this.cfr_renamed_119.cfr_renamed_2349().cfr_renamed_1315();
                if (string.indexOf(47) >= 0) {
                    String string2 = string;
                    string = string2.substring(0, string2.indexOf(47));
                }
                try {
                    this.cfr_renamed_145 = AlgorithmParameters.getInstance(string, "BC");
                    this.cfr_renamed_145.init(this.cfr_renamed_96.cfr_renamed_1205());
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.toString());
                }
            } else if (this.cfr_renamed_4 != null) {
                try {
                    this.cfr_renamed_145 = AlgorithmParameters.getInstance(sprepaa.cfr_renamed_9("g:m"), "BC");
                    this.cfr_renamed_145.init(new spryve(this.cfr_renamed_4.cfr_renamed_596(), this.cfr_renamed_4.cfr_renamed_2404()).cfr_renamed_91());
                    sprntb2 = this;
                    return sprntb2.cfr_renamed_145;
                }
                catch (Exception exception) {
                    throw new RuntimeException(exception.toString());
                }
            }
        }
        sprntb2 = this;
        return sprntb2.cfr_renamed_145;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        return arg0.getEncoded().length * 8;
    }

    @Override
    public void engineUpdateAAD(byte[] arg0, int arg1, int arg2) {
        this.cfr_renamed_119.cfr_renamed_2410(arg0, arg1, arg2);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineUpdateAAD(ByteBuffer byteBuffer) {
        void arg0;
        void v0 = arg0;
        int n = byteBuffer.arrayOffset() + v0.position();
        int n2 = v0.limit() - arg0.position();
        this.engineUpdateAAD(arg0.array(), n, n2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ Class cfr_renamed_2406(String arg0) {
        try {
            return sprntb.class.getClassLoader().loadClass(arg0);
        }
        catch (Exception exception) {
            return null;
        }
    }

    @Override
    public int engineGetBlockSize() {
        return this.cfr_renamed_137.cfr_renamed_1195();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws ShortBufferException {
        try {
            return this.cfr_renamed_119.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
        }
        catch (sprjkd sprjkd2) {
            throw new ShortBufferException(sprjkd2.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprntb(sprpj sprpj2) {
        void arg0;
        Class[] classArray = new Class[6];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = IvParameterSpec.class;
        classArray[3] = PBEParameterSpec.class;
        classArray[4] = sprdob.class;
        classArray[5] = cfr_renamed_1;
        this.cfr_renamed_114 = classArray;
        sprntb sprntb2 = this;
        sprntb sprntb3 = this;
        this.cfr_renamed_79 = 0;
        sprntb3.cfr_renamed_3 = null;
        sprntb3.cfr_renamed_2 = null;
        this.cfr_renamed_0 = null;
        sprntb2.cfr_renamed_137 = arg0.cfr_renamed_2349();
        sprntb2.cfr_renamed_79 = this.cfr_renamed_137.cfr_renamed_1195();
        sprntb sprntb4 = this;
        sprntb2.cfr_renamed_119 = new sprnob((sprpj)arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprntb(sprff sprff2, int n) {
        void arg1;
        void arg0;
        Class[] classArray = new Class[6];
        classArray[0] = RC2ParameterSpec.class;
        classArray[1] = RC5ParameterSpec.class;
        classArray[2] = IvParameterSpec.class;
        classArray[3] = PBEParameterSpec.class;
        classArray[4] = sprdob.class;
        classArray[5] = cfr_renamed_1;
        this.cfr_renamed_114 = classArray;
        sprntb sprntb2 = this;
        sprntb sprntb3 = this;
        sprntb sprntb4 = this;
        sprntb4.cfr_renamed_79 = 0;
        sprntb4.cfr_renamed_3 = null;
        sprntb3.cfr_renamed_2 = null;
        sprntb3.cfr_renamed_0 = null;
        sprntb2.cfr_renamed_137 = arg0;
        sprntb sprntb5 = this;
        sprntb2.cfr_renamed_119 = new sprdrb((sprff)arg0);
        sprntb2.cfr_renamed_79 = arg1 / 8;
    }
}

