/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbye;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprihf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprtgg
extends sprqqe {
    private byte[] cfr_renamed_112;
    private sprktm cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private sprlem cfr_renamed_0;
    private byte[][] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[][] cfr_renamed_3;
    private sprbye[] cfr_renamed_4;

    public short[] cfr_renamed_1138() {
        return sprihf.cfr_renamed_1271(this.cfr_renamed_91);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprtgg(sprszm sprszm2) {
        int n;
        Object object;
        int n2;
        int n3;
        int n4;
        void v1;
        void arg0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprktm) {
            void v0 = arg0;
            v1 = v0;
            this.cfr_renamed_119 = sprktm.cfr_renamed_23(v0.cfr_renamed_85(0));
        } else {
            this.cfr_renamed_0 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
            v1 = arg0;
        }
        sprszm sprszm3 = (sprszm)v1.cfr_renamed_85(1);
        this.cfr_renamed_3 = new byte[sprszm3.cfr_renamed_84()][];
        int n5 = n4 = 0;
        while (n5 < sprszm3.cfr_renamed_84()) {
            int n6 = n4++;
            this.cfr_renamed_3[n6] = ((sproug)sprszm3.cfr_renamed_85(n6)).cfr_renamed_186();
            n5 = n4;
        }
        sprszm sprszm4 = (sprszm)arg0.cfr_renamed_85(2);
        this.cfr_renamed_2 = ((sproug)sprszm4.cfr_renamed_85(0)).cfr_renamed_186();
        sprszm sprszm5 = (sprszm)arg0.cfr_renamed_85(3);
        this.cfr_renamed_1 = new byte[sprszm5.cfr_renamed_84()][];
        int n7 = n3 = 0;
        while (n7 < sprszm5.cfr_renamed_84()) {
            int n8 = n3++;
            this.cfr_renamed_1[n8] = ((sproug)sprszm5.cfr_renamed_85(n8)).cfr_renamed_186();
            n7 = n3;
        }
        sprszm sprszm6 = (sprszm)arg0.cfr_renamed_85(4);
        this.cfr_renamed_91 = ((sproug)sprszm6.cfr_renamed_85(0)).cfr_renamed_186();
        sprszm sprszm7 = (sprszm)arg0.cfr_renamed_85(5);
        this.cfr_renamed_112 = ((sproug)sprszm7.cfr_renamed_85(0)).cfr_renamed_186();
        sprszm sprszm8 = (sprszm)arg0.cfr_renamed_85(6);
        byte[][][][] byArrayArray = new byte[sprszm8.cfr_renamed_84()][][][];
        byte[][][][] byArrayArray2 = new byte[sprszm8.cfr_renamed_84()][][][];
        byte[][][] byArrayArray3 = new byte[sprszm8.cfr_renamed_84()][][];
        byte[][] byArrayArray4 = new byte[sprszm8.cfr_renamed_84()][];
        int n9 = n2 = 0;
        while (n9 < sprszm8.cfr_renamed_84()) {
            int n10;
            int n11;
            sprszm sprszm9;
            int n12;
            sprszm sprszm10 = (sprszm)sprszm8.cfr_renamed_85(n2);
            object = (sprszm)sprszm10.cfr_renamed_85(0);
            byArrayArray[n2] = new byte[((sprszm)object).cfr_renamed_84()][][];
            int n13 = n12 = 0;
            while (n13 < ((sprszm)object).cfr_renamed_84()) {
                sprszm9 = (sprszm)((sprszm)object).cfr_renamed_85(n12);
                byArrayArray[n2][n12] = new byte[sprszm9.cfr_renamed_84()][];
                int n14 = n11 = 0;
                while (n14 < sprszm9.cfr_renamed_84()) {
                    int n15 = n11++;
                    byArrayArray[n2][n12][n15] = ((sproug)sprszm9.cfr_renamed_85(n15)).cfr_renamed_186();
                    n14 = n11;
                }
                n13 = ++n12;
            }
            sprszm sprszm11 = (sprszm)sprszm10.cfr_renamed_85(1);
            byArrayArray2[n2] = new byte[sprszm11.cfr_renamed_84()][][];
            int n16 = n10 = 0;
            while (n16 < sprszm11.cfr_renamed_84()) {
                int n17;
                sprszm sprszm12 = (sprszm)sprszm11.cfr_renamed_85(n10);
                byArrayArray2[n2][n10] = new byte[sprszm12.cfr_renamed_84()][];
                int n18 = n17 = 0;
                while (n18 < sprszm12.cfr_renamed_84()) {
                    int n19 = n17++;
                    byArrayArray2[n2][n10][n19] = ((sproug)sprszm12.cfr_renamed_85(n19)).cfr_renamed_186();
                    n18 = n17;
                }
                n16 = ++n10;
            }
            sprszm9 = (sprszm)sprszm10.cfr_renamed_85(2);
            byArrayArray3[n2] = new byte[sprszm9.cfr_renamed_84()][];
            int n20 = n11 = 0;
            while (n20 < sprszm9.cfr_renamed_84()) {
                int n21 = n11++;
                byArrayArray3[n2][n21] = ((sproug)sprszm9.cfr_renamed_85(n21)).cfr_renamed_186();
                n20 = n11;
            }
            byArrayArray4[n2++] = ((sproug)sprszm10.cfr_renamed_85(3)).cfr_renamed_186();
            n9 = n2;
        }
        n2 = this.cfr_renamed_112.length - 1;
        this.cfr_renamed_4 = new sprbye[n2];
        int n22 = n = 0;
        while (n22 < n2) {
            object = new sprbye(this.cfr_renamed_112[n], this.cfr_renamed_112[n + 1], sprihf.cfr_renamed_1264(byArrayArray[n]), sprihf.cfr_renamed_1264(byArrayArray2[n]), sprihf.cfr_renamed_1266(byArrayArray3[n]), sprihf.cfr_renamed_1271(byArrayArray4[n]));
            this.cfr_renamed_4[n++] = object;
            n22 = n;
        }
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_119;
    }

    public int[] cfr_renamed_1139() {
        return sprihf.cfr_renamed_1265(this.cfr_renamed_112);
    }

    public short[] cfr_renamed_1136() {
        return sprihf.cfr_renamed_1271(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprtgg(short[][] sArray, short[] sArray2, short[][] sArray3, short[] sArray4, int[] nArray, sprbye[] sprbyeArray) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprtgg sprtgg2 = this;
        sprtgg sprtgg3 = this;
        sprtgg sprtgg4 = this;
        sprtgg sprtgg5 = this;
        sprtgg5.cfr_renamed_119 = new sprktm(1L);
        sprtgg4.cfr_renamed_3 = sprihf.cfr_renamed_1267((short[][])arg0);
        sprtgg4.cfr_renamed_2 = sprihf.cfr_renamed_1270((short[])arg1);
        sprtgg3.cfr_renamed_1 = sprihf.cfr_renamed_1267((short[][])arg2);
        sprtgg3.cfr_renamed_91 = sprihf.cfr_renamed_1270((short[])arg3);
        sprtgg2.cfr_renamed_112 = sprihf.cfr_renamed_1268((int[])arg4);
        sprtgg2.cfr_renamed_4 = sprbyeArray;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        int n2;
        int n3;
        sprrvm sprrvm2 = new sprrvm();
        if (this.cfr_renamed_119 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_119);
        } else {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_0);
        }
        sprrvm sprrvm3 = new sprrvm();
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_3.length) {
            sprrvm3.cfr_renamed_5004(new sprfvg(this.cfr_renamed_3[n3++]));
            n4 = n3;
        }
        sprrvm sprrvm4 = sprrvm2;
        sprrvm4.cfr_renamed_5004(new sprcen(sprrvm3));
        sprrvm sprrvm5 = new sprrvm();
        sprrvm5.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2));
        sprrvm4.cfr_renamed_5004(new sprcen(sprrvm5));
        sprrvm sprrvm6 = new sprrvm();
        int n5 = n2 = 0;
        while (n5 < this.cfr_renamed_1.length) {
            sprrvm6.cfr_renamed_5004(new sprfvg(this.cfr_renamed_1[n2++]));
            n5 = n2;
        }
        sprrvm sprrvm7 = sprrvm2;
        sprrvm7.cfr_renamed_5004(new sprcen(sprrvm6));
        sprrvm sprrvm8 = new sprrvm();
        sprrvm8.cfr_renamed_5004(new sprfvg(this.cfr_renamed_91));
        sprrvm7.cfr_renamed_5004(new sprcen(sprrvm8));
        sprrvm sprrvm9 = new sprrvm();
        sprrvm9.cfr_renamed_5004(new sprfvg(this.cfr_renamed_112));
        sprrvm7.cfr_renamed_5004(new sprcen(sprrvm9));
        sprrvm sprrvm10 = new sprrvm();
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_4.length) {
            int n7;
            sprrvm sprrvm11;
            int n8;
            sprrvm sprrvm12;
            int n9;
            sprrvm sprrvm13 = new sprrvm();
            byte[][][] byArray = sprihf.cfr_renamed_1269(this.cfr_renamed_4[n].cfr_renamed_1305());
            sprrvm sprrvm14 = new sprrvm();
            int n10 = n9 = 0;
            while (n10 < byArray.length) {
                sprrvm12 = new sprrvm();
                int n11 = n8 = 0;
                while (n11 < byArray[n9].length) {
                    sprrvm12.cfr_renamed_5004(new sprfvg(byArray[n9][n8++]));
                    n11 = n8;
                }
                sprrvm14.cfr_renamed_5004(new sprcen(sprrvm12));
                n10 = ++n9;
            }
            sprrvm13.cfr_renamed_5004(new sprcen(sprrvm14));
            byte[][][] byArray2 = sprihf.cfr_renamed_1269(this.cfr_renamed_4[n].cfr_renamed_1306());
            sprrvm12 = new sprrvm();
            int n12 = n8 = 0;
            while (n12 < byArray2.length) {
                sprrvm11 = new sprrvm();
                int n13 = n7 = 0;
                while (n13 < byArray2[n8].length) {
                    sprrvm11.cfr_renamed_5004(new sprfvg(byArray2[n8][n7++]));
                    n13 = n7;
                }
                sprrvm12.cfr_renamed_5004(new sprcen(sprrvm11));
                n12 = ++n8;
            }
            sprrvm13.cfr_renamed_5004(new sprcen(sprrvm12));
            byte[][] byArray3 = sprihf.cfr_renamed_1267(this.cfr_renamed_4[n].cfr_renamed_1307());
            sprrvm11 = new sprrvm();
            int n14 = n7 = 0;
            while (n14 < byArray3.length) {
                sprrvm11.cfr_renamed_5004(new sprfvg(byArray3[n7++]));
                n14 = n7;
            }
            sprrvm sprrvm15 = sprrvm13;
            sprrvm15.cfr_renamed_5004(new sprcen(sprrvm11));
            sprrvm15.cfr_renamed_5004(new sprfvg(sprihf.cfr_renamed_1270(this.cfr_renamed_4[n].cfr_renamed_1308())));
            sprrvm10.cfr_renamed_5004(new sprcen(sprrvm13));
            n6 = ++n;
        }
        sprrvm2.cfr_renamed_5004(new sprcen(sprrvm10));
        return new sprcen(sprrvm2);
    }

    public sprbye[] cfr_renamed_1134() {
        return this.cfr_renamed_4;
    }

    public short[][] cfr_renamed_1135() {
        return sprihf.cfr_renamed_1266(this.cfr_renamed_3);
    }

    public short[][] cfr_renamed_1137() {
        return sprihf.cfr_renamed_1266(this.cfr_renamed_1);
    }

    public static sprtgg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprtgg) {
            return (sprtgg)arg0;
        }
        if (arg0 != null) {
            return new sprtgg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

