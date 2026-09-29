/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcen;
import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprgkj;
import com.spire.presentation.packages.sprgvm;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.spromm;
import com.spire.presentation.packages.sproxl;
import com.spire.presentation.packages.sprpul;
import com.spire.presentation.packages.sprpwl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprxpm;
import com.spire.presentation.packages.sprzqh;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class spryol {
    private List<sprktm> cfr_renamed_1;
    private sprve cfr_renamed_2;
    private List<sprxpm> cfr_renamed_3;
    private List<sprddm> cfr_renamed_4;

    public spryol() {
        this(new sprcog());
    }

    public spryol cfr_renamed_11027(sprtpl arg0, BigInteger arg1) {
        return this.cfr_renamed_11028(arg0, new sprktm(arg1));
    }

    /*
     * WARNING - void declaration
     */
    public spryol cfr_renamed_11029(sprxpm sprxpm2, sprddm sprddm2, sprktm sprktm2) {
        void arg2;
        boolean bl = this.cfr_renamed_3.add(sprxpm2);
        spryol spryol2 = this;
        this.cfr_renamed_4.add(sprddm2);
        spryol2.cfr_renamed_1.add((sprktm)arg2);
        return spryol2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sproxl cfr_renamed_11030(sprlj arg0) throws sprpwl {
        int n;
        sprrvm sprrvm2 = new sprrvm();
        int n2 = n = 0;
        while (n2 != this.cfr_renamed_3.size()) {
            sprjj sprjj2;
            sprxpm sprxpm2 = this.cfr_renamed_3.get(n);
            sprktm sprktm2 = this.cfr_renamed_1.get(n);
            spryol spryol2 = this;
            sprddm sprddm2 = spryol2.cfr_renamed_2.cfr_renamed_7475(spryol2.cfr_renamed_4.get(n));
            if (sprddm2 == null) {
                throw new sprpwl(sprgkj.cfr_renamed_9("\"t/{.aas({%5 y&z3|5},5'z35%|&p2aas3z,52|&{ a4g$"));
            }
            try {
                sprjj2 = arg0.cfr_renamed_5279(sprddm2);
            }
            catch (sprhjg sprhjg2) {
                throw new sprpwl(new StringBuilder().insert(0, sprzqh.cfr_renamed_9("qBeNhI$Xk\fg^aMpI$HmKa_p\u0016$")).append(sprhjg2.getMessage()).toString(), sprhjg2);
            }
            sprpul.cfr_renamed_10955(sprxpm2, sprjj2.cfr_renamed_470());
            sprrvm2.cfr_renamed_5004(new spromm(sprjj2.cfr_renamed_580(), sprktm2));
            n2 = ++n;
        }
        return new sproxl(sprgvm.cfr_renamed_23(new sprcen(sprrvm2)), this.cfr_renamed_2);
    }

    public spryol(sprve sprve2) {
        spryol spryol2 = this;
        spryol spryol3 = this;
        spryol3.cfr_renamed_3 = new ArrayList<sprxpm>();
        spryol2.cfr_renamed_4 = new ArrayList<sprddm>();
        spryol2.cfr_renamed_1 = new ArrayList<sprktm>();
        spryol2.cfr_renamed_2 = sprve2;
    }

    /*
     * WARNING - void declaration
     */
    public spryol cfr_renamed_11028(sprtpl sprtpl2, sprktm sprktm2) {
        void arg1;
        void arg0;
        return this.cfr_renamed_11029(new sprxpm(arg0.cfr_renamed_568()), arg0.cfr_renamed_89(), (sprktm)arg1);
    }
}

