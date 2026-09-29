/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlie;
import java.util.Enumeration;
import java.util.Hashtable;

public class spryde {
    public int cfr_renamed_4;

    public int cfr_renamed_4690() {
        return this.cfr_renamed_4;
    }

    public spryde() {
        this.cfr_renamed_4 = 0;
    }

    public String cfr_renamed_4691(Hashtable arg0) {
        sprlie sprlie2 = new sprlie(this, " ");
        Enumeration enumeration = arg0.keys();
        while (enumeration.hasMoreElements()) {
            Integer n = (Integer)enumeration.nextElement();
            if (!this.cfr_renamed_4692(n)) continue;
            sprlie2.cfr_renamed_4693((String)arg0.get(n));
        }
        return sprlie2.toString();
    }

    public boolean cfr_renamed_4692(int arg0) {
        return (this.cfr_renamed_4 & arg0) != 0;
    }

    public void cfr_renamed_4694(int arg0) {
        this.cfr_renamed_4 |= arg0;
    }

    public spryde(int n) {
        spryde spryde2 = this;
        spryde2.cfr_renamed_4 = 0;
        spryde2.cfr_renamed_4 = n;
    }
}

