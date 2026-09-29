/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprayf;
import com.spire.presentation.packages.sprbmf;
import com.spire.presentation.packages.sprgvf;
import com.spire.presentation.packages.sprhzf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmhf;
import com.spire.presentation.packages.sprmzf;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtdg;
import com.spire.presentation.packages.sprttl;
import com.spire.presentation.packages.sprver;
import com.spire.presentation.packages.sprvlf;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprfqf
extends KeyPairGenerator {
    public boolean cfr_renamed_0;
    private static Map cfr_renamed_1 = new HashMap();
    public SecureRandom cfr_renamed_2;
    public sprhzf cfr_renamed_3;
    public sprayf cfr_renamed_4;

    public sprfqf() {
        sprfqf sprfqf2 = this;
        super(sprver.cfr_renamed_9("\u0016V?@?"));
        sprfqf sprfqf3 = this;
        sprfqf2.cfr_renamed_4 = new sprayf();
        sprfqf2.cfr_renamed_2 = sprybl.cfr_renamed_2794();
        sprfqf2.cfr_renamed_0 = false;
    }

    static {
        cfr_renamed_1.put(sprttl.cfr_renamed_9("aahwhxb~6*?+?a4"), sprgvf.cfr_renamed_2);
        cfr_renamed_1.put(sprver.cfr_renamed_9("B\"K4K;A=\u0015i\u001ch\u001c#L1O5Vc"), sprgvf.cfr_renamed_79);
        cfr_renamed_1.put(sprttl.cfr_renamed_9("aahwhxb~4\"5*1a4"), sprgvf.cfr_renamed_107);
        cfr_renamed_1.put(sprver.cfr_renamed_9("B\"K4K;A=\u0017a\u0016i\u0012#L1O5Vc"), sprgvf.cfr_renamed_132);
        cfr_renamed_1.put(sprttl.cfr_renamed_9("aahwhxb~3 7+?a4"), sprgvf.cfr_renamed_91);
        cfr_renamed_1.put(sprver.cfr_renamed_9("B\"K4K;A=\u0010c\u0014h\u001c#L1O5Vc"), sprgvf.cfr_renamed_152);
        cfr_renamed_1.put(sprmhf.cfr_renamed_3.cfr_renamed_313(), sprgvf.cfr_renamed_2);
        cfr_renamed_1.put(sprmhf.cfr_renamed_2.cfr_renamed_313(), sprgvf.cfr_renamed_79);
        cfr_renamed_1.put(sprmhf.cfr_renamed_119.cfr_renamed_313(), sprgvf.cfr_renamed_107);
        cfr_renamed_1.put(sprmhf.cfr_renamed_0.cfr_renamed_313(), sprgvf.cfr_renamed_132);
        cfr_renamed_1.put(sprmhf.cfr_renamed_4.cfr_renamed_313(), sprgvf.cfr_renamed_91);
        cfr_renamed_1.put(sprmhf.cfr_renamed_91.cfr_renamed_313(), sprgvf.cfr_renamed_152);
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprfqf.cfr_renamed_5681(arg0);
        if (string != null) {
            sprfqf sprfqf2 = this;
            sprfqf2.cfr_renamed_3 = new sprhzf(arg1, (sprgvf)cfr_renamed_1.get(string));
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_0 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprttl.cfr_renamed_9("n}qrkzc3Wrurjvsvu@wvd)'")).append(arg0).toString());
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprmhf) {
            return ((sprmhf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_0) {
            sprfqf sprfqf2 = this;
            this.cfr_renamed_3 = new sprhzf(this.cfr_renamed_2, sprgvf.cfr_renamed_152);
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_0 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprmzf sprmzf2 = (sprmzf)sprsil2.cfr_renamed_1224();
        sprtdg sprtdg2 = (sprtdg)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprbmf(sprmzf2), new sprvlf(sprtdg2));
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprver.cfr_renamed_9("Q#Ape<C?V9P8I\u0000E\"E=A$A\"w A3"));
    }
}

