/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraq;
import com.spire.presentation.packages.sprgf;
import com.spire.presentation.packages.sprgo;
import com.spire.presentation.packages.sprjfk;
import com.spire.presentation.packages.sprjjk;
import com.spire.presentation.packages.sprjok;
import com.spire.presentation.packages.sprlhk;
import com.spire.presentation.packages.sprmr;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.spruaz;
import com.spire.presentation.packages.sprufk;
import com.spire.presentation.packages.sprybl;
import java.security.SecureRandom;

public class sprnpk {
    private final SecureRandom cfr_renamed_0;
    private final sprgo cfr_renamed_1;
    private int cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private int cfr_renamed_4;

    public sprnpk cfr_renamed_3293(int arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprlhk cfr_renamed_9327(sprgf arg0, byte[] arg1, boolean arg2) {
        sprnpk sprnpk2 = this;
        sprnpk sprnpk3 = this;
        return new sprlhk(sprnpk2.cfr_renamed_0, sprnpk2.cfr_renamed_1.cfr_renamed_576(this.cfr_renamed_2), new sprjok(arg0, arg1, sprnpk3.cfr_renamed_3, sprnpk3.cfr_renamed_4), arg2);
    }

    public sprnpk() {
        this(sprybl.cfr_renamed_2794(), false);
    }

    public sprnpk cfr_renamed_3291(byte[] arg0) {
        this.cfr_renamed_3 = sproze.cfr_renamed_158(arg0);
        return this;
    }

    private static /* synthetic */ String cfr_renamed_9957(sprgf arg0) {
        String string = arg0.cfr_renamed_1315();
        int n = string.indexOf(45);
        if (n > 0 && !string.startsWith(spruaz.cfr_renamed_9("\"g0\u001c"))) {
            return new StringBuilder().insert(0, string.substring(0, n)).append(string.substring(n + 1)).toString();
        }
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public sprnpk(SecureRandom secureRandom, boolean bl) {
        void arg1;
        sprnpk sprnpk2 = this;
        this.cfr_renamed_4 = 256;
        sprnpk2.cfr_renamed_2 = 256;
        sprnpk2.cfr_renamed_0 = secureRandom;
        sprnpk sprnpk3 = this;
        sprnpk2.cfr_renamed_1 = new sprjfk(this.cfr_renamed_0, (boolean)arg1);
    }

    public sprnpk cfr_renamed_3295(int arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    public static /* synthetic */ String cfr_renamed_9958(sprgf arg0) {
        return sprnpk.cfr_renamed_9957(arg0);
    }

    public sprnpk(sprgo sprgo2) {
        sprnpk sprnpk2 = this;
        sprnpk sprnpk3 = this;
        sprnpk3.cfr_renamed_4 = 256;
        sprnpk3.cfr_renamed_2 = 256;
        sprnpk2.cfr_renamed_0 = null;
        sprnpk2.cfr_renamed_1 = sprgo2;
    }

    public sprlhk cfr_renamed_9959(spraq arg0, byte[] arg1, boolean arg2) {
        sprnpk sprnpk2 = this;
        sprnpk sprnpk3 = this;
        return new sprlhk(sprnpk2.cfr_renamed_0, sprnpk2.cfr_renamed_1.cfr_renamed_576(this.cfr_renamed_2), new sprufk(arg0, arg1, sprnpk3.cfr_renamed_3, sprnpk3.cfr_renamed_4), arg2);
    }

    public sprlhk cfr_renamed_9960(sprmr arg0, int arg1, byte[] arg2, boolean arg3) {
        sprnpk sprnpk2 = this;
        sprnpk sprnpk3 = this;
        return new sprlhk(sprnpk2.cfr_renamed_0, sprnpk2.cfr_renamed_1.cfr_renamed_576(this.cfr_renamed_2), new sprjjk(arg0, arg1, arg2, sprnpk3.cfr_renamed_3, sprnpk3.cfr_renamed_4), arg3);
    }
}

