/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgd;
import com.spire.presentation.packages.sprfb;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprhkd;
import com.spire.presentation.packages.sprild;
import com.spire.presentation.packages.sprjjb;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprkkd;
import com.spire.presentation.packages.sprknd;
import com.spire.presentation.packages.sprmpb;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprnld;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprtua;
import com.spire.presentation.packages.sprwid;
import com.spire.presentation.packages.sprxdd;
import com.spire.presentation.packages.spryffa;
import com.spire.presentation.packages.sprywa;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.KeyFactory;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidKeySpecException;
import java.security.spec.PKCS8EncodedKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEParameterSpec;
import javax.crypto.spec.RC2ParameterSpec;
import javax.crypto.spec.RC5ParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class sprwqb
implements sprfb {
    private AlgorithmParameters cfr_renamed_137;
    private sprxdd cfr_renamed_79;
    private int cfr_renamed_107;
    private int cfr_renamed_132;
    private sprnjd cfr_renamed_102;
    private Class[] cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;

    public byte[] cfr_renamed_2344(byte[] arg0, int arg1, int arg2) {
        int n = this.cfr_renamed_79.cfr_renamed_2345(arg2);
        if (n > 0) {
            byte[] byArray = new byte[n];
            this.cfr_renamed_79.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
            return byArray;
        }
        this.cfr_renamed_79.cfr_renamed_505(arg0, arg1, arg2, null, 0);
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_2346(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        try {
            this.cfr_renamed_2347(arg0, arg1, null, arg2);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new IllegalArgumentException(invalidAlgorithmParameterException.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwqb(sprff sprff2) {
        void arg0;
        Class[] classArray = new Class[4];
        classArray[0] = IvParameterSpec.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        this.cfr_renamed_93 = classArray;
        sprwqb sprwqb2 = this;
        sprwqb sprwqb3 = this;
        sprwqb3.cfr_renamed_107 = 2;
        sprwqb3.cfr_renamed_132 = 1;
        sprwqb2.cfr_renamed_152 = 0;
        sprwqb2.cfr_renamed_137 = null;
        sprwqb sprwqb4 = this;
        sprwqb2.cfr_renamed_79 = new sprknd((sprff)arg0);
    }

    public void cfr_renamed_2348(String arg0) throws NoSuchPaddingException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprtua.cfr_renamed_9("+z5t!q,{\""))) {
            sprwqb sprwqb2 = this;
            this.cfr_renamed_79 = new sprxdd(this.cfr_renamed_79.cfr_renamed_2349());
            return;
        }
        if (string.equals(spryffa.cfr_renamed_9("F6U.#-W9R4X:")) || string.equals(sprtua.cfr_renamed_9("e.v6\u00025t!q,{\"")) || string.equals(spryffa.cfr_renamed_9("4E2'M'O -W9R4X:"))) {
            this.cfr_renamed_79 = new sprknd(this.cfr_renamed_79.cfr_renamed_2349());
            return;
        }
        if (string.equals(sprtua.cfr_renamed_9("2|1}&a6"))) {
            this.cfr_renamed_79 = new sprhkd(this.cfr_renamed_79.cfr_renamed_2349());
            return;
        }
        throw new NoSuchPaddingException(new StringBuilder().insert(0, spryffa.cfr_renamed_9("F\u001cr\u0019\u007f\u0013q]")).append(arg0).append(sprtua.cfr_renamed_9("E@\u000b^\u000bZ\u0012[K")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_2350(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        int n = 0;
        byte[] byArray = new byte[this.cfr_renamed_2351(arg2)];
        if (arg2 != 0) {
            n = this.cfr_renamed_79.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
        }
        try {
            n += this.cfr_renamed_79.cfr_renamed_1219(byArray, n);
        }
        catch (sprjkd sprjkd2) {
            throw new IllegalBlockSizeException(sprjkd2.getMessage());
        }
        catch (sprpjd sprpjd2) {
            throw new BadPaddingException(sprpjd2.getMessage());
        }
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, 0, byArray2, 0, n);
        return byArray2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_2352(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        AlgorithmParameterSpec algorithmParameterSpec = null;
        if (arg2 != null) {
            AlgorithmParameterSpec algorithmParameterSpec2;
            block5: {
                int n;
                int n2 = n = 0;
                while (n2 != this.cfr_renamed_93.length) {
                    try {
                        algorithmParameterSpec2 = algorithmParameterSpec = (AlgorithmParameterSpec)arg2.getParameterSpec(this.cfr_renamed_93[n]);
                        break block5;
                    }
                    catch (Exception exception) {
                        n2 = ++n;
                    }
                }
                algorithmParameterSpec2 = algorithmParameterSpec;
            }
            if (algorithmParameterSpec2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, spryffa.cfr_renamed_9("\u001ew\u00131\t6\u0015w\u0013r\u0011s]f\u001cd\u001c{\u0018b\u0018d]")).append(arg2.toString()).toString());
            }
        }
        this.cfr_renamed_137 = arg2;
        this.cfr_renamed_2347(arg0, arg1, algorithmParameterSpec, arg3);
    }

    public void cfr_renamed_2353(String arg0) {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprtua.cfr_renamed_9(" v'"))) {
            this.cfr_renamed_152 = 0;
            sprwqb sprwqb2 = this;
            this.cfr_renamed_79 = new sprknd(this.cfr_renamed_79.cfr_renamed_2349());
            return;
        }
        if (string.equals(spryffa.cfr_renamed_9(">T>"))) {
            this.cfr_renamed_152 = this.cfr_renamed_79.cfr_renamed_2349().cfr_renamed_1195();
            this.cfr_renamed_79 = new sprknd(new sprgnd(this.cfr_renamed_79.cfr_renamed_2349()));
            return;
        }
        if (string.startsWith(sprtua.cfr_renamed_9("*s'"))) {
            this.cfr_renamed_152 = this.cfr_renamed_79.cfr_renamed_2349().cfr_renamed_1195();
            if (string.length() != 3) {
                int n = Integer.parseInt(string.substring(3));
                this.cfr_renamed_79 = new sprknd(new sprwid(this.cfr_renamed_79.cfr_renamed_2349(), n));
                return;
            }
            this.cfr_renamed_79 = new sprknd(new sprwid(this.cfr_renamed_79.cfr_renamed_2349(), 8 * this.cfr_renamed_79.cfr_renamed_1195()));
            return;
        }
        if (string.startsWith(spryffa.cfr_renamed_9(">P?"))) {
            this.cfr_renamed_152 = this.cfr_renamed_79.cfr_renamed_2349().cfr_renamed_1195();
            if (string.length() != 3) {
                int n = Integer.parseInt(string.substring(3));
                this.cfr_renamed_79 = new sprknd(new sprcgd(this.cfr_renamed_79.cfr_renamed_2349(), n));
                return;
            }
            this.cfr_renamed_79 = new sprknd(new sprcgd(this.cfr_renamed_79.cfr_renamed_2349(), 8 * this.cfr_renamed_79.cfr_renamed_1195()));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("\u0006T\u000b\u0012\u0011\u0015\u0016@\u0015E\nG\u0011\u0015\bZ\u0001PE")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public Key cfr_renamed_2354(byte[] arg0, String arg1, int arg2) throws InvalidKeyException {
        byte[] byArray = null;
        try {
            byArray = this.cfr_renamed_2350(arg0, 0, arg0.length);
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
        try {
            KeyFactory keyFactory = KeyFactory.getInstance(arg1, "BC");
            if (arg2 == 1) {
                return keyFactory.generatePublic(new X509EncodedKeySpec(byArray));
            }
            if (arg2 != 2) throw new InvalidKeyException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("0[\u000e[\nB\u000b\u0015\u000eP\u001c\u0015\u0011L\u0015PE")).append(arg2).toString());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(byArray));
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, spryffa.cfr_renamed_9("(x\u0016x\u0012a\u00136\u0016s\u00046\to\rs]")).append(noSuchProviderException.getMessage()).toString());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprtua.cfr_renamed_9("0[\u000e[\nB\u000b\u0015\u000eP\u001c\u0015\u0011L\u0015PE")).append(noSuchAlgorithmException.getMessage()).toString());
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, spryffa.cfr_renamed_9("(x\u0016x\u0012a\u00136\u0016s\u00046\to\rs]")).append(invalidKeySpecException.getMessage()).toString());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprwqb(sprff sprff2, int n, int n2, int n3, int n4) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        Class[] classArray = new Class[4];
        classArray[0] = IvParameterSpec.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        this.cfr_renamed_93 = classArray;
        sprwqb sprwqb2 = this;
        sprwqb sprwqb3 = this;
        sprwqb sprwqb4 = this;
        sprwqb sprwqb5 = this;
        sprwqb5.cfr_renamed_107 = 2;
        sprwqb5.cfr_renamed_132 = 1;
        sprwqb4.cfr_renamed_152 = 0;
        sprwqb4.cfr_renamed_137 = null;
        sprwqb sprwqb6 = this;
        sprwqb4.cfr_renamed_79 = new sprknd((sprff)arg0);
        sprwqb3.cfr_renamed_107 = arg1;
        sprwqb3.cfr_renamed_132 = arg2;
        sprwqb2.cfr_renamed_112 = arg3;
        sprwqb2.cfr_renamed_86 = arg4;
    }

    public int cfr_renamed_2355() {
        return this.cfr_renamed_79.cfr_renamed_1195();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cfr_renamed_2347(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block22: {
            block21: {
                if (!(arg1 instanceof sprmpb)) break block21;
                v0 = this;
                v1 = this;
                var5_5 /* !! */  = sprjjb.cfr_renamed_2356((sprmpb)arg1, arg2, v0.cfr_renamed_107, v0.cfr_renamed_132, this.cfr_renamed_79.cfr_renamed_2349().cfr_renamed_1315(), v1.cfr_renamed_112, v1.cfr_renamed_86);
                if (this.cfr_renamed_86 == 0) ** GOTO lbl40
                this.cfr_renamed_102 = (sprnjd)var5_5 /* !! */ ;
                v2 = this;
                break block22;
            }
            if (arg2 == null) {
                var5_5 /* !! */  = new sprnld(arg1.getEncoded());
                v2 = this;
            } else if (arg2 instanceof IvParameterSpec) {
                if (this.cfr_renamed_152 != 0) {
                    var5_5 /* !! */  = new sprnjd(new sprnld(arg1.getEncoded()), ((IvParameterSpec)arg2).getIV());
                    this.cfr_renamed_102 = (sprnjd)var5_5 /* !! */ ;
                    v2 = this;
                } else {
                    var5_5 /* !! */  = new sprnld(arg1.getEncoded());
                    v2 = this;
                }
            } else {
                if (arg2 instanceof RC2ParameterSpec) {
                    var6_6 = (RC2ParameterSpec)arg2;
                    var5_5 /* !! */  = new sprkkd(arg1.getEncoded(), ((RC2ParameterSpec)arg2).getEffectiveKeyBits());
                    if (var6_6.getIV() != null && this.cfr_renamed_152 != 0) {
                        var5_5 /* !! */  = new sprnjd(var5_5 /* !! */ , var6_6.getIV());
                        this.cfr_renamed_102 = (sprnjd)var5_5 /* !! */ ;
                    }
                } else if (arg2 instanceof RC5ParameterSpec) {
                    var6_6 = (RC5ParameterSpec)arg2;
                    var5_5 /* !! */  = new sprild(arg1.getEncoded(), ((RC5ParameterSpec)arg2).getRounds());
                    if (var6_6.getWordSize() != 32) {
                        throw new IllegalArgumentException(spryffa.cfr_renamed_9("\u001ew\u00136\u0012x\u0011o]w\u001eu\u0018f\t6/UH6\ny\u000fr]e\u0014l\u00186N$]>\u001cb]b\u0015s]{\u0012{\u0018x\t8S8T"));
                    }
                    if (var6_6.getIV() != null && this.cfr_renamed_152 != 0) {
                        var5_5 /* !! */  = new sprnjd(var5_5 /* !! */ , var6_6.getIV());
                        this.cfr_renamed_102 = (sprnjd)var5_5 /* !! */ ;
                    }
                } else {
                    throw new InvalidAlgorithmParameterException(sprtua.cfr_renamed_9("\u0010[\u000e[\nB\u000b\u0015\u0015T\u0017T\bP\u0011P\u0017\u0015\u0011L\u0015PK"));
                }
lbl40:
                // 3 sources

                v2 = this;
            }
        }
        if (v2.cfr_renamed_152 == 0 || var5_5 /* !! */  instanceof sprnjd) ** GOTO lbl55
        if (arg3 == null) {
            arg3 = new SecureRandom();
        }
        if (arg0 == 1 || arg0 == 3) {
            var6_6 = new byte[this.cfr_renamed_152];
            arg3.nextBytes((byte[])var6_6);
            var5_5 /* !! */  = new sprnjd(var5_5 /* !! */ , (byte[])var6_6);
            this.cfr_renamed_102 = var5_5 /* !! */ ;
            v3 = arg0;
        } else {
            throw new InvalidAlgorithmParameterException(spryffa.cfr_renamed_9("\u0013y]_+6\u000es\t6\n~\u0018x]y\u0013s]s\u0005f\u0018u\ts\u0019"));
lbl55:
            // 1 sources

            v3 = arg0;
        }
        switch (v3) {
            case 1: 
            case 3: {
                while (false) {
                }
                this.cfr_renamed_79.cfr_renamed_1217(true, var5_5 /* !! */ );
                return;
            }
            case 2: 
            case 4: {
                this.cfr_renamed_79.cfr_renamed_1217(false, var5_5 /* !! */ );
                return;
            }
        }
        System.out.println(sprtua.cfr_renamed_9("\u0000P\u0000^D"));
    }

    public int cfr_renamed_2357(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        return this.cfr_renamed_79.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int cfr_renamed_2358(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException {
        int n = 0;
        if (arg2 != 0) {
            n = this.cfr_renamed_79.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
        }
        try {
            return n + this.cfr_renamed_79.cfr_renamed_1219(arg3, arg4 + n);
        }
        catch (sprjkd sprjkd2) {
            throw new IllegalBlockSizeException(sprjkd2.getMessage());
        }
        catch (sprpjd sprpjd2) {
            throw new BadPaddingException(sprpjd2.getMessage());
        }
    }

    public int cfr_renamed_2351(int arg0) {
        return this.cfr_renamed_79.cfr_renamed_1202(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_2359(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] byArray = arg0.getEncoded();
        if (byArray == null) {
            throw new InvalidKeyException(spryffa.cfr_renamed_9(">w\u0013x\u0012b]a\u000fw\r6\u0016s\u0004:]x\bz\u00116\u0018x\u001ey\u0019\u007f\u0013qS"));
        }
        try {
            return this.cfr_renamed_2350(byArray, 0, byArray.length);
        }
        catch (BadPaddingException badPaddingException) {
            throw new IllegalBlockSizeException(badPaddingException.getMessage());
        }
    }

    public int cfr_renamed_2360(Key arg0) {
        return arg0.getEncoded().length;
    }

    public byte[] cfr_renamed_2361() {
        if (this.cfr_renamed_102 != null) {
            return this.cfr_renamed_102.cfr_renamed_1205();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_2362() {
        sprwqb sprwqb2;
        if (this.cfr_renamed_137 == null && this.cfr_renamed_102 != null) {
            String string = this.cfr_renamed_79.cfr_renamed_2349().cfr_renamed_1315();
            if (string.indexOf(47) >= 0) {
                String string2 = string;
                string = string2.substring(0, string2.indexOf(47));
            }
            try {
                this.cfr_renamed_137 = AlgorithmParameters.getInstance(string, "BC");
                this.cfr_renamed_137.init(this.cfr_renamed_102.cfr_renamed_1205());
                sprwqb2 = this;
                return sprwqb2.cfr_renamed_137;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprwqb2 = this;
        return sprwqb2.cfr_renamed_137;
    }
}

