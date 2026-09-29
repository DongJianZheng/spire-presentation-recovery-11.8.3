/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbhb;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.spridb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjcb;
import com.spire.presentation.packages.sprkra;
import com.spire.presentation.packages.sprlqe;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprtdb;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprwgs;
import java.math.BigInteger;
import java.util.Vector;

public class sprngb
extends sprkra {
    private sprvva cfr_renamed_4;

    private /* synthetic */ sprvva cfr_renamed_1439(int[] arg0, byte[][] arg1, byte[][] arg2, byte[][][] arg3, byte[][][] arg4, byte[][][] arg5, sprhxa[][] arg6, sprhxa[][] arg7, Vector[] arg8, Vector[] arg9, Vector[][] arg10, Vector[][] arg11, sprjcb[] arg12, sprjcb[] arg13, sprjcb[] arg14, int[] arg15, byte[][] arg16, sprtdb[] arg17, byte[][] arg18, spridb[] arg19, sprbhb arg20, sprije[] arg21) {
        int n;
        int n2;
        int n3;
        int n4;
        int n5;
        int n6;
        int n7;
        int n8;
        Object object;
        int n9;
        Object object2;
        int n10;
        int n11;
        int n12;
        int n13;
        int n14;
        int n15;
        int n16;
        int n17;
        int n18;
        int n19;
        int n20;
        int n21;
        int n22;
        int n23;
        sprlre sprlre2 = new sprlre();
        sprlre sprlre3 = new sprlre();
        int n24 = n23 = 0;
        while (n24 < arg0.length) {
            int n25 = arg0[n23];
            sprlre3.cfr_renamed_49(new sprooe(n25));
            n24 = ++n23;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre3));
        sprlre sprlre4 = new sprlre();
        int n26 = n22 = 0;
        while (n26 < arg1.length) {
            sprlre4.cfr_renamed_49(new sprlqe(arg1[n22++]));
            n26 = n22;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre4));
        sprlre sprlre5 = new sprlre();
        int n27 = n21 = 0;
        while (n27 < arg2.length) {
            sprlre5.cfr_renamed_49(new sprlqe(arg2[n21++]));
            n27 = n21;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre5));
        sprlre sprlre6 = new sprlre();
        sprlre sprlre7 = new sprlre();
        int n28 = n20 = 0;
        while (n28 < arg3.length) {
            int n29;
            int n30 = n29 = 0;
            while (n30 < arg3[n20].length) {
                sprlre6.cfr_renamed_49(new sprlqe(arg3[n20][n29++]));
                n30 = n29;
            }
            sprlre7.cfr_renamed_49(new sprpse(sprlre6));
            sprlre6 = new sprlre();
            n28 = ++n20;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre7));
        sprlre sprlre8 = new sprlre();
        sprlre sprlre9 = new sprlre();
        int n31 = n19 = 0;
        while (n31 < arg4.length) {
            int n32;
            int n33 = n32 = 0;
            while (n33 < arg4[n19].length) {
                sprlre8.cfr_renamed_49(new sprlqe(arg4[n19][n32++]));
                n33 = n32;
            }
            sprlre9.cfr_renamed_49(new sprpse(sprlre8));
            sprlre8 = new sprlre();
            n31 = ++n19;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre9));
        sprlre sprlre10 = new sprlre();
        sprlre sprlre11 = new sprlre();
        sprlre sprlre12 = new sprlre();
        sprlre sprlre13 = new sprlre();
        sprlre sprlre14 = new sprlre();
        int n34 = n18 = 0;
        while (n34 < arg6.length) {
            int n35 = n17 = 0;
            while (n35 < arg6[n18].length) {
                sprlre12.cfr_renamed_49(new sprpse(arg21[0]));
                n16 = arg6[n18][n17].cfr_renamed_1381()[1];
                sprlre sprlre15 = sprlre13;
                sprlre15.cfr_renamed_49(new sprlqe(arg6[n18][n17].cfr_renamed_1382()[0]));
                sprlre15.cfr_renamed_49(new sprlqe(arg6[n18][n17].cfr_renamed_1382()[1]));
                sprlre15.cfr_renamed_49(new sprlqe(arg6[n18][n17].cfr_renamed_1382()[2]));
                int n36 = n15 = 0;
                while (n36 < n16) {
                    int n37 = 3 + n15;
                    sprlre13.cfr_renamed_49(new sprlqe(arg6[n18][n17].cfr_renamed_1382()[n37]));
                    n36 = ++n15;
                }
                sprlre12.cfr_renamed_49(new sprpse(sprlre13));
                sprlre13 = new sprlre();
                sprlre sprlre16 = sprlre14;
                sprlre16.cfr_renamed_49(new sprooe(arg6[n18][n17].cfr_renamed_1381()[0]));
                sprlre16.cfr_renamed_49(new sprooe(n16));
                sprlre16.cfr_renamed_49(new sprooe(arg6[n18][n17].cfr_renamed_1381()[2]));
                sprlre16.cfr_renamed_49(new sprooe(arg6[n18][n17].cfr_renamed_1381()[3]));
                sprlre16.cfr_renamed_49(new sprooe(arg6[n18][n17].cfr_renamed_1381()[4]));
                sprlre16.cfr_renamed_49(new sprooe(arg6[n18][n17].cfr_renamed_1381()[5]));
                int n38 = n15 = 0;
                while (n38 < n16) {
                    int n39 = arg6[n18][n17].cfr_renamed_1381()[6 + n15];
                    sprlre14.cfr_renamed_49(new sprooe(n39));
                    n38 = ++n15;
                }
                sprlre12.cfr_renamed_49(new sprpse(sprlre14));
                sprlre14 = new sprlre();
                sprlre11.cfr_renamed_49(new sprpse(sprlre12));
                sprlre12 = new sprlre();
                n35 = ++n17;
            }
            sprlre10.cfr_renamed_49(new sprpse(sprlre11));
            sprlre11 = new sprlre();
            n34 = ++n18;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre10));
        sprlre10 = new sprlre();
        sprlre11 = new sprlre();
        sprlre12 = new sprlre();
        sprlre13 = new sprlre();
        sprlre14 = new sprlre();
        int n40 = n18 = 0;
        while (n40 < arg7.length) {
            int n41 = n17 = 0;
            while (n41 < arg7[n18].length) {
                sprlre12.cfr_renamed_49(new sprpse(arg21[0]));
                n16 = arg7[n18][n17].cfr_renamed_1381()[1];
                sprlre sprlre17 = sprlre13;
                sprlre17.cfr_renamed_49(new sprlqe(arg7[n18][n17].cfr_renamed_1382()[0]));
                sprlre17.cfr_renamed_49(new sprlqe(arg7[n18][n17].cfr_renamed_1382()[1]));
                sprlre17.cfr_renamed_49(new sprlqe(arg7[n18][n17].cfr_renamed_1382()[2]));
                int n42 = n15 = 0;
                while (n42 < n16) {
                    int n43 = 3 + n15;
                    sprlre13.cfr_renamed_49(new sprlqe(arg7[n18][n17].cfr_renamed_1382()[n43]));
                    n42 = ++n15;
                }
                sprlre12.cfr_renamed_49(new sprpse(sprlre13));
                sprlre13 = new sprlre();
                sprlre sprlre18 = sprlre14;
                sprlre18.cfr_renamed_49(new sprooe(arg7[n18][n17].cfr_renamed_1381()[0]));
                sprlre18.cfr_renamed_49(new sprooe(n16));
                sprlre18.cfr_renamed_49(new sprooe(arg7[n18][n17].cfr_renamed_1381()[2]));
                sprlre18.cfr_renamed_49(new sprooe(arg7[n18][n17].cfr_renamed_1381()[3]));
                sprlre18.cfr_renamed_49(new sprooe(arg7[n18][n17].cfr_renamed_1381()[4]));
                sprlre18.cfr_renamed_49(new sprooe(arg7[n18][n17].cfr_renamed_1381()[5]));
                int n44 = n15 = 0;
                while (n44 < n16) {
                    int n45 = arg7[n18][n17].cfr_renamed_1381()[6 + n15];
                    sprlre14.cfr_renamed_49(new sprooe(n45));
                    n44 = ++n15;
                }
                sprlre12.cfr_renamed_49(new sprpse(sprlre14));
                sprlre14 = new sprlre();
                sprlre11.cfr_renamed_49(new sprpse(sprlre12));
                sprlre12 = new sprlre();
                n41 = ++n17;
            }
            sprlre10.cfr_renamed_49(new sprpse(new sprpse(sprlre11)));
            sprlre11 = new sprlre();
            n40 = ++n18;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre10));
        sprlre sprlre19 = new sprlre();
        sprlre sprlre20 = new sprlre();
        int n46 = n16 = 0;
        while (n46 < arg5.length) {
            int n47 = n15 = 0;
            while (n47 < arg5[n16].length) {
                sprlre19.cfr_renamed_49(new sprlqe(arg5[n16][n15++]));
                n47 = n15;
            }
            sprlre20.cfr_renamed_49(new sprpse(sprlre19));
            sprlre19 = new sprlre();
            n46 = ++n16;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre20));
        sprlre sprlre21 = new sprlre();
        sprlre sprlre22 = new sprlre();
        int n48 = n14 = 0;
        while (n48 < arg8.length) {
            int n49;
            int n50 = n49 = 0;
            while (n50 < arg8[n14].size()) {
                byte[] byArray = (byte[])arg8[n14].elementAt(n49);
                sprlre21.cfr_renamed_49(new sprlqe(byArray));
                n50 = ++n49;
            }
            sprlre22.cfr_renamed_49(new sprpse(sprlre21));
            sprlre21 = new sprlre();
            n48 = ++n14;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre22));
        sprlre sprlre23 = new sprlre();
        sprlre sprlre24 = new sprlre();
        int n51 = n13 = 0;
        while (n51 < arg9.length) {
            int n52;
            int n53 = n52 = 0;
            while (n53 < arg9[n13].size()) {
                byte[] byArray = (byte[])arg9[n13].elementAt(n52);
                sprlre23.cfr_renamed_49(new sprlqe(byArray));
                n53 = ++n52;
            }
            sprlre24.cfr_renamed_49(new sprpse(sprlre23));
            sprlre23 = new sprlre();
            n51 = ++n13;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre24));
        sprlre sprlre25 = new sprlre();
        sprlre sprlre26 = new sprlre();
        sprlre sprlre27 = new sprlre();
        int n54 = n12 = 0;
        while (n54 < arg10.length) {
            int n55;
            int n56 = n55 = 0;
            while (n56 < arg10[n12].length) {
                int n57;
                int n58 = n57 = 0;
                while (n58 < arg10[n12][n55].size()) {
                    byte[] byArray = (byte[])arg10[n12][n55].elementAt(n57);
                    sprlre25.cfr_renamed_49(new sprlqe(byArray));
                    n58 = ++n57;
                }
                sprlre26.cfr_renamed_49(new sprpse(sprlre25));
                sprlre25 = new sprlre();
                n56 = ++n55;
            }
            sprlre27.cfr_renamed_49(new sprpse(sprlre26));
            sprlre26 = new sprlre();
            n54 = ++n12;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre27));
        sprlre sprlre28 = new sprlre();
        sprlre sprlre29 = new sprlre();
        sprlre sprlre30 = new sprlre();
        int n59 = n11 = 0;
        while (n59 < arg11.length) {
            int n60 = n10 = 0;
            while (n60 < arg11[n11].length) {
                int n61;
                int n62 = n61 = 0;
                while (n62 < arg11[n11][n10].size()) {
                    byte[] byArray = (byte[])arg11[n11][n10].elementAt(n61);
                    sprlre28.cfr_renamed_49(new sprlqe(byArray));
                    n62 = ++n61;
                }
                sprlre29.cfr_renamed_49(new sprpse(sprlre28));
                sprlre28 = new sprlre();
                n60 = ++n10;
            }
            sprlre30.cfr_renamed_49(new sprpse(sprlre29));
            sprlre29 = new sprlre();
            n59 = ++n11;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre30));
        sprlre sprlre31 = new sprlre();
        sprlre12 = new sprlre();
        sprlre13 = new sprlre();
        sprlre14 = new sprlre();
        int n63 = n10 = 0;
        while (n63 < arg12.length) {
            sprlre sprlre32 = sprlre12;
            sprlre32.cfr_renamed_49(new sprpse(arg21[0]));
            byte[][] byArray = arg12[n10].cfr_renamed_1382();
            sprlre sprlre33 = sprlre13;
            sprlre33.cfr_renamed_49(new sprlqe(byArray[0]));
            sprlre33.cfr_renamed_49(new sprlqe(byArray[1]));
            sprlre33.cfr_renamed_49(new sprlqe(byArray[2]));
            sprlre33.cfr_renamed_49(new sprlqe(byArray[3]));
            sprlre32.cfr_renamed_49(new sprpse(sprlre13));
            sprlre13 = new sprlre();
            object2 = arg12[n10].cfr_renamed_1381();
            sprlre sprlre34 = sprlre14;
            sprlre34.cfr_renamed_49(new sprooe((long)object2[0]));
            sprlre34.cfr_renamed_49(new sprooe((long)object2[1]));
            sprlre34.cfr_renamed_49(new sprooe((long)object2[2]));
            sprlre34.cfr_renamed_49(new sprooe((long)object2[3]));
            sprlre32.cfr_renamed_49(new sprpse(sprlre14));
            sprlre14 = new sprlre();
            sprlre31.cfr_renamed_49(new sprpse(sprlre12));
            sprlre12 = new sprlre();
            n63 = ++n10;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre31));
        sprlre sprlre35 = new sprlre();
        sprlre12 = new sprlre();
        sprlre13 = new sprlre();
        sprlre14 = new sprlre();
        int n64 = n9 = 0;
        while (n64 < arg13.length) {
            sprlre sprlre36 = sprlre12;
            sprlre36.cfr_renamed_49(new sprpse(arg21[0]));
            object2 = arg13[n9].cfr_renamed_1382();
            sprlre sprlre37 = sprlre13;
            sprlre37.cfr_renamed_49(new sprlqe(object2[0]));
            sprlre37.cfr_renamed_49(new sprlqe(object2[1]));
            sprlre37.cfr_renamed_49(new sprlqe(object2[2]));
            sprlre37.cfr_renamed_49(new sprlqe(object2[3]));
            sprlre36.cfr_renamed_49(new sprpse(sprlre13));
            sprlre13 = new sprlre();
            object = arg13[n9].cfr_renamed_1381();
            sprlre sprlre38 = sprlre14;
            sprlre38.cfr_renamed_49(new sprooe((long)object[0]));
            sprlre38.cfr_renamed_49(new sprooe((long)object[1]));
            sprlre38.cfr_renamed_49(new sprooe((long)object[2]));
            sprlre38.cfr_renamed_49(new sprooe((long)object[3]));
            sprlre36.cfr_renamed_49(new sprpse(sprlre14));
            sprlre14 = new sprlre();
            sprlre35.cfr_renamed_49(new sprpse(sprlre12));
            sprlre12 = new sprlre();
            n64 = ++n9;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre35));
        sprlre sprlre39 = new sprlre();
        sprlre12 = new sprlre();
        sprlre13 = new sprlre();
        sprlre14 = new sprlre();
        int n65 = n8 = 0;
        while (n65 < arg14.length) {
            sprlre sprlre40 = sprlre12;
            sprlre40.cfr_renamed_49(new sprpse(arg21[0]));
            object = arg14[n8].cfr_renamed_1382();
            sprlre sprlre41 = sprlre13;
            sprlre41.cfr_renamed_49(new sprlqe(object[0]));
            sprlre41.cfr_renamed_49(new sprlqe(object[1]));
            sprlre41.cfr_renamed_49(new sprlqe(object[2]));
            sprlre41.cfr_renamed_49(new sprlqe(object[3]));
            sprlre40.cfr_renamed_49(new sprpse(sprlre13));
            sprlre13 = new sprlre();
            int[] nArray = arg14[n8].cfr_renamed_1381();
            sprlre sprlre42 = sprlre14;
            sprlre42.cfr_renamed_49(new sprooe(nArray[0]));
            sprlre42.cfr_renamed_49(new sprooe(nArray[1]));
            sprlre42.cfr_renamed_49(new sprooe(nArray[2]));
            sprlre42.cfr_renamed_49(new sprooe(nArray[3]));
            sprlre40.cfr_renamed_49(new sprpse(sprlre14));
            sprlre14 = new sprlre();
            sprlre39.cfr_renamed_49(new sprpse(sprlre12));
            sprlre12 = new sprlre();
            n65 = ++n8;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre39));
        sprlre sprlre43 = new sprlre();
        int n66 = n7 = 0;
        while (n66 < arg15.length) {
            int n67 = arg15[n7];
            sprlre43.cfr_renamed_49(new sprooe(n67));
            n66 = ++n7;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre43));
        sprlre sprlre44 = new sprlre();
        int n68 = n6 = 0;
        while (n68 < arg16.length) {
            sprlre44.cfr_renamed_49(new sprlqe(arg16[n6++]));
            n68 = n6;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre44));
        sprlre sprlre45 = new sprlre();
        sprlre sprlre46 = new sprlre();
        sprlre sprlre47 = new sprlre();
        sprlre sprlre48 = new sprlre();
        sprlre sprlre49 = new sprlre();
        sprlre sprlre50 = new sprlre();
        sprlre sprlre51 = new sprlre();
        int n69 = n5 = 0;
        while (n69 < arg17.length) {
            int n70;
            int n71;
            sprlre46.cfr_renamed_49(new sprpse(arg21[0]));
            sprlre47 = new sprlre();
            n4 = arg17[n5].cfr_renamed_1381()[0];
            int n72 = arg17[n5].cfr_renamed_1381()[7];
            sprlre48.cfr_renamed_49(new sprlqe(arg17[n5].cfr_renamed_1382()[0]));
            int n73 = n71 = 0;
            while (n73 < n4) {
                int n74 = 1 + n71;
                sprlre48.cfr_renamed_49(new sprlqe(arg17[n5].cfr_renamed_1382()[n74]));
                n73 = ++n71;
            }
            int n75 = n71 = 0;
            while (n75 < n72) {
                int n76 = 1 + n4 + n71;
                sprlre48.cfr_renamed_49(new sprlqe(arg17[n5].cfr_renamed_1382()[n76]));
                n75 = ++n71;
            }
            sprlre46.cfr_renamed_49(new sprpse(sprlre48));
            sprlre48 = new sprlre();
            sprlre sprlre52 = sprlre49;
            sprlre52.cfr_renamed_49(new sprooe(n4));
            sprlre52.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1381()[1]));
            sprlre52.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1381()[2]));
            sprlre52.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1381()[3]));
            sprlre52.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1381()[4]));
            sprlre52.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1381()[5]));
            sprlre52.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1381()[6]));
            sprlre52.cfr_renamed_49(new sprooe(n72));
            int n77 = n71 = 0;
            while (n77 < n4) {
                int n78 = arg17[n5].cfr_renamed_1381()[8 + n71];
                sprlre49.cfr_renamed_49(new sprooe(n78));
                n77 = ++n71;
            }
            int n79 = n71 = 0;
            while (n79 < n72) {
                int n80 = arg17[n5].cfr_renamed_1381()[8 + n4 + n71];
                sprlre49.cfr_renamed_49(new sprooe(n80));
                n79 = ++n71;
            }
            sprlre46.cfr_renamed_49(new sprpse(sprlre49));
            sprlre49 = new sprlre();
            sprlre12 = new sprlre();
            sprlre13 = new sprlre();
            sprlre14 = new sprlre();
            if (arg17[n5].cfr_renamed_1412() != null) {
                int n81 = n71 = 0;
                while (n81 < arg17[n5].cfr_renamed_1412().length) {
                    sprlre12.cfr_renamed_49(new sprpse(arg21[0]));
                    n72 = arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1381()[1];
                    sprlre sprlre53 = sprlre13;
                    sprlre53.cfr_renamed_49(new sprlqe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1382()[0]));
                    sprlre53.cfr_renamed_49(new sprlqe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1382()[1]));
                    sprlre53.cfr_renamed_49(new sprlqe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1382()[2]));
                    int n82 = n70 = 0;
                    while (n82 < n72) {
                        int n83 = 3 + n70;
                        sprlre13.cfr_renamed_49(new sprlqe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1382()[n83]));
                        n82 = ++n70;
                    }
                    sprlre12.cfr_renamed_49(new sprpse(sprlre13));
                    sprlre13 = new sprlre();
                    sprlre sprlre54 = sprlre14;
                    sprlre54.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1381()[0]));
                    sprlre54.cfr_renamed_49(new sprooe(n72));
                    sprlre54.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1381()[2]));
                    sprlre54.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1381()[3]));
                    sprlre54.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1381()[4]));
                    sprlre54.cfr_renamed_49(new sprooe(arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1381()[5]));
                    int n84 = n70 = 0;
                    while (n84 < n72) {
                        int n85 = arg17[n5].cfr_renamed_1412()[n71].cfr_renamed_1381()[6 + n70];
                        sprlre14.cfr_renamed_49(new sprooe(n85));
                        n84 = ++n70;
                    }
                    sprlre12.cfr_renamed_49(new sprpse(sprlre14));
                    sprlre14 = new sprlre();
                    sprlre50.cfr_renamed_49(new sprpse(sprlre12));
                    sprlre12 = new sprlre();
                    n81 = ++n71;
                }
            }
            sprlre46.cfr_renamed_49(new sprpse(sprlre50));
            sprlre50 = new sprlre();
            sprlre25 = new sprlre();
            if (arg17[n5].cfr_renamed_1416() != null) {
                int n86 = n71 = 0;
                while (n86 < arg17[n5].cfr_renamed_1416().length) {
                    int n87 = n70 = 0;
                    while (n87 < arg17[n5].cfr_renamed_1416()[n71].size()) {
                        byte[] byArray = (byte[])arg17[n5].cfr_renamed_1416()[n71].elementAt(n70);
                        sprlre25.cfr_renamed_49(new sprlqe(byArray));
                        n87 = ++n70;
                    }
                    sprlre51.cfr_renamed_49(new sprpse(sprlre25));
                    sprlre25 = new sprlre();
                    n86 = ++n71;
                }
            }
            sprlre46.cfr_renamed_49(new sprpse(sprlre51));
            sprlre51 = new sprlre();
            sprlre45.cfr_renamed_49(new sprpse(sprlre46));
            sprlre46 = new sprlre();
            n69 = ++n5;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre45));
        sprlre sprlre55 = new sprlre();
        int n88 = n4 = 0;
        while (n88 < arg18.length) {
            sprlre55.cfr_renamed_49(new sprlqe(arg18[n4++]));
            n88 = n4;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre55));
        sprlre sprlre56 = new sprlre();
        sprlre sprlre57 = new sprlre();
        sprlre sprlre58 = new sprlre();
        sprlre sprlre59 = new sprlre();
        sprlre sprlre60 = new sprlre();
        int n89 = n3 = 0;
        while (n89 < arg19.length) {
            sprlre sprlre61 = sprlre57;
            sprlre61.cfr_renamed_49(new sprpse(arg21[0]));
            sprlre58 = new sprlre();
            sprlre sprlre62 = sprlre59;
            sprlre62.cfr_renamed_49(new sprlqe(arg19[n3].cfr_renamed_1382()[0]));
            sprlre62.cfr_renamed_49(new sprlqe(arg19[n3].cfr_renamed_1382()[1]));
            sprlre62.cfr_renamed_49(new sprlqe(arg19[n3].cfr_renamed_1382()[2]));
            sprlre62.cfr_renamed_49(new sprlqe(arg19[n3].cfr_renamed_1382()[3]));
            sprlre62.cfr_renamed_49(new sprlqe(arg19[n3].cfr_renamed_1382()[4]));
            sprlre61.cfr_renamed_49(new sprpse(sprlre59));
            sprlre59 = new sprlre();
            sprlre sprlre63 = sprlre60;
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[0]));
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[1]));
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[2]));
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[3]));
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[4]));
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[5]));
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[6]));
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[7]));
            sprlre63.cfr_renamed_49(new sprooe(arg19[n3].cfr_renamed_1381()[8]));
            sprlre61.cfr_renamed_49(new sprpse(sprlre60));
            sprlre60 = new sprlre();
            sprlre56.cfr_renamed_49(new sprpse(sprlre57));
            sprlre57 = new sprlre();
            n89 = ++n3;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre56));
        sprlre sprlre64 = new sprlre();
        sprlre sprlre65 = new sprlre();
        sprlre sprlre66 = new sprlre();
        sprlre sprlre67 = new sprlre();
        int n90 = n2 = 0;
        while (n90 < arg20.cfr_renamed_1249().length) {
            sprlre65.cfr_renamed_49(new sprooe(arg20.cfr_renamed_1249()[n2]));
            sprlre66.cfr_renamed_49(new sprooe(arg20.cfr_renamed_1250()[n2]));
            int n91 = arg20.cfr_renamed_1150()[n2];
            sprlre67.cfr_renamed_49(new sprooe(n91));
            n90 = ++n2;
        }
        sprlre sprlre68 = sprlre64;
        sprlre68.cfr_renamed_49(new sprooe(arg20.cfr_renamed_1140()));
        sprlre68.cfr_renamed_49(new sprpse(sprlre65));
        sprlre68.cfr_renamed_49(new sprpse(sprlre66));
        sprlre68.cfr_renamed_49(new sprpse(sprlre67));
        sprlre2.cfr_renamed_49(new sprpse(sprlre64));
        sprlre sprlre69 = new sprlre();
        int n92 = n = 0;
        while (n92 < arg21.length) {
            sprlre69.cfr_renamed_49(arg21[n++]);
            n92 = n;
        }
        sprlre2.cfr_renamed_49(new sprpse(sprlre69));
        return new sprpse(sprlre2);
    }

    /*
     * WARNING - void declaration
     */
    public sprngb(int[] nArray, byte[][] byArray, byte[][] byArray2, byte[][][] byArray3, byte[][][] byArray4, sprhxa[][] sprhxaArray, sprhxa[][] sprhxaArray2, Vector[] vectorArray, Vector[] vectorArray2, Vector[][] vectorArray3, Vector[][] vectorArray4, byte[][][] byArray5, sprjcb[] sprjcbArray, sprjcb[] sprjcbArray2, sprjcb[] sprjcbArray3, int[] nArray2, byte[][] byArray6, sprtdb[] sprtdbArray, byte[][] byArray7, spridb[] spridbArray, sprbhb sprbhb2, sprije sprije2) {
        void arg20;
        void arg19;
        void arg18;
        void arg17;
        void arg16;
        void arg15;
        void arg14;
        void arg13;
        void arg12;
        void arg10;
        void arg9;
        void arg8;
        void arg7;
        void arg6;
        void arg5;
        void arg11;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        void arg21;
        sprije[] sprijeArray = new sprije[1];
        sprijeArray[0] = arg21;
        sprije[] sprijeArray2 = sprijeArray;
        this.cfr_renamed_4 = this.cfr_renamed_1439((int[])arg0, (byte[][])arg1, (byte[][])arg2, (byte[][][])arg3, (byte[][][])arg4, (byte[][][])arg11, (sprhxa[][])arg5, (sprhxa[][])arg6, (Vector[])arg7, (Vector[])arg8, (Vector[][])arg9, (Vector[][])arg10, (sprjcb[])arg12, (sprjcb[])arg13, (sprjcb[])arg14, (int[])arg15, (byte[][])arg16, (sprtdb[])arg17, (byte[][])arg18, (spridb[])arg19, (sprbhb)arg20, sprijeArray2);
    }

    private static /* synthetic */ int cfr_renamed_1440(spra arg0) {
        BigInteger bigInteger = ((sprooe)arg0).cfr_renamed_97();
        if (bigInteger.compareTo(BigInteger.valueOf(Integer.MAX_VALUE)) > 0 || bigInteger.compareTo(BigInteger.valueOf(Integer.MIN_VALUE)) < 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprwgs.cfr_renamed_9("E\u001c`<i\u0001b\u0012b\u0007'\u001bh\u0001'\u001ciUU\u0014i\u0012bO'")).append(bigInteger.toString()).toString());
        }
        return bigInteger.intValue();
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprngb(sprbne sprbne2) {
        int n;
        int n2;
        int n3;
        int n4;
        void arg0;
        int n5;
        sprbne sprbne3 = (sprbne)sprbne2.cfr_renamed_85(0);
        int[] nArray = new int[sprbne3.cfr_renamed_84()];
        int n6 = n5 = 0;
        while (n6 < sprbne3.cfr_renamed_84()) {
            int n7 = n5++;
            nArray[n7] = sprngb.cfr_renamed_1440(sprbne3.cfr_renamed_85(n7));
            n6 = n5;
        }
        sprbne sprbne4 = (sprbne)arg0.cfr_renamed_85(1);
        byte[][] byArrayArray = new byte[sprbne4.cfr_renamed_84()][];
        int n8 = n4 = 0;
        while (n8 < byArrayArray.length) {
            int n9 = n4++;
            byArrayArray[n9] = ((sprlqe)sprbne4.cfr_renamed_85(n9)).cfr_renamed_186();
            n8 = n4;
        }
        sprbne sprbne5 = (sprbne)arg0.cfr_renamed_85(2);
        byte[][] byArrayArray2 = new byte[sprbne5.cfr_renamed_84()][];
        int n10 = n3 = 0;
        while (n10 < byArrayArray2.length) {
            int n11 = n3++;
            byArrayArray2[n11] = ((sprlqe)sprbne5.cfr_renamed_85(n11)).cfr_renamed_186();
            n10 = n3;
        }
        sprbne sprbne6 = (sprbne)arg0.cfr_renamed_85(3);
        byte[][][] byArrayArray3 = new byte[sprbne6.cfr_renamed_84()][][];
        int n12 = n2 = 0;
        while (n12 < byArrayArray3.length) {
            int n13;
            sprbne sprbne7 = (sprbne)sprbne6.cfr_renamed_85(n2);
            byArrayArray3[n2] = new byte[sprbne7.cfr_renamed_84()][];
            int n14 = n13 = 0;
            while (n14 < byArrayArray3[n2].length) {
                int n15 = n13++;
                byArrayArray3[n2][n15] = ((sprlqe)sprbne7.cfr_renamed_85(n15)).cfr_renamed_186();
                n14 = n13;
            }
            n12 = ++n2;
        }
        sprbne sprbne8 = (sprbne)arg0.cfr_renamed_85(4);
        byte[][][] byArrayArray4 = new byte[sprbne8.cfr_renamed_84()][][];
        int n16 = n = 0;
        while (n16 < byArrayArray4.length) {
            int n17;
            sprbne sprbne9 = (sprbne)sprbne8.cfr_renamed_85(n);
            byArrayArray4[n] = new byte[sprbne9.cfr_renamed_84()][];
            int n18 = n17 = 0;
            while (n18 < byArrayArray4[n].length) {
                int n19 = n17++;
                byArrayArray4[n][n19] = ((sprlqe)sprbne9.cfr_renamed_85(n19)).cfr_renamed_186();
                n18 = n17;
            }
            n16 = ++n;
        }
        sprbne sprbne10 = (sprbne)arg0.cfr_renamed_85(5);
        sprhxa[][] sprhxaArrayArray = new sprhxa[sprbne10.cfr_renamed_84()][];
    }

    @Override
    public sprvva cfr_renamed_119() {
        return this.cfr_renamed_4;
    }
}

