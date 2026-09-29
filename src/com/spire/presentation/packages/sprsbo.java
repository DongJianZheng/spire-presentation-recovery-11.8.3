/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraco;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.spriln;
import com.spire.presentation.packages.sprjjn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprqgp;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtbo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvjn;
import com.spire.presentation.packages.sprxnn;
import java.util.Iterator;

@sprtea
public class sprsbo
extends sprsmn {
    private sprqgp cfr_renamed_0;
    private sprtbo cfr_renamed_1;
    private sprgeja cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprsuja cfr_renamed_4;

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        if (this.cfr_renamed_3) {
            this.cfr_renamed_13166(arg0.cfr_renamed_13167());
            this.cfr_renamed_3 = false;
        } else if (sprsuja.cfr_renamed_14755(this.cfr_renamed_4, arg0.cfr_renamed_13167())) {
            this.cfr_renamed_13168(arg0.cfr_renamed_13167());
        }
        sprsuja[] sprsujaArray = new sprsuja[]{arg0.cfr_renamed_13169(), arg0.cfr_renamed_13170(), arg0.cfr_renamed_13171()};
        this.cfr_renamed_13172(sprsujaArray);
        this.cfr_renamed_4 = arg0.cfr_renamed_13171();
    }

    private /* synthetic */ boolean cfr_renamed_15256(Object ... arg0) {
        int n;
        Object[] objectArray = arg0;
        int n2 = arg0.length;
        int n3 = n = 0;
        while (n3 < n2) {
            Object object = objectArray[n];
            if (object instanceof sprsuja && (Float.isNaN(((sprsuja)object).cfr_renamed_1980()) || Float.isNaN(((sprsuja)object).spr\u3181()))) {
                return false;
            }
            n3 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public sprsbo(sprgeja sprgeja2, sprqgp sprqgp2) {
        void arg0;
        sprsbo sprsbo2 = this;
        this.cfr_renamed_4 = sprsuja.cfr_renamed_13377();
        sprsbo2.cfr_renamed_2 = arg0;
        sprsbo2.cfr_renamed_0 = sprqgp2;
        sprsbo sprsbo3 = this;
        sprsbo2.cfr_renamed_1 = new sprtbo();
    }

    @Override
    public void cfr_renamed_13128(sprvjn arg0) {
        arg0.cfr_renamed_13121(this);
    }

    @Override
    public void cfr_renamed_13185(sprjjn arg0) {
        Iterator iterator;
        sprjjn sprjjn2;
        spriln spriln2 = (spriln)arg0.cfr_renamed_1769().get(0);
        if (this.cfr_renamed_3) {
            sprjjn2 = arg0;
            this.cfr_renamed_13166(spriln2.cfr_renamed_13167());
            this.cfr_renamed_3 = false;
        } else {
            if (sprsuja.cfr_renamed_14755(this.cfr_renamed_4, spriln2.cfr_renamed_13167())) {
                this.cfr_renamed_13168(spriln2.cfr_renamed_13167());
            }
            sprjjn2 = arg0;
        }
        Iterator iterator2 = iterator = sprjjn2.cfr_renamed_1769().iterator();
        while (iterator2.hasNext()) {
            spriln spriln3 = (spriln)iterator.next();
            sprsuja[] sprsujaArray = new sprsuja[3];
            iterator2 = iterator;
            sprsujaArray[0] = spriln3.cfr_renamed_13169();
            sprsujaArray[1] = spriln3.cfr_renamed_13170();
            sprsujaArray[2] = spriln3.cfr_renamed_13171();
            this.cfr_renamed_13172(sprsujaArray);
            this.cfr_renamed_4 = spriln3.cfr_renamed_13171();
        }
    }

    private /* synthetic */ void cfr_renamed_13172(sprsuja[] arg0) {
        sprsuja[] sprsujaArray = (sprsuja[])arg0.clone();
        sprsbo sprsbo2 = this;
        sprsbo2.cfr_renamed_0.cfr_renamed_13184(sprsujaArray);
        sprsuja sprsuja2 = new sprsuja(sprsujaArray[0].cfr_renamed_1980() - this.cfr_renamed_2.cfr_renamed_1980(), sprsujaArray[0].spr\u3181() - this.cfr_renamed_2.spr\u3181());
        sprsuja sprsuja3 = new sprsuja(sprsujaArray[1].cfr_renamed_1980() - this.cfr_renamed_2.cfr_renamed_1980(), sprsujaArray[1].spr\u3181() - this.cfr_renamed_2.spr\u3181());
        sprsuja sprsuja4 = new sprsuja(sprsujaArray[2].cfr_renamed_1980() - this.cfr_renamed_2.cfr_renamed_1980(), sprsujaArray[2].spr\u3181() - this.cfr_renamed_2.spr\u3181());
        sprsbo2.cfr_renamed_1.cfr_renamed_15257(spraco.cfr_renamed_15141(sprsuja2), spraco.cfr_renamed_15141(sprsuja3), spraco.cfr_renamed_15141(sprsuja4));
    }

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        sprsbo sprsbo2 = this;
        sprsbo2.cfr_renamed_3 = true;
        sprsbo2.cfr_renamed_4 = sprsuja.cfr_renamed_13377();
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (!this.cfr_renamed_3 && arg0.cfr_renamed_13174()) {
            this.cfr_renamed_2637();
        }
    }

    private /* synthetic */ void cfr_renamed_13166(sprsuja arg0) {
        sprsbo sprsbo2 = this;
        sprsuja sprsuja2 = sprsbo2.cfr_renamed_0.cfr_renamed_13791(arg0);
        sprsuja sprsuja3 = new sprsuja(sprsuja2.cfr_renamed_1980() - this.cfr_renamed_2.cfr_renamed_1980(), sprsuja2.spr\u3181() - this.cfr_renamed_2.spr\u3181());
        sprsbo2.cfr_renamed_1.cfr_renamed_15258(spraco.cfr_renamed_15141(sprsuja3));
    }

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        sprsuja[] sprsujaArray = arg0.cfr_renamed_13187().cfr_renamed_4529();
        Object[] objectArray = new Object[sprsujaArray.length];
        System.arraycopy(sprsujaArray, 0, objectArray, 0, sprsujaArray.length);
        if (this.cfr_renamed_15256(objectArray)) {
            int n;
            if (arg0.cfr_renamed_13187().cfr_renamed_11861() <= 0) {
                return;
            }
            int n2 = n = 0;
            while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
                if (this.cfr_renamed_3) {
                    sprsbo sprsbo2 = this;
                    sprfqn sprfqn2 = arg0;
                    this.cfr_renamed_13166(sprfqn2.cfr_renamed_13187().cfr_renamed_576(0));
                    sprsbo2.cfr_renamed_4 = sprfqn2.cfr_renamed_13187().cfr_renamed_576(0);
                    sprsbo2.cfr_renamed_3 = false;
                } else {
                    if (sprsuja.cfr_renamed_14755(this.cfr_renamed_4, arg0.cfr_renamed_13187().cfr_renamed_576(n))) {
                        this.cfr_renamed_13168(arg0.cfr_renamed_13187().cfr_renamed_576(n));
                    }
                    this.cfr_renamed_4 = arg0.cfr_renamed_13187().cfr_renamed_576(n);
                }
                n2 = ++n;
            }
        }
    }

    private /* synthetic */ void cfr_renamed_2637() {
        this.cfr_renamed_1.cfr_renamed_2637();
    }

    private /* synthetic */ void cfr_renamed_13168(sprsuja arg0) {
        sprsbo sprsbo2 = this;
        sprsuja sprsuja2 = sprsbo2.cfr_renamed_0.cfr_renamed_13791(arg0);
        sprsuja sprsuja3 = new sprsuja(sprsuja2.cfr_renamed_1980() - this.cfr_renamed_2.cfr_renamed_1980(), sprsuja2.spr\u3181() - this.cfr_renamed_2.spr\u3181());
        sprsbo2.cfr_renamed_1.cfr_renamed_15259(spraco.cfr_renamed_15141(sprsuja3));
    }

    @sprtea
    public sprtbo cfr_renamed_15260(sprgeja arg0) {
        sprtbo sprtbo2 = new sprtbo();
        sprsuja sprsuja2 = new sprsuja(arg0.cfr_renamed_1980() - this.cfr_renamed_2.cfr_renamed_1980(), arg0.spr\u3181() - this.cfr_renamed_2.spr\u3181());
        sprsuja sprsuja3 = new sprsuja(arg0.cfr_renamed_13341() - this.cfr_renamed_2.cfr_renamed_1980(), arg0.spr\u3181() - this.cfr_renamed_2.spr\u3181());
        sprsuja sprsuja4 = new sprsuja(arg0.cfr_renamed_13341() - this.cfr_renamed_2.cfr_renamed_1980(), arg0.cfr_renamed_13429() - this.cfr_renamed_2.spr\u3181());
        sprsuja sprsuja5 = new sprsuja(arg0.cfr_renamed_1980() - this.cfr_renamed_2.cfr_renamed_1980(), arg0.cfr_renamed_13429() - this.cfr_renamed_2.spr\u3181());
        sprtbo sprtbo3 = sprtbo2.cfr_renamed_15258(spraco.cfr_renamed_15141(sprsuja2));
        sprtbo sprtbo4 = sprtbo2;
        sprtbo2.cfr_renamed_15259(spraco.cfr_renamed_15141(sprsuja3));
        sprtbo4.cfr_renamed_15259(spraco.cfr_renamed_15141(sprsuja4));
        sprtbo2.cfr_renamed_15259(spraco.cfr_renamed_15141(sprsuja5));
        sprtbo2.cfr_renamed_2637();
        return sprtbo4;
    }

    @sprtea
    public sprtbo cfr_renamed_2609() {
        return this.cfr_renamed_1;
    }
}

