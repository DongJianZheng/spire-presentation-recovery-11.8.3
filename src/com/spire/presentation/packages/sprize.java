/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraze;
import com.spire.presentation.packages.sprbcf;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgye;
import com.spire.presentation.packages.sprgze;
import com.spire.presentation.packages.sprhaf;
import com.spire.presentation.packages.sprii;
import com.spire.presentation.packages.sprixe;
import com.spire.presentation.packages.sprkff;
import com.spire.presentation.packages.sprnye;
import com.spire.presentation.packages.sprsil;
import com.spire.presentation.packages.spruns;
import com.spire.presentation.packages.sprvbf;
import com.spire.presentation.packages.spryf;
import com.spire.presentation.packages.sprysha;
import com.spire.presentation.packages.spryxe;
import com.spire.presentation.packages.spryye;
import java.security.SecureRandom;
import java.util.Vector;

public class sprize
implements sprii {
    public static final String cfr_renamed_79 = "1.3.6.1.4.1.8301.3.1.3.3";
    private sprnye cfr_renamed_107;
    private byte[][] cfr_renamed_132;
    private sprvbf cfr_renamed_102;
    private int[] cfr_renamed_93;
    private spraze cfr_renamed_86;
    private sprgf cfr_renamed_152;
    private int cfr_renamed_112;
    private int[] cfr_renamed_119;
    private spryf cfr_renamed_91;
    private int[] cfr_renamed_0;
    private boolean cfr_renamed_1;
    private byte[][] cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[][] cfr_renamed_4;

    @Override
    public void cfr_renamed_5536(sprgye arg0) {
        this.cfr_renamed_5537(arg0);
    }

    @Override
    public sprsil cfr_renamed_1223() {
        return this.cfr_renamed_1297();
    }

    public void cfr_renamed_1434(int arg0, SecureRandom arg1) {
        sprize sprize2;
        sprvbf sprvbf2;
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
            sprvbf2 = new sprvbf(arg1, new sprnye(nArray2.length, nArray2, nArray4, nArray6));
            sprize2 = this;
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
            sprvbf2 = new sprvbf(arg1, new sprnye(nArray7.length, nArray7, nArray9, nArray11));
            sprize2 = this;
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
            sprvbf2 = new sprvbf(arg1, new sprnye(nArray12.length, nArray12, nArray14, nArray16));
            sprize2 = this;
        }
        sprize2.cfr_renamed_5537(sprvbf2);
    }

    public void cfr_renamed_5537(sprgye arg0) {
        int n;
        this.cfr_renamed_102 = (sprvbf)arg0;
        sprize sprize2 = this;
        sprize2.cfr_renamed_107 = new sprnye(this.cfr_renamed_102.cfr_renamed_284().cfr_renamed_1140(), this.cfr_renamed_102.cfr_renamed_284().cfr_renamed_1249(), this.cfr_renamed_102.cfr_renamed_284().cfr_renamed_1250(), this.cfr_renamed_102.cfr_renamed_284().cfr_renamed_1150());
        sprize2.cfr_renamed_3 = this.cfr_renamed_107.cfr_renamed_1140();
        sprize2.cfr_renamed_119 = sprize2.cfr_renamed_107.cfr_renamed_1249();
        sprize2.cfr_renamed_0 = sprize2.cfr_renamed_107.cfr_renamed_1250();
        sprize2.cfr_renamed_93 = sprize2.cfr_renamed_107.cfr_renamed_1150();
        sprize2.cfr_renamed_4 = new byte[sprize2.cfr_renamed_3][this.cfr_renamed_112];
        this.cfr_renamed_132 = new byte[this.cfr_renamed_3 - 1][this.cfr_renamed_112];
        SecureRandom secureRandom = arg0.cfr_renamed_1295();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            sprize sprize3 = this;
            secureRandom.nextBytes(sprize3.cfr_renamed_4[n]);
            sprize3.cfr_renamed_86.cfr_renamed_1370(this.cfr_renamed_4[n++]);
            n2 = n;
        }
        this.cfr_renamed_1 = true;
    }

    private /* synthetic */ sprgze cfr_renamed_1432(Vector arg0, byte[] arg1, int arg2) {
        int n;
        byte[] byArray = new byte[this.cfr_renamed_3];
        sprgze sprgze2 = new sprgze(this.cfr_renamed_119[arg2], this.cfr_renamed_93[arg2], this.cfr_renamed_91);
        sprgze2.cfr_renamed_1417(arg0);
        int n2 = 3;
        int n3 = 0;
        int n4 = n = 0;
        while (n4 < 1 << this.cfr_renamed_119[arg2]) {
            if (n == n2 && n3 < this.cfr_renamed_119[arg2] - this.cfr_renamed_93[arg2]) {
                sprgze2.cfr_renamed_1414(arg1, n3);
                ++n3;
                n2 *= 2;
            }
            byArray = this.cfr_renamed_86.cfr_renamed_1370(arg1);
            sprixe sprixe2 = new sprixe(byArray, this.cfr_renamed_91.cfr_renamed_1397(), this.cfr_renamed_0[arg2]);
            sprgze2.cfr_renamed_1196(sprixe2.cfr_renamed_1157());
            n4 = ++n;
        }
        if (sprgze2.cfr_renamed_1394()) {
            return sprgze2;
        }
        System.err.println(spruns.cfr_renamed_9("-\uffb2\u0000'\u0010;\u0006=C\r\u0002:\u000eo\r \u0000'C!\n,\u000b;C)\u0006=\u0017&\u0004o\b \r<\u0017=\u0016&\u0006=\u0017nBn"));
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
        sprvbf sprvbf2 = new sprvbf(null, new sprnye(nArray2.length, nArray2, nArray4, nArray6));
        this.cfr_renamed_5537(sprvbf2);
    }

    private /* synthetic */ sprsil cfr_renamed_1297() {
        int n;
        Object object;
        int n2;
        int n3;
        if (!this.cfr_renamed_1) {
            this.cfr_renamed_1303();
        }
        byte[][][] byArrayArray = new byte[this.cfr_renamed_3][][];
        byte[][][] byArrayArray2 = new byte[this.cfr_renamed_3 - 1][][];
        sprkff[][] sprkffArray = new sprkff[this.cfr_renamed_3][];
        sprkff[][] sprkffArray2 = new sprkff[this.cfr_renamed_3 - 1][];
        Vector[] vectorArray = new Vector[this.cfr_renamed_3];
        Vector[] vectorArray2 = new Vector[this.cfr_renamed_3 - 1];
        Vector[][] vectorArray3 = new Vector[this.cfr_renamed_3][];
        Vector[][] vectorArray4 = new Vector[this.cfr_renamed_3 - 1][];
        int n4 = n3 = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5 = n3;
            byArrayArray[n5] = new byte[this.cfr_renamed_119[n5]][this.cfr_renamed_112];
            int n6 = n3;
            sprkffArray[n6] = new sprkff[this.cfr_renamed_119[n3] - this.cfr_renamed_93[n6]];
            if (n3 > 0) {
                byArrayArray2[n3 - 1] = new byte[this.cfr_renamed_119[n3]][this.cfr_renamed_112];
                sprkffArray2[n3 - 1] = new sprkff[this.cfr_renamed_119[n3] - this.cfr_renamed_93[n3]];
            }
            vectorArray[n3] = new Vector();
            if (n3 > 0) {
                vectorArray2[n3 - 1] = new Vector();
            }
            n4 = ++n3;
        }
        sprize sprize2 = this;
        byte[][] byArray = new byte[sprize2.cfr_renamed_3][sprize2.cfr_renamed_112];
        byte[][] byArray2 = new byte[this.cfr_renamed_3 - 1][this.cfr_renamed_112];
        sprize sprize3 = this;
        byte[][] byArray3 = new byte[sprize3.cfr_renamed_3][sprize3.cfr_renamed_112];
        int n7 = n2 = 0;
        while (n7 < this.cfr_renamed_3) {
            System.arraycopy(this.cfr_renamed_4[n2], 0, byArray3[++n2], 0, this.cfr_renamed_112);
            n7 = n2;
        }
        this.cfr_renamed_2 = new byte[this.cfr_renamed_3 - 1][this.cfr_renamed_112];
        int n8 = n2 = this.cfr_renamed_3 - 1;
        while (n8 >= 0) {
            object = n2 == this.cfr_renamed_3 - 1 ? this.cfr_renamed_1433(null, vectorArray[n2], byArray3[n2], n2) : this.cfr_renamed_1433(byArray[n2 + 1], vectorArray[n2], byArray3[n2], n2);
            int n9 = n = 0;
            while (n9 < this.cfr_renamed_119[n2]) {
                System.arraycopy(((sprgze)object).cfr_renamed_1415()[n], 0, byArrayArray[n2][++n], 0, this.cfr_renamed_112);
                n9 = n;
            }
            vectorArray3[n2] = ((sprgze)object).cfr_renamed_1416();
            sprgze sprgze2 = object;
            sprkffArray[n2] = sprgze2.cfr_renamed_1412();
            System.arraycopy(sprgze2.cfr_renamed_1411(), 0, byArray[--n2], 0, this.cfr_renamed_112);
            n8 = n2;
        }
        int n10 = n2 = this.cfr_renamed_3 - 2;
        while (n10 >= 0) {
            object = this.cfr_renamed_1432(vectorArray2[n2], byArray3[n2 + 1], n2 + 1);
            int n11 = n = 0;
            while (n11 < this.cfr_renamed_119[n2 + 1]) {
                System.arraycopy(((sprgze)object).cfr_renamed_1415()[n], 0, byArrayArray2[n2][++n], 0, this.cfr_renamed_112);
                n11 = n;
            }
            vectorArray4[n2] = ((sprgze)object).cfr_renamed_1416();
            int n12 = n2;
            sprkffArray2[n12] = ((sprgze)object).cfr_renamed_1412();
            System.arraycopy(((sprgze)object).cfr_renamed_1411(), 0, byArray2[n2], 0, this.cfr_renamed_112);
            System.arraycopy(byArray3[n12 + 1], 0, this.cfr_renamed_132[--n2], 0, this.cfr_renamed_112);
            n10 = n2;
        }
        spryxe spryxe2 = new spryxe(byArray[0], this.cfr_renamed_107);
        sprize sprize4 = this;
        sprize sprize5 = this;
        object = new sprbcf(sprize4.cfr_renamed_4, sprize4.cfr_renamed_132, byArrayArray, byArrayArray2, sprkffArray, sprkffArray2, vectorArray, vectorArray2, vectorArray3, vectorArray4, byArray2, sprize5.cfr_renamed_2, sprize5.cfr_renamed_107, this.cfr_renamed_91);
        return new sprsil(spryxe2, (spryye)object);
    }

    private /* synthetic */ sprgze cfr_renamed_1433(byte[] arg0, Vector arg1, byte[] arg2, int arg3) {
        int n;
        sprgze sprgze2;
        sprixe sprixe2;
        sprize sprize2 = this;
        byte[] byArray = new byte[sprize2.cfr_renamed_112];
        byte[] byArray2 = new byte[sprize2.cfr_renamed_112];
        byArray2 = sprize2.cfr_renamed_86.cfr_renamed_1370(arg2);
        sprgze sprgze3 = new sprgze(this.cfr_renamed_119[arg3], this.cfr_renamed_93[arg3], this.cfr_renamed_91);
        sprgze3.cfr_renamed_1417(arg1);
        if (arg3 == this.cfr_renamed_3 - 1) {
            sprixe2 = new sprixe(byArray2, this.cfr_renamed_91.cfr_renamed_1397(), this.cfr_renamed_0[arg3]);
            byArray = sprixe2.cfr_renamed_1157();
            sprgze2 = sprgze3;
        } else {
            sprixe2 = new sprixe(byArray2, this.cfr_renamed_91.cfr_renamed_1397(), this.cfr_renamed_0[arg3]);
            this.cfr_renamed_2[arg3] = sprixe2.cfr_renamed_1371(arg0);
            sprhaf sprhaf2 = new sprhaf(this.cfr_renamed_91.cfr_renamed_1397(), this.cfr_renamed_0[arg3]);
            byArray = sprhaf2.cfr_renamed_1367(arg0, this.cfr_renamed_2[arg3]);
            sprgze2 = sprgze3;
        }
        sprgze2.cfr_renamed_1196(byArray);
        int n2 = 3;
        int n3 = 0;
        int n4 = n = 1;
        while (n4 < 1 << this.cfr_renamed_119[arg3]) {
            if (n == n2 && n3 < this.cfr_renamed_119[arg3] - this.cfr_renamed_93[arg3]) {
                sprgze3.cfr_renamed_1414(arg2, n3);
                ++n3;
                n2 *= 2;
            }
            byArray2 = this.cfr_renamed_86.cfr_renamed_1370(arg2);
            sprixe2 = new sprixe(byArray2, this.cfr_renamed_91.cfr_renamed_1397(), this.cfr_renamed_0[arg3]);
            sprgze3.cfr_renamed_1196(sprixe2.cfr_renamed_1157());
            n4 = ++n;
        }
        if (sprgze3.cfr_renamed_1394()) {
            return sprgze3;
        }
        System.err.println(sprysha.cfr_renamed_9("\bV?ZjY%T\"\u0017$^)_>\u0017,R8C#Pj\\%Y9C8B#R8Ck\u0016k"));
        return null;
    }

    public sprize(spryf arg0) {
        sprize sprize2 = this;
        this.cfr_renamed_1 = false;
        this.cfr_renamed_91 = arg0;
        sprize2.cfr_renamed_152 = arg0.cfr_renamed_1397();
        sprize2.cfr_renamed_112 = this.cfr_renamed_152.cfr_renamed_1218();
        sprize sprize3 = this;
        sprize2.cfr_renamed_86 = new spraze(this.cfr_renamed_152);
    }
}

