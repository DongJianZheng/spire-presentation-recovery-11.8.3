/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprlbd;
import com.spire.presentation.packages.sprlxo;
import com.spire.presentation.packages.sprnnp;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public class sprrwo {
    private static final char cfr_renamed_112 = '\u4e07';
    private static final char cfr_renamed_119 = '\u842c';
    private static char[][] cfr_renamed_91;
    private static char[][] cfr_renamed_0;
    private static final char cfr_renamed_1 = '\u5341';
    private static final char cfr_renamed_2 = '\u96f6';
    private static final char cfr_renamed_3 = '\u3007';
    private static final char cfr_renamed_4 = '\u25cb';

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ char cfr_renamed_17285(int arg0, int arg1) {
        if (arg0 == 4) {
            return sprrwo.cfr_renamed_17286(arg1);
        }
        switch (arg1) {
            case 38: {
                return cfr_renamed_0[1][--arg0];
            }
            case 39: 
            case 43: {
                return cfr_renamed_91[1][--arg0];
            }
        }
        throw new IllegalArgumentException(sprlbd.cfr_renamed_9("&%\u0004%\u001b!\u0002!\u0004d\u0018%\u001b!Ld\u00181\u001b&\u00136%0\u000f(\u0013"));
    }

    private static /* synthetic */ String cfr_renamed_17287(int arg0, int arg1) {
        int n;
        if (arg0 == 0) {
            return "";
        }
        sprtvp sprtvp2 = sprlxo.cfr_renamed_17192(arg0, 1);
        StringBuilder stringBuilder = new StringBuilder();
        boolean bl = false;
        int n2 = n = sprtvp2.cfr_renamed_11861() - 1;
        while (n2 >= 0) {
            int n3 = sprtvp2.cfr_renamed_576(n);
            if (n3 == 0) {
                bl = true;
            } else {
                if (bl) {
                    stringBuilder.append(sprrwo.cfr_renamed_17288(arg1));
                    bl = false;
                }
                sprghha.cfr_renamed_12279(stringBuilder, sprrwo.cfr_renamed_17289(n3, n, arg0, arg1));
            }
            n2 = --n;
        }
        return stringBuilder.toString();
    }

    /*
     * Enabled aggressive block sorting
     */
    @sprtea
    public static String cfr_renamed_17274(int arg0, int arg1) {
        switch (arg1) {
            case 38: 
            case 39: 
            case 43: {
                return sprrwo.cfr_renamed_17287(arg0, arg1);
            }
            case 41: {
                return sprrwo.cfr_renamed_17290(arg0, arg1);
            }
        }
        throw new IllegalArgumentException(sprnnp.cfr_renamed_9("\u0018?:?%;<;:~&?%;r~&+%<-,\u001b*12-"));
    }

    private static /* synthetic */ String cfr_renamed_17289(int arg0, int arg1, int arg2, int arg3) {
        int n;
        int n2;
        StringBuilder stringBuilder = new StringBuilder();
        if (arg3 != 39 && arg3 != 43 || arg2 >= 20 || arg1 != 1) {
            stringBuilder.append(sprrwo.cfr_renamed_17291(arg0, arg3));
        }
        if ((n2 = arg1 % (n = 4)) != 0) {
            stringBuilder.append(sprrwo.cfr_renamed_17285(n2, arg3));
        }
        StringBuilder stringBuilder2 = stringBuilder;
        sprghha.cfr_renamed_16833(stringBuilder2, sprrwo.cfr_renamed_17286(arg3), arg1 / n);
        return stringBuilder2.toString();
    }

    static {
        char[][] cArrayArray = new char[2][];
        char[] cArray = new char[9];
        cArray[0] = 22777;
        cArray[1] = 36019;
        cArray[2] = 21443;
        cArray[3] = 32902;
        cArray[4] = 20237;
        cArray[5] = 38520;
        cArray[6] = 26578;
        cArray[7] = 25420;
        cArray[8] = 29590;
        cArrayArray[0] = cArray;
        char[] cArray2 = new char[3];
        cArray2[0] = 25342;
        cArray2[1] = 20336;
        cArray2[2] = 20191;
        cArrayArray[1] = cArray2;
        cfr_renamed_0 = cArrayArray;
        char[][] cArrayArray2 = new char[2][];
        char[] cArray3 = new char[9];
        cArray3[0] = 19968;
        cArray3[1] = 20108;
        cArray3[2] = 19977;
        cArray3[3] = 22235;
        cArray3[4] = 20116;
        cArray3[5] = 20845;
        cArray3[6] = 19971;
        cArray3[7] = 20843;
        cArray3[8] = 20061;
        cArrayArray2[0] = cArray3;
        char[] cArray4 = new char[3];
        cArray4[0] = 21313;
        cArray4[1] = 30334;
        cArray4[2] = 21315;
        cArrayArray2[1] = cArray4;
        cfr_renamed_91 = cArrayArray2;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ char cfr_renamed_17286(int arg0) {
        switch (arg0) {
            case 38: 
            case 39: {
                return '\u842c';
            }
            case 43: {
                return '\u4e07';
            }
        }
        throw new IllegalArgumentException(sprlbd.cfr_renamed_9("&%\u0004%\u001b!\u0002!\u0004d\u0018%\u001b!Ld\u00181\u001b&\u00136%0\u000f(\u0013"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ char cfr_renamed_17291(int arg0, int arg1) {
        if (arg0 == 0) {
            return sprrwo.cfr_renamed_17288(arg1);
        }
        switch (arg1) {
            case 38: {
                return cfr_renamed_0[0][--arg0];
            }
            case 39: 
            case 41: 
            case 43: {
                return cfr_renamed_91[0][--arg0];
            }
        }
        throw new IllegalArgumentException(sprnnp.cfr_renamed_9("\u0018?:?%;<;:~&?%;r~&+%<-,\u001b*12-"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ char cfr_renamed_17288(int arg0) {
        switch (arg0) {
            case 38: 
            case 39: {
                return '\u96f6';
            }
            case 43: {
                return '\u3007';
            }
            case 41: {
                return '\u25cb';
            }
        }
        throw new IllegalArgumentException(sprlbd.cfr_renamed_9("&%\u0004%\u001b!\u0002!\u0004d\u0018%\u001b!Ld\u00181\u001b&\u00136%0\u000f(\u0013"));
    }

    private static /* synthetic */ String cfr_renamed_17290(int arg0, int arg1) {
        StringBuilder stringBuilder;
        block5: {
            StringBuilder stringBuilder2;
            block7: {
                int n;
                sprtvp sprtvp2;
                block6: {
                    block4: {
                        if (arg0 == 0) {
                            return "";
                        }
                        if (arg0 < 10) {
                            return Character.toString(sprrwo.cfr_renamed_17291(arg0, arg1));
                        }
                        if (arg0 == 10) {
                            return Character.toString('\u5341');
                        }
                        sprtvp2 = sprlxo.cfr_renamed_17192(arg0, 1);
                        stringBuilder2 = new StringBuilder();
                        if (arg0 >= 20) break block4;
                        StringBuilder stringBuilder3 = stringBuilder2;
                        stringBuilder2.append('\u5341');
                        stringBuilder = stringBuilder3;
                        stringBuilder3.append(sprrwo.cfr_renamed_17291(sprtvp2.cfr_renamed_576(0), arg1));
                        break block5;
                    }
                    if (arg0 >= 100) break block6;
                    sprtvp sprtvp3 = sprtvp2;
                    stringBuilder2.append(sprrwo.cfr_renamed_17291(sprtvp3.cfr_renamed_576(1), arg1));
                    stringBuilder2.append('\u5341');
                    if (sprtvp3.cfr_renamed_576(0) == 0) break block7;
                    StringBuilder stringBuilder4 = stringBuilder2;
                    stringBuilder = stringBuilder4;
                    stringBuilder4.append(sprrwo.cfr_renamed_17291(sprtvp2.cfr_renamed_576(0), arg1));
                    break block5;
                }
                int n2 = n = sprtvp2.cfr_renamed_11861() - 1;
                while (n2 >= 0) {
                    int n3 = sprtvp2.cfr_renamed_576(n);
                    stringBuilder2.append(sprrwo.cfr_renamed_17291(n3, arg1));
                    n2 = --n;
                }
            }
            stringBuilder = stringBuilder2;
        }
        return stringBuilder.toString();
    }

    private /* synthetic */ sprrwo() {
    }
}

