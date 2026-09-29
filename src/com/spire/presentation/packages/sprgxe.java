/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprkcg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprlbf;
import com.spire.presentation.packages.sprlvf;
import com.spire.presentation.packages.sprlzf;
import com.spire.presentation.packages.sprmbka;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprrbg;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvdf;
import com.spire.presentation.packages.sprxno;
import com.spire.presentation.packages.sprxuf;
import com.spire.presentation.packages.sprxze;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprgxe
extends KeyPairGenerator {
    public boolean cfr_renamed_0;
    public SecureRandom cfr_renamed_1;
    private static Map cfr_renamed_2 = new HashMap();
    public sprlzf cfr_renamed_3;
    public sprkcg cfr_renamed_4;

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_0) {
            sprgxe sprgxe2 = this;
            this.cfr_renamed_4 = new sprkcg(this.cfr_renamed_1, sprxuf.cfr_renamed_145);
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_4);
            this.cfr_renamed_0 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_3.cfr_renamed_1223();
        sprlvf sprlvf2 = (sprlvf)sprsil2.cfr_renamed_1224();
        sprrbg sprrbg2 = (sprrbg)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprlbf(sprlvf2), new sprxze(sprrbg2));
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprvdf) {
            return ((sprvdf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprxno.cfr_renamed_9("[\u0012KAo\rI\u000e\\\bZ\tC1O\u0013O\fK\u0015K\u0013}\u0011K\u0002"));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprgxe.cfr_renamed_5681(arg0);
        if (string != null) {
            sprgxe sprgxe2 = this;
            sprgxe2.cfr_renamed_4 = new sprkcg(arg1, (sprxuf)cfr_renamed_2.get(string));
            this.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_4);
            this.cfr_renamed_0 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprmbka.cfr_renamed_9("\nr\u0015}\u000fu\u0007<3}\u0011}\u000ey\u0017y\u0011O\u0013y\u0000&C")).append(arg0).toString());
    }

    public sprgxe() {
        sprgxe sprgxe2 = this;
        super(sprxno.cfr_renamed_9("2o#k3"));
        sprgxe sprgxe3 = this;
        sprgxe2.cfr_renamed_3 = new sprlzf();
        sprgxe2.cfr_renamed_1 = sprybl.cfr_renamed_2794();
        sprgxe2.cfr_renamed_0 = false;
    }

    static {
        cfr_renamed_2.put(sprvdf.cfr_renamed_91.cfr_renamed_313(), sprxuf.cfr_renamed_137);
        cfr_renamed_2.put(sprvdf.cfr_renamed_3.cfr_renamed_313(), sprxuf.cfr_renamed_1);
        cfr_renamed_2.put(sprvdf.cfr_renamed_4.cfr_renamed_313(), sprxuf.cfr_renamed_105);
        cfr_renamed_2.put(sprvdf.cfr_renamed_93.cfr_renamed_313(), sprxuf.cfr_renamed_2);
        cfr_renamed_2.put(sprvdf.cfr_renamed_86.cfr_renamed_313(), sprxuf.cfr_renamed_112);
        cfr_renamed_2.put(sprvdf.cfr_renamed_112.cfr_renamed_313(), sprxuf.cfr_renamed_79);
        cfr_renamed_2.put(sprvdf.cfr_renamed_0.cfr_renamed_313(), sprxuf.cfr_renamed_102);
        cfr_renamed_2.put(sprvdf.cfr_renamed_152.cfr_renamed_313(), sprxuf.cfr_renamed_0);
        cfr_renamed_2.put(sprvdf.cfr_renamed_2.cfr_renamed_313(), sprxuf.cfr_renamed_145);
    }
}

