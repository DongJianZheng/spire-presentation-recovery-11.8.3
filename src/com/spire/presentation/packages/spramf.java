/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfg;
import com.spire.presentation.packages.sprcqg;
import com.spire.presentation.packages.sprehf;
import com.spire.presentation.packages.sprejf;
import com.spire.presentation.packages.sprfhg;
import com.spire.presentation.packages.sprjuaa;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnkg;
import com.spire.presentation.packages.sprolg;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.spruof;
import com.spire.presentation.packages.sprxlh;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class spramf
extends KeyPairGenerator {
    public sprnkg cfr_renamed_0;
    public SecureRandom cfr_renamed_1;
    public boolean cfr_renamed_2;
    public sprolg cfr_renamed_3;
    private static Map cfr_renamed_4 = new HashMap();

    public spramf() {
        spramf spramf2 = this;
        super(sprxlh.cfr_renamed_9("/*/\""));
        spramf spramf3 = this;
        spramf2.cfr_renamed_3 = new sprolg();
        spramf2.cfr_renamed_1 = sprybl.cfr_renamed_2794();
        spramf2.cfr_renamed_2 = false;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = spramf.cfr_renamed_5681(arg0);
        if (string != null) {
            spramf spramf2 = this;
            spramf2.cfr_renamed_0 = new sprnkg(arg1, (sprcqg)cfr_renamed_4.get(string));
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_0);
            this.cfr_renamed_2 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprjuaa.cfr_renamed_9("+\u001d4\u0012.\u001a&S\u0012\u00120\u0012/\u00166\u00160 2\u0016!Ib")).append(arg0).toString());
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprehf) {
            return ((sprehf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    static {
        cfr_renamed_4.put(sprehf.cfr_renamed_0.cfr_renamed_313(), sprcqg.cfr_renamed_79);
        cfr_renamed_4.put(sprehf.cfr_renamed_152.cfr_renamed_313(), sprcqg.cfr_renamed_93);
        cfr_renamed_4.put(sprehf.cfr_renamed_2.cfr_renamed_313(), sprcqg.cfr_renamed_4);
        cfr_renamed_4.put(sprehf.cfr_renamed_91.cfr_renamed_313(), sprcqg.cfr_renamed_2);
        cfr_renamed_4.put(sprehf.cfr_renamed_3.cfr_renamed_313(), sprcqg.cfr_renamed_272);
        cfr_renamed_4.put(sprehf.cfr_renamed_86.cfr_renamed_313(), sprcqg.cfr_renamed_132);
        cfr_renamed_4.put(sprehf.cfr_renamed_4.cfr_renamed_313(), sprcqg.cfr_renamed_0);
        cfr_renamed_4.put(sprehf.cfr_renamed_1.cfr_renamed_313(), sprcqg.cfr_renamed_102);
        cfr_renamed_4.put(sprehf.cfr_renamed_93.cfr_renamed_313(), sprcqg.cfr_renamed_31);
        cfr_renamed_4.put(sprehf.cfr_renamed_119.cfr_renamed_313(), sprcqg.cfr_renamed_86);
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_2) {
            spramf spramf2 = this;
            this.cfr_renamed_0 = new sprnkg(this.cfr_renamed_1, sprcqg.cfr_renamed_86);
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_0);
            this.cfr_renamed_2 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_3.cfr_renamed_1223();
        sprcfg sprcfg2 = (sprcfg)sprsil2.cfr_renamed_1224();
        sprfhg sprfhg2 = (sprfhg)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprejf(sprcfg2), new spruof(sprfhg2));
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprxlh.cfr_renamed_9("\u0019\u0014\tG-\u000b\u000b\b\u001e\u000e\u0018\u000f\u00017\r\u0015\r\n\t\u0013\t\u0015?\u0017\t\u0004"));
    }
}

