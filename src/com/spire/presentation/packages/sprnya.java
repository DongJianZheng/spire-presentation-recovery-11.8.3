/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraje;
import com.spire.presentation.packages.sprayd;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprfdb;
import com.spire.presentation.packages.sprfxa;
import com.spire.presentation.packages.sprhky;
import com.spire.presentation.packages.sprjgka;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprm;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sproce;
import com.spire.presentation.packages.sprua;
import com.spire.presentation.packages.sprxue;

public class sprnya {
    private sprbne cfr_renamed_4;

    public sprfdb[] cfr_renamed_1448() {
        int n;
        sprfdb[] sprfdbArray = new sprfdb[this.cfr_renamed_4.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_4.cfr_renamed_84()) {
            int n3 = n;
            sprfdb sprfdb2 = new sprfdb(spraje.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_85(n)));
            sprfdbArray[n3] = sprfdb2;
            n2 = ++n;
        }
        return sprfdbArray;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprnya(sproce sproce2, sprua sprua2) throws sprfxa {
        void arg0;
        if (!sproce2.cfr_renamed_696().equals(sprm.cfr_renamed_1449)) {
            throw new IllegalArgumentException(sprhky.cfr_renamed_9("9\u0013?\u000f%\r(\u001889=\t=].\u0018-\b5\u000f9\u000e|\u001e3\u0013/\t.\b?\t3\u000f|\n5\t4]8\u0018?\u000f%\r(\u0012.S"));
        }
        sprayd sprayd2 = new sprayd(sprnte.cfr_renamed_23(arg0));
        try {
            void arg1;
            this.cfr_renamed_4 = sprbne.cfr_renamed_23(sprayd2.cfr_renamed_1450((sprua)arg1));
            return;
        }
        catch (sprlqd sprlqd2) {
            throw new sprfxa(new StringBuilder().insert(0, sprjgka.cfr_renamed_9("\u0017-\u0003!\u000e&B7\rc\u0007;\u00161\u0003 \u0016c\u0006\"\u0016\"Xc")).append(sprlqd2.getMessage()).toString(), sprlqd2);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprnya(sproce sproce2) {
        void arg0;
        if (sproce2.cfr_renamed_696().equals(sprm.cfr_renamed_1449)) {
            throw new IllegalArgumentException(sprjgka.cfr_renamed_9("\u0007-\u00011\u001b3\u0016&\u0006\u0007\u00037\u0003c\u0010&\u00136\u000b1\u00070B \r-\u00117\u00106\u00017\r1B4\u000b7\nc\u0006&\u00011\u001b3\u0016,\u0010m"));
        }
        this.cfr_renamed_4 = sprbne.cfr_renamed_23(sprxue.cfr_renamed_23(arg0.cfr_renamed_480()).cfr_renamed_186());
    }
}

