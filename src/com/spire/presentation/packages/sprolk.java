/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprapm;
import com.spire.presentation.packages.sprcik;
import com.spire.presentation.packages.sprevm;
import com.spire.presentation.packages.sprfqm;
import com.spire.presentation.packages.sprirm;
import com.spire.presentation.packages.sprngk;
import com.spire.presentation.packages.sprnom;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprvgk;
import com.spire.presentation.packages.sprwum;
import com.spire.presentation.packages.sprzmk;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class sprolk
extends sprngk {
    private List cfr_renamed_4 = new ArrayList();

    public sprzmk cfr_renamed_1451() throws sprvgk {
        sprolk sprolk2 = this;
        sprirm sprirm2 = new sprirm(sprolk2.cfr_renamed_4.toArray(new sprfqm[sprolk2.cfr_renamed_4.size()]));
        return this.cfr_renamed_9831(sprirm2);
    }

    public void cfr_renamed_9832(sprcik arg0) {
        this.cfr_renamed_4.add(arg0.cfr_renamed_568());
    }

    public void cfr_renamed_2582(Date arg0) {
        this.cfr_renamed_2.cfr_renamed_9829(new sprnom(arg0));
    }

    public sprolk() {
        super(new sprapm(sprwum.cfr_renamed_0));
    }

    public void cfr_renamed_9833(sprrdm arg0) {
        this.cfr_renamed_4.add(new sprfqm(new sprevm(arg0)));
    }

    public void cfr_renamed_9834(sprtpl arg0) {
        this.cfr_renamed_4.add(new sprfqm(new sprevm(0, arg0.cfr_renamed_568())));
    }
}

