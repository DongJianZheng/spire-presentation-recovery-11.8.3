/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdf;
import com.spire.presentation.packages.sprheg;
import com.spire.presentation.packages.sprhrf;
import com.spire.presentation.packages.sprhvf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnlf;
import com.spire.presentation.packages.sprpvf;
import com.spire.presentation.packages.sprpwf;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.spruff;
import com.spire.presentation.packages.sprxxf;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprydf;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class spreif
extends KeyPairGenerator {
    public sprheg cfr_renamed_0;
    private static Map cfr_renamed_1 = new HashMap();
    public boolean cfr_renamed_2;
    public sprpvf cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    static {
        cfr_renamed_1.put(spruff.cfr_renamed_0.cfr_renamed_313(), sprhvf.cfr_renamed_114);
        cfr_renamed_1.put(spruff.cfr_renamed_4.cfr_renamed_313(), sprhvf.cfr_renamed_2);
        cfr_renamed_1.put(spruff.cfr_renamed_119.cfr_renamed_313(), sprhvf.cfr_renamed_112);
        cfr_renamed_1.put(spruff.cfr_renamed_3.cfr_renamed_313(), sprhvf.cfr_renamed_152);
        cfr_renamed_1.put(spruff.cfr_renamed_91.cfr_renamed_313(), sprhvf.cfr_renamed_86);
        cfr_renamed_1.put(spruff.cfr_renamed_1.cfr_renamed_313(), sprhvf.cfr_renamed_96);
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = spreif.cfr_renamed_5681(arg0);
        if (string != null) {
            spreif spreif2 = this;
            spreif2.cfr_renamed_3 = new sprpvf(arg1, (sprhvf)cfr_renamed_1.get(string));
            this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_2 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprfdf.cfr_renamed_9(":L%C?K7\u0002\u0003C!C>G'G!q#G0\u0018s")).append(arg0).toString());
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprydf.cfr_renamed_9("5{%(\u0001d'g2a4`-X!z!e%|%z\u0013x%k"));
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof spruff) {
            return ((spruff)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_2) {
            spreif spreif2 = this;
            this.cfr_renamed_3 = new sprpvf(this.cfr_renamed_4, sprhvf.cfr_renamed_152);
            this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_2 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_0.cfr_renamed_1223();
        sprpwf sprpwf2 = (sprpwf)sprsil2.cfr_renamed_1224();
        sprxxf sprxxf2 = (sprxxf)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprhrf(sprpwf2), new sprnlf(sprxxf2));
    }

    public spreif() {
        spreif spreif2 = this;
        super(sprfdf.cfr_renamed_9("l\u0007p\u0006n\u0003p:O6"));
        spreif spreif3 = this;
        spreif2.cfr_renamed_0 = new sprheg();
        spreif2.cfr_renamed_4 = sprybl.cfr_renamed_2794();
        spreif2.cfr_renamed_2 = false;
    }
}

