/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprak;
import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprdsm;
import com.spire.presentation.packages.spret;
import com.spire.presentation.packages.sprfvg;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjvl;
import com.spire.presentation.packages.sprjwl;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprxmm;
import com.spire.presentation.packages.sprxxl;

public class spruwl {
    private sprddm cfr_renamed_119;
    private boolean cfr_renamed_91;
    private final sprve cfr_renamed_0;
    private sprak cfr_renamed_1;
    private sprak cfr_renamed_2;
    private sprlj cfr_renamed_3;
    private spret cfr_renamed_4;

    public spruwl cfr_renamed_10650(sprak arg0) {
        this.cfr_renamed_2 = arg0;
        return this;
    }

    private /* synthetic */ sprxxl cfr_renamed_10651(sprcf arg0, sprxmm arg1) throws sprhjg {
        sprjj sprjj2;
        spruwl spruwl2;
        if (this.cfr_renamed_119 != null) {
            spruwl spruwl3 = this;
            spruwl2 = spruwl3;
            sprjj2 = this.cfr_renamed_3.cfr_renamed_5279(spruwl3.cfr_renamed_119);
        } else {
            spruwl spruwl4 = this;
            spruwl2 = spruwl4;
            sprjj2 = spruwl4.cfr_renamed_3.cfr_renamed_5279(spruwl4.cfr_renamed_0.cfr_renamed_7475(arg0.cfr_renamed_615()));
        }
        if (spruwl2.cfr_renamed_91) {
            return new sprxxl(arg1, arg0, sprjj2.cfr_renamed_615(), this.cfr_renamed_4);
        }
        if (this.cfr_renamed_1 != null || this.cfr_renamed_2 != null) {
            if (this.cfr_renamed_1 == null) {
                spruwl spruwl5 = this;
                spruwl5.cfr_renamed_1 = new sprjvl();
            }
            spruwl spruwl6 = this;
            return new sprxxl(arg1, arg0, sprjj2, spruwl6.cfr_renamed_4, spruwl6.cfr_renamed_1, this.cfr_renamed_2);
        }
        return new sprxxl(arg1, arg0, sprjj2, this.cfr_renamed_4, new sprjvl(), null);
    }

    public spruwl cfr_renamed_10652(sprak arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 3;
        int cfr_ignored_0 = 4 << 4;
        int n4 = n2;
        int n5 = 4 << 3 ^ 1;
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

    public sprxxl cfr_renamed_10653(sprcf arg0, byte[] arg1) throws sprhjg {
        sprxmm sprxmm2 = new sprxmm(new sprfvg(arg1));
        return this.cfr_renamed_10651(arg0, sprxmm2);
    }

    /*
     * WARNING - void declaration
     */
    public spruwl(sprlj sprlj2, spret spret2) {
        void arg0;
        spruwl spruwl2 = this;
        spruwl spruwl3 = this;
        spruwl3.cfr_renamed_0 = new sprcog();
        spruwl2.cfr_renamed_3 = arg0;
        spruwl2.cfr_renamed_4 = spret2;
    }

    public spruwl cfr_renamed_3977(boolean arg0) {
        this.cfr_renamed_91 = arg0;
        return this;
    }

    public spruwl(sprlj arg0) {
        this(arg0, new sprjwl());
    }

    public spruwl cfr_renamed_10654(sprddm arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    public sprxxl cfr_renamed_10655(sprcf arg0, sprtpl arg1) throws sprhjg {
        sprxmm sprxmm2 = new sprxmm(new sprdsm(arg1.cfr_renamed_568()));
        sprxxl sprxxl2 = this.cfr_renamed_10651(arg0, sprxmm2);
        sprxxl2.cfr_renamed_10656(arg1);
        return sprxxl2;
    }
}

