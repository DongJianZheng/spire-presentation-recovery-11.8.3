/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfdo;
import com.spire.presentation.packages.spribo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtsn;

@sprtea
public class sprjao
extends sprtsn {
    private int cfr_renamed_4;

    public spribo cfr_renamed_15354(String arg0) throws Exception {
        spribo spribo2 = new spribo(arg0, this);
        return (spribo)this.cfr_renamed_15335(arg0, spribo2);
    }

    /*
     * WARNING - void declaration
     */
    public sprjao(String string, sprtsn sprtsn2) {
        void arg1;
        void arg0;
        sprjao sprjao2 = this;
        super((String)arg0, (sprtsn)arg1);
        sprjao2.cfr_renamed_4 = 0;
        sprjao2.cfr_renamed_15343();
    }

    public spribo cfr_renamed_13485(int arg0) throws Exception {
        String string = new StringBuilder().insert(0, "Page_").append(arg0).toString();
        spribo spribo2 = new spribo(string, this);
        return (spribo)this.cfr_renamed_15335(string, spribo2);
    }

    public spribo cfr_renamed_15239() throws Exception {
        String string = new StringBuilder().insert(0, "Page_").append(this.cfr_renamed_4).toString();
        sprjao sprjao2 = this;
        ++sprjao2.cfr_renamed_4;
        spribo spribo2 = new spribo(string, this);
        return (spribo)sprjao2.cfr_renamed_15326(string, spribo2);
    }

    private /* synthetic */ void cfr_renamed_15343() {
        if (this.cfr_renamed_119.cfr_renamed_15309().size() > 0) {
            for (sprfdo sprfdo2 : this.cfr_renamed_119.cfr_renamed_15309()) {
                int n;
                if (!sprfdo2.cfr_renamed_313().startsWith("Page_") || this.cfr_renamed_4 > (n = Integer.parseInt(sprfdo2.cfr_renamed_313().replace("Page_", "")))) continue;
                this.cfr_renamed_4 = n + 1;
            }
        }
    }
}

