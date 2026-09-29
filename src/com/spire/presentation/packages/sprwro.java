/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprpop;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprwro {
    private String cfr_renamed_152;
    public static final String cfr_renamed_112 = "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/certificate";
    private String cfr_renamed_119;
    public static final String cfr_renamed_91 = "http://schemas.openxmlformats.org/package/2006/digital-signature";
    private String cfr_renamed_0;
    private boolean cfr_renamed_1;
    public static final String cfr_renamed_2 = "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/signature";
    public static final String cfr_renamed_3 = "http://schemas.microsoft.com/office/2006/digsig";
    public static final String cfr_renamed_4 = "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin";

    public boolean cfr_renamed_17126() {
        return this.cfr_renamed_1;
    }

    public String cfr_renamed_19() {
        return this.cfr_renamed_0;
    }

    /*
     * WARNING - void declaration
     */
    public sprwro(String string, String string2, String string3, boolean bl) {
        void arg2;
        void arg1;
        void arg0;
        sprwro sprwro2 = this;
        sprwro sprwro3 = this;
        sprpop.cfr_renamed_12469((String)arg0, "id");
        sprpop.cfr_renamed_12469((String)arg1, "type");
        sprpop.cfr_renamed_12469((String)arg2, "target");
        sprwro3.cfr_renamed_0 = arg0;
        sprwro3.cfr_renamed_119 = arg2;
        sprwro2.cfr_renamed_152 = arg1;
        sprwro2.cfr_renamed_1 = bl;
    }

    public String cfr_renamed_324() {
        return this.cfr_renamed_152;
    }

    public String cfr_renamed_4750() {
        return this.cfr_renamed_119;
    }
}

