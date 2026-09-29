/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfke;
import com.spire.presentation.packages.sprflg;
import com.spire.presentation.packages.sprgog;
import com.spire.presentation.packages.sprhtf;
import com.spire.presentation.packages.sprjgg;
import com.spire.presentation.packages.sprjjf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprpkg;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwig;
import com.spire.presentation.packages.sprwwe;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprtqf
extends KeyPairGenerator {
    public SecureRandom cfr_renamed_0;
    public sprgog cfr_renamed_1;
    private static Map cfr_renamed_2 = new HashMap();
    public boolean cfr_renamed_3;
    public sprflg cfr_renamed_4;

    static {
        cfr_renamed_2.put(sprfke.cfr_renamed_9(")S _z\bs"), sprjgg.cfr_renamed_4);
        cfr_renamed_2.put(sprrgo.cfr_renamed_9("UO\\C\u0006\u001f\u0005"), sprjgg.cfr_renamed_1);
        cfr_renamed_2.put(sprfke.cfr_renamed_9(")S _y\u000f}"), sprjgg.cfr_renamed_112);
        cfr_renamed_2.put(sprwwe.cfr_renamed_3.cfr_renamed_313(), sprjgg.cfr_renamed_4);
        cfr_renamed_2.put(sprwwe.cfr_renamed_2.cfr_renamed_313(), sprjgg.cfr_renamed_1);
        cfr_renamed_2.put(sprwwe.cfr_renamed_0.cfr_renamed_313(), sprjgg.cfr_renamed_112);
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprrgo.cfr_renamed_9("SDC\u0017g[AXT^R_KgGEGZCCCEuGCT"));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_3) {
            sprtqf sprtqf2 = this;
            this.cfr_renamed_1 = new sprgog(this.cfr_renamed_0, sprjgg.cfr_renamed_4);
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_1);
            this.cfr_renamed_3 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprwig sprwig2 = (sprwig)sprsil2.cfr_renamed_1224();
        sprpkg sprpkg2 = (sprpkg)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprhtf(sprwig2), new sprjjf(sprpkg2));
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprwwe) {
            return ((sprwwe)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprtqf.cfr_renamed_5681(arg0);
        if (string != null) {
            sprtqf sprtqf2 = this;
            sprtqf2.cfr_renamed_1 = new sprgog(arg1, (sprjgg)cfr_renamed_2.get(string));
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_1);
            this.cfr_renamed_3 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprfke.cfr_renamed_9("\"T=['S/\u001a\u001b[9[&_?_9i;_(\u0000k")).append(arg0).toString());
    }

    public sprtqf() {
        sprtqf sprtqf2 = this;
        super(sprrgo.cfr_renamed_9("d~mr"));
        sprtqf sprtqf3 = this;
        sprtqf2.cfr_renamed_4 = new sprflg();
        sprtqf2.cfr_renamed_0 = sprybl.cfr_renamed_2794();
        sprtqf2.cfr_renamed_3 = false;
    }
}

