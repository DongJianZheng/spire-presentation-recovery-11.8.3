/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraem;
import com.spire.presentation.packages.sprapm;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprczx;
import com.spire.presentation.packages.sprgem;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprirm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlvm;
import com.spire.presentation.packages.sprosm;
import com.spire.presentation.packages.sprvgk;
import com.spire.presentation.packages.sprvr;
import com.spire.presentation.packages.sprzmk;
import com.spire.presentation.packages.sprzql;
import java.io.IOException;
import java.math.BigInteger;

public abstract class sprngk {
    public final sprapm cfr_renamed_2;
    private final sprgem cfr_renamed_3;
    private final sprzql cfr_renamed_4;

    public sprzmk cfr_renamed_9831(sprirm arg0) throws sprvgk {
        if (!this.cfr_renamed_3.cfr_renamed_29()) {
            sprngk sprngk2 = this;
            sprngk2.cfr_renamed_2.cfr_renamed_9837(sprngk2.cfr_renamed_3.cfr_renamed_31());
        }
        sprosm sprosm2 = new sprosm(this.cfr_renamed_2.cfr_renamed_1451(), arg0);
        return new sprzmk(new sprlvm(sprvr.cfr_renamed_4, sprosm2));
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) throws sprvgk {
        try {
            this.cfr_renamed_3.cfr_renamed_4998(arg0, arg1, arg2);
            return;
        }
        catch (IOException iOException) {
            throw new sprvgk(new StringBuilder().insert(0, sprczx.cfr_renamed_9("\u0012\u001b\u001f\u0014\u001e\u000eQ\u001f\u001f\u0019\u001e\u001e\u0014Z\u0014\u0002\u0005\u001f\u001f\t\u0018\u0015\u001f@Q")).append(iOException.getMessage()).toString(), iOException);
        }
    }

    public sprngk(sprapm sprapm2) {
        sprngk sprngk2 = this;
        sprngk sprngk3 = this;
        sprngk2.cfr_renamed_3 = new sprgem();
        sprngk2.cfr_renamed_4 = new sprzql();
        sprngk2.cfr_renamed_2 = sprapm2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 2;
        int cfr_ignored_0 = 5 << 3 ^ 3;
        int n4 = n2;
        int n5 = (2 ^ 5) << 4 ^ 1;
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

    public void cfr_renamed_9838(sprigm arg0) {
        this.cfr_renamed_2.cfr_renamed_9838(arg0);
    }

    public void cfr_renamed_9839(sprigm arg0) {
        this.cfr_renamed_2.cfr_renamed_9839(arg0);
    }

    public void cfr_renamed_2602(BigInteger arg0) {
        this.cfr_renamed_2.cfr_renamed_2602(arg0);
    }

    public void cfr_renamed_9840(spraem arg0) {
        this.cfr_renamed_2.cfr_renamed_9840(arg0);
    }

    public void cfr_renamed_9841(spraem arg0) {
        this.cfr_renamed_2.cfr_renamed_9841(arg0);
    }

    public void cfr_renamed_9842(sprigm arg0) {
        this.cfr_renamed_2.cfr_renamed_9842(arg0);
    }
}

