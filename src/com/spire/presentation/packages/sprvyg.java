/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcrg;
import com.spire.presentation.packages.sprdm;
import com.spire.presentation.packages.sprjzg;
import com.spire.presentation.packages.sprmah;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvbh;
import java.security.KeyPair;
import java.security.PrivateKey;
import java.security.PublicKey;
import java.util.Date;

public class sprvyg
extends sprcrg {
    private static /* synthetic */ sprvbh cfr_renamed_7961(int arg0, PublicKey arg1, Date arg2) throws sprtqg {
        return new sprjzg().cfr_renamed_7962(arg0, arg1, arg2);
    }

    private static /* synthetic */ sprmah cfr_renamed_7963(sprvbh arg0, PrivateKey arg1) throws sprtqg {
        return new sprjzg().cfr_renamed_7964(arg0, arg1);
    }

    private static /* synthetic */ sprvbh cfr_renamed_7965(int arg0, sprdm arg1, PublicKey arg2, Date arg3) throws sprtqg {
        return new sprjzg().cfr_renamed_7966(arg0, arg1, arg2, arg3);
    }

    public sprvyg(int arg0, sprdm arg1, KeyPair arg2, Date arg3) throws sprtqg {
        sprvyg sprvyg2 = this;
        sprvyg sprvyg3 = this;
        sprvyg2.cfr_renamed_3 = sprvyg.cfr_renamed_7965(arg0, arg1, arg2.getPublic(), arg3);
        sprvyg2.cfr_renamed_4 = sprvyg.cfr_renamed_7963(sprvyg3.cfr_renamed_3, arg2.getPrivate());
    }

    public sprvyg(int arg0, KeyPair arg1, Date arg2) throws sprtqg {
        sprvyg sprvyg2 = this;
        sprvyg sprvyg3 = this;
        sprvyg2.cfr_renamed_3 = sprvyg.cfr_renamed_7961(arg0, arg1.getPublic(), arg2);
        sprvyg2.cfr_renamed_4 = sprvyg.cfr_renamed_7963(sprvyg3.cfr_renamed_3, arg1.getPrivate());
    }
}

