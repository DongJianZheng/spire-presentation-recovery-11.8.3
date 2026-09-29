/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprqyo;
import com.spire.presentation.packages.sprtea;
import java.util.Iterator;

@sprtea
public class sprpto
implements Iterable {
    private spravp cfr_renamed_4;

    public sprpto() {
        sprpto sprpto2 = this;
        sprpto2.cfr_renamed_4 = new spravp(false);
    }

    public void cfr_renamed_2437(String arg0) {
        this.cfr_renamed_4.cfr_renamed_12927(arg0);
    }

    public void cfr_renamed_13275(sprqyo arg0) {
        if (!this.cfr_renamed_4.cfr_renamed_12143(arg0.cfr_renamed_313())) {
            this.cfr_renamed_4.cfr_renamed_12160(arg0.cfr_renamed_313(), arg0);
        }
    }

    public Iterator iterator() {
        return this.cfr_renamed_4.cfr_renamed_13435().iterator();
    }

    public boolean cfr_renamed_17136(String arg0) {
        return this.cfr_renamed_4.cfr_renamed_12431(arg0);
    }

    public sprqyo cfr_renamed_1600(String arg0) {
        return (sprqyo)this.cfr_renamed_4.cfr_renamed_12347(arg0);
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_4.size();
    }
}

