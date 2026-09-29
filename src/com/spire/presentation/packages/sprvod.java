/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprbdd;
import com.spire.presentation.packages.sprbne;
import com.spire.presentation.packages.sprbud;
import com.spire.presentation.packages.sprcyd;
import com.spire.presentation.packages.sprfzd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprjie;
import com.spire.presentation.packages.sprkhb;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprmee;
import com.spire.presentation.packages.sprmra;
import com.spire.presentation.packages.sprppd;
import com.spire.presentation.packages.sprpse;
import com.spire.presentation.packages.sprpyd;
import com.spire.presentation.packages.sprqa;
import com.spire.presentation.packages.sprrke;
import com.spire.presentation.packages.sprsee;
import com.spire.presentation.packages.sprszd;
import com.spire.presentation.packages.spruhe;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sprvod {
    private List cfr_renamed_2;
    private sprmee cfr_renamed_3;
    private sprszd cfr_renamed_4;

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 << 3 ^ 4;
        int cfr_ignored_0 = 5 << 3 ^ (2 ^ 5);
        int n4 = n2;
        int n5 = 5 << 4 ^ 2 << 1;
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

    public sprppd cfr_renamed_1451() throws sprbud {
        return this.cfr_renamed_4287(null, null);
    }

    public sprvod() {
        sprvod sprvod2 = this;
        sprvod sprvod3 = this;
        sprvod3.cfr_renamed_2 = new ArrayList();
        sprvod2.cfr_renamed_3 = null;
        sprvod2.cfr_renamed_4 = null;
    }

    public sprvod cfr_renamed_4288(sprfzd arg0) {
        sprvod sprvod2 = this;
        sprvod2.cfr_renamed_2.add(new sprpyd(this, arg0, null));
        return sprvod2;
    }

    /*
     * WARNING - void declaration
     */
    public sprvod cfr_renamed_4289(spruhe spruhe2) {
        void arg0;
        this.cfr_renamed_3 = new sprmee(4, (spra)arg0);
        return this;
    }

    public sprppd cfr_renamed_4290(sprqa arg0, sprcyd[] arg1) throws sprbud, IllegalArgumentException {
        if (arg0 == null) {
            throw new IllegalArgumentException(sprbdd.cfr_renamed_9("\n+D7\r#\n!\u0016d\u00174\u0001'\r\"\r!\u0000"));
        }
        return this.cfr_renamed_4287(arg0, arg1);
    }

    public sprvod cfr_renamed_4291(sprszd arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprvod cfr_renamed_4292(sprmee arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprvod cfr_renamed_4293(sprfzd arg0, sprszd arg1) {
        sprvod sprvod2 = this;
        sprvod2.cfr_renamed_2.add(new sprpyd(this, arg0, arg1));
        return sprvod2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprppd cfr_renamed_4287(sprqa arg0, sprcyd[] arg1) throws sprbud {
        Object object;
        Iterator iterator = this.cfr_renamed_2.iterator();
        sprlre sprlre2 = new sprlre();
        Iterator iterator2 = iterator;
        while (iterator2.hasNext()) {
            try {
                sprlre2.cfr_renamed_49(((sprpyd)iterator.next()).cfr_renamed_4294());
                iterator2 = iterator;
            }
            catch (Exception exception) {
                throw new sprbud(sprkhb.cfr_renamed_9("{\u001c}\u0001n\u0010w\u000bpD}\u0016{\u0005j\rp\u0003>6{\u0015k\u0001m\u0010"), exception);
            }
        }
        sprrke sprrke2 = new sprrke(this.cfr_renamed_3, (sprbne)new sprpse(sprlre2), this.cfr_renamed_4);
        sprjie sprjie2 = null;
        if (arg0 == null) return new sprppd(new sprsee(sprrke2, sprjie2));
        if (this.cfr_renamed_3 == null) {
            throw new sprbud(sprbdd.cfr_renamed_9("\u0016!\u00151\u00017\u0010+\u0016\n\u0005)\u0001d\t1\u00170D&\u0001d\u00174\u0001'\r\"\r!\u0000d\r\"D6\u00015\u0011!\u00170D-\u0017d\u0017-\u0003*\u0001 J"));
        }
        try {
            object = arg0.cfr_renamed_470();
            ((OutputStream)object).write(sprrke2.cfr_renamed_104("DER"));
            ((OutputStream)object).close();
        }
        catch (Exception exception) {
            throw new sprbud(new StringBuilder().insert(0, sprkhb.cfr_renamed_9("\u0001f\u0007{\u0014j\rq\n>\u0014l\u000b}\u0001m\u0017w\nyDJ&M6{\u0015k\u0001m\u0010$D")).append(exception).toString(), exception);
        }
        object = new sprmra(arg0.cfr_renamed_79());
        sprije sprije2 = arg0.cfr_renamed_615();
        if (arg1 != null && arg1.length > 0) {
            int n;
            sprlre sprlre3 = new sprlre();
            int n2 = n = 0;
            while (true) {
                if (n2 == arg1.length) {
                    sprjie2 = new sprjie(sprije2, (sprmra)object, new sprpse(sprlre3));
                    return new sprppd(new sprsee(sprrke2, sprjie2));
                }
                sprlre3.cfr_renamed_49(arg1[n++].cfr_renamed_568());
                n2 = n;
            }
        }
        sprjie2 = new sprjie(sprije2, (sprmra)object);
        return new sprppd(new sprsee(sprrke2, sprjie2));
    }
}

