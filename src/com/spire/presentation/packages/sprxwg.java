/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragg;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprirg;
import com.spire.presentation.packages.sprmsba;
import com.spire.presentation.packages.sprnj;
import com.spire.presentation.packages.sproe;
import com.spire.presentation.packages.sprog;
import com.spire.presentation.packages.sprqnl;
import java.io.IOException;

public class sprxwg {
    private final String cfr_renamed_1;
    private final byte[] cfr_renamed_2;
    private final sprnj cfr_renamed_3;
    private final byte[] cfr_renamed_4;

    public String cfr_renamed_7499() {
        return this.cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprirg cfr_renamed_7500(sprog arg0) throws IOException {
        try {
            sproe sproe2 = arg0.cfr_renamed_1600(this.cfr_renamed_1);
            sprxwg sprxwg2 = this;
            return this.cfr_renamed_3.cfr_renamed_1596(sproe2.cfr_renamed_123(sprxwg2.cfr_renamed_4, sprxwg2.cfr_renamed_2));
        }
        catch (IOException iOException) {
            throw iOException;
        }
        catch (sprhjg sprhjg2) {
            throw new spragg(new StringBuilder().insert(0, sprmsba.cfr_renamed_9("M\b@\u0007A\u001d\u000e\n\\\fO\u001dKIK\u0011Z\u001bO\nZ\u0000A\u0007\u000e\u0006^\f\\\bZ\u0006\\S\u000e")).append(sprhjg2.getMessage()).toString(), sprhjg2);
        }
        catch (Exception exception) {
            throw new spragg(new StringBuilder().insert(0, sprqnl.cfr_renamed_9("-A+\\8M!V&\u00198K'Z-J;P&^hR-@hI)P:\u0003h")).append(exception.getMessage()).toString(), exception);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprxwg(String string, byte[] byArray, byte[] byArray2, sprnj sprnj2) {
        void arg2;
        void arg1;
        void arg0;
        sprxwg sprxwg2 = this;
        sprxwg sprxwg3 = this;
        sprxwg3.cfr_renamed_1 = arg0;
        sprxwg3.cfr_renamed_2 = arg1;
        sprxwg2.cfr_renamed_4 = arg2;
        sprxwg2.cfr_renamed_3 = sprnj2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 2 << 3 ^ 2;
        int n4 = n2;
        int n5 = 3 << 3;
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
}

