/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprcvf;
import com.spire.presentation.packages.sprcwf;
import com.spire.presentation.packages.sprexf;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprguf;
import com.spire.presentation.packages.sprjcg;
import com.spire.presentation.packages.sprjxf;
import com.spire.presentation.packages.sprjzf;
import com.spire.presentation.packages.sprncg;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprweg;
import com.spire.presentation.packages.sprydg;
import java.security.SecureRandom;

public class sprqyf
implements sprgm {
    private sprjzf cfr_renamed_2;
    private SecureRandom cfr_renamed_3;
    private sprcvf cfr_renamed_4;

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                this.cfr_renamed_4 = (sprcvf)((sprbgk)arg1).cfr_renamed_284();
                this.cfr_renamed_3 = ((sprbgk)arg1).cfr_renamed_1295();
                return;
            }
            this.cfr_renamed_4 = (sprcvf)arg1;
            return;
        }
        this.cfr_renamed_2 = (sprjzf)arg1;
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        sprncg sprncg2 = this.cfr_renamed_2.cfr_renamed_284().cfr_renamed_143();
        sprncg2.cfr_renamed_148(this.cfr_renamed_2.cfr_renamed_2113());
        sprydg sprydg2 = new sprydg();
        sprncg sprncg3 = sprncg2;
        sprncg sprncg4 = sprncg2;
        sprncg sprncg5 = sprncg2;
        sprexf sprexf2 = new sprexf(sprncg3.cfr_renamed_112, sprncg4.cfr_renamed_152, sprncg4.cfr_renamed_93, sprncg5.cfr_renamed_0, sprncg5.cfr_renamed_102, sprncg2.cfr_renamed_2, arg1);
        byte[] byArray = sprexf2.cfr_renamed_3353();
        sprweg[] sprwegArray = sprexf2.cfr_renamed_5996();
        sprjcg[] sprjcgArray = sprexf2.cfr_renamed_5997();
        sprcwf sprcwf2 = sprncg3.cfr_renamed_5998(byArray, this.cfr_renamed_2.cfr_renamed_2113(), this.cfr_renamed_2.cfr_renamed_1411(), arg0);
        byte[] byArray2 = sprcwf2.cfr_renamed_2;
        long l = sprcwf2.cfr_renamed_4;
        int n = sprcwf2.cfr_renamed_3;
        sprydg sprydg3 = sprydg2;
        sprydg sprydg4 = sprydg2;
        sprydg sprydg5 = sprydg2;
        sprydg5.cfr_renamed_5986(3);
        sprydg5.cfr_renamed_5999(0);
        sprydg4.cfr_renamed_6000(l);
        sprydg3.cfr_renamed_5987(n);
        byte[] byArray3 = new sprguf(sprncg2).cfr_renamed_6001(sprwegArray, byArray2, this.cfr_renamed_2.cfr_renamed_2113(), sprydg2);
        sprydg4.cfr_renamed_5986(2);
        sprydg3.cfr_renamed_5999(0);
        sprydg3.cfr_renamed_6000(l);
        sprydg3.cfr_renamed_5987(n);
        return new sprjxf(sprncg2, null, this.cfr_renamed_2.cfr_renamed_2113()).cfr_renamed_6002(byArray3, sprjcgArray, this.cfr_renamed_2.cfr_renamed_2113(), l, n, this.cfr_renamed_2.cfr_renamed_1411());
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] cfr_renamed_125(byte[] byArray) {
        int n;
        void arg0;
        sprncg sprncg2 = this.cfr_renamed_4.cfr_renamed_284().cfr_renamed_143();
        sprqyf sprqyf2 = this;
        sprncg2.cfr_renamed_148(sprqyf2.cfr_renamed_4.cfr_renamed_3.cfr_renamed_3);
        byte[] byArray2 = new byte[sprncg2.cfr_renamed_112];
        if (sprqyf2.cfr_renamed_3 != null) {
            this.cfr_renamed_3.nextBytes(byArray2);
        } else {
            System.arraycopy(this.cfr_renamed_4.cfr_renamed_3.cfr_renamed_3, 0, byArray2, 0, byArray2.length);
        }
        sprguf sprguf2 = new sprguf(sprncg2);
        sprncg sprncg3 = sprncg2;
        byte[] byArray3 = sprncg3.cfr_renamed_6003(this.cfr_renamed_4.cfr_renamed_4.cfr_renamed_3, byArray2, (byte[])arg0);
        sprcwf sprcwf2 = sprncg3.cfr_renamed_5998(byArray3, this.cfr_renamed_4.cfr_renamed_3.cfr_renamed_3, this.cfr_renamed_4.cfr_renamed_3.cfr_renamed_4, (byte[])arg0);
        byte[] byArray4 = sprcwf2.cfr_renamed_2;
        long l = sprcwf2.cfr_renamed_4;
        int n2 = sprcwf2.cfr_renamed_3;
        sprydg sprydg2 = new sprydg();
        sprguf sprguf3 = sprguf2;
        sprydg sprydg3 = sprydg2;
        sprydg2.cfr_renamed_5986(3);
        sprydg3.cfr_renamed_6000(l);
        sprydg3.cfr_renamed_5987(n2);
        sprweg[] sprwegArray = sprguf3.cfr_renamed_5985(byArray4, this.cfr_renamed_4.cfr_renamed_4.cfr_renamed_4, this.cfr_renamed_4.cfr_renamed_3.cfr_renamed_3, sprydg2);
        sprydg sprydg4 = sprydg2 = new sprydg();
        sprydg2.cfr_renamed_5986(3);
        sprydg4.cfr_renamed_6000(l);
        sprydg4.cfr_renamed_5987(n2);
        byte[] byArray5 = sprguf3.cfr_renamed_6001(sprwegArray, byArray4, this.cfr_renamed_4.cfr_renamed_3.cfr_renamed_3, sprydg2);
        new sprydg().cfr_renamed_5986(2);
        byte[] byArray6 = new sprjxf(sprncg2, this.cfr_renamed_4.cfr_renamed_2113(), this.cfr_renamed_4.cfr_renamed_5769()).cfr_renamed_6004(byArray5, l, n2);
        byte[][] byArrayArray = new byte[sprwegArray.length + 2][];
        byte[][] byArrayArray2 = byArrayArray;
        byArrayArray[0] = byArray3;
        int n3 = n = 0;
        while (n3 != sprwegArray.length) {
            byArrayArray2[1 + n] = sproze.cfr_renamed_543(sprwegArray[++n].cfr_renamed_4, sproze.cfr_renamed_1120(sprwegArray[n].cfr_renamed_3));
            n3 = n;
        }
        byArrayArray2[byArrayArray2.length - 1] = byArray6;
        return sproze.cfr_renamed_1120(byArrayArray2);
    }
}

