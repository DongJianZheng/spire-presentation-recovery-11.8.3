/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbg;
import com.spire.presentation.packages.sprdbg;
import com.spire.presentation.packages.sprdwf;
import com.spire.presentation.packages.sprgeg;
import com.spire.presentation.packages.sprgoha;
import com.spire.presentation.packages.sprkif;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprpjf;
import com.spire.presentation.packages.sprpuf;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.spruxe;
import com.spire.presentation.packages.sprxrq;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class spruqf
extends KeyPairGenerator {
    public boolean cfr_renamed_91;
    private static Map cfr_renamed_0 = new HashMap();
    public sprdbg cfr_renamed_1;
    public sprgeg cfr_renamed_2;
    private final sprbbg cfr_renamed_3;
    public SecureRandom cfr_renamed_4;

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof spruxe) {
            return ((spruxe)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = spruqf.cfr_renamed_5681(arg0);
        if (string != null && cfr_renamed_0.containsKey(string)) {
            sprbbg sprbbg2 = (sprbbg)cfr_renamed_0.get(string);
            this.cfr_renamed_1 = new sprdbg(arg1, sprbbg2);
            if (this.cfr_renamed_3 != null && !sprbbg2.cfr_renamed_313().equals(this.cfr_renamed_3.cfr_renamed_313())) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprxrq.cfr_renamed_9("%R7\u0017>V'EnP+Y+E/C!En[!T%R*\u0017:Xn")).append(sprkoe.cfr_renamed_116(this.cfr_renamed_3.cfr_renamed_313())).toString());
            }
            spruqf spruqf2 = this;
            spruqf2.cfr_renamed_2.cfr_renamed_5536(spruqf2.cfr_renamed_1);
            this.cfr_renamed_91 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprgoha.cfr_renamed_9("G\u000fX\u0000B\bJA~\u0000\\\u0000C\u0004Z\u0004\\2^\u0004M[\u000e")).append(arg0).toString());
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprxrq.cfr_renamed_9("B=Rnv\"P!E'C&Z\u001eV<V#R:R<d>R-"));
    }

    public spruqf() {
        spruqf spruqf2 = this;
        super(sprgoha.cfr_renamed_9("'o-m.`"));
        spruqf spruqf3 = this;
        this.cfr_renamed_2 = new sprgeg();
        spruqf3.cfr_renamed_4 = sprybl.cfr_renamed_2794();
        spruqf2.cfr_renamed_91 = false;
        spruqf2.cfr_renamed_3 = null;
    }

    static {
        cfr_renamed_0.put(spruxe.cfr_renamed_1.cfr_renamed_313(), sprbbg.cfr_renamed_0);
        cfr_renamed_0.put(spruxe.cfr_renamed_2.cfr_renamed_313(), sprbbg.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public spruqf(sprbbg sprbbg2) {
        void arg0;
        spruqf spruqf2 = this;
        super(arg0.cfr_renamed_313());
        spruqf spruqf3 = this;
        this.cfr_renamed_2 = new sprgeg();
        spruqf3.cfr_renamed_4 = sprybl.cfr_renamed_2794();
        spruqf2.cfr_renamed_91 = false;
        spruqf2.cfr_renamed_3 = sprbbg2;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_91) {
            spruqf spruqf2;
            if (this.cfr_renamed_3 != null) {
                spruqf2 = this;
                spruqf spruqf3 = this;
                this.cfr_renamed_1 = new sprdbg(spruqf3.cfr_renamed_4, spruqf3.cfr_renamed_3);
            } else {
                spruqf2 = this;
                this.cfr_renamed_1 = new sprdbg(this.cfr_renamed_4, sprbbg.cfr_renamed_0);
            }
            spruqf2.cfr_renamed_2.cfr_renamed_5536(this.cfr_renamed_1);
            this.cfr_renamed_91 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_2.cfr_renamed_1223();
        sprpuf sprpuf2 = (sprpuf)sprsil2.cfr_renamed_1224();
        sprdwf sprdwf2 = (sprdwf)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprkif(sprpuf2), new sprpjf(sprdwf2));
    }
}

