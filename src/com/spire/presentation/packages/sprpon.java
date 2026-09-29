/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprmbka;
import com.spire.presentation.packages.sprqjn;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprpon {
    private sprqjn[] cfr_renamed_3;
    private Integer[] cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprpon(Integer[] integerArray, sprqjn[] sprqjnArray) {
        void arg0;
        sprpon sprpon2 = this;
        sprpon2.cfr_renamed_4 = arg0;
        sprpon2.cfr_renamed_3 = sprqjnArray;
    }

    public String cfr_renamed_314() {
        sprpon[] sprponArray = new sprpon[1];
        sprponArray[0] = this;
        return sprpon.cfr_renamed_13077(sprponArray);
    }

    public int cfr_renamed_13078() {
        return this.cfr_renamed_13079().length;
    }

    public float cfr_renamed_13070(int arg0, float arg1) {
        int n;
        float f = 0.0f;
        sprqjn[] sprqjnArray = this.cfr_renamed_13027();
        int n2 = n = 0;
        while (n2 < sprqjnArray.length) {
            float f2 = sprqjnArray[n].cfr_renamed_13070(arg0, arg1);
            f += f2;
            n2 = ++n;
        }
        return f;
    }

    public sprqjn[] cfr_renamed_13027() {
        return this.cfr_renamed_3;
    }

    public Integer[] cfr_renamed_13079() {
        return this.cfr_renamed_4;
    }

    public sprpon cfr_renamed_12099() {
        int n;
        Integer[] integerArray = new Integer[this.cfr_renamed_13079().length];
        sprqjn[] sprqjnArray = new sprqjn[this.cfr_renamed_13027().length];
        System.arraycopy(this.cfr_renamed_13079(), 0, integerArray, 0, this.cfr_renamed_13079().length);
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_13027().length) {
            int n3 = n++;
            sprqjnArray[n3] = this.cfr_renamed_13027()[n3].cfr_renamed_12099();
            n2 = n;
        }
        return new sprpon(integerArray, sprqjnArray);
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 1 << 3 ^ 1;
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 2 << 1;
        int n4 = n2;
        int n5 = 1 << 3 ^ 2;
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

    public static String cfr_renamed_13077(sprpon[] arg0) {
        int n;
        StringBuilder stringBuilder = new StringBuilder(arg0.length);
        int n2 = n = 0;
        while (n2 < arg0.length) {
            int n3;
            Integer[] integerArray = arg0[n].cfr_renamed_13079();
            int n4 = integerArray.length;
            int n5 = n3 = 0;
            while (n5 < n4) {
                Integer n6 = integerArray[n3];
                sprghha.cfr_renamed_12279(stringBuilder, sprmbka.cfr_renamed_12396(n6));
                n5 = ++n3;
            }
            n2 = ++n;
        }
        return stringBuilder.toString();
    }
}

