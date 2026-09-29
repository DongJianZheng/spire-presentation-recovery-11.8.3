/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhna;
import com.spire.presentation.packages.sprpoa;
import com.spire.presentation.packages.sprqna;
import com.spire.presentation.packages.sprqnl;
import com.spire.presentation.packages.sprytf;
import java.security.SecureRandom;

public class sprmpa {
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_813() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmpa(int n) {
        void arg0;
        this.cfr_renamed_4 = 0;
        if (n >= 32) {
            throw new IllegalArgumentException(sprqnl.cfr_renamed_9("h|:K'Kr\u0019<Q-\u0019,\\/K-\\hV.\u0019.P-U,\u0019!JhM'VhU)K/\\h"));
        }
        if (arg0 < true) {
            throw new IllegalArgumentException(sprytf.cfr_renamed_9("*#x\u0014e\u00140F~\u000eoFn\u0003m\u0014o\u0003*\tlFl\u000fo\nnFc\u0015*\be\b'\u0016e\u0015c\u0012c\u0010oF"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = sprhna.cfr_renamed_826(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    public sprmpa(sprmpa sprmpa2) {
        void arg0;
        sprmpa sprmpa3 = this;
        this.cfr_renamed_4 = 0;
        sprmpa3.cfr_renamed_4 = arg0.cfr_renamed_4;
        sprmpa3.cfr_renamed_3 = sprmpa2.cfr_renamed_3;
    }

    public int cfr_renamed_1085() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_817(int arg0) {
        int n = (1 << this.cfr_renamed_4) - 2;
        return this.cfr_renamed_1086(arg0, n);
    }

    public int cfr_renamed_825(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    public int cfr_renamed_1087() {
        return this.cfr_renamed_862(new SecureRandom());
    }

    /*
     * WARNING - void declaration
     */
    public sprmpa(int n, int n2) {
        void arg0;
        void arg1;
        this.cfr_renamed_4 = 0;
        if (n != sprhna.cfr_renamed_824((int)arg1)) {
            throw new IllegalArgumentException(sprqnl.cfr_renamed_9("h|:K'Kr\u0019<Q-\u0019,\\/K-\\hP;\u0019&V<\u0019+V:K-Z<"));
        }
        if (!sprhna.cfr_renamed_827((int)arg1)) {
            throw new IllegalArgumentException(sprytf.cfr_renamed_9("FO\u0014x\tx\\*\u0001c\u0010o\b*\u0016e\ns\be\u000bc\u0007fFc\u0015*\u0014o\u0002\u007f\u0005c\u0004f\u0003"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_3 = arg1;
    }

    public int cfr_renamed_862(SecureRandom arg0) {
        int n;
        int n2;
        int n3 = 0x100000;
        int n4 = n2 = sprqna.cfr_renamed_808(arg0, 1 << this.cfr_renamed_4);
        for (n = 0; n4 == 0 && n < n3; ++n) {
            n4 = n2 = sprqna.cfr_renamed_808(arg0, 1 << this.cfr_renamed_4);
        }
        if (n == n3) {
            n2 = 1;
        }
        return n2;
    }

    public int cfr_renamed_838(int arg0, int arg1) {
        return sprhna.cfr_renamed_828(arg0, arg1, this.cfr_renamed_3);
    }

    public byte[] cfr_renamed_91() {
        return sprpoa.cfr_renamed_886(this.cfr_renamed_3);
    }

    public String cfr_renamed_867(int arg0) {
        int n;
        String string = "";
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4) {
            int n3;
            if (((byte)arg0 & 1) == 0) {
                string = new StringBuilder().insert(0, "0").append(string).toString();
                n3 = arg0;
            } else {
                string = new StringBuilder().insert(0, "1").append(string).toString();
                n3 = arg0;
            }
            arg0 = n3 >>> 1;
            n2 = ++n;
        }
        return string;
    }

    private static /* synthetic */ String cfr_renamed_1088(int arg0) {
        String string = "";
        if (arg0 == 0) {
            string = "0";
            return "0";
        }
        byte by = (byte)(arg0 & 1);
        if (by == 1) {
            string = "1";
        }
        int n = 1;
        int n2 = arg0 >>>= 1;
        while (n2 != 0) {
            by = (byte)(arg0 & 1);
            if (by == 1) {
                string = new StringBuilder().insert(0, string).append(sprqnl.cfr_renamed_9("cA\u0016")).append(n).toString();
            }
            ++n;
            n2 = arg0 >>>= 1;
        }
        return string;
    }

    public int cfr_renamed_1086(int arg0, int arg1) {
        if (arg0 == 0) {
            return 0;
        }
        if (arg0 == 1) {
            return 1;
        }
        int n = 1;
        if (arg1 < 0) {
            arg0 = this.cfr_renamed_817(arg0);
            arg1 = -arg1;
        }
        int n2 = arg1;
        while (n2 != 0) {
            if ((arg1 & 1) == 1) {
                n = this.cfr_renamed_838(n, arg0);
            }
            int n3 = arg0;
            arg0 = this.cfr_renamed_838(n3, n3);
            n2 = arg1 >>> 1;
        }
        return n;
    }

    /*
     * WARNING - void declaration
     */
    public sprmpa(byte[] byArray) {
        void arg0;
        this.cfr_renamed_4 = 0;
        if (byArray.length != 4) {
            throw new IllegalArgumentException(sprytf.cfr_renamed_9("\u0004s\u0012oFk\u0014x\u0007sFc\u0015*\be\u0012*\u0007dFo\bi\tn\u0003nFl\u000fd\u000f~\u0003*\u0000c\u0003f\u0002"));
        }
        this.cfr_renamed_3 = sprpoa.cfr_renamed_887((byte[])arg0);
        if (!sprhna.cfr_renamed_827(this.cfr_renamed_3)) {
            throw new IllegalArgumentException(sprqnl.cfr_renamed_9("*@<\\hX:K)@hP;\u0019&V<\u0019)Wh\\&Z']-]h_!W!M-\u0019.P-U,"));
        }
        this.cfr_renamed_4 = sprhna.cfr_renamed_824(this.cfr_renamed_3);
    }

    public String toString() {
        return new StringBuilder().insert(0, sprytf.cfr_renamed_9("L\u000fd\u000f~\u0003* c\u0003f\u0002*!LN88")).append(this.cfr_renamed_4).append(sprqnl.cfr_renamed_9("\u0010h\u0004h")).append(sprytf.cfr_renamed_9("M \"T#=R;%Z")).append(sprmpa.cfr_renamed_1088(this.cfr_renamed_3)).append(sprqnl.cfr_renamed_9("\u0007h")).toString();
    }

    public int cfr_renamed_865(int arg0) {
        int n;
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_4) {
            int n3 = arg0;
            arg0 = this.cfr_renamed_838(n3, n3);
            n2 = ++n;
        }
        return arg0;
    }

    public int hashCode() {
        return this.cfr_renamed_3;
    }

    public int cfr_renamed_863(SecureRandom arg0) {
        return sprqna.cfr_renamed_808(arg0, 1 << this.cfr_renamed_4);
    }

    public boolean cfr_renamed_839(int arg0) {
        if (this.cfr_renamed_4 == 31) {
            return arg0 >= 0;
        }
        return arg0 >= 0 && arg0 < 1 << this.cfr_renamed_4;
    }

    public boolean equals(Object arg0) {
        if (arg0 == null || !(arg0 instanceof sprmpa)) {
            return false;
        }
        sprmpa sprmpa2 = (sprmpa)arg0;
        return this.cfr_renamed_4 == sprmpa2.cfr_renamed_4 && this.cfr_renamed_3 == sprmpa2.cfr_renamed_3;
    }
}

