/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjaaa;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprpkja;
import com.spire.presentation.packages.sprpon;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprrzn;
import com.spire.presentation.packages.sprsr;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzjo;

@sprtea
public class sprpho
extends sprrzn
implements sprsr {
    @sprtea
    public sprpho cfr_renamed_15269(sprzjo arg0) {
        sprpho sprpho2 = this;
        sprpho2.cfr_renamed_15480(sprjaaa.cfr_renamed_9("\u001d\u0004<\u000e:\u0013,\u0004\u0006%"), arg0.toString());
        return sprpho2;
    }

    @sprtea
    public sprpho(sprnco arg0) {
        super(arg0);
    }

    @sprtea
    public sprpho cfr_renamed_15950(Boolean arg0) {
        if (arg0 == null) {
            sprpho sprpho2 = this;
            sprpho2.cfr_renamed_15492(sprpon.cfr_renamed_9("[oyoh~"));
            return sprpho2;
        }
        sprpho sprpho3 = this;
        sprpho3.cfr_renamed_15480(sprjaaa.cfr_renamed_9("\u001d\u0004?\u0004.\u0015"), sprpkja.cfr_renamed_15716(arg0));
        return sprpho3;
    }

    @sprtea
    public Boolean cfr_renamed_15951() {
        String string = this.cfr_renamed_15482(sprpon.cfr_renamed_9("Ypdjb{ege|y"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public sprzjo cfr_renamed_15697() {
        return sprzjo.cfr_renamed_141(this.cfr_renamed_15482(sprjaaa.cfr_renamed_9("\u001d\u0004<\u000e:\u0013,\u0004\u0006%")));
    }

    @sprtea
    public sprpho(sprzjo sprzjo2) {
        sprpho sprpho2 = this;
        sprpho2();
        sprpho2.cfr_renamed_15269(sprzjo2);
    }

    @sprtea
    public sprpho cfr_renamed_15952(Boolean arg0) {
        if (arg0 == null) {
            sprpho sprpho2 = this;
            sprpho2.cfr_renamed_15492(sprpon.cfr_renamed_9("Ypdjb{ege|y"));
            return sprpho2;
        }
        sprpho sprpho3 = this;
        sprpho3.cfr_renamed_15480(sprjaaa.cfr_renamed_9("26\u000f,\t=\u000e!\u000e:\u0012"), sprpkja.cfr_renamed_15716(arg0));
        return sprpho3;
    }

    @sprtea
    public Boolean cfr_renamed_15953() {
        String string = this.cfr_renamed_15482(sprpon.cfr_renamed_9("[oyoh~"));
        if (sprriia.cfr_renamed_15321(string, null) || sprraia.cfr_renamed_12806(string).length() == 0) {
            return false;
        }
        return Boolean.parseBoolean(string);
    }

    @sprtea
    public Integer cfr_renamed_15954() {
        return Integer.parseInt(this.cfr_renamed_15482(sprjaaa.cfr_renamed_9("\u0019\u000e#\u0014\"\u0004")));
    }

    @sprtea
    public sprpho() {
        super(sprpon.cfr_renamed_9("Yf\u007fgn"));
    }

    @sprtea
    public sprpho cfr_renamed_15955(int arg0) {
        arg0 = Math.max(arg0, 0);
        sprpho sprpho2 = this;
        sprpho2.cfr_renamed_15480(sprjaaa.cfr_renamed_9("\u0019\u000e#\u0014\"\u0004"), sprpkja.cfr_renamed_15512(arg0 %= 100));
        return sprpho2;
    }
}

