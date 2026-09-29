/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjvz;
import com.spire.presentation.packages.sprnu;
import com.spire.presentation.packages.sprqlaa;

public class sprtmk
implements sprnu {
    @Override
    public String cfr_renamed_2541(String arg0) {
        return this.cfr_renamed_2540(arg0);
    }

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
                    stringBuffer.replace(n3, n3 + 1, sprqlaa.cfr_renamed_9("\u0014z\u0004i"));
                    break;
                }
                case '>': {
                    int n4 = n;
                    stringBuffer.replace(n4, n4 + 1, sprjvz.cfr_renamed_9("\u0015\n\u0005\u001b"));
                    break;
                }
                case '(': {
                    int n5 = n;
                    stringBuffer.replace(n5, n5 + 1, sprqlaa.cfr_renamed_9("\u0014z\u0006i"));
                    break;
                }
                case ')': {
                    int n6 = n;
                    stringBuffer.replace(n6, n6 + 1, sprjvz.cfr_renamed_9("\u0015\n\u0007\u0018"));
                    break;
                }
                case '#': {
                    int n7 = n;
                    stringBuffer.replace(n7, n7 + 1, sprqlaa.cfr_renamed_9("\u0014z\u0001l"));
                    break;
                }
                case '&': {
                    int n8 = n;
                    stringBuffer.replace(n8, n8 + 1, sprjvz.cfr_renamed_9("\u0015\n\u0000\u0011"));
                    break;
                }
                case '\"': {
                    int n9 = n;
                    stringBuffer.replace(n9, n9 + 1, sprqlaa.cfr_renamed_9("\u0014z\u0001m"));
                    break;
                }
                case '\'': {
                    int n10 = n;
                    stringBuffer.replace(n10, n10 + 1, sprjvz.cfr_renamed_9("\u0015\n\u0000\u0010"));
                    break;
                }
                case '%': {
                    int n11 = n;
                    stringBuffer.replace(n11, n11 + 1, sprqlaa.cfr_renamed_9("\u0014z\u0001n"));
                    break;
                }
                case ';': {
                    int n12 = n;
                    stringBuffer.replace(n12, n12 + 1, sprjvz.cfr_renamed_9("\u0015\n\u0006\u0010"));
                    break;
                }
                case '+': {
                    int n13 = n;
                    stringBuffer.replace(n13, n13 + 1, sprqlaa.cfr_renamed_9("\u0014z\u0006j"));
                    break;
                }
                case '-': {
                    int n14 = n;
                    stringBuffer.replace(n14, n14 + 1, sprjvz.cfr_renamed_9("\u0015\n\u0007\u001c"));
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
}

