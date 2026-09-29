/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbwk;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprdfi;
import com.spire.presentation.packages.spretk;
import com.spire.presentation.packages.sprgbi;
import com.spire.presentation.packages.sprgrk;
import com.spire.presentation.packages.sprhok;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprirk;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmik;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sprnw;
import com.spire.presentation.packages.sproyk;
import com.spire.presentation.packages.sprsez;
import com.spire.presentation.packages.sprtpk;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprysb;
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

public class sprhgi
implements sprnw {
    private int cfr_renamed_79;
    private sprkpk cfr_renamed_107;
    private int cfr_renamed_132;
    private Class[] cfr_renamed_102;
    private AlgorithmParameters cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private int cfr_renamed_112;
    private sprirk cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprhgi(sprmr sprmr2, int n, int n2, int n3, int n4) {
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
        this.cfr_renamed_102 = classArray;
        sprhgi sprhgi2 = this;
        sprhgi sprhgi3 = this;
        sprhgi sprhgi4 = this;
        sprhgi sprhgi5 = this;
        sprhgi5.cfr_renamed_79 = 2;
        sprhgi5.cfr_renamed_86 = 1;
        sprhgi4.cfr_renamed_132 = 0;
        sprhgi4.cfr_renamed_93 = null;
        sprhgi sprhgi6 = this;
        sprhgi4.cfr_renamed_4 = new sprgrk((sprmr)arg0);
        sprhgi3.cfr_renamed_79 = arg1;
        sprhgi3.cfr_renamed_86 = arg2;
        sprhgi2.cfr_renamed_112 = arg3;
        sprhgi2.cfr_renamed_152 = arg4;
    }

    public int cfr_renamed_2357(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        return this.cfr_renamed_4.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
    }

    public byte[] cfr_renamed_2344(byte[] arg0, int arg1, int arg2) {
        int n = this.cfr_renamed_4.cfr_renamed_2345(arg2);
        if (n > 0) {
            byte[] byArray = new byte[n];
            this.cfr_renamed_4.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
            return byArray;
        }
        this.cfr_renamed_4.cfr_renamed_505(arg0, arg1, arg2, null, 0);
        return null;
    }

    public void cfr_renamed_2353(String arg0) {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprysb.cfr_renamed_9("\u00076\u0000"))) {
            this.cfr_renamed_132 = 0;
            sprhgi sprhgi2 = this;
            this.cfr_renamed_4 = new sprgrk(this.cfr_renamed_4.cfr_renamed_2349());
            return;
        }
        if (string.equals(sprsez.cfr_renamed_9("%.%"))) {
            this.cfr_renamed_132 = this.cfr_renamed_4.cfr_renamed_2349().cfr_renamed_1195();
            this.cfr_renamed_4 = new sprgrk(new sprhqk(this.cfr_renamed_4.cfr_renamed_2349()));
            return;
        }
        if (string.startsWith(sprysb.cfr_renamed_9("\r3\u0000"))) {
            this.cfr_renamed_132 = this.cfr_renamed_4.cfr_renamed_2349().cfr_renamed_1195();
            if (string.length() != 3) {
                int n = Integer.parseInt(string.substring(3));
                this.cfr_renamed_4 = new sprgrk(new sprbwk(this.cfr_renamed_4.cfr_renamed_2349(), n));
                return;
            }
            this.cfr_renamed_4 = new sprgrk(new sprbwk(this.cfr_renamed_4.cfr_renamed_2349(), 8 * this.cfr_renamed_4.cfr_renamed_1195()));
            return;
        }
        if (string.startsWith(sprsez.cfr_renamed_9("%*$"))) {
            this.cfr_renamed_132 = this.cfr_renamed_4.cfr_renamed_2349().cfr_renamed_1195();
            if (string.length() != 3) {
                int n = Integer.parseInt(string.substring(3));
                this.cfr_renamed_4 = new sprgrk(new spretk(this.cfr_renamed_4.cfr_renamed_2349(), n));
                return;
            }
            this.cfr_renamed_4 = new sprgrk(new spretk(this.cfr_renamed_4.cfr_renamed_2349(), 8 * this.cfr_renamed_4.cfr_renamed_1195()));
            return;
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprysb.cfr_renamed_9("!\u0014,R6U1\u00002\u0005-\u00076U/\u001a&\u0010b")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public AlgorithmParameters cfr_renamed_2362() {
        sprhgi sprhgi2;
        if (this.cfr_renamed_93 == null && this.cfr_renamed_107 != null) {
            String string = this.cfr_renamed_4.cfr_renamed_2349().cfr_renamed_1315();
            if (string.indexOf(47) >= 0) {
                String string2 = string;
                string = string2.substring(0, string2.indexOf(47));
            }
            try {
                this.cfr_renamed_93 = AlgorithmParameters.getInstance(string, "BC");
                this.cfr_renamed_93.init(this.cfr_renamed_107.cfr_renamed_1205());
                sprhgi2 = this;
                return sprhgi2.cfr_renamed_93;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprhgi2 = this;
        return sprhgi2.cfr_renamed_93;
    }

    public int cfr_renamed_2360(Key arg0) {
        return arg0.getEncoded().length;
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
            n = this.cfr_renamed_4.cfr_renamed_505(arg0, arg1, arg2, byArray, 0);
        }
        try {
            n += this.cfr_renamed_4.cfr_renamed_1219(byArray, n);
        }
        catch (sprddl sprddl2) {
            throw new IllegalBlockSizeException(sprddl2.getMessage());
        }
        catch (sprull sprull2) {
            throw new BadPaddingException(sprull2.getMessage());
        }
        byte[] byArray2 = new byte[n];
        System.arraycopy(byArray, 0, byArray2, 0, n);
        return byArray2;
    }

    public int cfr_renamed_2351(int arg0) {
        return this.cfr_renamed_4.cfr_renamed_1202(arg0);
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
            if (arg2 != 2) throw new InvalidKeyException(new StringBuilder().insert(0, sprysb.cfr_renamed_9("\u0017\u001b)\u001b-\u0002,U)\u0010;U6\f2\u0010b")).append(arg2).toString());
            return keyFactory.generatePrivate(new PKCS8EncodedKeySpec(byArray));
        }
        catch (NoSuchProviderException noSuchProviderException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprsez.cfr_renamed_9("3\u0002\r\u0002\t\u001b\bL\r\t\u001fL\u0012\u0015\u0016\tF")).append(noSuchProviderException.getMessage()).toString());
        }
        catch (NoSuchAlgorithmException noSuchAlgorithmException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprysb.cfr_renamed_9("\u0017\u001b)\u001b-\u0002,U)\u0010;U6\f2\u0010b")).append(noSuchAlgorithmException.getMessage()).toString());
        }
        catch (InvalidKeySpecException invalidKeySpecException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprsez.cfr_renamed_9("3\u0002\r\u0002\t\u001b\bL\r\t\u001fL\u0012\u0015\u0016\tF")).append(invalidKeySpecException.getMessage()).toString());
        }
    }

    public byte[] cfr_renamed_2361() {
        if (this.cfr_renamed_107 != null) {
            return this.cfr_renamed_107.cfr_renamed_1205();
        }
        return null;
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
                while (n2 != this.cfr_renamed_102.length) {
                    try {
                        algorithmParameterSpec2 = algorithmParameterSpec = (AlgorithmParameterSpec)arg2.getParameterSpec(this.cfr_renamed_102[n]);
                        break block5;
                    }
                    catch (Exception exception) {
                        n2 = ++n;
                    }
                }
                algorithmParameterSpec2 = algorithmParameterSpec;
            }
            if (algorithmParameterSpec2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprsez.cfr_renamed_9("\u0005\r\bK\u0012L\u000e\r\b\b\n\tF\u001c\u0007\u001e\u0007\u0001\u0003\u0018\u0003\u001eF")).append(arg2.toString()).toString());
            }
        }
        this.cfr_renamed_93 = arg2;
        this.cfr_renamed_2347(arg0, arg1, algorithmParameterSpec, arg3);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public int cfr_renamed_2358(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException {
        int n = 0;
        if (arg2 != 0) {
            n = this.cfr_renamed_4.cfr_renamed_505(arg0, arg1, arg2, arg3, arg4);
        }
        try {
            return n + this.cfr_renamed_4.cfr_renamed_1219(arg3, arg4 + n);
        }
        catch (sprddl sprddl2) {
            throw new IllegalBlockSizeException(sprddl2.getMessage());
        }
        catch (sprull sprull2) {
            throw new BadPaddingException(sprull2.getMessage());
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public void cfr_renamed_2347(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block22: {
            block21: {
                if (!(arg1 instanceof sprgbi)) break block21;
                v0 = this;
                v1 = this;
                var5_5 /* !! */  = sprdfi.cfr_renamed_9163((sprgbi)arg1, arg2, v0.cfr_renamed_79, v0.cfr_renamed_86, this.cfr_renamed_4.cfr_renamed_2349().cfr_renamed_1315(), v1.cfr_renamed_112, v1.cfr_renamed_152);
                if (this.cfr_renamed_152 == 0) ** GOTO lbl40
                this.cfr_renamed_107 = (sprkpk)var5_5 /* !! */ ;
                v2 = this;
                break block22;
            }
            if (arg2 == null) {
                var5_5 /* !! */  = new sprtpk(arg1.getEncoded());
                v2 = this;
            } else if (arg2 instanceof IvParameterSpec) {
                if (this.cfr_renamed_132 != 0) {
                    var5_5 /* !! */  = new sprkpk(new sprtpk(arg1.getEncoded()), ((IvParameterSpec)arg2).getIV());
                    this.cfr_renamed_107 = (sprkpk)var5_5 /* !! */ ;
                    v2 = this;
                } else {
                    var5_5 /* !! */  = new sprtpk(arg1.getEncoded());
                    v2 = this;
                }
            } else {
                if (arg2 instanceof RC2ParameterSpec) {
                    var6_6 = (RC2ParameterSpec)arg2;
                    var5_5 /* !! */  = new sprhok(arg1.getEncoded(), ((RC2ParameterSpec)arg2).getEffectiveKeyBits());
                    if (var6_6.getIV() != null && this.cfr_renamed_132 != 0) {
                        var5_5 /* !! */  = new sprkpk(var5_5 /* !! */ , var6_6.getIV());
                        this.cfr_renamed_107 = (sprkpk)var5_5 /* !! */ ;
                    }
                } else if (arg2 instanceof RC5ParameterSpec) {
                    var6_6 = (RC5ParameterSpec)arg2;
                    var5_5 /* !! */  = new sprmik(arg1.getEncoded(), ((RC5ParameterSpec)arg2).getRounds());
                    if (var6_6.getWordSize() != 32) {
                        throw new IllegalArgumentException(sprysb.cfr_renamed_9("!\u0014,U-\u001b.\fb\u0014!\u0016'\u00056U\u00106wU5\u001a0\u0011b\u0006+\u000f'UqGb]#\u0001b\u0001*\u0010b\u0018-\u0018'\u001b6[l[k"));
                    }
                    if (var6_6.getIV() != null && this.cfr_renamed_132 != 0) {
                        var5_5 /* !! */  = new sprkpk(var5_5 /* !! */ , var6_6.getIV());
                        this.cfr_renamed_107 = (sprkpk)var5_5 /* !! */ ;
                    }
                } else {
                    throw new InvalidAlgorithmParameterException(sprsez.cfr_renamed_9("\u0013\u0002\r\u0002\t\u001b\bL\u0016\r\u0014\r\u000b\t\u0012\t\u0014L\u0012\u0015\u0016\tH"));
                }
lbl40:
                // 3 sources

                v2 = this;
            }
        }
        if (v2.cfr_renamed_132 == 0 || var5_5 /* !! */  instanceof sprkpk) ** GOTO lbl55
        if (arg3 == null) {
            arg3 = sprybl.cfr_renamed_2794();
        }
        if (arg0 == 1 || arg0 == 3) {
            var6_6 = new byte[this.cfr_renamed_132];
            arg3.nextBytes((byte[])var6_6);
            var5_5 /* !! */  = new sprkpk(var5_5 /* !! */ , (byte[])var6_6);
            this.cfr_renamed_107 = var5_5 /* !! */ ;
            v3 = arg0;
        } else {
            throw new InvalidAlgorithmParameterException(sprysb.cfr_renamed_9(",\u001ab<\u0014U1\u00106U5\u001d'\u001bb\u001a,\u0010b\u0010:\u0005'\u00166\u0010&"));
lbl55:
            // 1 sources

            v3 = arg0;
        }
        switch (v3) {
            case 1: 
            case 3: {
                while (false) {
                }
                this.cfr_renamed_4.cfr_renamed_5535(true, var5_5 /* !! */ );
                return;
            }
            case 2: 
            case 4: {
                this.cfr_renamed_4.cfr_renamed_5535(false, var5_5 /* !! */ );
                return;
            }
        }
        throw new IllegalArgumentException(new StringBuilder().insert(0, sprsez.cfr_renamed_9("\u0019\b\u0007\b\u0003\u0011\u0002F\u0003\u0016\u0001\t\b\u0003VF")).append(arg0).toString());
    }

    /*
     * WARNING - void declaration
     */
    public sprhgi(sprmr sprmr2) {
        void arg0;
        Class[] classArray = new Class[4];
        classArray[0] = IvParameterSpec.class;
        classArray[1] = PBEParameterSpec.class;
        classArray[2] = RC2ParameterSpec.class;
        classArray[3] = RC5ParameterSpec.class;
        this.cfr_renamed_102 = classArray;
        sprhgi sprhgi2 = this;
        sprhgi sprhgi3 = this;
        sprhgi3.cfr_renamed_79 = 2;
        sprhgi3.cfr_renamed_86 = 1;
        sprhgi2.cfr_renamed_132 = 0;
        sprhgi2.cfr_renamed_93 = null;
        sprhgi sprhgi4 = this;
        sprhgi2.cfr_renamed_4 = new sprgrk((sprmr)arg0);
    }

    public void cfr_renamed_2348(String arg0) throws NoSuchPaddingException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprysb.cfr_renamed_9("\f:\u00124\u00061\u000b;\u0005"))) {
            sprhgi sprhgi2 = this;
            this.cfr_renamed_4 = new sprirk(this.cfr_renamed_4.cfr_renamed_2349());
            return;
        }
        if (string.equals(sprsez.cfr_renamed_9("<-/5Y6-\"(/\"!")) || string.equals(sprysb.cfr_renamed_9("%\t6\u0011B\u00124\u00061\u000b;\u0005")) || string.equals(sprsez.cfr_renamed_9("/?)]V]TZ6-\"(/\"!"))) {
            this.cfr_renamed_4 = new sprgrk(this.cfr_renamed_4.cfr_renamed_2349());
            return;
        }
        if (string.equals(sprysb.cfr_renamed_9("\u0015<\u0016=\u0001!\u0011"))) {
            this.cfr_renamed_4 = new sproyk(this.cfr_renamed_4.cfr_renamed_2349());
            return;
        }
        throw new NoSuchPaddingException(new StringBuilder().insert(0, sprsez.cfr_renamed_9("<\u0007\b\u0002\u0005\b\u000bF")).append(arg0).append(sprysb.cfr_renamed_9("b\u0000,\u001e,\u001a5\u001bl")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_2359(Key arg0) throws IllegalBlockSizeException, InvalidKeyException {
        byte[] byArray = arg0.getEncoded();
        if (byArray == null) {
            throw new InvalidKeyException(sprsez.cfr_renamed_9("%\r\b\u0002\t\u0018F\u001b\u0014\r\u0016L\r\t\u001f@F\u0002\u0013\u0000\nL\u0003\u0002\u0005\u0003\u0002\u0005\b\u000bH"));
        }
        try {
            return this.cfr_renamed_2350(byArray, 0, byArray.length);
        }
        catch (BadPaddingException badPaddingException) {
            throw new IllegalBlockSizeException(badPaddingException.getMessage());
        }
    }

    public int cfr_renamed_2355() {
        return this.cfr_renamed_4.cfr_renamed_1195();
    }
}

