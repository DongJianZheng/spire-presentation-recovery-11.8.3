/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprgqn;
import com.spire.presentation.packages.sprmho;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwln;
import java.util.Iterator;

@sprtea
public class sprpqn {
    private sprmho cfr_renamed_1;
    private spravp cfr_renamed_2;
    private sprmho cfr_renamed_3;
    private sprrgo cfr_renamed_4;

    public boolean cfr_renamed_13872(sprgqn arg0, Object arg1, boolean arg2) {
        sprmho sprmho2;
        if (arg2 && arg0.cfr_renamed_13188() >= this.cfr_renamed_4.cfr_renamed_13193()) {
            return false;
        }
        sprmho sprmho3 = sprmho2 = new sprmho();
        sprmho3.cfr_renamed_13873(arg0.cfr_renamed_13188() + 1);
        sprmho3.cfr_renamed_13874(arg1);
        this.cfr_renamed_13875(sprmho3);
        return true;
    }

    private /* synthetic */ void cfr_renamed_13875(sprmho arg0) {
        if (arg0.cfr_renamed_13876() <= this.cfr_renamed_3.cfr_renamed_13876()) {
            arg0.cfr_renamed_13877(null);
            return;
        }
        sprmho sprmho2 = arg0;
        sprmho2.cfr_renamed_13878(sprmho2.cfr_renamed_13876() <= this.cfr_renamed_4.cfr_renamed_13879());
        sprmho sprmho3 = arg0;
        while (sprmho3.cfr_renamed_13876() <= this.cfr_renamed_1.cfr_renamed_13876()) {
            sprmho3 = arg0;
            this.cfr_renamed_1 = this.cfr_renamed_1.cfr_renamed_8155();
        }
        if (this.cfr_renamed_4.cfr_renamed_13880()) {
            sprmho sprmho4 = arg0;
            while (sprmho4.cfr_renamed_13876() > this.cfr_renamed_1.cfr_renamed_13881() + 1) {
                sprmho sprmho5;
                sprmho sprmho6 = sprmho5 = new sprmho();
                this.cfr_renamed_1.cfr_renamed_13882(sprmho6);
                sprmho sprmho7 = sprmho5;
                sprmho7.cfr_renamed_13873(sprmho7.cfr_renamed_13881());
                sprmho6.cfr_renamed_13878(sprmho6.cfr_renamed_13881() <= this.cfr_renamed_4.cfr_renamed_13879());
                sprmho4 = arg0;
                this.cfr_renamed_1 = sprmho5;
            }
        }
        sprmho sprmho8 = arg0;
        this.cfr_renamed_1.cfr_renamed_13882(sprmho8);
        this.cfr_renamed_1 = sprmho8;
    }

    public boolean cfr_renamed_13883(sprgqn arg0, Object arg1) {
        return this.cfr_renamed_13872(arg0, arg1, false);
    }

    public boolean cfr_renamed_13884(sprwln arg0, Object arg1) {
        sprmho sprmho2;
        int n;
        int n2 = n = this.cfr_renamed_2.cfr_renamed_12143(arg0.cfr_renamed_313()) ? ((Integer)this.cfr_renamed_2.cfr_renamed_12347(arg0.cfr_renamed_313())).intValue() : this.cfr_renamed_4.cfr_renamed_13885();
        if (n == 0 || arg0.cfr_renamed_13279()) {
            return false;
        }
        sprmho sprmho3 = sprmho2 = new sprmho();
        sprmho3.cfr_renamed_13873(n);
        sprmho3.cfr_renamed_13874(arg1);
        this.cfr_renamed_13875(sprmho3);
        return true;
    }

    public sprpqn(sprrgo arg0) {
        sprpqn sprpqn2 = this;
        sprpqn sprpqn3 = this;
        sprpqn sprpqn4 = this;
        sprpqn3.cfr_renamed_2 = new spravp(false);
        sprpqn2.cfr_renamed_4 = arg0;
        sprpqn3.cfr_renamed_3 = new sprmho();
        sprpqn2.cfr_renamed_3.cfr_renamed_13873(0);
        sprpqn2.cfr_renamed_3.cfr_renamed_13886(0);
        sprpqn2.cfr_renamed_1 = sprpqn2.cfr_renamed_3;
        sprpqn2.cfr_renamed_13887();
    }

    public sprmho cfr_renamed_1411() {
        return this.cfr_renamed_3;
    }

    private /* synthetic */ void cfr_renamed_13887() {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_4.cfr_renamed_13888().iterator();
        while (iterator2.hasNext()) {
            sprnyja sprnyja2 = (sprnyja)iterator.next();
            String string = sprwln.cfr_renamed_13788((String)sprnyja2.getKey());
            iterator2 = iterator;
            this.cfr_renamed_2.cfr_renamed_13301(string, sprnyja2.getValue());
        }
    }
}

