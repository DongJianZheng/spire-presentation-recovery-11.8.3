/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprczk;
import com.spire.presentation.packages.sprddl;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprook;
import com.spire.presentation.packages.sprpxe;
import com.spire.presentation.packages.sprqtp;
import com.spire.presentation.packages.sprts;
import com.spire.presentation.packages.sprut;
import com.spire.presentation.packages.sprvmz;
import com.spire.presentation.packages.sprwjl;

public class sprfbl
implements sprts {
    private byte[] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private int cfr_renamed_3;
    private sprgf cfr_renamed_4;

    @Override
    public int cfr_renamed_2341(byte[] arg0, int arg1, int arg2) throws sprddl, IllegalArgumentException {
        int n;
        if (arg0.length - arg2 < arg1) {
            throw new sprwjl(sprvmz.cfr_renamed_9(">i%l$hq~$z7y#<%s><\"q0p="));
        }
        long l = arg2;
        int n2 = this.cfr_renamed_4.cfr_renamed_1218();
        if (l > 0x1FFFFFFFFL) {
            throw new IllegalArgumentException(sprqtp.cfr_renamed_9("\u0016\u001b-\u001e,\u001ay\u0002<\u0000>\u001a1N-\u00016N5\u000f+\t<"));
        }
        int n3 = (int)((l + (long)n2 - 1L) / (long)n2);
        sprfbl sprfbl2 = this;
        byte[] byArray = new byte[sprfbl2.cfr_renamed_4.cfr_renamed_1218()];
        byte[] byArray2 = new byte[4];
        sprpxe.cfr_renamed_442(sprfbl2.cfr_renamed_3, byArray2, 0);
        int n4 = sprfbl2.cfr_renamed_3 & 0xFFFFFF00;
        int n5 = n = 0;
        while (n5 < n3) {
            byte[] byArray3;
            sprfbl sprfbl3 = this;
            sprfbl3.cfr_renamed_4.cfr_renamed_1197(sprfbl3.cfr_renamed_2, 0, this.cfr_renamed_2.length);
            this.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
            if (this.cfr_renamed_1 != null) {
                sprfbl sprfbl4 = this;
                sprfbl4.cfr_renamed_4.cfr_renamed_1197(sprfbl4.cfr_renamed_1, 0, this.cfr_renamed_1.length);
            }
            this.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
            if (arg2 > n2) {
                byArray3 = byArray2;
                System.arraycopy(byArray, 0, arg0, arg1, n2);
                arg1 += n2;
                arg2 -= n2;
            } else {
                System.arraycopy(byArray, 0, arg0, arg1, arg2);
                byArray3 = byArray2;
            }
            if ((byArray3[3] = (byte)(byArray3[3] + 1)) == 0) {
                sprpxe.cfr_renamed_442(n4 += 256, byArray2, 0);
            }
            n5 = ++n;
        }
        this.cfr_renamed_4.cfr_renamed_41();
        return (int)l;
    }

    /*
     * WARNING - void declaration
     */
    public sprfbl(int n, sprgf sprgf2) {
        void arg0;
        sprfbl sprfbl2 = this;
        sprfbl2.cfr_renamed_3 = arg0;
        sprfbl2.cfr_renamed_4 = sprgf2;
    }

    @Override
    public sprgf cfr_renamed_580() {
        return this.cfr_renamed_4;
    }

    @Override
    public void cfr_renamed_5671(sprut arg0) {
        if (arg0 instanceof sprook) {
            sprook sprook2 = (sprook)arg0;
            sprfbl sprfbl2 = this;
            sprfbl2.cfr_renamed_2 = sprook2.cfr_renamed_2343();
            sprfbl2.cfr_renamed_1 = sprook2.cfr_renamed_1205();
            return;
        }
        if (arg0 instanceof sprczk) {
            sprczk sprczk2 = (sprczk)arg0;
            sprfbl sprfbl3 = this;
            sprfbl3.cfr_renamed_2 = sprczk2.cfr_renamed_2113();
            sprfbl3.cfr_renamed_1 = null;
            return;
        }
        throw new IllegalArgumentException(sprvmz.cfr_renamed_9("\u001aX\u0017<!}#}<y%y#oqn4m$u#y5<7s#<6y?y#}%s#"));
    }
}

