/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraze;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprrzk;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprvoo;
import java.util.Vector;

public class sprkff {
    private byte[] cfr_renamed_102;
    private Vector cfr_renamed_93;
    private int cfr_renamed_86;
    private boolean cfr_renamed_152;
    private int cfr_renamed_112;
    private Vector cfr_renamed_119;
    private byte[] cfr_renamed_91;
    private boolean cfr_renamed_0;
    private boolean cfr_renamed_1;
    private sprgf cfr_renamed_2;
    private int cfr_renamed_3;
    private byte[] cfr_renamed_4;

    public void cfr_renamed_1390(byte[] arg0) {
        if (!this.cfr_renamed_1) {
            this.cfr_renamed_1391();
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = this.cfr_renamed_86;
        this.cfr_renamed_0 = true;
    }

    public sprkff(Vector arg0, int arg1, sprgf arg2) {
        sprkff sprkff2 = this;
        sprkff sprkff3 = this;
        this.cfr_renamed_93 = arg0;
        sprkff3.cfr_renamed_86 = arg1;
        sprkff3.cfr_renamed_4 = null;
        sprkff2.cfr_renamed_1 = false;
        sprkff2.cfr_renamed_0 = false;
        this.cfr_renamed_152 = false;
        this.cfr_renamed_2 = arg2;
        this.cfr_renamed_91 = new byte[this.cfr_renamed_2.cfr_renamed_1218()];
        this.cfr_renamed_102 = new byte[this.cfr_renamed_2.cfr_renamed_1218()];
    }

    public int[] cfr_renamed_1381() {
        int n;
        sprkff sprkff2;
        sprkff sprkff3;
        int[] nArray;
        int[] nArray2 = nArray = new int[6 + this.cfr_renamed_112];
        nArray2[0] = this.cfr_renamed_86;
        nArray2[1] = this.cfr_renamed_112;
        sprkff sprkff4 = this;
        nArray[2] = sprkff4.cfr_renamed_3;
        if (sprkff4.cfr_renamed_0) {
            sprkff3 = this;
            nArray[3] = 1;
        } else {
            nArray[3] = 0;
            sprkff3 = this;
        }
        if (sprkff3.cfr_renamed_1) {
            sprkff2 = this;
            nArray[4] = 1;
        } else {
            nArray[4] = 0;
            sprkff2 = this;
        }
        nArray[5] = sprkff2.cfr_renamed_152 ? 1 : 0;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112) {
            int n3 = 6 + n;
            int n4 = (Integer)this.cfr_renamed_119.elementAt(n);
            nArray[n3] = n4;
            n2 = ++n;
        }
        return nArray;
    }

    public void cfr_renamed_5636(spraze arg0) {
        arg0.cfr_renamed_1370(this.cfr_renamed_91);
    }

