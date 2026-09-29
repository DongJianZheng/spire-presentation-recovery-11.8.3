/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprefs;
import com.spire.presentation.packages.spremf;
import com.spire.presentation.packages.spreze;
import com.spire.presentation.packages.sprgpf;
import com.spire.presentation.packages.sprkcf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlpf;
import com.spire.presentation.packages.sprnil;
import com.spire.presentation.packages.sprocl;
import com.spire.presentation.packages.sprohl;
import com.spire.presentation.packages.sprqlf;
import com.spire.presentation.packages.sprsaf;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.sprvnf;
import com.spire.presentation.packages.sprwr;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.sprzwq;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.SecureRandom;
import java.security.spec.AlgorithmParameterSpec;

public class spraef
extends KeyPairGenerator {
    private sprlem cfr_renamed_0;
    private SecureRandom cfr_renamed_1;
    private sprqlf cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprvnf cfr_renamed_4;

    public spraef() {
        spraef spraef2 = this;
        super(sprzwq.cfr_renamed_9("\u0007N\fP"));
        spraef spraef3 = this;
        spraef2.cfr_renamed_4 = new sprvnf();
        spraef2.cfr_renamed_1 = sprybl.cfr_renamed_2794();
        spraef2.cfr_renamed_3 = false;
    }

    @Override
    public void initialize(AlgorithmParameterSpec arg0, SecureRandom arg1) throws InvalidAlgorithmParameterException {
        spraef spraef2;
        if (!(arg0 instanceof spreze)) {
            throw new InvalidAlgorithmParameterException(sprefs.cfr_renamed_9("*o(o7k.k(.5l0k9zz`5zzozV\u0017]\t^;|;c?z?|\t~?m"));
        }
        spreze spreze2 = (spreze)arg0;
        if (spreze2.cfr_renamed_3234().equals("SHA256")) {
            spraef spraef3 = this;
            spraef3.cfr_renamed_0 = sprwr.cfr_renamed_1226;
            spraef2 = this;
            spraef3.cfr_renamed_2 = new sprqlf(new sprlpf(spreze2.cfr_renamed_1452(), new sprohl()), arg1);
        } else if (spreze2.cfr_renamed_3234().equals("SHA512")) {
            spraef2 = this;
            this.cfr_renamed_0 = sprwr.cfr_renamed_272;
            this.cfr_renamed_2 = new sprqlf(new sprlpf(spreze2.cfr_renamed_1452(), new sprocl()), arg1);
        } else if (spreze2.cfr_renamed_3234().equals("SHAKE128")) {
            spraef2 = this;
            this.cfr_renamed_0 = sprwr.cfr_renamed_1;
            this.cfr_renamed_2 = new sprqlf(new sprlpf(spreze2.cfr_renamed_1452(), new sprnil(128)), arg1);
        } else {
            if (spreze2.cfr_renamed_3234().equals("SHAKE256")) {
                spraef spraef4 = this;
                spraef4.cfr_renamed_0 = sprwr.spr\ufe34;
                spraef4.cfr_renamed_2 = new sprqlf(new sprlpf(spreze2.cfr_renamed_1452(), new sprnil(256)), arg1);
            }
            spraef2 = this;
        }
        spraef2.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_2);
        this.cfr_renamed_3 = true;
    }

    @Override
    public void initialize(int arg0, SecureRandom arg1) {
        throw new IllegalArgumentException(sprzwq.cfr_renamed_9("*p:#\u001eo8l-j+k2S>q>n:w:q\fs:`"));
    }

    @Override
    public KeyPair generateKeyPair() {
        if (!this.cfr_renamed_3) {
            spraef spraef2 = this;
            this.cfr_renamed_2 = new sprqlf(new sprlpf(10, new sprocl()), this.cfr_renamed_1);
            this.cfr_renamed_4.cfr_renamed_5536(this.cfr_renamed_2);
            this.cfr_renamed_3 = true;
        }
        sprsil sprsil2 = this.cfr_renamed_4.cfr_renamed_1223();
        sprgpf sprgpf2 = (sprgpf)sprsil2.cfr_renamed_1224();
        spremf spremf2 = (spremf)sprsil2.cfr_renamed_1225();
        return new KeyPair(new sprsaf(this.cfr_renamed_0, sprgpf2), new sprkcf(this.cfr_renamed_0, spremf2));
    }
}

