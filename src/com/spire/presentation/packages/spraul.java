/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprceea;
import com.spire.presentation.packages.sprdpm;
import com.spire.presentation.packages.sprdtm;
import com.spire.presentation.packages.sprfto;
import com.spire.presentation.packages.sprfum;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhmm;
import com.spire.presentation.packages.sprjtm;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprkxl;
import com.spire.presentation.packages.sprrnl;
import com.spire.presentation.packages.sprsom;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprxpm;

public class spraul {
    private sprktm cfr_renamed_1;
    private sprfvg cfr_renamed_2;
    private sprfum cfr_renamed_3;
    private sprhmm cfr_renamed_4;

    public spraul cfr_renamed_10973(byte[] arg0) {
        if (this.cfr_renamed_2 != null) {
            throw new IllegalStateException(sprceea.cfr_renamed_9("8r9g%y9rj~$q%7+{8r+s379r>"));
        }
        this.cfr_renamed_2 = new sprfvg(arg0);
        return this;
    }

    public spraul cfr_renamed_10974(sprkxl arg0) {
        if (this.cfr_renamed_3 != null) {
            throw new IllegalStateException(sprfto.cfr_renamed_9("2a#p8b8g0p4$8jqv4w!k?w4$0h#a0`($\"a%"));
        }
        this.cfr_renamed_3 = new sprfum(new sprdpm(new sprdtm(sprjtm.cfr_renamed_23(arg0.cfr_renamed_568().cfr_renamed_480()))));
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public spraul(sprktm sprktm2, sprhmm sprhmm2) {
        void arg0;
        spraul spraul2 = this;
        spraul2.cfr_renamed_1 = arg0;
        spraul2.cfr_renamed_4 = sprhmm2;
    }

    public sprrnl cfr_renamed_1451() {
        spraul spraul2 = this;
        spraul spraul3 = this;
        return new sprrnl(new sprsom(spraul2.cfr_renamed_1, spraul2.cfr_renamed_4, spraul3.cfr_renamed_3, spraul3.cfr_renamed_2));
    }

    public spraul cfr_renamed_10975(sprxpm arg0) {
        if (this.cfr_renamed_3 != null) {
            throw new IllegalStateException(sprceea.cfr_renamed_9(")r8c#q#t+c/7#yje/d:x$d/7+{8r+s379r>"));
        }
        this.cfr_renamed_3 = new sprfum(new sprdpm(arg0));
        return this;
    }

    public spraul cfr_renamed_10976(sprtpl arg0) {
        if (this.cfr_renamed_3 != null) {
            throw new IllegalStateException(sprfto.cfr_renamed_9("2a#p8b8g0p4$8jqv4w!k?w4$0h#a0`($\"a%"));
        }
        this.cfr_renamed_3 = new sprfum(new sprdpm(new sprxpm(arg0.cfr_renamed_568())));
        return this;
    }
}

