/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcvf;
import com.spire.presentation.packages.sprgef;
import com.spire.presentation.packages.sprjzf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlny;
import com.spire.presentation.packages.sprobg;
import com.spire.presentation.packages.sprovf;
import com.spire.presentation.packages.sprpdf;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprxff;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryxf;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprrwe
extends KeyPairGenerator {
    private static Map cfr_renamed_0 = new HashMap();
    public sprobg cfr_renamed_1;
    public spryxf cfr_renamed_2;
    public boolean cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprraja.cfr_renamed_9("$]4\u000e\u0010B6A#G%F<~0\\0C4Z4\\\u0002^4M"));
    }

    public sprrwe() {
        sprrwe sprrwe2 = this;
        super(sprlny.cfr_renamed_9("\u0013?\b&\u000e,\u0013D"));
        sprrwe sprrwe3 = this;
        sprrwe2.cfr_renamed_1 = new sprobg();
        sprrwe2.cfr_renamed_4 = sprybl.cfr_renamed_2794();
        sprrwe2.cfr_renamed_3 = false;
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprgef) {
            return ((sprgef)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_3) {
            sprrwe sprrwe2 = this;
            this.cfr_renamed_2 = new spryxf(this.cfr_renamed_4, sprovf.cfr_renamed_132);
            this.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_3 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_1.cfr_renamed_1223();
        sprjzf sprjzf2 = (sprjzf)sprsil2.cfr_renamed_1224();
        sprcvf sprcvf2 = (sprcvf)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprpdf(sprjzf2), new sprxff(sprcvf2));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprrwe.cfr_renamed_5681(arg0);
        if (string != null) {
            sprrwe sprrwe2 = this;
            sprrwe2.cfr_renamed_2 = new spryxf(arg1, (sprovf)cfr_renamed_0.get(string));
            this.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_3 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprraja.cfr_renamed_9("G?X0B8Jq~0\\0C4Z4\\\u0002^4Mk\u000e")).append(arg0).toString());
    }

    static {
        cfr_renamed_0.put(sprgef.cfr_renamed_2.cfr_renamed_313(), sprovf.cfr_renamed_86);
        cfr_renamed_0.put(sprgef.cfr_renamed_724.cfr_renamed_313(), sprovf.cfr_renamed_88);
        cfr_renamed_0.put(sprgef.cfr_renamed_31.cfr_renamed_313(), sprovf.cfr_renamed_31);
        cfr_renamed_0.put(sprgef.cfr_renamed_132.cfr_renamed_313(), sprovf.cfr_renamed_79);
        cfr_renamed_0.put(sprgef.cfr_renamed_957.cfr_renamed_313(), sprovf.cfr_renamed_3);
        cfr_renamed_0.put(sprgef.cfr_renamed_79.cfr_renamed_313(), sprovf.cfr_renamed_132);
        cfr_renamed_0.put(sprgef.cfr_renamed_91.cfr_renamed_313(), sprovf.cfr_renamed_4);
        cfr_renamed_0.put(sprgef.cfr_renamed_0.cfr_renamed_313(), sprovf.cfr_renamed_724);
        cfr_renamed_0.put(sprgef.cfr_renamed_1226.cfr_renamed_313(), sprovf.cfr_renamed_119);
        cfr_renamed_0.put(sprgef.cfr_renamed_723.cfr_renamed_313(), sprovf.cfr_renamed_272);
        cfr_renamed_0.put(sprgef.cfr_renamed_951.cfr_renamed_313(), sprovf.cfr_renamed_0);
        cfr_renamed_0.put(sprgef.cfr_renamed_4.cfr_renamed_313(), sprovf.cfr_renamed_82);
        cfr_renamed_0.put(sprgef.cfr_renamed_86.cfr_renamed_313(), sprovf.cfr_renamed_126);
        cfr_renamed_0.put(sprgef.cfr_renamed_145.cfr_renamed_313(), sprovf.cfr_renamed_953);
        cfr_renamed_0.put(sprgef.cfr_renamed_272.cfr_renamed_313(), sprovf.cfr_renamed_728);
        cfr_renamed_0.put(sprgef.cfr_renamed_84.cfr_renamed_313(), sprovf.spr\ufe34);
        cfr_renamed_0.put(sprgef.cfr_renamed_1.cfr_renamed_313(), sprovf.cfr_renamed_93);
        cfr_renamed_0.put(sprgef.cfr_renamed_105.cfr_renamed_313(), sprovf.cfr_renamed_137);
        cfr_renamed_0.put(sprgef.cfr_renamed_128.cfr_renamed_313(), sprovf.cfr_renamed_185);
        cfr_renamed_0.put(sprgef.cfr_renamed_112.cfr_renamed_313(), sprovf.cfr_renamed_2);
        cfr_renamed_0.put(sprgef.cfr_renamed_93.cfr_renamed_313(), sprovf.cfr_renamed_314);
        cfr_renamed_0.put(sprgef.cfr_renamed_119.cfr_renamed_313(), sprovf.cfr_renamed_105);
        cfr_renamed_0.put(sprgef.cfr_renamed_102.cfr_renamed_313(), sprovf.cfr_renamed_957);
        cfr_renamed_0.put(sprgef.cfr_renamed_114.cfr_renamed_313(), sprovf.cfr_renamed_952);
        cfr_renamed_0.put(sprgef.cfr_renamed_3.cfr_renamed_313(), sprovf.cfr_renamed_114);
        cfr_renamed_0.put(sprgef.cfr_renamed_137.cfr_renamed_313(), sprovf.cfr_renamed_1);
        cfr_renamed_0.put(sprgef.cfr_renamed_88.cfr_renamed_313(), sprovf.cfr_renamed_112);
        cfr_renamed_0.put(sprgef.cfr_renamed_152.cfr_renamed_313(), sprovf.cfr_renamed_133);
        cfr_renamed_0.put(sprgef.cfr_renamed_287.cfr_renamed_313(), sprovf.cfr_renamed_107);
        cfr_renamed_0.put(sprgef.cfr_renamed_82.cfr_renamed_313(), sprovf.cfr_renamed_287);
        cfr_renamed_0.put(sprgef.spr\ufe34.cfr_renamed_313(), sprovf.cfr_renamed_102);
        cfr_renamed_0.put(sprgef.cfr_renamed_126.cfr_renamed_313(), sprovf.cfr_renamed_1226);
        cfr_renamed_0.put(sprgef.cfr_renamed_185.cfr_renamed_313(), sprovf.cfr_renamed_152);
        cfr_renamed_0.put(sprgef.cfr_renamed_314.cfr_renamed_313(), sprovf.cfr_renamed_145);
        cfr_renamed_0.put(sprgef.cfr_renamed_96.cfr_renamed_313(), sprovf.cfr_renamed_128);
        cfr_renamed_0.put(sprgef.cfr_renamed_953.cfr_renamed_313(), sprovf.cfr_renamed_951);
    }
}

