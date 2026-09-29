/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprraja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvws;

@sprtea
public final class sprsdn {
    @sprtea
    public long cfr_renamed_3;
    private boolean cfr_renamed_4;

    public boolean equals(Object arg0) {
        if (!this.cfr_renamed_11967()) {
            return arg0 == null;
        }
        if (arg0 == null) {
            return false;
        }
        return this.cfr_renamed_3 == (Long)arg0;
    }

    public int hashCode() {
        if (!this.cfr_renamed_11967()) {
            return 0;
        }
        return sprraja.cfr_renamed_12020(this.cfr_renamed_3);
    }

    public boolean cfr_renamed_11967() {
        return this.cfr_renamed_4;
    }

    public long cfr_renamed_12021(long arg0) {
        if (!this.cfr_renamed_11967()) {
            return arg0;
        }
        return this.cfr_renamed_3;
    }

    public long cfr_renamed_97() {
        if (!this.cfr_renamed_11967()) {
            throw new IllegalStateException(sprvws.cfr_renamed_9("4w\u0016n\u001b`\u0016g3l\u000e4N\"\u001em\u001fq\u0014%\u000e\"\u0012c\fgZcZt\u001bn\u000fgT"));
        }
        return this.cfr_renamed_3;
    }

    public sprsdn() {
    }

    public String toString() {
        if (!this.cfr_renamed_11967()) {
            return "";
        }
        return Long.toString(this.cfr_renamed_3);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = 4 << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 5 << 3 ^ (2 ^ 5);
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
     * WARNING - void declaration
     */
    public sprsdn(long l) {
        void arg0;
        sprsdn sprsdn2 = this;
        sprsdn2.cfr_renamed_3 = arg0;
        sprsdn2.cfr_renamed_4 = true;
    }

    public long cfr_renamed_12022() {
        return this.cfr_renamed_3;
    }
}

