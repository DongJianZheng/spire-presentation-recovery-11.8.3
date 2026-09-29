/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralm;
import com.spire.presentation.packages.sprbuk;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprftk;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprhfm;
import com.spire.presentation.packages.sprhnj;
import com.spire.presentation.packages.sprkii;
import com.spire.presentation.packages.sprkwe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqal;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprsqaa;
import com.spire.presentation.packages.sprwvh;
import com.spire.presentation.packages.sprxlj;
import com.spire.presentation.packages.sprxrk;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.sprzuk;
import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.security.spec.ECGenParameterSpec;
import java.security.spec.ECParameterSpec;

public class sprckj
extends KeyPairGenerator {
    public SecureRandom cfr_renamed_119;
    public sprftk cfr_renamed_91;
    public String cfr_renamed_0;
    public Object cfr_renamed_1;
    public int cfr_renamed_2;
    public sprqal cfr_renamed_3;
    public boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        this.cfr_renamed_2 = arg0;
        this.cfr_renamed_119 = secureRandom;
        if (this.cfr_renamed_1 == null) {
            throw new InvalidParameterException(sprsqaa.cfr_renamed_9("G\u001eY\u001e]\u0007\\PY\u0015KPA\u0019H\u0015\u001c"));
        }
        try {
            void arg1;
            sprckj sprckj2 = this;
            sprckj2.initialize((ECGenParameterSpec)sprckj2.cfr_renamed_1, (SecureRandom)arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(sprkwe.cfr_renamed_9("w%e`o)f%<.s4<#s.z){5n!~,yn"));
        }
    }

    private /* synthetic */ void cfr_renamed_9434(sprkii arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        sprlem sprlem2 = arg0.cfr_renamed_2106();
        sprhfm sprhfm2 = spralm.cfr_renamed_9184(sprlem2);
        if (sprhfm2 == null) {
            throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprkwe.cfr_renamed_9("5r+r/k.<#i2j%&`")).append(sprlem2).toString());
        }
        sprckj sprckj2 = this;
        sprckj2.cfr_renamed_1 = new sprxvh(spralm.cfr_renamed_7555(sprlem2), sprhfm2.cfr_renamed_1769(), sprhfm2.cfr_renamed_1145(), sprhfm2.cfr_renamed_1146(), sprhfm2.cfr_renamed_1153(), sprhfm2.cfr_renamed_2113());
        sprckj2.cfr_renamed_91 = new sprftk(new sprbuk(new sprxrk(sprlem2, sprhfm2), sprlem2, arg0.cfr_renamed_2107(), arg0.cfr_renamed_2105()), arg1);
        this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_91);
        this.cfr_renamed_4 = true;
    }

    public sprckj() {
        sprckj sprckj2 = this;
        sprckj sprckj3 = this;
        super("ECGOST3410");
        this.cfr_renamed_1 = null;
        sprckj sprckj4 = this;
        this.cfr_renamed_3 = new sprqal();
        sprckj3.cfr_renamed_0 = "ECGOST3410";
        sprckj3.cfr_renamed_2 = 239;
        sprckj2.cfr_renamed_119 = null;
        sprckj2.cfr_renamed_4 = false;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (arg0 instanceof sprkii) {
            sprkii sprkii2 = (sprkii)arg0;
            this.cfr_renamed_9434(sprkii2, arg1);
            return;
        }
        if (arg0 instanceof sprrxh) {
            sprrxh sprrxh2 = (sprrxh)arg0;
            this.cfr_renamed_1 = arg0;
            sprckj sprckj2 = this;
            this.cfr_renamed_91 = new sprftk(new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153()), arg1);
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_91);
            this.cfr_renamed_4 = true;
            return;
        }
        AlgorithmParameterSpec algorithmParameterSpec = arg0;
        if (arg0 instanceof ECParameterSpec) {
            ECParameterSpec eCParameterSpec = (ECParameterSpec)algorithmParameterSpec;
            this.cfr_renamed_1 = arg0;
            sprgxh sprgxh2 = sprnlj.cfr_renamed_2323(eCParameterSpec.getCurve());
            spreuh spreuh2 = sprnlj.cfr_renamed_9154(sprgxh2, eCParameterSpec.getGenerator());
            this.cfr_renamed_91 = new sprftk(new sprqxk(sprgxh2, spreuh2, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), arg1);
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_91);
            this.cfr_renamed_4 = true;
            return;
        }
        if (algorithmParameterSpec instanceof ECGenParameterSpec || arg0 instanceof sprwvh) {
            sprckj sprckj3;
            String string;
            AlgorithmParameterSpec algorithmParameterSpec2 = arg0;
            if (arg0 instanceof ECGenParameterSpec) {
                string = ((ECGenParameterSpec)algorithmParameterSpec2).getName();
                sprckj3 = this;
            } else {
                string = ((sprwvh)algorithmParameterSpec2).cfr_renamed_313();
                sprckj3 = this;
            }
            sprckj3.cfr_renamed_9434(new sprkii(string), arg1);
            return;
        }
        if (arg0 == null && sprsci.cfr_renamed_105.cfr_renamed_2312() != null) {
            sprrxh sprrxh3 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            this.cfr_renamed_1 = arg0;
            this.cfr_renamed_91 = new sprftk(new sprqxk(sprrxh3.cfr_renamed_1769(), sprrxh3.cfr_renamed_1145(), sprrxh3.cfr_renamed_1146(), sprrxh3.cfr_renamed_1153()), arg1);
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_91);
            this.cfr_renamed_4 = true;
            return;
        }
        if (arg0 == null && sprsci.cfr_renamed_105.cfr_renamed_2312() == null) {
            throw new InvalidAlgorithmParameterException(sprsqaa.cfr_renamed_9("\\\u0005^\u001c\u0012\u0000S\u0002S\u001dW\u0004W\u0002\u0012\u0000S\u0003A\u0015VPP\u0005FP\\\u001f\u0012\u0019_\u0000^\u0019Q\u0019F3sPA\u0015F"));
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprkwe.cfr_renamed_9("l!n!q%h%n`s\"v%\u007f4<.s4<!<\u0005_\u0010}2}-y4y2O0y#&`")).append(arg0.getClass().getName()).toString());
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprsqaa.cfr_renamed_9("w3\u0012;W\t\u0012 S\u0019@Pu\u0015\\\u0015@\u0011F\u001f@P\\\u001fFP[\u001e[\u0004[\u0011^\u0019A\u0015V"));
        }
        sprsil sprsil2 = this.cfr_renamed_3.cfr_renamed_1223();
        sprnzk sprnzk2 = (sprnzk)sprsil2.cfr_renamed_1224();
        sprzuk sprzuk2 = (sprzuk)sprsil2.cfr_renamed_1225();
        if (this.cfr_renamed_1 instanceof sprrxh) {
            sprrxh sprrxh2 = (sprrxh)this.cfr_renamed_1;
            sprxlj sprxlj2 = new sprxlj(this.cfr_renamed_0, sprnzk2, sprrxh2);
            return new KeyPair(sprxlj2, new sprhnj(this.cfr_renamed_0, sprzuk2, sprxlj2, sprrxh2));
        }
        if (this.cfr_renamed_1 == null) {
            return new KeyPair(new sprxlj(this.cfr_renamed_0, sprnzk2), new sprhnj(this.cfr_renamed_0, sprzuk2));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec)this.cfr_renamed_1;
        sprxlj sprxlj3 = new sprxlj(this.cfr_renamed_0, sprnzk2, eCParameterSpec);
        return new KeyPair(sprxlj3, new sprhnj(this.cfr_renamed_0, sprzuk2, sprxlj3, eCParameterSpec));
    }
}

