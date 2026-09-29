/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfd;
import com.spire.presentation.packages.spreld;
import com.spire.presentation.packages.sprji;
import com.spire.presentation.packages.sprniy;
import com.spire.presentation.packages.sprnnb;
import com.spire.presentation.packages.sprpcd;
import com.spire.presentation.packages.sprqfc;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprshd;
import com.spire.presentation.packages.sprukd;
import com.spire.presentation.packages.sprvfk;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.sprxfc;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class sprroc
extends KeyPairGenerator {
    public sprukd cfr_renamed_91;
    public SecureRandom cfr_renamed_0;
    public spreld cfr_renamed_1;
    public sprnnb cfr_renamed_2;
    public boolean cfr_renamed_3;
    public int cfr_renamed_4;

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        if (!(arg0 instanceof sprnnb)) {
            throw new InvalidAlgorithmParameterException(sprniy.cfr_renamed_9("=\u001b?\u001b \u001f9\u001f?Z\"\u0018'\u001f.\u000em\u0014\"\u000em\u001bm=\u0002)\u0019IyK}*,\b,\u0017(\u000e(\b\u001e\n(\u0019"));
        }
        this.cfr_renamed_2490((sprnnb)arg0, arg1);
    }

    private /* synthetic */ void cfr_renamed_2490(sprnnb arg0, SecureRandom arg1) {
        sprrob sprrob2 = arg0.cfr_renamed_130();
        sprroc sprroc2 = this;
        this.cfr_renamed_1 = new spreld(arg1, new sprcfd(sprrob2.cfr_renamed_1155(), sprrob2.cfr_renamed_1604(), sprrob2.cfr_renamed_1778()));
        this.cfr_renamed_91.cfr_renamed_1222(this.cfr_renamed_1);
        sprroc2.cfr_renamed_3 = true;
        sprroc2.cfr_renamed_2 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void initialize(int n, SecureRandom secureRandom) {
        void arg0;
        sprroc sprroc2 = this;
        sprroc2.cfr_renamed_4 = arg0;
        sprroc2.cfr_renamed_0 = secureRandom;
    }

    public sprroc() {
        sprroc sprroc2 = this;
        super(sprvfk.cfr_renamed_9("aQuJ\u0015*\u0017."));
        sprroc sprroc3 = this;
        this.cfr_renamed_91 = new sprukd();
        this.cfr_renamed_4 = 1024;
        sprroc2.cfr_renamed_0 = null;
        sprroc2.cfr_renamed_3 = false;
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_3) {
            this.cfr_renamed_2490(new sprnnb(sprji.cfr_renamed_93.cfr_renamed_19()), new SecureRandom());
        }
        sprwnd sprwnd2 = this.cfr_renamed_91.cfr_renamed_1223();
        sprpcd sprpcd2 = (sprpcd)sprwnd2.cfr_renamed_1224();
        sprshd sprshd2 = (sprshd)sprwnd2.cfr_renamed_1225();
        return new KeyPair(new sprqfc(sprpcd2, this.cfr_renamed_2), new sprxfc(sprshd2, this.cfr_renamed_2));
    }
}

