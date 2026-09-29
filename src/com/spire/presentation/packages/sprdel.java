/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdjl;
import com.spire.presentation.packages.sprlkl;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprmtl;
import com.spire.presentation.packages.sprufl;
import java.io.IOException;
import java.security.Key;
import java.security.PrivateKey;
import javax.crypto.Cipher;

public class sprdel
extends sprufl {
    public sprdel(PrivateKey arg0, sprdjl arg1) throws IOException {
        super(arg0, sprdel.cfr_renamed_10705(arg1));
    }

    @Override
    public sprmtl cfr_renamed_10679(sprddm arg0, sprddm arg1, byte[] arg2) throws sprlyl {
        sprdel sprdel2 = this;
        Key key = sprdel2.cfr_renamed_10706(arg0, arg1, arg2);
        Cipher cipher = sprdel2.cfr_renamed_91.cfr_renamed_10701(key, arg1);
        return new sprmtl(new sprlkl(this, arg1, cipher));
    }
}

