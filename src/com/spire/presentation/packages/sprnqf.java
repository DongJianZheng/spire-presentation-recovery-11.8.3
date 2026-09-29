/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcdg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlmf;
import com.spire.presentation.packages.sprmlf;
import com.spire.presentation.packages.sprnxf;
import com.spire.presentation.packages.sprpbf;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprquba;
import com.spire.presentation.packages.sprrica;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtvf;
import com.spire.presentation.packages.sprwvf;
import com.spire.presentation.packages.sprybg;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprnqf
extends KeyPairGenerator {
    private static Map cfr_renamed_0 = new HashMap();
    public boolean cfr_renamed_1;
    public SecureRandom cfr_renamed_2;
    public sprwvf cfr_renamed_3;
    public sprcdg cfr_renamed_4;

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprpbf) {
            return ((sprpbf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprnqf.cfr_renamed_5681(arg0);
        if (string != null) {
            sprnqf sprnqf2 = this;
            sprnqf2.cfr_renamed_3 = new sprwvf(arg1, (sprnxf)cfr_renamed_0.get(string));
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_1 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprquba.cfr_renamed_9("\u0003V\u001cY\u0006Q\u000e\u0018:Y\u0018Y\u0007]\u001e]\u0018k\u001a]\t\u0002J")).append(arg0).toString());
    }

    static {
        cfr_renamed_0.put(sprpbf.cfr_renamed_132.cfr_renamed_313(), sprnxf.cfr_renamed_91);
        cfr_renamed_0.put(sprpbf.cfr_renamed_2.cfr_renamed_313(), sprnxf.cfr_renamed_93);
        cfr_renamed_0.put(sprpbf.cfr_renamed_3.cfr_renamed_313(), sprnxf.cfr_renamed_112);
        cfr_renamed_0.put(sprpbf.cfr_renamed_119.cfr_renamed_313(), sprnxf.cfr_renamed_132);
        cfr_renamed_0.put(sprpbf.cfr_renamed_152.cfr_renamed_313(), sprnxf.cfr_renamed_86);
        cfr_renamed_0.put(sprpbf.cfr_renamed_86.cfr_renamed_313(), sprnxf.cfr_renamed_4);
        cfr_renamed_0.put(sprpbf.cfr_renamed_112.cfr_renamed_313(), sprnxf.cfr_renamed_0);
        cfr_renamed_0.put(sprpbf.cfr_renamed_107.cfr_renamed_313(), sprnxf.cfr_renamed_1);
        cfr_renamed_0.put(sprpbf.cfr_renamed_4.cfr_renamed_313(), sprnxf.cfr_renamed_107);
        cfr_renamed_0.put(sprpbf.cfr_renamed_102.cfr_renamed_313(), sprnxf.cfr_renamed_102);
        cfr_renamed_0.put(sprpbf.cfr_renamed_93.cfr_renamed_313(), sprnxf.cfr_renamed_2);
        cfr_renamed_0.put(sprpbf.cfr_renamed_0.cfr_renamed_313(), sprnxf.cfr_renamed_3);
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_1) {
            sprnqf sprnqf2 = this;
            this.cfr_renamed_3 = new sprwvf(this.cfr_renamed_2, sprnxf.cfr_renamed_132);
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_1 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprtvf sprtvf2 = (sprtvf)sprsil2.cfr_renamed_1224();
        sprybg sprybg2 = (sprybg)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprmlf(sprtvf2), new sprlmf(sprybg2));
    }

    public sprnqf() {
        sprnqf sprnqf2 = this;
        super(sprrica.cfr_renamed_9("\rK>L4A"));
        sprnqf sprnqf3 = this;
        sprnqf2.cfr_renamed_4 = new sprcdg();
        sprnqf2.cfr_renamed_2 = sprybl.cfr_renamed_2794();
        sprnqf2.cfr_renamed_1 = false;
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprquba.cfr_renamed_9("M\u0019]Jy\u0006_\u0005J\u0003L\u0002U:Y\u0018Y\u0007]\u001e]\u0018k\u001a]\t"));
    }
}

