/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralf;
import com.spire.presentation.packages.sprgff;
import com.spire.presentation.packages.sprhff;
import com.spire.presentation.packages.sprjif;
import com.spire.presentation.packages.sprjvo;
import com.spire.presentation.packages.sprmxe;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvaf;
import com.spire.presentation.packages.sprxhf;
import com.spire.presentation.packages.sprxxe;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprbof
extends KeyPairGenerator {
    public sprvaf cfr_renamed_4;

    public sprbof() {
        super(sprjvo.cfr_renamed_9("\u0000\u000b\b\u0004$\r.\r"));
    }

    @Override
    public KeyPair generateKeyPair() {
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprhff sprhff2 = (sprhff)sprsil2.cfr_renamed_1225();
        sprxxe sprxxe2 = (sprxxe)sprsil2.cfr_renamed_1224();
        return new KeyPair(new sprjif(sprxxe2), new spralf(sprhff2));
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        void arg1;
        sprbof sprbof2 = this;
        sprbof2.cfr_renamed_4 = new sprvaf();
        sprmxe sprmxe2 = (sprmxe)algorithmParameterSpec;
        sprgff sprgff2 = new sprgff((SecureRandom)arg1, new sprxhf(sprmxe2.cfr_renamed_1186(), sprmxe2.cfr_renamed_1144()));
        this.cfr_renamed_4.cfr_renamed_5536(sprgff2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        sprmxe sprmxe2 = new sprmxe();
        try {
            this.initialize(sprmxe2, arg1);
            return;
        }
        catch (InvalidAlgorithmParameterException invalidAlgorithmParameterException) {
            return;
        }
    }
}

