/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcgo;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprkff;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprsye;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprxll;
import com.spire.presentation.packages.spryf;
import java.util.Enumeration;
import java.util.Vector;

public class sprgze {
    private byte[] cfr_renamed_137;
    private boolean cfr_renamed_79;
    private sprkff[] cfr_renamed_107;
    private int cfr_renamed_132;
    private int cfr_renamed_102;
    private sprgf cfr_renamed_93;
    private int cfr_renamed_86;
    private int cfr_renamed_152;
    private spryf cfr_renamed_112;
    private boolean cfr_renamed_119;
    private Vector cfr_renamed_91;
    private byte[][] cfr_renamed_0;
    private Vector[] cfr_renamed_1;
    private Vector cfr_renamed_2;
    private int[] cfr_renamed_3;
    private int cfr_renamed_4;

    public sprkff[] cfr_renamed_1412() {
        return sprsye.cfr_renamed_5640(this.cfr_renamed_107);
    }

    public int[] cfr_renamed_1381() {
        int n;
        int[] nArray;
        sprgze sprgze2;
        int[] nArray2;
        int n2 = this.cfr_renamed_91 == null ? 0 : this.cfr_renamed_91.size();
        int[] nArray3 = nArray2 = new int[8 + this.cfr_renamed_102 + n2];
        nArray2[0] = this.cfr_renamed_102;
        nArray2[1] = this.cfr_renamed_152;
        nArray3[2] = this.cfr_renamed_132;
        nArray3[3] = this.cfr_renamed_4;
        sprgze sprgze3 = this;
        nArray2[4] = sprgze3.cfr_renamed_86;
        if (sprgze3.cfr_renamed_119) {
            sprgze2 = this;
            nArray2[5] = 1;
        } else {
            nArray2[5] = 0;
            sprgze2 = this;
        }
        int[] nArray4 = nArray2;
        if (sprgze2.cfr_renamed_79) {
            nArray4[6] = 1;
            nArray = nArray2;
        } else {
            nArray4[6] = 0;
            nArray = nArray2;
        }
        nArray[7] = n2;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_102) {
            int n4 = 8 + n;
            int n5 = this.cfr_renamed_3[n];
            nArray2[n4] = n5;
            n3 = ++n;
        }
        int n6 = n = 0;
        while (n6 < n2) {
            int n7 = 8 + this.cfr_renamed_102 + n;
            int n8 = (Integer)this.cfr_renamed_2.elementAt(n);
            nArray2[n7] = n8;
            n6 = ++n;
        }
        return nArray2;
    }

    /*
     * WARNING - void declaration
     */
    public sprgze(int n, int n2, spryf spryf2) {
        void arg1;
        int n3;
        int n4 = n;
        sprgze sprgze2 = this;
        sprgze sprgze3 = this;
        this.cfr_renamed_102 = n;
        this.cfr_renamed_112 = spryf2;
        sprgze3.cfr_renamed_93 = spryf2.cfr_renamed_1397();
        sprgze3.cfr_renamed_152 = this.cfr_renamed_93.cfr_renamed_1218();
        sprgze2.cfr_renamed_132 = n2;
        sprgze2.cfr_renamed_3 = new int[n4];
        this.cfr_renamed_0 = new byte[n4][this.cfr_renamed_152];
        sprgze sprgze4 = this;
        sprgze4.cfr_renamed_137 = new byte[sprgze4.cfr_renamed_152];
        sprgze4.cfr_renamed_1 = new Vector[sprgze4.cfr_renamed_132 - 1];
        int n5 = n3 = 0;
        while (n5 < arg1 - true) {
            this.cfr_renamed_1[n3++] = new Vector();
            n5 = n3;
        }
    }

    public Vector[] cfr_renamed_1416() {
        return sprsye.cfr_renamed_1161(this.cfr_renamed_1);
    }

    public byte[][] cfr_renamed_1415() {
        return sprsye.cfr_renamed_522(this.cfr_renamed_0);
    }

    public boolean cfr_renamed_1394() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_1413(byte[] arg0, byte[] arg1) {
        sprgze sprgze2 = this;
        if (sprgze2.cfr_renamed_86 < sprgze2.cfr_renamed_102 - this.cfr_renamed_132 && this.cfr_renamed_4 - 2 == this.cfr_renamed_3[0]) {
            sprgze sprgze3 = this;
            sprgze sprgze4 = this;
            sprgze3.cfr_renamed_1414(arg0, sprgze4.cfr_renamed_86);
            ++sprgze4.cfr_renamed_86;
            sprgze3.cfr_renamed_4 *= 2;
        }
        this.cfr_renamed_1196(arg1);
    }

    /*
     * Unable to fully structure code
     */
    public void cfr_renamed_1196(byte[] arg0) {
        if (this.cfr_renamed_119) {
            System.out.print(sprxll.cfr_renamed_9("\u0004;?t=!3<p! 01 5'p2?&p\u0000\"15uq"));
            return;
        }
        if (!this.cfr_renamed_79) {
            System.err.println(sprcgo.cfr_renamed_9("]AI_HcuxYmvo:bux:etene{`sv\u007fh;"));
            return;
        }
        v0 = this;
        v0.cfr_renamed_3[0] = v0.cfr_renamed_3[0] + 1;
        if (v0.cfr_renamed_3[0] == 1) {
            v1 = this;
            v2 = v1;
            System.arraycopy(arg0, 0, v1.cfr_renamed_0[0], 0, this.cfr_renamed_152);
        } else {
            if (this.cfr_renamed_3[0] == 3) {
                v3 = this;
                if (v3.cfr_renamed_102 > v3.cfr_renamed_132) {
                    this.cfr_renamed_107[0].cfr_renamed_1390(arg0);
                }
            }
            v2 = this;
        }
        if ((v2.cfr_renamed_3[0] - 3) % 2 == 0 && this.cfr_renamed_3[0] >= 3) {
            v4 = this;
            if (v4.cfr_renamed_102 == v4.cfr_renamed_132) {
                this.cfr_renamed_1[0].insertElementAt(arg0, 0);
            }
        }
        v5 = this;
        if (this.cfr_renamed_3[0] == 0) {
            v5.cfr_renamed_91.addElement(arg0);
            this.cfr_renamed_2.addElement(spruaf.cfr_renamed_279(0));
            return;
        }
        var2_2 = new byte[v5.cfr_renamed_152];
        var3_3 = new byte[this.cfr_renamed_152 << 1];
        System.arraycopy(arg0, 0, var2_2, 0, this.cfr_renamed_152);
        var4_4 = 0;
        block0: while (true) {
            v6 = this;
            while (v6.cfr_renamed_91.size() > 0 && var4_4 == (Integer)this.cfr_renamed_2.lastElement()) {
                v7 = this;
                v8 = this;
                System.arraycopy(v8.cfr_renamed_91.lastElement(), 0, var3_3, 0, this.cfr_renamed_152);
                v8.cfr_renamed_91.removeElementAt(this.cfr_renamed_91.size() - 1);
                v7.cfr_renamed_2.removeElementAt(this.cfr_renamed_2.size() - 1);
                v9 = this;
                System.arraycopy(var2_2, 0, var3_3, v9.cfr_renamed_152, v9.cfr_renamed_152);
                v7.cfr_renamed_93.cfr_renamed_1197(var3_3, 0, var3_3.length);
                v10 = this;
                var2_2 = new byte[v10.cfr_renamed_93.cfr_renamed_1218()];
                v10.cfr_renamed_93.cfr_renamed_1219(var2_2, 0);
                if (++var4_4 >= this.cfr_renamed_102) continue block0;
                v11 = this;
                v12 = var4_4;
                v11.cfr_renamed_3[v12] = v11.cfr_renamed_3[v12] + 1;
                if (v11.cfr_renamed_3[var4_4] == 1) {
                    System.arraycopy(var2_2, 0, this.cfr_renamed_0[var4_4], 0, this.cfr_renamed_152);
                }
                v13 = this;
                if (var4_4 >= v13.cfr_renamed_102 - v13.cfr_renamed_132) {
                    if (var4_4 == 0) {
                        System.out.println(sprxll.cfr_renamed_9("\u001d\uffa9\uffad\uffa9\u0000"));
                    }
                    if ((this.cfr_renamed_3[var4_4] - 3) % 2 != 0 || this.cfr_renamed_3[var4_4] < 3) continue block0;
                    v14 = this;
                    v6 = v14;
                    this.cfr_renamed_1[var4_4 - (v14.cfr_renamed_102 - this.cfr_renamed_132)].insertElementAt(var2_2, 0);
                    continue;
                }
                if (this.cfr_renamed_3[var4_4] == 3) ** break;
                continue block0;
                v15 = this;
                v6 = v15;
                v15.cfr_renamed_107[var4_4].cfr_renamed_1390(var2_2);
            }
            break;
        }
        v16 = this;
        v16.cfr_renamed_91.addElement(var2_2);
        v16.cfr_renamed_2.addElement(spruaf.cfr_renamed_279(var4_4));
        if (var4_4 == this.cfr_renamed_102) {
            v17 = this;
            this.cfr_renamed_119 = true;
            v17.cfr_renamed_79 = false;
            v17.cfr_renamed_137 = (byte[])this.cfr_renamed_91.lastElement();
        }
    }

    public String toString() {
        int n;
        String string = "";
        int n2 = this.cfr_renamed_91 == null ? 0 : this.cfr_renamed_91.size();
        int n3 = n = 0;
        while (n3 < 8 + this.cfr_renamed_102 + n2) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(this.cfr_renamed_1381()[n]);
            string = stringBuilder.append(" ").toString();
            n3 = ++n;
        }
        int n4 = n = 0;
        while (n4 < 1 + this.cfr_renamed_102 + n2) {
            String string2 = new String(sprfqe.cfr_renamed_485(this.cfr_renamed_1382()[n]));
            string = new StringBuilder().insert(0, string).append(string2).append(" ").toString();
            n4 = ++n;
        }
        string = new StringBuilder().insert(0, string).append("  ").append(this.cfr_renamed_112.cfr_renamed_1397().cfr_renamed_1218()).toString();
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1417(Vector vector) {
        int n;
        this.cfr_renamed_107 = new sprkff[this.cfr_renamed_102 - this.cfr_renamed_132];
        int n2 = n = 0;
        while (true) {
            void arg0;
            sprgze sprgze2 = this;
            if (n2 >= sprgze2.cfr_renamed_102 - sprgze2.cfr_renamed_132) break;
            int n3 = n;
            sprkff sprkff2 = new sprkff((Vector)arg0, n, this.cfr_renamed_112.cfr_renamed_1397());
            this.cfr_renamed_107[n3] = sprkff2;
            n2 = ++n;
        }
        sprgze sprgze3 = this;
        sprgze3.cfr_renamed_3 = new int[sprgze3.cfr_renamed_102];
        sprgze3.cfr_renamed_0 = new byte[sprgze3.cfr_renamed_102][this.cfr_renamed_152];
        sprgze sprgze4 = this;
        this.cfr_renamed_137 = new byte[this.cfr_renamed_152];
        this.cfr_renamed_91 = new Vector();
        this.cfr_renamed_2 = new Vector();
        sprgze4.cfr_renamed_79 = true;
        sprgze4.cfr_renamed_119 = 0;
        int n4 = 0;
        n = 0;
        while (n4 < this.cfr_renamed_102) {
            this.cfr_renamed_3[n++] = -1;
            n4 = n;
        }
        this.cfr_renamed_1 = new Vector[this.cfr_renamed_132 - 1];
        int n5 = n = 0;
        while (n5 < this.cfr_renamed_132 - 1) {
            this.cfr_renamed_1[n++] = new Vector();
            n5 = n;
        }
        this.cfr_renamed_4 = 3;
        this.cfr_renamed_86 = 0;
    }

    public Vector cfr_renamed_1418() {
        Enumeration enumeration;
        Vector vector = new Vector();
        Enumeration enumeration2 = enumeration = this.cfr_renamed_91.elements();
        while (enumeration2.hasMoreElements()) {
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            vector.addElement(enumeration3.nextElement());
        }
        return vector;
    }

    public boolean cfr_renamed_1383() {
        return this.cfr_renamed_79;
    }

    public byte[][] cfr_renamed_1382() {
        int n;
        int n2 = this.cfr_renamed_91 == null ? 0 : this.cfr_renamed_91.size();
        byte[][] byArray = new byte[1 + this.cfr_renamed_102 + n2][64];
        byte[][] byArray2 = byArray;
        byArray[0] = this.cfr_renamed_137;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_102) {
            int n4 = 1 + n;
            byte[] byArray3 = this.cfr_renamed_0[n];
            byArray2[n4] = byArray3;
            n3 = ++n;
        }
        int n5 = n = 0;
        while (n5 < n2) {
            byte[] byArray4;
            int n6 = 1 + this.cfr_renamed_102 + n;
            byArray2[n6] = byArray4;
            n5 = ++n;
        }
        return byArray2;
    }

    public void cfr_renamed_1414(byte[] arg0, int arg1) {
        this.cfr_renamed_107[arg1].cfr_renamed_1387(arg0);
    }

    public byte[] cfr_renamed_1411() {
        return sproze.cfr_renamed_158(this.cfr_renamed_137);
    }
}