    /*
     * WARNING - void declaration
     */
    public sprkff(sprgf sprgf2, byte[][] byArray, int[] nArray) {
        void arg1;
        int n;
        sprkff sprkff2;
        void v3;
        void v2;
        void arg0;
        void arg2;
        void v0 = arg2;
        sprkff sprkff3 = this;
        this.cfr_renamed_2 = arg0;
        sprkff3.cfr_renamed_86 = arg2[0];
        sprkff3.cfr_renamed_112 = arg2[1];
        this.cfr_renamed_3 = v0[2];
        if (v0[3] == true) {
            v2 = arg2;
            this.cfr_renamed_0 = true;
        } else {
            this.cfr_renamed_0 = false;
            v2 = arg2;
        }
        if (v2[4] == true) {
            v3 = arg2;
            this.cfr_renamed_1 = true;
        } else {
            this.cfr_renamed_1 = false;
            v3 = arg2;
        }
        if (v3[5] == true) {
            sprkff2 = this;
            this.cfr_renamed_152 = true;
        } else {
            sprkff2 = this;
            this.cfr_renamed_152 = false;
        }
        sprkff2.cfr_renamed_119 = new Vector();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112) {
            int n3 = 6 + n;
            this.cfr_renamed_119.addElement(spruaf.cfr_renamed_279((int)arg2[n3]));
            n2 = ++n;
        }
        sprkff sprkff4 = this;
        void v8 = arg1;
        this.cfr_renamed_4 = v8[0];
        sprkff4.cfr_renamed_102 = v8[1];
        sprkff4.cfr_renamed_91 = arg1[2];
        sprkff sprkff5 = this;
        this.cfr_renamed_93 = new Vector();
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_112) {
            int n5 = 3 + n;
            this.cfr_renamed_93.addElement(arg1[n5]);
            n4 = ++n;
        }
    }

    public String toString() {
        int n;
        String string = sprrzk.cfr_renamed_9("&\u0018\u0017\u000f\u001a\u000b\u0001\u0002RJRJHJ");
        int n2 = n = 0;
        while (n2 < 6 + this.cfr_renamed_112) {
            StringBuilder stringBuilder = new StringBuilder().insert(0, string).append(this.cfr_renamed_1381()[n]);
            string = stringBuilder.append(" ").toString();
            n2 = ++n;
        }
        int n3 = n = 0;
        while (n3 < 3 + this.cfr_renamed_112) {
            string = this.cfr_renamed_1382()[n] != null ? new StringBuilder().insert(0, string).append(new String(sprfqe.cfr_renamed_485(this.cfr_renamed_1382()[n]))).append(" ").toString() : new StringBuilder().insert(0, string).append(sprvoo.cfr_renamed_9("4\"6;z")).toString();
            n3 = ++n;
        }
        string = new StringBuilder().insert(0, string).append("  ").append(this.cfr_renamed_2.cfr_renamed_1218()).toString();
        return string;
    }

    public void cfr_renamed_5637(spraze arg0, byte[] arg1) {
        sprkff sprkff2;
        if (this.cfr_renamed_0) {
            System.err.println(sprrzk.cfr_renamed_9("<\u0005R\u0007\u001d\u0018\u0017J\u0007\u001a\u0016\u000b\u0006\u000fR\u001a\u001d\u0019\u0001\u0003\u0010\u0006\u0017J\u0014\u0005\u0000J\u0006\u0018\u0017\u000f\u001a\u000b\u0001\u0002R\u0003\u001c\u0019\u0006\u000b\u001c\t\u0017K"));
            return;
        }
        if (!this.cfr_renamed_1) {
            System.err.println(sprvoo.cfr_renamed_9("\u000e%?226)?z>4$.644?w48.w393#366> 2>w82<8(2z\"*3;#?"));
            return;
        }
        sprkff sprkff3 = this;
        byte[] byArray = new byte[sprkff3.cfr_renamed_2.cfr_renamed_1218()];
        int n = -1;
        arg0.cfr_renamed_1370(this.cfr_renamed_102);
        if (sprkff3.cfr_renamed_4 == null) {
            sprkff2 = this;
            this.cfr_renamed_4 = arg1;
            this.cfr_renamed_3 = 0;
        } else {
            byte[] byArray2;
            byArray = arg1;
            n = 0;
            sprkff sprkff4 = this;
            while (sprkff4.cfr_renamed_112 > 0 && n == (Integer)this.cfr_renamed_119.lastElement()) {
                sprkff sprkff5 = this;
                byArray2 = new byte[sprkff5.cfr_renamed_2.cfr_renamed_1218() << 1];
                System.arraycopy(sprkff5.cfr_renamed_93.lastElement(), 0, byArray2, 0, this.cfr_renamed_2.cfr_renamed_1218());
                sprkff5.cfr_renamed_93.removeElementAt(this.cfr_renamed_93.size() - 1);
                sprkff5.cfr_renamed_119.removeElementAt(this.cfr_renamed_119.size() - 1);
                System.arraycopy(byArray, 0, byArray2, this.cfr_renamed_2.cfr_renamed_1218(), this.cfr_renamed_2.cfr_renamed_1218());
                sprkff5.cfr_renamed_2.cfr_renamed_1197(byArray2, 0, byArray2.length);
                sprkff sprkff6 = this;
                byArray = new byte[sprkff6.cfr_renamed_2.cfr_renamed_1218()];
                ++n;
                sprkff sprkff7 = this;
                sprkff6.cfr_renamed_2.cfr_renamed_1219(byArray, 0);
                sprkff4 = sprkff7;
                --sprkff7.cfr_renamed_112;
            }
            sprkff sprkff8 = this;
            sprkff8.cfr_renamed_93.addElement(byArray);
            sprkff8.cfr_renamed_119.addElement(spruaf.cfr_renamed_279(n));
            ++sprkff8.cfr_renamed_112;
            if ((Integer)sprkff8.cfr_renamed_119.lastElement() == this.cfr_renamed_3) {
                sprkff sprkff9 = this;
                byArray2 = new byte[sprkff9.cfr_renamed_2.cfr_renamed_1218() << 1];
                System.arraycopy(sprkff9.cfr_renamed_4, 0, byArray2, 0, this.cfr_renamed_2.cfr_renamed_1218());
                System.arraycopy(sprkff9.cfr_renamed_93.lastElement(), 0, byArray2, this.cfr_renamed_2.cfr_renamed_1218(), this.cfr_renamed_2.cfr_renamed_1218());
                sprkff9.cfr_renamed_93.removeElementAt(this.cfr_renamed_93.size() - 1);
                sprkff9.cfr_renamed_119.removeElementAt(this.cfr_renamed_119.size() - 1);
                sprkff9.cfr_renamed_2.cfr_renamed_1197(byArray2, 0, byArray2.length);
                sprkff sprkff10 = this;
                sprkff10.cfr_renamed_4 = new byte[sprkff10.cfr_renamed_2.cfr_renamed_1218()];
                sprkff10.cfr_renamed_2.cfr_renamed_1219(this.cfr_renamed_4, 0);
                ++this.cfr_renamed_3;
                this.cfr_renamed_112 = 0;
            }
            sprkff2 = this;
        }
        if (sprkff2.cfr_renamed_3 == this.cfr_renamed_86) {
            this.cfr_renamed_0 = true;
        }
    }

    public void cfr_renamed_1391() {
        if (!this.cfr_renamed_152) {
            throw new IllegalStateException(new StringBuilder().insert(0, sprrzk.cfr_renamed_9("9\u0017\u000f\u0016J")).append(this.cfr_renamed_86).append(sprvoo.cfr_renamed_9("w48.w393#366> 2>")).toString());
        }
        sprkff sprkff2 = this;
        sprkff sprkff3 = this;
        this.cfr_renamed_119 = new Vector();
        sprkff3.cfr_renamed_112 = 0;
        sprkff3.cfr_renamed_4 = null;
        sprkff2.cfr_renamed_3 = -1;
        sprkff2.cfr_renamed_1 = true;
        System.arraycopy(this.cfr_renamed_91, 0, this.cfr_renamed_102, 0, this.cfr_renamed_2.cfr_renamed_1218());
    }

    public int cfr_renamed_1392() {
        if (this.cfr_renamed_4 == null) {
            return this.cfr_renamed_86;
        }
        if (this.cfr_renamed_112 == 0) {
            return this.cfr_renamed_3;
        }
        sprkff sprkff2 = this;
        return Math.min(sprkff2.cfr_renamed_3, (Integer)sprkff2.cfr_renamed_119.lastElement());
    }

    public byte[] cfr_renamed_1395() {
        return this.cfr_renamed_102;
    }

    public Vector cfr_renamed_1389() {
        return this.cfr_renamed_93;
    }

    public boolean cfr_renamed_1383() {
        return this.cfr_renamed_1;
    }

    public byte[] cfr_renamed_1388() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_1387(byte[] byArray) {
        void arg0;
        System.arraycopy(arg0, 0, this.cfr_renamed_91, 0, this.cfr_renamed_2.cfr_renamed_1218());
        this.cfr_renamed_152 = true;
    }

    public void cfr_renamed_1384() {
        sprkff sprkff2 = this;
        sprkff sprkff3 = this;
        this.cfr_renamed_1 = false;
        sprkff3.cfr_renamed_0 = false;
        sprkff3.cfr_renamed_4 = null;
        sprkff2.cfr_renamed_112 = 0;
        sprkff2.cfr_renamed_3 = -1;
    }

    public int cfr_renamed_1393() {
        if (this.cfr_renamed_4 == null) {
            return this.cfr_renamed_86;
        }
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_1394() {
        return this.cfr_renamed_0;
    }

    public byte[][] cfr_renamed_1382() {
        int n;
        byte[][] byArray = new byte[3 + this.cfr_renamed_112][this.cfr_renamed_2.cfr_renamed_1218()];
        byArray[0] = this.cfr_renamed_4;
        byArray[1] = this.cfr_renamed_102;
        byArray[2] = this.cfr_renamed_91;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_112) {
            byte[] byArray2;
            int n3 = 3 + n;
            byArray[n3] = byArray2;
            n2 = ++n;
        }
        return byArray;
    }
}

