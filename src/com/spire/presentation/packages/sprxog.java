/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdkg;
import com.spire.presentation.packages.sprlwy;
import com.spire.presentation.packages.sprtl;

public class sprxog
implements sprtl {
    /*
     * Enabled aggressive block sorting
     */
    @Override
    public String cfr_renamed_2540(String arg0) {
        int n;
        StringBuffer stringBuffer = new StringBuffer(arg0);
        int n2 = n = 0;
        while (n2 < stringBuffer.length()) {
            switch (stringBuffer.charAt(n)) {
                case '<': {
                    int n3 = n;
                    stringBuffer.replace(n3, n3 + 1, sprdkg.cfr_renamed_9("yMi^"));
                    break;
                }
                case '>': {
                    int n4 = n;
                    stringBuffer.replace(n4, n4 + 1, sprlwy.cfr_renamed_9("\u0010F\u0000W"));
                    break;
                }
                case '(': {
                    int n5 = n;
                    stringBuffer.replace(n5, n5 + 1, sprdkg.cfr_renamed_9("yMk^"));
                    break;
                }
                case ')': {
                    int n6 = n;
                    stringBuffer.replace(n6, n6 + 1, sprlwy.cfr_renamed_9("\u0010F\u0002T"));
                    break;
                }
                case '#': {
                    int n7 = n;
                    stringBuffer.replace(n7, n7 + 1, sprdkg.cfr_renamed_9("yMl["));
                    break;
                }
                case '&': {
                    int n8 = n;
                    stringBuffer.replace(n8, n8 + 1, sprlwy.cfr_renamed_9("\u0010F\u0005]"));
                    break;
                }
                case '\"': {
                    int n9 = n;
                    stringBuffer.replace(n9, n9 + 1, sprdkg.cfr_renamed_9("yMlZ"));
                    break;
                }
                case '\'': {
                    int n10 = n;
                    stringBuffer.replace(n10, n10 + 1, sprlwy.cfr_renamed_9("\u0010F\u0005\\"));
                    break;
                }
                case '%': {
                    int n11 = n;
                    stringBuffer.replace(n11, n11 + 1, sprdkg.cfr_renamed_9("yMlY"));
                    break;
                }
                case ';': {
                    int n12 = n;
                    stringBuffer.replace(n12, n12 + 1, sprlwy.cfr_renamed_9("\u0010F\u0003\\"));
                    break;
                }
                case '+': {
                    int n13 = n;
                    stringBuffer.replace(n13, n13 + 1, sprdkg.cfr_renamed_9("yMk]"));
                    break;
                }
                case '-': {
                    int n14 = n;
                    stringBuffer.replace(n14, n14 + 1, sprlwy.cfr_renamed_9("\u0010F\u0002P"));
                    break;
                }
                default: {
                    n -= 3;
                }
            }
            n2 = n += 4;
        }
        return stringBuffer.toString();
    }

    @Override
    public String cfr_renamed_2541(String arg0) {
        return this.cfr_renamed_2540(arg0);
    }
}

