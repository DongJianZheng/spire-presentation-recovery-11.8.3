/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprtw;
import com.spire.presentation.packages.spruu;
import java.security.cert.X509Certificate;
import javax.security.auth.x500.X500Principal;

public class sprlrl {
    private static /* synthetic */ byte[] cfr_renamed_10931(X500Principal arg0) {
        return sprlrl.cfr_renamed_9124(arg0).getEncoded();
    }

    public static sprnbm cfr_renamed_9123(spruu arg0, X500Principal arg1) {
        return sprnbm.cfr_renamed_9063(arg0, sprlrl.cfr_renamed_10931(arg1));
    }

    private static /* synthetic */ X500Principal cfr_renamed_9124(X500Principal arg0) {
        if (null == arg0) {
            throw new IllegalStateException();
        }
        return arg0;
    }

    public static sprnbm cfr_renamed_10932(spruu arg0, X509Certificate arg1) {
        if (arg1 instanceof sprtw) {
            return sprnbm.cfr_renamed_9063(arg0, sprlrl.cfr_renamed_9117(((sprtw)((Object)arg1)).cfr_renamed_9118()));
        }
        return sprlrl.cfr_renamed_9123(arg0, arg1.getIssuerX500Principal());
    }

    public static sprnbm cfr_renamed_7314(X500Principal arg0) {
        return sprnbm.cfr_renamed_23(sprlrl.cfr_renamed_10931(arg0));
    }

    public static sprnbm cfr_renamed_4320(X509Certificate arg0) {
        if (arg0 instanceof sprtw) {
            return sprlrl.cfr_renamed_9117(((sprtw)((Object)arg0)).cfr_renamed_9118());
        }
        return sprlrl.cfr_renamed_7314(arg0.getIssuerX500Principal());
    }

    public static sprnbm cfr_renamed_10933(spruu arg0, X509Certificate arg1) {
        if (arg1 instanceof sprtw) {
            return sprnbm.cfr_renamed_9063(arg0, sprlrl.cfr_renamed_9117(((sprtw)((Object)arg1)).cfr_renamed_9122()));
        }
        return sprlrl.cfr_renamed_9123(arg0, arg1.getSubjectX500Principal());
    }

    public static String cfr_renamed_9(String string) {
        String s;
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 1;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ (3 << 2 ^ 1);
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

    private static /* synthetic */ sprnbm cfr_renamed_9117(sprnbm arg0) {
        if (null == arg0) {
            throw new IllegalStateException();
        }
        return arg0;
    }

    public static sprnbm cfr_renamed_4322(X509Certificate arg0) {
        if (arg0 instanceof sprtw) {
            return sprlrl.cfr_renamed_9117(((sprtw)((Object)arg0)).cfr_renamed_9122());
        }
        return sprlrl.cfr_renamed_7314(arg0.getSubjectX500Principal());
    }
}

