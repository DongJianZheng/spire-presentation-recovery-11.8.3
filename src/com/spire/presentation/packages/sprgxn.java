/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.sprjyc;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprreha;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprxao;
import java.util.Iterator;

@sprtea
public class sprgxn
extends sprrzn {
    @sprtea
    public sprgxn cfr_renamed_15544(sprxao arg0) {
        if (arg0 == null) {
            return this;
        }
        sprgxn sprgxn2 = this;
        sprgxn2.cfr_renamed_15271(arg0);
        return sprgxn2;
    }

    @sprtea
    public sprgxn cfr_renamed_15545(String arg0) {
        String[] stringArray = new String[1];
        stringArray[0] = sprreha.cfr_renamed_9("\u0014\r!?0\u000b7%=");
        this.cfr_renamed_15546(stringArray);
        if (!sprriia.cfr_renamed_15321(arg0, null)) {
            this.cfr_renamed_15421(sprjyc.cfr_renamed_9("@Yukd_cqi"), arg0);
        }
        return this;
    }

    @sprtea
    public sprgxn(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public String cfr_renamed_15547() {
        sprnco sprnco2 = this.cfr_renamed_15494(sprreha.cfr_renamed_9("\u0014\r!?0\u000b7%="));
        if (sprnco2 == null) {
            return null;
        }
        return sprnco2.cfr_renamed_15548();
    }

    @sprtea
    public sprdz cfr_renamed_7802() {
        Iterator iterator;
        sprdz sprdz2 = this.cfr_renamed_15477(sprjyc.cfr_renamed_9("^QjVlLxJh"));
        sprvrx<sprxao> sprvrx2 = new sprvrx<sprxao>(sprdz2.size());
        sprxao sprxao2 = null;
        Iterator iterator2 = iterator = sprdz2.iterator();
        while (iterator2.hasNext()) {
            sprnco sprnco2 = (sprnco)iterator.next();
            sprxao2 = new sprxao(sprnco2);
            iterator2 = iterator;
            sprvrx2.cfr_renamed_12808(sprxao2);
        }
        return sprvrx2;
    }

    @sprtea
    public sprgxn() {
        super(sprreha.cfr_renamed_9("?0\u000b7\r-\u0019+\t*"));
    }
}

