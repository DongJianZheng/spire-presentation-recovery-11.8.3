/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.data.table.DataColumn;
import com.spire.presentation.packages.sprbtm;
import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprjlm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprpjo;
import com.spire.presentation.packages.sprqqe;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.spruaf;
import com.spire.presentation.packages.sprws;
import com.spire.presentation.packages.sprxgf;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class sprckm
extends sprqqe {
    public static final int cfr_renamed_93 = 128;
    private byte cfr_renamed_86;
    public static final int cfr_renamed_152 = 64;
    private sprlem cfr_renamed_112;
    public static final int cfr_renamed_119 = 0;
    public static final sprlem cfr_renamed_91 = sprws.cfr_renamed_272.cfr_renamed_1436(DataColumn.cfr_renamed_9("A_C_@_C"));
    public static final int cfr_renamed_0 = 1;
    public static final int cfr_renamed_1 = 2;
    public static Map cfr_renamed_2 = new HashMap();
    public static final int cfr_renamed_3 = 192;
    public static sprbtm cfr_renamed_4 = new sprbtm();

    private /* synthetic */ void cfr_renamed_4733(byte arg0) {
        this.cfr_renamed_86 = arg0;
    }

    public sprlem cfr_renamed_4721() {
        return this.cfr_renamed_112;
    }

    public static int cfr_renamed_11242(String arg0) {
        Integer n = (Integer)cfr_renamed_4.cfr_renamed_4735(arg0);
        if (n == null) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, DataColumn.cfr_renamed_9("$\u001c\u001a\u001c\u001e\u0005\u001fR\u0007\u0013\u001d\u0007\u0014R")).append(arg0).toString());
        }
        return n;
    }

    private /* synthetic */ void cfr_renamed_11243(sprlem arg0) {
        this.cfr_renamed_112 = arg0;
    }

    @Override
    public sprxgf cfr_renamed_119() {
        sprrvm sprrvm2;
        sprrvm sprrvm3 = sprrvm2 = new sprrvm(2);
        sprrvm3.cfr_renamed_5004(this.cfr_renamed_112);
        byte[] byArray = new byte[1];
        byArray[0] = this.cfr_renamed_86;
        sprrvm3.cfr_renamed_5004(sprjlm.cfr_renamed_11235(19, byArray));
        return sprjlm.cfr_renamed_11236(76, new sprcen(sprrvm2));
    }

    private /* synthetic */ void cfr_renamed_11244(sprszm arg0) {
        sprxgf sprxgf2 = (sprxgf)arg0.cfr_renamed_85(0);
        if (!(sprxgf2 instanceof sprlem)) {
            throw new IllegalArgumentException(sprpjo.cfr_renamed_9("R'\u001c\u0007U,\u001c!Rh\u007f-N<U+]<Y\u0000S$X-N\tI<T'N!F)H!S&"));
        }
        this.cfr_renamed_112 = (sprlem)sprxgf2;
        sprxgf2 = (sprxgf)arg0.cfr_renamed_85(1);
        if (sprxgf2 instanceof sprnvm) {
            sprnvm sprnvm2 = sprnvm.cfr_renamed_9663(sprxgf2, 64, 19);
            this.cfr_renamed_86 = sproug.cfr_renamed_23(sprnvm2.cfr_renamed_10766(false, 4)).cfr_renamed_186()[0];
            return;
        }
        throw new IllegalArgumentException(DataColumn.cfr_renamed_9("?\u001dQ\u0013\u0012\u0011\u0014\u0001\u0002R\u0003\u001b\u0016\u001a\u0005\u0001Q\u001b\u001fR2\u0017\u0003\u0006\u0018\u0011\u0010\u0006\u0014:\u001e\u001e\u0015\u0017\u00033\u0004\u0006\u0019\u001d\u0003\u001b\u000b\u0013\u0005\u001b\u001e\u001c"));
    }

    /*
     * WARNING - void declaration
     */
    public sprckm(sprlem sprlem2, int n) throws IOException {
        void arg0;
        sprckm sprckm2 = this;
        sprckm2.cfr_renamed_11243((sprlem)arg0);
        sprckm2.cfr_renamed_4733((byte)n);
    }

    /*
     * WARNING - void declaration
     */
    public sprckm(sprnvm sprnvm2) throws IOException {
        if (sprnvm2.cfr_renamed_11239(64, 76)) {
            void arg0;
            this.cfr_renamed_11244(sprszm.cfr_renamed_23(arg0.cfr_renamed_10766(false, 16)));
            return;
        }
        throw new IllegalArgumentException(sprpjo.cfr_renamed_9("\u001dR:Y+S/R!F-XhS*V-_<\u001c!Rh\u007f-N<U+]<Y\u0000S$X-N\tI<T'N!F)H!S&"));
    }

    static {
        cfr_renamed_2.put(spruaf.cfr_renamed_279(2), sprpjo.cfr_renamed_9("\u001a}\f{|"));
        cfr_renamed_2.put(spruaf.cfr_renamed_279(1), DataColumn.cfr_renamed_9(" 066A"));
        cfr_renamed_4.put(spruaf.cfr_renamed_279(192), sprpjo.cfr_renamed_9("\u007f\u001e\u007f\t"));
        cfr_renamed_4.put(spruaf.cfr_renamed_279(128), DataColumn.cfr_renamed_9("6'-5=<7\"&81"));
        cfr_renamed_4.put(spruaf.cfr_renamed_279(64), sprpjo.cfr_renamed_9("x\u001ec\u000es\u001ay\u0001{\u0006"));
        cfr_renamed_4.put(spruaf.cfr_renamed_279(0), DataColumn.cfr_renamed_9("8!"));
    }

    public static String cfr_renamed_11245(int arg0) {
        return (String)cfr_renamed_4.get(spruaf.cfr_renamed_279(arg0));
    }

    public int cfr_renamed_4716() {
        return this.cfr_renamed_86 & 0xFF;
    }
}

