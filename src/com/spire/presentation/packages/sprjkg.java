/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcf;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprdye;
import com.spire.presentation.packages.sprgur;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlqm;
import com.spire.presentation.packages.sprmqg;
import com.spire.presentation.packages.sprmzh;
import com.spire.presentation.packages.sprnbm;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprokp;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprurm;
import com.spire.presentation.packages.sprvhm;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class sprjkg {
    private boolean cfr_renamed_1;
    private List cfr_renamed_2;
    private sprnbm cfr_renamed_3;
    private sprvhm cfr_renamed_4;

    public sprjkg cfr_renamed_7369(sprlem arg0, sprco[] arg1) {
        Iterator iterator = this.cfr_renamed_2.iterator();
        while (iterator.hasNext()) {
            if (!((sprurm)iterator.next()).cfr_renamed_204().cfr_renamed_5078(arg0)) continue;
            throw new IllegalStateException(new StringBuilder().insert(0, sprokp.cfr_renamed_9("U)`/}?a)q}")).append(arg0.toString()).append(sprgur.cfr_renamed_9(":Di\r{AhH{Ic\riHn")).toString());
        }
        sprjkg sprjkg2 = this;
        sprjkg2.cfr_renamed_7370(arg0, arg1);
        return sprjkg2;
    }

    /*
     * WARNING - void declaration
     */
    public sprjkg(sprjkg sprjkg2) {
        void arg0;
        sprjkg sprjkg3 = this;
        void v1 = arg0;
        sprjkg sprjkg4 = this;
        this.cfr_renamed_2 = new ArrayList();
        this.cfr_renamed_1 = false;
        this.cfr_renamed_4 = v1.cfr_renamed_4;
        sprjkg3.cfr_renamed_3 = v1.cfr_renamed_3;
        sprjkg3.cfr_renamed_1 = sprjkg2.cfr_renamed_1;
        sprjkg3.cfr_renamed_2 = new ArrayList(arg0.cfr_renamed_2);
    }

    public sprjkg cfr_renamed_7370(sprlem arg0, sprco[] arg1) {
        sprjkg sprjkg2 = this;
        sprjkg2.cfr_renamed_2.add(new sprurm(arg0, new sprocn(arg1)));
        return sprjkg2;
    }

    public sprjkg cfr_renamed_1483(boolean arg0) {
        this.cfr_renamed_1 = arg0;
        return this;
    }

    public sprjkg cfr_renamed_7371(sprlem arg0, sprco arg1) {
        Iterator iterator = this.cfr_renamed_2.iterator();
        while (iterator.hasNext()) {
            if (!((sprurm)iterator.next()).cfr_renamed_204().cfr_renamed_5078(arg0)) continue;
            throw new IllegalStateException(new StringBuilder().insert(0, sprokp.cfr_renamed_9("U)`/}?a)q}")).append(arg0.toString()).append(sprgur.cfr_renamed_9(":Di\r{AhH{Ic\riHn")).toString());
        }
        sprjkg sprjkg2 = this;
        sprjkg2.cfr_renamed_7372(arg0, arg1);
        return sprjkg2;
    }

    public sprjkg cfr_renamed_7372(sprlem arg0, sprco arg1) {
        sprjkg sprjkg2 = this;
        sprjkg2.cfr_renamed_2.add(new sprurm(arg0, new sprocn(arg1)));
        return sprjkg2;
    }

    /*
     * Unable to fully structure code
     */
    public sprmqg cfr_renamed_7373(sprcf arg0) {
        block5: {
            if (!this.cfr_renamed_2.isEmpty()) break block5;
            if (this.cfr_renamed_1) {
                v0 = this;
                var2_2 = new sprlqm(v0.cfr_renamed_3, v0.cfr_renamed_4, null);
                v1 = arg0;
            } else {
                v2 = this;
                var2_2 = new sprlqm(v2.cfr_renamed_3, v2.cfr_renamed_4, (spridn)new sprocn());
                v1 = arg0;
            }
            ** GOTO lbl23
        }
        var3_3 = new sprrvm();
        v3 = var4_5 = this.cfr_renamed_2.iterator();
        while (v3.hasNext()) {
            v4 = var4_5;
            v3 = v4;
            var3_3.cfr_renamed_5004(sprurm.cfr_renamed_23(v4.next()));
        }
        v5 = this;
        var2_2 = new sprlqm(v5.cfr_renamed_3, v5.cfr_renamed_4, (spridn)new sprocn((sprrvm)var3_3));
        try {
            v1 = arg0;
lbl23:
            // 3 sources

            var3_3 = v1.cfr_renamed_470();
            var3_3.write(var2_2.cfr_renamed_104("DER"));
            var3_3.close();
            return new sprmqg(new sprmzh(var2_2, arg0.cfr_renamed_615(), new sprdye(arg0.cfr_renamed_79())));
        }
        catch (IOException var3_4) {
            throw new IllegalStateException(sprokp.cfr_renamed_9("w<z3{)4-f2p(w84>q/`4r4w<`4{34/q,a8g)4.}:z<`(f8"));
        }
    }

    public static String cfr_renamed_9(String s) {
        int n = s.length();
        int n2 = n - 1;
        char[] cArray = new char[n];
        int n3 = 2 ^ 5;
        int cfr_ignored_0 = 1 << 3 ^ 3;
        int n4 = n2;
        int n5 = 1 << 3 ^ 5;
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

    /*
     * WARNING - void declaration
     */
    public sprjkg(sprnbm sprnbm2, sprvhm sprvhm2) {
        void arg0;
        sprjkg sprjkg2 = this;
        sprjkg sprjkg3 = this;
        this.cfr_renamed_2 = new ArrayList();
        this.cfr_renamed_1 = false;
        sprjkg2.cfr_renamed_3 = arg0;
        sprjkg2.cfr_renamed_4 = sprvhm2;
    }
}

