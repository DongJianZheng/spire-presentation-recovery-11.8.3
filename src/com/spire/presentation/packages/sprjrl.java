/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprajg;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprjlg;
import com.spire.presentation.packages.sprkpg;
import com.spire.presentation.packages.sprmz;
import com.spire.presentation.packages.sprnng;
import com.spire.presentation.packages.sproul;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprtlg;
import com.spire.presentation.packages.sprujl;
import java.security.PrivateKey;
import javax.crypto.SecretKey;

public class sprjrl
extends sprrul
implements sprmz {
    @Override
    public sprnng cfr_renamed_10693(sprddm arg0, PrivateKey arg1) {
        return new sprujl(arg0, arg1);
    }

    @Override
    public sprjlg cfr_renamed_10696(sprddm arg0, SecretKey arg1) {
        return new sprkpg(arg0, arg1);
    }

    @Override
    public sprajg cfr_renamed_10694(sprddm arg0, PrivateKey arg1) {
        arg1 = sproul.cfr_renamed_10695(arg1);
        return new sprajg(arg0, arg1);
    }

    @Override
    public sprtlg cfr_renamed_10697(sprddm arg0, PrivateKey arg1, byte[] arg2, byte[] arg3) {
        arg1 = sproul.cfr_renamed_10695(arg1);
        return new sprtlg(arg0, arg1, arg2, arg3);
    }
}

