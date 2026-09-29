/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboe;
import com.spire.presentation.packages.sprng;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprcle
implements sprng {
    private byte[] cfr_renamed_1;
    private String cfr_renamed_2;
    private List cfr_renamed_3;
    private static final List cfr_renamed_4 = Collections.unmodifiableList(new ArrayList());

    /*
     * WARNING - void declaration
     */
    public sprcle(String string, List list, byte[] byArray) {
        void arg1;
        void arg0;
        sprcle sprcle2 = this;
        this.cfr_renamed_2 = arg0;
        sprcle2.cfr_renamed_3 = Collections.unmodifiableList(arg1);
        sprcle2.cfr_renamed_1 = byArray;
    }

    public sprcle(String arg0, byte[] arg1) {
        this(arg0, cfr_renamed_4, arg1);
    }

    public String cfr_renamed_324() {
        return this.cfr_renamed_2;
    }

    public List cfr_renamed_479() {
        return this.cfr_renamed_3;
    }

    @Override
    public sprcle cfr_renamed_31() throws sprboe {
        return this;
    }

    public byte[] cfr_renamed_480() {
        return this.cfr_renamed_1;
    }
}

