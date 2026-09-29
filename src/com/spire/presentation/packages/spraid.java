/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprff;
import com.spire.presentation.packages.sprgnd;
import com.spire.presentation.packages.sprnjd;
import com.spire.presentation.packages.sprpjd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spryez;
import com.spire.presentation.packages.spryn;
import com.spire.presentation.packages.spryrb;
import java.security.SecureRandom;

public class spraid
implements spryn {
    private sprnjd cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprgnd cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_1217(boolean bl, sprt sprt2) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprt2 instanceof spraed) {
            spraed spraed2 = (spraed)arg1;
            spraid spraid2 = this;
            spraid2.cfr_renamed_2 = spraed2.cfr_renamed_1295();
            spraid2.cfr_renamed_1 = (sprnjd)spraed2.cfr_renamed_284();
            return;
        }
        if (arg0 != false) {
            spraid spraid3 = this;
            spraid3.cfr_renamed_2 = new SecureRandom();
        }
        this.cfr_renamed_1 = (sprnjd)arg1;
    }

    /*
     * WARNING - void declaration
     */
    public spraid(sprff sprff2) {
        void arg0;
        spraid spraid2 = this;
        spraid2.cfr_renamed_3 = new sprgnd((sprff)arg0);
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprpjd {
        int n;
        int n2;
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(spryez.cfr_renamed_9("S{I4NqI4[{O4HzJf\\dM}Ss"));
        }
        int n3 = this.cfr_renamed_3.cfr_renamed_1195();
        if (arg2 < 2 * n3) {
            throw new sprpjd(spryrb.cfr_renamed_9("\rL\u0014W\u0010\u0002\u0010M\u000b\u0002\u0017J\u000bP\u0010"));
        }
        byte[] byArray = new byte[arg2];
        byte[] byArray2 = new byte[n3];
        System.arraycopy(arg0, arg1, byArray, 0, arg2);
        System.arraycopy(arg0, arg1, byArray2, 0, byArray2.length);
        this.cfr_renamed_3.cfr_renamed_1217(false, new sprnjd(this.cfr_renamed_1.cfr_renamed_284(), byArray2));
        int n4 = n2 = n3;
        while (n4 < byArray.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray, n2, byArray, n2);
            n4 = n2 += n3;
        }
        System.arraycopy(byArray, byArray.length - byArray2.length, byArray2, 0, byArray2.length);
        spraid spraid2 = this;
        spraid2.cfr_renamed_3.cfr_renamed_1217(false, new sprnjd(this.cfr_renamed_1.cfr_renamed_284(), byArray2));
        spraid2.cfr_renamed_3.cfr_renamed_3064(byArray, 0, byArray, 0);
        this.cfr_renamed_3.cfr_renamed_1217(0 != 0, this.cfr_renamed_1);
        n2 = 0;
        int n5 = n2;
        while (n5 < byArray.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray, n2, byArray, n2);
            n5 = n2 += n3;
        }
        if ((byArray[0] & 0xFF) > byArray.length - 4) {
            throw new sprpjd(spryez.cfr_renamed_9("cOuMdXp\u001d\u007fXm\u001dwRfOaM`Xp"));
        }
        byte[] byArray3 = new byte[byArray[0] & 0xFF];
        System.arraycopy(byArray, 4, byArray3, 0, byArray[0]);
        int n6 = 0;
        int n7 = n = 0;
        while (n7 != 3) {
            byte by = ~byArray[1 + n];
            byte by2 = byArray3[n];
            n6 |= by ^ by2;
            n7 = ++n;
        }
        if (n6 != 0) {
            throw new sprpjd(spryrb.cfr_renamed_9("U\u0016C\u0014R\u0001FDI\u0001[DD\u0005K\bQDA\fG\u0007I\u0017W\t"));
        }
        return byArray3;
    }

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_2349().cfr_renamed_1315()).append(spryez.cfr_renamed_9("\u0012F{W\u000e&\f%jf\\d")).toString();
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        byte[] byArray;
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(spryrb.cfr_renamed_9("L\u000bVDQ\u0001VDD\u000bPDU\u0016C\u0014R\rL\u0003"));
        }
        spraid spraid2 = this;
        spraid2.cfr_renamed_3.cfr_renamed_1217(true, this.cfr_renamed_1);
        int n2 = spraid2.cfr_renamed_3.cfr_renamed_1195();
        (arg2 + 4 < n2 * 2 ? (byArray = new byte[n2 * 2]) : (byArray = new byte[(arg2 + 4) % n2 == 0 ? arg2 + 4 : ((arg2 + 4) / n2 + 1) * n2]))[0] = (byte)arg2;
        byArray[1] = ~arg0[arg1];
        byArray[2] = ~arg0[arg1 + 1];
        byArray[3] = ~arg0[arg1 + 2];
        System.arraycopy(arg0, arg1, byArray, 4, arg2);
        int n3 = n = arg2 + 4;
        while (n3 < byArray.length) {
            byArray[n++] = (byte)this.cfr_renamed_2.nextInt();
            n3 = n;
        }
        int n4 = n = 0;
        while (n4 < byArray.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray, n, byArray, n);
            n4 = n += n2;
        }
        int n5 = n = 0;
        while (n5 < byArray.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray, n, byArray, n);
            n5 = n += n2;
        }
        return byArray;
    }
}

