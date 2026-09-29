/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.SaveToPdfOption;
import com.spire.presentation.packages.spradk;
import com.spire.presentation.packages.sprfqe;
import com.spire.presentation.packages.sprgo;
import com.spire.presentation.packages.sprrol;
import com.spire.presentation.packages.sprsci;
import com.spire.presentation.packages.sprvzj;
import com.spire.presentation.packages.sprwj;
import java.security.AccessController;
import java.security.SecureRandom;

public class sprztj
implements sprgo {
    public static void main(String[] arg0) throws Exception {
        System.setProperty(SaveToPdfOption.cfr_renamed_9("\r*\u0003k\u001d5\u00077\u000bk\u001e6\u0003*\n \u0002k\u001d \r0\u001c,\u001a<@!\u001c'\tk\u000b+\u001a7\u00015\u00176\u00010\u001c&\u000b"), "com.spire.presentation.packages.sprztj");
        sprsci sprsci2 = new sprsci();
        SecureRandom secureRandom = SecureRandom.getInstance(sprrol.cfr_renamed_9("MJON\\C]"), sprsci2);
        byte[] byArray = new byte[32];
        int n = 0;
        int n2 = n;
        while (n2 != 1024) {
            secureRandom.nextBytes(byArray);
            n2 = ++n;
        }
        System.err.println(sprfqe.cfr_renamed_503(byArray));
    }

    private static /* synthetic */ int cfr_renamed_9495(byte[] arg0) {
        return AccessController.doPrivileged(new sprvzj(arg0));
    }

    @Override
    public sprwj cfr_renamed_576(int arg0) {
        return new spradk(this, arg0);
    }

    public static /* synthetic */ int cfr_renamed_2550(byte[] arg0) {
        return sprztj.cfr_renamed_9495(arg0);
    }
}

