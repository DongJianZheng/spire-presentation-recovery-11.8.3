/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralq;
import com.spire.presentation.packages.sprcip;
import com.spire.presentation.packages.sprdu;
import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.spreen;
import com.spire.presentation.packages.sprfbn;
import com.spire.presentation.packages.sprfvca;
import com.spire.presentation.packages.sprlnga;
import com.spire.presentation.packages.sprlzia;
import com.spire.presentation.packages.sprniga;
import com.spire.presentation.packages.sprnmga;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprsjo;
import com.spire.presentation.packages.sprszca;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprten;
import com.spire.presentation.packages.sprznp;

@sprtea
public class sprwmr {
    private boolean cfr_renamed_2;
    private boolean cfr_renamed_3;
    private sprlnga cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 3 << 1;
        int cfr_ignored_0 = 5 << 4 ^ 5 << 1;
        int n4 = n2;
        int n5 = 2 ^ 5;
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

    public double cfr_renamed_12348(String arg0, double arg1) {
        String string = this.cfr_renamed_12349(arg0, null);
        if (string != null) {
            return sprebp.cfr_renamed_12350(string);
        }
        return arg1;
    }

    @sprtea
    public boolean cfr_renamed_12351(boolean arg0) {
        return this.cfr_renamed_12352("val", arg0);
    }

    public void cfr_renamed_12353() {
        sprwmr sprwmr2 = this;
        sprwmr2.cfr_renamed_4.cfr_renamed_12291();
        if (sprwmr2.cfr_renamed_12292()) {
            return;
        }
        String string = this.cfr_renamed_12286();
        block0: while (true) {
            sprwmr sprwmr3 = this;
            while (!sprwmr3.cfr_renamed_12354(string)) {
                sprwmr sprwmr4 = this;
                sprwmr4.cfr_renamed_4.cfr_renamed_137();
                if (sprwmr4.cfr_renamed_4.cfr_renamed_12271() != 1) continue block0;
                sprwmr sprwmr5 = this;
                sprwmr3 = sprwmr5;
                sprwmr5.cfr_renamed_4.cfr_renamed_12355();
            }
            break;
        }
    }

    public sprwmr(spreen spreen2) {
        spreen spreen3 = spreen2;
        sprwmr sprwmr2 = this;
        spreen3.cfr_renamed_11548(0L);
        sprwmr2.cfr_renamed_4 = sprten.cfr_renamed_12341(spreen3);
        sprwmr2.cfr_renamed_4.cfr_renamed_12356();
    }

    public String cfr_renamed_9857() {
        return this.cfr_renamed_4.cfr_renamed_9857();
    }

    public boolean cfr_renamed_12354(String arg0) {
        return this.cfr_renamed_4.cfr_renamed_12271() == 15 && sprraia.cfr_renamed_11730(this.cfr_renamed_12286(), arg0);
    }

    public String cfr_renamed_12286() {
        return this.cfr_renamed_4.cfr_renamed_12286();
    }

    public double cfr_renamed_12357() {
        return sprebp.cfr_renamed_12350(this.cfr_renamed_9857());
    }

    @sprtea
    public String cfr_renamed_12358(String arg0) {
        return this.cfr_renamed_12349("val", arg0);
    }

    @sprtea
    public boolean cfr_renamed_12359() {
        return this.cfr_renamed_2;
    }

    public sprlnga cfr_renamed_12360() {
        return this.cfr_renamed_4;
    }

    public String cfr_renamed_12361(sprdu arg0, sprfbn arg1) {
        String string = sprten.cfr_renamed_12306((sprniga)this.cfr_renamed_4, arg0, arg1);
        sprwmr sprwmr2 = this;
        while (sprwmr2.cfr_renamed_4.cfr_renamed_12271() == 13 || this.cfr_renamed_4.cfr_renamed_12271() == 3 || this.cfr_renamed_4.cfr_renamed_12271() == 8 || this.cfr_renamed_4.cfr_renamed_12271() == 14) {
            sprwmr sprwmr3 = this;
            sprwmr2 = sprwmr3;
            sprwmr3.cfr_renamed_4.cfr_renamed_137();
        }
        return string;
    }

