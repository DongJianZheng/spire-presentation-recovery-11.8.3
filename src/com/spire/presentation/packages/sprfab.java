/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.spriya;
import com.spire.presentation.packages.sprjya;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxue;

public class sprfab
extends sprkra {
    private sprooe cfr_renamed_112;
    private byte[] cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private sprjya[] cfr_renamed_0;
    private byte[][] cfr_renamed_1;
    private byte[] cfr_renamed_2;
    private byte[][] cfr_renamed_3;
    private sprtzd cfr_renamed_4;

    public short[] cfr_renamed_1136() {
        return spriya.cfr_renamed_1271(this.cfr_renamed_91);
    }

    public short[][] cfr_renamed_1135() {
        return spriya.cfr_renamed_1266(this.cfr_renamed_3);
    }

    public sprooe cfr_renamed_3() {
        return this.cfr_renamed_112;
    }

    public short[] cfr_renamed_1138() {
        return spriya.cfr_renamed_1271(this.cfr_renamed_119);
    }

    public short[][] cfr_renamed_1137() {
        return spriya.cfr_renamed_1266(this.cfr_renamed_1);
    }

    /*
     * WARNING - void declaration
     */
    public sprfab(short[][] sArray, short[] sArray2, short[][] sArray3, short[] sArray4, int[] nArray, sprjya[] sprjyaArray) {
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprfab sprfab2 = this;
        sprfab sprfab3 = this;
        sprfab sprfab4 = this;
        sprfab sprfab5 = this;
        sprfab5.cfr_renamed_112 = new sprooe(1L);
        sprfab4.cfr_renamed_3 = spriya.cfr_renamed_1267((short[][])arg0);
        sprfab4.cfr_renamed_91 = spriya.cfr_renamed_1270((short[])arg1);
        sprfab3.cfr_renamed_1 = spriya.cfr_renamed_1267((short[][])arg2);
        sprfab3.cfr_renamed_119 = spriya.cfr_renamed_1270((short[])arg3);
        sprfab2.cfr_renamed_2 = spriya.cfr_renamed_1268((int[])arg4);
        sprfab2.cfr_renamed_0 = sprjyaArray;
    }

    public int[] cfr_renamed_1139() {
        return spriya.cfr_renamed_1265(this.cfr_renamed_2);
    }

    public sprjya[] cfr_renamed_1134() {
        return this.cfr_renamed_0;
    }

    public static sprfab cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprfab) {
            return (sprfab)arg0;
        }
        if (arg0 != null) {
            return new sprfab(sprbne.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprfab(sprbne sprbne2) {
        int n;
        Object object;
        int n2;
        int n3;
        int n4;
        void v1;
        void arg0;
        if (sprbne2.cfr_renamed_85(0) instanceof sprooe) {
            void v0 = arg0;
            v1 = v0;
            this.cfr_renamed_112 = sprooe.cfr_renamed_23(v0.cfr_renamed_85(0));
        } else {
            this.cfr_renamed_4 = sprtzd.cfr_renamed_23(arg0.cfr_renamed_85(0));
            v1 = arg0;
        }
        sprbne sprbne3 = (sprbne)v1.cfr_renamed_85(1);
        this.cfr_renamed_3 = new byte[sprbne3.cfr_renamed_84()][];
        int n5 = n4 = 0;
        while (n5 < sprbne3.cfr_renamed_84()) {
            int n6 = n4++;
            this.cfr_renamed_3[n6] = ((sprxue)sprbne3.cfr_renamed_85(n6)).cfr_renamed_186();
            n5 = n4;
        }
        sprbne sprbne4 = (sprbne)arg0.cfr_renamed_85(2);
        this.cfr_renamed_91 = ((sprxue)sprbne4.cfr_renamed_85(0)).cfr_renamed_186();
        sprbne sprbne5 = (sprbne)arg0.cfr_renamed_85(3);
        this.cfr_renamed_1 = new byte[sprbne5.cfr_renamed_84()][];
        int n7 = n3 = 0;
        while (n7 < sprbne5.cfr_renamed_84()) {
            int n8 = n3++;
            this.cfr_renamed_1[n8] = ((sprxue)sprbne5.cfr_renamed_85(n8)).cfr_renamed_186();
            n7 = n3;
        }
        sprbne sprbne6 = (sprbne)arg0.cfr_renamed_85(4);
        this.cfr_renamed_119 = ((sprxue)sprbne6.cfr_renamed_85(0)).cfr_renamed_186();
        sprbne sprbne7 = (sprbne)arg0.cfr_renamed_85(5);
        this.cfr_renamed_2 = ((sprxue)sprbne7.cfr_renamed_85(0)).cfr_renamed_186();
        sprbne sprbne8 = (sprbne)arg0.cfr_renamed_85(6);
        byte[][][][] byArrayArray = new byte[sprbne8.cfr_renamed_84()][][][];
        byte[][][][] byArrayArray2 = new byte[sprbne8.cfr_renamed_84()][][][];
        byte[][][] byArrayArray3 = new byte[sprbne8.cfr_renamed_84()][][];
        byte[][] byArrayArray4 = new byte[sprbne8.cfr_renamed_84()][];
        int n9 = n2 = 0;
        while (n9 < sprbne8.cfr_renamed_84()) {
            int n10;
            int n11;
            sprbne sprbne9;
            int n12;
            sprbne sprbne10 = (sprbne)sprbne8.cfr_renamed_85(n2);
            object = (sprbne)sprbne10.cfr_renamed_85(0);
            byArrayArray[n2] = new byte[((sprbne)object).cfr_renamed_84()][][];
            int n13 = n12 = 0;
            while (n13 < ((sprbne)object).cfr_renamed_84()) {
                sprbne9 = (sprbne)((sprbne)object).cfr_renamed_85(n12);
                byArrayArray[n2][n12] = new byte[sprbne9.cfr_renamed_84()][];
                int n14 = n11 = 0;
                while (n14 < sprbne9.cfr_renamed_84()) {
                    int n15 = n11++;
                    byArrayArray[n2][n12][n15] = ((sprxue)sprbne9.cfr_renamed_85(n15)).cfr_renamed_186();
                    n14 = n11;
                }
                n13 = ++n12;
            }
            sprbne sprbne11 = (sprbne)sprbne10.cfr_renamed_85(1);
            byArrayArray2[n2] = new byte[sprbne11.cfr_renamed_84()][][];
            int n16 = n10 = 0;
            while (n16 < sprbne11.cfr_renamed_84()) {
                int n17;
                sprbne sprbne12 = (sprbne)sprbne11.cfr_renamed_85(n10);
                byArrayArray2[n2][n10] = new byte[sprbne12.cfr_renamed_84()][];
                int n18 = n17 = 0;
                while (n18 < sprbne12.cfr_renamed_84()) {
                    int n19 = n17++;
                    byArrayArray2[n2][n10][n19] = ((sprxue)sprbne12.cfr_renamed_85(n19)).cfr_renamed_186();
                    n18 = n17;
                }
                n16 = ++n10;
            }
            sprbne9 = (sprbne)sprbne10.cfr_renamed_85(2);
            byArrayArray3[n2] = new byte[sprbne9.cfr_renamed_84()][];
            int n20 = n11 = 0;
            while (n20 < sprbne9.cfr_renamed_84()) {
                int n21 = n11++;
                byArrayArray3[n2][n21] = ((sprxue)sprbne9.cfr_renamed_85(n21)).cfr_renamed_186();
                n20 = n11;
            }
            byArrayArray4[n2++] = ((sprxue)sprbne10.cfr_renamed_85(3)).cfr_renamed_186();
            n9 = n2;
        }
        n2 = this.cfr_renamed_2.length - 1;
        this.cfr_renamed_0 = new sprjya[n2];
        int n22 = n = 0;
        while (n22 < n2) {
            object = new sprjya(this.cfr_renamed_2[n], this.cfr_renamed_2[n + 1], spriya.cfr_renamed_1264(byArrayArray[n]), spriya.cfr_renamed_1264(byArrayArray2[n]), spriya.cfr_renamed_1266(byArrayArray3[n]), spriya.cfr_renamed_1271(byArrayArray4[n]));
            this.cfr_renamed_0[n++] = object;
            n22 = n;
        }
    }

    @Override
    public sprvva cfr_renamed_119() {
        int n;
        int n2;
        int n3;
        sprlre sprlre2 = new sprlre();
        if (this.cfr_renamed_112 != null) {
            sprlre2.cfr_renamed_49(this.cfr_renamed_112);
        } else {
            sprlre2.cfr_renamed_49(this.cfr_renamed_4);
        }
        sprlre sprlre3 = new sprlre();
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_3.length) {
            sprlre3.cfr_renamed_49(new sprlqe(this.cfr_renamed_3[n3++]));
            n4 = n3;
        }
        sprlre sprlre4 = sprlre2;
        sprlre4.cfr_renamed_49(new sprpse(sprlre3));
        sprlre sprlre5 = new sprlre();
        sprlre5.cfr_renamed_49(new sprlqe(this.cfr_renamed_91));
        sprlre4.cfr_renamed_49(new sprpse(sprlre5));
        sprlre sprlre6 = new sprlre();
        int n5 = n2 = 0;
        while (n5 < this.cfr_renamed_1.length) {
            sprlre6.cfr_renamed_49(new sprlqe(this.cfr_renamed_1[n2++]));
            n5 = n2;
        }
        sprlre sprlre7 = sprlre2;
        sprlre7.cfr_renamed_49(new sprpse(sprlre6));
        sprlre sprlre8 = new sprlre();
        sprlre8.cfr_renamed_49(new sprlqe(this.cfr_renamed_119));
        sprlre7.cfr_renamed_49(new sprpse(sprlre8));
        sprlre sprlre9 = new sprlre();
        sprlre9.cfr_renamed_49(new sprlqe(this.cfr_renamed_2));
        sprlre7.cfr_renamed_49(new sprpse(sprlre9));
        sprlre sprlre10 = new sprlre();
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_0.length) {
            int n7;
            sprlre sprlre11;
            int n8;
            sprlre sprlre12;
            int n9;
            sprlre sprlre13 = new sprlre();
            byte[][][] byArray = spriya.cfr_renamed_1269(this.cfr_renamed_0[n].cfr_renamed_1305());
            sprlre sprlre14 = new sprlre();
            int n10 = n9 = 0;
            while (n10 < byArray.length) {
                sprlre12 = new sprlre();
                int n11 = n8 = 0;
                while (n11 < byArray[n9].length) {
                    sprlre12.cfr_renamed_49(new sprlqe(byArray[n9][n8++]));
                    n11 = n8;
                }
                sprlre14.cfr_renamed_49(new sprpse(sprlre12));
                n10 = ++n9;
            }
            sprlre13.cfr_renamed_49(new sprpse(sprlre14));
            byte[][][] byArray2 = spriya.cfr_renamed_1269(this.cfr_renamed_0[n].cfr_renamed_1306());
            sprlre12 = new sprlre();
            int n12 = n8 = 0;
            while (n12 < byArray2.length) {
                sprlre11 = new sprlre();
                int n13 = n7 = 0;
                while (n13 < byArray2[n8].length) {
                    sprlre11.cfr_renamed_49(new sprlqe(byArray2[n8][n7++]));
                    n13 = n7;
                }
                sprlre12.cfr_renamed_49(new sprpse(sprlre11));
                n12 = ++n8;
            }
            sprlre13.cfr_renamed_49(new sprpse(sprlre12));
            byte[][] byArray3 = spriya.cfr_renamed_1267(this.cfr_renamed_0[n].cfr_renamed_1307());
            sprlre11 = new sprlre();
            int n14 = n7 = 0;
            while (n14 < byArray3.length) {
                sprlre11.cfr_renamed_49(new sprlqe(byArray3[n7++]));
                n14 = n7;
            }
            sprlre sprlre15 = sprlre13;
            sprlre15.cfr_renamed_49(new sprpse(sprlre11));
            sprlre15.cfr_renamed_49(new sprlqe(spriya.cfr_renamed_1270(this.cfr_renamed_0[n].cfr_renamed_1308())));
            sprlre10.cfr_renamed_49(new sprpse(sprlre13));
            n6 = ++n;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre10));
        return new sprpse(sprlre2);
    }
}

