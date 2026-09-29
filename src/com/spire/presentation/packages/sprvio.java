/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdpo;
import com.spire.presentation.packages.sprdz;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprgpja;
import com.spire.presentation.packages.sprkq;
import com.spire.presentation.packages.sprmgo;
import com.spire.presentation.packages.sprqio;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprriia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvrx;
import com.spire.presentation.packages.spryeo;
import java.util.Iterator;

@sprtea
public class sprvio
extends sprmgo
implements sprkq {
    private sprdz cfr_renamed_4;

    @sprtea
    public sprvio() {
        sprvio sprvio2 = this;
        this.cfr_renamed_4 = new sprvrx();
        sprvio2.cfr_renamed_4 = new sprvrx();
    }

    @sprtea
    public sprvio cfr_renamed_4693(String arg0) {
        sprvio sprvio2 = this;
        sprvio2.cfr_renamed_4.cfr_renamed_12808(arg0);
        return sprvio2;
    }

    @sprtea
    public void cfr_renamed_15788() {
        int n;
        double[][] dArray = this.cfr_renamed_15789();
        int n2 = n = 0;
        while (n2 < dArray.length) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < dArray[n].length) {
                StringBuilder stringBuilder = new StringBuilder().insert(0, sprvio.cfr_renamed_15502(dArray[n][n3]));
                sprgpja.cfr_renamed_11835(stringBuilder.append(spryeo.cfr_renamed_9("/")).toString());
                n4 = ++n3;
            }
            sprgpja.cfr_renamed_14076();
            n2 = ++n;
        }
    }

    @sprtea
    public Double[] cfr_renamed_15790() {
        Iterator iterator;
        Double[] doubleArray = new Double[this.cfr_renamed_4.size()];
        int n = 0;
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            doubleArray[n++] = sprvio.cfr_renamed_15505(string);
        }
        return doubleArray;
    }

    @sprtea
    public sprvio cfr_renamed_15791(sprdz arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    @sprtea
    public double[][] cfr_renamed_15789() {
        if (this.cfr_renamed_84() != 6) {
            throw new IllegalArgumentException(sprdpo.cfr_renamed_9("\u77cf\u9628\u6556\u7ed9\u5fe3\u9866\u672f=\u001f\u4e37\u5165\u7d3d"));
        }
        double[][] dArrayArray = new double[3][];
        dArrayArray[0] = new double[3];
        dArrayArray[1] = new double[3];
        dArrayArray[2] = new double[3];
        double[][] dArrayArray2 = dArrayArray;
        dArrayArray[0][0] = sprvio.cfr_renamed_15505((String)this.cfr_renamed_4.cfr_renamed_12151(0));
        dArrayArray2[0][1] = sprvio.cfr_renamed_15505((String)this.cfr_renamed_4.cfr_renamed_12151(1));
        dArrayArray2[0][2] = 0.0;
        dArrayArray2[1][0] = sprvio.cfr_renamed_15505((String)this.cfr_renamed_4.cfr_renamed_12151(2));
        dArrayArray2[1][1] = sprvio.cfr_renamed_15505((String)this.cfr_renamed_4.cfr_renamed_12151(3));
        dArrayArray2[1][2] = 0.0;
        dArrayArray2[2][0] = sprvio.cfr_renamed_15505((String)this.cfr_renamed_4.cfr_renamed_12151(4));
        dArrayArray2[2][1] = sprvio.cfr_renamed_15505((String)this.cfr_renamed_4.cfr_renamed_12151(5));
        dArrayArray2[2][2] = 1.0;
        return dArrayArray2;
    }

    @Override
    public Object cfr_renamed_12099() {
        Iterator iterator;
        sprvio sprvio2 = new sprvio();
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            sprvio2.cfr_renamed_4693(string);
        }
        return sprvio2;
    }

    @sprtea
    public Integer[] cfr_renamed_15792() {
        Iterator iterator;
        Integer[] integerArray = new Integer[this.cfr_renamed_4.size()];
        int n = 0;
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            integerArray[n++] = Integer.parseInt(string);
        }
        return integerArray;
    }

    public String toString() {
        Iterator iterator;
        StringBuilder stringBuilder = new StringBuilder();
        Iterator iterator2 = iterator = this.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            sprghha.cfr_renamed_12279(stringBuilder.append(' '), string);
        }
        return sprraia.cfr_renamed_12806(stringBuilder.toString());
    }

    /*
     * Unable to fully structure code
     */
    @sprtea
    public sprvio(Object ... var1_1) {
        super();
        v0 = this;
        v0.cfr_renamed_4 = new sprvrx<T>();
        if (var1_1 == null || ((void)arg0).length == 0) {
            throw new IllegalArgumentException(spryeo.cfr_renamed_9("\u53b6\u6556\u4e79\u80db\u4e4e\u7a5c"));
        }
        var2_2 = arg0;
        if (var2_2[0] instanceof Object[]) {
            var2_2 = spresca.cfr_renamed_11777(arg0[0], Object[].class);
        }
        this.cfr_renamed_4 = new sprvrx<T>(var2_2.length);
        var3_3 = var2_2;
        var4_4 = var2_2.length;
        v1 = var5_5 = 0;
        while (v1 < var4_4) {
            block8: {
                block7: {
                    var6_6 = var3_3[var5_5];
                    if (!(var6_6 instanceof String) && var6_6 != null) break block7;
                    var7_7 = (String)var6_6;
                    if (var6_6 != null && sprraia.cfr_renamed_12806(var7_7).length() != 0) ** GOTO lbl32
                    break block8;
                }
                if (var6_6 instanceof Double) {
                    var7_7 = sprmgo.cfr_renamed_15502((Double)var6_6);
                    v2 = this;
                } else {
                    v3 = var6_6;
                    if (var6_6 instanceof Float) {
                        var7_7 = sprmgo.cfr_renamed_15502(((Float)v3).floatValue());
                        v2 = this;
                    } else {
                        var7_7 = sprmgo.cfr_renamed_15502(sprvio.cfr_renamed_15505(v3.toString()));
lbl32:
                        // 2 sources

                        v2 = this;
                    }
                }
                v2.cfr_renamed_4.cfr_renamed_12808(var7_7);
            }
            v1 = ++var5_5;
        }
    }

    @sprtea
    public sprvio cfr_renamed_15793(sprvio arg0) {
        int n;
        if (this.cfr_renamed_4.size() != 6 || arg0.cfr_renamed_84() != 6) {
            throw new IllegalArgumentException(sprdpo.cfr_renamed_9("\u77f4\u9613\u4e45\u6cf3\u656d\u7ee2\u89d9\u6a07\u5fd8\u985d=\u0010\u515e\u7d065G=D=E=B=C=@4"));
        }
        double[][] dArray = this.cfr_renamed_15789();
        double[][] dArray2 = arg0.cfr_renamed_15789();
        double[][] dArrayArray = new double[3][];
        dArrayArray[0] = new double[3];
        dArrayArray[1] = new double[3];
        dArrayArray[2] = new double[3];
        double[][] dArrayArray2 = dArrayArray;
        int n2 = n = 0;
        while (n2 < 3) {
            int n3;
            int n4 = n3 = 0;
            while (n4 < 3) {
                int n5;
                int n6 = n5 = 0;
                while (n6 < 3) {
                    double[] dArray3 = dArrayArray2[n3];
                    int n7 = n5;
                    double d = dArray3[n7] + dArray[n3][n] * dArray2[n][n5];
                    dArray3[n7] = d;
                    n6 = ++n5;
                }
                n4 = ++n3;
            }
            n2 = ++n;
        }
        Object[] objectArray = new Object[6];
        objectArray[0] = sprvio.cfr_renamed_15502(dArrayArray2[0][0]);
        objectArray[1] = sprvio.cfr_renamed_15502(dArrayArray2[0][1]);
        objectArray[2] = sprvio.cfr_renamed_15502(dArrayArray2[1][0]);
        objectArray[3] = sprvio.cfr_renamed_15502(dArrayArray2[1][1]);
        objectArray[4] = sprvio.cfr_renamed_15502(dArrayArray2[2][0]);
        objectArray[5] = sprvio.cfr_renamed_15502(dArrayArray2[2][1]);
        return new sprvio(objectArray);
    }

    @sprtea
    public static sprvio cfr_renamed_141(String arg0) {
        if (sprriia.cfr_renamed_15321(arg0, null) || sprraia.cfr_renamed_12806(arg0).length() == 0) {
            return null;
        }
        return new sprvio(sprqio.cfr_renamed_15133(sprraia.cfr_renamed_12806(arg0), spryeo.cfr_renamed_9("z\u0007\r"), true));
    }

    @sprtea
    public int cfr_renamed_84() {
        return this.cfr_renamed_4.size();
    }

    @sprtea
    public static sprvio cfr_renamed_15794() {
        Object[] objectArray = new Object[6];
        objectArray[0] = "1";
        objectArray[1] = "0";
        objectArray[2] = "0";
        objectArray[3] = "1";
        objectArray[4] = "0";
        objectArray[5] = "0";
        return new sprvio(objectArray);
    }

    @sprtea
    public sprdz cfr_renamed_6629() {
        return this.cfr_renamed_4;
    }
}

