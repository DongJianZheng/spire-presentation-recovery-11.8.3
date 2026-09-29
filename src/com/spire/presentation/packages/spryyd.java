/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprdh;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprkae;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprnql;
import com.spire.presentation.packages.sprpa;
import com.spire.presentation.packages.sprriq;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprume;
import java.io.OutputStream;

public class spryyd {
    public static final sprije cfr_renamed_3 = new sprije(sprdh.cfr_renamed_86, sprume.cfr_renamed_3);
    public sprkae cfr_renamed_4;

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    /*
     * WARNING - void declaration
     */
    public spryyd(spruhe spruhe2) {
        void arg0;
        spryyd spryyd2 = this;
        spryyd2.cfr_renamed_4 = new sprkae((spruhe)arg0);
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof spryyd)) {
            return false;
        }
        spryyd spryyd2 = (spryyd)arg0;
        return this.cfr_renamed_4.equals(spryyd2.cfr_renamed_4);
    }

    public sprkae cfr_renamed_94() {
        return this.cfr_renamed_4;
    }

    public spryyd(sprkae sprkae2) {
        this.cfr_renamed_4 = sprkae2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spryyd(sprdce arg0, sprpa arg1) throws sprbud {
        try {
            if (!arg1.cfr_renamed_615().equals(cfr_renamed_3)) {
                throw new IllegalArgumentException(sprnql.cfr_renamed_9(")l*{fQ\u000eCk3fa'lf`#\"3q#ffu/v.\"\u0014g5r\u000fF"));
            }
            OutputStream outputStream = arg1.cfr_renamed_470();
            outputStream.write(arg0.cfr_renamed_2314().cfr_renamed_81());
            outputStream.close();
            spryyd spryyd2 = this;
            spryyd2.cfr_renamed_4 = new sprkae(new sprlqe(arg1.cfr_renamed_580()));
            return;
        }
        catch (Exception exception) {
            throw new sprbud(new StringBuilder().insert(0, sprriq.cfr_renamed_9("~DaTbSc\u0016mDkWz_`Q.\u007fJ\f.")).append(exception).toString(), exception);
        }
    }
}

