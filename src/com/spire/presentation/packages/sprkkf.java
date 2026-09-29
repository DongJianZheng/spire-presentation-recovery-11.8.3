/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcii;
import com.spire.presentation.packages.sprcnf;
import com.spire.presentation.packages.sprctr;
import com.spire.presentation.packages.spriai;
import com.spire.presentation.packages.sprkdk;
import com.spire.presentation.packages.sprki;
import com.spire.presentation.packages.sprkoe;
import com.spire.presentation.packages.sprosf;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprsmg;
import com.spire.presentation.packages.sprwjg;
import com.spire.presentation.packages.sprwuf;
import java.security.InvalidAlgorithmParameterException;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.KeyGeneratorSpi;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import javax.security.auth.DestroyFailedException;

public class sprkkf
extends KeyGeneratorSpi {
    private spriai cfr_renamed_1;
    private sprwuf cfr_renamed_2;
    private sprcii cfr_renamed_3;
    private SecureRandom cfr_renamed_4;

    public sprkkf() {
        this(null);
    }

    @Override
    public void engineInit(int arg0, SecureRandom arg1) {
        throw new UnsupportedOperationException(sprctr.cfr_renamed_9("\u001d57731;*<e<*&e!0\"5=7& 6"));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public SecretKey engineGenerateKey() {
        if (this.cfr_renamed_3 == null) {
            sprosf sprosf2 = (sprosf)this.cfr_renamed_1.cfr_renamed_1369();
            sprwjg sprwjg2 = new sprwjg(sprosf2.cfr_renamed_5650());
            byte[] byArray = this.cfr_renamed_1.cfr_renamed_5684();
            byte[] byArray2 = sprwjg2.cfr_renamed_5685(byArray);
            sprkdk sprkdk2 = new sprkdk(new SecretKeySpec(byArray2, this.cfr_renamed_1.cfr_renamed_5666()), byArray);
            sproze.cfr_renamed_3408(byArray2);
            return sprkdk2;
        }
        sprcnf sprcnf2 = (sprcnf)this.cfr_renamed_3.cfr_renamed_1157();
        sprsmg sprsmg2 = new sprsmg(this.cfr_renamed_4);
        sprki sprki2 = sprsmg2.cfr_renamed_5686(sprcnf2.cfr_renamed_5650());
        sprkdk sprkdk3 = new sprkdk(new SecretKeySpec(sprki2.cfr_renamed_3880(), this.cfr_renamed_3.cfr_renamed_5666()), sprki2.cfr_renamed_5684());
        try {
            sprki2.destroy();
            return sprkdk3;
        }
        catch (DestroyFailedException destroyFailedException) {
            throw new IllegalStateException(sprraja.cfr_renamed_9(":K(\u000e2B4O?[!\u000e7O8B4J"));
        }
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void engineInit(AlgorithmParameterSpec algorithmParameterSpec, SecureRandom secureRandom) throws InvalidAlgorithmParameterException {
        void arg0;
        void arg1;
        this.cfr_renamed_4 = arg1;
        if (algorithmParameterSpec instanceof sprcii) {
            String string;
            this.cfr_renamed_3 = (sprcii)arg0;
            this.cfr_renamed_1 = null;
            if (this.cfr_renamed_2 != null && !(string = sprkoe.cfr_renamed_116(this.cfr_renamed_2.cfr_renamed_313())).equals(this.cfr_renamed_3.cfr_renamed_1157().getAlgorithm())) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprctr.cfr_renamed_9(".7<r\"7+7731=7r)=&9 6e&*r")).append(string).toString());
            }
        } else if (arg0 instanceof spriai) {
            String string;
            sprkkf sprkkf2 = this;
            sprkkf2.cfr_renamed_3 = null;
            sprkkf2.cfr_renamed_1 = (spriai)arg0;
            if (this.cfr_renamed_2 != null && !(string = sprkoe.cfr_renamed_116(this.cfr_renamed_2.cfr_renamed_313())).equals(this.cfr_renamed_1.cfr_renamed_1369().getAlgorithm())) {
                throw new InvalidAlgorithmParameterException(new StringBuilder().insert(0, sprraja.cfr_renamed_9(":K(\u000e6K?K#O%A#\u000e=A2E4JqZ>\u000e")).append(string).toString());
            }
        } else {
            throw new InvalidAlgorithmParameterException(sprctr.cfr_renamed_9("0<.<*%+r6\" 1"));
        }
    }

    @Override
    public void engineInit(SecureRandom arg0) {
        throw new UnsupportedOperationException(sprraja.cfr_renamed_9("a!K#O%G>@q@>Zq]$^!A#Z4J"));
    }

    public sprkkf(sprwuf sprwuf2) {
        this.cfr_renamed_2 = sprwuf2;
    }
}

