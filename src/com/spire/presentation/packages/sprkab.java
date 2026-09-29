/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragj;
import com.spire.presentation.packages.sprbhb;
import com.spire.presentation.packages.sprccb;
import com.spire.presentation.packages.sprehb;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.sprihb;
import com.spire.presentation.packages.sprl;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprlfk;
import com.spire.presentation.packages.sprmbb;
import com.spire.presentation.packages.sprtdb;
import com.spire.presentation.packages.spruab;
import com.spire.presentation.packages.sprwnd;
import com.spire.presentation.packages.spry;
import com.spire.presentation.packages.spryxa;
import com.spire.presentation.packages.sprzgb;
import java.security.SecureRandom;
import java.util.Vector;

public class sprkab
implements spry {
    private sprlc cfr_renamed_79;
    private int cfr_renamed_107;
    private int[] cfr_renamed_132;
    private boolean cfr_renamed_102;
    private sprl cfr_renamed_93;
    private int cfr_renamed_86;
    public static final String cfr_renamed_152 = "1.3.6.1.4.1.8301.3.1.3.3";
    private sprbhb cfr_renamed_112;
    private spruab cfr_renamed_119;
    private sprehb cfr_renamed_91;
    private int[] cfr_renamed_0;
    private int[] cfr_renamed_1;
    private byte[][] cfr_renamed_2;
    private byte[][] cfr_renamed_3;
    private byte[][] cfr_renamed_4;

    @Override
    public sprwnd cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    private /* synthetic */ sprtdb cfr_renamed_1432(Vector arg0, byte[] arg1, int arg2) {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_107];
        sprtdb sprtdb2 = new sprtdb(this.cfr_renamed_1[arg2], this.cfr_renamed_0[arg2], this.cfr_renamed_93);
        sprtdb2.cfr_renamed_1417(arg0);
        int n2 = 3;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 1 << this.cfr_renamed_1[arg2]) {
            if (n == n2 && n3 < this.cfr_renamed_1[arg2] - this.cfr_renamed_0[arg2]) {
                sprtdb2.cfr_renamed_1414(arg1, n3);
                ++n3;
                n2 *= 2;
            }
            byArray = this.cfr_renamed_119.cfr_renamed_1370(arg1);
            sprmbb sprmbb2 = new sprmbb(byArray, this.cfr_renamed_93.cfr_renamed_1397(), this.cfr_renamed_132[arg2]);
            sprtdb2.cfr_renamed_1196(sprmbb2.cfr_renamed_1157());
            n4 = ++n;
        }
        if (sprtdb2.cfr_renamed_1394()) {
            return sprtdb2;
        }
        System.err.println(spragj.cfr_renamed_9("\u001d\uffd90L P6Vsf2Q>\u0004=K0LsJ:G;PsB6V'M4\u00048K=W'V&M6V'\u0005r\u0005"));
        return null;
    }

    private /* synthetic */ sprtdb cfr_renamed_1433(byte[] arg0, Vector arg1, byte[] arg2, int arg3) {
        int n;
        sprtdb sprtdb2;
        sprmbb sprmbb2;
        sprkab sprkab2 = this;
        byte[] byArray = new byte[sprkab2.cfr_renamed_86];
        byte[] byArray2 = new byte[sprkab2.cfr_renamed_86];
        byArray2 = sprkab2.cfr_renamed_119.cfr_renamed_1370(arg2);
        sprtdb sprtdb3 = new sprtdb(this.cfr_renamed_1[arg3], this.cfr_renamed_0[arg3], this.cfr_renamed_93);
        sprtdb3.cfr_renamed_1417(arg1);
        if (arg3 == this.cfr_renamed_107 - 1) {
            sprmbb2 = new sprmbb(byArray2, this.cfr_renamed_93.cfr_renamed_1397(), this.cfr_renamed_132[arg3]);
            byArray = sprmbb2.cfr_renamed_1157();
            sprtdb2 = sprtdb3;
        } else {
            sprmbb2 = new sprmbb(byArray2, this.cfr_renamed_93.cfr_renamed_1397(), this.cfr_renamed_132[arg3]);
            this.cfr_renamed_4[arg3] = sprmbb2.cfr_renamed_1371(arg0);
            sprzgb sprzgb2 = new sprzgb(this.cfr_renamed_93.cfr_renamed_1397(), this.cfr_renamed_132[arg3]);
            byArray = sprzgb2.cfr_renamed_1367(arg0, this.cfr_renamed_4[arg3]);
            sprtdb2 = sprtdb3;
        }
        sprtdb2.cfr_renamed_1196(byArray);
        int n2 = 3;
        int n3 = 0;
        int n4 = n = 1;
        while (n4 < 1 << this.cfr_renamed_1[arg3]) {
            if (n == n2 && n3 < this.cfr_renamed_1[arg3] - this.cfr_renamed_0[arg3]) {
                sprtdb3.cfr_renamed_1414(arg2, n3);
                ++n3;
                n2 *= 2;
            }
            byArray2 = this.cfr_renamed_119.cfr_renamed_1370(arg2);
            sprmbb2 = new sprmbb(byArray2, this.cfr_renamed_93.cfr_renamed_1397(), this.cfr_renamed_132[arg3]);
            sprtdb3.cfr_renamed_1196(sprmbb2.cfr_renamed_1157());
            n4 = ++n;
        }
        if (sprtdb3.cfr_renamed_1394()) {
            return sprtdb3;
        }
        System.err.println(sprlfk.cfr_renamed_9("\u001eB)N|M3@4\u00032J?K(\u0003:F.W5D|H3M/W.V5F.W}\u0002}"));
        return null;
    }

    private /* synthetic */ void cfr_renamed_1303() {
        int[] nArray = new int[4];
        nArray[0] = 10;
        nArray[1] = 10;
        nArray[2] = 10;
        nArray[3] = 10;
        int[] nArray2 = nArray;
        int[] nArray3 = new int[4];
        nArray3[0] = 3;
        nArray3[1] = 3;
        nArray3[2] = 3;
        nArray3[3] = 3;
        int[] nArray4 = nArray3;
        int[] nArray5 = new int[4];
        nArray5[0] = 2;
        nArray5[1] = 2;
        nArray5[2] = 2;
        nArray5[3] = 2;
        int[] nArray6 = nArray5;
        sprehb sprehb2 = new sprehb(new SecureRandom(), new sprbhb(nArray2.length, nArray2, nArray4, nArray6));
        this.cfr_renamed_1304(sprehb2);
    }

    @Override
    public void cfr_renamed_1222(sprccb arg0) {
        this.cfr_renamed_1304(arg0);
    }

    private /* synthetic */ sprwnd cfr_renamed_1297() {
        int n;
        Object object;
        int n2;
        int n3;
        if (!this.cfr_renamed_102) {
            this.cfr_renamed_1303();
        }
        byte[][][] byArrayArray = new byte[this.cfr_renamed_107][][];
        byte[][][] byArrayArray2 = new byte[this.cfr_renamed_107 - 1][][];
        sprhxa[][] sprhxaArray = new sprhxa[this.cfr_renamed_107][];
        sprhxa[][] sprhxaArray2 = new sprhxa[this.cfr_renamed_107 - 1][];
        Vector[] vectorArray = new Vector[this.cfr_renamed_107];
        Vector[] vectorArray2 = new Vector[this.cfr_renamed_107 - 1];
        Vector[][] vectorArray3 = new Vector[this.cfr_renamed_107][];
        Vector[][] vectorArray4 = new Vector[this.cfr_renamed_107 - 1][];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_107) {
            int n5 = n3;
            byArrayArray[n5] = new byte[this.cfr_renamed_1[n5]][this.cfr_renamed_86];
            int n6 = n3;
            sprhxaArray[n6] = new sprhxa[this.cfr_renamed_1[n3] - this.cfr_renamed_0[n6]];
            if (n3 > 0) {
                byArrayArray2[n3 - 1] = new byte[this.cfr_renamed_1[n3]][this.cfr_renamed_86];
                sprhxaArray2[n3 - 1] = new sprhxa[this.cfr_renamed_1[n3] - this.cfr_renamed_0[n3]];
            }
            vectorArray[n3] = new Vector();
            if (n3 > 0) {
                vectorArray2[n3 - 1] = new Vector();
            }
            n4 = ++n3;
        }
        sprkab sprkab2 = this;
        byte[][] byArray = new byte[sprkab2.cfr_renamed_107][sprkab2.cfr_renamed_86];
        byte[][] byArray2 = new byte[this.cfr_renamed_107 - 1][this.cfr_renamed_86];
        sprkab sprkab3 = this;
        byte[][] byArray3 = new byte[sprkab3.cfr_renamed_107][sprkab3.cfr_renamed_86];
        int n7 = n2 = 0;
        while (n7 < this.cfr_renamed_107) {
            System.arraycopy(this.cfr_renamed_3[n2], 0, byArray3[++n2], 0, this.cfr_renamed_86);
            n7 = n2;
        }
        this.cfr_renamed_4 = new byte[this.cfr_renamed_107 - 1][this.cfr_renamed_86];
        int n8 = n2 = this.cfr_renamed_107 - 1;
        while (n8 >= 0) {
            object = new sprtdb(this.cfr_renamed_1[n2], this.cfr_renamed_0[n2], this.cfr_renamed_93);
            try {
                object = n2 == this.cfr_renamed_107 - 1 ? this.cfr_renamed_1433(null, vectorArray[n2], byArray3[n2], n2) : this.cfr_renamed_1433(byArray[n2 + 1], vectorArray[n2], byArray3[n2], n2);
            }
            catch (Exception exception) {
                exception.printStackTrace();
            }
            int n9 = n = 0;
            while (n9 < this.cfr_renamed_1[n2]) {
                System.arraycopy(((sprtdb)object).cfr_renamed_1415()[n], 0, byArrayArray[n2][++n], 0, this.cfr_renamed_86);
                n9 = n;
            }
            vectorArray3[n2] = ((sprtdb)object).cfr_renamed_1416();
            sprtdb sprtdb2 = object;
            sprhxaArray[n2] = sprtdb2.cfr_renamed_1412();
            System.arraycopy(sprtdb2.cfr_renamed_1411(), 0, byArray[--n2], 0, this.cfr_renamed_86);
            n8 = n2;
        }
        int n10 = n2 = this.cfr_renamed_107 - 2;
        while (n10 >= 0) {
            object = this.cfr_renamed_1432(vectorArray2[n2], byArray3[n2 + 1], n2 + 1);
            int n11 = n = 0;
            while (n11 < this.cfr_renamed_1[n2 + 1]) {
                System.arraycopy(((sprtdb)object).cfr_renamed_1415()[n], 0, byArrayArray2[n2][++n], 0, this.cfr_renamed_86);
                n11 = n;
            }
            vectorArray4[n2] = ((sprtdb)object).cfr_renamed_1416();
            int n12 = n2;
            sprhxaArray2[n12] = ((sprtdb)object).cfr_renamed_1412();
            System.arraycopy(((sprtdb)object).cfr_renamed_1411(), 0, byArray2[n2], 0, this.cfr_renamed_86);
            System.arraycopy(byArray3[n12 + 1], 0, this.cfr_renamed_2[--n2], 0, this.cfr_renamed_86);
            n10 = n2;
        }
        spryxa spryxa2 = new spryxa(byArray[0], this.cfr_renamed_112);
        sprkab sprkab4 = this;
        sprkab sprkab5 = this;
        object = new sprihb(sprkab4.cfr_renamed_3, sprkab4.cfr_renamed_2, byArrayArray, byArrayArray2, sprhxaArray, sprhxaArray2, vectorArray, vectorArray2, vectorArray3, vectorArray4, byArray2, sprkab5.cfr_renamed_4, sprkab5.cfr_renamed_112, this.cfr_renamed_93);
        return new sprwnd(spryxa2, (sprhgb)object);
    }

    public void cfr_renamed_1304(sprccb arg0) {
        int n;
        this.cfr_renamed_91 = (sprehb)arg0;
        sprkab sprkab2 = this;
        sprkab2.cfr_renamed_112 = new sprbhb(this.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1140(), this.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1249(), this.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1250(), this.cfr_renamed_91.cfr_renamed_284().cfr_renamed_1150());
        sprkab2.cfr_renamed_107 = this.cfr_renamed_112.cfr_renamed_1140();
        sprkab2.cfr_renamed_1 = sprkab2.cfr_renamed_112.cfr_renamed_1249();
        sprkab2.cfr_renamed_132 = sprkab2.cfr_renamed_112.cfr_renamed_1250();
        sprkab2.cfr_renamed_0 = sprkab2.cfr_renamed_112.cfr_renamed_1150();
        sprkab2.cfr_renamed_3 = new byte[sprkab2.cfr_renamed_107][this.cfr_renamed_86];
        this.cfr_renamed_2 = new byte[this.cfr_renamed_107 - 1][this.cfr_renamed_86];
        SecureRandom secureRandom = new SecureRandom();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_107) {
            sprkab sprkab3 = this;
            secureRandom.nextBytes(sprkab3.cfr_renamed_3[n]);
            sprkab3.cfr_renamed_119.cfr_renamed_1370(this.cfr_renamed_3[n++]);
            n2 = n;
        }
        this.cfr_renamed_102 = true;
    }

    public void cfr_renamed_1434(int arg0, SecureRandom arg1) {
        sprkab sprkab2;
        sprehb sprehb2;
        if (arg0 <= 10) {
            int[] nArray = new int[1];
            nArray[0] = 10;
            int[] nArray2 = nArray;
            int[] nArray3 = new int[1];
            nArray3[0] = 3;
            int[] nArray4 = nArray3;
            int[] nArray5 = new int[1];
            nArray5[0] = 2;
            int[] nArray6 = nArray5;
            sprehb2 = new sprehb(arg1, new sprbhb(nArray2.length, nArray2, nArray4, nArray6));
            sprkab2 = this;
        } else if (arg0 <= 20) {
            int[] nArray = new int[2];
            nArray[0] = 10;
            nArray[1] = 10;
            int[] nArray7 = nArray;
            int[] nArray8 = new int[2];
            nArray8[0] = 5;
            nArray8[1] = 4;
            int[] nArray9 = nArray8;
            int[] nArray10 = new int[2];
            nArray10[0] = 2;
            nArray10[1] = 2;
            int[] nArray11 = nArray10;
            sprehb2 = new sprehb(arg1, new sprbhb(nArray7.length, nArray7, nArray9, nArray11));
            sprkab2 = this;
        } else {
            int[] nArray = new int[4];
            nArray[0] = 10;
            nArray[1] = 10;
            nArray[2] = 10;
            nArray[3] = 10;
            int[] nArray12 = nArray;
            int[] nArray13 = new int[4];
            nArray13[0] = 9;
            nArray13[1] = 9;
            nArray13[2] = 9;
            nArray13[3] = 3;
            int[] nArray14 = nArray13;
            int[] nArray15 = new int[4];
            nArray15[0] = 2;
            nArray15[1] = 2;
            nArray15[2] = 2;
            nArray15[3] = 2;
            int[] nArray16 = nArray15;
            sprehb2 = new sprehb(arg1, new sprbhb(nArray12.length, nArray12, nArray14, nArray16));
            sprkab2 = this;
        }
        sprkab2.cfr_renamed_1304(sprehb2);
    }

    public sprkab(sprl arg0) {
        sprkab sprkab2 = this;
        this.cfr_renamed_102 = false;
        this.cfr_renamed_93 = arg0;
        sprkab2.cfr_renamed_79 = arg0.cfr_renamed_1397();
        sprkab2.cfr_renamed_86 = this.cfr_renamed_79.cfr_renamed_1218();
        sprkab sprkab3 = this;
        sprkab2.cfr_renamed_119 = new spruab(this.cfr_renamed_79);
    }
}

