/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spracb;
import com.spire.presentation.packages.sprchk;
import com.spire.presentation.packages.sprdtaa;
import com.spire.presentation.packages.sprhxa;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprl;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.sprzra;
import java.util.Enumeration;
import java.util.Vector;

public class sprtdb {
    private int cfr_renamed_137;
    private sprlc cfr_renamed_79;
    private byte[][] cfr_renamed_107;
    private boolean cfr_renamed_132;
    private sprl cfr_renamed_102;
    private int[] cfr_renamed_93;
    private boolean cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private Vector cfr_renamed_112;
    private Vector[] cfr_renamed_119;
    private int cfr_renamed_91;
    private sprhxa[] cfr_renamed_0;
    private int cfr_renamed_1;
    private Vector cfr_renamed_2;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    /*
     * Unable to fully structure code
     */
    public void cfr_renamed_1196(byte[] arg0) {
        if (this.cfr_renamed_132) {
            System.out.print(sprdtaa.cfr_renamed_9("r\u001eIQK\u0004E\u0019\u0006\u0004V\u0015G\u0005C\u0002\u0006\u0017I\u0003\u0006%T\u0014CP\u0007"));
            return;
        }
        if (!this.cfr_renamed_86) {
            System.err.println(sprchk.cfr_renamed_9("[+O5N\ts\u0012_\u0007p\u0005<\bs\u0012<\u000fr\u000fh\u000f}\nu\u001cy\u0002="));
            return;
        }
        v0 = this;
        v0.cfr_renamed_93[0] = v0.cfr_renamed_93[0] + 1;
        if (v0.cfr_renamed_93[0] == 1) {
            v1 = this;
            v2 = v1;
            System.arraycopy(arg0, 0, v1.cfr_renamed_107[0], 0, this.cfr_renamed_91);
        } else {
            if (this.cfr_renamed_93[0] == 3) {
                v3 = this;
                if (v3.cfr_renamed_3 > v3.cfr_renamed_137) {
                    this.cfr_renamed_0[0].cfr_renamed_1390(arg0);
                }
            }
            v2 = this;
        }
        if ((v2.cfr_renamed_93[0] - 3) % 2 == 0 && this.cfr_renamed_93[0] >= 3) {
            v4 = this;
            if (v4.cfr_renamed_3 == v4.cfr_renamed_137) {
                this.cfr_renamed_119[0].insertElementAt(arg0, 0);
            }
        }
        v5 = this;
        if (this.cfr_renamed_93[0] == 0) {
            v5.cfr_renamed_2.addElement(arg0);
            this.cfr_renamed_112.addElement(spriwa.cfr_renamed_279(0));
            return;
        }
        var2_2 = new byte[v5.cfr_renamed_91];
        var3_3 = new byte[this.cfr_renamed_91 << 1];
        System.arraycopy(arg0, 0, var2_2, 0, this.cfr_renamed_91);
        var4_4 = 0;
        block0: while (true) {
            v6 = this;
            while (v6.cfr_renamed_2.size() > 0 && var4_4 == (Integer)this.cfr_renamed_112.lastElement()) {
                v7 = this;
                v8 = this;
                System.arraycopy(v8.cfr_renamed_2.lastElement(), 0, var3_3, 0, this.cfr_renamed_91);
                v8.cfr_renamed_2.removeElementAt(this.cfr_renamed_2.size() - 1);
                v7.cfr_renamed_112.removeElementAt(this.cfr_renamed_112.size() - 1);
                v9 = this;
                System.arraycopy(var2_2, 0, var3_3, v9.cfr_renamed_91, v9.cfr_renamed_91);
                v7.cfr_renamed_79.cfr_renamed_1197(var3_3, 0, var3_3.length);
                v10 = this;
                var2_2 = new byte[v10.cfr_renamed_79.cfr_renamed_1218()];
                v10.cfr_renamed_79.cfr_renamed_1219(var2_2, 0);
                if (++var4_4 >= this.cfr_renamed_3) continue block0;
                v11 = this;
                v12 = var4_4;
                v11.cfr_renamed_93[v12] = v11.cfr_renamed_93[v12] + 1;
                if (v11.cfr_renamed_93[var4_4] == 1) {
                    System.arraycopy(var2_2, 0, this.cfr_renamed_107[var4_4], 0, this.cfr_renamed_91);
                }
                v13 = this;
                if (var4_4 >= v13.cfr_renamed_3 - v13.cfr_renamed_137) {
                    if (var4_4 == 0) {
                        System.out.println(sprdtaa.cfr_renamed_9("k\uff8c\uffdb\uff8cv"));
                    }
                    if ((this.cfr_renamed_93[var4_4] - 3) % 2 != 0 || this.cfr_renamed_93[var4_4] < 3) continue block0;
                    v14 = this;
                    v6 = v14;
                    this.cfr_renamed_119[var4_4 - (v14.cfr_renamed_3 - this.cfr_renamed_137)].insertElementAt(var2_2, 0);
                    continue;
                }
                if (this.cfr_renamed_93[var4_4] == 3) ** break;
                continue block0;
                v15 = this;
                v6 = v15;
                v15.cfr_renamed_0[var4_4].cfr_renamed_1390(var2_2);
            }
            break;
        }
        v16 = this;
        v16.cfr_renamed_2.addElement(var2_2);
        v16.cfr_renamed_112.addElement(spriwa.cfr_renamed_279(var4_4));
        if (var4_4 == this.cfr_renamed_3) {
            v17 = this;
            this.cfr_renamed_132 = true;
            v17.cfr_renamed_86 = false;
            v17.cfr_renamed_152 = (byte[])this.cfr_renamed_2.lastElement();
        }
    }

