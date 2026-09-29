/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdfp;
import com.spire.presentation.packages.sprdgk;
import com.spire.presentation.packages.sprdim;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprvgk;
import java.io.OutputStream;

public class sprigk {
    private final sprjj cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprdgk cfr_renamed_2588(byte[] arg0) throws sprvgk {
        try {
            OutputStream outputStream = this.cfr_renamed_4.cfr_renamed_470();
            outputStream.write(arg0);
            outputStream.close();
            return new sprdgk(new sprdim(this.cfr_renamed_4.cfr_renamed_615(), this.cfr_renamed_4.cfr_renamed_580()));
        }
        catch (Exception exception) {
            throw new sprvgk(new StringBuilder().insert(0, sprdfp.cfr_renamed_9("F]RQ_V\u0013G\\\u0013QFZ_W\u0013~V@@RTVz^CAZ]G\t\u0013")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprigk(sprjj sprjj2) {
        this.cfr_renamed_4 = sprjj2;
    }
}

