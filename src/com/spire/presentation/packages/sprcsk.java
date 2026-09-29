/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprhqk;
import com.spire.presentation.packages.sprkpk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprtks;
import com.spire.presentation.packages.sprull;
import com.spire.presentation.packages.sprvsl;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryy;
import java.security.SecureRandom;

public class sprcsk
implements spryy {
    private sprkpk cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprhqk cfr_renamed_3;
    private boolean cfr_renamed_4;

    @Override
    public String cfr_renamed_1315() {
        return new StringBuilder().insert(0, this.cfr_renamed_3.cfr_renamed_2349().cfr_renamed_1315()).append(sprtks.cfr_renamed_9(":@SQ& $#B`tb")).toString();
    }

    @Override
    public byte[] cfr_renamed_1575(byte[] arg0, int arg1, int arg2) {
        int n;
        byte[] byArray;
        if (!this.cfr_renamed_4) {
            throw new IllegalStateException(sprvsl.cfr_renamed_9("A\u0000[O\\\n[OI\u0000]OX\u001dN\u001f_\u0006A\b"));
        }
        if (arg2 > 255 || arg2 < 0) {
            throw new IllegalArgumentException(sprtks.cfr_renamed_9("{{b`f5\u007f`aa2ww5tg}x2%2a}5  '5plfpa"));
        }
        sprcsk sprcsk2 = this;
        sprcsk2.cfr_renamed_3.cfr_renamed_5535(true, this.cfr_renamed_1);
        int n2 = sprcsk2.cfr_renamed_3.cfr_renamed_1195();
        (arg2 + 4 < n2 * 2 ? (byArray = new byte[n2 * 2]) : (byArray = new byte[(arg2 + 4) % n2 == 0 ? arg2 + 4 : ((arg2 + 4) / n2 + 1) * n2]))[0] = (byte)arg2;
        System.arraycopy(arg0, arg1, byArray, 4, arg2);
        byte[] byArray2 = new byte[byArray.length - (arg2 + 4)];
        this.cfr_renamed_2.nextBytes(byArray2);
        System.arraycopy(byArray2, 0, byArray, arg2 + 4, byArray2.length);
        byArray[1] = ~byArray[4];
        byArray[2] = ~byArray[5];
        byArray[3] = ~byArray[6];
        int n3 = n = 0;
        while (n3 < byArray.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray, n, byArray, n);
            n3 = n += n2;
        }
        int n4 = n = 0;
        while (n4 < byArray.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray, n, byArray, n);
            n4 = n += n2;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_5535(boolean bl, sprbj sprbj2) {
        void arg1;
        void arg0;
        this.cfr_renamed_4 = arg0;
        if (sprbj2 instanceof sprbgk) {
            sprbgk sprbgk2;
            sprbgk sprbgk3 = sprbgk2 = (sprbgk)arg1;
            this.cfr_renamed_2 = sprbgk3.cfr_renamed_1295();
            if (!(sprbgk3.cfr_renamed_284() instanceof sprkpk)) {
                throw new IllegalArgumentException(sprvsl.cfr_renamed_9("})l\\\u001d^\u001e8]\u000e_O]\n^\u001aF\u001dJ\u001c\u000f\u000eAOf9"));
            }
            this.cfr_renamed_1 = (sprkpk)sprbgk2.cfr_renamed_284();
            return;
        }
        if (arg0 != false) {
            this.cfr_renamed_2 = sprybl.cfr_renamed_2794();
        }
        if (!(arg1 instanceof sprkpk)) {
            throw new IllegalArgumentException(sprtks.cfr_renamed_9("GTV!'#$Egse2gwdg|`pa5s{2\\D"));
        }
        this.cfr_renamed_1 = (sprkpk)arg1;
    }

    /*
     * WARNING - void declaration
     */
    public sprcsk(sprmr sprmr2) {
        void arg0;
        sprcsk sprcsk2 = this;
        sprcsk2.cfr_renamed_3 = new sprhqk((sprmr)arg0);
    }

    @Override
    public byte[] cfr_renamed_1579(byte[] arg0, int arg1, int arg2) throws sprull {
        int n;
        int n2;
        int n3;
        byte[] byArray;
        byte[] byArray2;
        int n4;
        if (this.cfr_renamed_4) {
            throw new IllegalStateException(sprvsl.cfr_renamed_9("A\u0000[O\\\n[OI\u0000]OZ\u0001X\u001dN\u001f_\u0006A\b"));
        }
        int n5 = this.cfr_renamed_3.cfr_renamed_1195();
        if (arg2 < 2 * n5) {
            throw new sprull(sprtks.cfr_renamed_9("{{b`f5fz}5a}}gf"));
        }
        byte[] byArray3 = new byte[arg2];
        byte[] byArray4 = new byte[n5];
        System.arraycopy(arg0, arg1, byArray3, 0, arg2);
        System.arraycopy(arg0, arg1, byArray4, 0, byArray4.length);
        this.cfr_renamed_3.cfr_renamed_5535(false, new sprkpk(this.cfr_renamed_1.cfr_renamed_284(), byArray4));
        int n6 = n4 = n5;
        while (n6 < byArray3.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray3, n4, byArray3, n4);
            n6 = n4 += n5;
        }
        System.arraycopy(byArray3, byArray3.length - byArray4.length, byArray4, 0, byArray4.length);
        sprcsk sprcsk2 = this;
        sprcsk2.cfr_renamed_3.cfr_renamed_5535(false, new sprkpk(this.cfr_renamed_1.cfr_renamed_284(), byArray4));
        sprcsk2.cfr_renamed_3.cfr_renamed_3064(byArray3, 0, byArray3, 0);
        this.cfr_renamed_3.cfr_renamed_5535(0 != 0, this.cfr_renamed_1);
        n4 = 0;
        int n7 = n4;
        while (n7 < byArray3.length) {
            this.cfr_renamed_3.cfr_renamed_3064(byArray3, n4, byArray3, n4);
            n7 = n4 += n5;
        }
        int n8 = n4 = (byArray3[0] & 0xFF) > byArray3.length - 4 ? 1 : 0;
        if (n4 != 0) {
            byArray2 = new byte[byArray3.length - 4];
            byArray = byArray3;
        } else {
            byArray2 = new byte[byArray3[0] & 0xFF];
            byArray = byArray3;
        }
        System.arraycopy(byArray, 4, byArray2, 0, byArray2.length);
        int n9 = 0;
        int n10 = n3 = 0;
        while (n10 != 3) {
            byte by = ~byArray3[1 + n3];
            byte by2 = byArray3[4 + n3];
            n9 |= by ^ by2;
            n10 = ++n3;
        }
        sproze.cfr_renamed_3408(byArray3);
        if (n9 != 0) {
            n2 = 1;
            n = n4;
        } else {
            n2 = 0;
            n = n4;
        }
        if ((n2 | n) != 0) {
            throw new sprull(sprvsl.cfr_renamed_9("\u0018]\u000e_\u001fJ\u000b\u000f\u0004J\u0016\u000f\f@\u001d]\u001a_\u001bJ\u000b"));
        }
        return byArray2;
    }
}

