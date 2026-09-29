/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprju;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprvan;
import java.io.IOException;

public class sprjvm {
    private sprlem cfr_renamed_3;
    private sprju cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprjvm(sprqp sprqp2) throws IOException {
        void arg0;
        this.cfr_renamed_3 = (sprlem)sprqp2.cfr_renamed_24();
        this.cfr_renamed_4 = (sprju)arg0.cfr_renamed_24();
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 3 ^ 2;
        int cfr_ignored_0 = 5 << 3 ^ 5;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 3 << 1;
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

    public sprco cfr_renamed_697(int arg0) throws IOException {
        if (this.cfr_renamed_4 != null) {
            return sprvan.cfr_renamed_11333(this.cfr_renamed_4, 0);
        }
        return null;
    }

    public sprlem cfr_renamed_696() {
        return this.cfr_renamed_3;
    }
}

