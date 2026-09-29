/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprihf;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprjqg
extends sprqqe {
    private sprktm cfr_renamed_91;
    private byte[][] cfr_renamed_0;
    private byte[] cfr_renamed_1;
    private byte[][] cfr_renamed_2;
    private sprlem cfr_renamed_3;
    private sprktm cfr_renamed_4;

    public int cfr_renamed_1130() {
        return this.cfr_renamed_91.cfr_renamed_5023();
    }

    public short[][] cfr_renamed_1131() {
        return sprihf.cfr_renamed_1266(this.cfr_renamed_2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        int n2;
        sprrvm sprrvm2;
        sprrvm sprrvm3 = new sprrvm();
        if (this.cfr_renamed_4 != null) {
            sprrvm sprrvm4 = sprrvm3;
            sprrvm2 = sprrvm4;
            sprrvm4.cfr_renamed_5004(this.cfr_renamed_4);
        } else {
            sprrvm sprrvm5 = sprrvm3;
            sprrvm2 = sprrvm5;
            sprrvm5.cfr_renamed_5004(this.cfr_renamed_3);
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_91);
        sprrvm sprrvm6 = new sprrvm();
        int n3 = n2 = 0;
        while (n3 < this.cfr_renamed_0.length) {
            sprrvm6.cfr_renamed_5004(new sprfvg(this.cfr_renamed_0[n2++]));
            n3 = n2;
        }
        sprrvm3.cfr_renamed_5004(new sprcen(sprrvm6));
        sprrvm sprrvm7 = new sprrvm();
        int n4 = n = 0;
        while (n4 < this.cfr_renamed_2.length) {
            sprrvm7.cfr_renamed_5004(new sprfvg(this.cfr_renamed_2[n++]));
            n4 = n;
        }
        sprrvm sprrvm8 = sprrvm3;
        sprrvm8.cfr_renamed_5004(new sprcen(sprrvm7));
        sprrvm sprrvm9 = new sprrvm();
        sprrvm9.cfr_renamed_5004(new sprfvg(this.cfr_renamed_1));
        sprrvm8.cfr_renamed_5004(new sprcen(sprrvm9));
        return new sprcen(sprrvm3);
    }

    public static sprjqg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprjqg) {
            return (sprjqg)arg0;
        }
        if (arg0 != null) {
            return new sprjqg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprjqg(sprszm sprszm2) {
        int n;
        int n2;
        void arg0;
        sprjqg sprjqg2;
        if (sprszm2.cfr_renamed_85(0) instanceof sprktm) {
            sprjqg2 = this;
            this.cfr_renamed_4 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(0));
        } else {
            sprjqg2 = this;
            this.cfr_renamed_3 = sprlem.cfr_renamed_23(arg0.cfr_renamed_85(0));
        }
        sprjqg2.cfr_renamed_91 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(1));
        sprszm sprszm3 = sprszm.cfr_renamed_23(arg0.cfr_renamed_85(2));
        this.cfr_renamed_0 = new byte[sprszm3.cfr_renamed_84()][];
        int n3 = n2 = 0;
        while (n3 < sprszm3.cfr_renamed_84()) {
            int n4 = n2++;
            this.cfr_renamed_0[n4] = sproug.cfr_renamed_23(sprszm3.cfr_renamed_85(n4)).cfr_renamed_186();
            n3 = n2;
        }
        sprszm sprszm4 = (sprszm)arg0.cfr_renamed_85(3);
        this.cfr_renamed_2 = new byte[sprszm4.cfr_renamed_84()][];
        int n5 = n = 0;
        while (n5 < sprszm4.cfr_renamed_84()) {
            int n6 = n++;
            this.cfr_renamed_2[n6] = sproug.cfr_renamed_23(sprszm4.cfr_renamed_85(n6)).cfr_renamed_186();
            n5 = n;
        }
        sprszm sprszm5 = (sprszm)arg0.cfr_renamed_85(4);
        this.cfr_renamed_1 = sproug.cfr_renamed_23(sprszm5.cfr_renamed_85(0)).cfr_renamed_186();
    }

    /*
     * WARNING - void declaration
     */
    public sprjqg(int n, short[][] sArray, short[][] sArray2, short[] sArray3) {
        void arg2;
        void arg1;
        void arg0;
        sprjqg sprjqg2 = this;
        sprjqg sprjqg3 = this;
        sprjqg sprjqg4 = this;
        sprjqg3.cfr_renamed_4 = new sprktm(0L);
        sprjqg3.cfr_renamed_91 = new sprktm((long)arg0);
        sprjqg3.cfr_renamed_0 = sprihf.cfr_renamed_1267((short[][])arg1);
        sprjqg2.cfr_renamed_2 = sprihf.cfr_renamed_1267((short[][])arg2);
        sprjqg2.cfr_renamed_1 = sprihf.cfr_renamed_1270(sArray3);
    }

    public sprktm cfr_renamed_3() {
        return this.cfr_renamed_4;
    }

    public short[][] cfr_renamed_1132() {
        return sprihf.cfr_renamed_1266(this.cfr_renamed_0);
    }

    public short[] cfr_renamed_1133() {
        return sprihf.cfr_renamed_1271(this.cfr_renamed_1);
    }
}

