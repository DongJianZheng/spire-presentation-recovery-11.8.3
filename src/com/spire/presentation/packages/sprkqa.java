/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhva;
import com.spire.presentation.packages.sprkfz;
import com.spire.presentation.packages.sprpoa;
import com.spire.presentation.packages.sprqna;
import com.spire.presentation.packages.sprqnja;
import com.spire.presentation.packages.sprzma;
import java.security.SecureRandom;

public class sprkqa {
    private int[] cfr_renamed_4;

    private /* synthetic */ boolean cfr_renamed_870(int[] arg0) {
        int n;
        int n2 = arg0.length;
        boolean[] blArray = new boolean[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            if (arg0[n] < 0 || arg0[n] >= n2 || blArray[arg0[n]]) {
                return false;
            }
            int n4 = arg0[n];
            blArray[n4] = true;
            n3 = ++n;
        }
        return true;
    }

    /*
     * WARNING - void declaration
     */
    public sprkqa(byte[] byArray) {
        int n;
        int n2;
        void arg0;
        if (byArray.length <= 4) {
            throw new IllegalArgumentException(sprkfz.cfr_renamed_9("B6]9G1OxN6H7O1E?"));
        }
        void v0 = arg0;
        int n3 = sprpoa.cfr_renamed_871((byte[])v0, 0);
        if (((void)v0).length != 4 + n3 * (n2 = sprzma.cfr_renamed_872(n3 - 1))) {
            throw new IllegalArgumentException(sprqnja.cfr_renamed_9("l\u001ds\u0012i\u001aaS`\u001df\u001ca\u001ak\u0014"));
        }
        this.cfr_renamed_4 = new int[n3];
        int n4 = n = 0;
        while (n4 < n3) {
            int n5 = n++;
            this.cfr_renamed_4[n5] = sprpoa.cfr_renamed_873((byte[])arg0, 4 + n5 * n2, n2);
            n4 = n;
        }
        sprkqa sprkqa2 = this;
        if (!sprkqa2.cfr_renamed_870(sprkqa2.cfr_renamed_4)) {
            throw new IllegalArgumentException(sprkfz.cfr_renamed_9("B6]9G1OxN6H7O1E?"));
        }
    }

    public boolean equals(Object arg0) {
        if (!(arg0 instanceof sprkqa)) {
            return false;
        }
        sprkqa sprkqa2 = (sprkqa)arg0;
        return sprhva.cfr_renamed_874(this.cfr_renamed_4, sprkqa2.cfr_renamed_4);
    }

    public int hashCode() {
        return this.cfr_renamed_4.hashCode();
    }

    public sprkqa cfr_renamed_875() {
        int n;
        sprkqa sprkqa2 = new sprkqa(this.cfr_renamed_4.length);
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 >= 0) {
            sprkqa2.cfr_renamed_4[this.cfr_renamed_4[n]] = n--;
            n2 = n;
        }
        return sprkqa2;
    }

    public int[] cfr_renamed_876() {
        return sprhva.cfr_renamed_535(this.cfr_renamed_4);
    }

    public byte[] cfr_renamed_91() {
        int n;
        int n2 = this.cfr_renamed_4.length;
        int n3 = sprzma.cfr_renamed_872(n2 - 1);
        byte[] byArray = new byte[4 + n2 * n3];
        sprpoa.cfr_renamed_877(n2, byArray, 0);
        int n4 = n = 0;
        while (n4 < n2) {
            int n5 = this.cfr_renamed_4[n];
            int n6 = n * n3;
            sprpoa.cfr_renamed_878(n5, byArray, 4 + n6, n3);
            n4 = ++n;
        }
        return byArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprkqa(int n, SecureRandom secureRandom) {
        int n2;
        int n3;
        void arg0;
        if (n <= 0) {
            throw new IllegalArgumentException(sprqnja.cfr_renamed_9("l\u001ds\u0012i\u001aaSi\u0016k\u0014q\u001b"));
        }
        this.cfr_renamed_4 = new int[arg0];
        int[] nArray = new int[arg0];
        int n4 = n3 = 0;
        while (n4 < arg0) {
            int n5 = n3++;
            nArray[n5] = n5;
            n4 = n3;
        }
        n3 = arg0;
        int n6 = n2 = 0;
        while (n6 < arg0) {
            void arg1;
            int n7 = sprqna.cfr_renamed_808((SecureRandom)arg1, n3);
            this.cfr_renamed_4[n2] = nArray[n7];
            nArray[n7] = nArray[--n3];
            n6 = ++n2;
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 3 ^ 3;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ (2 ^ 5) << 1;
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

    public sprkqa cfr_renamed_879(sprkqa arg0) {
        int n;
        if (arg0.cfr_renamed_4.length != this.cfr_renamed_4.length) {
            throw new IllegalArgumentException(sprkfz.cfr_renamed_9("4N6L,CxF1X5J,H0"));
        }
        sprkqa sprkqa2 = new sprkqa(this.cfr_renamed_4.length);
        int n2 = n = this.cfr_renamed_4.length - 1;
        while (n2 >= 0) {
            int n3 = n--;
            sprkqa2.cfr_renamed_4[n3] = this.cfr_renamed_4[arg0.cfr_renamed_4[n3]];
            n2 = n;
        }
        return sprkqa2;
    }

    /*
     * WARNING - void declaration
     */
    public sprkqa(int n) {
        void var2_2;
        void arg0;
        if (n <= 0) {
            throw new IllegalArgumentException(sprqnja.cfr_renamed_9("l\u001ds\u0012i\u001aaSi\u0016k\u0014q\u001b"));
        }
        this.cfr_renamed_4 = new int[arg0];
        void v0 = var2_2 = arg0 - true;
        while (v0 >= 0) {
            void v1 = var2_2--;
            this.cfr_renamed_4[v1] = v1;
            v0 = var2_2;
        }
    }

    public String toString() {
        int n;
        String string = new StringBuilder().insert(0, "[").append(this.cfr_renamed_4[0]).toString();
        int n2 = n = 1;
        while (n2 < this.cfr_renamed_4.length) {
            int n3 = this.cfr_renamed_4[n];
            string = new StringBuilder().insert(0, string).append(sprkfz.cfr_renamed_9("\u0007x")).append(n3).toString();
            n2 = ++n;
        }
        string = new StringBuilder().insert(0, string).append("]").toString();
        return string;
    }

    /*
     * WARNING - void declaration
     */
    public sprkqa(int[] nArray) {
        void arg0;
        sprkqa sprkqa2 = this;
        if (!sprkqa2.cfr_renamed_870(nArray)) {
            throw new IllegalArgumentException(sprqnja.cfr_renamed_9("\u0012w\u0001d\n%\u001avSk\u001cqSdSu\u0016w\u001ep\u0007d\u0007l\u001ckSs\u0016f\u0007j\u0001"));
        }
        this.cfr_renamed_4 = sprhva.cfr_renamed_535((int[])arg0);
    }
}

