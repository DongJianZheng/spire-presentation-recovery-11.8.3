/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.spreue;
import com.spire.presentation.packages.sprite;
import com.spire.presentation.packages.sprmpe;
import com.spire.presentation.packages.sprnme;
import com.spire.presentation.packages.sprnsc;
import com.spire.presentation.packages.sprnzc;
import com.spire.presentation.packages.sprrxc;
import com.spire.presentation.packages.sprtie;
import com.spire.presentation.packages.spruxc;
import com.spire.presentation.packages.sprvve;
import com.spire.presentation.packages.sprxse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class spruvc
extends sprnsc {
    private List cfr_renamed_4 = new ArrayList();

    public void cfr_renamed_2584(sprtie arg0) {
        this.cfr_renamed_4.add(new sprmpe(new sprnme(arg0)));
    }

    public spruvc() {
        super(new sprvve(sprite.cfr_renamed_4));
    }

    public sprnzc cfr_renamed_1451() throws spruxc {
        spruvc spruvc2 = this;
        spreue spreue2 = new spreue(spruvc2.cfr_renamed_4.toArray(new sprmpe[spruvc2.cfr_renamed_4.size()]));
        return this.cfr_renamed_2581(spreue2);
    }

    public void cfr_renamed_2585(sprrxc arg0) {
        this.cfr_renamed_4.add(arg0.cfr_renamed_568());
    }

    public void cfr_renamed_2586(sprcyd arg0) {
        this.cfr_renamed_4.add(new sprmpe(new sprnme(0, arg0.cfr_renamed_568())));
    }

    public void cfr_renamed_2582(Date arg0) {
        ((sprvve)((Object)this.cfr_renamed_4)).cfr_renamed_2583(new sprxse(arg0));
    }
}

