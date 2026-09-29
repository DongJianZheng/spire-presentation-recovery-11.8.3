/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhzn;
import com.spire.presentation.packages.sprizda;
import com.spire.presentation.packages.sprjuy;
import com.spire.presentation.packages.sprmlo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.spryko;
import com.spire.presentation.packages.sprzlo;

@sprtea
public class spribo
extends sprtsn {
    private int cfr_renamed_4;

    public spribo cfr_renamed_15242(sprzlo arg0) {
        spribo spribo2 = this;
        spribo2.cfr_renamed_15330("Content.xml", arg0);
        return spribo2;
    }

    public spribo cfr_renamed_15355(spryko arg0) {
        spribo spribo2 = this;
        spribo2.cfr_renamed_15330("Annotation.xml", arg0);
        return spribo2;
    }

    public spribo cfr_renamed_15356(sprmlo arg0) {
        spribo spribo2 = this;
        spribo2.cfr_renamed_15330("PageRes.xml", arg0);
        return spribo2;
    }

    public sprhzn cfr_renamed_15357() {
        sprhzn sprhzn2 = new sprhzn("Res", this);
        return (sprhzn)this.cfr_renamed_15335("Res", sprhzn2);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spribo(String string, sprtsn sprtsn2) throws Exception {
        void arg1;
        void arg0;
        spribo spribo2 = this;
        super((String)arg0, (sprtsn)arg1);
        spribo2.cfr_renamed_4 = 0;
        String string2 = spribo2.cfr_renamed_15248().replace("Page_", "");
        try {
            this.cfr_renamed_4 = Integer.parseInt(string2);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            this.cfr_renamed_722();
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprjuy.cfr_renamed_9("\u4e52\u540d\u6c8a\u7681\u65d8\u4ef3\u76b1\u5f50\u5452\u79f5\uff45")).append(this.cfr_renamed_15248()).append(sprizda.cfr_renamed_9("\uff0e\u76ae\u5f57\u544d\u79f2\u5ed4\u4e38`R!e%]\u000e")).toString());
        }
    }

    public sprzlo cfr_renamed_480() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("Content.xml");
        return new sprzlo(new sprnco(sprnco2));
    }

    public spribo cfr_renamed_15251(byte[] arg0, String arg1) {
        spribo spribo2 = this;
        spribo2.cfr_renamed_15358().cfr_renamed_15352(arg0, arg1);
        return spribo2;
    }

    public spryko cfr_renamed_15359() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("Annotation.xml");
        return new spryko(new sprnco(sprnco2));
    }

    public sprmlo cfr_renamed_15360() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("PageRes.xml");
        if (sprnco2 == null) {
            return null;
        }
        return new sprmlo(new sprnco(sprnco2));
    }

    public Integer cfr_renamed_320() {
        return this.cfr_renamed_4;
    }

    public sprhzn cfr_renamed_15358() {
        sprhzn sprhzn2 = new sprhzn("Res", this);
        return (sprhzn)this.cfr_renamed_15326("Res", sprhzn2);
    }
}

