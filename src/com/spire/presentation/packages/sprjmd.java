/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraie;
import com.spire.presentation.packages.sprel;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprib;
import com.spire.presentation.packages.sprjkd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprnzha;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprrmd;
import com.spire.presentation.packages.sprtsa;
import com.spire.presentation.packages.sprtzd;
import java.io.IOException;

public class sprjmd
implements sprib {
    private byte[] cfr_renamed_0;
    private sprtzd cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private final sprlc cfr_renamed_4;

    public sprlc cfr_renamed_580() {
        return this.cfr_renamed_4;
    }

    public sprjmd(sprlc sprlc2) {
        this.cfr_renamed_4 = sprlc2;
    }

    @Override
    public void cfr_renamed_2342(sprel arg0) {
        sprrmd sprrmd2 = (sprrmd)arg0;
        sprjmd sprjmd2 = this;
        sprrmd sprrmd3 = sprrmd2;
        this.cfr_renamed_1 = sprrmd2.cfr_renamed_593();
        this.cfr_renamed_2 = sprrmd3.cfr_renamed_2398();
        sprjmd2.cfr_renamed_0 = sprrmd3.cfr_renamed_3383();
        sprjmd2.cfr_renamed_3 = sprrmd2.cfr_renamed_3905();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprjkd, IllegalArgumentException {
        int n;
        if (arg0.length - arg2 < arg1) {
            throw new sprjkd(sprnzha.cfr_renamed_9("\u001bp\u0000u\u0001qTg\u0001c\u0012`\u0006%\u0000j\u001b%\u0007h\u0015i\u0018"));
        }
        long l = arg2;
        int n2 = this.cfr_renamed_4.cfr_renamed_1218();
        if (l > 0x1FFFFFFFFL) {
            throw new IllegalArgumentException(spraie.cfr_renamed_9("\u0005.>+?/j7/5-/\"{>4%{&:8</"));
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
            sprjmd sprjmd2 = this;
            sprjmd2.cfr_renamed_4.cfr_renamed_1197(sprjmd2.cfr_renamed_0, 0, this.cfr_renamed_0.length);
            sprlre sprlre2 = new sprlre();
            sprlre sprlre3 = new sprlre();
            sprjmd sprjmd3 = this;
            sprlre3.cfr_renamed_49(sprjmd3.cfr_renamed_1);
            sprlre3.cfr_renamed_49(new sprlqe(sprtsa.cfr_renamed_453(n4)));
            sprlre2.cfr_renamed_49(new sprpse(sprlre3));
            if (sprjmd3.cfr_renamed_3 != null) {
                sprlre2.cfr_renamed_49(new sprhse(true, 0, new sprlqe(this.cfr_renamed_3)));
            }
            sprlre2.cfr_renamed_49(new sprhse(true, 2, new sprlqe(sprtsa.cfr_renamed_453(this.cfr_renamed_2))));
            try {
                byte[] byArray2 = new sprpse(sprlre2).cfr_renamed_104("DER");
                this.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
            }
            catch (IOException iOException) {
                throw new IllegalArgumentException(new StringBuilder().insert(0, sprnzha.cfr_renamed_9("\u0001k\u0015g\u0018`Tq\u001b%\u0011k\u0017j\u0010`Tu\u0015w\u0015h\u0011q\u0011wTl\u001ac\u001b?T")).append(iOException.getMessage()).toString());
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
}

