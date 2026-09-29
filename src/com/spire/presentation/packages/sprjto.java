/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprghha;
import com.spire.presentation.packages.sprovja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtvp;

@sprtea
public abstract class sprjto {
    public String cfr_renamed_17205(int arg0, boolean arg1) {
        int n = arg0 - 1;
        if (arg1) {
            return this.cfr_renamed_17212()[n];
        }
        return this.cfr_renamed_17210()[n];
    }

    @sprtea
    public abstract String cfr_renamed_17187(boolean var1);

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (2 ^ 5) << 4 ^ 3;
        int cfr_ignored_0 = 3 << 3 ^ 3;
        int n4 = n2;
        int n5 = 2 << 3 ^ 2;
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

    public abstract String[] cfr_renamed_17203();

    @sprtea
    public void cfr_renamed_17198(StringBuilder arg0) {
        sprghha.cfr_renamed_12279(arg0, this.cfr_renamed_17211());
    }

    @sprtea
    public abstract void cfr_renamed_16916(StringBuilder var1, int var2, boolean var3, boolean var4, boolean var5, boolean var6, boolean var7, sprtvp var8, int var9);

    public abstract String[] cfr_renamed_17212();

    public void cfr_renamed_17213(StringBuilder arg0, int arg1, int arg2, int arg3, boolean arg4, boolean arg5, boolean arg6, boolean arg7, sprtvp arg8, int arg9) {
        boolean bl = this.cfr_renamed_17235(arg4, arg5);
        String string = arg4 || this.cfr_renamed_17229() ? this.cfr_renamed_17204() : this.cfr_renamed_17207();
        String string2 = !this.cfr_renamed_17229() ? new StringBuilder().insert(0, this.cfr_renamed_17206(arg1, arg4)).append(string).append(this.cfr_renamed_17205(arg2, arg4)).toString() : new StringBuilder().insert(0, this.cfr_renamed_17205(arg2, true)).append(string).append(this.cfr_renamed_17206(arg1, arg4)).toString();
        sprjto sprjto2 = this;
        sprjto.cfr_renamed_17215(arg0, string2, true, bl ? sprjto2.cfr_renamed_17221() : sprjto2.cfr_renamed_17207());
    }

    public void cfr_renamed_17220(StringBuilder arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, sprtvp arg7, int arg8) {
        boolean bl = this.cfr_renamed_17235(arg3, arg4);
        String string = arg1 == 1 && this.cfr_renamed_17229() && arg3 & !arg5 ? sprovja.cfr_renamed_9("*K!Q") : this.cfr_renamed_17205(arg1, arg3);
        sprjto sprjto2 = this;
        sprjto.cfr_renamed_17215(arg0, string, true, bl ? sprjto2.cfr_renamed_17204() : sprjto2.cfr_renamed_17207());
    }

    public abstract String cfr_renamed_17211();

    @sprtea
    public void cfr_renamed_17195(StringBuilder arg0, String arg1, boolean arg2) {
        sprjto.cfr_renamed_17215(arg0, arg1, arg2, this.cfr_renamed_17207());
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_17217(StringBuilder stringBuilder, int n, int n2, boolean bl, boolean bl2, boolean bl3, boolean bl4, sprtvp sprtvp2, int n3) {
        void arg3;
        void arg1;
        sprjto sprjto2 = this;
        sprjto2.cfr_renamed_17195(stringBuilder, sprjto2.cfr_renamed_17206((int)arg1, (boolean)arg3), true);
    }

    @sprtea
    public boolean cfr_renamed_17191() {
        return false;
    }

    @sprtea
    public abstract String cfr_renamed_17201();

    public String cfr_renamed_17221() {
        return " ";
    }

    @sprtea
    public String cfr_renamed_17189(int arg0, boolean arg1) {
        return "";
    }

    public abstract String[] cfr_renamed_17210();

    public static void cfr_renamed_17215(StringBuilder arg0, String arg1, boolean arg2, String arg3) {
        if (arg2 && arg0.length() != 0) {
            sprghha.cfr_renamed_12279(arg0, arg3);
        }
        sprghha.cfr_renamed_12279(arg0, arg1);
    }

    public String cfr_renamed_17206(int arg0, boolean arg1) {
        int n = arg0 - 2;
        if (arg1) {
            return this.cfr_renamed_17203()[n];
        }
        return this.cfr_renamed_17208()[n];
    }

    private /* synthetic */ boolean cfr_renamed_17235(boolean arg0, boolean arg1) {
        return arg1 && arg0 && !this.cfr_renamed_17229();
    }

    @sprtea
    public String cfr_renamed_17190(int arg0, boolean arg1) {
        return "";
    }

    @sprtea
    public abstract String cfr_renamed_17196(int var1, boolean var2, int var3, sprtvp var4);

    public boolean cfr_renamed_17229() {
        return false;
    }

    @sprtea
    public abstract boolean cfr_renamed_17193();

    @sprtea
    public boolean cfr_renamed_17194() {
        return false;
    }

    public static boolean cfr_renamed_17228(sprtvp arg0, int arg1) {
        int n;
        int n2 = n = 0;
        while (n2 < arg1) {
            if (arg0.cfr_renamed_576(n) != 0) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    public abstract String[] cfr_renamed_17208();

    public String cfr_renamed_17207() {
        return " ";
    }

    public String cfr_renamed_17204() {
        return "-";
    }

    @sprtea
    public void cfr_renamed_17178(StringBuilder arg0, int arg1, int arg2, boolean arg3, boolean arg4, boolean arg5, boolean arg6, sprtvp arg7, int arg8) {
        if (arg1 < 20) {
            if (arg1 > 0) {
                this.cfr_renamed_17220(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                return;
            }
        } else {
            int n;
            if ((arg1 -= 10 * (n = arg1 / 10)) == 0) {
                this.cfr_renamed_17217(arg0, n, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
                return;
            }
            this.cfr_renamed_17213(arg0, n, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @sprtea
    public boolean cfr_renamed_17197(boolean arg0, int arg1, sprtvp arg2, int arg3) {
        return arg0 || !this.cfr_renamed_17209(arg1);
    }

    @sprtea
    public boolean cfr_renamed_17209(int arg0) {
        return false;
    }
}

