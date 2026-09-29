/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprfj;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprjze;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprnnm;
import com.spire.presentation.packages.sprnum;
import com.spire.presentation.packages.sprrqr;
import com.spire.presentation.packages.sprxg;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class sprovl {
    private sprlvm cfr_renamed_3;
    private sprnnm cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhql cfr_renamed_10811(sprxg arg0) throws sprlyl {
        try {
            sprnum sprnum2 = this.cfr_renamed_4.cfr_renamed_4172();
            sprfj sprfj2 = arg0.cfr_renamed_5279(sprnum2.cfr_renamed_4173());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(sprnum2.cfr_renamed_4178().cfr_renamed_186());
            return new sprhql(sprnum2.cfr_renamed_696(), sprfj2.cfr_renamed_1447(byteArrayInputStream));
        }
        catch (Exception exception) {
            throw new sprlyl(new StringBuilder().insert(0, sprrqr.cfr_renamed_9("N\u000fZ\u0003W\u0004\u001b\u0015TAX\u0013^\u0000O\u0004\u001b\u0012O\u0013^\u0000V[\u001b")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprlvm cfr_renamed_568() {
        return this.cfr_renamed_3;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public byte[] cfr_renamed_7359(sprxg arg0) throws sprlyl {
        try {
            return spreul.cfr_renamed_4002(this.cfr_renamed_10811(arg0).cfr_renamed_4004());
        }
        catch (IOException iOException) {
            throw new sprlyl(new StringBuilder().insert(0, sprjze.cfr_renamed_9("\fM\u0018A\u0015FYW\u0016\u0003\tB\u000bP\u001c\u0003\u0010M\rF\u000bM\u0018OYP\rQ\u001cB\u0014\u0019Y")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprovl(sprlvm sprlvm2) {
        void arg0;
        sprovl sprovl2 = this;
        sprovl2.cfr_renamed_3 = arg0;
        sprovl2.cfr_renamed_4 = sprnnm.cfr_renamed_23(sprlvm2.cfr_renamed_480());
    }
}

