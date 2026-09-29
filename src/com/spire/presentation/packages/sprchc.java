/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprcqc;
import com.spire.presentation.packages.spremc;
import com.spire.presentation.packages.sprfkd;
import com.spire.presentation.packages.sprflb;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnjj;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprpmd;
import com.spire.presentation.packages.sprrcd;
import com.spire.presentation.packages.spryid;
import com.spire.presentation.packages.sprywa;
import com.spire.presentation.packages.sprzqh;
import java.io.ByteArrayOutputStream;
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
import javax.crypto.spec.OAEPParameterSpec;
import javax.crypto.spec.PSource;

public class sprchc
extends sprcqc {
    private ByteArrayOutputStream cfr_renamed_0;
    private sprh cfr_renamed_2483;
    private AlgorithmParameterSpec cfr_renamed_2;
    private boolean cfr_renamed_3;
    private boolean cfr_renamed_4;
    private AlgorithmParameters cfr_renamed_2484;

    public sprchc(sprh sprh2) {
        sprchc sprchc2 = this;
        this.cfr_renamed_3 = false;
        sprchc2.cfr_renamed_4 = false;
        sprchc sprchc3 = this;
        sprchc2.cfr_renamed_0 = new ByteArrayOutputStream();
        sprchc2.cfr_renamed_2483 = sprh2;
    }

    @Override
    public byte[] engineUpdate(byte[] arg0, int arg1, int arg2) {
        sprchc sprchc2 = this;
        sprchc2.cfr_renamed_0.write(arg0, arg1, arg2);
        if (sprchc2.cfr_renamed_2483 instanceof sprrcd) {
            if (this.cfr_renamed_0.size() > this.cfr_renamed_2483.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprnjj.cfr_renamed_9("\u0007\u001c\u001cS\u001e\u0006\u0010\u001bS\u0017\u0012\u0007\u0012S\u0015\u001c\u0001S! 2S\u0011\u001f\u001c\u0010\u0018"));
            }
        } else if (this.cfr_renamed_0.size() > this.cfr_renamed_2483.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprzqh.cfr_renamed_9("pCk\fiYgD$HeXe\fbCv\fV\u007fE\ff@kOo"));
        }
        return null;
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
        throw new IllegalArgumentException(sprnjj.cfr_renamed_9("\u001d\u001c\u0007S\u0012\u001dS! 2S\u0018\u0016\nR"));
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprchc(OAEPParameterSpec oAEPParameterSpec) {
        sprchc sprchc2 = this;
        sprchc2.cfr_renamed_3 = false;
        sprchc2.cfr_renamed_4 = false;
        sprchc sprchc3 = this;
        sprchc2.cfr_renamed_0 = new ByteArrayOutputStream();
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
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineGetBlockSize() {
        try {
            return this.cfr_renamed_2483.cfr_renamed_1344();
        }
        catch (NullPointerException nullPointerException) {
            throw new IllegalStateException(sprzqh.cfr_renamed_9("~Wm$om\\lIv\fjCp\fmBmXmMhEwI`"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineGetOutputSize(int arg0) {
        try {
            return this.cfr_renamed_2483.cfr_renamed_1339();
        }
        catch (NullPointerException nullPointerException) {
            throw new IllegalStateException(sprnjj.cfr_renamed_9("! 2S0\u001a\u0003\u001b\u0016\u0001S\u001d\u001c\u0007S\u001a\u001d\u001a\u0007\u001a\u0012\u001f\u001a\u0000\u0016\u0017"));
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void engineInit(int arg0, Key arg1, AlgorithmParameters arg2, SecureRandom arg3) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprchc sprchc2;
        OAEPParameterSpec oAEPParameterSpec = null;
        if (arg2 != null) {
            try {
                oAEPParameterSpec = arg2.getParameterSpec(OAEPParameterSpec.class);
                sprchc2 = this;
            }
            catch (InvalidParameterSpecException invalidParameterSpecException) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprzqh.cfr_renamed_9("gMjBkX$^aOkKjEwI$\\e^eAaXa^w\u0016$")).append(invalidParameterSpecException.toString()).toString(), invalidParameterSpecException);
            }
        } else {
            sprchc2 = this;
        }
        sprchc2.cfr_renamed_2484 = arg2;
        this.engineInit(arg0, arg1, oAEPParameterSpec, arg3);
    }

    @Override
    public void engineSetPadding(String arg0) throws NoSuchPaddingException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprnjj.cfr_renamed_9("=<#277:=4"))) {
            sprchc sprchc2 = this;
            sprchc2.cfr_renamed_2483 = new sprrcd();
            return;
        }
        if (string.equals(sprzqh.cfr_renamed_9("|OoW\u001dTm@hMbC"))) {
            this.cfr_renamed_2483 = new sprpmd(new sprrcd());
            return;
        }
        if (string.equals(sprnjj.cfr_renamed_9(": <JDJE^B#277:=4"))) {
            this.cfr_renamed_2483 = new sprfkd(new sprrcd());
            return;
        }
        if (string.equals(sprzqh.cfr_renamed_9("KmA|SePdIh1mJhIkB\u001dTm@hMbC"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("MD5", sprnjj.cfr_renamed_9(">45B"), new MGF1ParameterSpec("MD5"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprzqh.cfr_renamed_9("KmA|Tm@hMbC"))) {
            this.cfr_renamed_2485(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (string.equals(sprnjj.cfr_renamed_9("<26#$:'; ;2B2=7>45B#277:=4")) || string.equals(sprzqh.cfr_renamed_9("KmA|SePdWdE\u00015mJhIkB\u001dTm@hMbC"))) {
            this.cfr_renamed_2485(OAEPParameterSpec.DEFAULT);
            return;
        }
        if (string.equals(sprnjj.cfr_renamed_9("<26#$:'; ;2AAG2=7>45B#277:=4")) || string.equals(sprzqh.cfr_renamed_9("KmA|SePdWdE\u00016\u001e0mJhIkB\u001dTm@hMbC"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-224", sprnjj.cfr_renamed_9(">45B"), new MGF1ParameterSpec("SHA-224"), PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprzqh.cfr_renamed_9("cEiT{MxL\u007fLm6\u00192mJhIkB\u001dTm@hMbC")) || string.equals(sprnjj.cfr_renamed_9("<26#$:'; ;2^AFE2=7>45B#277:=4"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-256", sprzqh.cfr_renamed_9("aCj5"), MGF1ParameterSpec.SHA256, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprnjj.cfr_renamed_9("<26#$:'; ;2@KG2=7>45B#277:=4")) || string.equals(sprzqh.cfr_renamed_9("KmA|SePdWdE\u00017\u00140mJhIkB\u001dTm@hMbC"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-384", sprnjj.cfr_renamed_9(">45B"), MGF1ParameterSpec.SHA384, PSource.PSpecified.DEFAULT));
            return;
        }
        if (string.equals(sprzqh.cfr_renamed_9("cEiT{MxL\u007fLm1\u001d6mJhIkB\u001dTm@hMbC")) || string.equals(sprnjj.cfr_renamed_9("<26#$:'; ;2^FBA2=7>45B#277:=4"))) {
            this.cfr_renamed_2485(new OAEPParameterSpec("SHA-512", sprzqh.cfr_renamed_9("aCj5"), MGF1ParameterSpec.SHA512, PSource.PSpecified.DEFAULT));
            return;
        }
        throw new NoSuchPaddingException(new StringBuilder().insert(0, arg0).append(sprnjj.cfr_renamed_9("S\u0006\u001d\u0012\u0005\u0012\u001a\u001f\u0012\u0011\u001f\u0016S\u0004\u001a\u0007\u001bS! 2]")).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public AlgorithmParameters engineGetParameters() {
        sprchc sprchc2;
        if (this.cfr_renamed_2484 == null && this.cfr_renamed_2 != null) {
            try {
                this.cfr_renamed_2484 = AlgorithmParameters.getInstance(sprzqh.cfr_renamed_9("cEiT"), "BC");
                this.cfr_renamed_2484.init(this.cfr_renamed_2);
                sprchc2 = this;
                return sprchc2.cfr_renamed_2484;
            }
            catch (Exception exception) {
                throw new RuntimeException(exception.toString());
            }
        }
        sprchc2 = this;
        return sprchc2.cfr_renamed_2484;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int engineDoFinal(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) throws IllegalBlockSizeException, BadPaddingException {
        int n;
        byte[] byArray;
        if (arg0 != null) {
            this.cfr_renamed_0.write(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_2483 instanceof sprrcd) {
            if (this.cfr_renamed_0.size() > this.cfr_renamed_2483.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprnjj.cfr_renamed_9("\u0007\u001c\u001cS\u001e\u0006\u0010\u001bS\u0017\u0012\u0007\u0012S\u0015\u001c\u0001S! 2S\u0011\u001f\u001c\u0010\u0018"));
            }
        } else if (this.cfr_renamed_0.size() > this.cfr_renamed_2483.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprzqh.cfr_renamed_9("pCk\fiYgD$HeXe\fbCv\fV\u007fE\ff@kOo"));
        }
        try {
            sprchc sprchc2 = this;
            byte[] byArray2 = sprchc2.cfr_renamed_0.toByteArray();
            byArray = sprchc2.cfr_renamed_2483.cfr_renamed_1337(byArray2, 0, byArray2.length);
        }
        catch (sprpjd sprpjd2) {
            throw new BadPaddingException(sprpjd2.getMessage());
        }
        finally {
            this.cfr_renamed_0.reset();
        }
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
    public void engineInit(int arg0, Key arg1, SecureRandom arg2) throws InvalidKeyException {
        try {
            this.engineInit(arg0, arg1, (AlgorithmParameterSpec)null, arg2);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidKeyException(new StringBuilder().insert(0, sprnjj.cfr_renamed_9("6\u0016\u0016\u0016\u0018RS")).append(invalidAlgorithmParameterException.toString()).toString(), invalidAlgorithmParameterException);
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] engineDoFinal(byte[] arg0, int arg1, int arg2) throws IllegalBlockSizeException, BadPaddingException {
        if (arg0 != null) {
            this.cfr_renamed_0.write(arg0, arg1, arg2);
        }
        if (this.cfr_renamed_2483 instanceof sprrcd) {
            if (this.cfr_renamed_0.size() > this.cfr_renamed_2483.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprzqh.cfr_renamed_9("pCk\fiYgD$HeXe\fbCv\fV\u007fE\ff@kOo"));
            }
        } else if (this.cfr_renamed_0.size() > this.cfr_renamed_2483.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprnjj.cfr_renamed_9("\u0007\u001c\u001cS\u001e\u0006\u0010\u001bS\u0017\u0012\u0007\u0012S\u0015\u001c\u0001S! 2S\u0011\u001f\u001c\u0010\u0018"));
        }
        try {
            sprchc sprchc2 = this;
            byte[] byArray = sprchc2.cfr_renamed_0.toByteArray();
            sprchc2.cfr_renamed_0.reset();
            return sprchc2.cfr_renamed_2483.cfr_renamed_1337(byArray, 0, byArray.length);
        }
        catch (sprpjd sprpjd2) {
            throw new BadPaddingException(sprpjd2.getMessage());
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
                        if (this.cfr_renamed_4 && arg0 == 1) {
                            throw new InvalidKeyException(sprzqh.cfr_renamed_9("iC`I$\u001d$^a]qEvIw\fV\u007fE|vErMpIOI}"));
                        }
                        var5_5 /* !! */  = spremc.cfr_renamed_2476((RSAPublicKey)arg1);
                        v0 = arg2;
                    } else if (arg1 instanceof RSAPrivateKey) {
                        if (this.cfr_renamed_3 && arg0 == 1) {
                            throw new InvalidKeyException(sprnjj.cfr_renamed_9("\u001e\u001c\u0017\u0016SAS\u0001\u0016\u0002\u0006\u001a\u0001\u0016\u0000S! 2#\u0006\u0011\u001f\u001a\u00108\u0016\n"));
                        }
                        var5_5 /* !! */  = spremc.cfr_renamed_2477((RSAPrivateKey)arg1);
                        v0 = arg2;
                    } else {
                        throw new InvalidKeyException(sprzqh.cfr_renamed_9("YjGjCsB$GaU$X}\\a\ftMw_aH$Xk\fV\u007fE"));
                    }
                    if (v0 == null) break block18;
                    var6_6 = (OAEPParameterSpec)arg2;
                    this.cfr_renamed_2 = arg2;
                    if (!var6_6.getMGFAlgorithm().equalsIgnoreCase(sprnjj.cfr_renamed_9(">45B")) && !var6_6.getMGFAlgorithm().equals(sprm.cfr_renamed_123.cfr_renamed_19())) {
                        throw new InvalidAlgorithmParameterException(sprzqh.cfr_renamed_9("YjGjCsB$Ae_o\fcIjIvMpEkB$JqBgXmCj\fw\\aOmJmI`"));
                    }
                    if (!(var6_6.getMGFParameters() instanceof MGF1ParameterSpec)) {
                        throw new InvalidAlgorithmParameterException(sprnjj.cfr_renamed_9("\u0006\u001d\u0018\u001c\u0004\u001dS>45S\u0003\u0012\u0001\u0012\u001e\u0016\u0007\u0016\u0001\u0000"));
                    }
                    var7_7 = sprflb.cfr_renamed_2390(var6_6.getDigestAlgorithm());
                    if (var7_7 == null) {
                        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprzqh.cfr_renamed_9("Bk\fiMpOl\fkB$HmKa_p\fe@cCvEpDi\u0016$")).append(var6_6.getDigestAlgorithm()).toString());
                    }
                    var8_8 = (MGF1ParameterSpec)var6_6.getMGFParameters();
                    var9_9 = sprflb.cfr_renamed_2390(var8_8.getDigestAlgorithm());
                    if (var9_9 == null) {
                        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprnjj.cfr_renamed_9("\u001d\u001cS\u001e\u0012\u0007\u0010\u001bS\u001c\u001dS>45S\u0017\u001a\u0014\u0016\u0000\u0007S\u0012\u001f\u0014\u001c\u0001\u001a\u0007\u001b\u001eIS")).append(var8_8.getDigestAlgorithm()).toString());
                    }
                    this.cfr_renamed_2483 = new spryid(new sprrcd(), var7_7, var9_9, ((PSource.PSpecified)var6_6.getPSource()).getValue());
                    v1 = this;
                    break block19;
                }
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprzqh.cfr_renamed_9("YjGjCsB$\\e^eAaXa^$X}\\a\u0016$")).append(arg2.getClass().getName()).toString());
            }
            v1 = this;
        }
        if (v1.cfr_renamed_2483 instanceof sprrcd) ** GOTO lbl45
        if (arg3 != null) {
            v2 = new spraed(var5_5 /* !! */ , arg3);
            var5_5 /* !! */  = v2;
            v3 = this;
        } else {
            v2 = new spraed(var5_5 /* !! */ , new SecureRandom());
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
                this.cfr_renamed_2483.cfr_renamed_1217(true, var5_5 /* !! */ );
                return;
            }
            case 2: 
            case 4: {
                this.cfr_renamed_2483.cfr_renamed_1217(false, var5_5 /* !! */ );
                return;
            }
        }
        throw new InvalidParameterException(new StringBuilder().insert(0, sprnjj.cfr_renamed_9("\u0006\u001d\u0018\u001d\u001c\u0004\u001dS\u001c\u0003\u001e\u001c\u0017\u0016S")).append(arg0).append(sprzqh.cfr_renamed_9("\ftMw_aH$Xk\fV\u007fE")).toString());
    }

    @Override
    public void engineSetMode(String arg0) throws NoSuchAlgorithmException {
        String string = sprywa.cfr_renamed_116(arg0);
        if (string.equals(sprnjj.cfr_renamed_9("=<=6")) || string.equals(sprzqh.cfr_renamed_9("AoF"))) {
            return;
        }
        if (string.equals("1")) {
            sprchc sprchc2 = this;
            sprchc2.cfr_renamed_4 = true;
            sprchc2.cfr_renamed_3 = false;
            return;
        }
        if (string.equals(sprnjj.cfr_renamed_9("A"))) {
            sprchc sprchc3 = this;
            sprchc3.cfr_renamed_4 = false;
            sprchc3.cfr_renamed_3 = true;
            return;
        }
        throw new NoSuchAlgorithmException(new StringBuilder().insert(0, sprzqh.cfr_renamed_9("gMj\u000bp\fwYt\\k^p\fiC`I$")).append(arg0).toString());
    }

    private /* synthetic */ void cfr_renamed_2485(OAEPParameterSpec arg0) throws NoSuchPaddingException {
        MGF1ParameterSpec mGF1ParameterSpec = (MGF1ParameterSpec)arg0.getMGFParameters();
        sprlc sprlc2 = sprflb.cfr_renamed_2390(mGF1ParameterSpec.getDigestAlgorithm());
        if (sprlc2 == null) {
            throw new NoSuchPaddingException(new StringBuilder().insert(0, sprnjj.cfr_renamed_9("\u001d\u001cS\u001e\u0012\u0007\u0010\u001bS\u001c\u001dS<26#S\u0010\u001c\u001d\u0000\u0007\u0001\u0006\u0010\u0007\u001c\u0001S\u0015\u001c\u0001S\u0017\u001a\u0014\u0016\u0000\u0007S\u0012\u001f\u0014\u001c\u0001\u001a\u0007\u001b\u001eIS")).append(mGF1ParameterSpec.getDigestAlgorithm()).toString());
        }
        this.cfr_renamed_2483 = new spryid(new sprrcd(), sprlc2, ((PSource.PSpecified)arg0.getPSource()).getValue());
        this.cfr_renamed_2 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprchc(boolean bl, boolean bl2, sprh sprh2) {
        void arg1;
        void arg0;
        sprchc sprchc2 = this;
        sprchc sprchc3 = this;
        this.cfr_renamed_3 = false;
        sprchc3.cfr_renamed_4 = false;
        sprchc sprchc4 = this;
        sprchc3.cfr_renamed_0 = new ByteArrayOutputStream();
        sprchc3.cfr_renamed_3 = arg0;
        sprchc2.cfr_renamed_4 = arg1;
        sprchc2.cfr_renamed_2483 = sprh2;
    }

    @Override
    public int engineUpdate(byte[] arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        sprchc sprchc2 = this;
        sprchc2.cfr_renamed_0.write(arg0, arg1, arg2);
        if (sprchc2.cfr_renamed_2483 instanceof sprrcd) {
            if (this.cfr_renamed_0.size() > this.cfr_renamed_2483.cfr_renamed_1344() + 1) {
                throw new ArrayIndexOutOfBoundsException(sprzqh.cfr_renamed_9("pCk\fiYgD$HeXe\fbCv\fV\u007fE\ff@kOo"));
            }
        } else if (this.cfr_renamed_0.size() > this.cfr_renamed_2483.cfr_renamed_1344()) {
            throw new ArrayIndexOutOfBoundsException(sprnjj.cfr_renamed_9("\u0007\u001c\u001cS\u001e\u0006\u0010\u001bS\u0017\u0012\u0007\u0012S\u0015\u001c\u0001S! 2S\u0011\u001f\u001c\u0010\u0018"));
        }
        return 0;
    }
}

