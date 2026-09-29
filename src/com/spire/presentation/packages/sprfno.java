/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprepn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprqwo;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprrp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxln;
import java.util.Iterator;

@sprtea
public abstract class sprfno {
    private sprwvn cfr_renamed_2;
    private sprxln cfr_renamed_3;
    public sprgeja cfr_renamed_4;

    public sprfno(sprgeja sprgeja2) {
        sprfno sprfno2 = this;
        this.cfr_renamed_2 = new sprwvn();
        this.cfr_renamed_4 = sprgeja2;
    }

    public void cfr_renamed_16441(sprxln arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public void cfr_renamed_16442() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_2.iterator();
        while (iterator2.hasNext()) {
            ((sprrp)iterator.next()).cfr_renamed_16437();
            iterator2 = iterator;
        }
    }

    public boolean cfr_renamed_16439() {
        return this.cfr_renamed_16440() != null && this.cfr_renamed_16440().cfr_renamed_11861() == 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public sprxln cfr_renamed_16440() {
        if (this.cfr_renamed_3 != null) {
            return this.cfr_renamed_3;
        }
        sprhbja sprhbja2 = this.cfr_renamed_16443();
        try {
            if (sprhbja2 == null) {
                sprxln sprxln2 = null;
                return sprxln2;
            }
            this.cfr_renamed_3 = sprqwo.cfr_renamed_16444(sprhbja2);
            if (sprfno.cfr_renamed_16445(this.cfr_renamed_3)) {
                sprhbja sprhbja3 = sprhbja2;
                sprhbja3.cfr_renamed_16446(this.cfr_renamed_4);
                this.cfr_renamed_3 = sprqwo.cfr_renamed_16444(sprhbja3);
            }
            sprxln sprxln3 = this.cfr_renamed_3;
            return sprxln3;
        }
        finally {
            if (sprhbja2 != null) {
                sprhbja2.dispose();
            }
        }
    }

    private static /* synthetic */ boolean cfr_renamed_16445(sprxln arg0) {
        sprgeja sprgeja2 = new sprepn().cfr_renamed_13544(arg0);
        float f = 4000000.0f;
        return sprrgga.cfr_renamed_13562(sprgeja2.cfr_renamed_13430()) > f || sprrgga.cfr_renamed_13562(sprgeja2.cfr_renamed_13342()) > f || sprrgga.cfr_renamed_13562(sprgeja2.cfr_renamed_13341()) > f || sprrgga.cfr_renamed_13562(sprgeja2.cfr_renamed_13429()) > f;
    }

    public sprxln cfr_renamed_16447() {
        return this.cfr_renamed_3;
    }

    public abstract sprhbja cfr_renamed_16443();

    public sprwvn cfr_renamed_16424() {
        return this.cfr_renamed_2;
    }

    public void cfr_renamed_16448() {
        this.cfr_renamed_3 = null;
    }
}

