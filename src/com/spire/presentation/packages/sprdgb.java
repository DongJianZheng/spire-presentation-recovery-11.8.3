/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbbe;
import com.spire.presentation.packages.sprbjk;
import com.spire.presentation.packages.sprbsa;
import com.spire.presentation.packages.sprfa;
import com.spire.presentation.packages.sprfxa;
import com.spire.presentation.packages.sprmke;
import com.spire.presentation.packages.sprqwd;
import com.spire.presentation.packages.sprua;
import com.spire.presentation.packages.sprvva;
import com.spire.presentation.packages.sprxbc;
import java.io.ByteArrayInputStream;
import java.io.IOException;

public class sprdgb {
    private sprbbe cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private static /* synthetic */ sprbbe cfr_renamed_1443(byte[] arg0) throws IOException {
        try {
            return sprbbe.cfr_renamed_23(sprvva.cfr_renamed_184(arg0));
        }
        catch (ClassCastException classCastException) {
            throw new sprqwd(new StringBuilder().insert(0, sprxbc.cfr_renamed_9("\u0000/\u0001(\u0002<\u0000+\tn\t/\u0019/Wn")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprqwd(new StringBuilder().insert(0, sprbjk.cfr_renamed_9("1R0U3A1V8\u00138R(Rf\u0013")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
    }

    public sprbbe cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprdgb(sprbbe sprbbe2) {
        this.cfr_renamed_4 = sprbbe2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 4;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ 4;
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
    public sprmke cfr_renamed_1444(sprua arg0) throws sprfxa {
        try {
            sprfa sprfa2 = arg0.cfr_renamed_578(this.cfr_renamed_4.cfr_renamed_1445());
            ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(this.cfr_renamed_4.cfr_renamed_1446());
            return sprmke.cfr_renamed_23(sprbsa.cfr_renamed_471(sprfa2.cfr_renamed_1447(byteArrayInputStream)));
        }
        catch (Exception exception) {
            throw new sprfxa(new StringBuilder().insert(0, sprxbc.cfr_renamed_9(";\u0003/\u000f\"\bn\u0019!M<\b/\tn\b \u000e<\u0014>\u0019+\tn\t/\u0019/Wn")).append(exception.getMessage()).toString(), exception);
        }
    }

    public sprdgb(byte[] arg0) throws IOException {
        this(sprdgb.cfr_renamed_1443(arg0));
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }
}