    public double cfr_renamed_12362() {
        return sprebp.cfr_renamed_12350(this.cfr_renamed_97());
    }

    public String cfr_renamed_12281() {
        return this.cfr_renamed_4.cfr_renamed_12281();
    }

    public boolean cfr_renamed_12292() {
        return this.cfr_renamed_4.cfr_renamed_12292();
    }

    @sprtea
    public sprpdja cfr_renamed_12363() {
        sprpdja sprpdja2 = new sprpdja();
        sprnmga sprnmga2 = sprten.cfr_renamed_12275(sprpdja2, sprszca.cfr_renamed_11605());
        sprnmga2.cfr_renamed_12309(this.cfr_renamed_4, false);
        sprnmga2.cfr_renamed_2947();
        return sprpdja2;
    }

    public String cfr_renamed_12284() {
        return this.cfr_renamed_4.cfr_renamed_12284();
    }

    @sprtea
    public double cfr_renamed_12364(double arg0) {
        return this.cfr_renamed_12348("val", arg0);
    }

    public int cfr_renamed_12365() {
        return (int)(sprebp.cfr_renamed_12366(this.cfr_renamed_4.cfr_renamed_97()) & 0xFFFFFFFFL);
    }

    public int cfr_renamed_12367() {
        return sprebp.cfr_renamed_12368(this.cfr_renamed_9857());
    }

    public sprlzia cfr_renamed_12369(String arg0, sprlzia arg1) {
        String string = this.cfr_renamed_12349(arg0, null);
        if (sprznp.cfr_renamed_12328(string)) {
            return new sprlzia(string);
        }
        return arg1;
    }

    public String cfr_renamed_97() {
        return this.cfr_renamed_4.cfr_renamed_97();
    }

    public sprniga cfr_renamed_12370() {
        return (sprniga)this.cfr_renamed_4;
    }

