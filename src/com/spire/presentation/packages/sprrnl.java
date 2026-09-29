/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdl;
import com.spire.presentation.packages.sprfum;
import com.spire.presentation.packages.sprkxl;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprlz;
import com.spire.presentation.packages.sprpaia;
import com.spire.presentation.packages.sprsom;
import com.spire.presentation.packages.spruci;
import com.spire.presentation.packages.sprxpm;

public class sprrnl {
    private final sprsom cfr_renamed_4;

    public sprrnl(sprsom sprsom2) {
        this.cfr_renamed_4 = sprsom2;
    }

    public sprxpm cfr_renamed_2141() throws sprlyl {
        if (this.cfr_renamed_10977()) {
            throw new IllegalStateException(spruci.cfr_renamed_9("v:g?h\"c.rve3t\"o0o5g\"cvg%m3bv`9tz&8i8cv`9s8b"));
        }
        return this.cfr_renamed_4.cfr_renamed_4895().cfr_renamed_4899().cfr_renamed_2141();
    }

    public boolean cfr_renamed_10977() {
        return this.cfr_renamed_4.cfr_renamed_4895().cfr_renamed_4899().cfr_renamed_10977();
    }

    public sprxpm cfr_renamed_10978(sprlz arg0) throws sprlyl {
        return sprxpm.cfr_renamed_23(this.cfr_renamed_10979().cfr_renamed_4171().cfr_renamed_3996().iterator().next().cfr_renamed_10664(arg0));
    }

    public sprkxl cfr_renamed_10979() throws sprlyl {
        if (!this.cfr_renamed_10977()) {
            throw new IllegalStateException(sprpaia.cfr_renamed_9("\u0019\u0014\u001f\b\u0005\n\b\u001f\u0018Z\u001f\u001f\u000e\u000e\u0015\u001c\u0015\u0019\u001d\u000e\u0019Z\u001d\t\u0017\u001f\u0018Z\u001a\u0015\u000eV\\\u0014\u0013\u0014\u0019Z\u001a\u0015\t\u0014\u0018"));
        }
        sprfum sprfum2 = this.cfr_renamed_4.cfr_renamed_4895();
        sprkxl sprkxl2 = new sprkxl(new sprlvm(sprdl.cfr_renamed_489, sprfum2.cfr_renamed_4899().cfr_renamed_4897().cfr_renamed_97()));
        if (sprkxl2.cfr_renamed_4171().cfr_renamed_84() != 1) {
            throw new IllegalStateException(spruci.cfr_renamed_9("2g\"gvc8e$\u007f&r3bv`9tvk9t3&\"n7hvi8cvt3e?v?c8r"));
        }
        return sprkxl2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ 1 << 1;
        int cfr_ignored_0 = 5 << 3 ^ 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ 5;
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

    public sprsom cfr_renamed_568() {
        return this.cfr_renamed_4;
    }
}

