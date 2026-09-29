/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcnf;
import com.spire.presentation.packages.spredg;
import com.spire.presentation.packages.sprjbg;
import com.spire.presentation.packages.sprjzh;
import com.spire.presentation.packages.sprkeg;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprmbg;
import com.spire.presentation.packages.sprneg;
import com.spire.presentation.packages.sprosf;
import com.spire.presentation.packages.sprqbf;
import com.spire.presentation.packages.sprqff;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprwuf;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import java.util.HashMap;
import java.util.Map;

public class sprflf
extends KeyPairGenerator {
    public SecureRandom cfr_renamed_91;
    private sprwuf cfr_renamed_0;
    public spredg cfr_renamed_1;
    private static Map cfr_renamed_2 = new HashMap();
    public boolean cfr_renamed_3;
    public sprjbg cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprflf(sprwuf sprwuf2) {
        void arg0;
        sprflf sprflf2 = this;
        super(sprkoe.cfr_renamed_116(arg0.cfr_renamed_313()));
        sprflf sprflf3 = this;
        this.cfr_renamed_1 = new spredg();
        sprflf3.cfr_renamed_91 = sprybl.cfr_renamed_2794();
        sprflf2.cfr_renamed_3 = false;
        sprflf2.cfr_renamed_0 = sprwuf2;
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprmbg.cfr_renamed_9("I_Y\f}@[CNEHDQ|]^]AYXY^o\\YO"));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_3) {
            sprflf sprflf2;
            if (this.cfr_renamed_0 != null) {
                sprflf2 = this;
                sprflf sprflf3 = this;
                this.cfr_renamed_4 = new sprjbg(sprflf3.cfr_renamed_91, sprflf3.cfr_renamed_0);
            } else {
                sprflf2 = this;
                this.cfr_renamed_4 = new sprjbg(this.cfr_renamed_91, sprwuf.cfr_renamed_119);
            }
            sprflf2.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_4);
            this.cfr_renamed_3 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_1.cfr_renamed_1223();
        sprkeg sprkeg2 = (sprkeg)sprsil2.cfr_renamed_1224();
        sprneg sprneg2 = (sprneg)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprcnf(sprkeg2), new sprosf(sprneg2));
    }

    static {
        cfr_renamed_2.put(sprqbf.cfr_renamed_119.cfr_renamed_313(), sprwuf.cfr_renamed_2);
        cfr_renamed_2.put(sprqbf.cfr_renamed_0.cfr_renamed_313(), sprwuf.cfr_renamed_86);
        cfr_renamed_2.put(sprqbf.cfr_renamed_2.cfr_renamed_313(), sprwuf.cfr_renamed_119);
        cfr_renamed_2.put(sprqbf.cfr_renamed_4.cfr_renamed_313(), sprwuf.cfr_renamed_3);
        cfr_renamed_2.put(sprqbf.cfr_renamed_3.cfr_renamed_313(), sprwuf.cfr_renamed_152);
        cfr_renamed_2.put(sprqbf.cfr_renamed_91.cfr_renamed_313(), sprwuf.cfr_renamed_112);
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        String string = sprflf.cfr_renamed_5681(arg0);
        if (string != null && cfr_renamed_2.containsKey(string)) {
            sprwuf sprwuf2 = (sprwuf)cfr_renamed_2.get(string);
            this.cfr_renamed_4 = new sprjbg(arg1, sprwuf2);
            if (this.cfr_renamed_0 != null && !sprwuf2.cfr_renamed_313().equals(this.cfr_renamed_0.cfr_renamed_313())) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprjzh.cfr_renamed_9("\\/NjG+^8\u0017-R$R8V>X8\u0017&X)\\/SjC%\u0017")).append(sprkoe.cfr_renamed_116(this.cfr_renamed_0.cfr_renamed_313())).toString());
            }
            sprflf sprflf2 = this;
            sprflf2.cfr_renamed_1.cfr_renamed_5536(sprflf2.cfr_renamed_4);
            this.cfr_renamed_3 = true;
            return;
        }
        throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprmbg.cfr_renamed_9("ERZ]@UH\u001c|]^]AYXY^o\\YO\u0006\f")).append(arg0).toString());
    }

    public sprflf() {
        sprflf sprflf2 = this;
        super(sprjzh.cfr_renamed_9("|\u0013u\u000fe"));
        sprflf sprflf3 = this;
        this.cfr_renamed_1 = new spredg();
        sprflf3.cfr_renamed_91 = sprybl.cfr_renamed_2794();
        sprflf2.cfr_renamed_3 = false;
        sprflf2.cfr_renamed_0 = null;
    }

    private static /* synthetic */ String cfr_renamed_5681(AlgorithmParameterSpec arg0) {
        if (arg0 instanceof sprqbf) {
            return ((sprqbf)arg0).cfr_renamed_313();
        }
        return sprkoe.cfr_renamed_425(sprqff.cfr_renamed_5672(arg0));
    }
}

