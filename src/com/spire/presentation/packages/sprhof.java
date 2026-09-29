/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbpf;
import com.spire.presentation.packages.sprdyf;
import com.spire.presentation.packages.sprhbg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmbf;
import com.spire.presentation.packages.sprmuf;
import com.spire.presentation.packages.sprpjz;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvzaa;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryeg;
import com.spire.presentation.packages.sprzsf;
import com.spire.presentation.packages.sprzxf;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprhof
extends KeyPairGenerator {
    private static Map cfr_renamed_0 = new HashMap();
    public sprzxf cfr_renamed_1;
    public SecureRandom cfr_renamed_2;
    public sprdyf cfr_renamed_3;
    public boolean cfr_renamed_4;

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprmbf) {
            return ((sprmbf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_4) {
            sprhof sprhof2 = this;
            this.cfr_renamed_3 = new sprdyf(this.cfr_renamed_2, spryeg.cfr_renamed_107);
            this.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_4 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_1.cfr_renamed_1223();
        sprhbg sprhbg2 = (sprhbg)sprsil2.cfr_renamed_1224();
        sprmuf sprmuf2 = (sprmuf)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprzsf(sprhbg2), new sprbpf(sprmuf2));
    }

    public sprhof() {
        sprhof sprhof2 = this;
        super(sprpjz.cfr_renamed_9("+x,d-f\n_\u0015S"));
        sprhof sprhof3 = this;
        sprhof2.cfr_renamed_1 = new sprzxf();
        sprhof2.cfr_renamed_2 = sprybl.cfr_renamed_2794();
        sprhof2.cfr_renamed_4 = false;
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprvzaa.cfr_renamed_9("oF\u007f\u0015[Y}Zh\\n]we{G{X\u007fA\u007fGIE\u007fV"));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprhof.cfr_renamed_5681(arg0);
        if (string != null) {
            sprhof sprhof2 = this;
            sprhof2.cfr_renamed_3 = new sprdyf(arg1, (spryeg)cfr_renamed_0.get(string));
            this.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_4 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprpjz.cfr_renamed_9("_\u0016@\u0019Z\u0011RXf\u0019D\u0019[\u001dB\u001dD+F\u001dUB\u0016")).append(arg0).toString());
    }

    static {
        cfr_renamed_0.put(sprmbf.cfr_renamed_2.cfr_renamed_313(), spryeg.cfr_renamed_86);
        cfr_renamed_0.put(sprmbf.cfr_renamed_1.cfr_renamed_313(), spryeg.cfr_renamed_152);
        cfr_renamed_0.put(sprmbf.cfr_renamed_4.cfr_renamed_313(), spryeg.cfr_renamed_4);
        cfr_renamed_0.put(sprmbf.cfr_renamed_0.cfr_renamed_313(), spryeg.cfr_renamed_107);
        cfr_renamed_0.put(sprmbf.cfr_renamed_112.cfr_renamed_313(), spryeg.cfr_renamed_0);
        cfr_renamed_0.put(sprmbf.cfr_renamed_91.cfr_renamed_313(), spryeg.cfr_renamed_1);
    }
}

