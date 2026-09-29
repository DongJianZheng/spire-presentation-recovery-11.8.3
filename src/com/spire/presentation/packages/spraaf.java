/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprckz;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprml;
import com.spire.presentation.packages.sprqkm;
import com.spire.presentation.packages.sprypm;
import java.io.IOException;

public class spraaf {
    private final sprqkm cfr_renamed_4;

    private /* synthetic */ String cfr_renamed_5383(sprml arg0) {
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
    public void cfr_renamed_5376(sprjj arg0) throws sprlyl {
        if (this.cfr_renamed_4 != null && this.cfr_renamed_4.cfr_renamed_688()) {
            try {
                arg0.cfr_renamed_470().write(this.cfr_renamed_4.cfr_renamed_104("DER"));
                return;
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, sprckz.cfr_renamed_9("\u0019R\r^\u0000YLH\u0003\u001c\u0005R\u0005H\u0005]\u0000U\u001fYL_\rP\u000fI\u0000]\u0018S\u001e\u001c\nN\u0003QLQ\tH\rx\rH\r\u0006L")).append(iOException.getMessage()).toString(), iOException);
            }
        }
    }

    public sprypm cfr_renamed_671() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_671();
        }
        return null;
    }

    public spraaf(sprqkm sprqkm2) {
        this.cfr_renamed_4 = sprqkm2;
    }

    public String cfr_renamed_675() {
        if (this.cfr_renamed_4 != null) {
            spraaf spraaf2 = this;
            return spraaf2.cfr_renamed_5383(spraaf2.cfr_renamed_4.cfr_renamed_5384());
        }
        return null;
    }

    public String cfr_renamed_678() {
        if (this.cfr_renamed_4 != null) {
            spraaf spraaf2 = this;
            return spraaf2.cfr_renamed_5383(spraaf2.cfr_renamed_4.cfr_renamed_5385());
        }
        return null;
    }
}

