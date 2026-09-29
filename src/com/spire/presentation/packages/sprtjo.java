/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfno;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhbja;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwio;

@sprtea
public class sprtjo
extends sprfno {
    private sprhbja cfr_renamed_3;
    private sprhbja cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ void cfr_renamed_16727(int arg0) {
        if (this.cfr_renamed_3 != null) {
            return;
        }
        switch (arg0) {
            case 1: {
                this.cfr_renamed_3 = new sprhbja();
                return;
            }
            case 2: 
            case 3: 
            case 4: {
                this.cfr_renamed_3 = new sprhbja((sprgeja)((Object)this.cfr_renamed_4));
                return;
            }
            case 5: {
                return;
            }
        }
    }

    public void cfr_renamed_11665() {
        sprtjo sprtjo2 = this;
        sprtjo2.cfr_renamed_16728();
        sprtjo2.cfr_renamed_16782();
    }

    public sprtjo(sprgeja arg0) {
        super(arg0);
    }

    public void cfr_renamed_16360(sprhbja arg0, int arg1) {
        sprtjo sprtjo2;
        int n = arg1;
        this.cfr_renamed_16727(n);
        switch (n) {
            case 2: {
                sprtjo sprtjo3 = this;
                sprtjo2 = sprtjo3;
                sprtjo3.cfr_renamed_3.cfr_renamed_16665(arg0);
                break;
            }
            case 1: {
                sprtjo sprtjo4 = this;
                while (false) {
                }
                sprtjo2 = sprtjo4;
                sprtjo4.cfr_renamed_3.cfr_renamed_12499(arg0);
                break;
            }
            case 3: {
                sprtjo sprtjo5 = this;
                sprtjo2 = sprtjo5;
                sprtjo5.cfr_renamed_3.cfr_renamed_16663(arg0);
                break;
            }
            case 4: {
                sprtjo sprtjo6 = this;
                sprtjo2 = sprtjo6;
                sprtjo6.cfr_renamed_3.cfr_renamed_16666(arg0);
                break;
            }
            case 5: {
                sprtjo2 = this;
                this.cfr_renamed_16728();
                this.cfr_renamed_3 = arg0.cfr_renamed_12099();
                break;
            }
            default: {
                sprtjo2 = this;
            }
        }
        sprtjo2.cfr_renamed_16448();
        this.cfr_renamed_16442();
    }

    public void cfr_renamed_16373() {
        sprtjo sprtjo2;
        if (this.cfr_renamed_4 == null) {
            this.cfr_renamed_4 = this.cfr_renamed_3 != null ? this.cfr_renamed_3.cfr_renamed_12099() : null;
            sprtjo2 = this;
        } else {
            sprtjo sprtjo3 = this;
            sprtjo2 = sprtjo3;
            sprtjo3.cfr_renamed_4.cfr_renamed_12499(sprtjo3.cfr_renamed_3);
        }
        sprtjo2.cfr_renamed_16728();
    }

    public void cfr_renamed_41() {
        sprtjo sprtjo2 = this;
        sprtjo2.cfr_renamed_16728();
        sprtjo2.cfr_renamed_16448();
        sprtjo2.cfr_renamed_16442();
    }

    private /* synthetic */ void cfr_renamed_16782() {
        if (this.cfr_renamed_4 != null) {
            this.cfr_renamed_4.dispose();
        }
        this.cfr_renamed_4 = null;
    }

    @Override
    public sprhbja cfr_renamed_16443() {
        if (this.cfr_renamed_4 == null && this.cfr_renamed_3 == null) {
            return null;
        }
        if (this.cfr_renamed_4 == null) {
            return this.cfr_renamed_3.cfr_renamed_12099();
        }
        if (this.cfr_renamed_3 == null) {
            return this.cfr_renamed_4.cfr_renamed_12099();
        }
        sprhbja sprhbja2 = this.cfr_renamed_4.cfr_renamed_12099();
        sprhbja2.cfr_renamed_12499(this.cfr_renamed_3);
        return sprhbja2;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_16368(sprwio sprwio2) {
        void arg0;
        sprtjo sprtjo2 = this;
        void v1 = arg0;
        sprtjo sprtjo3 = this;
        sprtjo3.cfr_renamed_16728();
        sprtjo3.cfr_renamed_16782();
        this.cfr_renamed_3 = v1.cfr_renamed_16725();
        sprtjo2.cfr_renamed_4 = v1.cfr_renamed_16781();
        sprtjo2.cfr_renamed_16441(sprwio2.cfr_renamed_16726());
        sprtjo2.cfr_renamed_16442();
    }

    public sprwio cfr_renamed_16317() {
        sprtjo sprtjo2 = this;
        return new sprwio(sprtjo2.cfr_renamed_3, sprtjo2.cfr_renamed_4, this.cfr_renamed_16447());
    }

    public void cfr_renamed_16372(sprsuja arg0) {
        if (arg0.cfr_renamed_29()) {
            return;
        }
        if (this.cfr_renamed_3 == null) {
            return;
        }
        sprtjo sprtjo2 = this;
        sprtjo2.cfr_renamed_3.cfr_renamed_12629(arg0.cfr_renamed_1980(), arg0.spr\u3181());
        sprtjo2.cfr_renamed_16448();
        sprtjo2.cfr_renamed_16442();
    }

    private /* synthetic */ void cfr_renamed_16728() {
        if (this.cfr_renamed_3 != null) {
            this.cfr_renamed_3.dispose();
        }
        this.cfr_renamed_3 = null;
    }
}

