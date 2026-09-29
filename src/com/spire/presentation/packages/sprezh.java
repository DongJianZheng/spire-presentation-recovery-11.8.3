/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprigi;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruaf;
import java.security.spec.AlgorithmParameterSpec;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class sprezh
implements AlgorithmParameterSpec {
    public static final int cfr_renamed_152 = 20;
    public static final int cfr_renamed_112 = 0;
    public static final int cfr_renamed_119 = 16;
    public static final int cfr_renamed_91 = 8;
    private Map cfr_renamed_0;
    public static final int cfr_renamed_1 = 12;
    public static final int cfr_renamed_2 = 4;
    public static final int cfr_renamed_3 = 63;
    public static final int cfr_renamed_4 = 48;

    public byte[] cfr_renamed_1521() {
        return sproze.cfr_renamed_158((byte[])this.cfr_renamed_0.get(spruaf.cfr_renamed_279(0)));
    }

    public byte[] cfr_renamed_327() {
        return sproze.cfr_renamed_158((byte[])this.cfr_renamed_0.get(spruaf.cfr_renamed_279(16)));
    }

    public byte[] cfr_renamed_2384() {
        return sproze.cfr_renamed_158((byte[])this.cfr_renamed_0.get(spruaf.cfr_renamed_279(8)));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 2 ^ 5;
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

    public byte[] cfr_renamed_1157() {
        return sproze.cfr_renamed_158((byte[])this.cfr_renamed_0.get(spruaf.cfr_renamed_279(12)));
    }

    public sprezh() {
        this(new HashMap());
    }

    private /* synthetic */ sprezh(Map map) {
        this.cfr_renamed_0 = Collections.unmodifiableMap(map);
    }

    public /* synthetic */ sprezh(Map arg0, sprigi arg1) {
        this(arg0);
    }

    public static /* synthetic */ Map cfr_renamed_9199(sprezh arg0) {
        return arg0.cfr_renamed_0;
    }

    public byte[] cfr_renamed_596() {
        return sproze.cfr_renamed_158((byte[])this.cfr_renamed_0.get(spruaf.cfr_renamed_279(20)));
    }

    public Map cfr_renamed_284() {
        return this.cfr_renamed_0;
    }
}

