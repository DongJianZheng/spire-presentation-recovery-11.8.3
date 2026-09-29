/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdi;
import com.spire.presentation.packages.sprggp;
import com.spire.presentation.packages.sprlzd;
import com.spire.presentation.packages.sprrpe;
import com.spire.presentation.packages.sprwae;
import com.spire.presentation.packages.sprwke;
import java.util.Date;

public class sprdxd
implements sprdi {
    public sprwae cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdxd(Date date, int n) {
        void arg1;
        void arg0;
        sprdxd sprdxd2 = this;
        sprdxd2.cfr_renamed_4 = new sprwae(new sprrpe((Date)arg0), sprwke.cfr_renamed_4272((int)arg1));
    }

    public int cfr_renamed_4273() {
        if (this.cfr_renamed_4.cfr_renamed_4273() == null) {
            throw new IllegalStateException(sprggp.cfr_renamed_9("\u0001\u000e\u0014\u001f\r\n\u0014Z\u0014\u0015@\u001d\u0005\u000e@\u001b@\b\u0005\u001b\u0013\u0015\u000eZ\u0017\u0012\u0005\b\u0005Z\u000e\u0015\u000e\u001f@\u0013\u0013Z\u0001\f\u0001\u0013\f\u001b\u0002\u0016\u0005"));
        }
        return this.cfr_renamed_4.cfr_renamed_4273().cfr_renamed_97().intValue();
    }

    public Date cfr_renamed_4274() {
        return sprlzd.cfr_renamed_4269(this.cfr_renamed_4.cfr_renamed_4274());
    }

    public boolean cfr_renamed_4275() {
        return this.cfr_renamed_4.cfr_renamed_4273() != null;
    }

    public sprdxd(sprwae sprwae2) {
        this.cfr_renamed_4 = sprwae2;
    }
}

