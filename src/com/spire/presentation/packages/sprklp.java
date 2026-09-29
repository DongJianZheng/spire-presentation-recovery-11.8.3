/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprpro;
import com.spire.presentation.packages.sprqep;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.sprxgp;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class sprklp
extends sprqep {
    private String cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    @sprtea
    public sprwvn cfr_renamed_14371() {
        block4: {
            if (sprznp.cfr_renamed_12328(this.cfr_renamed_3)) break block4;
            return new sprwvn();
        }
        try {
            Iterator iterator;
            sprwvn sprwvn2 = new sprwvn();
            sprklp sprklp2 = this;
            Iterator iterator2 = iterator = sprpro.cfr_renamed_17427(sprklp2.cfr_renamed_3, sprklp2.cfr_renamed_4).iterator();
            while (iterator2.hasNext()) {
                String string = (String)iterator.next();
                iterator2 = iterator;
                sprovja.cfr_renamed_11658(sprwvn2, new sprxgp(string));
            }
            return sprwvn2;
        }
        catch (Exception exception) {
            return new sprwvn();
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprklp(String string, boolean bl) {
        void arg0;
        sprklp sprklp2 = this;
        sprklp2.cfr_renamed_3 = arg0;
        sprklp2.cfr_renamed_4 = bl;
    }

    /*
     * WARNING - void declaration
     */
    public sprklp(String string, boolean bl, int n) {
        void arg0;
        void arg2;
        sprklp sprklp2 = this;
        super((int)arg2);
        sprklp2.cfr_renamed_3 = arg0;
        sprklp2.cfr_renamed_4 = bl;
    }

    public String cfr_renamed_19054() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_19055() {
        return this.cfr_renamed_4;
    }
}

