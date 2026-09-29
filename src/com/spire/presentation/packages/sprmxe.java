/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprfhi;
import com.spire.presentation.packages.sprrgf;
import com.spire.presentation.packages.sprwys;
import java.security.InvalidParameterException;
import java.security.spec.AlgorithmParameterSpec;

public class sprmxe
implements AlgorithmParameterSpec {
    private int cfr_renamed_91;
    public static final int cfr_renamed_0 = 50;
    private int cfr_renamed_1;
    public static final int cfr_renamed_2 = 11;
    private int cfr_renamed_3;
    private int cfr_renamed_4;

    public int cfr_renamed_1185() {
        return this.cfr_renamed_3;
    }

    public sprmxe() {
        this(11, 50);
    }

    /*
     * WARNING - void declaration
     */
    public sprmxe(int n) {
        void arg0;
        if (n < 1) {
            throw new IllegalArgumentException(sprfhi.cfr_renamed_9("=T/\u0011%X,Tv\\#B\"\u00114TvA9B?E?G3"));
        }
        sprmxe sprmxe2 = this;
        sprmxe sprmxe3 = this;
        sprmxe3.cfr_renamed_4 = 0;
        sprmxe3.cfr_renamed_1 = 1;
        while (sprmxe2.cfr_renamed_1 < arg0) {
            sprmxe sprmxe4 = this;
            sprmxe2 = sprmxe4;
            sprmxe4.cfr_renamed_1 <<= 1;
            ++sprmxe4.cfr_renamed_4;
        }
        sprmxe sprmxe5 = this;
        sprmxe5.cfr_renamed_91 = sprmxe5.cfr_renamed_1 >>> 1;
        sprmxe5.cfr_renamed_91 /= this.cfr_renamed_4;
        sprmxe5.cfr_renamed_3 = sprrgf.cfr_renamed_826(sprmxe5.cfr_renamed_4);
    }

    public int cfr_renamed_1144() {
        return this.cfr_renamed_91;
    }

    public int cfr_renamed_1186() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public sprmxe(int n, int n2) throws InvalidParameterException {
        void arg1;
        void arg0;
        if (n < 1) {
            throw new IllegalArgumentException(sprwys.cfr_renamed_9("oQo\u0004q\u0005\"\u0013gQr\u001eq\u0018v\u0018t\u0014"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(sprfhi.cfr_renamed_9("\\vX%\u0011\"^9\u0011:P$V3"));
        }
        this.cfr_renamed_4 = arg0;
        this.cfr_renamed_1 = 1 << arg0;
        if (arg1 < 0) {
            throw new IllegalArgumentException(sprwys.cfr_renamed_9("vQo\u0004q\u0005\"\u0013gQr\u001eq\u0018v\u0018t\u0014"));
        }
        if (arg1 > this.cfr_renamed_1) {
            throw new IllegalArgumentException(sprfhi.cfr_renamed_9("\"\u0011;D%EvS3\u0011:T%BvE>P8\u00118\u0011k\u0011do;"));
        }
        this.cfr_renamed_91 = arg1;
        this.cfr_renamed_3 = sprrgf.cfr_renamed_826((int)arg0);
    }

    public int cfr_renamed_1146() {
        return this.cfr_renamed_1;
    }

    public sprmxe(int arg0, int arg1, int arg2) {
        this.cfr_renamed_4 = arg0;
        if (this.cfr_renamed_4 < 1) {
            throw new IllegalArgumentException(sprwys.cfr_renamed_9("oQo\u0004q\u0005\"\u0013gQr\u001eq\u0018v\u0018t\u0014"));
        }
        if (arg0 > 32) {
            throw new IllegalArgumentException(sprfhi.cfr_renamed_9("v\\vX%\u0011\"^9\u0011:P$V3"));
        }
        this.cfr_renamed_1 = 1 << arg0;
        this.cfr_renamed_91 = arg1;
        if (arg1 < 0) {
            throw new IllegalArgumentException(sprwys.cfr_renamed_9("vQo\u0004q\u0005\"\u0013gQr\u001eq\u0018v\u0018t\u0014"));
        }
        if (arg1 > this.cfr_renamed_1) {
            throw new IllegalArgumentException(sprfhi.cfr_renamed_9("\"\u0011;D%EvS3\u0011:T%BvE>P8\u00118\u0011k\u0011do;"));
        }
        if (sprrgf.cfr_renamed_824(arg2) == arg0 && sprrgf.cfr_renamed_827(arg2)) {
            this.cfr_renamed_3 = arg2;
            return;
        }
        throw new IllegalArgumentException(sprwys.cfr_renamed_9("r\u001en\bl\u001eo\u0018c\u001d\"\u0018qQl\u001evQcQd\u0018g\u001dfQr\u001en\bl\u001eo\u0018c\u001d\"\u0017m\u0003\"6DY0/oX"));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 4 << 1;
        int cfr_ignored_0 = 1 << 3 ^ (3 ^ 5);
        int n4 = n2;
        int n5 = 2 << 3 ^ 3;
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
}

