/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprgdg;
import com.spire.presentation.packages.sprjaf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlhk;
import com.spire.presentation.packages.sprlwf;
import com.spire.presentation.packages.sprmag;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprtxf;
import com.spire.presentation.packages.sprwnf;
import com.spire.presentation.packages.sprwpf;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryyf;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprhpf
extends KeyPairGenerator {
    public boolean cfr_renamed_0;
    public sprtxf cfr_renamed_1;
    public SecureRandom cfr_renamed_2;
    private static Map cfr_renamed_3 = new HashMap();
    public sprlwf cfr_renamed_4;

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_0) {
            sprhpf sprhpf2 = this;
            this.cfr_renamed_1 = new sprtxf(this.cfr_renamed_2, spryyf.cfr_renamed_152);
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_1);
            this.cfr_renamed_0 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprgdg sprgdg2 = (sprgdg)sprsil2.cfr_renamed_1224();
        sprmag sprmag2 = (sprmag)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprwnf(sprgdg2), new sprwpf(sprmag2));
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprjaf) {
            return ((sprjaf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    static {
        cfr_renamed_3.put(sprlhk.cfr_renamed_9("eQn\r<\u00125"), spryyf.cfr_renamed_152);
        cfr_renamed_3.put(sprccb.cfr_renamed_9("?t4(f<e"), spryyf.cfr_renamed_1);
        cfr_renamed_3.put(sprlhk.cfr_renamed_9("eQn\r?\u0015;"), spryyf.cfr_renamed_107);
        cfr_renamed_3.put(sprjaf.cfr_renamed_0.cfr_renamed_313(), spryyf.cfr_renamed_152);
        cfr_renamed_3.put(sprjaf.cfr_renamed_2.cfr_renamed_313(), spryyf.cfr_renamed_1);
        cfr_renamed_3.put(sprjaf.cfr_renamed_3.cfr_renamed_313(), spryyf.cfr_renamed_107);
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprccb.cfr_renamed_9("p$`wD;b8w>q?h\u0007d%d:`#`%V'`4"));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprhpf.cfr_renamed_5681(arg0);
        if (string != null) {
            sprhpf sprhpf2 = this;
            sprhpf2.cfr_renamed_1 = new sprtxf(arg1, (spryyf)cfr_renamed_3.get(string));
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_1);
            this.cfr_renamed_0 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprlhk.cfr_renamed_9("dN{AaIi\u0000]A\u007fA`EyE\u007fs}En\u001a-")).append(arg0).toString());
    }

    public sprhpf() {
        sprhpf sprhpf2 = this;
        super(sprccb.cfr_renamed_9("\u001fT\u0014"));
        sprhpf sprhpf3 = this;
        sprhpf2.cfr_renamed_4 = new sprlwf();
        sprhpf2.cfr_renamed_2 = sprybl.cfr_renamed_2794();
        sprhpf2.cfr_renamed_0 = false;
    }
}

