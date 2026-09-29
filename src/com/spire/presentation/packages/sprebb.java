/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprdce;
import com.spire.presentation.packages.sprexa;
import com.spire.presentation.packages.sprfya;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprja;
import com.spire.presentation.packages.sprrdb;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprudb;
import com.spire.presentation.packages.sprva;
import com.spire.presentation.packages.sprvfb;
import java.io.IOException;

public abstract class sprebb {
    public sprva cfr_renamed_4 = sprudb.cfr_renamed_4;

    public abstract sprhgb cfr_renamed_1580(sprdce var1) throws IOException;

    public abstract sprta cfr_renamed_1581(sprije var1) throws sprfya;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 ^ 5) << 1;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 2 << 1;
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

    public sprja cfr_renamed_1560(sprcyd arg0) throws sprfya {
        return new sprvfb(this, arg0);
    }

    private /* synthetic */ sprexa cfr_renamed_1586(sprije arg0, sprhgb arg1) throws sprfya {
        sprta sprta2 = this.cfr_renamed_1581(arg0);
        sprta2.cfr_renamed_1217(false, arg1);
        return new sprexa(sprta2);
    }

    public static /* synthetic */ sprexa cfr_renamed_1587(sprebb arg0, sprije arg1, sprhgb arg2) throws sprfya {
        return arg0.cfr_renamed_1586(arg1, arg2);
    }

    public sprja cfr_renamed_1588(sprhgb arg0) throws sprfya {
        return new sprrdb(this, arg0);
    }
}

