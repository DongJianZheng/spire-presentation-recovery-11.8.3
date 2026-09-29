/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprego;
import com.spire.presentation.packages.sprilo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spruzf;
import com.spire.presentation.packages.spryvn;

@sprtea
public class sprnno
extends sprrzn {
    @sprtea
    public sprnno cfr_renamed_15944(spryvn arg0) {
        sprnno sprnno2 = this;
        sprnno2.cfr_renamed_15555(arg0);
        return sprnno2;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprnno(sprego sprego2, sprsr sprsr2) {
        void arg1;
        sprnno sprnno2 = this;
        sprnno2();
        sprnno2.cfr_renamed_15945(sprego2).cfr_renamed_15946((sprsr)arg1);
    }

    @sprtea
    public sprnno cfr_renamed_15946(sprsr arg0) {
        String[] stringArray = new String[5];
        stringArray[0] = spruzf.cfr_renamed_9("\"\\>");
        stringArray[1] = sprovja.cfr_renamed_9("q W!F");
        stringArray[2] = spruzf.cfr_renamed_9("0a\u0003a6");
        stringArray[3] = sprovja.cfr_renamed_9("o T&G");
        stringArray[4] = spruzf.cfr_renamed_9("I\u0018z\u0018");
        this.cfr_renamed_15546(stringArray);
        this.cfr_renamed_15271((sprnco)((Object)arg0));
        return this;
    }

    @sprtea
    public sprnno() {
        super(sprovja.cfr_renamed_9("\u000eA;K L"));
    }

    @sprtea
    public sprsr cfr_renamed_4812() {
        sprdz<sprnco> sprdz2 = this.cfr_renamed_2445();
        if (sprdz2 == null || sprdz2.size() == 0) {
            throw new IllegalArgumentException(spruzf.cfr_renamed_9("\u956e\u8be1\u76f3O\u0014z\u001ea\u0019\u7edd\u67f3\uff02\u6cd6\u6707\u4e8c\u4f5b\u5b27\u828c\u70ce"));
        }
        return sprilo.cfr_renamed_15689(sprdz2.cfr_renamed_12151(0));
    }

    @sprtea
    public sprnno cfr_renamed_15945(sprego arg0) {
        sprnno sprnno2 = this;
        sprnno2.cfr_renamed_15480(sprovja.cfr_renamed_9("g9G!V"), arg0.toString());
        return sprnno2;
    }

    @sprtea
    public sprnno(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprego cfr_renamed_15947() {
        return sprego.cfr_renamed_141(this.cfr_renamed_15482(spruzf.cfr_renamed_9("2x\u0012`\u0003")));
    }

    @sprtea
    public spryvn cfr_renamed_8246() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprovja.cfr_renamed_9("\u001dG(K L"));
        if (sprnco2 == null) {
            return null;
        }
        return new spryvn(sprnco2);
    }
}

