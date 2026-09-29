/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprali;
import com.spire.presentation.packages.sprhqp;
import com.spire.presentation.packages.sprpwp;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrgga;
import com.spire.presentation.packages.sprtea;

@sprtea
public class sprjvo {
    private /* synthetic */ sprjvo() {
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_17243(int arg0, int arg1) {
        if (sprhqp.cfr_renamed_17244(19, arg1)) {
            return "e";
        }
        switch (arg0) {
            case -1: 
            case 1: {
                return sprali.cfr_renamed_9("X\u001f");
            }
            case 0: {
                return "";
            }
        }
        return "e";
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 4 << 4 ^ (3 << 2 ^ 1);
        int cfr_ignored_0 = (3 ^ 5) << 4 ^ 3 << 1;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ 4 << 1;
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

    @sprtea
    public static String cfr_renamed_17245(int arg0) {
        Object[] objectArray = new Object[2];
        objectArray[0] = arg0;
        objectArray[1] = sprjvo.cfr_renamed_17246(arg0);
        return sprraia.cfr_renamed_11562(sprpwp.cfr_renamed_9("4\u00012J~L"), objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_17246(int arg0) {
        int n = sprrgga.cfr_renamed_6433(arg0) % 100;
        if (n < 4 || n > 20) {
            switch (n % 10) {
                case 1: {
                    return "st";
                }
                case 2: {
                    return sprali.cfr_renamed_9("S\t");
                }
                case 3: {
                    return "rd";
                }
            }
        }
        return sprpwp.cfr_renamed_9(";Y");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_17247(int arg0) {
        if (arg0 == 0) {
            return sprali.cfr_renamed_9("I\b");
        }
        switch (sprrgga.cfr_renamed_6433(arg0) % 100) {
            case 0: {
                return sprpwp.cfr_renamed_9("*_+T");
            }
            case 1: {
                return sprali.cfr_renamed_9("\u001eI\b");
            }
            case 2: {
                return sprpwp.cfr_renamed_9("!U*_");
            }
            case 3: {
                return sprali.cfr_renamed_9("\tW\b");
            }
            case 4: {
                return sprpwp.cfr_renamed_9("C+T");
            }
            case 5: 
            case 6: 
            case 11: 
            case 12: 
            case 30: {
                return sprali.cfr_renamed_9("I\b");
            }
        }
        return sprpwp.cfr_renamed_9("_+T");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_17248(int arg0) {
        int n = sprrgga.cfr_renamed_6433(arg0) % 100;
        if (n < 10 || n > 20) {
            switch (n % 10) {
                case 1: 
                case 2: {
                    return sprali.cfr_renamed_9("\u0007\f");
                }
            }
        }
        return sprpwp.cfr_renamed_9("uT");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_17249(int arg0) {
        switch (sprrgga.cfr_renamed_6433(arg0)) {
            case 1: 
            case 3: {
                return "r";
            }
            case 2: {
                return "n";
            }
            case 4: {
                return "t";
            }
            case 14: {
                return sprali.cfr_renamed_9("\u00d5\u0005");
            }
        }
        return sprpwp.cfr_renamed_9("\u00d9");
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_17250(int arg0, int arg1) {
        int n = arg1;
        switch (sprjvo.cfr_renamed_17251(n)) {
            case 0: {
                return sprjvo.cfr_renamed_17246(arg0);
            }
            case 1: {
                return ".";
            }
            case 2: {
                return sprali.cfr_renamed_9("\u00d7");
            }
            case 3: {
                return sprjvo.cfr_renamed_17243(arg0, n);
            }
            case 4: {
                return sprpwp.cfr_renamed_9("b\u0408");
            }
            case 5: {
                return sprali.cfr_renamed_9("\u00dd");
            }
            case 6: {
                return sprpwp.cfr_renamed_9("\u038e");
            }
            case 7: {
                return sprjvo.cfr_renamed_17247(arg0);
            }
            case 8: {
                return sprjvo.cfr_renamed_17248(arg0);
            }
            case 9: {
                return sprjvo.cfr_renamed_17249(arg0);
            }
        }
        throw new IllegalArgumentException();
    }

    @sprtea
    public static String cfr_renamed_17252(int arg0, int arg1) {
        Object[] objectArray = new Object[2];
        objectArray[0] = arg0;
        objectArray[1] = sprjvo.cfr_renamed_17250(arg0, arg1);
        return sprraia.cfr_renamed_11562(sprali.cfr_renamed_9("F]@\u0016\f\u0010"), objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ int cfr_renamed_17251(int arg0) {
        switch (arg0) {
            case 5: 
            case 7: 
            case 11: 
            case 14: 
            case 20: 
            case 21: 
            case 26: 
            case 31: 
            case 36: 
            case 37: 
            case 45: 
            case 1029: 
            case 1031: 
            case 1035: 
            case 1038: 
            case 1044: 
            case 1045: 
            case 1050: 
            case 1055: 
            case 1060: 
            case 1061: 
            case 1069: 
            case 2055: 
            case 2068: 
            case 2074: 
            case 3079: 
            case 3098: 
            case 4103: 
            case 4122: 
            case 5127: 
            case 5146: 
            case 6170: 
            case 7194: 
            case 8218: 
            case 31770: {
                return 1;
            }
            case 10: 
            case 22: 
            case 1034: 
            case 1046: 
            case 2058: 
            case 2070: 
            case 3082: 
            case 4106: 
            case 5130: 
            case 6154: 
            case 7178: 
            case 8202: 
            case 9226: 
            case 10250: 
            case 11274: 
            case 12298: 
            case 13322: 
            case 14346: 
            case 15370: 
            case 16394: 
            case 17418: 
            case 18442: 
            case 19466: 
            case 20490: {
                return 2;
            }
            case 12: 
            case 19: 
            case 1036: 
            case 1043: 
            case 2060: 
            case 2067: 
            case 3084: 
            case 4108: 
            case 5132: 
            case 6156: 
            case 7180: 
            case 8204: 
            case 9228: 
            case 10252: 
            case 11276: 
            case 12300: 
            case 13324: 
            case 14348: 
            case 15372: {
                return 3;
            }
            case 3: 
            case 1027: {
                return 9;
            }
            case 6: 
            case 1030: {
                return 7;
            }
            case 8: 
            case 1032: {
                return 6;
            }
            case 16: 
            case 1040: 
            case 2064: {
                return 5;
            }
            case 25: 
            case 1049: 
            case 2073: {
                return 4;
            }
            case 29: 
            case 1053: 
            case 2077: {
                return 8;
            }
        }
        return 0;
    }
}

