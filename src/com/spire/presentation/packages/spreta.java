/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprmwe;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprtre;
import com.spire.presentation.packages.sprvaea;
import com.spire.presentation.packages.sprx;
import java.io.IOException;

public class spreta {
    private final sprmwe cfr_renamed_4;

    private /* synthetic */ String cfr_renamed_687(sprx arg0) {
        if (arg0 != null) {
            return arg0.toString();
        }
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_677(sprpa arg0) throws sprlqd {
        if (this.cfr_renamed_4 != null && this.cfr_renamed_4.cfr_renamed_688()) {
            try {
                arg0.cfr_renamed_470().write(this.cfr_renamed_4.cfr_renamed_104("DER"));
                return;
            }
            catch (IOException iOException) {
                throw new sprlqd(new StringBuilder().insert(0, sprvaea.cfr_renamed_9("k;\u007f7r0>!quw;w!w4r<m0>6\u007f9} r4j:lux'q8>8{!\u007f\u0011\u007f!\u007fo>")).append(iOException.getMessage()).toString(), iOException);
            }
        }
    }

    public String cfr_renamed_675() {
        if (this.cfr_renamed_4 != null) {
            spreta spreta2 = this;
            return spreta2.cfr_renamed_687(spreta2.cfr_renamed_4.cfr_renamed_675());
        }
        return null;
    }

    public String cfr_renamed_678() {
        if (this.cfr_renamed_4 != null) {
            spreta spreta2 = this;
            return spreta2.cfr_renamed_687(spreta2.cfr_renamed_4.cfr_renamed_678());
        }
        return null;
    }

    public spreta(sprmwe sprmwe2) {
        this.cfr_renamed_4 = sprmwe2;
    }

    public sprtre cfr_renamed_671() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_671();
        }
        return null;
    }
}

