/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhjn;
import com.spire.presentation.packages.sprqrn;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprzlp;

@sprtea
public class sprmln {
    public static float cfr_renamed_13608(sprsuja arg0, sprsuja arg1, sprsuja arg2) {
        sprsuja sprsuja2 = arg0;
        float f = sprsuja2.cfr_renamed_1980() - 2.0f * arg1.cfr_renamed_1980() + arg2.cfr_renamed_1980();
        float f2 = sprsuja2.spr\u3181() - 2.0f * arg1.spr\u3181() + arg2.spr\u3181();
        if (f == 0.0f && f2 == 0.0f) {
            return (float)sprrgga.cfr_renamed_12687(sprzlp.cfr_renamed_13804(arg2.cfr_renamed_1980() - arg0.cfr_renamed_1980()) + sprzlp.cfr_renamed_13804(arg2.spr\u3181() - arg0.spr\u3181()));
        }
        float f3 = 2.0f * arg1.cfr_renamed_1980() - 2.0f * arg0.cfr_renamed_1980();
        float f4 = 2.0f * arg1.spr\u3181() - 2.0f * arg0.spr\u3181();
        float f5 = f;
        float f6 = f2;
        float f7 = 4.0f * (f5 * f5 + f6 * f6);
        float f8 = 4.0f * (f * f3 + f2 * f4);
        float f9 = f3;
        float f10 = f4;
        float f11 = f9 * f9 + f10 * f10;
        double d = 2.0 * sprrgga.cfr_renamed_12687(f7 + f8 + f11);
        double d2 = sprrgga.cfr_renamed_12687(f7);
        double d3 = (double)(2.0f * f7) * d2;
        double d4 = 2.0 * sprrgga.cfr_renamed_12687(f11);
        double d5 = (double)f8 / d2;
        float f12 = f8;
        return (float)((d3 * d + d2 * (double)f8 * (d - d4) + (double)(4.0f * f11 * f7 - f12 * f12) * sprrgga.cfr_renamed_904((2.0 * d2 + d5 + d) / (d5 + d4))) / (4.0 * d3));
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2;
        int cfr_ignored_0 = (2 ^ 5) << 4 ^ 5;
        int n4 = n2;
        int n5 = 5 << 4 ^ (3 ^ 5) << 1;
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

    public static sprqrn cfr_renamed_13803(sprsuja arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3) {
        return sprmln.cfr_renamed_13805(arg0, arg1, arg2, arg3, 4);
    }

    private /* synthetic */ sprmln() {
    }

    private static /* synthetic */ sprqrn cfr_renamed_13805(sprsuja arg0, sprsuja arg1, sprsuja arg2, sprsuja arg3, int arg4) {
        int n;
        int n2;
        sprhjn sprhjn2 = new sprhjn(arg4);
        sprhjn2.cfr_renamed_13806(arg0, arg1, arg2, arg3);
        int n3 = n2 = 1;
        while (n3 < arg4) {
            sprhjn2.cfr_renamed_13806(sprsuja.cfr_renamed_13377(), sprsuja.cfr_renamed_13377(), sprsuja.cfr_renamed_13377(), sprsuja.cfr_renamed_13377());
            n3 = ++n2;
        }
        n2 = arg4;
        int n4 = n = n2 / 2;
        while (n4 > 0) {
            int n5;
            int n6 = n5 = 0;
            while (n6 < arg4) {
                sprhjn sprhjn3 = sprhjn2;
                arg0 = sprhjn3.cfr_renamed_13602(n5);
                arg1 = sprhjn3.cfr_renamed_13797(n5);
                arg2 = sprhjn3.cfr_renamed_13798(n5);
                arg3 = sprhjn3.cfr_renamed_13604(n5);
                sprsuja sprsuja2 = sprmln.cfr_renamed_13807(arg0, arg1);
                sprsuja sprsuja3 = sprmln.cfr_renamed_13807(arg1, arg2);
                sprsuja sprsuja4 = sprmln.cfr_renamed_13807(arg2, arg3);
                sprsuja sprsuja5 = sprmln.cfr_renamed_13807(sprsuja2, sprsuja3);
                sprsuja sprsuja6 = sprmln.cfr_renamed_13807(sprsuja3, sprsuja4);
                sprsuja sprsuja7 = sprmln.cfr_renamed_13807(sprsuja5, sprsuja6);
                sprhjn3.cfr_renamed_12612(n5, sprsuja2);
                sprhjn3.cfr_renamed_12613(n5, sprsuja5);
                sprhjn3.cfr_renamed_12614(n5, sprsuja7);
                sprhjn3.cfr_renamed_12615(n5 + n, sprsuja7);
                sprhjn3.cfr_renamed_12612(n5 + n, sprsuja6);
                sprhjn3.cfr_renamed_12613(n5 + n, sprsuja4);
                sprhjn3.cfr_renamed_12614(n5 + n, arg3);
                n6 = n5 + n2;
            }
            n2 = n;
            n4 = n / 2;
        }
        return sprhjn2.cfr_renamed_13808();
    }

    @sprtea
    public static sprsuja cfr_renamed_13807(sprsuja arg0, sprsuja arg1) {
        return new sprsuja((arg0.cfr_renamed_1980() + arg1.cfr_renamed_1980()) / 2.0f, (arg0.spr\u3181() + arg1.spr\u3181()) / 2.0f);
    }
}

