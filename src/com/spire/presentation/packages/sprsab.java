/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprbhb;
import com.spire.presentation.packages.sprebda;
import com.spire.presentation.packages.sprihb;
import com.spire.presentation.packages.sprkeb;
import com.spire.presentation.packages.sprl;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmbb;
import com.spire.presentation.packages.sprqbb;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.spru;
import com.spire.presentation.packages.spruab;
import com.spire.presentation.packages.spryxa;
import com.spire.presentation.packages.sprzgb;
import com.spire.presentation.packages.sprzra;
import java.security.SecureRandom;

public class sprsab
implements spru {
    private int cfr_renamed_79;
    private sprlc cfr_renamed_107;
    private sprbhb cfr_renamed_132;
    private sprmbb cfr_renamed_102;
    public sprkeb cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private sprlc cfr_renamed_152;
    private byte[][][] cfr_renamed_112;
    private sprl cfr_renamed_119;
    private spruab cfr_renamed_91;
    private byte[][] cfr_renamed_0;
    private int cfr_renamed_1;
    private SecureRandom cfr_renamed_2;
    private sprqbb cfr_renamed_3;
    private int[] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1396() {
        sprsab sprsab2 = this;
        sprsab2.cfr_renamed_107.cfr_renamed_41();
        spryxa spryxa2 = (spryxa)sprsab2.cfr_renamed_93;
        sprsab sprsab3 = this;
        this.cfr_renamed_86 = spryxa2.cfr_renamed_1157();
        sprsab3.cfr_renamed_132 = spryxa2.cfr_renamed_284();
        sprsab3.cfr_renamed_1 = this.cfr_renamed_132.cfr_renamed_1140();
    }

    public sprsab(sprl arg0) {
        sprsab sprsab2 = this;
        sprsab2.cfr_renamed_3 = new sprqbb();
        this.cfr_renamed_119 = arg0;
        this.cfr_renamed_152 = this.cfr_renamed_107 = arg0.cfr_renamed_1397();
        this.cfr_renamed_79 = this.cfr_renamed_107.cfr_renamed_1218();
        this.cfr_renamed_91 = new spruab(this.cfr_renamed_107);
    }

    private /* synthetic */ void cfr_renamed_1398() {
        int n;
        int n2;
        sprsab sprsab2 = this;
        sprsab2.cfr_renamed_107.cfr_renamed_41();
        sprihb sprihb2 = (sprihb)sprsab2.cfr_renamed_93;
        if (sprihb2.cfr_renamed_1399()) {
            throw new IllegalStateException(spruab.cfr_renamed_9("#{\u001a\u007f\u0012}\u0016)\u0018l\n)\u0012e\u0001l\u0012m\n)\u0006z\u0016m"));
        }
        if (sprihb2.cfr_renamed_1400(0) >= sprihb2.cfr_renamed_1401(0)) {
            throw new IllegalStateException(sprebda.cfr_renamed_9(">uPw\u001fh\u0015:\u0003s\u0017t\u0011n\u0005h\u0015iPy\u0011tPx\u0015:\u0017\u007f\u001e\u007f\u0002{\u0004\u007f\u0014"));
        }
        sprsab sprsab3 = this;
        this.cfr_renamed_132 = sprihb2.cfr_renamed_284();
        this.cfr_renamed_1 = this.cfr_renamed_132.cfr_renamed_1140();
        byte[] byArray = sprihb2.cfr_renamed_1402()[this.cfr_renamed_1 - 1];
        byte[] byArray2 = new byte[sprsab3.cfr_renamed_79];
        byte[] byArray3 = new byte[this.cfr_renamed_79];
        System.arraycopy(byArray, 0, byArray3, 0, this.cfr_renamed_79);
        byArray2 = sprsab3.cfr_renamed_91.cfr_renamed_1370(byArray3);
        sprsab sprsab4 = this;
        sprsab3.cfr_renamed_102 = new sprmbb(byArray2, this.cfr_renamed_119.cfr_renamed_1397(), this.cfr_renamed_132.cfr_renamed_1250()[this.cfr_renamed_1 - 1]);
        byte[][][] byArray4 = sprihb2.cfr_renamed_1403();
        sprsab3.cfr_renamed_112 = new byte[sprsab3.cfr_renamed_1][][];
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_1) {
            int n4 = n2;
            this.cfr_renamed_112[n4] = new byte[byArray4[n4].length][this.cfr_renamed_79];
            int n5 = n = 0;
            while (n5 < byArray4[n2].length) {
                System.arraycopy(byArray4[n2][n], 0, this.cfr_renamed_112[n2][++n], 0, this.cfr_renamed_79);
                n5 = n;
            }
            n3 = ++n2;
        }
        sprsab sprsab5 = this;
        sprsab5.cfr_renamed_4 = new int[sprsab5.cfr_renamed_1];
        System.arraycopy(sprihb2.cfr_renamed_320(), 0, this.cfr_renamed_4, 0, this.cfr_renamed_1);
        this.cfr_renamed_0 = new byte[sprsab5.cfr_renamed_1 - 1][];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_1 - 1) {
            byte[] byArray5 = sprihb2.cfr_renamed_1404(n);
            this.cfr_renamed_0[n] = new byte[byArray5.length];
            System.arraycopy(byArray5, 0, this.cfr_renamed_0[++n], 0, byArray5.length);
            n6 = n;
        }
        sprihb2.cfr_renamed_1405();
    }

    @Override
    public void cfr_renamed_1217(boolean arg0, sprt arg1) {
        if (arg0) {
            if (arg1 instanceof spraed) {
                spraed spraed2 = (spraed)arg1;
                sprsab sprsab2 = this;
                sprsab2.cfr_renamed_2 = spraed2.cfr_renamed_1295();
                sprsab2.cfr_renamed_93 = (sprihb)spraed2.cfr_renamed_284();
                this.cfr_renamed_1398();
                return;
            }
            this.cfr_renamed_2 = new SecureRandom();
            this.cfr_renamed_93 = (sprihb)arg1;
            this.cfr_renamed_1398();
            return;
        }
        this.cfr_renamed_93 = (spryxa)arg1;
        this.cfr_renamed_1396();
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        int n;
        boolean bl = false;
        sprsab sprsab2 = this;
        sprsab2.cfr_renamed_152.cfr_renamed_41();
        byte[] byArray = arg0;
        int n2 = 0;
        int n3 = n = sprsab2.cfr_renamed_1 - 1;
        while (n3 >= 0) {
            int n4;
            int n5;
            sprzgb sprzgb2;
            sprzgb sprzgb3 = sprzgb2 = new sprzgb(this.cfr_renamed_119.cfr_renamed_1397(), this.cfr_renamed_132.cfr_renamed_1250()[n]);
            int n6 = sprzgb3.cfr_renamed_1368();
            arg0 = byArray;
            int n7 = this.cfr_renamed_3.cfr_renamed_1378(arg1, n2);
            byte[] byArray2 = new byte[n6];
            int n8 = n2 += 4;
            System.arraycopy(arg1, n8, byArray2, 0, n6);
            n2 = n8 + n6;
            byte[] byArray3 = sprzgb3.cfr_renamed_1367(arg0, byArray2);
            if (byArray3 == null) {
                System.err.println(spruab.cfr_renamed_9("<] )#|\u0011e\u001ajSB\u0016pS`\u0000)\u001d|\u001feS`\u001d)4D Z `\u0014g\u0012}\u0006{\u0016'\u0005l\u0001`\u0015p"));
                return false;
            }
            byte[][] byArray4 = new byte[this.cfr_renamed_132.cfr_renamed_1249()[n]][this.cfr_renamed_79];
            int n9 = n5 = 0;
            while (n9 < byArray4.length) {
                int n10 = n2;
                System.arraycopy(arg1, n10, byArray4[n5], 0, this.cfr_renamed_79);
                n2 = n10 + this.cfr_renamed_79;
                n9 = ++n5;
            }
            byArray = new byte[this.cfr_renamed_79];
            byArray = byArray3;
            n5 = 1 << byArray4.length;
            n5 += n7;
            int n11 = n4 = 0;
            while (n11 < byArray4.length) {
                sprsab sprsab3;
                byte[] byArray5 = new byte[this.cfr_renamed_79 << 1];
                if (n5 % 2 == 0) {
                    sprsab3 = this;
                    System.arraycopy(byArray, 0, byArray5, 0, this.cfr_renamed_79);
                    sprsab sprsab4 = this;
                    System.arraycopy(byArray4[n4], 0, byArray5, sprsab4.cfr_renamed_79, sprsab4.cfr_renamed_79);
                    n5 /= 2;
                } else {
                    System.arraycopy(byArray4[n4], 0, byArray5, 0, this.cfr_renamed_79);
                    System.arraycopy(byArray, 0, byArray5, this.cfr_renamed_79, byArray.length);
                    n5 = (n5 - 1) / 2;
                    sprsab3 = this;
                }
                sprsab3.cfr_renamed_107.cfr_renamed_1197(byArray5, 0, byArray5.length);
                sprsab sprsab5 = this;
                byArray = new byte[sprsab5.cfr_renamed_107.cfr_renamed_1218()];
                sprsab5.cfr_renamed_107.cfr_renamed_1219(byArray, 0);
                n11 = ++n4;
            }
            n3 = --n;
        }
        if (sprzra.cfr_renamed_92(this.cfr_renamed_86, byArray)) {
            bl = true;
        }
        return bl;
    }

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        int n;
        sprsab sprsab2 = this;
        byte[] byArray = new byte[sprsab2.cfr_renamed_79];
        byArray = sprsab2.cfr_renamed_102.cfr_renamed_1371(arg0);
        sprsab sprsab3 = this;
        byte[] byArray2 = sprsab2.cfr_renamed_3.cfr_renamed_1375(sprsab3.cfr_renamed_112[sprsab3.cfr_renamed_1 - 1]);
        sprsab sprsab4 = this;
        byte[] byArray3 = sprsab2.cfr_renamed_3.cfr_renamed_1377(sprsab4.cfr_renamed_4[sprsab4.cfr_renamed_1 - 1]);
        byte[] byArray4 = new byte[byArray3.length + byArray.length + byArray2.length];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
        System.arraycopy(byArray, 0, byArray4, byArray3.length, byArray.length);
        System.arraycopy(byArray2, 0, byArray4, byArray3.length + byArray.length, byArray2.length);
        byte[] byArray5 = new byte[]{};
        int n2 = n = this.cfr_renamed_1 - 1 - 1;
        while (n2 >= 0) {
            sprsab sprsab5 = this;
            byArray2 = this.cfr_renamed_3.cfr_renamed_1375(sprsab5.cfr_renamed_112[n]);
            byArray3 = sprsab5.cfr_renamed_3.cfr_renamed_1377(this.cfr_renamed_4[n]);
            byte[] byArray6 = new byte[byArray5.length];
            System.arraycopy(byArray5, 0, byArray6, 0, byArray5.length);
            byArray5 = new byte[byArray6.length + byArray3.length + this.cfr_renamed_0[n].length + byArray2.length];
            System.arraycopy(byArray6, 0, byArray5, 0, byArray6.length);
            System.arraycopy(byArray3, 0, byArray5, byArray6.length, byArray3.length);
            System.arraycopy(this.cfr_renamed_0[n], 0, byArray5, byArray6.length + byArray3.length, this.cfr_renamed_0[n].length);
            int n3 = byArray6.length + byArray3.length + this.cfr_renamed_0[n].length;
            System.arraycopy(byArray2, 0, byArray5, n3, byArray2.length);
            n2 = --n;
        }
        byte[] byArray7 = new byte[byArray4.length + byArray5.length];
        System.arraycopy(byArray4, 0, byArray7, 0, byArray4.length);
        System.arraycopy(byArray5, 0, byArray7, byArray4.length, byArray5.length);
        return byArray7;
    }
}

