/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spreuh;
import com.spire.presentation.packages.sprgvda;
import com.spire.presentation.packages.sprqxk;
import com.spire.presentation.packages.sprtpa;
import com.spire.presentation.packages.sprzph;
import com.spire.presentation.packages.sprzuk;

public class spruok
implements sprbj {
    private final sprzuk cfr_renamed_0;
    private final sprzuk cfr_renamed_1;
    private final boolean cfr_renamed_2;
    private final spreuh cfr_renamed_3;
    private final spreuh cfr_renamed_4;

    public sprzuk cfr_renamed_2095() {
        return this.cfr_renamed_0;
    }

    public spreuh cfr_renamed_9974() {
        return this.cfr_renamed_3;
    }

    public spreuh cfr_renamed_9975() {
        return this.cfr_renamed_4;
    }

    public boolean cfr_renamed_9976() {
        return this.cfr_renamed_2;
    }

    /*
     * WARNING - void declaration
     */
    public spruok(boolean bl, sprzuk sprzuk2, sprzuk sprzuk3) {
        void arg0;
        void arg1;
        void arg2;
        if (sprzuk2 == null) {
            throw new NullPointerException(sprtpa.cfr_renamed_9("\u0017\u000f\u0005\u000f\r\u00184\t\r\r\u0005\u000f\u00010\u0001\u0002D\u0018\u0005\u0015\n\u0014\u0010[\u0006\u001eD\u0015\u0011\u0017\b"));
        }
        if (arg2 == null) {
            throw new NullPointerException(sprgvda.cfr_renamed_9("\u0003d\u000eq\u000bq\u0014u\nD\u0014}\u0010u\u0012q-q\u001f4\u0005u\bz\t`Fv\u00034\ba\nx"));
        }
        sprqxk sprqxk2 = arg1.cfr_renamed_284();
        if (!sprqxk2.equals(arg2.cfr_renamed_284())) {
            throw new IllegalArgumentException(sprtpa.cfr_renamed_9("(\u0010\u001a\u0010\u0012\u0007[\u0005\u0015\u0000[\u0001\u000b\f\u001e\t\u001e\u0016\u001a\b[\u0014\t\r\r\u0005\u000f\u0001[\u000f\u001e\u001d\bD\u0013\u0005\r\u0001[\u0000\u0012\u0002\u001d\u0001\t\u0001\u0015\u0010[\u0000\u0014\t\u001a\r\u0015D\u000b\u0005\t\u0005\u0016\u0001\u000f\u0001\t\u0017"));
        }
        sprzph sprzph2 = new sprzph();
        spruok spruok2 = this;
        spruok spruok3 = this;
        this.cfr_renamed_2 = arg0;
        spruok3.cfr_renamed_0 = arg1;
        spruok3.cfr_renamed_3 = sprzph2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), arg1.cfr_renamed_2112()).cfr_renamed_1775();
        spruok2.cfr_renamed_1 = arg2;
        spruok2.cfr_renamed_4 = sprzph2.cfr_renamed_8926(sprqxk2.cfr_renamed_1145(), arg2.cfr_renamed_2112()).cfr_renamed_1775();
    }

    public sprzuk cfr_renamed_2094() {
        return this.cfr_renamed_1;
    }
}

