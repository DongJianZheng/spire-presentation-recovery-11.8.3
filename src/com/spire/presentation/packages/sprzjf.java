/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccf;
import com.spire.presentation.packages.sprczf;
import com.spire.presentation.packages.sprgrf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprnag;
import com.spire.presentation.packages.sprnbg;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprqmk;
import com.spire.presentation.packages.sprsdg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprukf;
import com.spire.presentation.packages.sprvuf;
import com.spire.presentation.packages.sprxmf;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprzjf
extends KeyPairGenerator {
    public sprnbg cfr_renamed_0;
    public boolean cfr_renamed_1;
    private static Map cfr_renamed_2 = new HashMap();
    public SecureRandom cfr_renamed_3;
    public sprnag cfr_renamed_4;

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_1) {
            sprzjf sprzjf2 = this;
            this.cfr_renamed_4 = new sprnag(this.cfr_renamed_3, sprvuf.cfr_renamed_1);
            this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_4);
            this.cfr_renamed_1 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_0.cfr_renamed_1223();
        sprsdg sprsdg2 = (sprsdg)sprsil2.cfr_renamed_1224();
        sprczf sprczf2 = (sprczf)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprgrf(sprsdg2), new sprukf(sprczf2));
    }

    static {
        cfr_renamed_2.put(sprccf.cfr_renamed_2.cfr_renamed_313(), sprvuf.cfr_renamed_1);
        cfr_renamed_2.put(sprccf.cfr_renamed_4.cfr_renamed_313(), sprvuf.cfr_renamed_0);
        cfr_renamed_2.put(sprccf.cfr_renamed_0.cfr_renamed_313(), sprvuf.cfr_renamed_91);
        cfr_renamed_2.put(sprccf.cfr_renamed_1.cfr_renamed_313(), sprvuf.cfr_renamed_4);
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprxmf.cfr_renamed_9("xfh5Lyjz\u007f|y}`Elglxhahg^ehv"));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprzjf.cfr_renamed_5681(arg0);
        if (string != null) {
            sprzjf sprzjf2 = this;
            sprzjf2.cfr_renamed_4 = new sprnag(arg1, (sprvuf)cfr_renamed_2.get(string));
            this.cfr_renamed_0.cfr_renamed_5536(this.cfr_renamed_4);
            this.cfr_renamed_1 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprqmk.cfr_renamed_9("[ZDU^]V\u0014bU@U_QFQ@gBQQ\u000e\u0012")).append(arg0).toString());
    }

    public sprzjf() {
        sprzjf sprzjf2 = this;
        super(sprxmf.cfr_renamed_9("CA_@"));
        sprzjf sprzjf3 = this;
        sprzjf2.cfr_renamed_0 = new sprnbg();
        sprzjf2.cfr_renamed_3 = sprybl.cfr_renamed_2794();
        sprzjf2.cfr_renamed_1 = false;
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprccf) {
            return ((sprccf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }
}

