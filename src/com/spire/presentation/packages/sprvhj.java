/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazh;
import com.spire.presentation.packages.sprbbl;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprcqj;
import com.spire.presentation.packages.sprdki;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spreoj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgij;
import com.spire.presentation.packages.sprgkl;
import com.spire.presentation.packages.sprjcl;
import com.spire.presentation.packages.sprjel;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprqnl;
import com.spire.presentation.packages.sprrr;
import com.spire.presentation.packages.sprtji;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import com.spire.presentation.packages.sprxpo;
import com.spire.presentation.packages.sprybl;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.InvalidParameterSpecException;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class sprvhj
extends sprcqj {
    private AlgorithmParameterSpec cfr_renamed_91;
    private spreoj cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprwn cfr_renamed_9402;
    private AlgorithmParameters cfr_renamed_9403;
    private boolean cfr_renamed_3;
    private final sprrr cfr_renamed_4;

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprxpo.cfr_renamed_9("\u0019\u0004\u0007\n\u0013\u000f\u001e\u0005\u0010"))) {
            sprvhj sprvhj2 = this;
            sprvhj2.cfr_renamed_9402 = new sprbbl();
            return;
        }
        if (string.equals(sprqnl.cfr_renamed_9("i\u0003z\u001b\b\u0018x\f}\u0001w\u000f"))) {
            this.cfr_renamed_9402 = new sprgkl(new sprbbl());
            return;
        }
        if (string.equals(sprxpo.cfr_renamed_9("\u0002\u0004\u0004n|n}zz\u0007\n\u0013\u000f\u001e\u0005\u0010"))) {
            this.cfr_renamed_9402 = new sprjcl(new sprbbl());
            return;
        }
        if (string.equals(sprqnl.cfr_renamed_9("\u0007x\ri\u001fp\u001cq\u0005}}x\u0006}\u0005~\u000e\b\u0018x\f}\u0001w\u000f"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("MD5", sprxpo.cfr_renamed_9("\u0006\u0010\rf"), new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprqnl.cfr_renamed_9("\u0007x\ri\u0018x\f}\u0001w\u000f"))) {
            this.cfr_renamed_2485(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (string.equals(sprxpo.cfr_renamed_9("\u0004\u0016\u000e\u0007\u001c\u001e\u001f\u001f\u0018\u001f\nf\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010")) || string.equals(sprqnl.cfr_renamed_9("\u0007x\ri\u001fp\u001cq\u001bq\t\u0014yx\u0006}\u0005~\u000e\b\u0018x\f}\u0001w\u000f"))) {
            this.cfr_renamed_2485(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (string.equals(sprxpo.cfr_renamed_9("\u0004\u0016\u000e\u0007\u001c\u001e\u001f\u001f\u0018\u001f\neyc\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010")) || string.equals(sprqnl.cfr_renamed_9("\u0007x\ri\u001fp\u001cq\u001bq\t\u0014z\u000b|x\u0006}\u0005~\u000e\b\u0018x\f}\u0001w\u000f"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-224", sprxpo.cfr_renamed_9("\u0006\u0010\rf"), new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprqnl.cfr_renamed_9("v\t|\u0018n\u0001m\u0000j\u0000xz\f~x\u0006}\u0005~\u000e\b\u0018x\f}\u0001w\u000f")) || string.equals(sprxpo.cfr_renamed_9("\u0018\n\u0012\u001b\u0000\u0002\u0003\u0003\u0004\u0003\u0016fe~a\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-256", sprqnl.cfr_renamed_9("t\u000f\u007fy"), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprxpo.cfr_renamed_9("\u0004\u0016\u000e\u0007\u001c\u001e\u001f\u001f\u0018\u001f\ndsc\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010")) || string.equals(sprqnl.cfr_renamed_9("\u0007x\ri\u001fp\u001cq\u001bq\t\u0014{\u0001|x\u0006}\u0005~\u000e\b\u0018x\f}\u0001w\u000f"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-384", sprxpo.cfr_renamed_9("\u0006\u0010\rf"), MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprqnl.cfr_renamed_9("v\t|\u0018n\u0001m\u0000j\u0000x}\bzx\u0006}\u0005~\u000e\b\u0018x\f}\u0001w\u000f")) || string.equals(sprxpo.cfr_renamed_9("\u0018\n\u0012\u001b\u0000\u0002\u0003\u0003\u0004\u0003\u0016fbze\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-512", sprqnl.cfr_renamed_9("t\u000f\u007fy"), MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprxpo.cfr_renamed_9("\u0004\u0016\u000e\u0007\u001c\u001e\u001f\u001f\u0018\u001f\ndfeyc\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec(sprqnl.cfr_renamed_9("j\u0000x{\u0014z\u000b|"), sprxpo.cfr_renamed_9("\u0006\u0010\rf"), new MGF1ParameterSpec(sprqnl.cfr_renamed_9("j\u0000x{\u0014z\u000b|")), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprxpo.cfr_renamed_9("\u0004\u0016\u000e\u0007\u001c\u001e\u001f\u001f\u0018\u001f\ndfe~a\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA3-256", sprqnl.cfr_renamed_9("t\u000f\u007fy"), new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprxpo.cfr_renamed_9("\u0004\u0016\u000e\u0007\u001c\u001e\u001f\u001f\u0018\u001f\ndfdsc\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec(sprqnl.cfr_renamed_9("j\u0000x{\u0014{\u0001|"), sprxpo.cfr_renamed_9("\u0006\u0010\rf"), new MGF1ParameterSpec(sprqnl.cfr_renamed_9("j\u0000x{\u0014{\u0001|")), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprxpo.cfr_renamed_9("\u0004\u0016\u000e\u0007\u001c\u001e\u001f\u001f\u0018\u001f\ndfbze\n\u0019\u000f\u001a\f\u0011z\u0007\n\u0013\u000f\u001e\u0005\u0010"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec(sprqnl.cfr_renamed_9("j\u0000x{\u0014}\bz"), sprxpo.cfr_renamed_9("\u0006\u0010\rf"), new MGF1ParameterSpec(sprqnl.cfr_renamed_9("j\u0000x{\u0014}\bz")), PSource.PSpecified.DEFAULT));
            return;
        }
        throw new NoSuchPaddingException(new StringBuilder().insert(0, arg0).append(sprxpo.cfr_renamed_9("k\"%6=6\";*5'2k \"##w\u0019\u0004\ny")).toString());
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprqnl.cfr_renamed_9("w\u0007w\r")) || string.equals(sprxpo.cfr_renamed_9("\u0012\b\u0015"))) {
            return;
        }
        if (string.equals("1")) {
            sprvhj sprvhj2 = this;
            sprvhj2.cfr_renamed_3 = true;
            sprvhj2.cfr_renamed_1 = false;
            return;
        }
        if (string.equals(sprqnl.cfr_renamed_9("z"))) {
            sprvhj sprvhj3 = this;
            sprvhj3.cfr_renamed_3 = false;
            sprvhj3.cfr_renamed_1 = true;
            return;
        }
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprxpo.cfr_renamed_9("4*9l#k$>';89#k:$3.w")).append(arg0).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineGetBlockSize() {
        try {
            return this.cfr_renamed_9402.cfr_renamed_1344();
        }
        catch (NullPointerException nullPointerException) {
            throw new IllegalStateException(sprqnl.cfr_renamed_9("k\u001bxhz!I \\:\u0019&V<\u0019!W!M!X$P;\\,"));
        }
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        if (arg0 != null) {
            this.cfr_renamed_0.write(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_9402 instanceof sprbbl) {
            if (this.cfr_renamed_0.size() > this.cfr_renamed_9402.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprxpo.cfr_renamed_9("#$8k:>4#w/6?6k1$%k\u0005\u0018\u0016k5'8(<"));
            }
        } else if (this.cfr_renamed_0.size() > this.cfr_renamed_9402.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprqnl.cfr_renamed_9("<V'\u0019%L+Qh])M)\u0019.V:\u0019\u001aj\t\u0019*U'Z#"));
        }
        return this.cfr_renamed_3673();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_3673() throws BadPaddingException {
        try {
            sprvhj sprvhj2 = this;
            byte[] byArray = sprvhj2.cfr_renamed_9402.cfr_renamed_1337(sprvhj2.cfr_renamed_0.cfr_renamed_9247(), 0, this.cfr_renamed_0.size());
            return byArray;
        }
        catch (sprull sprull2) {
            throw new sprazh(sprxpo.cfr_renamed_9("\"%6);.w?8k3.49.;#k5'8(<"), sprull2);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new sprazh(sprqnl.cfr_renamed_9("=W)[$\\hM'\u0019,\\+K1I<\u0019*U'Z#"), arrayIndexOutOfBoundsException);
        }
        finally {
            this.cfr_renamed_0.cfr_renamed_9248();
        }
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
            throw new InvalidKeyException(new StringBuilder().insert(0, sprxpo.cfr_renamed_9("\u0012.2.<jw")).append(invalidAlgorithmParameterException.toString()).toString(), invalidAlgorithmParameterException);
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprvhj(OAEPParameterSpec oAEPParameterSpec) {
        sprvhj sprvhj2 = this;
        sprvhj sprvhj3 = this;
        sprvhj3.cfr_renamed_4 = new sprdki();
        sprvhj2.cfr_renamed_1 = false;
        sprvhj2.cfr_renamed_3 = false;
        sprvhj2.cfr_renamed_0 = new spreoj();
        try {
            void arg0;
            this.cfr_renamed_2485((OAEPParameterSpec)arg0);
            return;
        }
        catch (NoSuchPaddingException noSuchPaddingException) {
            throw new IllegalArgumentException(noSuchPaddingException.getMessage());
        }
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        block19: {
            block18: {
                block17: {
                    if (arg2 != null && !(arg2 instanceof OAEPParameterSpec)) break block17;
                    if (arg1 instanceof RSAPublicKey) {
                        if (this.cfr_renamed_3 && arg0 == 1) {
                            throw new InvalidKeyException(sprqnl.cfr_renamed_9("%V,\\h\bhK-H=P:\\;\u0019\u001aj\ti:P>X<\\\u0003\\1"));
                        }
                        var5_5 /* !! */  = sprgij.cfr_renamed_2476((RSAPublicKey)arg1);
                        v0 = arg2;
                    } else if (arg1 instanceof RSAPrivateKey) {
                        if (this.cfr_renamed_1 && arg0 == 1) {
                            throw new InvalidKeyException(sprxpo.cfr_renamed_9("&8/2kek%.&>>928w\u0019\u0004\n\u0007>5'>(\u001c.."));
                        }
                        var5_5 /* !! */  = sprgij.cfr_renamed_2477((RSAPrivateKey)arg1);
                        v0 = arg2;
                    } else {
                        throw new InvalidKeyException(sprqnl.cfr_renamed_9("L&R&V?WhR-@hM1I-\u00198X;J-]hM'\u0019\u001aj\t"));
                    }
                    if (v0 == null) break block18;
                    var6_6 = (OAEPParameterSpec)arg2;
                    this.cfr_renamed_91 = arg2;
                    if (!var6_6.getMGFAlgorithm().equalsIgnoreCase(sprxpo.cfr_renamed_9("\u0006\u0010\rf")) && !var6_6.getMGFAlgorithm().equals(sprdl.cfr_renamed_135.cfr_renamed_19())) {
                        throw new InvalidAlgorithmParameterException(sprqnl.cfr_renamed_9("L&R&V?WhT)J#\u0019/\\&\\:X<P'Wh_=W+M!V&\u0019;I-Z!_!\\,"));
                    }
                    if (!(var6_6.getMGFParameters() instanceof MGF1ParameterSpec)) {
                        throw new InvalidAlgorithmParameterException(sprxpo.cfr_renamed_9("\"%<$ %w\u0006\u0010\rw;696&2?29$"));
                    }
                    var7_7 = sprtji.cfr_renamed_2390(var6_6.getDigestAlgorithm());
                    if (var7_7 == null) {
                        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprqnl.cfr_renamed_9("W'\u0019%X<Z \u0019'Wh]!^-J<\u0019)U/V:P<Q%\u0003h")).append(var6_6.getDigestAlgorithm()).toString());
                    }
                    var8_8 = (MGF1ParameterSpec)var6_6.getMGFParameters();
                    var9_9 = sprtji.cfr_renamed_2390(var8_8.getDigestAlgorithm());
                    if (var9_9 == null) {
                        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprxpo.cfr_renamed_9("%8k:*#(?k8%w\u0006\u0010\rw/>,28#k6'0$%\"##:qw")).append(var8_8.getDigestAlgorithm()).toString());
                    }
                    this.cfr_renamed_9402 = new sprjel(new sprbbl(), var7_7, var9_9, ((PSource.PSpecified)var6_6.getPSource()).getValue());
                    v1 = this;
                    break block19;
                }
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprqnl.cfr_renamed_9("L&R&V?WhI)K)T-M-KhM1I-\u0003h")).append(arg2.getClass().getName()).toString());
            }
            v1 = this;
        }
        if (v1.cfr_renamed_9402 instanceof sprbbl) ** GOTO lbl45
        if (arg3 != null) {
            v2 = new sprbgk(var5_5 /* !! */ , arg3);
            var5_5 /* !! */  = v2;
            v3 = this;
        } else {
            v2 = new sprbgk(var5_5 /* !! */ , sprybl.cfr_renamed_2794());
            var5_5 /* !! */  = v2;
lbl45:
            // 2 sources

            v3 = this;
        }
        v3.cfr_renamed_0.reset();
        switch (arg0) {
            case 1: 
            case 3: {
                while (false) {
                }
                this.cfr_renamed_9402.cfr_renamed_5535(true, var5_5 /* !! */ );
                return;
            }
            case 2: 
            case 4: {
                this.cfr_renamed_9402.cfr_renamed_5535(false, var5_5 /* !! */ );
                return;
            }
        }
        throw new InvalidParameterException(new StringBuilder().insert(0, sprxpo.cfr_renamed_9("\"%<%8<9k8;:$3.w")).append(arg0).append(sprqnl.cfr_renamed_9("\u00198X;J-]hM'\u0019\u001aj\t")).toString());
    }

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int n;
        if (arg4 + this.engineGetOutputSize(arg2) > arg3.length) {
            throw new ShortBufferException(sprxpo.cfr_renamed_9("$\"?'>#k5>1-29w?8$w8?$%?w-89w\"9;\"?y"));
        }
        if (arg0 != null) {
            this.cfr_renamed_0.write(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_9402 instanceof sprbbl) {
            if (this.cfr_renamed_0.size() > this.cfr_renamed_9402.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprqnl.cfr_renamed_9("<V'\u0019%L+Qh])M)\u0019.V:\u0019\u001aj\t\u0019*U'Z#"));
            }
        } else if (this.cfr_renamed_0.size() > this.cfr_renamed_9402.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprxpo.cfr_renamed_9("#$8k:>4#w/6?6k1$%k\u0005\u0018\u0016k5'8(<"));
        }
        byte[] byArray = this.cfr_renamed_3673();
        int n2 = n = 0;
        while (n2 != byArray.length) {
            int n3 = arg4 + n;
            byte by = byArray[n];
            arg3[n3] = by;
            n2 = ++n;
        }
        return byArray.length;
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        sprvhj sprvhj2 = this;
        sprvhj2.cfr_renamed_0.write(arg0, arg1, arg2);
        if (sprvhj2.cfr_renamed_9402 instanceof sprbbl) {
            if (this.cfr_renamed_0.size() > this.cfr_renamed_9402.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprqnl.cfr_renamed_9("<V'\u0019%L+Qh])M)\u0019.V:\u0019\u001aj\t\u0019*U'Z#"));
            }
        } else if (this.cfr_renamed_0.size() > this.cfr_renamed_9402.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprxpo.cfr_renamed_9("#$8k:>4#w/6?6k1$%k\u0005\u0018\u0016k5'8(<"));
        }
        return null;
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        sprvhj sprvhj2 = this;
        sprvhj2.cfr_renamed_0.write(arg0, arg1, arg2);
        if (sprvhj2.cfr_renamed_9402 instanceof sprbbl) {
            if (this.cfr_renamed_0.size() > this.cfr_renamed_9402.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprqnl.cfr_renamed_9("<V'\u0019%L+Qh])M)\u0019.V:\u0019\u001aj\t\u0019*U'Z#"));
            }
        } else if (this.cfr_renamed_0.size() > this.cfr_renamed_9402.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprxpo.cfr_renamed_9("#$8k:>4#w/6?6k1$%k\u0005\u0018\u0016k5'8(<"));
        }
        return 0;
    }

    private /* synthetic */ void cfr_renamed_2485(OAEPParameterSpec arg0) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)arg0.getMGFParameters();
        sprgf sprgf2 = sprtji.cfr_renamed_2390(mGF1ParameterSpec.getDigestAlgorithm());
        if (sprgf2 == null) {
            throw new NoSuchPaddingException(new StringBuilder().insert(0, sprqnl.cfr_renamed_9("&VhT)M+QhV&\u0019\u0007x\rihZ'W;M:L+M'Kh_'Kh]!^-J<\u0019)U/V:P<Q%\u0003h")).append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
        }
        this.cfr_renamed_9402 = new sprjel(new sprbbl(), sprgf2, ((PSource.PSpecified)arg0.getPSource()).getValue());
        this.cfr_renamed_91 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprvhj(boolean bl, boolean bl2, sprwn sprwn2) {
        void arg1;
        void arg0;
        sprvhj sprvhj2 = this;
        sprvhj sprvhj3 = this;
        sprvhj sprvhj4 = this;
        this.cfr_renamed_4 = new sprdki();
        this.cfr_renamed_1 = false;
        sprvhj3.cfr_renamed_3 = false;
        sprvhj3.cfr_renamed_0 = new spreoj();
        sprvhj3.cfr_renamed_1 = arg0;
        sprvhj2.cfr_renamed_3 = arg1;
        sprvhj2.cfr_renamed_9402 = sprwn2;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof RSAPrivateKey) {
            RSAPrivateKey rSAPrivateKey = (RSAPrivateKey)arg0;
            return rSAPrivateKey.getModulus().bitLength();
        }
        if (arg0 instanceof RSAPublicKey) {
            RSAPublicKey rSAPublicKey = (RSAPublicKey)arg0;
            return rSAPublicKey.getModulus().bitLength();
        }
        throw new IllegalArgumentException(sprxpo.cfr_renamed_9("9$#k6%w\u0019\u0004\nw 22v"));
    }

    public sprvhj(sprwn sprwn2) {
        sprvhj sprvhj2 = this;
        sprvhj sprvhj3 = this;
        this.cfr_renamed_4 = new sprdki();
        this.cfr_renamed_1 = false;
        sprvhj2.cfr_renamed_3 = false;
        sprvhj2.cfr_renamed_0 = new spreoj();
        sprvhj2.cfr_renamed_9402 = sprwn2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineGetOutputSize(int arg0) {
        try {
            return this.cfr_renamed_9402.cfr_renamed_1339();
        }
        catch (NullPointerException nullPointerException) {
            throw new IllegalStateException(sprqnl.cfr_renamed_9("k\u001bxhz!I \\:\u0019&V<\u0019!W!M!X$P;\\,"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprvhj sprvhj2;
        if (this.cfr_renamed_9403 == null && this.cfr_renamed_91 != null) {
            try {
                sprvhj sprvhj3 = this;
                sprvhj3.cfr_renamed_9403 = sprvhj3.cfr_renamed_4.cfr_renamed_1540(sprxpo.cfr_renamed_9("\u0004\u0016\u000e\u0007"));
                sprvhj3.cfr_renamed_9403.init(this.cfr_renamed_91);
                sprvhj2 = this;
                return sprvhj2.cfr_renamed_9403;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprvhj2 = this;
        return sprvhj2.cfr_renamed_9403;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprvhj sprvhj2;
        OAEPParameterSpec oAEPParameterSpec = null;
        if (arg2 != null) {
            try {
                oAEPParameterSpec = arg2.getParameterSpec(OAEPParameterSpec.class);
                sprvhj2 = this;
            }
            catch (InvalidParameterSpecException invalidParameterSpecException) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprqnl.cfr_renamed_9("+X&W'MhK-Z'^&P;\\hI)K)T-M-K;\u0003h")).append(invalidParameterSpecException.toString()).toString(), invalidParameterSpecException);
            }
        } else {
            sprvhj2 = this;
        }
        sprvhj2.cfr_renamed_9403 = arg2;
        this.engineInit(arg0, arg1, oAEPParameterSpec, arg3);
    }
}

