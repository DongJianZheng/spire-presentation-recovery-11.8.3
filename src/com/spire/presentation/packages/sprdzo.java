/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.spreyo;
import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprjvo;
import com.spire.presentation.packages.sprlto;
import com.spire.presentation.packages.sprlxo;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrmy;
import com.spire.presentation.packages.sprrwo;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtkh;
import com.spire.presentation.packages.sprtuo;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.sprvfja;
import com.spire.presentation.packages.spryso;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprdzo {
    private static String[][] cfr_renamed_119;
    private static final char cfr_renamed_91 = 'm';
    private static final int cfr_renamed_0 = -1;
    private static final String cfr_renamed_1 = "\u0623\u0628\u062c\u062f\u0647\u0648\u0632\u062d\u0637\u064a\u0643\u0644\u0645\u0646\u0633\u0639\u0641\u0635\u0642\u0631\u0634\u062a\u062b\u062e\u0630\u0636\u063a\u0638";
    private static final int cfr_renamed_2 = 26;
    private static final int cfr_renamed_3 = 7;
    private static final String cfr_renamed_4 = "\u0623\u0628\u062a\u062b\u062c\u062d\u062e\u062f\u0630\u0631\u0632\u0633\u0634\u0635\u0636\u0637\u0638\u0639\u063a\u0641\u0642\u0643\u0644\u0645\u0646\u0647\u0648\u064a";

    private static /* synthetic */ String cfr_renamed_17253(int arg0) {
        int n;
        sprtvp sprtvp2 = sprlxo.cfr_renamed_17192(arg0, 3);
        StringBuilder stringBuilder = new StringBuilder();
        if (sprtvp2.cfr_renamed_11861() > 1) {
            int n2;
            int n3 = n2 = 0;
            while (n3 < sprtvp2.cfr_renamed_576(1)) {
                stringBuilder.append('m');
                n3 = ++n2;
            }
        }
        sprtvp sprtvp3 = sprlxo.cfr_renamed_17192(sprtvp2.cfr_renamed_576(0), 1);
        int n4 = n = sprtvp3.cfr_renamed_11861() - 1;
        while (n4 >= 0) {
            String[] stringArray = cfr_renamed_119[n];
            int n5 = sprtvp3.cfr_renamed_576(n);
            sprghha.cfr_renamed_12279(stringBuilder, stringArray[n5]);
            n4 = --n;
        }
        return stringBuilder.toString();
    }

    private /* synthetic */ sprdzo() {
    }

    public static String cfr_renamed_17254(int arg0) {
        if (arg0 < 0) {
            return null;
        }
        int n = 7;
        StringBuilder stringBuilder = new StringBuilder(sprtkh.cfr_renamed_9("/c:s;c1"));
        int n2 = arg0;
        while (n2 >= 0) {
            stringBuilder.setCharAt(--n, (char)(arg0 % 26 + 65));
            n2 = arg0 / 26 - 1;
        }
        int n3 = n;
        return stringBuilder.substring(n3, n3 + (7 - n3));
    }

    private static /* synthetic */ String cfr_renamed_17255(int arg0, int arg1, int arg2) {
        int n = arg0 - 1 + arg1;
        if (n >= arg1 && n <= arg2) {
            return Character.toString((char)n);
        }
        return sprdzo.cfr_renamed_17256(arg0);
    }

    private static /* synthetic */ String cfr_renamed_17257(int arg0) {
        int n;
        sprtvp sprtvp2 = sprlxo.cfr_renamed_17192(arg0, 1);
        StringBuilder stringBuilder = new StringBuilder();
        int n2 = n = sprtvp2.cfr_renamed_11861() - 1;
        while (n2 >= 0) {
            int n3 = sprtvp2.cfr_renamed_576(n);
            stringBuilder.append((char)(65296 + n3));
            n2 = --n;
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_17258(int arg0, int arg1, boolean arg2, int arg3) {
        switch (arg1) {
            case 21: {
                return sprtuo.cfr_renamed_17259(arg0);
            }
            case 1: {
                return sprdzo.cfr_renamed_17256(arg0);
            }
            case 15: {
                return sprdzo.cfr_renamed_17257(arg0);
            }
            case 27: {
                return "";
            }
            case 49: {
                return spreyo.cfr_renamed_17260(arg0);
            }
            case 51: {
                return spreyo.cfr_renamed_17261(arg0);
            }
            case 9: {
                return sprdzo.cfr_renamed_17262(arg0);
            }
            case 22: {
                return sprtuo.cfr_renamed_17263(arg0);
            }
            case 11: {
                return sprtuo.cfr_renamed_17264(arg0, 0);
            }
            case 12: {
                return sprtuo.cfr_renamed_17265(arg0);
            }
            case 23: {
                return sprebp.cfr_renamed_17202(arg0);
            }
            case 24: {
                return sprebp.cfr_renamed_17266(arg0);
            }
            case 25: {
                return sprebp.cfr_renamed_17267(arg0);
            }
            case 26: {
                return sprebp.cfr_renamed_17268(arg0);
            }
            case 5: {
                return sprdzo.cfr_renamed_17269(arg0, arg3);
            }
            case 3: {
                return sprdzo.cfr_renamed_17253(arg0);
            }
            case 62: {
                return sprdzo.cfr_renamed_17269(arg0, 1049);
            }
            case 7: {
                return spryso.cfr_renamed_17179(arg0, true, arg2, arg3);
            }
            case 19: {
                return sprdzo.cfr_renamed_17255(arg0, 9312, 9331);
            }
            case 61: {
                return sprdzo.cfr_renamed_17270(arg0);
            }
            case 6: {
                return sprjvo.cfr_renamed_17245(arg0);
            }
            case 8: {
                return spryso.cfr_renamed_17179(arg0, false, arg2, arg3);
            }
            case 4: {
                return sprdzo.cfr_renamed_17271(arg0, arg3);
            }
            case 2: {
                return sprdzo.cfr_renamed_17272(arg0);
            }
            case 63: {
                return sprdzo.cfr_renamed_17271(arg0, 1049);
            }
            case 10: {
                return sprdzo.cfr_renamed_17273(arg0, sprrmy.cfr_renamed_9("t\u2071\u207f\u00f6"));
            }
            case 38: 
            case 39: 
            case 41: 
            case 43: {
                return sprrwo.cfr_renamed_17274(arg0, arg1);
            }
            case 50: 
            case 52: {
                return sprdzo.cfr_renamed_17275(arg0, arg1);
            }
            case 34: {
                return sprlto.cfr_renamed_17174(arg0);
            }
            case 35: {
                return sprlto.cfr_renamed_17176(arg0);
            }
            case 36: {
                return sprlto.cfr_renamed_17175(arg0);
            }
            case 30: {
                return sprdzo.cfr_renamed_17255(arg0, 9352, 9371);
            }
            case 31: {
                return sprdzo.cfr_renamed_17255(arg0, 9332, 9351);
            }
            case 32: {
                return sprdzo.cfr_renamed_17276(arg0);
            }
            case 33: {
                return sprdzo.cfr_renamed_17255(arg0, 12832, 12841);
            }
            case 0: {
                return "";
            }
        }
        return sprdzo.cfr_renamed_17256(arg0);
    }

    static {
        String[][] stringArrayArray = new String[3][];
        String[] stringArray = new String[10];
        stringArray[0] = "";
        stringArray[1] = "i";
        stringArray[2] = sprrmy.cfr_renamed_9("78");
        stringArray[3] = sprtkh.cfr_renamed_9("\u0000R\u0000");
        stringArray[4] = sprrmy.cfr_renamed_9("7'");
        stringArray[5] = "v";
        stringArray[6] = sprtkh.cfr_renamed_9("M\u0000");
        stringArray[7] = sprrmy.cfr_renamed_9("'78");
        stringArray[8] = sprtkh.cfr_renamed_9("M\u0000R\u0000");
        stringArray[9] = sprrmy.cfr_renamed_9("7)");
        stringArrayArray[0] = stringArray;
        String[] stringArray2 = new String[10];
        stringArray2[0] = "";
        stringArray2[1] = "x";
        stringArray2[2] = sprtkh.cfr_renamed_9("C\u0011");
        stringArray2[3] = sprrmy.cfr_renamed_9(")&)");
        stringArray2[4] = sprtkh.cfr_renamed_9("C\u0005");
        stringArray2[5] = "l";
        stringArray2[6] = sprrmy.cfr_renamed_9("2)");
        stringArray2[7] = sprtkh.cfr_renamed_9("\u0005C\u0011");
        stringArray2[8] = sprrmy.cfr_renamed_9("2)&)");
        stringArray2[9] = sprtkh.cfr_renamed_9("C\n");
        stringArrayArray[1] = stringArray2;
        String[] stringArray3 = new String[10];
        stringArray3[0] = "";
        stringArray3[1] = "c";
        stringArray3[2] = sprrmy.cfr_renamed_9("=2");
        stringArray3[3] = sprtkh.cfr_renamed_9("\nX\n");
        stringArray3[4] = sprrmy.cfr_renamed_9("=5");
        stringArray3[5] = "d";
        stringArray3[6] = sprtkh.cfr_renamed_9("_\n");
        stringArray3[7] = sprrmy.cfr_renamed_9("5=2");
        stringArray3[8] = sprtkh.cfr_renamed_9("_\nX\n");
        stringArray3[9] = "cm";
        stringArrayArray[2] = stringArray3;
        cfr_renamed_119 = stringArrayArray;
    }

    @sprtea
    public static int cfr_renamed_17277(int arg0) {
        return (arg0 - 1) % 392 + 1;
    }

    private static /* synthetic */ String cfr_renamed_17273(int arg0, String arg1) {
        if (arg0 < 1) {
            return "";
        }
        int n = --arg0 / arg1.length();
        int n2 = arg0 - n * arg1.length();
        return sprraia.cfr_renamed_11844(arg1.charAt(n2), n + 1);
    }

    private static /* synthetic */ String cfr_renamed_17256(int arg0) {
        return Integer.toString(arg0);
    }

    private static /* synthetic */ String cfr_renamed_17269(int arg0, int arg1) {
        String string = sprdzo.cfr_renamed_17278(arg1, false);
        return sprdzo.cfr_renamed_17273(arg0, string);
    }

    private static /* synthetic */ String cfr_renamed_17270(int arg0) {
        Object[] objectArray = new Object[1];
        objectArray[0] = arg0;
        return sprraia.cfr_renamed_11562(sprtkh.cfr_renamed_9("D\u001b\u0012\u000b\u0014\u001bD"), objectArray);
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String cfr_renamed_17279(int arg0, int arg1, boolean arg2, int arg3) {
        switch (arg1) {
            case 6: {
                return sprjvo.cfr_renamed_17252(arg0, arg3);
            }
        }
        return sprdzo.cfr_renamed_17258(arg0, arg1, arg2, arg3);
    }

    public static int cfr_renamed_17280(String arg0) {
        int n;
        if (!sprznp.cfr_renamed_12328(arg0) || arg0.length() > 7) {
            return -1;
        }
        long l = 0L;
        int n2 = n = 0;
        while (n2 < arg0.length() - 1) {
            l += (long)(sprznp.cfr_renamed_17281(arg0.charAt(n)) + 1);
            l *= 26L;
            n2 = ++n;
        }
        String string = arg0;
        if ((l += (long)sprznp.cfr_renamed_17281(string.charAt(string.length() - 1))) > Integer.MAX_VALUE) {
            return -1;
        }
        return (int)l;
    }

    private static /* synthetic */ String cfr_renamed_17272(int arg0) {
        return sprraia.cfr_renamed_12830(sprdzo.cfr_renamed_17253(arg0));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_17278(int arg0, boolean arg1) {
        boolean bl;
        String string;
        switch (arg0) {
            case 1049: {
                string = sprrmy.cfr_renamed_9("\u0461\u046f\u0463\u046d\u0465\u046b\u0467\u0469\u0469\u0464\u046a\u0462\u046c\u0460\u046e\u041e\u0410\u041c\u0412\u041a\u0414\u0418\u0416\u0416\u0418\u0415\u041c\u0410\u041e");
                bl = arg1;
                break;
            }
            case 1055: {
                string = sprtkh.cfr_renamed_9("\bY\n\u00dc\r^\u000f\\\u0176S\u0158R\u0003P\u0005V\u0007T\u009fK\u001bH\u0136O\u001c\u00c7\u001fB\u0013");
                bl = arg1;
                break;
            }
            default: {
                arg0 = 1033;
                string = sprrmy.cfr_renamed_9("?3=5;7997;5=3?1!/#-%+'))'+");
                bl = arg1;
            }
        }
        if (bl) {
            return sprraia.cfr_renamed_17282(string, new sprvfja(arg0));
        }
        return string;
    }

    private static /* synthetic */ String cfr_renamed_17262(int arg0) {
        return sprebp.cfr_renamed_16885(arg0);
    }

    private static /* synthetic */ String cfr_renamed_17275(int arg0, int arg1) {
        if (arg0 <= 0) {
            return "";
        }
        String string = arg1 == 50 ? cfr_renamed_4 : cfr_renamed_1;
        arg0 = sprdzo.cfr_renamed_17277(arg0) - 1;
        String string2 = string;
        return sprraia.cfr_renamed_11844(string2.charAt(arg0 % string2.length()), arg0 / string.length() + 1);
    }

    private static /* synthetic */ String cfr_renamed_17271(int arg0, int arg1) {
        String string = sprdzo.cfr_renamed_17278(arg1, true);
        return sprdzo.cfr_renamed_17273(arg0, string);
    }
}

