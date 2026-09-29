/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraqy;
import com.spire.presentation.packages.sprgeh;
import com.spire.presentation.packages.sprqc;

public class spruzc
implements sprqc {
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
                case '\'': {
                    int n3 = n++;
                    stringBuffer.replace(n3, n3 + 1, spraqy.cfr_renamed_9("et"));
                    break;
                }
                case '\"': {
                    int n4 = n++;
                    stringBuffer.replace(n4, n4 + 1, sprgeh.cfr_renamed_9("C\u0019"));
                    break;
                }
                case '=': {
                    int n5 = n++;
                    stringBuffer.replace(n5, n5 + 1, spraqy.cfr_renamed_9("en"));
                    break;
                }
                case '-': {
                    int n6 = n++;
                    stringBuffer.replace(n6, n6 + 1, sprgeh.cfr_renamed_9("C\u0016"));
                    break;
                }
                case '/': {
                    int n7 = n++;
                    stringBuffer.replace(n7, n7 + 1, spraqy.cfr_renamed_9("e|"));
                    break;
                }
                case '\\': {
                    int n8 = n++;
                    stringBuffer.replace(n8, n8 + 1, sprgeh.cfr_renamed_9("Cg"));
                    break;
                }
                case ';': {
                    int n9 = n++;
                    stringBuffer.replace(n9, n9 + 1, spraqy.cfr_renamed_9("eh"));
                    break;
                }
                case '\r': {
                    int n10 = n++;
                    stringBuffer.replace(n10, n10 + 1, sprgeh.cfr_renamed_9("CI"));
                    break;
                }
                case '\n': {
                    int n11 = n++;
                    stringBuffer.replace(n11, n11 + 1, spraqy.cfr_renamed_9("e="));
                    break;
                }
            }
            n2 = ++n;
        }
        return stringBuffer.toString();
    }

    @Override
    public String cfr_renamed_2541(String arg0) {
        return this.cfr_renamed_2540(arg0);
    }
}

