/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraif;
import com.spire.presentation.packages.sprbng;
import com.spire.presentation.packages.spribf;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmjg;
import com.spire.presentation.packages.sprpig;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprsnf;
import com.spire.presentation.packages.sprudz;
import com.spire.presentation.packages.sprvmg;
import com.spire.presentation.packages.sprxfg;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzxe;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprvpf
extends KeyPairGenerator {
    private final sprvmg cfr_renamed_91;
    public SecureRandom cfr_renamed_0;
    public boolean cfr_renamed_1;
    public sprbng cfr_renamed_2;
    public sprmjg cfr_renamed_3;
    private static Map cfr_renamed_4 = new HashMap();

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof spribf) {
            return ((spribf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }

    static {
        cfr_renamed_4.put(spribf.cfr_renamed_4.cfr_renamed_313(), sprvmg.cfr_renamed_119);
        cfr_renamed_4.put(spribf.cfr_renamed_1.cfr_renamed_313(), sprvmg.cfr_renamed_91);
        cfr_renamed_4.put(spribf.cfr_renamed_91.cfr_renamed_313(), sprvmg.cfr_renamed_4);
        cfr_renamed_4.put(spribf.cfr_renamed_119.cfr_renamed_313(), sprvmg.cfr_renamed_0);
        cfr_renamed_4.put(spribf.cfr_renamed_0.cfr_renamed_313(), sprvmg.cfr_renamed_2);
        cfr_renamed_4.put(spribf.cfr_renamed_3.cfr_renamed_313(), sprvmg.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprvpf(sprvmg sprvmg2) {
        void arg0;
        sprvpf sprvpf2 = this;
        super(sprkoe.cfr_renamed_116(arg0.cfr_renamed_313()));
        sprvpf sprvpf3 = this;
        this.cfr_renamed_3 = new sprmjg();
        sprvpf3.cfr_renamed_0 = sprybl.cfr_renamed_2794();
        sprvpf2.cfr_renamed_1 = false;
        sprvpf2.cfr_renamed_91 = sprvmg2;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprvpf.cfr_renamed_5681(arg0);
        if (string != null && cfr_renamed_4.containsKey(string)) {
            sprvmg sprvmg2 = (sprvmg)cfr_renamed_4.get(string);
            this.cfr_renamed_2 = new sprbng(arg1, sprvmg2);
            if (this.cfr_renamed_91 != null && !sprvmg2.cfr_renamed_313().equals(this.cfr_renamed_91.cfr_renamed_313())) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprudz.cfr_renamed_9("fBt\u0007}FdU-@hIhUlSbU-KbDfBi\u0007yH-")).append(sprkoe.cfr_renamed_116(this.cfr_renamed_91.cfr_renamed_313())).toString());
            }
            sprvpf sprvpf2 = this;
            sprvpf2.cfr_renamed_3.cfr_renamed_5536(sprvpf2.cfr_renamed_2);
            this.cfr_renamed_1 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprzxe.cfr_renamed_9("J\bU\u0007O\u000fGFs\u0007Q\u0007N\u0003W\u0003Q5S\u0003@\\\u0003")).append(arg0).toString());
    }

    public sprvpf() {
        sprvpf sprvpf2 = this;
        super(sprudz.cfr_renamed_9("InAnYoDr@"));
        sprvpf sprvpf3 = this;
        this.cfr_renamed_3 = new sprmjg();
        sprvpf3.cfr_renamed_0 = sprybl.cfr_renamed_2794();
        sprvpf2.cfr_renamed_1 = false;
        sprvpf2.cfr_renamed_91 = null;
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprzxe.cfr_renamed_9("\u0013P\u0003\u0003'O\u0001L\u0014J\u0012K\u000bs\u0007Q\u0007N\u0003W\u0003Q5S\u0003@"));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_1) {
            sprvpf sprvpf2;
            if (this.cfr_renamed_91 != null) {
                sprvpf2 = this;
                sprvpf sprvpf3 = this;
                this.cfr_renamed_2 = new sprbng(sprvpf3.cfr_renamed_0, sprvpf3.cfr_renamed_91);
            } else {
                sprvpf2 = this;
                this.cfr_renamed_2 = new sprbng(this.cfr_renamed_0, sprvmg.cfr_renamed_91);
            }
            sprvpf2.cfr_renamed_3.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_1 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_3.cfr_renamed_1223();
        sprpig sprpig2 = (sprpig)sprsil2.cfr_renamed_1224();
        sprxfg sprxfg2 = (sprxfg)sprsil2.cfr_renamed_1225();
        return new KeyPair(new spraif(sprpig2), new sprsnf(sprxfg2));
    }
}