    public void cfr_renamed_12371(boolean arg0) {
        this.cfr_renamed_3 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public sprwmr(spreen spreen2, spralq spralq2) {
        void arg1;
        void arg0;
        sprwmr sprwmr2 = this;
        arg0.cfr_renamed_11548(0L);
        sprwmr2.cfr_renamed_4 = sprten.cfr_renamed_12301(spreen2, (spralq)arg1);
        sprwmr2.cfr_renamed_4.cfr_renamed_12356();
    }

    public boolean cfr_renamed_12372(String arg0) {
        return this.cfr_renamed_12373(arg0, 0);
    }

    @sprtea
    public int cfr_renamed_12374(int arg0) {
        return this.cfr_renamed_12375("val", arg0);
    }

    public String cfr_renamed_12376() {
        return this.cfr_renamed_12361(null, null);
    }

    /*
     * Enabled aggressive block sorting
     */
    public boolean cfr_renamed_12373(String arg0, int arg1) {
        sprwmr sprwmr2 = this;
        sprwmr2.cfr_renamed_4.cfr_renamed_12291();
        if (sprwmr2.cfr_renamed_12292() && sprraia.cfr_renamed_11730(this.cfr_renamed_12286(), arg0)) {
            return false;
        }
        block7: while (this.cfr_renamed_4.cfr_renamed_137()) {
            switch (this.cfr_renamed_4.cfr_renamed_12271()) {
                case 1: {
                    return true;
                }
                case 15: {
                    if (!this.cfr_renamed_12354(arg0)) continue block7;
                    return false;
                }
                case 3: 
                case 4: {
                    if ((arg1 & 1) == 0) continue block7;
                    return true;
                }
                case 14: {
                    if ((arg1 & 2) == 0) continue block7;
                    return true;
                }
                case 13: {
                    if ((arg1 & 4) == 0) continue block7;
                    return true;
                }
            }
        }
        return false;
    }

    public sprwmr(sprniga sprniga2) {
        sprwmr sprwmr2 = this;
        sprwmr2.cfr_renamed_4 = sprniga2;
        sprwmr2.cfr_renamed_4.cfr_renamed_12356();
    }

    public boolean cfr_renamed_12377() {
        return sprebp.cfr_renamed_12378(this.cfr_renamed_9857());
    }

    @sprtea
    public void cfr_renamed_12379(boolean arg0) {
        this.cfr_renamed_2 = arg0;
    }

    public String cfr_renamed_313() {
        return this.cfr_renamed_4.cfr_renamed_313();
    }

    public String cfr_renamed_12380(String arg0) {
        return this.cfr_renamed_4.cfr_renamed_12380(arg0);
    }

    public int cfr_renamed_12381() {
        return sprebp.cfr_renamed_12368(this.cfr_renamed_97());
    }

    public boolean cfr_renamed_12382(boolean arg0) {
        while (this.cfr_renamed_4.cfr_renamed_12287()) {
            if ("xmlns".equals(this.cfr_renamed_4.cfr_renamed_12281()) && arg0) continue;
            return true;
        }
        return false;
    }

    public String cfr_renamed_12349(String arg0, String arg1) {
        sprwmr sprwmr2;
        String string;
        block1: {
            string = arg1;
            while (this.cfr_renamed_4.cfr_renamed_12287()) {
                if (!sprraia.cfr_renamed_11730(this.cfr_renamed_12286(), arg0)) continue;
                sprwmr sprwmr3 = this;
                sprwmr2 = sprwmr3;
                string = sprwmr3.cfr_renamed_4.cfr_renamed_97();
                break block1;
            }
            sprwmr2 = this;
        }
        sprwmr2.cfr_renamed_4.cfr_renamed_12291();
        return string;
    }

    public boolean cfr_renamed_12352(String arg0, boolean arg1) {
        String string = this.cfr_renamed_12349(arg0, null);
        if (string == null) {
            return arg1;
        }
        return sprwmr.cfr_renamed_12383(string);
    }

    public int cfr_renamed_12384(boolean arg0) {
        return sprebp.cfr_renamed_12385(this.cfr_renamed_97(), arg0);
    }

    public String cfr_renamed_12386() {
        return this.cfr_renamed_4.cfr_renamed_9857().replace(sprsjo.cfr_renamed_9("R4=|=(R"), "\r").replace(sprfvca.cfr_renamed_9("r*\u001db\u001d\u0016r"), "\r").replace(sprsjo.cfr_renamed_9("R4=|=.R"), sprfvca.cfr_renamed_9("&")).replace(sprsjo.cfr_renamed_9("R4=|=\u000eR"), sprfvca.cfr_renamed_9("&"));
    }

    /*
     * WARNING - void declaration
     */
    public void cfr_renamed_12387(spreen spreen2, int n, sprcip sprcip2) {
        void arg0;
        void arg1;
        void arg2;
        this.cfr_renamed_4.cfr_renamed_12356();
        if (n > 2 || arg2 == null) {
            return;
        }
        if (arg2.cfr_renamed_11861() <= arg1) {
            return;
        }
        arg0.cfr_renamed_11548(0L);
        this.cfr_renamed_4 = sprten.cfr_renamed_12293((spreen)arg0, (sprcip)arg2);
        this.cfr_renamed_4.cfr_renamed_12356();
    }

    public boolean cfr_renamed_12388() {
        return sprwmr.cfr_renamed_12383(this.cfr_renamed_97());
    }

    public static boolean cfr_renamed_12383(String arg0) {
        return "1".equals(arg0) || "true".equals(arg0) || "t".equals(arg0);
    }

    public boolean cfr_renamed_12389() {
        return this.cfr_renamed_3;
    }

    public boolean cfr_renamed_12287() {
        return this.cfr_renamed_12382(true);
    }

    public boolean cfr_renamed_12291() {
        return this.cfr_renamed_4.cfr_renamed_12291();
    }

    /*
     * WARNING - void declaration
     */
    public sprwmr(String string, spralq spralq2) {
        void arg1;
        sprwmr sprwmr2 = this;
        sprwmr2.cfr_renamed_4 = sprten.cfr_renamed_12340(string, (spralq)arg1);
        sprwmr2.cfr_renamed_4.cfr_renamed_12356();
    }

    public int cfr_renamed_12375(String arg0, int arg1) {
        String string = this.cfr_renamed_12349(arg0, null);
        if (string != null) {
            return sprebp.cfr_renamed_12368(string);
        }
        return arg1;
    }
}

