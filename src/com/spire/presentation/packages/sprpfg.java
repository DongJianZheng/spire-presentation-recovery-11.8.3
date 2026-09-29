/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraog;
import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.sprfpg;
import com.spire.presentation.packages.sprtiha;
import com.spire.presentation.packages.sprvpg;

public class sprpfg {
    private final int cfr_renamed_2;
    private final int cfr_renamed_3;
    private final sprfpg[] cfr_renamed_4;

    public sprpfg(sprvpg arg0) {
        int n;
        sprpfg sprpfg2 = this;
        this.cfr_renamed_3 = arg0.cfr_renamed_7055();
        sprpfg2.cfr_renamed_2 = arg0.cfr_renamed_7056();
        sprpfg2.cfr_renamed_4 = new sprfpg[this.cfr_renamed_3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            this.cfr_renamed_4[n++] = new sprfpg(arg0);
            n2 = n;
        }
    }

    private /* synthetic */ String cfr_renamed_7057() {
        int n;
        String string = "[";
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            string = new StringBuilder().insert(0, string).append(sprbtm.cfr_renamed_9("*!\u00111\u0017t(5\u0011&\f,E")).append(n).append(sprtiha.cfr_renamed_9("\u0014]")).toString();
            string = new StringBuilder().insert(0, string).append(this.cfr_renamed_4[n].toString()).toString();
            string = n == this.cfr_renamed_3 - 1 ? new StringBuilder().insert(0, string).append(sprbtm.cfr_renamed_9("\to")).toString() : new StringBuilder().insert(0, string).append(sprtiha.cfr_renamed_9("[\u0018\f")).toString();
            n2 = ++n;
        }
        string = new StringBuilder().insert(0, string).append(sprbtm.cfr_renamed_9("\to")).toString();
        return string;
    }

    public void cfr_renamed_7058(spraog arg0, sprfpg arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            arg0.cfr_renamed_6975(n).cfr_renamed_7059(this.cfr_renamed_4[n++], arg1);
            n2 = n;
        }
    }

    public void cfr_renamed_7060(byte[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < this.cfr_renamed_2) {
                this.cfr_renamed_4[n].cfr_renamed_6975(n3).cfr_renamed_7061(arg0, (short)((n << 8) + n3++));
                n4 = n3;
            }
            n2 = ++n;
        }
    }

    /*
     * WARNING - void declaration
     */
    public String cfr_renamed_2223(String string) {
        void arg0;
        return arg0.concat(sprtiha.cfr_renamed_9("<\u0014\f") + this.cfr_renamed_7057());
    }
}

