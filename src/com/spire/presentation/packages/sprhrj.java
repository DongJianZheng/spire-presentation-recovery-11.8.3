/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprazh;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcqj;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.spreoj;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgkl;
import com.spire.presentation.packages.sprhh;
import com.spire.presentation.packages.spriko;
import com.spire.presentation.packages.sprjcl;
import com.spire.presentation.packages.sprjej;
import com.spire.presentation.packages.sprjel;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprtel;
import com.spire.presentation.packages.sprtji;
import com.spire.presentation.packages.sprtrj;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprwn;
import java.security.AlgorithmParameters;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.InvalidParameterException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.MGF1ParameterSpec;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.ShortBufferException;
import javax.crypto.interfaces.DHKey;
import javax.crypto.interfaces.DHPrivateKey;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class sprhrj
extends sprcqj {
    private spreoj cfr_renamed_9413;
    private sprwn cfr_renamed_3;
    private AlgorithmParameterSpec cfr_renamed_4;
    private AlgorithmParameters cfr_renamed_9403;

    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException, ShortBufferException {
        int n;
        if (arg4 + this.engineGetOutputSize(arg2) > arg3.length) {
            throw new ShortBufferException(sprjej.cfr_renamed_9("0n+k*o\u007fy*}9~-;+t0;,s0i+;9t-;6u/n+5"));
        }
        if (arg0 != null) {
            this.cfr_renamed_9413.write(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_3 instanceof sprtel) {
            if (this.cfr_renamed_9413.size() > this.cfr_renamed_3.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(spriko.cfr_renamed_9("]HF\u0007DRJO\tCHSH\u0007OH[\u0007lKnFDFE\u0007KKFDB"));
            }
        } else if (this.cfr_renamed_9413.size() > this.cfr_renamed_3.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprjej.cfr_renamed_9("o0t\u007fv*x7;;z+z\u007f}0i\u007f^3\\>v>w\u007fy3t<p"));
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprhrj sprhrj2;
        if (this.cfr_renamed_9403 == null && this.cfr_renamed_4 != null) {
            try {
                sprhrj sprhrj3 = this;
                sprhrj3.cfr_renamed_9403 = sprhrj3.cfr_renamed_9250(spriko.cfr_renamed_9("hhby"));
                sprhrj3.cfr_renamed_9403.init(this.cfr_renamed_4);
                sprhrj2 = this;
                return sprhrj2.cfr_renamed_9403;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprhrj2 = this;
        return sprhrj2.cfr_renamed_9403;
    }

    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        if (arg0 != null) {
            this.cfr_renamed_9413.write(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_3 instanceof sprtel) {
            if (this.cfr_renamed_9413.size() > this.cfr_renamed_3.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprjej.cfr_renamed_9("o0t\u007fv*x7;;z+z\u007f}0i\u007f^3\\>v>w\u007fy3t<p"));
            }
        } else if (this.cfr_renamed_9413.size() > this.cfr_renamed_3.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(spriko.cfr_renamed_9("]HF\u0007DRJO\tCHSH\u0007OH[\u0007lKnFDFE\u0007KKFDB"));
        }
        return this.cfr_renamed_3673();
    }

    @Override
    public int engineGetBlockSize() {
        return this.cfr_renamed_3.cfr_renamed_1344();
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(sprjej.cfr_renamed_9("U\u0010K\u001e_\u001bR\u0011\\"))) {
            sprhrj sprhrj2 = this;
            sprhrj2.cfr_renamed_3 = new sprtel();
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("wbdz\u0016yfmc`in"))) {
            this.cfr_renamed_3 = new sprgkl(new sprtel());
            return;
        }
        if (string.equals(sprjej.cfr_renamed_9("\u0016H\u0010\"h\"i6nK\u001e_\u001bR\u0011\\"))) {
            this.cfr_renamed_3 = new sprjcl(new sprtel());
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("fflwyfmc`in"))) {
            this.cfr_renamed_2485(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (string.equals(sprjej.cfr_renamed_9("T\u001e^\u000fL\u0016O\u0017V\u001b.\u001eU\u001bV\u0018]nK\u001e_\u001bR\u0011\\"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("MD5", spriko.cfr_renamed_9("jna\u0018"), new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprjej.cfr_renamed_9("\u0010Z\u001aK\bR\u000bS\fS\u001e*\u001eU\u001bV\u0018]nK\u001e_\u001bR\u0011\\"))) {
            this.cfr_renamed_2485(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("hhbyp`sataf\u001b\u0015\u001dfgcd`o\u0016yfmc`in"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-224", sprjej.cfr_renamed_9("\u0012\\\u0019*"), new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("hhbyp`sataf\u001b\u0012\u001ffgcd`o\u0016yfmc`in"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-256", sprjej.cfr_renamed_9("\u0012\\\u0019*"), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("hhbyp`sataf\u001a\u001f\u001dfgcd`o\u0016yfmc`in"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-384", sprjej.cfr_renamed_9("\u0012\\\u0019*"), MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("hhbyp`sataf\u001c\u0016\u001bfgcd`o\u0016yfmc`in"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-512", sprjej.cfr_renamed_9("\u0012\\\u0019*"), MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("hhbyp`sataf\u001a\n\u001b\u0015\u001dfgcd`o\u0016yfmc`in"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec(sprjej.cfr_renamed_9("\fS\u001e(r)m/"), spriko.cfr_renamed_9("jna\u0018"), new MGF1ParameterSpec(sprjej.cfr_renamed_9("\fS\u001e(r)m/")), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("hhbyp`sataf\u001a\n\u001b\u0012\u001ffgcd`o\u0016yfmc`in"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA3-256", sprjej.cfr_renamed_9("\u0012\\\u0019*"), new MGF1ParameterSpec("SHA3-256"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("hhbyp`sataf\u001a\n\u001a\u001f\u001dfgcd`o\u0016yfmc`in"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec(sprjej.cfr_renamed_9("\fS\u001e(r(g/"), spriko.cfr_renamed_9("jna\u0018"), new MGF1ParameterSpec(sprjej.cfr_renamed_9("\fS\u001e(r(g/")), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(spriko.cfr_renamed_9("hhbyp`sataf\u001a\n\u001c\u0016\u001bfgcd`o\u0016yfmc`in"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec(sprjej.cfr_renamed_9("\fS\u001e(r.n)"), spriko.cfr_renamed_9("jna\u0018"), new MGF1ParameterSpec(sprjej.cfr_renamed_9("\fS\u001e(r.n)")), PSource.PSpecified.DEFAULT));
            return;
        }
        throw new NoSuchPaddingException(new StringBuilder().insert(0, arg0).append(spriko.cfr_renamed_9("\u0007\\IHQHNEFKKL\u0007^N]O\tbE`HJHK\u0007")).toString());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] engineUpdate(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_9413.write((byte[])arg0, (int)arg1, (int)arg2);
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int engineUpdate(byte[] byArray, int n, int n2, byte[] byArray2, int n3) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_9413.write((byte[])arg0, (int)arg1, (int)arg2);
        return 0;
    }

    @Override
    public int engineGetKeySize(Key arg0) {
        if (arg0 instanceof sprhh) {
            sprhh sprhh2 = (sprhh)((Object)arg0);
            return sprhh2.cfr_renamed_284().cfr_renamed_1155().bitLength();
        }
        if (arg0 instanceof DHKey) {
            DHKey dHKey = (DHKey)((Object)arg0);
            return dHKey.getParams().getP().bitLength();
        }
        throw new IllegalArgumentException(sprjej.cfr_renamed_9("u0o\u007fz1;\u001aw\u0018z2z3;4~&:"));
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
            throw new InvalidKeyException(new StringBuilder().insert(0, spriko.cfr_renamed_9("lBLBB\u0006\t")).append(invalidAlgorithmParameterException.toString()).toString(), invalidAlgorithmParameterException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ byte[] cfr_renamed_3673() throws BadPaddingException {
        try {
            sprhrj sprhrj2 = this;
            byte[] byArray = sprhrj2.cfr_renamed_3.cfr_renamed_1337(sprhrj2.cfr_renamed_9413.cfr_renamed_9247(), 0, this.cfr_renamed_9413.size());
            return byArray;
        }
        catch (sprull sprull2) {
            throw new sprazh(sprjej.cfr_renamed_9("n1z=w:;+t\u007f\u007f:x-b/o\u007fy3t<p"), sprull2);
        }
        catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            throw new sprazh(spriko.cfr_renamed_9("\\IHEEB\tSF\u0007MBJUPW]\u0007KKFDB"), arrayIndexOutOfBoundsException);
        }
        finally {
            this.cfr_renamed_9413.cfr_renamed_9248();
        }
    }

    private /* synthetic */ void cfr_renamed_2485(OAEPParameterSpec arg0) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)arg0.getMGFParameters();
        sprgf sprgf2 = sprtji.cfr_renamed_2390(mGF1ParameterSpec.getDigestAlgorithm());
        if (sprgf2 == null) {
            throw new NoSuchPaddingException(new StringBuilder().insert(0, sprjej.cfr_renamed_9("u0;2z+x7;0u\u007fT\u001e^\u000f;<t1h+i*x+t-;9t-;;r8~,o\u007fz3|0i6o7ve;")).append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
        }
        this.cfr_renamed_3 = new sprjel(new sprtel(), sprgf2, ((PSource.PSpecified)arg0.getPSource()).getValue());
        this.cfr_renamed_4 = arg0;
    }

    public sprhrj(sprwn sprwn2) {
        sprhrj sprhrj2 = this;
        this.cfr_renamed_9413 = new spreoj();
        this.cfr_renamed_3 = sprwn2;
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprkoe.cfr_renamed_116(arg0);
        if (string.equals(spriko.cfr_renamed_9("ifil")) || string.equals(sprjej.cfr_renamed_9("^\u001cY"))) {
            return;
        }
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, spriko.cfr_renamed_9("JFG\u0000]\u0007ZRYWFU]\u0007DHMB\t")).append(arg0).toString());
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameterSpec arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        SecureRandom secureRandom;
        AlgorithmParameterSpec algorithmParameterSpec;
        sprbj sprbj2;
        if (arg1 instanceof DHPublicKey) {
            sprbj2 = sprtrj.cfr_renamed_1216((PublicKey)arg1);
            algorithmParameterSpec = arg2;
        } else if (arg1 instanceof DHPrivateKey) {
            sprbj2 = sprtrj.cfr_renamed_1220((PrivateKey)arg1);
            algorithmParameterSpec = arg2;
        } else {
            throw new InvalidKeyException(sprjej.cfr_renamed_9("*u4u0l1;4~&;+b/~\u007fk>h,~;;+t\u007f^3\\>v>w"));
        }
        if (algorithmParameterSpec instanceof OAEPParameterSpec) {
            OAEPParameterSpec oAEPParameterSpec = (OAEPParameterSpec)arg2;
            this.cfr_renamed_4 = arg2;
            if (!oAEPParameterSpec.getMGFAlgorithm().equalsIgnoreCase(spriko.cfr_renamed_9("jna\u0018")) && !oAEPParameterSpec.getMGFAlgorithm().equals(sprdl.cfr_renamed_135.cfr_renamed_19())) {
                throw new InvalidAlgorithmParameterException(sprjej.cfr_renamed_9("*u4u0l1;2z,p\u007f|:u:i>o6t1;9n1x+r0u\u007fh/~<r9r:\u007f"));
            }
            if (!(oAEPParameterSpec.getMGFParameters() instanceof MGF1ParameterSpec)) {
                throw new InvalidAlgorithmParameterException(spriko.cfr_renamed_9("\\IBH^I\tjna\tWHUHJLSLUZ"));
            }
            sprgf sprgf2 = sprtji.cfr_renamed_2390(oAEPParameterSpec.getDigestAlgorithm());
            if (sprgf2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprjej.cfr_renamed_9("1t\u007fv>o<s\u007ft1;;r8~,o\u007fz3|0i6o7ve;")).append(oAEPParameterSpec.getDigestAlgorithm()).toString());
            }
            MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)oAEPParameterSpec.getMGFParameters();
            sprgf sprgf3 = sprtji.cfr_renamed_2390(mGF1ParameterSpec.getDigestAlgorithm());
            if (sprgf3 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, spriko.cfr_renamed_9("IF\u0007DF]DA\u0007FI\tjna\tC@@LT]\u0007HKNH[N]OD\u001d\t")).append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
            }
            this.cfr_renamed_3 = new sprjel(new sprtel(), sprgf2, sprgf3, ((PSource.PSpecified)oAEPParameterSpec.getPSource()).getValue());
            secureRandom = arg3;
        } else {
            if (arg2 != null) {
                throw new InvalidAlgorithmParameterException(sprjej.cfr_renamed_9("n1p1t(u\u007fk>i>v:o:i\u007fo&k:5"));
            }
            secureRandom = arg3;
        }
        if (secureRandom != null) {
            sprbj2 = new sprbgk(sprbj2, arg3);
        }
        switch (arg0) {
            case 1: 
            case 3: {
                while (false) {
                }
                this.cfr_renamed_3.cfr_renamed_5535(true, sprbj2);
                return;
            }
            case 2: 
            case 4: {
                this.cfr_renamed_3.cfr_renamed_5535(false, sprbj2);
                return;
            }
        }
        throw new InvalidParameterException(new StringBuilder().insert(0, spriko.cfr_renamed_9("\\IBIFPG\u0007FWDHMB\t")).append(arg0).append(sprjej.cfr_renamed_9("\u007fk>h,~;;+t\u007f^3\\>v>w")).toString());
    }

    @Override
    public int engineGetOutputSize(int arg0) {
        return this.cfr_renamed_3.cfr_renamed_1339();
    }

    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        throw new InvalidAlgorithmParameterException(spriko.cfr_renamed_9("DHI\u000eS\tOHIMKL\u0007YF[FDB]B[T\tNG\u0007lKnFDFE"));
    }
}

