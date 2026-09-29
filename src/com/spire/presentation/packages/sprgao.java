/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcxn;
import com.spire.presentation.packages.sprhzn;
import com.spire.presentation.packages.sprjao;
import com.spire.presentation.packages.sprmlo;
import com.spire.presentation.packages.sprnco;
import com.spire.presentation.packages.sprnko;
import com.spire.presentation.packages.sprrgo;
import com.spire.presentation.packages.sprsoo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsn;
import com.spire.presentation.packages.sprxxda;

@sprtea
public class sprgao
extends sprtsn {
    private int cfr_renamed_4;

    public sprnko cfr_renamed_9196() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("Annotations.xml");
        if (sprnco2 == null) {
            return null;
        }
        return new sprnko(new sprnco(sprnco2));
    }

    public sprgao cfr_renamed_15371(sprnko arg0) {
        sprgao sprgao2 = this;
        sprgao2.cfr_renamed_15330("Annotations.xml", arg0);
        return sprgao2;
    }

    public sprjao cfr_renamed_15238() {
        sprjao sprjao2 = new sprjao("Pages", this);
        return (sprjao)this.cfr_renamed_15326("Pages", sprjao2);
    }

    public sprsoo cfr_renamed_15372() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("Document.xml");
        return new sprsoo(new sprnco(sprnco2));
    }

    public sprhzn cfr_renamed_15358() {
        sprhzn sprhzn2 = new sprhzn("Res", this);
        return (sprhzn)this.cfr_renamed_15326("Res", sprhzn2);
    }

    public sprmlo cfr_renamed_15373() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("PublicRes.xml");
        return new sprmlo(new sprnco(sprnco2));
    }

    public sprmlo cfr_renamed_15267() throws Exception {
        sprnco sprnco2 = this.cfr_renamed_15337("DocumentRes.xml");
        if (sprnco2 == null) {
            return null;
        }
        return new sprmlo(new sprnco(sprnco2));
    }

    public sprgao cfr_renamed_15237(sprmlo arg0) {
        sprgao sprgao2 = this;
        sprgao2.cfr_renamed_15330("DocumentRes.xml", arg0);
        return sprgao2;
    }

    public sprgao cfr_renamed_15251(byte[] arg0, String arg1) {
        sprgao sprgao2 = this;
        sprgao2.cfr_renamed_15358().cfr_renamed_15352(arg0, arg1);
        return sprgao2;
    }

    public Integer cfr_renamed_320() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprgao(String string, sprtsn sprtsn2) {
        void arg1;
        void arg0;
        sprgao sprgao2 = this;
        super((String)arg0, (sprtsn)arg1);
        sprgao2.cfr_renamed_4 = 0;
        String string2 = sprgao2.cfr_renamed_15248().replace("Doc_", "");
        try {
            this.cfr_renamed_4 = Integer.parseInt(string2);
            return;
        }
        catch (NumberFormatException numberFormatException) {
            this.cfr_renamed_722();
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprxxda.cfr_renamed_9("\u4e59\u5469\u6c81\u76e5\u65d3\u4e97\u76ba\u5f34\u5459\u7991\uff4e")).append(this.cfr_renamed_15248()).append(sprrgo.cfr_renamed_9("\uff3b\u76c8\u5f62\u542b\u79c7\u5eb2\u4e0d\u0006sITyy")).toString());
        }
    }

    public sprjao cfr_renamed_14426() {
        sprjao sprjao2 = new sprjao("Pages", this);
        return (sprjao)this.cfr_renamed_15335("Pages", sprjao2);
    }

    public sprcxn cfr_renamed_15374() {
        sprcxn sprcxn2 = new sprcxn("Signs", this);
        if (sprcxn2 == null) {
            return null;
        }
        return (sprcxn)this.cfr_renamed_15335("Signs", sprcxn2);
    }

    @Override
    public String cfr_renamed_15247(String arg0) {
        return new StringBuilder().insert(0, this.cfr_renamed_15248()).append('/').append(arg0).toString();
    }

    public sprgao cfr_renamed_15236(sprmlo arg0) {
        sprgao sprgao2 = this;
        sprgao2.cfr_renamed_15330("PublicRes.xml", arg0);
        return sprgao2;
    }

    @Override
    public String cfr_renamed_15327(String arg0) {
        return new StringBuilder().insert(0, this.cfr_renamed_15248()).append('/').append(arg0).toString();
    }

    public sprhzn cfr_renamed_15375() {
        sprhzn sprhzn2 = new sprhzn("Res", this);
        if (sprhzn2 == null) {
            return null;
        }
        return (sprhzn)this.cfr_renamed_15335("Res", sprhzn2);
    }

    public sprcxn cfr_renamed_15376() {
        sprcxn sprcxn2 = new sprcxn("Signs", this);
        return (sprcxn)this.cfr_renamed_15326("Signs", sprcxn2);
    }

    public sprgao cfr_renamed_15234(sprsoo arg0) {
        sprgao sprgao2 = this;
        sprgao2.cfr_renamed_15330("Document.xml", arg0);
        return sprgao2;
    }
}

