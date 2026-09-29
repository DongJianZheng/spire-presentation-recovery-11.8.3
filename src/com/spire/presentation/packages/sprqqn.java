/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprfkn;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprlpn;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprrxg;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtpn;
import com.spire.presentation.packages.sprwon;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprykn;
import java.util.Iterator;

@sprtea
public abstract class sprqqn
extends sprbln {
    private sprwvn cfr_renamed_4;

    public void cfr_renamed_14679(spryjn arg0) {
        Iterator iterator;
        if (this.cfr_renamed_4.size() == 0) {
            return;
        }
        arg0.cfr_renamed_11835(sprrxg.cfr_renamed_9("tv{f"));
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            ((sprwon)iterator.next()).cfr_renamed_14680(arg0);
            iterator2 = iterator;
            arg0.cfr_renamed_14055();
        }
        arg0.cfr_renamed_11835("]");
    }

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            ((sprwon)iterator.next()).cfr_renamed_14681(arg0);
            iterator2 = iterator;
        }
    }

    public sprqqn(sprgdo sprgdo2) {
        super(sprgdo2);
        sprqqn sprqqn2 = this;
        sprqqn2.cfr_renamed_4 = new sprwvn();
    }

    public void cfr_renamed_14685(sprfkn arg0) {
        arg0.cfr_renamed_14686(this);
        sprykn sprykn2 = new sprykn(arg0);
        sprqqn sprqqn2 = this;
        sprykn2.cfr_renamed_14684(sprqqn2);
        sprovja.cfr_renamed_11658(sprqqn2.cfr_renamed_4, sprykn2);
    }

    public sprwvn cfr_renamed_480() {
        return this.cfr_renamed_4;
    }

    public void cfr_renamed_14687(sprbln arg0, String arg1) {
        sprtpn sprtpn2 = new sprtpn(arg0, arg1);
        sprqqn sprqqn2 = this;
        sprtpn2.cfr_renamed_14684(sprqqn2);
        sprovja.cfr_renamed_11658(sprqqn2.cfr_renamed_4, sprtpn2);
    }

    public void cfr_renamed_14688(int arg0, String arg1) {
        sprlpn sprlpn2 = new sprlpn(arg0, arg1);
        sprqqn sprqqn2 = this;
        sprlpn2.cfr_renamed_14684(sprqqn2);
        sprovja.cfr_renamed_11658(sprqqn2.cfr_renamed_4, sprlpn2);
    }
}

