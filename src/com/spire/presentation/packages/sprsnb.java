/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdlg;
import com.spire.presentation.packages.sprmqb;
import com.spire.presentation.packages.sprotb;
import com.spire.presentation.packages.sprpib;
import com.spire.presentation.packages.sprqbg;
import com.spire.presentation.packages.sprrlb;
import java.math.BigInteger;

public class sprsnb
extends sprmqb {
    public int cfr_renamed_3;
    public int cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprsnb(int n, int n2) {
        void arg0;
        sprsnb sprsnb2 = this;
        sprsnb2.cfr_renamed_4 = arg0;
        sprsnb2.cfr_renamed_3 = n2;
    }

    @Override
    public sprrlb cfr_renamed_1768(sprrlb arg0, BigInteger arg1) {
        int n;
        sprpib sprpib2 = arg0.cfr_renamed_1769();
        sprsnb sprsnb2 = this;
        sprpib sprpib3 = sprsnb2.cfr_renamed_1872(sprpib2, sprsnb2.cfr_renamed_4);
        sprpib sprpib4 = sprsnb2.cfr_renamed_1872(sprpib2, this.cfr_renamed_3);
        int[] nArray = sprotb.cfr_renamed_1812(arg1);
        sprrlb sprrlb2 = sprpib3.cfr_renamed_1770();
        sprrlb sprrlb3 = sprpib4.cfr_renamed_1873(arg0);
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < nArray.length) {
            int n4 = nArray[n];
            int n5 = n4 >> 16;
            sprrlb3 = sprrlb3.cfr_renamed_1771(n2 += n4 & 0xFFFF);
            sprrlb sprrlb4 = sprpib3.cfr_renamed_1873(sprrlb3);
            if (n5 < 0) {
                sprrlb4 = sprrlb4.cfr_renamed_1773();
            }
            sprrlb2 = sprrlb2.cfr_renamed_1772(sprrlb4);
            n2 = 1;
            n3 = ++n;
        }
        return sprpib2.cfr_renamed_1873(sprrlb2);
    }

    public sprsnb() {
        this(2, 4);
    }

    public sprpib cfr_renamed_1872(sprpib arg0, int arg1) {
        if (arg0.cfr_renamed_1874() == arg1) {
            return arg0;
        }
        if (!arg0.cfr_renamed_1875(arg1)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprqbg.cfr_renamed_9("sg_zTa^iDm\u0010{I{Dm](")).append(arg1).append(sprdlg.cfr_renamed_9("2h}r2ugvbi`rwb2dk&fn{u2egtdc")).toString());
        }
        return arg0.cfr_renamed_1876().cfr_renamed_1877(arg1).cfr_renamed_1631();
    }
}

