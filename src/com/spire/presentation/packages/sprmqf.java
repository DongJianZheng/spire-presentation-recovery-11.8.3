/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprxl;
import com.spire.presentation.packages.sprywe;
import com.spire.presentation.packages.sprzcf;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public final class sprmqf
implements sprxl {
    private final int cfr_renamed_2;
    private final String cfr_renamed_3;
    private static final Map<String, sprmqf> cfr_renamed_4;

    @Override
    public int cfr_renamed_4721() {
        return this.cfr_renamed_2;
    }

    @Override
    public String toString() {
        return this.cfr_renamed_3;
    }

    static {
        HashMap<String, sprmqf> hashMap = new HashMap<String, sprmqf>();
        hashMap.put(sprmqf.cfr_renamed_5891("SHA-256", 32, 16, 67, 10), new sprmqf(1, sprzcf.cfr_renamed_9("k,`2l2{ \u0001>\u0002QlS\u0006W")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHA-256", 32, 16, 67, 16), new sprmqf(2, sprywe.cfr_renamed_9("\u0001\u001e\n\u0000\u0006\u0000\u0011\u0012k\fhe\u0006ale")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHA-256", 32, 16, 67, 20), new sprmqf(3, sprzcf.cfr_renamed_9("k,`2l2{ \u0001>\u0001QlS\u0006W")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHA-512", 64, 16, 131, 10), new sprmqf(4, sprywe.cfr_renamed_9("\u0001\u001e\n\u0000\u0006\u0000\u0011\u0012k\fhc\u0006fha")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHA-512", 64, 16, 131, 16), new sprmqf(5, sprzcf.cfr_renamed_9("k,`2l2{ \u0001>\u0002WlT\u0002S")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHA-512", 64, 16, 131, 20), new sprmqf(6, sprywe.cfr_renamed_9("\u0001\u001e\n\u0000\u0006\u0000\u0011\u0012k\fkc\u0006fha")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHAKE128", 32, 16, 67, 10), new sprmqf(7, sprzcf.cfr_renamed_9("9~2`>`)r*v>\u0002QlS\u0006W")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHAKE128", 32, 16, 67, 16), new sprmqf(8, sprywe.cfr_renamed_9("\u000b\u0014\u0000\n\f\n\u001b\u0018\u0018\u001c\fhe\u0006ale")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHAKE128", 32, 16, 67, 20), new sprmqf(9, sprzcf.cfr_renamed_9("9~2`>`)r*v>\u0001QlS\u0006W")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHAKE256", 64, 16, 131, 10), new sprmqf(10, sprywe.cfr_renamed_9("\u000b\u0014\u0000\n\f\n\u001b\u0018\u0018\u001c\fhc\u0006fha")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHAKE256", 64, 16, 131, 16), new sprmqf(11, sprzcf.cfr_renamed_9("9~2`>`)r*v>\u0002WlT\u0002S")));
        hashMap.put(sprmqf.cfr_renamed_5891("SHAKE256", 64, 16, 131, 20), new sprmqf(12, sprywe.cfr_renamed_9("\u000b\u0014\u0000\n\f\n\u001b\u0018\u0018\u001c\fkc\u0006fha")));
        cfr_renamed_4 = Collections.unmodifiableMap(hashMap);
    }

    /*
     * WARNING - void declaration
     */
    private /* synthetic */ sprmqf(int n, String string) {
        void arg0;
        sprmqf sprmqf2 = this;
        sprmqf2.cfr_renamed_2 = arg0;
        sprmqf2.cfr_renamed_3 = string;
    }

    private static /* synthetic */ String cfr_renamed_5891(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            throw new NullPointerException(sprzcf.cfr_renamed_9("\u0000_\u0006\\\u0013Z\u0015[\f}\u0000^\u0004\u0013\\\u000eA]\u0014_\r"));
        }
        return new StringBuilder().insert(0, arg0).append("-").append(arg1).append("-").append(arg2).append("-").append(arg3).append("-").append(arg4).toString();
    }

    public static sprmqf cfr_renamed_5817(String arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 == null) {
            throw new NullPointerException(sprywe.cfr_renamed_9("2546!0'1>\u0017246ynds7&5?"));
        }
        return cfr_renamed_4.get(sprmqf.cfr_renamed_5891(arg0, arg1, arg2, arg3, arg4));
    }
}

