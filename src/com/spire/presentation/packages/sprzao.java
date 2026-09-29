/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToPdfOption;
import com.spire.presentation.packages.sprbtaa;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.sprxao;

@sprtea
public class sprzao
extends sprtsn {
    private Integer cfr_renamed_4;

    public sprzao cfr_renamed_15348(sprxao arg0) {
        sprzao sprzao2 = this;
        sprzao2.cfr_renamed_15330("Signature.xml", arg0);
        return sprzao2;
    }

    public sprxao cfr_renamed_79() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("Signature.xml");
        return new sprxao(sprnco2);
    }

    public spreen cfr_renamed_15349() throws Exception {
        sprzao sprzao2 = this;
        return sprzao2.cfr_renamed_15324(sprzao2.cfr_renamed_15247("Seal.esl"));
    }

    public Integer cfr_renamed_320() {
        return this.cfr_renamed_4;
    }

    public spreen cfr_renamed_15350() throws Exception {
        sprzao sprzao2 = this;
        return sprzao2.cfr_renamed_15324(sprzao2.cfr_renamed_15247("SignedValue.dat"));
    }

    public sprzao cfr_renamed_15351(byte[] arg0, String arg1) {
        sprzao sprzao2 = this;
        sprzao2.cfr_renamed_15331(arg0, arg1);
        return sprzao2;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprzao(String string, sprtsn sprtsn2) throws Exception {
        void arg1;
        void arg0;
        sprzao sprzao2 = this;
        super((String)arg0, (sprtsn)arg1);
        sprzao2.cfr_renamed_4 = 0;
        String string2 = sprzao2.cfr_renamed_15248().replace("Sign_", "");
        try {
            this.cfr_renamed_4 = Integer.parseInt(string2);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            this.cfr_renamed_722();
            throw new IllegalArgumentException(new StringBuilder().insert(0, SaveToPdfOption.cfr_renamed_9("\u4e63\u544d\u6cbb\u76c1\u65e9\u4eb3\u7680\u5f10\u5463\u79b5\uff74")).append(this.cfr_renamed_15248()).append(sprbtaa.cfr_renamed_9("\uff44\u76ec\u5f1d\u540f\u79b8\u5e96\u4e72\"\u001bk/l\u0017L")).toString());
        }
    }
}

