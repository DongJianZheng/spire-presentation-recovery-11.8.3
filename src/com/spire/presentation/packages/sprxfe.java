/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprnke;
import com.spire.presentation.packages.sprok;
import com.spire.presentation.packages.sprqge;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.spruhe;
import com.spire.presentation.packages.sprver;
import com.spire.presentation.packages.sprxte;
import com.spire.presentation.packages.sprzzd;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class sprxfe
implements sprok {
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

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public spra cfr_renamed_3218(sprtzd arg0, String arg1) {
        if (arg1.length() != 0 && arg1.charAt(0) == '#') {
            try {
                return sprzzd.cfr_renamed_4555(arg1, 1);
            }
            catch (IOException iOException) {
                throw new RuntimeException(new StringBuilder().insert(0, sprver.cfr_renamed_9("3E>\u0003$\u0004\"A3K4ApR1H%ApB?VpK9@p")).append(arg0.cfr_renamed_19()).toString());
            }
        }
        if (arg1.length() != 0 && arg1.charAt(0) == '\\') {
            arg1 = arg1.substring(1);
        }
        return this.cfr_renamed_4549(arg0, arg1);
    }

    public boolean cfr_renamed_4559(sprnke arg0, sprnke arg1) {
        return sprzzd.cfr_renamed_4551(arg0, arg1);
    }

    public spra cfr_renamed_4549(sprtzd arg0, String arg1) {
        return new sprxte(arg1);
    }

    @Override
    public int cfr_renamed_2415(spruhe arg0) {
        int n;
        int n2 = 0;
        sprnke[] sprnkeArray = arg0.cfr_renamed_4544();
        int n3 = n = 0;
        while (n3 != sprnkeArray.length) {
            if (sprnkeArray[n].cfr_renamed_4539()) {
                int n4;
                sprqge[] sprqgeArray = sprnkeArray[n].cfr_renamed_4540();
                int n5 = n4 = 0;
                while (n5 != sprqgeArray.length) {
                    n2 ^= sprqgeArray[n4].cfr_renamed_324().hashCode();
                    spra spra2 = sprqgeArray[n4].cfr_renamed_97();
                    n2 ^= this.cfr_renamed_4560(spra2);
                    n5 = ++n4;
                }
            } else {
                n2 ^= sprnkeArray[n].cfr_renamed_4541().cfr_renamed_324().hashCode();
                n2 ^= this.cfr_renamed_4560(sprnkeArray[n].cfr_renamed_4541().cfr_renamed_97());
            }
            n3 = ++n;
        }
        return n2;
    }

    private /* synthetic */ boolean cfr_renamed_4561(boolean arg0, sprnke arg1, sprnke[] arg2) {
        if (arg0) {
            int n;
            int n2 = n = arg2.length - 1;
            while (n2 >= 0) {
                if (arg2[n] != null && this.cfr_renamed_4559(arg1, arg2[n])) {
                    arg2[n] = null;
                    return true;
                }
                n2 = --n;
            }
        } else {
            int n;
            int n3 = n = 0;
            while (n3 != arg2.length) {
                if (arg2[n] != null && this.cfr_renamed_4559(arg1, arg2[n])) {
                    arg2[n] = null;
                    return true;
                }
                n3 = ++n;
            }
        }
        return false;
    }

    @Override
    public boolean cfr_renamed_3220(spruhe arg0, spruhe arg1) {
        int n;
        sprnke[] sprnkeArray;
        sprnke[] sprnkeArray2 = arg0.cfr_renamed_4544();
        if (sprnkeArray2.length != (sprnkeArray = arg1.cfr_renamed_4544()).length) {
            return false;
        }
        boolean bl = false;
        if (sprnkeArray2[0].cfr_renamed_4541() != null && sprnkeArray[0].cfr_renamed_4541() != null) {
            bl = !sprnkeArray2[0].cfr_renamed_4541().cfr_renamed_324().equals(sprnkeArray[0].cfr_renamed_4541().cfr_renamed_324());
        }
        int n2 = n = 0;
        while (n2 != sprnkeArray2.length) {
            if (!this.cfr_renamed_4561(bl, sprnkeArray2[n], sprnkeArray)) {
                return false;
            }
            n2 = ++n;
        }
        return true;
    }

    private /* synthetic */ int cfr_renamed_4560(spra arg0) {
        String string = sprzzd.cfr_renamed_4550(arg0);
        string = sprzzd.cfr_renamed_4456(string);
        return string.hashCode();
    }
}

