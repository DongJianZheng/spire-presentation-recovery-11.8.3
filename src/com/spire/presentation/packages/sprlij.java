/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprabl;
import com.spire.presentation.packages.sprbtaa;
import com.spire.presentation.packages.sprcuk;
import com.spire.presentation.packages.spremj;
import com.spire.presentation.packages.sprhwk;
import com.spire.presentation.packages.sprlvh;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprssk;
import com.spire.presentation.packages.sprval;
import com.spire.presentation.packages.sprvrb;
import com.spire.presentation.packages.sprwrk;
import com.spire.presentation.packages.sprxoj;
import com.spire.presentation.packages.sprybl;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.spec.DHParameterSpec;

public class sprlij
extends KeyPairGenerator {
    public boolean cfr_renamed_91;
    public SecureRandom cfr_renamed_0;
    public sprhwk cfr_renamed_1;
    public int cfr_renamed_2;
    public sprval cfr_renamed_3;
    public int cfr_renamed_4;

    @Override
    public KeyPair generateKeyPair() {
        Object object;
        Object object2;
        if (!this.cfr_renamed_91) {
            sprlij sprlij2;
            object2 = sprsci.cfr_renamed_105.cfr_renamed_1454(this.cfr_renamed_2);
            if (object2 != null) {
                sprlij2 = this;
                this.cfr_renamed_3 = new sprval(this.cfr_renamed_0, new sprcuk(((DHParameterSpec)object2).getP(), ((DHParameterSpec)object2).getG(), ((DHParameterSpec)object2).getL()));
            } else {
                object = new sprabl();
                sprlij sprlij3 = this;
                sprlij2 = sprlij3;
                sprlij sprlij4 = this;
                ((sprabl)object).cfr_renamed_2492(sprlij3.cfr_renamed_2, sprlij4.cfr_renamed_4, sprlij4.cfr_renamed_0);
                sprlij3.cfr_renamed_3 = new sprval(this.cfr_renamed_0, ((sprabl)object).cfr_renamed_2493());
            }
            sprlij2.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_91 = true;
        }
        object2 = this.cfr_renamed_1.cfr_renamed_1223();
        object = (sprssk)((sprsil)object2).cfr_renamed_1224();
        sprwrk sprwrk2 = (sprwrk)((sprsil)object2).cfr_renamed_1225();
        return new KeyPair(new sprxoj((sprssk)object), new spremj(sprwrk2));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        sprlij sprlij2;
        if (!(arg0 instanceof sprlvh) && !(arg0 instanceof DHParameterSpec)) {
            throw new InvalidAlgorithmParameterException(sprvrb.cfr_renamed_9("obmbrfkfm#pauf|w?mpw?b?GWS~q~nzwzqLsz`?lm#~m?FsD~n~oObmbrfkfmPof|"));
        }
        if (arg0 instanceof sprlvh) {
            sprlvh sprlvh2 = (sprlvh)arg0;
            sprlij2 = this;
            this.cfr_renamed_3 = new sprval(arg1, new sprcuk(sprlvh2.cfr_renamed_1155(), sprlvh2.cfr_renamed_1145()));
        } else {
            DHParameterSpec dHParameterSpec = (DHParameterSpec)arg0;
            sprlij2 = this;
            this.cfr_renamed_3 = new sprval(arg1, new sprcuk(dHParameterSpec.getP(), dHParameterSpec.getG(), dHParameterSpec.getL()));
        }
        sprlij2.cfr_renamed_1.cfr_renamed_5536(this.cfr_renamed_3);
        this.cfr_renamed_91 = true;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        sprlij sprlij2 = this;
        sprlij2.cfr_renamed_2 = arg0;
        sprlij2.cfr_renamed_0 = secureRandom;
    }

    public sprlij() {
        sprlij sprlij2 = this;
        super(sprbtaa.cfr_renamed_9("G$E)o)n"));
        sprlij sprlij3 = this;
        this.cfr_renamed_1 = new sprhwk();
        this.cfr_renamed_2 = 1024;
        sprlij2.cfr_renamed_4 = 20;
        sprlij2.cfr_renamed_0 = sprybl.cfr_renamed_2794();
        sprlij2.cfr_renamed_91 = false;
    }
}

