/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprhxo;
import com.spire.presentation.packages.sprjdda;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprrbaa;
import com.spire.presentation.packages.sprrup;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwro;
import java.util.Iterator;

@sprtea
public class sprdso
implements Iterable {
    private spravp cfr_renamed_2;
    private spravp cfr_renamed_3;
    private String cfr_renamed_4;

    public String cfr_renamed_17127() {
        return this.cfr_renamed_4;
    }

    public sprwro cfr_renamed_17128(String arg0) {
        for (sprwro sprwro2 : this.cfr_renamed_2.cfr_renamed_13435()) {
            if (!sprwro2.cfr_renamed_324().endsWith(arg0)) continue;
            return sprwro2;
        }
        return null;
    }

    public sprwro cfr_renamed_17129(String arg0) {
        return (sprwro)this.cfr_renamed_2.cfr_renamed_12347(arg0);
    }

    public Iterator iterator() {
        return this.cfr_renamed_2.cfr_renamed_13435().iterator();
    }

    public void cfr_renamed_2437(String arg0) {
        sprdso sprdso2 = this;
        sprwro sprwro2 = sprdso2.cfr_renamed_17129(arg0);
        sprdso2.cfr_renamed_2.cfr_renamed_12927(sprwro2.cfr_renamed_19());
        sprdso2.cfr_renamed_3.cfr_renamed_12927(sprwro2.cfr_renamed_4750());
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ (3 ^ 5);
        int cfr_ignored_0 = 1 << 3 ^ 4;
        int n4 = n2;
        int n5 = (3 ^ 5) << 4 ^ (3 ^ 5) << 1;
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

    public String cfr_renamed_13277(String arg0, String arg1, boolean arg2) {
        String string;
        sprdso sprdso2;
        block3: {
            block2: {
                block1: {
                    if (!arg2) break block1;
                    if (!sprrup.cfr_renamed_17130(arg1)) break block2;
                    arg1 = new StringBuilder().insert(0, "file:///").append(arg1).toString();
                    arg1 = sprrup.cfr_renamed_17131(arg1);
                    sprdso2 = this;
                    break block3;
                }
                arg1 = sprhxo.cfr_renamed_17132(this.cfr_renamed_4, arg1);
            }
            sprdso2 = this;
        }
        sprwro sprwro2 = (sprwro)sprdso2.cfr_renamed_3.cfr_renamed_12347(this.cfr_renamed_16878(arg1, arg0));
        if (sprwro2 != null) {
            return sprwro2.cfr_renamed_19();
        }
        Object[] objectArray = new Object[1];
        objectArray[0] = this.cfr_renamed_3.size() + 1;
        String string2 = string = sprraia.cfr_renamed_11562(sprjdda.cfr_renamed_9("\u0001Y\u0017kCm"), objectArray);
        this.cfr_renamed_17133(string2, arg0, arg1, arg2);
        return string2;
    }

    public sprwro cfr_renamed_17134(String arg0) {
        for (sprwro sprwro2 : this.cfr_renamed_2.cfr_renamed_13435()) {
            if (!sprraia.cfr_renamed_11730(sprwro2.cfr_renamed_324(), arg0)) continue;
            return sprwro2;
        }
        return null;
    }

    public String cfr_renamed_17135(String arg0) {
        for (sprwro sprwro2 : this.cfr_renamed_2.cfr_renamed_13435()) {
            if (!sprraia.cfr_renamed_11730(sprwro2.cfr_renamed_4750(), arg0)) continue;
            return sprwro2.cfr_renamed_19();
        }
        return null;
    }

    public sprdso(String string) {
        this.cfr_renamed_4 = string;
        sprdso sprdso2 = this;
        this.cfr_renamed_2 = new spravp(true);
        sprdso2.cfr_renamed_3 = new spravp(false);
    }

    public void cfr_renamed_17133(String arg0, String arg1, String arg2, boolean arg3) {
        if (!arg3) {
            arg2 = arg2.replace("\\", "/");
        }
        sprwro sprwro2 = new sprwro(arg0, arg1, arg2, arg3);
        sprdso sprdso2 = this;
        sprdso2.cfr_renamed_2.cfr_renamed_13301(arg0, sprwro2);
        sprdso2.cfr_renamed_3.cfr_renamed_13301(this.cfr_renamed_16878(arg2, arg1), sprwro2);
    }

    private /* synthetic */ String cfr_renamed_16878(String arg0, String arg1) {
        Object[] objectArray = new Object[2];
        objectArray[0] = arg0;
        objectArray[1] = arg1;
        return sprraia.cfr_renamed_11562(sprrbaa.cfr_renamed_9(".\u0004(OdI"), objectArray);
    }

    public int cfr_renamed_11861() {
        return this.cfr_renamed_2.size();
    }
}

