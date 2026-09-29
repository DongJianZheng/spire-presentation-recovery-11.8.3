/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcjg;
import com.spire.presentation.packages.sprqvk;
import com.spire.presentation.packages.spruoo;
import com.spire.presentation.packages.sprvpg;

public class sprfpg {
    private sprvpg cfr_renamed_91;
    private int cfr_renamed_0;
    private int cfr_renamed_1;
    private int cfr_renamed_2;
    private int cfr_renamed_3;
    public sprcjg[] cfr_renamed_4;

    public sprcjg cfr_renamed_6975(int arg0) {
        return this.cfr_renamed_4[arg0];
    }

    public boolean cfr_renamed_7062(int arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            if (this.cfr_renamed_6975(n).cfr_renamed_7062(arg0)) {
                return true;
            }
            n2 = ++n;
        }
        return false;
    }

    public sprfpg() throws Exception {
        throw new Exception(sprqvk.cfr_renamed_9("\u0013K0[(\\$]a~ \\ C$Z$\\"));
    }

    public void cfr_renamed_6985() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            this.cfr_renamed_6975(n++).cfr_renamed_6985();
            n2 = n;
        }
    }

    public void cfr_renamed_6990() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            this.cfr_renamed_4[n++].cfr_renamed_6991();
            n2 = n;
        }
    }

    public void cfr_renamed_7063(sprfpg arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            this.cfr_renamed_6975(n).cfr_renamed_7064(arg0.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public void cfr_renamed_7065(byte[] arg0, short arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            this.cfr_renamed_6975(n).cfr_renamed_7065(arg0, (short)(this.cfr_renamed_0 * arg1 + n++));
            n2 = n;
        }
    }

    public void cfr_renamed_7066(sprcjg arg0, sprfpg arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            this.cfr_renamed_6975(n).cfr_renamed_7067(arg0, arg1.cfr_renamed_6975(n++));
            n2 = n;
        }
    }

    public void cfr_renamed_7068(sprfpg arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 256) {
                int n5 = n3++;
                arg0.cfr_renamed_6975(n).cfr_renamed_7069(n5, this.cfr_renamed_6975(n).cfr_renamed_6983(n5));
                n4 = n3;
            }
            n2 = ++n;
        }
    }

    public String cfr_renamed_2223(String arg0) {
        return new StringBuilder().insert(0, arg0).append(": ").append(this.toString()).toString();
    }

    public sprfpg(sprvpg arg0) {
        int n;
        sprfpg sprfpg2 = this;
        sprvpg sprvpg2 = arg0;
        this.cfr_renamed_91 = arg0;
        this.cfr_renamed_3 = sprvpg2.cfr_renamed_7070();
        this.cfr_renamed_0 = sprvpg2.cfr_renamed_7056();
        sprfpg2.cfr_renamed_1 = arg0.cfr_renamed_7055();
        sprfpg2.cfr_renamed_4 = new sprcjg[this.cfr_renamed_0];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            this.cfr_renamed_4[n++] = new sprcjg(arg0);
            n2 = n;
        }
    }

    public void cfr_renamed_7071(byte[] arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            this.cfr_renamed_4[n].cfr_renamed_7061(arg0, (short)((arg1 << 8) + n++));
            n2 = n;
        }
    }

    public void cfr_renamed_7072() {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            this.cfr_renamed_6975(n++).cfr_renamed_7072();
            n2 = n;
        }
    }

    public void cfr_renamed_7073(byte[] arg0, short arg1) {
        int n;
        short s = arg1;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            sprcjg sprcjg2 = this.cfr_renamed_6975(n);
            short s2 = s;
            s = (short)(s2 + 1);
            sprcjg2.cfr_renamed_7073(arg0, s2);
            n2 = ++n;
        }
    }

    public String toString() {
        int n;
        String string = spruoo.cfr_renamed_9(",]");
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0) {
            string = new StringBuilder().insert(0, string).append(sprqvk.cfr_renamed_9("g/@$\\ac Z3G9\u000e")).append(n).append(" ").append(this.cfr_renamed_6975(n).toString()).toString();
            if (n != this.cfr_renamed_0 - 1) {
                string = new StringBuilder().insert(0, string).append(spruoo.cfr_renamed_9("\n\f")).toString();
            }
            n2 = ++n;
        }
        string = new StringBuilder().insert(0, string).append("]").toString();
        return string;
    }
}

