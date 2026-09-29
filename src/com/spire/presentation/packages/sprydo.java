/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbhja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsyia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.sprzdja;

@sprtea
public class sprydo {
    @sprtea
    public static final String cfr_renamed_3 = "\\";
    private sprzdja cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprydo(String string, String string2) {
        void arg0;
        String arg1;
        if (string2 == null) {
            arg1 = "";
        }
        sprzdja sprzdja2 = new sprzdja((String)arg0);
        if (!sprraia.cfr_renamed_12280(arg1)) {
            String string3 = sprzdja2.cfr_renamed_14083();
            sprzdja2 = new sprzdja(new StringBuilder().insert(0, string3).append(cfr_renamed_3).append(arg1).toString());
        }
        this.cfr_renamed_4 = sprzdja2;
        this.cfr_renamed_15299();
    }

    private /* synthetic */ void cfr_renamed_15299() {
        if (this.cfr_renamed_11663() && sprsyia.cfr_renamed_11642(this.cfr_renamed_4.cfr_renamed_14083())) {
            sprsyia.cfr_renamed_11888(this.cfr_renamed_4.cfr_renamed_14083());
            return;
        }
        if (!sprsyia.cfr_renamed_11642(this.cfr_renamed_4.cfr_renamed_15300())) {
            sprsyia.cfr_renamed_11888(this.cfr_renamed_4.cfr_renamed_15300());
        }
    }

    @sprtea
    public boolean cfr_renamed_15301() {
        return sprbhja.cfr_renamed_11642(this.cfr_renamed_4.cfr_renamed_14083()) || sprsyia.cfr_renamed_11642(this.cfr_renamed_4.cfr_renamed_14083());
    }

    @sprtea
    public boolean cfr_renamed_11663() {
        return "".equals(this.cfr_renamed_4.cfr_renamed_4780()) && new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_15300()).append(cfr_renamed_3).toString().equals(this.cfr_renamed_4.cfr_renamed_14083());
    }

    @sprtea
    public sprydo cfr_renamed_15302(String arg0) {
        String string = new StringBuilder().insert(0, this.cfr_renamed_4.cfr_renamed_15300()).append(cfr_renamed_3).append(arg0).toString();
        return new sprydo(string);
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprydo(String string) {
        void arg0;
        this.cfr_renamed_4 = new sprzdja((String)arg0);
        this.cfr_renamed_15299();
    }

    private /* synthetic */ void cfr_renamed_15303(String arg0, sprvrx arg1) {
        int n;
        String[] stringArray = sprsyia.cfr_renamed_15304(arg0);
        int n2 = stringArray.length;
        int n3 = n = 0;
        while (n3 < n2) {
            String string = stringArray[n];
            if (sprsyia.cfr_renamed_11642(string)) {
                this.cfr_renamed_15303(string, arg1);
            } else {
                arg1.add(string);
            }
            n3 = ++n;
        }
    }

    @sprtea
    public sprydo(sprzdja sprzdja2) {
        sprydo sprydo2 = this;
        sprydo2.cfr_renamed_4 = sprzdja2;
        sprydo2.cfr_renamed_15299();
    }

    @sprtea
    public void cfr_renamed_15305() {
        this.cfr_renamed_4.cfr_renamed_15305();
    }

    @sprtea
    public String cfr_renamed_15306() {
        return this.cfr_renamed_4.cfr_renamed_14083();
    }
}

