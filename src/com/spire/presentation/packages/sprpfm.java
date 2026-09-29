/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmbm;
import com.spire.presentation.packages.sproug;
import com.spire.presentation.packages.sprvgp;
import com.spire.presentation.packages.spryim;
import com.spire.presentation.packages.sprzuo;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class sprpfm {
    private Vector cfr_renamed_3;
    private Hashtable cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void cfr_renamed_4998(sprlem arg0, boolean arg1, sprco arg2) {
        try {
            this.cfr_renamed_5013(arg0, arg1, arg2.cfr_renamed_119().cfr_renamed_104("DER"));
            return;
        }
        catch (IOException iOException) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprvgp.cfr_renamed_9("\u000b\u0018\u001c\u0005\u001cJ\u000b\u0004\r\u0005\n\u0003\u0000\rN\u001c\u000f\u0006\u001b\u000fTJ")).append(iOException).toString());
        }
    }

    public sprpfm() {
        sprpfm sprpfm2 = this;
        this.cfr_renamed_4 = new Hashtable();
        sprpfm2.cfr_renamed_3 = new Vector();
    }

    public sprmbm cfr_renamed_31() {
        sprpfm sprpfm2 = this;
        return new sprmbm(sprpfm2.cfr_renamed_3, sprpfm2.cfr_renamed_4);
    }

    public void cfr_renamed_41() {
        sprpfm sprpfm2 = this;
        sprpfm2.cfr_renamed_4 = new Hashtable();
        sprpfm2.cfr_renamed_3 = new Vector();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ 3;
        int cfr_ignored_0 = 3 << 3 ^ 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
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

    public void cfr_renamed_5013(sprlem arg0, boolean arg1, byte[] arg2) {
        if (this.cfr_renamed_4.containsKey(arg0)) {
            throw new IllegalArgumentException(new StringBuilder().insert(0, sprzuo.cfr_renamed_9("5\u0016$\u000b>\u001d9\u0001>N")).append(arg0).append(sprvgp.cfr_renamed_9("N\u000b\u0002\u0018\u000b\u000b\n\u0013N\u000b\n\u000e\u000b\u000e")).toString());
        }
        sprpfm sprpfm2 = this;
        sprpfm2.cfr_renamed_3.addElement(arg0);
        sprpfm2.cfr_renamed_4.put(arg0, new spryim(arg1, (sproug)new sprfvg(arg2)));
    }

    public boolean cfr_renamed_29() {
        return this.cfr_renamed_3.isEmpty();
    }
}

