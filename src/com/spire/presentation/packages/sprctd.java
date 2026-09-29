/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprard;
import com.spire.presentation.packages.sprase;
import com.spire.presentation.packages.sprbf;
import com.spire.presentation.packages.sprjpe;
import com.spire.presentation.packages.sprjwe;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprpqd;
import com.spire.presentation.packages.sprrob;
import com.spire.presentation.packages.sprspe;
import com.spire.presentation.packages.sprtod;
import com.spire.presentation.packages.sprvn;
import java.io.IOException;

public class sprctd {
    private sprpqd cfr_renamed_3;
    private sprard cfr_renamed_4;

    public sprtod cfr_renamed_1441(sproa arg0) throws sprlqd {
        sprctd sprctd2 = this;
        sprase sprase2 = sprase.cfr_renamed_23(sprctd2.cfr_renamed_3.cfr_renamed_1467(sprctd2.cfr_renamed_4, arg0).cfr_renamed_568().cfr_renamed_480());
        return new sprtod(new sprjpe(new sprjwe(sprase2)));
    }

    public sprctd cfr_renamed_4339(sprvn arg0) {
        sprctd sprctd2 = this;
        sprctd2.cfr_renamed_3.cfr_renamed_4161(arg0);
        return sprctd2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprctd(sprmke arg0, sprmee arg1) {
        sprspe sprspe2 = new sprspe(arg0, arg1);
        try {
            this.cfr_renamed_4 = new sprard(sprbf.cfr_renamed_1, sprspe2.cfr_renamed_91());
        }
        catch (IOException iOException) {
            throw new IllegalStateException(sprrob.cfr_renamed_9("Z$N(C/\u000f>@jJ$L%K/\u000f!J3\u000f+A.\u000f-J$J8N&\u000f$N'JjF$I%"));
        }
        this.cfr_renamed_3 = new sprpqd();
    }
}

