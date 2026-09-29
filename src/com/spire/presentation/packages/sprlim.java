/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraen;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprhbn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmem;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprtdm;
import com.spire.presentation.packages.spruu;
import com.spire.presentation.packages.sprwcs;
import com.spire.presentation.packages.sprxjm;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class sprlim
implements spruu {
    private /* synthetic */ boolean cfr_renamed_11179(boolean arg0, sprxjm arg1, sprxjm[] arg2) {
        if (arg0) {
            int n;
            int n2 = n = arg2.length - 1;
            while (n2 >= 0) {
                if (arg2[n] != null && this.cfr_renamed_11178(arg1, arg2[n])) {
                    arg2[n] = null;
                    return true;
                }
                n2 = --n;
            }
        } else {
            int n;
            int n3 = n = 0;
            while (n3 != arg2.length) {
                if (arg2[n] != null && this.cfr_renamed_11178(arg1, arg2[n])) {
                    arg2[n] = null;
                    return true;
                }
                n3 = ++n;
            }
        }
        return false;
    }

    @Override
    public int cfr_renamed_11157(sprnbm arg0) {
        int n;
        int n2 = 0;
        sprxjm[] sprxjmArray = arg0.cfr_renamed_4544();
        int n3 = n = 0;
        while (n3 != sprxjmArray.length) {
            if (sprxjmArray[n].cfr_renamed_4539()) {
                int n4;
                sprmem[] sprmemArray = sprxjmArray[n].cfr_renamed_4540();
                int n5 = n4 = 0;
                while (n5 != sprmemArray.length) {
                    n2 ^= sprmemArray[n4].cfr_renamed_324().hashCode();
                    sprco sprco2 = sprmemArray[n4].cfr_renamed_97();
                    n2 ^= this.cfr_renamed_11180(sprco2);
                    n5 = ++n4;
                }
            } else {
                n2 ^= sprxjmArray[n].cfr_renamed_4541().cfr_renamed_324().hashCode();
                n2 ^= this.cfr_renamed_11180(sprxjmArray[n].cfr_renamed_4541().cfr_renamed_97());
            }
            n3 = ++n;
        }
        return n2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprco cfr_renamed_11156(sprlem arg0, String arg1) {
        if (arg1.length() != 0 && arg1.charAt(0) == '#') {
            try {
                return sprtdm.cfr_renamed_4555(arg1, 1);
            }
            catch (IOException iOException) {
                throw new sprhbn(new StringBuilder().insert(0, sprwcs.cfr_renamed_9("\u0010O\u001d\t\u0007\u000e\u0001K\u0010A\u0017KSX\u0012B\u0006KSH\u001c\\SA\u001aJS")).append(arg0.cfr_renamed_19()).toString());
            }
        }
        if (arg1.length() != 0 && arg1.charAt(0) == '\\') {
            arg1 = arg1.substring(1);
        }
        return this.cfr_renamed_11173(arg0, arg1);
    }

    public sprco cfr_renamed_11173(sprlem arg0, String arg1) {
        return new spraen(arg1);
    }

    public boolean cfr_renamed_11178(sprxjm arg0, sprxjm arg1) {
        return sprtdm.cfr_renamed_7348(arg0, arg1);
    }

    public static Hashtable cfr_renamed_4093(Hashtable arg0) {
        Enumeration enumeration;
        Hashtable hashtable = new Hashtable();
        Enumeration enumeration2 = enumeration = arg0.keys();
        while (enumeration2.hasMoreElements()) {
            Object k;
            Enumeration enumeration3 = enumeration;
            enumeration2 = enumeration3;
            Object k2 = k = enumeration3.nextElement();
            hashtable.put(k2, arg0.get(k2));
        }
        return hashtable;
    }

    @Override
    public boolean cfr_renamed_11158(sprnbm arg0, sprnbm arg1) {
        int n;
        sprxjm[] sprxjmArray;
        sprxjm[] sprxjmArray2 = arg0.cfr_renamed_4544();
        if (sprxjmArray2.length != (sprxjmArray = arg1.cfr_renamed_4544()).length) {
            return false;
        }
        boolean bl = false;
        if (sprxjmArray2[0].cfr_renamed_4541() != null && sprxjmArray[0].cfr_renamed_4541() != null) {
            bl = !sprxjmArray2[0].cfr_renamed_4541().cfr_renamed_324().cfr_renamed_5078(sprxjmArray[0].cfr_renamed_4541().cfr_renamed_324());
        }
        int n2 = n = 0;
        while (n2 != sprxjmArray2.length) {
            if (!this.cfr_renamed_11179(bl, sprxjmArray2[n], sprxjmArray)) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ int cfr_renamed_11180(sprco arg0) {
        return sprtdm.cfr_renamed_11176(arg0).hashCode();
    }
}

