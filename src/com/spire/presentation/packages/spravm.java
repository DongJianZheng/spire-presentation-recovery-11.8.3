/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdcm;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprjfn;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprnom;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprpzz;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprsdn;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprwum;
import com.spire.presentation.packages.sprxgf;
import com.spire.presentation.packages.sprycn;
import java.math.BigInteger;

public class spravm
extends sprqqe {
    private static final int cfr_renamed_79 = 0;
    private static final int cfr_renamed_107 = 3;
    private sprdcm cfr_renamed_132;
    private spraem cfr_renamed_102;
    private int cfr_renamed_93 = 1;
    private sprwum cfr_renamed_86;
    private static final int cfr_renamed_152 = 1;
    private static final int cfr_renamed_112 = 1;
    private BigInteger cfr_renamed_119;
    private sprhgm cfr_renamed_91;
    private static final int cfr_renamed_0 = 4;
    private spraem cfr_renamed_1;
    private static final int cfr_renamed_2 = 2;
    private spraem cfr_renamed_3;
    private sprnom cfr_renamed_4;

    public sprwum cfr_renamed_2594() {
        return this.cfr_renamed_86;
    }

    public sprdcm cfr_renamed_2595() {
        return this.cfr_renamed_132;
    }

    public spraem cfr_renamed_2592() {
        return this.cfr_renamed_102;
    }

    public spraem cfr_renamed_2596() {
        return this.cfr_renamed_1;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sprpzz.cfr_renamed_9("p\u000bw\u000ef8E(Q.@\u0014Z;[/Y<@4[3\u0014&>"));
        if (this.cfr_renamed_93 != 1) {
            stringBuffer.append(sprsdn.cfr_renamed_9("Y\u0012]\u0004F\u0018AM\u000f") + this.cfr_renamed_93 + "\n");
        }
        stringBuffer.append(new StringBuilder().insert(0, sprpzz.cfr_renamed_9("G8F+]>Qg\u0014")).append(this.cfr_renamed_86).append("\n").toString());
        if (this.cfr_renamed_119 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprsdn.cfr_renamed_9("A\u0018A\u0014JM\u000f")).append(this.cfr_renamed_119).append("\n").toString());
        }
        if (this.cfr_renamed_4 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprpzz.cfr_renamed_9("F8E(Q.@\t]0Qg\u0014")).append(this.cfr_renamed_4).append("\n").toString());
        }
        if (this.cfr_renamed_102 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprsdn.cfr_renamed_9("]\u0012^\u0002J\u0004[\u0012]M\u000f")).append(this.cfr_renamed_102).append("\n").toString());
        }
        if (this.cfr_renamed_132 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprpzz.cfr_renamed_9("F8E(Q.@\r[1]>Mg\u0014")).append(this.cfr_renamed_132).append("\n").toString());
        }
        if (this.cfr_renamed_3 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprsdn.cfr_renamed_9("\u0013Y\u0014\\M\u000f")).append(this.cfr_renamed_3).append("\n").toString());
        }
        if (this.cfr_renamed_1 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprpzz.cfr_renamed_9("P<@<x2W<@4[3Gg\u0014")).append(this.cfr_renamed_1).append("\n").toString());
        }
        if (this.cfr_renamed_91 != null) {
            stringBuffer.append(new StringBuilder().insert(0, sprsdn.cfr_renamed_9("\u0012W\u0003J\u0019\\\u001e@\u0019\\M\u000f")).append(this.cfr_renamed_91).append("\n").toString());
        }
        StringBuffer stringBuffer2 = stringBuffer;
        stringBuffer2.append(sprpzz.cfr_renamed_9(" >"));
        return stringBuffer2.toString();
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    private /* synthetic */ spravm(sprszm sprszm2) {
        spravm spravm2;
        void arg0;
        int n = 0;
        if (sprszm2.cfr_renamed_85(0) instanceof sprktm) {
            sprktm sprktm2 = sprktm.cfr_renamed_23(arg0.cfr_renamed_85(n));
            ++n;
            spravm2 = this;
            this.cfr_renamed_93 = sprktm2.cfr_renamed_5023();
        } else {
            spravm2 = this;
            this.cfr_renamed_93 = 1;
        }
        spravm2.cfr_renamed_86 = sprwum.cfr_renamed_23(arg0.cfr_renamed_85(n));
        int n2 = ++n;
        while (true) {
            block12: {
                sprco sprco2;
                block14: {
                    block13: {
                        block11: {
                            if (n2 >= arg0.cfr_renamed_84()) {
                                return;
                            }
                            sprco2 = arg0.cfr_renamed_85(n);
                            if (!(sprco2 instanceof sprktm)) break block11;
                            this.cfr_renamed_119 = sprktm.cfr_renamed_23(sprco2).cfr_renamed_97();
                            break block12;
                        }
                        if (!(sprco2 instanceof sprjfn)) break block13;
                        this.cfr_renamed_4 = sprnom.cfr_renamed_23(sprco2);
                        break block12;
                    }
                    if (!(sprco2 instanceof sprnvm)) break block14;
                    sprnvm sprnvm2 = sprnvm.cfr_renamed_23(sprco2);
                    int n3 = sprnvm2.cfr_renamed_312();
                    switch (n3) {
                        case 0: {
                            this.cfr_renamed_102 = spraem.cfr_renamed_5085(sprnvm2, false);
                            break block12;
                        }
                        case 1: {
                            this.cfr_renamed_132 = sprdcm.cfr_renamed_23(sprszm.cfr_renamed_5085(sprnvm2, false));
                            break block12;
                        }
                        case 2: {
                            this.cfr_renamed_3 = spraem.cfr_renamed_5085(sprnvm2, false);
                            break block12;
                        }
                        case 3: {
                            this.cfr_renamed_1 = spraem.cfr_renamed_5085(sprnvm2, false);
                            break block12;
                        }
                        case 4: {
                            this.cfr_renamed_91 = sprhgm.cfr_renamed_5085(sprnvm2, false);
                            break block12;
                        }
                        default: {
                            throw new IllegalArgumentException(new StringBuilder().insert(0, sprsdn.cfr_renamed_9("\u0002A\u001cA\u0018X\u0019\u000f\u0003N\u0010\u000f\u0019Z\u001aM\u0012]WJ\u0019L\u0018Z\u0019[\u0012]\u0012KM\u000f")).append(n3).toString());
                        }
                    }
                }
                this.cfr_renamed_4 = sprnom.cfr_renamed_23(sprco2);
            }
            n2 = ++n;
        }
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_93;
    }

    public static spravm cfr_renamed_5085(sprnvm arg0, boolean arg1) {
        return spravm.cfr_renamed_23(sprszm.cfr_renamed_5085(arg0, arg1));
    }

    public BigInteger cfr_renamed_596() {
        return this.cfr_renamed_119;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        int n;
        sprrvm sprrvm2 = new sprrvm(9);
        if (this.cfr_renamed_93 != 1) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_93));
        }
        sprrvm2.cfr_renamed_5004(this.cfr_renamed_86);
        if (this.cfr_renamed_119 != null) {
            sprrvm2.cfr_renamed_5004(new sprktm(this.cfr_renamed_119));
        }
        if (this.cfr_renamed_4 != null) {
            sprrvm2.cfr_renamed_5004(this.cfr_renamed_4);
        }
        int[] nArray = new int[5];
        nArray[0] = 0;
        nArray[1] = 1;
        nArray[2] = 2;
        nArray[3] = 3;
        nArray[4] = 4;
        int[] nArray2 = nArray;
        sprco[] sprcoArray = new sprco[5];
        sprcoArray[0] = this.cfr_renamed_102;
        sprcoArray[1] = this.cfr_renamed_132;
        sprcoArray[2] = this.cfr_renamed_3;
        sprcoArray[3] = this.cfr_renamed_1;
        sprcoArray[4] = this.cfr_renamed_91;
        sprco[] sprcoArray2 = sprcoArray;
        int n2 = n = 0;
        while (n2 < nArray2.length) {
            int n3 = nArray2[n];
            sprco sprco2 = sprcoArray2[n];
            if (sprco2 != null) {
                sprrvm2.cfr_renamed_5004(new sprycn(false, n3, sprco2));
            }
            n2 = ++n;
        }
        return new sprcen(sprrvm2);
    }

    public sprhgm cfr_renamed_98() {
        return this.cfr_renamed_91;
    }

    public spraem cfr_renamed_2599() {
        return this.cfr_renamed_3;
    }

    public sprnom cfr_renamed_2590() {
        return this.cfr_renamed_4;
    }

    public static spravm cfr_renamed_23(Object arg0) {
        if (arg0 instanceof spravm) {
            return (spravm)arg0;
        }
        if (arg0 != null) {
            return new spravm(sprszm.cfr_renamed_23(arg0));
        }
        return null;
    }
}

