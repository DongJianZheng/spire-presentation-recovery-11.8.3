/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprctj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprftk;
import com.spire.presentation.packages.sprgxh;
import com.spire.presentation.packages.sprkki;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprloia;
import com.spire.presentation.packages.sprnlj;
import com.spire.presentation.packages.sprnzk;
import com.spire.presentation.packages.sprqal;
import com.spire.presentation.packages.sprqbk;
import com.spire.presentation.packages.sprqwk;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprrxh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwim;
import com.spire.presentation.packages.sprwvh;
import com.spire.presentation.packages.sprxvh;
import com.spire.presentation.packages.spryez;
import com.spire.presentation.packages.sprzsk;
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

public class sprkwj
extends KeyPairGenerator {
    public sprqal cfr_renamed_91;
    public boolean cfr_renamed_0;
    public Object cfr_renamed_1;
    public sprftk cfr_renamed_2;
    public String cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    public sprkwj() {
        sprkwj sprkwj2 = this;
        sprkwj sprkwj3 = this;
        super("DSTU4145");
        sprkwj3.cfr_renamed_1 = null;
        sprkwj sprkwj4 = this;
        sprkwj3.cfr_renamed_91 = new sprqwk();
        sprkwj3.cfr_renamed_3 = "DSTU4145";
        sprkwj2.cfr_renamed_4 = null;
        sprkwj2.cfr_renamed_0 = false;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_0) {
            throw new IllegalStateException(spryez.cfr_renamed_9("Pn@h4vqD4muTf\u001dSXzXf\\`Rf\u001dzR`\u001d}S}I}\\xTgXp"));
        }
        sprsil sprsil2 = this.cfr_renamed_91.cfr_renamed_1223();
        sprnzk sprnzk2 = (sprnzk)sprsil2.cfr_renamed_1224();
        sprzuk sprzuk2 = (sprzuk)sprsil2.cfr_renamed_1225();
        if (this.cfr_renamed_1 instanceof sprrxh) {
            sprrxh sprrxh2 = (sprrxh)this.cfr_renamed_1;
            sprctj sprctj2 = new sprctj(this.cfr_renamed_3, sprnzk2, sprrxh2);
            return new KeyPair(sprctj2, new sprqbk(this.cfr_renamed_3, sprzuk2, sprctj2, sprrxh2));
        }
        if (this.cfr_renamed_1 == null) {
            return new KeyPair(new sprctj(this.cfr_renamed_3, sprnzk2), new sprqbk(this.cfr_renamed_3, sprzuk2));
        }
        ECParameterSpec eCParameterSpec = (ECParameterSpec)this.cfr_renamed_1;
        sprctj sprctj3 = new sprctj(this.cfr_renamed_3, sprnzk2, eCParameterSpec);
        return new KeyPair(sprctj3, new sprqbk(this.cfr_renamed_3, sprzuk2, sprctj3, eCParameterSpec));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (arg0 instanceof sprrxh) {
            sprrxh sprrxh2 = (sprrxh)arg0;
            this.cfr_renamed_1 = arg0;
            sprkwj sprkwj2 = this;
            this.cfr_renamed_2 = new sprftk(new sprqxk(sprrxh2.cfr_renamed_1769(), sprrxh2.cfr_renamed_1145(), sprrxh2.cfr_renamed_1146(), sprrxh2.cfr_renamed_1153()), arg1);
            this.cfr_renamed_91.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_0 = true;
            return;
        }
        if (arg0 instanceof ECParameterSpec) {
            sprkwj sprkwj3;
            ECParameterSpec eCParameterSpec = (ECParameterSpec)arg0;
            this.cfr_renamed_1 = arg0;
            sprgxh sprgxh2 = sprnlj.cfr_renamed_2323(eCParameterSpec.getCurve());
            ECParameterSpec eCParameterSpec2 = eCParameterSpec;
            spreuh spreuh2 = sprnlj.cfr_renamed_9154(sprgxh2, eCParameterSpec2.getGenerator());
            if (eCParameterSpec2 instanceof sprkki) {
                sprkki sprkki2 = (sprkki)eCParameterSpec;
                sprkwj3 = this;
                this.cfr_renamed_2 = new sprftk(new sprzsk(new sprqxk(sprgxh2, spreuh2, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), sprkki2.cfr_renamed_2510()), arg1);
            } else {
                sprkwj3 = this;
                this.cfr_renamed_2 = new sprftk(new sprqxk(sprgxh2, spreuh2, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), arg1);
            }
            sprkwj3.cfr_renamed_91.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_0 = true;
            return;
        }
        if (arg0 instanceof ECGenParameterSpec || arg0 instanceof sprwvh) {
            AlgorithmParameterSpec algorithmParameterSpec = arg0;
            String string = arg0 instanceof ECGenParameterSpec ? ((ECGenParameterSpec)algorithmParameterSpec).getName() : ((sprwvh)algorithmParameterSpec).cfr_renamed_313();
            sprqxk sprqxk2 = sprwim.cfr_renamed_7994(new sprlem(string));
            if (sprqxk2 == null) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprloia.cfr_renamed_9(">i i$p%'(r9q.'%f&bq'")).append(string).toString());
            }
            this.cfr_renamed_1 = new sprxvh(string, sprqxk2.cfr_renamed_1769(), sprqxk2.cfr_renamed_1145(), sprqxk2.cfr_renamed_1146(), sprqxk2.cfr_renamed_1153(), sprqxk2.cfr_renamed_2113());
            ECParameterSpec eCParameterSpec = (ECParameterSpec)this.cfr_renamed_1;
            sprgxh sprgxh3 = sprnlj.cfr_renamed_2323(eCParameterSpec.getCurve());
            spreuh spreuh3 = sprnlj.cfr_renamed_9154(sprgxh3, eCParameterSpec.getGenerator());
            this.cfr_renamed_2 = new sprftk(new sprqxk(sprgxh3, spreuh3, eCParameterSpec.getOrder(), BigInteger.valueOf(eCParameterSpec.getCofactor())), arg1);
            this.cfr_renamed_91.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_0 = true;
            return;
        }
        if (arg0 == null && sprsci.cfr_renamed_105.cfr_renamed_2312() != null) {
            sprrxh sprrxh3 = sprsci.cfr_renamed_105.cfr_renamed_2312();
            this.cfr_renamed_1 = arg0;
            this.cfr_renamed_2 = new sprftk(new sprqxk(sprrxh3.cfr_renamed_1769(), sprrxh3.cfr_renamed_1145(), sprrxh3.cfr_renamed_1146(), sprrxh3.cfr_renamed_1153()), arg1);
            this.cfr_renamed_91.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_0 = true;
            return;
        }
        if (arg0 == null && sprsci.cfr_renamed_105.cfr_renamed_2312() == null) {
            throw new InvalidAlgorithmParameterException(spryez.cfr_renamed_9("zHxQ4MuOuPqIqO4MuNgXp\u001dvH`\u001dzR4TyMxTwT`~U\u001dgX`"));
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprloia.cfr_renamed_9(";f9f&b?b9'$e!b(ski$skfkB\bW*u*j.s.u\u0018w.dq'")).append(arg0.getClass().getName()).toString());
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        this.cfr_renamed_4 = arg1;
        if (this.cfr_renamed_1 == null) {
            throw new InvalidParameterException(sprloia.cfr_renamed_9("r%l%h<ikl.~kt\"}.)"));
        }
        try {
            sprkwj sprkwj2 = this;
            sprkwj2.initialize((ECGenParameterSpec)sprkwj2.cfr_renamed_1, arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            throw new InvalidParameterException(spryez.cfr_renamed_9("VqD4N}Gq\u001dzR`\u001dwRz[}ZaOu_xX:"));
        }
    }
}

