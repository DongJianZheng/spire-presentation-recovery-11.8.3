/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprqwn;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvqo;
import com.spire.presentation.packages.sprxsp;
import com.spire.presentation.packages.spryzo;
import com.spire.presentation.packages.sprzyn;
import java.util.Iterator;

@sprtea
public class sprayn {
    private String cfr_renamed_91;
    private sprfzo cfr_renamed_0;
    private String cfr_renamed_1;
    private sprvqo cfr_renamed_2;
    private StringBuilder cfr_renamed_3;
    private boolean cfr_renamed_4;

    @sprtea
    public sprfzo cfr_renamed_13261() {
        return this.cfr_renamed_0;
    }

    @sprtea
    public sprvqo cfr_renamed_13411() {
        return this.cfr_renamed_2;
    }

    @sprtea
    public String cfr_renamed_14969() {
        return this.cfr_renamed_1;
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public sprayn(String string, String string2, boolean bl) {
        void arg0;
        void arg1;
        sprayn sprayn2 = this;
        sprayn sprayn3 = this;
        sprayn sprayn4 = this;
        sprayn3.cfr_renamed_3 = new StringBuilder();
        sprayn3.cfr_renamed_15099((String)arg1);
        sprayn2.cfr_renamed_15100((String)arg0);
        sprayn2.cfr_renamed_15101(bl);
    }

    @sprtea
    public void cfr_renamed_15102(sprfzo arg0) {
        this.cfr_renamed_0 = arg0;
    }

    @sprtea
    public void cfr_renamed_15100(String arg0) {
        this.cfr_renamed_1 = arg0;
    }

    @sprtea
    public void cfr_renamed_15101(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    @sprtea
    public String cfr_renamed_14083() {
        return this.cfr_renamed_91;
    }

    @sprtea
    public void cfr_renamed_15000(sprzyn arg0) throws Exception {
        new sprqwn(arg0).cfr_renamed_13486(this.cfr_renamed_2);
    }

    @sprtea
    public String cfr_renamed_14110(String arg0) {
        this.cfr_renamed_3.setLength(0);
        Iterator iterator = new sprcop(arg0).iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            if (this.cfr_renamed_2.cfr_renamed_13308(n) < 0) continue;
            sprghha.cfr_renamed_12279(this.cfr_renamed_3, sprxsp.cfr_renamed_12396(n));
        }
        return this.cfr_renamed_3.toString();
    }

    @sprtea
    public sprayn(sprfzo arg0) {
        sprayn sprayn2 = this;
        sprayn sprayn3 = this;
        sprayn3.cfr_renamed_3 = new StringBuilder();
        sprayn2.cfr_renamed_15099(arg0.cfr_renamed_13492());
        sprayn2.cfr_renamed_15100(arg0.cfr_renamed_13492());
        this.cfr_renamed_15101(false);
        this.cfr_renamed_0 = arg0;
        this.cfr_renamed_2 = new spryzo(arg0, false);
        this.cfr_renamed_2.cfr_renamed_13308(32);
    }

    @sprtea
    public boolean cfr_renamed_15103() {
        return this.cfr_renamed_4;
    }

    @sprtea
    public void cfr_renamed_15099(String arg0) {
        this.cfr_renamed_91 = arg0;
    }
}

