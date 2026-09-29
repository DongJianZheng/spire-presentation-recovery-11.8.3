/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcep;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprhz;
import com.spire.presentation.packages.sprilo;
import com.spire.presentation.packages.sprmcm;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sproeo;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryho;

@sprtea
public class sprefo
extends sprrzn
implements sprsr {
    @sprtea
    public sprefo(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprefo cfr_renamed_15962(String arg0) {
        String[] stringArray = new String[2];
        stringArray[0] = "Bookmark";
        stringArray[1] = sprmcm.cfr_renamed_9("R]eL");
        this.cfr_renamed_15546(stringArray);
        this.cfr_renamed_15271(new sproeo(arg0));
        return this;
    }

    @sprtea
    public sprefo(String string) {
        sprefo sprefo2 = this;
        sprefo2();
        sprefo2.cfr_renamed_15962(string);
    }

    @sprtea
    public sprefo cfr_renamed_15913(spryho arg0) {
        String[] stringArray = new String[2];
        stringArray[0] = "Bookmark";
        stringArray[1] = sprcep.cfr_renamed_9("Kq|`");
        this.cfr_renamed_15546(stringArray);
        this.cfr_renamed_15271(arg0);
        return this;
    }

    @sprtea
    public sprefo(spryho spryho2) {
        sprefo sprefo2 = this;
        sprefo2();
        sprefo2.cfr_renamed_15913(spryho2);
    }

    @sprtea
    public sprefo() {
        super(sprmcm.cfr_renamed_9("QWbW"));
    }

    @sprtea
    public sprhz cfr_renamed_4750() {
        sprdz<sprnco> sprdz2 = this.cfr_renamed_2445();
        if (sprdz2.size() != 1) {
            throw new IllegalArgumentException(sprcep.cfr_renamed_9("H{{{/\u4e39\u5424\u671d\u5915\u4e3e\u76e1\u6813\u4f42\u7f7a\u65ef\u6cc1\u7861\u5b8e"));
        }
        return sprilo.cfr_renamed_15686(sprdz2.cfr_renamed_12151(0));
    }
}

