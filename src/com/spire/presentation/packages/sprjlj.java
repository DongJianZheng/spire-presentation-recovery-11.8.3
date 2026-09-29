/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprarj;
import com.spire.presentation.packages.sprask;
import com.spire.presentation.packages.sprhxk;
import com.spire.presentation.packages.sprinj;
import com.spire.presentation.packages.spriyk;
import com.spire.presentation.packages.sprlui;
import com.spire.presentation.packages.sprmsh;
import com.spire.presentation.packages.sprmtk;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvnj;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryxh;
import com.spire.presentation.packages.sprzrk;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprjlj
extends KeyPairGenerator {
    public SecureRandom cfr_renamed_91;
    public spryxh cfr_renamed_0;
    public int cfr_renamed_1;
    public sprhxk cfr_renamed_2;
    public boolean cfr_renamed_3;
    public sprask cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        sprjlj sprjlj2 = this;
        sprjlj2.cfr_renamed_1 = arg0;
        sprjlj2.cfr_renamed_91 = secureRandom;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof spryxh)) {
            throw new InvalidAlgorithmParameterException(sprlui.cfr_renamed_9("\u001c>\u001e>\u0001:\u0018:\u001e\u007f\u0003=\u0006:\u000f+L1\u0003+L>L\u0018#\f8lXn\\\u000f\r-\r2\t+\t-?/\t<"));
        }
        this.cfr_renamed_9408((spryxh)arg0, arg1);
    }

    public sprjlj() {
        sprjlj sprjlj2 = this;
        super(sprvnj.cfr_renamed_9("Oc[x;\u00189\u001c"));
        sprjlj sprjlj3 = this;
        this.cfr_renamed_4 = new sprask();
        this.cfr_renamed_1 = 1024;
        sprjlj2.cfr_renamed_91 = null;
        sprjlj2.cfr_renamed_3 = false;
    }

    private /* synthetic */ void cfr_renamed_9408(spryxh arg0, SecureRandom arg1) {
        sprmsh sprmsh2 = arg0.cfr_renamed_130();
        sprjlj sprjlj2 = this;
        this.cfr_renamed_2 = new sprhxk(arg1, new spriyk(sprmsh2.cfr_renamed_1155(), sprmsh2.cfr_renamed_1604(), sprmsh2.cfr_renamed_1778()));
        this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_2);
        sprjlj2.cfr_renamed_3 = true;
        sprjlj2.cfr_renamed_0 = arg0;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_3) {
            this.cfr_renamed_9408(new spryxh(sprqo.cfr_renamed_2.cfr_renamed_19()), sprybl.cfr_renamed_2794());
        }
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprmtk sprmtk2 = (sprmtk)sprsil2.cfr_renamed_1224();
        sprzrk sprzrk2 = (sprzrk)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprinj(sprmtk2, this.cfr_renamed_0), new sprarj(sprzrk2, this.cfr_renamed_0));
    }
}

