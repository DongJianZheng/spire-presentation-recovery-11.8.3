/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfno;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprlfo;
import com.spire.presentation.packages.sprmwy;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprrfo
extends sprfno {
    private sprhbja cfr_renamed_4;

    public sprlfo cfr_renamed_16317() {
        return new sprlfo(this.cfr_renamed_4, this.cfr_renamed_16447());
    }

    private /* synthetic */ void cfr_renamed_16727(int arg0) {
        if (this.cfr_renamed_4 == null && arg0 != 0) {
            sprrfo sprrfo2 = this;
            sprrfo2.cfr_renamed_4 = new sprhbja();
        }
    }

    public void cfr_renamed_41() {
        sprrfo sprrfo2 = this;
        sprrfo2.cfr_renamed_16728();
        sprrfo2.cfr_renamed_16448();
        sprrfo2.cfr_renamed_16442();
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16723(sprlfo sprlfo2) {
        void arg0;
        sprrfo sprrfo2 = this;
        this.cfr_renamed_16728();
        sprrfo2.cfr_renamed_4 = arg0.cfr_renamed_16725();
        sprrfo2.cfr_renamed_16441(sprlfo2.cfr_renamed_16726());
        sprrfo2.cfr_renamed_16442();
    }

    public sprrfo(sprgeja arg0) {
        super(arg0);
    }

    public void cfr_renamed_11665() {
        this.cfr_renamed_16728();
    }

    private /* synthetic */ void cfr_renamed_16728() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.dispose();
        }
        this.cfr_renamed_4 = null;
    }

    public void cfr_renamed_16721(sprphja arg0) {
        if (arg0.cfr_renamed_29()) {
            return;
        }
        if (this.cfr_renamed_4 == null) {
            return;
        }
        sprrfo sprrfo2 = this;
        sprrfo2.cfr_renamed_4.cfr_renamed_12629(arg0.cfr_renamed_1942(), arg0.cfr_renamed_1452());
        sprrfo2.cfr_renamed_16448();
        sprrfo2.cfr_renamed_16442();
    }

    public void cfr_renamed_16360(sprhbja arg0, int arg1) {
        sprrfo sprrfo2;
        int n = arg1;
        this.cfr_renamed_16727(n);
        switch (n) {
            case 0: {
                sprrfo2 = this;
                while (false) {
                }
                this.cfr_renamed_16728();
                this.cfr_renamed_4 = arg0.cfr_renamed_12099();
                break;
            }
            case 1: {
                sprrfo sprrfo3 = this;
                sprrfo2 = sprrfo3;
                sprrfo3.cfr_renamed_4.cfr_renamed_12499(arg0);
                break;
            }
            case 2: {
                sprrfo sprrfo4 = this;
                sprrfo2 = sprrfo4;
                sprrfo4.cfr_renamed_4.cfr_renamed_16665(arg0);
                break;
            }
            case 3: {
                sprrfo sprrfo5 = this;
                sprrfo2 = sprrfo5;
                sprrfo5.cfr_renamed_4.cfr_renamed_16663(arg0);
                break;
            }
            case 4: {
                sprrfo sprrfo6 = this;
                sprrfo2 = sprrfo6;
                sprrfo6.cfr_renamed_4.cfr_renamed_16666(arg0);
                break;
            }
            case 5: {
                sprrfo sprrfo7 = this;
                sprrfo2 = sprrfo7;
                sprrfo7.cfr_renamed_4.cfr_renamed_16664(arg0);
                break;
            }
            default: {
                throw new IllegalArgumentException(sprmwy.cfr_renamed_9("7F\u0015F\nB\u0013B\u0015\u0007\tF\nB]\u0007\nH\u0003B"));
            }
        }
        sprrfo2.cfr_renamed_16448();
        this.cfr_renamed_16442();
    }

    @Override
    public sprhbja cfr_renamed_16443() {
        if (this.cfr_renamed_4 != null) {
            return this.cfr_renamed_4.cfr_renamed_12099();
        }
        return null;
    }
}

