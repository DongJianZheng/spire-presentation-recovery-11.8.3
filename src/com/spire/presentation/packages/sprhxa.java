/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprboj;
import com.spire.presentation.packages.spriwa;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmma;
import com.spire.presentation.packages.spruab;
import com.spire.presentation.packages.sprzgp;
import java.util.Vector;

public class sprhxa {
    private boolean cfr_renamed_102;
    private boolean cfr_renamed_93;
    private byte[] cfr_renamed_86;
    private byte[] cfr_renamed_152;
    private boolean cfr_renamed_112;
    private int cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private Vector cfr_renamed_0;
    private int cfr_renamed_1;
    private Vector cfr_renamed_2;
    private int cfr_renamed_3;
    private sprlc cfr_renamed_4;

    public String toString() {
        int n;
        String string = sprzgp.cfr_renamed_9("\u007fJN]CYXP\u000b\u0018\u000b\u0018\u0011\u0018");
        int n2 = n = 0;
        while (n2 < 6 + this.cfr_renamed_3) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(this.cfr_renamed_1381()[n]);
            string = stringBuilder.append(" ").toString();
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 < 3 + this.cfr_renamed_3) {
            string = this.cfr_renamed_1382()[n] != null ? new StringBuilder().insert(0, string).append(new String(sprmma.cfr_renamed_485(this.cfr_renamed_1382()[n]))).append(" ").toString() : new StringBuilder().insert(0, string).append(sprboj.cfr_renamed_9("d]fD*")).toString();
            n3 = ++n;
        }
        string = new StringBuilder().insert(0, string).append("  ").append(this.cfr_renamed_4.cfr_renamed_1218()).toString();
        return string;
    }

    public sprhxa(Vector arg0, int arg1, sprlc arg2) {
        sprhxa sprhxa2 = this;
        sprhxa sprhxa3 = this;
        this.cfr_renamed_0 = arg0;
        sprhxa3.cfr_renamed_1 = arg1;
        sprhxa3.cfr_renamed_91 = null;
        sprhxa2.cfr_renamed_102 = false;
        sprhxa2.cfr_renamed_93 = false;
        this.cfr_renamed_112 = false;
        this.cfr_renamed_4 = arg2;
        this.cfr_renamed_86 = new byte[this.cfr_renamed_4.cfr_renamed_1218()];
        this.cfr_renamed_152 = new byte[this.cfr_renamed_4.cfr_renamed_1218()];
    }

    /*
     * WARNING - void declaration
     */
    public sprhxa(sprlc sprlc2, byte[][] byArray, int[] nArray) {
        void arg1;
        int n;
        sprhxa sprhxa2;
        void v3;
        void v2;
        void arg0;
        void arg2;
        void v0 = arg2;
        sprhxa sprhxa3 = this;
        this.cfr_renamed_4 = arg0;
        sprhxa3.cfr_renamed_1 = arg2[0];
        sprhxa3.cfr_renamed_3 = arg2[1];
        this.cfr_renamed_119 = v0[2];
        if (v0[3] == true) {
            v2 = arg2;
            this.cfr_renamed_93 = true;
        } else {
            this.cfr_renamed_93 = false;
            v2 = arg2;
        }
        if (v2[4] == true) {
            v3 = arg2;
            this.cfr_renamed_102 = true;
        } else {
            this.cfr_renamed_102 = false;
            v3 = arg2;
        }
        if (v3[5] == true) {
            sprhxa2 = this;
            this.cfr_renamed_112 = true;
        } else {
            sprhxa2 = this;
            this.cfr_renamed_112 = false;
        }
        sprhxa2.cfr_renamed_2 = new Vector();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3 = 6 + n;
            this.cfr_renamed_2.addElement(spriwa.cfr_renamed_279((int)arg2[n3]));
            n2 = ++n;
        }
        sprhxa sprhxa4 = this;
        void v8 = arg1;
        this.cfr_renamed_91 = v8[0];
        sprhxa4.cfr_renamed_152 = v8[1];
        sprhxa4.cfr_renamed_86 = arg1[2];
        sprhxa sprhxa5 = this;
        this.cfr_renamed_0 = new Vector();
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_3) {
            int n5 = 3 + n;
            this.cfr_renamed_0.addElement(arg1[n5]);
            n4 = ++n;
        }
    }

    public boolean cfr_renamed_1383() {
        return this.cfr_renamed_102;
    }

    public void cfr_renamed_1384() {
        sprhxa sprhxa2 = this;
        sprhxa sprhxa3 = this;
        this.cfr_renamed_102 = false;
        sprhxa3.cfr_renamed_93 = false;
        sprhxa3.cfr_renamed_91 = null;
        sprhxa2.cfr_renamed_3 = 0;
        sprhxa2.cfr_renamed_119 = -1;
    }

    public void cfr_renamed_1385(spruab arg0) {
        arg0.cfr_renamed_1370(this.cfr_renamed_86);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 5 << 1;
        while (n4 >= 0) {
            int n6 = n2--;
            cArray[n6] = (char)(s.charAt(n6) ^ n5);
            if (n2 < 0) break;
            int n7 = n2--;
            cArray[n7] = (char)(s.charAt(n7) ^ n3);
            n4 = n2;
        }
        return new String(cArray);
    }

    public void cfr_renamed_1386(spruab arg0, byte[] arg1) {
        sprhxa sprhxa2;
        if (this.cfr_renamed_93) {
            System.err.println(sprzgp.cfr_renamed_9("eW\u000bUDJN\u0018^HOY_]\u000bHDKXQITN\u0018MWY\u0018_JN]CYXP\u000bQEK_YE[N\u0019"));
            return;
        }
        if (!this.cfr_renamed_102) {
            System.err.println(sprboj.cfr_renamed_9("^ZoMbIy@*Ad[~IdKo\bdG~\bcFc\\cIfApMn\bhMlGxM*]zLk\\o"));
            return;
        }
        sprhxa sprhxa3 = this;
        byte[] byArray = new byte[sprhxa3.cfr_renamed_4.cfr_renamed_1218()];
        int n = -1;
        arg0.cfr_renamed_1370(this.cfr_renamed_152);
        if (sprhxa3.cfr_renamed_91 == null) {
            sprhxa2 = this;
            this.cfr_renamed_91 = arg1;
            this.cfr_renamed_119 = 0;
        } else {
            byte[] byArray2;
            byArray = arg1;
            n = 0;
            sprhxa sprhxa4 = this;
            while (sprhxa4.cfr_renamed_3 > 0 && n == (Integer)this.cfr_renamed_2.lastElement()) {
                sprhxa sprhxa5 = this;
                byArray2 = new byte[sprhxa5.cfr_renamed_4.cfr_renamed_1218() << 1];
                System.arraycopy(sprhxa5.cfr_renamed_0.lastElement(), 0, byArray2, 0, this.cfr_renamed_4.cfr_renamed_1218());
                sprhxa5.cfr_renamed_0.removeElementAt(this.cfr_renamed_0.size() - 1);
                sprhxa5.cfr_renamed_2.removeElementAt(this.cfr_renamed_2.size() - 1);
                System.arraycopy(byArray, 0, byArray2, this.cfr_renamed_4.cfr_renamed_1218(), this.cfr_renamed_4.cfr_renamed_1218());
                sprhxa5.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
                sprhxa sprhxa6 = this;
                byArray = new byte[sprhxa6.cfr_renamed_4.cfr_renamed_1218()];
                ++n;
                sprhxa sprhxa7 = this;
                sprhxa6.cfr_renamed_4.cfr_renamed_1219(byArray, 0);
                sprhxa4 = sprhxa7;
                --sprhxa7.cfr_renamed_3;
            }
            sprhxa sprhxa8 = this;
            sprhxa8.cfr_renamed_0.addElement(byArray);
            sprhxa8.cfr_renamed_2.addElement(spriwa.cfr_renamed_279(n));
            ++sprhxa8.cfr_renamed_3;
            if ((Integer)sprhxa8.cfr_renamed_2.lastElement() == this.cfr_renamed_119) {
                sprhxa sprhxa9 = this;
                byArray2 = new byte[sprhxa9.cfr_renamed_4.cfr_renamed_1218() << 1];
                System.arraycopy(sprhxa9.cfr_renamed_91, 0, byArray2, 0, this.cfr_renamed_4.cfr_renamed_1218());
                System.arraycopy(sprhxa9.cfr_renamed_0.lastElement(), 0, byArray2, this.cfr_renamed_4.cfr_renamed_1218(), this.cfr_renamed_4.cfr_renamed_1218());
                sprhxa9.cfr_renamed_0.removeElementAt(this.cfr_renamed_0.size() - 1);
                sprhxa9.cfr_renamed_2.removeElementAt(this.cfr_renamed_2.size() - 1);
                sprhxa9.cfr_renamed_4.cfr_renamed_1197(byArray2, 0, byArray2.length);
                sprhxa sprhxa10 = this;
                sprhxa10.cfr_renamed_91 = new byte[sprhxa10.cfr_renamed_4.cfr_renamed_1218()];
                sprhxa10.cfr_renamed_4.cfr_renamed_1219(this.cfr_renamed_91, 0);
                ++this.cfr_renamed_119;
                this.cfr_renamed_3 = 0;
            }
            sprhxa2 = this;
        }
        if (sprhxa2.cfr_renamed_119 == this.cfr_renamed_1) {
            this.cfr_renamed_93 = true;
        }
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1387(byte[] byArray) {
        void arg0;
        System.arraycopy(arg0, 0, this.cfr_renamed_86, 0, this.cfr_renamed_4.cfr_renamed_1218());
        this.cfr_renamed_112 = true;
    }

    public byte[] cfr_renamed_1388() {
        return this.cfr_renamed_91;
    }

    public Vector cfr_renamed_1389() {
        return this.cfr_renamed_0;
    }

    public void cfr_renamed_1390(byte[] arg0) {
        if (!this.cfr_renamed_102) {
            this.cfr_renamed_1391();
        }
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_119 = this.cfr_renamed_1;
        this.cfr_renamed_93 = true;
    }

    public int[] cfr_renamed_1381() {
        int n;
        sprhxa sprhxa2;
        sprhxa sprhxa3;
        int[] nArray;
        int[] nArray2 = nArray = new int[6 + this.cfr_renamed_3];
        nArray2[0] = this.cfr_renamed_1;
        nArray2[1] = this.cfr_renamed_3;
        sprhxa sprhxa4 = this;
        nArray[2] = sprhxa4.cfr_renamed_119;
        if (sprhxa4.cfr_renamed_93) {
            sprhxa3 = this;
            nArray[3] = 1;
        } else {
            nArray[3] = 0;
            sprhxa3 = this;
        }
        if (sprhxa3.cfr_renamed_102) {
            sprhxa2 = this;
            nArray[4] = 1;
        } else {
            nArray[4] = 0;
            sprhxa2 = this;
        }
        nArray[5] = sprhxa2.cfr_renamed_112 ? 1 : 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            int n3 = 6 + n;
            int n4 = (Integer)this.cfr_renamed_2.elementAt(n);
            nArray[n3] = n4;
            n2 = ++n;
        }
        return nArray;
    }

    public int cfr_renamed_1392() {
        if (this.cfr_renamed_91 == null) {
            return this.cfr_renamed_1;
        }
        if (this.cfr_renamed_3 == 0) {
            return this.cfr_renamed_119;
        }
        sprhxa sprhxa2 = this;
        return Math.min(sprhxa2.cfr_renamed_119, (Integer)sprhxa2.cfr_renamed_2.lastElement());
    }

    public int cfr_renamed_1393() {
        if (this.cfr_renamed_91 == null) {
            return this.cfr_renamed_1;
        }
        return this.cfr_renamed_119;
    }

    public byte[][] cfr_renamed_1382() {
        int n;
        byte[][] byArray = new byte[3 + this.cfr_renamed_3][this.cfr_renamed_4.cfr_renamed_1218()];
        byArray[0] = this.cfr_renamed_91;
        byArray[1] = this.cfr_renamed_152;
        byArray[2] = this.cfr_renamed_86;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            byte[] byArray2;
            int n3 = 3 + n;
            byArray[n3] = byArray2;
            n2 = ++n;
        }
        return byArray;
    }

    public boolean cfr_renamed_1394() {
        return this.cfr_renamed_93;
    }

    public void cfr_renamed_1391() {
        if (!this.cfr_renamed_112) {
            System.err.println(new StringBuilder().insert(0, sprzgp.cfr_renamed_9("kN]O\u0018")).append(this.cfr_renamed_1).append(sprboj.cfr_renamed_9("\bdG~\bcFc\\cIfApMn")).toString());
            return;
        }
        sprhxa sprhxa2 = this;
        sprhxa sprhxa3 = this;
        this.cfr_renamed_2 = new Vector();
        sprhxa3.cfr_renamed_3 = 0;
        sprhxa3.cfr_renamed_91 = null;
        sprhxa2.cfr_renamed_119 = -1;
        sprhxa2.cfr_renamed_102 = true;
        System.arraycopy(this.cfr_renamed_86, 0, this.cfr_renamed_152, 0, this.cfr_renamed_4.cfr_renamed_1218());
    }

    public byte[] cfr_renamed_1395() {
        return this.cfr_renamed_152;
    }
}

