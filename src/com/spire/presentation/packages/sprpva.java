/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprq;
import com.spire.presentation.packages.sprqla;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sprpva
implements sprq {
    private List cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private String cfr_renamed_3;
    private static final List cfr_renamed_4 = Collections.unmodifiableList(new ArrayList());

    public byte[] cfr_renamed_480() {
        return this.cfr_renamed_2;
    }

    @Override
    public sprpva cfr_renamed_31() throws sprqla {
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprpva(String string, List list, byte[] byArray) {
        void arg1;
        void arg0;
        sprpva sprpva2 = this;
        this.cfr_renamed_3 = arg0;
        sprpva2.cfr_renamed_1 = Collections.unmodifiableList(arg1);
        sprpva2.cfr_renamed_2 = byArray;
    }

    public sprpva(String arg0, byte[] arg1) {
        this(arg0, cfr_renamed_4, arg1);
    }

    public String cfr_renamed_324() {
        return this.cfr_renamed_3;
    }

    public List cfr_renamed_479() {
        return this.cfr_renamed_1;
    }
}

