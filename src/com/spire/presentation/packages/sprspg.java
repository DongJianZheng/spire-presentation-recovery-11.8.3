/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdhea;
import com.spire.presentation.packages.sprkrl;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprxgf;

public class sprspg
extends sprqqe {
    private int[] cfr_renamed_1;
    private int[] cfr_renamed_2;
    private int cfr_renamed_3;
    private int[] cfr_renamed_4;

    public int[] cfr_renamed_1150() {
        return sproze.cfr_renamed_535(this.cfr_renamed_4);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprspg(sprszm sprszm2) {
        int n;
        void arg0;
        if (sprszm2.cfr_renamed_84() != 4) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdhea.cfr_renamed_9("C\u0015U\\_\u001a\u0010\u000fU\r\u007f\u001a`\u001dB\u001d]\u000f\u0010A\u0010")).append(arg0.cfr_renamed_84()).toString());
        }
        this.cfr_renamed_3 = sprspg.cfr_renamed_7244(arg0.cfr_renamed_85(0));
        sprszm sprszm3 = (sprszm)arg0.cfr_renamed_85(1);
        sprszm sprszm4 = (sprszm)arg0.cfr_renamed_85(2);
        sprszm sprszm5 = (sprszm)arg0.cfr_renamed_85(3);
        if (sprszm3.cfr_renamed_84() != this.cfr_renamed_3 || sprszm4.cfr_renamed_84() != this.cfr_renamed_3 || sprszm5.cfr_renamed_84() != this.cfr_renamed_3) {
            throw new IllegalArgumentException(sprkrl.cfr_renamed_9(";.$!>)6`!)(%r/4`!%#57.1%!"));
        }
        sprspg sprspg2 = this;
        sprspg2.cfr_renamed_1 = new int[sprszm3.cfr_renamed_84()];
        sprspg2.cfr_renamed_2 = new int[sprszm4.cfr_renamed_84()];
        this.cfr_renamed_4 = new int[sprszm5.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_3) {
            sprspg sprspg3 = this;
            int n3 = n;
            sprspg3.cfr_renamed_1[n3] = sprspg.cfr_renamed_7244(sprszm3.cfr_renamed_85(n3));
            int n4 = n;
            sprspg3.cfr_renamed_2[n4] = sprspg.cfr_renamed_7244(sprszm4.cfr_renamed_85(n4));
            int n5 = n++;
            sprspg3.cfr_renamed_4[n5] = sprspg.cfr_renamed_7244(sprszm5.cfr_renamed_85(n5));
            n2 = n;
        }
    }

    public static sprspg cfr_renamed_23(Object arg0) {
        if (arg0 instanceof sprspg) {
            return (sprspg)arg0;
        }
        if (arg0 != null) {
            return new sprspg(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }

    public int[] cfr_renamed_1153() {
        return sproze.cfr_renamed_535(this.cfr_renamed_1);
    }

    private static /* synthetic */ int cfr_renamed_7244(sprco arg0) {
        int n = ((sprktm)arg0).cfr_renamed_5023();
        if (n <= 0) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprdhea.cfr_renamed_9("r\u0015W5^\bU\u001bU\u000e\u0010\u0012_\b\u0010\u0015^\\b\u001d^\u001bUF\u0010")).append(n).toString());
        }
        return n;
    }

    public int[] cfr_renamed_1438() {
        return sproze.cfr_renamed_535(this.cfr_renamed_2);
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        sprrvm sprrvm2 = new sprrvm();
        sprrvm sprrvm3 = new sprrvm();
        sprrvm sprrvm4 = new sprrvm();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_1.length) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_1[n]));
            sprrvm3.cfr_renamed_5004(new sprktm(this.cfr_renamed_2[n]));
            int n3 = this.cfr_renamed_4[n];
            sprrvm4.cfr_renamed_5004(new sprktm(n3));
            n2 = ++n;
        }
        sprrvm sprrvm5 = new sprrvm();
        sprrvm5.cfr_renamed_5004(new sprktm(this.cfr_renamed_3));
        sprrvm5.cfr_renamed_5004(new sprcen(sprrvm2));
        sprrvm5.cfr_renamed_5004(new sprcen(sprrvm3));
        sprrvm5.cfr_renamed_5004(new sprcen(sprrvm4));
        return new sprcen(sprrvm5);
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_3;
    }

    /*
     * WARNING - void declaration
     */
    public sprspg(int n, int[] nArray, int[] nArray2, int[] nArray3) {
        void arg2;
        void arg1;
        void arg0;
        sprspg sprspg2 = this;
        sprspg sprspg3 = this;
        sprspg3.cfr_renamed_3 = arg0;
        sprspg3.cfr_renamed_1 = arg1;
        sprspg2.cfr_renamed_2 = arg2;
        sprspg2.cfr_renamed_4 = nArray3;
    }
}

