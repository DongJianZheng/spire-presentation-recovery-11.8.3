/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprduk;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sprpen;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprrrd;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsnl;
import com.spire.presentation.packages.sprts;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprwhl;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprpel
implements sprts {
    private byte[] cfr_renamed_1;
    private sprts cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private int cfr_renamed_4;

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        sprwhl sprwhl2 = (sprwhl)arg0;
        sprpel sprpel2 = this;
        sprwhl sprwhl3 = sprwhl2;
        this.cfr_renamed_3 = sprwhl3.cfr_renamed_593();
        sprpel2.cfr_renamed_4 = sprwhl3.cfr_renamed_2398();
        sprpel2.cfr_renamed_1 = sprwhl2.cfr_renamed_3383();
    }

    /*
     * WARNING - void declaration
     */
    public sprpel(sprgf sprgf2) {
        void arg0;
        sprpel sprpel2 = this;
        sprpel2.cfr_renamed_2 = new sprduk((sprgf)arg0);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        sprrvm sprrvm2;
        if (arg1 + arg2 > arg0.length) {
            throw new sprddl(sprsnl.cfr_renamed_9("K,P)Q-\u0004;Q?B<VyP6KyW4E5H"));
        }
        sprrvm sprrvm3 = sprrvm2 = new sprrvm();
        sprrvm3.cfr_renamed_5004(new sprddm(this.cfr_renamed_3, sprpen.cfr_renamed_4));
        sprrvm3.cfr_renamed_5004(new sprycn(true, 2, (sprco)new sprfvg(sprpxe.cfr_renamed_453(this.cfr_renamed_4))));
        try {
            this.cfr_renamed_2.cfr_renamed_5671(new sprook(this.cfr_renamed_1, new sprcen(sprrvm2).cfr_renamed_104("DER")));
            return this.cfr_renamed_2.cfr_renamed_2341(arg0, arg1, arg2);
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprrrd.cfr_renamed_9("6$\"(//c>,j*$*>*+/#0/c!',yj")).append(iOException.getMessage()).toString());
        }
    }

    @Override
    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_2.cfr_renamed_580();
    }
}

