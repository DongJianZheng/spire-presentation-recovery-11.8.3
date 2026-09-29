/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcpo;
import com.spire.presentation.packages.sprggo;
import com.spire.presentation.packages.sprhio;
import com.spire.presentation.packages.sprkto;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprbfo {
    private sprhio cfr_renamed_3;
    private sprggo cfr_renamed_4;

    public sprxln cfr_renamed_16646() {
        int n;
        int n2 = this.cfr_renamed_3.cfr_renamed_12261();
        sprsuja[] sprsujaArray = new sprsuja[n2];
        int n3 = n = 0;
        while (n3 < n2) {
            sprsujaArray[n++] = this.cfr_renamed_3.cfr_renamed_16647();
            n3 = n;
        }
        sprxln sprxln2 = new sprxln();
        sprlsn sprlsn2 = sprlsn.cfr_renamed_13644(sprsujaArray, false, true);
        sprxln sprxln3 = sprxln2;
        sprxln3.cfr_renamed_12507(sprlsn2);
        return sprxln3;
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = (3 ^ 5) << 4 ^ 3 << 1;
        int cfr_ignored_0 = 4 << 3 ^ 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ 4;
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

    private /* synthetic */ sprphja cfr_renamed_16648() {
        return new sprphja(sprbfo.cfr_renamed_16649(this.cfr_renamed_3), sprbfo.cfr_renamed_16649(this.cfr_renamed_3));
    }

    public sprsuja[] cfr_renamed_16581(int arg0, boolean arg1, boolean arg2) {
        if (arg1) {
            return this.cfr_renamed_16650(arg0);
        }
        if (arg2) {
            return this.cfr_renamed_16651(arg0);
        }
        return this.cfr_renamed_16652(arg0);
    }

    public sprbfo(sprggo arg0) {
        this(arg0.cfr_renamed_16064(), arg0);
    }

    private /* synthetic */ sprsuja[] cfr_renamed_16650(int arg0) {
        int n;
        sprsuja[] sprsujaArray = new sprsuja[arg0];
        sprsuja sprsuja2 = sprsuja.cfr_renamed_13377();
        int n2 = n = 0;
        while (n2 < arg0) {
            sprphja sprphja2 = this.cfr_renamed_16648();
            sprsuja sprsuja3 = sprsuja2;
            sprsuja3.cfr_renamed_12617(sprsuja3.cfr_renamed_1980() + sprphja2.cfr_renamed_1942());
            sprsuja3.cfr_renamed_12618(sprsuja3.spr\u3181() + sprphja2.cfr_renamed_1452());
            sprsujaArray[n++] = sprsuja2;
            n2 = n;
        }
        return sprsujaArray;
    }

    /*
     * WARNING - void declaration
     */
    public sprbfo(sprhio sprhio2, sprggo sprggo2) {
        void arg0;
        sprbfo sprbfo2 = this;
        sprbfo2.cfr_renamed_3 = arg0;
        sprbfo2.cfr_renamed_4 = sprggo2;
    }

    public sprsuja[] cfr_renamed_16652(int arg0) {
        int n;
        sprsuja[] sprsujaArray = new sprsuja[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            sprsujaArray[n++] = this.cfr_renamed_3.cfr_renamed_16647();
            n2 = n;
        }
        return sprsujaArray;
    }

    @sprtea
    public static int cfr_renamed_16649(sprhio arg0) {
        int n = arg0.cfr_renamed_12137() & 0xFF;
        if ((n & 0x80) == 0) {
            int n2 = arg0.cfr_renamed_12137() & 0xFF;
            int n3 = n2 + (n << 8);
            if (n3 > 16383) {
                n3 = 16383 - n3;
            }
            return n3;
        }
        int n4 = n & 0x7F;
        if (n4 > 63) {
            n4 = 63 - n4;
        }
        return n4;
    }

    public sprsuja[] cfr_renamed_16651(int arg0) {
        int n;
        sprsuja[] sprsujaArray = new sprsuja[arg0];
        int n2 = n = 0;
        while (n2 < arg0) {
            sprsujaArray[n++] = new sprsuja(this.cfr_renamed_3.cfr_renamed_12254(), this.cfr_renamed_3.cfr_renamed_12254());
            n2 = n;
        }
        return sprsujaArray;
    }

    private /* synthetic */ void cfr_renamed_16653() {
        this.cfr_renamed_4.cfr_renamed_16561(sprkto.cfr_renamed_9("\u0005\t\u0012e4*:5% $6>*9e>6w+81w6\"5'*%12!y"));
    }

    /*
     * Enabled aggressive block sorting
     */
    private static /* synthetic */ void cfr_renamed_16654(sprxln arg0, sprsuja[] arg1, int[] arg2, int[] arg3) {
        sprsuja sprsuja2 = arg1[0];
        sprsuja sprsuja3 = arg1[0];
        int n = 0;
        sprlsn sprlsn2 = new sprlsn();
        arg0.cfr_renamed_12507(sprlsn2);
        int n2 = 1;
        int n3 = n2;
        while (n3 < arg1.length) {
            sprsuja[] sprsujaArray;
            block9: {
                switch (arg2[n2]) {
                    case 0: {
                        if ((arg3[n2 - 1] & 8) != 0) {
                            sprlsn2.cfr_renamed_12625(true);
                        }
                        sprlsn2 = new sprlsn();
                        sprsujaArray = arg1;
                        arg0.cfr_renamed_12507(sprlsn2);
                        break block9;
                    }
                    case 1: {
                        sprlsn2.cfr_renamed_13641(sprsuja2, arg1[n2]);
                        sprsujaArray = arg1;
                        break block9;
                    }
                    case 3: {
                        if (n == 0) {
                            sprsuja3 = sprsuja2;
                        }
                        if (++n != 3) break;
                        sprsujaArray = arg1;
                        sprlsn2.cfr_renamed_12507(new sprxnn(sprsuja3, arg1[n2 - 2], arg1[n2 - 1], arg1[n2]));
                        n = 0;
                        break block9;
                    }
                    default: {
                        throw new IllegalArgumentException();
                    }
                }
                sprsujaArray = arg1;
            }
            sprsuja2 = sprsujaArray[n2++];
            n3 = n2;
        }
        if ((arg3[arg1.length - 1] & 8) != 0) {
            sprlsn2.cfr_renamed_12625(true);
        }
    }

    public sprxln cfr_renamed_16655() {
        sprxln sprxln2 = new sprxln();
        this.cfr_renamed_3.cfr_renamed_12261();
        int n = this.cfr_renamed_3.cfr_renamed_12261();
        if (n <= 1) {
            return sprxln2;
        }
        sprcpo sprcpo2 = new sprcpo();
        sprcpo2.cfr_renamed_16641(this.cfr_renamed_3);
        if (sprcpo2.cfr_renamed_16656()) {
            this.cfr_renamed_16653();
            return sprxln2;
        }
        sprbfo sprbfo2 = this;
        sprbfo2.cfr_renamed_3.cfr_renamed_12254();
        sprbfo sprbfo3 = this;
        sprsuja[] sprsujaArray = sprbfo3.cfr_renamed_16581(n, sprcpo2.cfr_renamed_16582(), sprcpo2.cfr_renamed_12123());
        int[] nArray = new int[n];
        int[] nArray2 = new int[n];
        sprbfo3.cfr_renamed_16426(sprcpo2, nArray, nArray2);
        if (sprbfo2.cfr_renamed_3.cfr_renamed_14060().cfr_renamed_3274() % 4L != 0L) {
            this.cfr_renamed_3.cfr_renamed_14060().cfr_renamed_11548(this.cfr_renamed_3.cfr_renamed_14060().cfr_renamed_3274() + (4L - this.cfr_renamed_3.cfr_renamed_14060().cfr_renamed_3274() % 4L));
        }
        sprxln sprxln3 = sprxln2;
        sprbfo.cfr_renamed_16654(sprxln3, sprsujaArray, nArray, nArray2);
        return sprxln3;
    }

    private /* synthetic */ void cfr_renamed_16426(sprcpo arg0, int[] arg1, int[] arg2) {
        int n;
        if (arg0.cfr_renamed_16656()) {
            this.cfr_renamed_16653();
            return;
        }
        int n2 = n = 0;
        while (n2 < arg1.length) {
            byte by = this.cfr_renamed_3.cfr_renamed_12137();
            arg2[n] = (by & 0xFF & 0xF0) >> 4;
            arg1[n++] = by & 0xFF & 0xF;
            n2 = n;
        }
    }
}

