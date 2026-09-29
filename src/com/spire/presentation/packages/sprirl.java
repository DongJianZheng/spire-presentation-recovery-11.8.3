/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprhgm;
import com.spire.presentation.packages.sprhk;
import com.spire.presentation.packages.sprigm;
import com.spire.presentation.packages.sprign;
import com.spire.presentation.packages.sprjjy;
import com.spire.presentation.packages.sprkpl;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprndm;
import com.spire.presentation.packages.sprntl;
import com.spire.presentation.packages.sprpsm;
import com.spire.presentation.packages.sprqpp;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprrzm;
import com.spire.presentation.packages.sprszm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprwrm;
import com.spire.presentation.packages.sprznl;
import com.spire.presentation.packages.sprzwl;
import java.io.IOException;
import java.util.List;
import java.util.Set;

public class sprirl {
    private sprhgm cfr_renamed_2;
    private static final sprtpl[] cfr_renamed_3 = new sprtpl[0];
    private sprwrm cfr_renamed_4;

    public sprigm cfr_renamed_4296() {
        return sprigm.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_4295().cfr_renamed_4296());
    }

    public sprrdm cfr_renamed_5024(sprlem arg0) {
        if (this.cfr_renamed_2 != null) {
            return this.cfr_renamed_2.cfr_renamed_5024(arg0);
        }
        return null;
    }

    public int cfr_renamed_569() {
        return this.cfr_renamed_4.cfr_renamed_4295().cfr_renamed_3().cfr_renamed_5023() + 1;
    }

    public List cfr_renamed_583() {
        return sprntl.cfr_renamed_5274(this.cfr_renamed_2);
    }

    public boolean cfr_renamed_4298() {
        return this.cfr_renamed_4.cfr_renamed_4297() != null;
    }

    public Set cfr_renamed_662() {
        return sprntl.cfr_renamed_10880(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprirl(byte[] byArray) throws IOException {
        this(new sprrzm((byte[])arg0));
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ sprirl(sprrzm arg0) throws IOException {
        try {
            this.cfr_renamed_4 = sprwrm.cfr_renamed_23(arg0.cfr_renamed_24());
            if (this.cfr_renamed_4 == null) {
                throw new sprznl(sprqpp.cfr_renamed_9("\u000f5\u000e2\r&\u000f1\u0006t\u00101\u0013!\u0007'\u0016nB:\rt\u00101\u0013!\u0007'\u0016t\u00065\u00165B2\r!\f0"));
            }
            this.cfr_renamed_2 = this.cfr_renamed_4.cfr_renamed_4295().cfr_renamed_3091();
            return;
        }
        catch (IllegalArgumentException illegalArgumentException) {
            throw new sprznl(new StringBuilder().insert(0, sprjjy.cfr_renamed_9("j1k6h\"j5cpu5v%b#sj'")).append(illegalArgumentException.getMessage()).toString(), illegalArgumentException);
        }
        catch (ClassCastException classCastException) {
            throw new sprznl(new StringBuilder().insert(0, sprqpp.cfr_renamed_9("9\u00038\u0004;\u00109\u00070B&\u0007%\u00171\u0011 Xt")).append(classCastException.getMessage()).toString(), classCastException);
        }
        catch (sprign sprign2) {
            throw new sprznl(new StringBuilder().insert(0, sprjjy.cfr_renamed_9("j1k6h\"j5cpu5v%b#sj'")).append(sprign2.getMessage()).toString(), sprign2);
        }
    }

    public sprtpl[] cfr_renamed_626() {
        if (this.cfr_renamed_4.cfr_renamed_4297() != null) {
            sprszm sprszm2 = this.cfr_renamed_4.cfr_renamed_4297().cfr_renamed_626();
            if (sprszm2 != null) {
                int n;
                sprtpl[] sprtplArray = new sprtpl[sprszm2.cfr_renamed_84()];
                int n2 = n = 0;
                while (n2 != sprtplArray.length) {
                    int n3 = n;
                    sprtpl sprtpl2 = new sprtpl(sprndm.cfr_renamed_23(sprszm2.cfr_renamed_85(n)));
                    sprtplArray[n3] = sprtpl2;
                    n2 = ++n;
                }
                return sprtplArray;
            }
            return cfr_renamed_3;
        }
        return cfr_renamed_3;
    }

    public byte[] cfr_renamed_79() {
        if (!this.cfr_renamed_4298()) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_4297().cfr_renamed_79().cfr_renamed_186();
    }

    public byte[] cfr_renamed_91() throws IOException {
        return this.cfr_renamed_4.cfr_renamed_91();
    }

    public Set cfr_renamed_665() {
        return sprntl.cfr_renamed_10879(this.cfr_renamed_2);
    }

    /*
     * WARNING - void declaration
     */
    public sprirl(sprwrm sprwrm2) {
        void arg0;
        sprirl sprirl2 = this;
        sprirl2.cfr_renamed_4 = arg0;
        sprirl2.cfr_renamed_2 = sprwrm2.cfr_renamed_4295().cfr_renamed_3091();
    }

    public sprkpl[] cfr_renamed_4300() {
        int n;
        sprszm sprszm2 = this.cfr_renamed_4.cfr_renamed_4295().cfr_renamed_4300();
        sprkpl[] sprkplArray = new sprkpl[sprszm2.cfr_renamed_84()];
        int n2 = n = 0;
        while (n2 != sprkplArray.length) {
            int n3 = n;
            sprkpl sprkpl2 = new sprkpl(sprpsm.cfr_renamed_23(sprszm2.cfr_renamed_85(n)));
            sprkplArray[n3] = sprkpl2;
            n2 = ++n;
        }
        return sprkplArray;
    }

    public sprlem cfr_renamed_4299() {
        if (!this.cfr_renamed_4298()) {
            return null;
        }
        return this.cfr_renamed_4.cfr_renamed_4297().cfr_renamed_89().cfr_renamed_593();
    }

    public boolean cfr_renamed_663() {
        return this.cfr_renamed_2 != null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public boolean cfr_renamed_7374(sprhk arg0) throws sprzwl {
        if (!this.cfr_renamed_4298()) {
            throw new sprzwl(sprqpp.cfr_renamed_9("\u0003 \u00161\u000f$\u0016t\u0016;B\"\u0007&\u000b2\u001bt\u0011=\u0005:\u0003 \u0017&\u0007t\r:B!\f'\u000b3\f1\u0006t\r6\b1\u0001 "));
        }
        try {
            sprge sprge2;
            sprge sprge3 = sprge2 = arg0.cfr_renamed_5279(this.cfr_renamed_4.cfr_renamed_4297().cfr_renamed_89());
            sprge3.cfr_renamed_470().write(this.cfr_renamed_4.cfr_renamed_4295().cfr_renamed_104("DER"));
            return sprge3.cfr_renamed_1435(this.cfr_renamed_79());
        }
        catch (Exception exception) {
            throw new sprzwl(new StringBuilder().insert(0, sprjjy.cfr_renamed_9("5\u007f3b s9h>' u?d5t#n>`pt9`>f$r\"bj'")).append(exception).toString(), exception);
        }
    }
}

