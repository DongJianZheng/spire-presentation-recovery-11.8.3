/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcz;
import com.spire.presentation.packages.spriln;
import com.spire.presentation.packages.sprlw;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprwvn;
import java.util.Iterator;

@sprtea
public class sprjjn
extends sprvjn
implements sprcz,
sprlw {
    private sprwvn cfr_renamed_3;
    private sprsuja cfr_renamed_4;

    @Override
    public sprvjn cfr_renamed_12099() {
        Iterator iterator;
        sprjjn sprjjn2 = new sprjjn();
        Iterator iterator2 = iterator = this.cfr_renamed_3.iterator();
        while (iterator2.hasNext()) {
            spriln spriln2 = (spriln)iterator.next();
            spriln spriln3 = new spriln();
            iterator2 = iterator;
            spriln spriln4 = spriln3;
            spriln4.cfr_renamed_13183(new sprsuja(spriln2.cfr_renamed_13167().cfr_renamed_1980(), spriln2.cfr_renamed_13167().spr\u3181()));
            spriln3.cfr_renamed_13621(new sprsuja(spriln2.cfr_renamed_13171().cfr_renamed_1980(), spriln2.cfr_renamed_13171().spr\u3181()));
            spriln4.cfr_renamed_13622(new sprsuja(spriln2.cfr_renamed_13169().cfr_renamed_1980(), spriln2.cfr_renamed_13169().spr\u3181()));
            spriln4.cfr_renamed_13623(new sprsuja(spriln2.cfr_renamed_13170().cfr_renamed_1980(), spriln2.cfr_renamed_13170().spr\u3181()));
            sprjjn2.cfr_renamed_13624(spriln4);
        }
        return sprjjn2;
    }

    public void cfr_renamed_13624(spriln arg0) {
        sprovja.cfr_renamed_11658(this.cfr_renamed_3, arg0);
    }

    @Override
    public void cfr_renamed_12624(sprqgp arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3.size()) {
            spriln spriln2 = (spriln)this.cfr_renamed_3.get(n);
            sprsuja[] sprsujaArray = new sprsuja[]{spriln2.cfr_renamed_13167(), spriln2.cfr_renamed_13169(), spriln2.cfr_renamed_13170(), spriln2.cfr_renamed_13171()};
            arg0.cfr_renamed_13184(sprsujaArray);
            spriln spriln3 = spriln2;
            spriln2.cfr_renamed_13183(sprsujaArray[0]);
            spriln2.cfr_renamed_13622(sprsujaArray[1]);
            spriln3.cfr_renamed_13623(sprsujaArray[2]);
            spriln3.cfr_renamed_13621(sprsujaArray[3]);
            n2 = ++n;
        }
    }

    @Override
    public void cfr_renamed_13121(sprsmn arg0) {
        arg0.cfr_renamed_13185(this);
    }

    @Override
    public sprvjn cfr_renamed_13616() {
        return this.cfr_renamed_12099();
    }

    public sprwvn cfr_renamed_1769() {
        return this.cfr_renamed_3;
    }

    public sprjjn() {
        sprjjn sprjjn2 = this;
        this.cfr_renamed_3 = new sprwvn();
        this.cfr_renamed_4 = null;
    }
}

