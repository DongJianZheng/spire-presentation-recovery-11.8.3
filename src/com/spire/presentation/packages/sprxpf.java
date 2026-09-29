/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprdff;
import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprhl;
import com.spire.presentation.packages.sprkze;
import com.spire.presentation.packages.sprnsf;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.spryjf;
import com.spire.presentation.packages.spryye;
import com.spire.presentation.packages.sprzofa;
import java.io.ByteArrayOutputStream;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.BadPaddingException;

public class sprxpf
extends sprnsf
implements sprdl,
sprhl {
    private sprdff cfr_renamed_2;
    private sprgf cfr_renamed_3;
    private ByteArrayOutputStream cfr_renamed_4;

    @Override
    public int cfr_renamed_1207(int arg0) {
        return 0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_1197(byte[] byArray, int n, int n2) {
        void arg2;
        void arg1;
        void arg0;
        this.cfr_renamed_4.write((byte[])arg0, (int)arg1, (int)arg2);
        return new byte[0];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public byte[] cfr_renamed_1199(byte[] byArray, int n, int n2) throws BadPaddingException {
        sprxpf sprxpf2 = this;
        this.cfr_renamed_1197(byArray, n, n2);
        byte[] byArray2 = sprxpf2.cfr_renamed_4.toByteArray();
        sprxpf2.cfr_renamed_4.reset();
        if (sprxpf2.cfr_renamed_3 == true) {
            return this.cfr_renamed_2.cfr_renamed_136(byArray2);
        }
        if (this.cfr_renamed_3 != 2) {
            return null;
        }
        try {
            return this.cfr_renamed_2.cfr_renamed_1214(byArray2);
        }
        catch (sprull sprull2) {
            throw new BadPaddingException(sprull2.getMessage());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprxpf(sprgf sprgf2, sprdff sprdff2) {
        void arg0;
        sprxpf sprxpf2 = this;
        sprxpf sprxpf3 = this;
        sprxpf3.cfr_renamed_4 = new ByteArrayOutputStream();
        sprxpf2.cfr_renamed_3 = arg0;
        sprxpf2.cfr_renamed_2 = sprdff2;
        sprxpf2.cfr_renamed_4 = new ByteArrayOutputStream();
    }

    @Override
    public int cfr_renamed_1209(int arg0) {
        return 0;
    }

    @Override
    public void cfr_renamed_1210(Key arg0, AlgorithmParameterSpec arg1, SecureRandom arg2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        sprbj sprbj2 = spryjf.cfr_renamed_1216((PublicKey)arg0);
        sprbj2 = new sprbgk(sprbj2, arg2);
        sprxpf sprxpf2 = this;
        sprxpf2.cfr_renamed_3.cfr_renamed_41();
        sprxpf2.cfr_renamed_2.cfr_renamed_5535(true, sprbj2);
    }

    @Override
    public String cfr_renamed_313() {
        return sprzofa.cfr_renamed_9("\\\u0011T\u001ex\u0017r\u0017A\u001dx\u001ce\u0011y\u0017g\u0013}1x\u0002y\u0017c");
    }

    @Override
    public void cfr_renamed_1208(Key arg0, AlgorithmParameterSpec arg1) throws InvalidKeyException, InvalidAlgorithmParameterException {
        spryye spryye2 = spryjf.cfr_renamed_1220((PrivateKey)arg0);
        sprxpf sprxpf2 = this;
        sprxpf2.cfr_renamed_3.cfr_renamed_41();
        sprxpf2.cfr_renamed_2.cfr_renamed_5535(false, spryye2);
    }

    @Override
    public int cfr_renamed_1204(Key arg0) throws InvalidKeyException {
        sprxpf sprxpf2;
        sprkze sprkze2;
        if (arg0 instanceof PublicKey) {
            sprkze2 = (sprkze)spryjf.cfr_renamed_1216((PublicKey)arg0);
            sprxpf2 = this;
        } else {
            sprkze2 = (sprkze)spryjf.cfr_renamed_1220((PrivateKey)arg0);
            sprxpf2 = this;
        }
        return sprxpf2.cfr_renamed_2.cfr_renamed_5628(sprkze2);
    }
}