    public byte[] cfr_renamed_1411() {
        return sprzra.cfr_renamed_158(this.cfr_renamed_152);
    }

    public String toString() {
        int n;
        String string = "";
        int n2 = this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.size();
        int n3 = n = 0;
        while (n3 < 8 + this.cfr_renamed_3 + n2) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(this.cfr_renamed_1381()[n]);
            string = stringBuilder.append(" ").toString();
            n3 = ++n;
        }
        int n4 = n = 0;
        while (n4 < 1 + this.cfr_renamed_3 + n2) {
            String string2 = new String(sprmma.cfr_renamed_485(this.cfr_renamed_1382()[n]));
            string = new StringBuilder().insert(0, string).append(string2).append(" ").toString();
            n4 = ++n;
        }
        string = new StringBuilder().insert(0, string).append("  ").append(this.cfr_renamed_102.cfr_renamed_1397().cfr_renamed_1218()).toString();
        return string;
    }

    public byte[][] cfr_renamed_1382() {
        int n;
        int n2 = this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.size();
        byte[][] byArray = new byte[1 + this.cfr_renamed_3 + n2][64];
        byte[][] byArray2 = byArray;
        byArray[0] = this.cfr_renamed_152;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            int n4 = 1 + n;
            byte[] byArray3 = this.cfr_renamed_107[n];
            byArray2[n4] = byArray3;
            n3 = ++n;
        }
        int n5 = n = 0;
        while (n5 < n2) {
            byte[] byArray4;
            int n6 = 1 + this.cfr_renamed_3 + n;
            byArray2[n6] = byArray4;
            n5 = ++n;
        }
        return byArray2;
    }

    /*
     * WARNING - void declaration
     */
    public sprtdb(int n, int n2, sprl sprl2) {
        void arg1;
        int n3;
        int n4 = n;
        sprtdb sprtdb2 = this;
        sprtdb sprtdb3 = this;
        this.cfr_renamed_3 = n;
        this.cfr_renamed_102 = sprl2;
        sprtdb3.cfr_renamed_79 = sprl2.cfr_renamed_1397();
        sprtdb3.cfr_renamed_91 = this.cfr_renamed_79.cfr_renamed_1218();
        sprtdb2.cfr_renamed_137 = n2;
        sprtdb2.cfr_renamed_93 = new int[n4];
        this.cfr_renamed_107 = new byte[n4][this.cfr_renamed_91];
        sprtdb sprtdb4 = this;
        sprtdb4.cfr_renamed_152 = new byte[sprtdb4.cfr_renamed_91];
        sprtdb4.cfr_renamed_119 = new Vector[sprtdb4.cfr_renamed_137 - 1];
        int n5 = n3 = 0;
        while (n5 < arg1 - true) {
            this.cfr_renamed_119[n3++] = new Vector();
            n5 = n3;
        }
    }

    public int[] cfr_renamed_1381() {
        int n;
        int[] nArray;
        sprtdb sprtdb2;
        int[] nArray2;
        int n2 = this.cfr_renamed_2 == null ? 0 : this.cfr_renamed_2.size();
        int[] nArray3 = nArray2 = new int[8 + this.cfr_renamed_3 + n2];
        nArray2[0] = this.cfr_renamed_3;
        nArray2[1] = this.cfr_renamed_91;
        nArray3[2] = this.cfr_renamed_137;
        nArray3[3] = this.cfr_renamed_1;
        sprtdb sprtdb3 = this;
        nArray2[4] = sprtdb3.cfr_renamed_4;
        if (sprtdb3.cfr_renamed_132) {
            sprtdb2 = this;
            nArray2[5] = 1;
        } else {
            nArray2[5] = 0;
            sprtdb2 = this;
        }
        int[] nArray4 = nArray2;
        if (sprtdb2.cfr_renamed_86) {
            nArray4[6] = 1;
            nArray = nArray2;
        } else {
            nArray4[6] = 0;
            nArray = nArray2;
        }
        nArray[7] = n2;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_3) {
            int n4 = 8 + n;
            int n5 = this.cfr_renamed_93[n];
            nArray2[n4] = n5;
            n3 = ++n;
        }
        int n6 = n = 0;
        while (n6 < n2) {
            int n7 = 8 + this.cfr_renamed_3 + n;
            int n8 = (Integer)this.cfr_renamed_112.elementAt(n);
            nArray2[n7] = n8;
            n6 = ++n;
        }
        return nArray2;
    }

    public sprhxa[] cfr_renamed_1412() {
        return spracb.cfr_renamed_1172(this.cfr_renamed_0);
    }

    /*
     * WARNING - void declaration
     */
    public sprtdb(sprlc sprlc2, byte[][] byArray, int[] nArray, sprhxa[] sprhxaArray, Vector[] vectorArray) {
        void arg4;
        void arg3;
        void arg1;
        int n;
        void v6;
        void v5;
        void arg2;
        void v0 = arg2;
        sprtdb sprtdb2 = this;
        void v2 = arg2;
        sprtdb sprtdb3 = this;
        sprtdb sprtdb4 = this;
        sprtdb4.cfr_renamed_79 = sprtdb4.cfr_renamed_102.cfr_renamed_1397();
        sprtdb3.cfr_renamed_102 = sprtdb4.cfr_renamed_102;
        sprtdb3.cfr_renamed_3 = arg2[0];
        this.cfr_renamed_91 = v2[1];
        sprtdb2.cfr_renamed_137 = v2[2];
        sprtdb2.cfr_renamed_1 = arg2[3];
        this.cfr_renamed_4 = v0[4];
        if (v0[5] == true) {
            v5 = arg2;
            this.cfr_renamed_132 = true;
        } else {
            this.cfr_renamed_132 = false;
            v5 = arg2;
        }
        if (v5[6] == true) {
            v6 = arg2;
            this.cfr_renamed_86 = true;
        } else {
            this.cfr_renamed_86 = false;
            v6 = arg2;
        }
        void var6_6 = v6[7];
        this.cfr_renamed_93 = new int[this.cfr_renamed_3];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3 = n++;
            this.cfr_renamed_93[n3] = arg2[8 + n3];
            n2 = n;
        }
        this.cfr_renamed_112 = new Vector();
        int n4 = n = 0;
        while (n4 < var6_6) {
            int n5 = 8 + this.cfr_renamed_3 + n;
            this.cfr_renamed_112.addElement(spriwa.cfr_renamed_279((int)arg2[n5]));
            n4 = ++n;
        }
        this.cfr_renamed_152 = arg1[0];
        this.cfr_renamed_107 = new byte[this.cfr_renamed_3][this.cfr_renamed_91];
        int n6 = n = 0;
        while (n6 < this.cfr_renamed_3) {
            int n7 = n++;
            this.cfr_renamed_107[n7] = arg1[1 + n7];
            n6 = n;
        }
        this.cfr_renamed_2 = new Vector();
        int n8 = n = 0;
        while (n8 < var6_6) {
            int n9 = 1 + this.cfr_renamed_3 + n;
            this.cfr_renamed_2.addElement(arg1[n9]);
            n8 = ++n;
        }
        this.cfr_renamed_0 = spracb.cfr_renamed_1172((sprhxa[])arg3);
        this.cfr_renamed_119 = spracb.cfr_renamed_1161((Vector[])arg4);
    }

    public void cfr_renamed_1413(byte[] arg0, byte[] arg1) {
        sprtdb sprtdb2 = this;
        if (sprtdb2.cfr_renamed_4 < sprtdb2.cfr_renamed_3 - this.cfr_renamed_137 && this.cfr_renamed_1 - 2 == this.cfr_renamed_93[0]) {
            sprtdb sprtdb3 = this;
            sprtdb sprtdb4 = this;
            sprtdb3.cfr_renamed_1414(arg0, sprtdb4.cfr_renamed_4);
            ++sprtdb4.cfr_renamed_4;
            sprtdb3.cfr_renamed_1 *= 2;
        }
        this.cfr_renamed_1196(arg1);
    }

    public byte[][] cfr_renamed_1415() {
        return spracb.cfr_renamed_522(this.cfr_renamed_107);
    }

    public boolean cfr_renamed_1383() {
        return this.cfr_renamed_86;
    }

    public boolean cfr_renamed_1394() {
        return this.cfr_renamed_132;
    }

    public void cfr_renamed_1414(byte[] arg0, int arg1) {
        this.cfr_renamed_0[arg1].cfr_renamed_1387(arg0);
    }

    public Vector[] cfr_renamed_1416() {
        return spracb.cfr_renamed_1161(this.cfr_renamed_119);
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1417(Vector vector) {
        int n;
        this.cfr_renamed_0 = new sprhxa[this.cfr_renamed_3 - this.cfr_renamed_137];
        int n2 = n = 0;
        while (true) {
            void arg0;
            sprtdb sprtdb2 = this;
            if (n2 >= sprtdb2.cfr_renamed_3 - sprtdb2.cfr_renamed_137) break;
            int n3 = n;
            sprhxa sprhxa2 = new sprhxa((Vector)arg0, n, this.cfr_renamed_102.cfr_renamed_1397());
            this.cfr_renamed_0[n3] = sprhxa2;
            n2 = ++n;
        }
        sprtdb sprtdb3 = this;
        sprtdb3.cfr_renamed_93 = new int[sprtdb3.cfr_renamed_3];
        sprtdb3.cfr_renamed_107 = new byte[sprtdb3.cfr_renamed_3][this.cfr_renamed_91];
        sprtdb sprtdb4 = this;
        this.cfr_renamed_152 = new byte[this.cfr_renamed_91];
        this.cfr_renamed_2 = new Vector();
        this.cfr_renamed_112 = new Vector();
        sprtdb4.cfr_renamed_86 = true;
        sprtdb4.cfr_renamed_132 = 0;
        int n4 = 0;
        n = 0;
        while (n4 < this.cfr_renamed_3) {
            this.cfr_renamed_93[n++] = -1;
            n4 = n;
        }
        this.cfr_renamed_119 = new Vector[this.cfr_renamed_137 - 1];
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_137 - 1) {
            this.cfr_renamed_119[n++] = new Vector();
            n5 = n;
        }
        this.cfr_renamed_1 = 3;
        this.cfr_renamed_4 = 0;
    }

    public Vector cfr_renamed_1418() {
        Enumeration enumeration;
        Vector vector = new Vector();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_2.elements();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            vector.addElement(enumeration3.nextElement());
        }
        return vector;
    }
}

