/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcop;
import com.spire.presentation.packages.sprfzo;
import com.spire.presentation.packages.sprluo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxsp;

@sprtea
public abstract class sprnpo {
    private sprfzo cfr_renamed_119;
    private boolean cfr_renamed_91;
    private boolean cfr_renamed_0;
    private int cfr_renamed_1;
    private sprcop cfr_renamed_2;
    private String cfr_renamed_3;
    private int cfr_renamed_4;

    public sprfzo cfr_renamed_17064() {
        return this.cfr_renamed_119;
    }

    public boolean cfr_renamed_15064() {
        sprnpo sprnpo2 = this;
        this.cfr_renamed_4 += sprnpo2.cfr_renamed_1;
        if (sprnpo2.cfr_renamed_4 >= this.cfr_renamed_3.length()) {
            return false;
        }
        sprnpo sprnpo3 = this;
        sprnpo sprnpo4 = sprnpo3;
        int n = sprnpo3.cfr_renamed_4;
        String string = sprnpo3.cfr_renamed_3.substring(n);
        sprnpo3.cfr_renamed_2.cfr_renamed_15489(string);
        while (sprnpo4.cfr_renamed_2.hasNext()) {
            sprnpo sprnpo5 = this;
            int n2 = sprnpo5.cfr_renamed_2.cfr_renamed_17065();
            int n3 = sprxsp.cfr_renamed_17066(n2);
            sprnpo5.cfr_renamed_119 = sprnpo5.cfr_renamed_17067(n2);
            if (sprluo.cfr_renamed_17068(n2, this.cfr_renamed_119)) {
                if (n != this.cfr_renamed_4) {
                    sprnpo sprnpo6 = this;
                    sprnpo6.cfr_renamed_1 = n - this.cfr_renamed_4;
                    sprnpo6.cfr_renamed_91 = false;
                    return true;
                }
                sprnpo sprnpo7 = this;
                sprnpo7.cfr_renamed_1 = n3;
                sprnpo7.cfr_renamed_91 = true;
                this.cfr_renamed_0 = sprluo.cfr_renamed_17069(n2, this.cfr_renamed_119);
                return true;
            }
            n += n3;
            sprnpo4 = this;
        }
        this.cfr_renamed_1 = this.cfr_renamed_3.length() - this.cfr_renamed_4;
        this.cfr_renamed_91 = false;
        this.cfr_renamed_0 = false;
        return true;
    }

    public sprnpo(String string) {
        sprnpo sprnpo2 = this;
        this.cfr_renamed_2 = new sprcop("");
        this.cfr_renamed_3 = string;
        this.cfr_renamed_41();
    }

    public String cfr_renamed_13030() {
        sprnpo sprnpo2 = this;
        sprnpo sprnpo3 = this;
        return sprnpo2.cfr_renamed_3.substring(sprnpo2.cfr_renamed_4, sprnpo3.cfr_renamed_4 + sprnpo3.cfr_renamed_1);
    }

    private /* synthetic */ void cfr_renamed_41() {
        sprnpo sprnpo2 = this;
        sprnpo sprnpo3 = this;
        this.cfr_renamed_4 = 0;
        sprnpo3.cfr_renamed_1 = 0;
        sprnpo3.cfr_renamed_119 = null;
        sprnpo2.cfr_renamed_91 = false;
        sprnpo2.cfr_renamed_0 = false;
    }

    public void cfr_renamed_17070(String arg0) {
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_41();
    }

    public abstract sprfzo cfr_renamed_17067(int var1);

    public boolean cfr_renamed_17071() {
        return this.cfr_renamed_0;
    }

    public boolean cfr_renamed_17072() {
        return this.cfr_renamed_91;
    }
}

