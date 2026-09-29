/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprjs;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnkb;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqje;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprwhl;
import com.spire.presentation.packages.sprwjl;
import com.spire.presentation.packages.sprycn;
import java.io.IOException;

public class sprbgl
implements sprjs {
    private int cfr_renamed_0;
    private sprlem cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final sprgf cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        int n;
        if (arg0.length - arg2 < arg1) {
            throw new sprwjl(sprnkb.cfr_renamed_9("k\u001cp\u0019q\u001d$\u000bq\u000fb\fvIp\u0006kIw\u0004e\u0005h"));
        }
        long l = arg2;
        int n2 = this.cfr_renamed_4.cfr_renamed_1218();
        if (l > 0x1FFFFFFFFL) {
            throw new IllegalArgumentException(sprqje.cfr_renamed_9("Rdiahe=}x\u007fzeu1i~r1qpovx"));
        }
        int n3 = (int)((l + (long)n2 - 1L) / (long)n2);
        byte[] byArray = new byte[this.cfr_renamed_4.cfr_renamed_1218()];
        int n4 = 1;
        int n5 = n = 0;
        while (true) {
            if (n5 >= n3) {
                this.cfr_renamed_4.cfr_renamed_41();
                return (int)l;
            }
            sprbgl sprbgl2 = this;
            sprbgl2.cfr_renamed_4.cfr_renamed_1197(sprbgl2.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            sprrvm sprrvm2 = new sprrvm();
            sprrvm sprrvm3 = new sprrvm();
            sprbgl sprbgl3 = this;
            sprrvm3.cfr_renamed_5004(sprbgl3.cfr_renamed_1);
            sprrvm3.cfr_renamed_5004(new sprfvg(sprpxe.cfr_renamed_453(n4)));
            sprrvm2.cfr_renamed_5004(new sprcen(sprrvm3));
            if (sprbgl3.cfr_renamed_3 != null) {
                sprrvm2.cfr_renamed_5004(new sprycn(true, 0, (sprco)new sprfvg(this.cfr_renamed_3)));
            }
            sprrvm2.cfr_renamed_5004(new sprycn(true, 2, (sprco)new sprfvg(sprpxe.cfr_renamed_453(this.cfr_renamed_0))));
            try {
                byte[] byArray2 = new sprcen(sprrvm2).cfr_renamed_104("DER");
                this.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprnkb.cfr_renamed_9("q\u0007e\u000bh\f$\u001dkIa\u0007g\u0006`\f$\u0019e\u001be\u0004a\u001da\u001b$\u0000j\u000fkS$")).append(iOException.getMessage()).toString());
            }
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            if (arg2 > n2) {
                System.arraycopy(byArray, 0, arg0, arg1, n2);
                arg1 += n2;
                arg2 -= n2;
            } else {
                System.arraycopy(byArray, 0, arg0, arg1, arg2);
            }
            ++n4;
            n5 = ++n;
        }
    }

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        sprwhl sprwhl2 = (sprwhl)arg0;
        sprbgl sprbgl2 = this;
        sprwhl sprwhl3 = sprwhl2;
        this.cfr_renamed_1 = sprwhl2.cfr_renamed_593();
        this.cfr_renamed_0 = sprwhl3.cfr_renamed_2398();
        sprbgl2.cfr_renamed_2 = sprwhl3.cfr_renamed_3383();
        sprbgl2.cfr_renamed_3 = sprwhl2.cfr_renamed_3905();
    }

    public sprbgl(sprgf sprgf2) {
        this.cfr_renamed_4 = sprgf2;
    }

    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_4;
    }
}

