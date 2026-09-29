/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhng;
import com.spire.presentation.packages.sprmqg;
import com.spire.presentation.packages.sprmzh;
import com.spire.presentation.packages.sprqgk;
import com.spire.presentation.packages.sprxfaa;
import com.spire.presentation.packages.spryye;
import java.io.IOException;

public class sprlqg
extends sprmqg {
    public sprlqg(byte[] arg0) throws IOException {
        super(arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spryye cfr_renamed_1157() throws sprhng {
        try {
            return sprqgk.cfr_renamed_5660(this.cfr_renamed_1489());
        }
        catch (IOException iOException) {
            throw new sprhng(new StringBuilder().insert(0, sprxfaa.cfr_renamed_9("d]s@s\u000fdWu]`LuFoH!DdV!JoLnKhAf\u0015!")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprlqg(sprmqg arg0) {
        super(arg0.cfr_renamed_568());
    }

    public sprlqg(sprmzh arg0) {
        super(arg0);
    }
}

