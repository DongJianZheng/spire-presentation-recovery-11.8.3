/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraxf;
import com.spire.presentation.packages.sprbxf;
import com.spire.presentation.packages.sprceg;
import com.spire.presentation.packages.sprcrf;
import com.spire.presentation.packages.sprdpf;
import com.spire.presentation.packages.sprgwf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprgzf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.spriyf;
import com.spire.presentation.packages.sprldg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvc;
import com.spire.presentation.packages.sprsef;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprsuf;
import com.spire.presentation.packages.sprtcg;
import com.spire.presentation.packages.spruwe;
import com.spire.presentation.packages.sprwbf;
import com.spire.presentation.packages.sprwlo;
import com.spire.presentation.packages.sprxtf;
import com.spire.presentation.packages.spryaf;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprztf;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprmmf
extends KeyPairGenerator {
    private sprgye cfr_renamed_0;
    private boolean cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sprii cfr_renamed_4;

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprnvc.cfr_renamed_9("W-G~c2E1P7V6O\u000eC,C3G*G,q.G="));
    }

    public sprmmf() {
        sprmmf sprmmf2 = this;
        super(sprwlo.cfr_renamed_9("*o5"));
        sprmmf sprmmf3 = this;
        sprmmf2.cfr_renamed_4 = new spraxf();
        sprmmf2.cfr_renamed_2 = sprybl.cfr_renamed_2794();
        sprmmf2.cfr_renamed_1 = false;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_1) {
            sprmmf sprmmf2 = this;
            this.cfr_renamed_0 = new sprtcg(new sprztf(sprgzf.cfr_renamed_126, sprsuf.cfr_renamed_31), this.cfr_renamed_2);
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_0);
            this.cfr_renamed_1 = true;
        }
        sprmmf sprmmf3 = this;
        sprsil sprsil2 = sprmmf3.cfr_renamed_4.cfr_renamed_1223();
        if (sprmmf3.cfr_renamed_4 instanceof spraxf) {
            sprbxf sprbxf2 = (sprbxf)sprsil2.cfr_renamed_1224();
            spriyf spriyf2 = (spriyf)sprsil2.cfr_renamed_1225();
            return new KeyPair(new sprdpf(sprbxf2), new sprcrf(spriyf2));
        }
        sprldg sprldg2 = (sprldg)sprsil2.cfr_renamed_1224();
        sprceg sprceg2 = (sprceg)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprdpf(sprldg2), new sprcrf(sprceg2));
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        sprmmf sprmmf2;
        if (arg0 instanceof sprsef) {
            sprsef sprsef2 = (sprsef)arg0;
            sprmmf sprmmf3 = this;
            sprmmf2 = sprmmf3;
            sprmmf sprmmf4 = this;
            sprmmf3.cfr_renamed_0 = new sprtcg(new sprztf(sprsef2.cfr_renamed_5646(), sprsef2.cfr_renamed_5645()), arg1);
            sprmmf4.cfr_renamed_4 = new spraxf();
            sprmmf3.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_0);
        } else if (arg0 instanceof spryaf) {
            int n;
            sprsef[] sprsefArray = ((spryaf)arg0).cfr_renamed_5648();
            sprztf[] sprztfArray = new sprztf[sprsefArray.length];
            int n2 = n = 0;
            while (n2 != sprsefArray.length) {
                int n3 = n;
                sprztf sprztf2 = new sprztf(sprsefArray[n].cfr_renamed_5646(), sprsefArray[n].cfr_renamed_5645());
                sprztfArray[n3] = sprztf2;
                n2 = ++n;
            }
            sprmmf sprmmf5 = this;
            sprmmf2 = sprmmf5;
            sprmmf5.cfr_renamed_0 = new sprgwf(sprztfArray, arg1);
            sprmmf5.cfr_renamed_4 = new sprxtf();
            sprmmf5.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_0);
        } else {
            AlgorithmParameterSpec algorithmParameterSpec = arg0;
            if (arg0 instanceof sprwbf) {
                sprwbf sprwbf2 = (sprwbf)algorithmParameterSpec;
                sprmmf sprmmf6 = this;
                sprmmf2 = sprmmf6;
                sprmmf6.cfr_renamed_0 = new sprtcg(new sprztf(sprwbf2.cfr_renamed_5646(), sprwbf2.cfr_renamed_5645()), arg1);
                sprmmf6.cfr_renamed_4 = new spraxf();
                sprmmf6.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_0);
            } else if (algorithmParameterSpec instanceof spruwe) {
                int n;
                sprwbf[] sprwbfArray = ((spruwe)arg0).cfr_renamed_5648();
                sprztf[] sprztfArray = new sprztf[sprwbfArray.length];
                int n4 = n = 0;
                while (n4 != sprwbfArray.length) {
                    int n5 = n;
                    sprztf sprztf3 = new sprztf(sprwbfArray[n].cfr_renamed_5646(), sprwbfArray[n].cfr_renamed_5645());
                    sprztfArray[n5] = sprztf3;
                    n4 = ++n;
                }
                sprmmf sprmmf7 = this;
                sprmmf2 = sprmmf7;
                sprmmf7.cfr_renamed_0 = new sprgwf(sprztfArray, arg1);
                sprmmf7.cfr_renamed_4 = new sprxtf();
                sprmmf7.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_0);
            } else {
                throw new InvalidAlgorithmParameterException(sprnvc.cfr_renamed_9(".C,C3G*G,\u00021@4G=V~L1V~C~n\u0013q\u000eC,C3G*G,q.G=\r\u0012o\rj\rq\u000eC,C3G*G,q.G="));
            }
        }
        sprmmf2.cfr_renamed_1 = true;
    }
}

