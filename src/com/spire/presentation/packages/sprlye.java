/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraze;
import com.spire.presentation.packages.sprbcf;
import com.spire.presentation.packages.sprbgk;
import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.sprgdf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgm;
import com.spire.presentation.packages.sprhaf;
import com.spire.presentation.packages.sprixe;
import com.spire.presentation.packages.sprnye;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqo;
import com.spire.presentation.packages.sprxef;
import com.spire.presentation.packages.sprxxy;
import com.spire.presentation.packages.sprybl;
import com.spire.presentation.packages.spryf;
import com.spire.presentation.packages.spryxe;
import java.security.SecureRandom;

public class sprlye
implements sprgm {
    private int cfr_renamed_79;
    private int[] cfr_renamed_107;
    private byte[][][] cfr_renamed_132;
    private spryf cfr_renamed_102;
    private spraze cfr_renamed_93;
    private sprgf cfr_renamed_86;
    private sprixe cfr_renamed_152;
    private sprnye cfr_renamed_112;
    private SecureRandom cfr_renamed_119;
    private sprgdf cfr_renamed_91;
    private int cfr_renamed_0;
    public sprxef cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private byte[][] cfr_renamed_4;

    private /* synthetic */ void cfr_renamed_1398() {
        int n;
        int n2;
        sprlye sprlye2 = this;
        sprlye2.cfr_renamed_86.cfr_renamed_41();
        sprbcf sprbcf2 = (sprbcf)sprlye2.cfr_renamed_1;
        if (sprbcf2.cfr_renamed_1399()) {
            throw new IllegalStateException(sprxxy.cfr_renamed_9("L$u }\"yvw3ev}:n3}2evi%y2"));
        }
        if (sprbcf2.cfr_renamed_1400(0) >= sprbcf2.cfr_renamed_1401(0)) {
            throw new IllegalStateException(sprqqo.cfr_renamed_9("\u007f)\u0011+^4TfB/V(P2D4T5\u0011%P(\u0011$TfV#_#C'E#U"));
        }
        sprlye sprlye3 = this;
        this.cfr_renamed_112 = sprbcf2.cfr_renamed_284();
        this.cfr_renamed_79 = this.cfr_renamed_112.cfr_renamed_1140();
        byte[] byArray = sprbcf2.cfr_renamed_1402()[this.cfr_renamed_79 - 1];
        byte[] byArray2 = new byte[sprlye3.cfr_renamed_0];
        byte[] byArray3 = new byte[this.cfr_renamed_0];
        System.arraycopy(byArray, 0, byArray3, 0, this.cfr_renamed_0);
        byArray2 = sprlye3.cfr_renamed_93.cfr_renamed_1370(byArray3);
        sprlye sprlye4 = this;
        sprlye3.cfr_renamed_152 = new sprixe(byArray2, this.cfr_renamed_102.cfr_renamed_1397(), this.cfr_renamed_112.cfr_renamed_1250()[this.cfr_renamed_79 - 1]);
        byte[][][] byArray4 = sprbcf2.cfr_renamed_1403();
        sprlye3.cfr_renamed_132 = new byte[sprlye3.cfr_renamed_79][][];
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_79) {
            int n4 = n2;
            this.cfr_renamed_132[n4] = new byte[byArray4[n4].length][this.cfr_renamed_0];
            int n5 = n = 0;
            while (n5 < byArray4[n2].length) {
                System.arraycopy(byArray4[n2][n], 0, this.cfr_renamed_132[n2][++n], 0, this.cfr_renamed_0);
                n5 = n;
            }
            n3 = ++n2;
        }
        sprlye sprlye5 = this;
        sprlye5.cfr_renamed_107 = new int[sprlye5.cfr_renamed_79];
        System.arraycopy(sprbcf2.cfr_renamed_320(), 0, this.cfr_renamed_107, 0, this.cfr_renamed_79);
        this.cfr_renamed_4 = new byte[sprlye5.cfr_renamed_79 - 1][];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_79 - 1) {
            byte[] byArray5 = sprbcf2.cfr_renamed_1404(n);
            this.cfr_renamed_4[n] = new byte[byArray5.length];
            System.arraycopy(byArray5, 0, this.cfr_renamed_4[++n], 0, byArray5.length);
            n6 = n;
        }
        sprbcf2.cfr_renamed_1405();
    }

    public sprlye(spryf arg0) {
        sprlye sprlye2 = this;
        sprlye2.cfr_renamed_91 = new sprgdf();
        this.cfr_renamed_102 = arg0;
        this.cfr_renamed_2 = this.cfr_renamed_86 = arg0.cfr_renamed_1397();
        this.cfr_renamed_0 = this.cfr_renamed_86.cfr_renamed_1218();
        this.cfr_renamed_93 = new spraze(this.cfr_renamed_86);
    }

    private /* synthetic */ void cfr_renamed_1396() {
        sprlye sprlye2 = this;
        sprlye2.cfr_renamed_86.cfr_renamed_41();
        spryxe spryxe2 = (spryxe)sprlye2.cfr_renamed_1;
        sprlye sprlye3 = this;
        this.cfr_renamed_3 = spryxe2.cfr_renamed_1157();
        sprlye3.cfr_renamed_112 = spryxe2.cfr_renamed_284();
        sprlye3.cfr_renamed_79 = this.cfr_renamed_112.cfr_renamed_1140();
    }

    @Override
    public boolean cfr_renamed_129(byte[] arg0, byte[] arg1) {
        int n;
        boolean bl = false;
        sprlye sprlye2 = this;
        sprlye2.cfr_renamed_2.cfr_renamed_41();
        byte[] byArray = arg0;
        int n2 = 0;
        int n3 = n = sprlye2.cfr_renamed_79 - 1;
        while (n3 >= 0) {
            int n4;
            int n5;
            sprhaf sprhaf2;
            sprhaf sprhaf3 = sprhaf2 = new sprhaf(this.cfr_renamed_102.cfr_renamed_1397(), this.cfr_renamed_112.cfr_renamed_1250()[n]);
            int n6 = sprhaf3.cfr_renamed_1368();
            arg0 = byArray;
            int n7 = this.cfr_renamed_91.cfr_renamed_1378(arg1, n2);
            byte[] byArray2 = new byte[n6];
            int n8 = n2 += 4;
            System.arraycopy(arg1, n8, byArray2, 0, n6);
            n2 = n8 + n6;
            byte[] byArray3 = sprhaf3.cfr_renamed_1367(arg0, byArray2);
            if (byArray3 == null) {
                System.err.println(sprxxy.cfr_renamed_9("S\u0002OvL#~:u5<\u001dy/<?ovr#p:<?rv[\u001bO\u0005O?{8}\"i$yxj3n?z/"));
                return false;
            }
            byte[][] byArray4 = new byte[this.cfr_renamed_112.cfr_renamed_1249()[n]][this.cfr_renamed_0];
            int n9 = n5 = 0;
            while (n9 < byArray4.length) {
                int n10 = n2;
                System.arraycopy(arg1, n10, byArray4[n5], 0, this.cfr_renamed_0);
                n2 = n10 + this.cfr_renamed_0;
                n9 = ++n5;
            }
            byArray = new byte[this.cfr_renamed_0];
            byArray = byArray3;
            n5 = 1 << byArray4.length;
            n5 += n7;
            int n11 = n4 = 0;
            while (n11 < byArray4.length) {
                sprlye sprlye3;
                byte[] byArray5 = new byte[this.cfr_renamed_0 << 1];
                if (n5 % 2 == 0) {
                    sprlye3 = this;
                    System.arraycopy(byArray, 0, byArray5, 0, this.cfr_renamed_0);
                    sprlye sprlye4 = this;
                    System.arraycopy(byArray4[n4], 0, byArray5, sprlye4.cfr_renamed_0, sprlye4.cfr_renamed_0);
                    n5 /= 2;
                } else {
                    System.arraycopy(byArray4[n4], 0, byArray5, 0, this.cfr_renamed_0);
                    System.arraycopy(byArray, 0, byArray5, this.cfr_renamed_0, byArray.length);
                    n5 = (n5 - 1) / 2;
                    sprlye3 = this;
                }
                sprlye3.cfr_renamed_86.cfr_renamed_1197(byArray5, 0, byArray5.length);
                sprlye sprlye5 = this;
                byArray = new byte[sprlye5.cfr_renamed_86.cfr_renamed_1218()];
                sprlye5.cfr_renamed_86.cfr_renamed_1219(byArray, 0);
                n11 = ++n4;
            }
            n3 = --n;
        }
        if (sproze.cfr_renamed_92(this.cfr_renamed_3, byArray)) {
            bl = true;
        }
        return bl;
    }

    @Override
    public byte[] cfr_renamed_125(byte[] arg0) {
        int n;
        sprlye sprlye2 = this;
        byte[] byArray = new byte[sprlye2.cfr_renamed_0];
        byArray = sprlye2.cfr_renamed_152.cfr_renamed_1371(arg0);
        sprlye sprlye3 = this;
        byte[] byArray2 = sprlye2.cfr_renamed_91.cfr_renamed_1375(sprlye3.cfr_renamed_132[sprlye3.cfr_renamed_79 - 1]);
        sprlye sprlye4 = this;
        byte[] byArray3 = sprlye2.cfr_renamed_91.cfr_renamed_1377(sprlye4.cfr_renamed_107[sprlye4.cfr_renamed_79 - 1]);
        byte[] byArray4 = new byte[byArray3.length + byArray.length + byArray2.length];
        System.arraycopy(byArray3, 0, byArray4, 0, byArray3.length);
        System.arraycopy(byArray, 0, byArray4, byArray3.length, byArray.length);
        System.arraycopy(byArray2, 0, byArray4, byArray3.length + byArray.length, byArray2.length);
        byte[] byArray5 = new byte[]{};
        int n2 = n = this.cfr_renamed_79 - 1 - 1;
        while (n2 >= 0) {
            sprlye sprlye5 = this;
            byArray2 = this.cfr_renamed_91.cfr_renamed_1375(sprlye5.cfr_renamed_132[n]);
            byArray3 = sprlye5.cfr_renamed_91.cfr_renamed_1377(this.cfr_renamed_107[n]);
            byte[] byArray6 = new byte[byArray5.length];
            System.arraycopy(byArray5, 0, byArray6, 0, byArray5.length);
            byArray5 = new byte[byArray6.length + byArray3.length + this.cfr_renamed_4[n].length + byArray2.length];
            System.arraycopy(byArray6, 0, byArray5, 0, byArray6.length);
            System.arraycopy(byArray3, 0, byArray5, byArray6.length, byArray3.length);
            System.arraycopy(this.cfr_renamed_4[n], 0, byArray5, byArray6.length + byArray3.length, this.cfr_renamed_4[n].length);
            int n3 = byArray6.length + byArray3.length + this.cfr_renamed_4[n].length;
            System.arraycopy(byArray2, 0, byArray5, n3, byArray2.length);
            n2 = --n;
        }
        byte[] byArray7 = new byte[byArray4.length + byArray5.length];
        System.arraycopy(byArray4, 0, byArray7, 0, byArray4.length);
        System.arraycopy(byArray5, 0, byArray7, byArray4.length, byArray5.length);
        return byArray7;
    }

    @Override
    public void cfr_renamed_5535(boolean arg0, sprbj arg1) {
        if (arg0) {
            if (arg1 instanceof sprbgk) {
                sprbgk sprbgk2 = (sprbgk)arg1;
                sprlye sprlye2 = this;
                sprlye2.cfr_renamed_119 = sprbgk2.cfr_renamed_1295();
                sprlye2.cfr_renamed_1 = (sprbcf)sprbgk2.cfr_renamed_284();
                this.cfr_renamed_1398();
                return;
            }
            this.cfr_renamed_119 = sprybl.cfr_renamed_2794();
            this.cfr_renamed_1 = (sprbcf)arg1;
            this.cfr_renamed_1398();
            return;
        }
        this.cfr_renamed_1 = (spryxe)arg1;
        this.cfr_renamed_1396();
    }
}

