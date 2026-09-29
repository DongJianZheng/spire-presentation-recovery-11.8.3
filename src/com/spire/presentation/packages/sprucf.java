/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgf;
import com.spire.presentation.packages.sprfpf;
import com.spire.presentation.packages.sprjbf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmof;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprpof;
import com.spire.presentation.packages.sprrxe;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvif;
import com.spire.presentation.packages.sprvjf;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprxwy;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzif;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprucf
extends KeyPairGenerator {
    private SecureRandom cfr_renamed_0;
    private sprlem cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprzif cfr_renamed_3;
    private sprmof cfr_renamed_4;

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprfpf.cfr_renamed_9("v1fbB.d-q+w*n\u0012b0b/f6f0P2f!"));
    }

    public sprucf() {
        sprucf sprucf2 = this;
        super(sprxwy.cfr_renamed_9("n\u0007e\u0019{\u001e"));
        sprucf sprucf3 = this;
        sprucf2.cfr_renamed_4 = new sprmof();
        sprucf2.cfr_renamed_0 = sprybl.cfr_renamed_2794();
        sprucf2.cfr_renamed_2 = false;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_2) {
            sprucf sprucf2 = this;
            this.cfr_renamed_3 = new sprzif(new sprvjf(10, 20, new sprocl()), this.cfr_renamed_0);
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_3);
            this.cfr_renamed_2 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprvif sprvif2 = (sprvif)sprsil2.cfr_renamed_1224();
        sprpof sprpof2 = (sprpof)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprrxe(this.cfr_renamed_1, sprvif2), new sprjbf(this.cfr_renamed_1, sprpof2));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        sprucf sprucf2;
        if (!(arg0 instanceof sprcgf)) {
            throw new InvalidAlgorithmParameterException(sprfpf.cfr_renamed_9("s#q#n'w'qbl i'`6#,l6###\u001aN\u0011P\u000fW\u0012b0b/f6f0P2f!"));
        }
        sprcgf sprcgf2 = (sprcgf)arg0;
        if (sprcgf2.cfr_renamed_3234().equals("SHA256")) {
            sprucf sprucf3 = this;
            sprucf3.cfr_renamed_1 = sprwr.cfr_renamed_1226;
            sprucf2 = this;
            sprucf3.cfr_renamed_3 = new sprzif(new sprvjf(sprcgf2.cfr_renamed_1452(), sprcgf2.cfr_renamed_1134(), new sprohl()), arg1);
        } else if (sprcgf2.cfr_renamed_3234().equals("SHA512")) {
            sprucf2 = this;
            this.cfr_renamed_1 = sprwr.cfr_renamed_272;
            this.cfr_renamed_3 = new sprzif(new sprvjf(sprcgf2.cfr_renamed_1452(), sprcgf2.cfr_renamed_1134(), new sprocl()), arg1);
        } else if (sprcgf2.cfr_renamed_3234().equals("SHAKE128")) {
            sprucf2 = this;
            this.cfr_renamed_1 = sprwr.cfr_renamed_1;
            this.cfr_renamed_3 = new sprzif(new sprvjf(sprcgf2.cfr_renamed_1452(), sprcgf2.cfr_renamed_1134(), new sprnil(128)), arg1);
        } else {
            if (sprcgf2.cfr_renamed_3234().equals("SHAKE256")) {
                sprucf sprucf4 = this;
                sprucf4.cfr_renamed_1 = sprwr.spr\ufe34;
                sprucf4.cfr_renamed_3 = new sprzif(new sprvjf(sprcgf2.cfr_renamed_1452(), sprcgf2.cfr_renamed_1134(), new sprnil(256)), arg1);
            }
            sprucf2 = this;
        }
        sprucf2.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_3);
        this.cfr_renamed_2 = true;
    }
}

