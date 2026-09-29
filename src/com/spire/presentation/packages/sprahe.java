/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcfe;
import com.spire.presentation.packages.sprfpd;
import com.spire.presentation.packages.sprnae;
import com.spire.presentation.packages.sprpie;
import com.spire.presentation.packages.sprsie;
import com.spire.presentation.packages.sprtzd;
import java.util.Enumeration;
import java.util.Vector;

public class sprahe {
    private static /* synthetic */ void cfr_renamed_4442(Vector arg0, Enumeration arg1) {
        Enumeration enumeration = arg1;
        while (enumeration.hasMoreElements()) {
            Enumeration enumeration2 = arg1;
            enumeration = enumeration2;
            arg0.addElement(enumeration2.nextElement());
        }
    }

    public static sprtzd cfr_renamed_2103(String arg0) {
        sprtzd sprtzd2 = sprpie.cfr_renamed_2103(arg0);
        if (sprtzd2 == null) {
            sprtzd2 = sprsie.cfr_renamed_2103(arg0);
        }
        if (sprtzd2 == null) {
            sprtzd2 = sprcfe.cfr_renamed_2103(arg0);
        }
        if (sprtzd2 == null) {
            sprtzd2 = sprnae.cfr_renamed_2103(arg0);
        }
        return sprtzd2;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 5 << 4 ^ (3 << 2 ^ 3);
        int cfr_ignored_0 = (2 ^ 5) << 3;
        int n4 = n2;
        int n5 = 5 << 4 ^ 5 << 1;
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

    public static Enumeration cfr_renamed_289() {
        Vector vector = new Vector();
        sprahe.cfr_renamed_4442(vector, sprpie.cfr_renamed_289());
        sprahe.cfr_renamed_4442(vector, sprsie.cfr_renamed_289());
        sprahe.cfr_renamed_4442(vector, sprnae.cfr_renamed_289());
        sprahe.cfr_renamed_4442(vector, sprcfe.cfr_renamed_289());
        return vector.elements();
    }

    public static sprfpd cfr_renamed_1837(String arg0) {
        sprfpd sprfpd2 = sprpie.cfr_renamed_1837(arg0);
        if (sprfpd2 == null) {
            sprfpd2 = sprsie.cfr_renamed_1837(arg0);
        }
        if (sprfpd2 == null) {
            sprfpd2 = sprcfe.cfr_renamed_1837(arg0);
        }
        if (sprfpd2 == null) {
            sprfpd2 = sprnae.cfr_renamed_1837(arg0);
        }
        return sprfpd2;
    }

    public static sprfpd cfr_renamed_2102(sprtzd arg0) {
        sprfpd sprfpd2 = sprpie.cfr_renamed_2102(arg0);
        if (sprfpd2 == null) {
            sprfpd2 = sprsie.cfr_renamed_2102(arg0);
        }
        if (sprfpd2 == null) {
            sprfpd2 = sprcfe.cfr_renamed_2102(arg0);
        }
        return sprfpd2;
    }
}

