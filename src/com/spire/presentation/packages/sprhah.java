/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcyg;
import com.spire.presentation.packages.sprjas;
import com.spire.presentation.packages.sprkhi;
import com.spire.presentation.packages.sprkwg;
import com.spire.presentation.packages.sprmrg;
import com.spire.presentation.packages.sprrul;
import com.spire.presentation.packages.sprth;
import com.spire.presentation.packages.sprtqg;
import com.spire.presentation.packages.sprvah;
import com.spire.presentation.packages.sprxil;
import com.spire.presentation.packages.sprxug;
import java.security.Provider;

public class sprhah {
    private sprvah cfr_renamed_2;
    private sprth cfr_renamed_3;
    private sprcyg cfr_renamed_4;

    public sprhah cfr_renamed_1499(String arg0) {
        sprhah sprhah2 = this;
        this.cfr_renamed_4 = new sprcyg(new sprxil(arg0));
        sprhah2.cfr_renamed_2 = new sprvah(this.cfr_renamed_4);
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ (2 ^ 5);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 1 << 1;
        int n4 = n2;
        int n5 = 5 << 4;
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

    public sprhah() {
        sprhah sprhah2 = this;
        sprhah sprhah3 = this;
        sprhah2.cfr_renamed_4 = new sprcyg(new sprrul());
        sprhah2.cfr_renamed_2 = new sprvah(this.cfr_renamed_4);
        sprhah2.cfr_renamed_3 = null;
    }

    public sprhah(sprth sprth2) {
        sprhah sprhah2 = this;
        sprhah sprhah3 = this;
        sprhah2.cfr_renamed_4 = new sprcyg(new sprrul());
        sprhah2.cfr_renamed_2 = new sprvah(this.cfr_renamed_4);
        sprhah2.cfr_renamed_3 = sprth2;
    }

    public static /* synthetic */ sprvah cfr_renamed_7950(sprhah arg0) {
        return arg0.cfr_renamed_2;
    }

    public sprhah cfr_renamed_1498(Provider arg0) {
        sprhah sprhah2 = this;
        this.cfr_renamed_4 = new sprcyg(new sprkhi(arg0));
        sprhah2.cfr_renamed_2 = new sprvah(this.cfr_renamed_4);
        return this;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxug cfr_renamed_1480(char[] arg0) {
        if (this.cfr_renamed_3 == null) {
            try {
                this.cfr_renamed_3 = new sprmrg(this.cfr_renamed_4).cfr_renamed_1451();
            }
            catch (sprtqg sprtqg2) {
                throw new IllegalStateException(new StringBuilder().insert(0, sprjas.cfr_renamed_9("gLd@pQ#FbI`PoDwJq\u0005sWlSjAfW#FbKmJw\u0005a@#GvLoQ#RjQk\u0005`PqWfKw\u0005k@oUfW9\u0005")).append(sprtqg2.getMessage()).toString());
            }
        }
        sprhah sprhah2 = this;
        return new sprkwg(sprhah2, arg0, sprhah2.cfr_renamed_3);
    }

    public static /* synthetic */ sprcyg cfr_renamed_7951(sprhah arg0) {
        return arg0.cfr_renamed_4;
    }
}

