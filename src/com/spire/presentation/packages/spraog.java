/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjg;
import com.spire.presentation.packages.sprdyg;
import com.spire.presentation.packages.sprfxia;
import com.spire.presentation.packages.sprvpg;

public class spraog {
    private int cfr_renamed_91;
    public sprcjg[] cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private sprvpg cfr_renamed_3;
    private int cfr_renamed_4;

    public void cfr_renamed_7074(sprcjg arg0, spraog arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n).cfr_renamed_7067(arg0, arg1.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public boolean cfr_renamed_7062(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            if (this.cfr_renamed_6975(n).cfr_renamed_7062(arg0)) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public void cfr_renamed_1007() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n++).cfr_renamed_1007();
            n2 = n;
        }
    }

    public void cfr_renamed_7075(spraog arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n).cfr_renamed_7076(arg0.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public void cfr_renamed_6990() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_0[n++].cfr_renamed_6991();
            n2 = n;
        }
    }

    public void cfr_renamed_7077(spraog arg0, spraog arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n).cfr_renamed_7078(arg0.cfr_renamed_6975(n), arg1.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public String cfr_renamed_2223(String arg0) {
        return new StringBuilder().insert(0, arg0).append(": ").append(this.toString()).toString();
    }

    public void cfr_renamed_7072() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n++).cfr_renamed_7072();
            n2 = n;
        }
    }

    public void cfr_renamed_7079(int arg0, sprcjg arg1) {
        this.cfr_renamed_0[arg0] = arg1;
    }

    public sprcjg cfr_renamed_6975(int arg0) {
        return this.cfr_renamed_0[arg0];
    }

    public spraog() throws Exception {
        throw new Exception(sprfxia.cfr_renamed_9("?!\u001c1\u00046\b7M\u0014\f6\f)\b0\b6"));
    }

    public void cfr_renamed_7080(spraog arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n).cfr_renamed_7064(arg0.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public int cfr_renamed_7081(spraog arg0, spraog arg1) {
        int n;
        int n2 = 0;
        int n3 = n = 0;
        while (n3 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this.cfr_renamed_6975(n);
            sprcjg sprcjg3 = arg0.cfr_renamed_6975(n);
            sprcjg sprcjg4 = arg1.cfr_renamed_6975(n);
            n2 += sprcjg2.cfr_renamed_7082(sprcjg3, sprcjg4);
            n3 = ++n;
        }
        return n2;
    }

    public void cfr_renamed_7073(byte[] arg0, short arg1) {
        int n;
        short s = arg1;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            sprcjg sprcjg2 = this.cfr_renamed_6975(n);
            short s2 = s;
            s = (short)(s2 + 1);
            sprcjg2.cfr_renamed_7073(arg0, s2);
            n2 = ++n;
        }
    }

    public void cfr_renamed_7083(spraog arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n).cfr_renamed_7084(arg0.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public void cfr_renamed_7085() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n++).cfr_renamed_7085();
            n2 = n;
        }
    }

    public String toString() {
        int n;
        String string = "[";
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            string = new StringBuilder().insert(0, string).append(n).append(" ").append(this.cfr_renamed_6975(n).toString()).toString();
            if (n != this.cfr_renamed_2 - 1) {
                string = new StringBuilder().insert(0, string).append(sprdyg.cfr_renamed_9("\u001cx")).toString();
            }
            n2 = ++n;
        }
        string = new StringBuilder().insert(0, string).append("]").toString();
        return string;
    }

    public void cfr_renamed_7086(spraog arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n).cfr_renamed_7087(arg0.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public void cfr_renamed_6985() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_6975(n++).cfr_renamed_6985();
            n2 = n;
        }
    }

    public byte[] cfr_renamed_7088() {
        int n;
        spraog spraog2 = this;
        byte[] byArray = new byte[spraog2.cfr_renamed_2 * spraog2.cfr_renamed_3.cfr_renamed_7089()];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            byte[] byArray2 = this.cfr_renamed_6975(n).cfr_renamed_7090();
            int n3 = n * this.cfr_renamed_3.cfr_renamed_7089();
            System.arraycopy(byArray2, 0, byArray, n3, this.cfr_renamed_3.cfr_renamed_7089());
            n2 = ++n;
        }
        return byArray;
    }

    public spraog(sprvpg arg0) {
        int n;
        spraog spraog2 = this;
        sprvpg sprvpg2 = arg0;
        this.cfr_renamed_3 = arg0;
        this.cfr_renamed_4 = sprvpg2.cfr_renamed_7070();
        this.cfr_renamed_2 = sprvpg2.cfr_renamed_7055();
        spraog2.cfr_renamed_1 = arg0.cfr_renamed_7056();
        spraog2.cfr_renamed_0 = new sprcjg[this.cfr_renamed_2];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_2) {
            this.cfr_renamed_0[n++] = new sprcjg(arg0);
            n2 = n;
        }
    }
}

