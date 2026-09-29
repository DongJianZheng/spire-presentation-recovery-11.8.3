/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprjto;
import com.spire.presentation.packages.sprqmk;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;
import com.spire.presentation.packages.sprwbf;

@sprtea
public class sprtso
extends sprjto {
    private static String[] cfr_renamed_0;
    private static String[] cfr_renamed_1;
    private static String[] cfr_renamed_2;
    private static String[] cfr_renamed_3;
    private static String[] cfr_renamed_4;

    @Override
    public void cfr_renamed_17217(StringBuilder arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, sprtvp arg7, int arg8) {
        boolean bl = sprtso.cfr_renamed_17238(arg6, arg2, arg5);
        sprtso sprtso2 = this;
        sprtso2.cfr_renamed_17195(arg0, sprtso2.cfr_renamed_17206(arg1, arg6), bl);
    }

    @Override
    @sprtea
    public String cfr_renamed_17201() {
        return "a";
    }

    @Override
    @sprtea
    public String cfr_renamed_17187(boolean arg0) {
        if (arg0) {
            return sprqmk.cfr_renamed_9("ZGXS");
        }
        return sprwbf.cfr_renamed_9("Y4[5\u00ca");
    }

    private /* synthetic */ String cfr_renamed_17239(int arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            return cfr_renamed_3[arg0 - 1];
        }
        if (!arg2 && arg0 == 2) {
            return sprqmk.cfr_renamed_9("VB\u0129");
        }
        return this.cfr_renamed_17205(arg0, true);
    }

    @Override
    public String[] cfr_renamed_17203() {
        return cfr_renamed_1;
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @sprtea
    public boolean cfr_renamed_17197(boolean arg0, int arg1, sprtvp arg2, int arg3) {
        if (!super.cfr_renamed_17197(arg0, arg1, arg2, arg3)) {
            return false;
        }
        if (arg0) {
            return arg1 % 100 != 0;
        }
        switch (arg1 % 100) {
            case 10: 
            case 70: 
            case 80: {
                return false;
            }
        }
        return true;
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ String cfr_renamed_17231(int arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            return sprwbf.cfr_renamed_9("D5\u00ca");
        }
        if (arg2) {
            return sprwbf.cfr_renamed_9("D5X");
        }
        switch (arg0) {
            case 1: {
                return sprqmk.cfr_renamed_9("A@]");
            }
            case 2: {
                return sprwbf.cfr_renamed_9("D5\u012c");
            }
            case 3: 
            case 4: {
                return sprqmk.cfr_renamed_9("A@S");
            }
        }
        return "set";
    }

    /*
     * Enabled aggressive block sorting
     */
    @Override
    @sprtea
    public String cfr_renamed_17196(int arg0, boolean arg1, int arg2, sprtvp arg3) {
        switch (arg0) {
            case 1: {
                if (!arg1) {
                    return sprqmk.cfr_renamed_9("@[G\u00dfW\u00df");
                }
                switch (arg2) {
                    case 200: 
                    case 300: 
                    case 400: {
                        return sprwbf.cfr_renamed_9("5^2\u00da\"R");
                    }
                }
                int n = arg2 % 100;
                switch (arg2 % 10) {
                    case 2: 
                    case 3: 
                    case 4: {
                        if (n >= 10 && n <= 20) break;
                        return sprqmk.cfr_renamed_9("@[G\u00dfWW");
                    }
                }
                return sprwbf.cfr_renamed_9("C(D\u00acT");
            }
            case 2: {
                return sprqmk.cfr_renamed_9("_]^]\u00c1Z\u015d");
            }
            case 3: {
                return sprwbf.cfr_renamed_9(",^-^ E%V");
            }
        }
        throw new IllegalArgumentException(sprqmk.cfr_renamed_9("bU@U_QFQ@\u0014\\U_Q\b\u0014F\\]AAU\\P{ZVQJ"));
    }

    @Override
    public String[] cfr_renamed_17212() {
        return cfr_renamed_4;
    }

    static {
        String[] stringArray = new String[19];
        stringArray[0] = sprwbf.cfr_renamed_9("]$S/V");
        stringArray[1] = sprqmk.cfr_renamed_9("VBS");
        stringArray[2] = sprwbf.cfr_renamed_9("C\u0118^");
        stringArray[3] = sprqmk.cfr_renamed_9("\u013f@K\u016d[");
        stringArray[4] = sprwbf.cfr_renamed_9("G\u015aC");
        stringArray[5] = sprqmk.cfr_renamed_9("\u0155WGF");
        stringArray[6] = sprwbf.cfr_renamed_9("2R%Z");
        stringArray[7] = sprqmk.cfr_renamed_9("]G_");
        stringArray[8] = sprwbf.cfr_renamed_9("S$A\u015aC");
        stringArray[9] = sprqmk.cfr_renamed_9("VQAQF");
        stringArray[10] = sprwbf.cfr_renamed_9("+R%R/\u00d6\"C");
        stringArray[11] = sprqmk.cfr_renamed_9("VBSZ\u00d3WF");
        stringArray[12] = sprwbf.cfr_renamed_9("C\u0118^/\u00d6\"C");
        stringArray[13] = sprqmk.cfr_renamed_9("\u013f@@Z\u00d3WF");
        stringArray[14] = sprwbf.cfr_renamed_9("G C/\u00d6\"C");
        stringArray[15] = sprqmk.cfr_renamed_9("\u0155WGFZ\u00d3WF");
        stringArray[16] = sprwbf.cfr_renamed_9("2R%Z/\u00d6\"C");
        stringArray[17] = sprqmk.cfr_renamed_9("]G_Z\u00d3WF");
        stringArray[18] = sprwbf.cfr_renamed_9("%R7V5R/\u00d6\"C");
        cfr_renamed_4 = stringArray;
        String[] stringArray2 = new String[19];
        stringArray2[0] = sprqmk.cfr_renamed_9("BFDZ\u00df");
        stringArray2[1] = sprwbf.cfr_renamed_9("S3B)\u00ca");
        stringArray2[2] = sprqmk.cfr_renamed_9("F\u016dW@\u00df");
        stringArray2[3] = sprwbf.cfr_renamed_9("\u014cC7E5\u00ca");
        stringArray2[4] = sprqmk.cfr_renamed_9("D\u00d3@\u00cf");
        stringArray2[5] = sprwbf.cfr_renamed_9("\u0156$D5\u00ca");
        stringArray2[6] = sprqmk.cfr_renamed_9("AQVY\u00cf");
        stringArray2[7] = sprwbf.cfr_renamed_9(".D,\u00ca");
        stringArray2[8] = sprqmk.cfr_renamed_9("PWB\u00d3@\u00cf");
        stringArray2[9] = sprwbf.cfr_renamed_9("%R2\u00d65\u00ca");
        stringArray2[10] = sprqmk.cfr_renamed_9("XQVQ\\\u00d5Q@\u00cf");
        stringArray2[11] = sprwbf.cfr_renamed_9("%A Y\u00a0T5\u00ca");
        stringArray2[12] = sprqmk.cfr_renamed_9("@\u016b]\\\u00d5Q@\u00cf");
        stringArray2[13] = sprwbf.cfr_renamed_9("\u014cC3Y\u00a0T5\u00ca");
        stringArray2[14] = sprqmk.cfr_renamed_9("DS@\\\u00d5Q@\u00cf");
        stringArray2[15] = sprwbf.cfr_renamed_9("\u0156$D5Y\u00a0T5\u00ca");
        stringArray2[16] = sprqmk.cfr_renamed_9("AQVY\\\u00d5Q@\u00cf");
        stringArray2[17] = sprwbf.cfr_renamed_9(".D,Y\u00a0T5\u00ca");
        stringArray2[18] = sprqmk.cfr_renamed_9("VQDUFQ\\\u00d5Q@\u00cf");
        cfr_renamed_0 = stringArray2;
        String[] stringArray3 = new String[9];
        stringArray3[0] = "";
        stringArray3[1] = sprwbf.cfr_renamed_9("%A.B");
        stringArray3[2] = sprqmk.cfr_renamed_9("F\u016d\u00df");
        stringArray3[3] = sprwbf.cfr_renamed_9("\u014cC8\u016e");
        stringArray3[4] = sprqmk.cfr_renamed_9("D\u0129@[");
        stringArray3[5] = sprwbf.cfr_renamed_9("\u0156$D5^");
        stringArray3[6] = sprqmk.cfr_renamed_9("AQVY[");
        stringArray3[7] = sprwbf.cfr_renamed_9(".D,^");
        stringArray3[8] = sprqmk.cfr_renamed_9("PWB\u00df@[");
        cfr_renamed_3 = stringArray3;
        String[] stringArray4 = new String[8];
        stringArray4[0] = sprwbf.cfr_renamed_9("%A T$C");
        stringArray4[1] = sprqmk.cfr_renamed_9("@\u016b]QQF");
        stringArray4[2] = sprwbf.cfr_renamed_9("\u014cC8\u016e(T$C");
        stringArray4[3] = sprqmk.cfr_renamed_9("BUVQA\u00d5F");
        stringArray4[4] = sprwbf.cfr_renamed_9("\u0156$S$D\u00a0C");
        stringArray4[5] = sprqmk.cfr_renamed_9("AQVYVQA\u00d5F");
        stringArray4[6] = sprwbf.cfr_renamed_9(".D,S$D\u00a0C");
        stringArray4[7] = sprqmk.cfr_renamed_9("VQDUVQA\u00d5F");
        cfr_renamed_1 = stringArray4;
        String[] stringArray5 = new String[8];
        stringArray5[0] = sprwbf.cfr_renamed_9("S7V\"\u00d65\u00ca");
        stringArray5[1] = sprqmk.cfr_renamed_9("F\u016d[W\u00d3@\u00cf");
        stringArray5[2] = sprwbf.cfr_renamed_9("\u013a5N\u0118^\"\u00d65\u00ca");
        stringArray5[3] = sprqmk.cfr_renamed_9("DSPWG\u00d3@\u00cf");
        stringArray5[4] = sprwbf.cfr_renamed_9("\u0120R%R2\u00d65\u00ca");
        stringArray5[5] = sprqmk.cfr_renamed_9("GWP_PWG\u00d3@\u00cf");
        stringArray5[6] = sprwbf.cfr_renamed_9("X2Z%R2\u00d65\u00ca");
        stringArray5[7] = sprqmk.cfr_renamed_9("PWBSPWG\u00d3@\u00cf");
        cfr_renamed_2 = stringArray5;
    }

    @Override
    public String cfr_renamed_17211() {
        return "";
    }

    private static /* synthetic */ boolean cfr_renamed_17238(boolean arg0, int arg1, boolean arg2) {
        return !arg0 || arg1 == 0 || !arg2;
    }

    @Override
    public String[] cfr_renamed_17208() {
        return cfr_renamed_2;
    }

    @Override
    @sprtea
    public void cfr_renamed_16916(StringBuilder arg0, int arg1, boolean arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, sprtvp arg7, int arg8) {
        if (arg1 != 1 || arg6 && arg5) {
            this.cfr_renamed_17195(arg0, this.cfr_renamed_17239(arg1, arg6, arg5), true);
        }
        boolean bl = arg6 ? !arg5 : arg1 == 1;
        this.cfr_renamed_17195(arg0, sprtso.cfr_renamed_17231(arg1, arg6, arg5), bl);
    }

    @Override
    public String[] cfr_renamed_17210() {
        return cfr_renamed_0;
    }

    @Override
    @sprtea
    public boolean cfr_renamed_17193() {
        return false;
    }

    @Override
    public void cfr_renamed_17220(StringBuilder arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, sprtvp arg7, int arg8) {
        boolean bl = sprtso.cfr_renamed_17238(arg6, arg2, arg5);
        String string = this.cfr_renamed_17205(arg1, arg6);
        sprtso.cfr_renamed_17215(arg0, string, true, bl ? this.cfr_renamed_17207() : "");
    }

    @Override
    public String cfr_renamed_17204() {
        return " ";
    }

    @Override
    public void cfr_renamed_17213(StringBuilder arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, sprtvp arg8, int arg9) {
        boolean bl = sprtso.cfr_renamed_17238(arg7, arg3, arg6);
        String string = arg7 || !arg6 || arg1 != 7 && arg1 != 8 ? this.cfr_renamed_17207() : "";
        String string2 = new StringBuilder().insert(0, this.cfr_renamed_17206(arg1, arg7)).append(string).append(this.cfr_renamed_17205(arg2, arg7)).toString();
        sprtso.cfr_renamed_17215(arg0, string2, true, bl ? this.cfr_renamed_17207() : "");
    }
}

