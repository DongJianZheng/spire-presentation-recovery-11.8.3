/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spragp;
import com.spire.presentation.packages.spravn;
import com.spire.presentation.packages.spravp;
import com.spire.presentation.packages.sprayn;
import com.spire.presentation.packages.sprcun;
import com.spire.presentation.packages.sprdvn;
import com.spire.presentation.packages.spresca;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprkzn;
import com.spire.presentation.packages.sprlwba;
import com.spire.presentation.packages.sprnas;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprson;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprvbo;
import com.spire.presentation.packages.sprzyn;
import java.util.Iterator;

@sprtea
public class spruzn {
    private spragp cfr_renamed_0;
    private spragp cfr_renamed_1;
    private sprcun cfr_renamed_2;
    private sprkzn cfr_renamed_3;
    private static sprvbo[] cfr_renamed_4 = new sprvbo[3];

    @sprtea
    public String cfr_renamed_14987(int arg0) {
        Object[] objectArray = new Object[2];
        objectArray[0] = spruzn.cfr_renamed_4[arg0].cfr_renamed_4;
        objectArray[1] = this.cfr_renamed_14988(arg0) + 1;
        return sprraia.cfr_renamed_11562(sprnas.cfr_renamed_9("^\u0003XH\u0014N"), objectArray);
    }

    @sprtea
    public spravn cfr_renamed_14989(sprson arg0) {
        spravn spravn2 = (spravn)this.cfr_renamed_2.cfr_renamed_13501(arg0.cfr_renamed_12510(), arg0.cfr_renamed_13240());
        if (spravn2 == null) {
            spravn2 = new spravn(this.cfr_renamed_3, arg0);
            spruzn spruzn2 = this;
            spruzn2.cfr_renamed_2.cfr_renamed_13502(arg0.cfr_renamed_12510(), arg0.cfr_renamed_13240(), spravn2);
            spruzn2.cfr_renamed_1.cfr_renamed_13301(spravn2.cfr_renamed_313(), spravn2);
        }
        return spravn2;
    }

    static {
        spruzn.cfr_renamed_4[1] = new sprvbo(sprlwba.cfr_renamed_9("\t7!,"), sprnas.cfr_renamed_9("u"));
        spruzn.cfr_renamed_4[2] = new sprvbo(sprlwba.cfr_renamed_9("\u0011\"9(="), sprnas.cfr_renamed_9("z"));
    }

    private /* synthetic */ sprayn cfr_renamed_14990(sprhhp arg0) {
        if (null != arg0.cfr_renamed_13261()) {
            sprayn sprayn2 = new sprayn(arg0.cfr_renamed_13261());
            return sprayn2;
        }
        sprayn sprayn3 = this.cfr_renamed_3.cfr_renamed_14991().cfr_renamed_14992(arg0.cfr_renamed_13261().cfr_renamed_13492());
        if (sprayn3 != null) {
            return sprayn3;
        }
        sprayn3 = this.cfr_renamed_3.cfr_renamed_14991().cfr_renamed_14992(this.cfr_renamed_3.cfr_renamed_14979().cfr_renamed_14993());
        if (sprayn3 == null) {
            sprayn3 = this.cfr_renamed_3.cfr_renamed_14991().cfr_renamed_14992("Arial");
        }
        if (sprayn3 == null) {
            throw new IllegalStateException(sprlwba.cfr_renamed_9("\u000e*&9#x)7!,o;.6o6 ,o:*x)7:6+v"));
        }
        return sprayn3;
    }

    private static /* synthetic */ void cfr_renamed_14994(spragp arg0, sprzyn arg1) {
        Iterator iterator;
        if (arg0.size() == 0) {
            return;
        }
        Iterator iterator2 = iterator = arg0.cfr_renamed_13435().iterator();
        while (iterator2.hasNext()) {
            ((sprdvn)iterator.next()).cfr_renamed_14995(arg1);
            iterator2 = iterator;
        }
    }

    @sprtea
    public sprayn cfr_renamed_14832(sprhhp arg0) {
        String string = spruzn.cfr_renamed_14996(arg0);
        sprayn sprayn2 = (sprayn)this.cfr_renamed_0.cfr_renamed_12347(string);
        if (sprayn2 == null) {
            spruzn spruzn2 = this;
            sprayn2 = spruzn2.cfr_renamed_14990(arg0);
            spruzn2.cfr_renamed_0.cfr_renamed_13301(string, sprayn2);
        }
        return sprayn2;
    }

    @sprtea
    public void cfr_renamed_14997(sprzyn arg0) {
        spruzn.cfr_renamed_14994(this.cfr_renamed_1, arg0);
    }

    private /* synthetic */ int cfr_renamed_14988(int arg0) {
        return this.cfr_renamed_14998(arg0).size();
    }

    @sprtea
    public spruzn(sprkzn sprkzn2) {
        spruzn spruzn2 = this;
        spruzn spruzn3 = this;
        spruzn3.cfr_renamed_0 = new spravp();
        spruzn2.cfr_renamed_1 = new spravp();
        spruzn2.cfr_renamed_2 = new sprcun();
        spruzn2.cfr_renamed_3 = sprkzn2;
    }

    private static /* synthetic */ String cfr_renamed_14996(sprhhp arg0) {
        return arg0.cfr_renamed_13261().cfr_renamed_13302();
    }

    /*
     * Enabled aggressive block sorting
     */
    private /* synthetic */ spragp cfr_renamed_14998(int arg0) {
        switch (arg0) {
            case 1: {
                return this.cfr_renamed_0;
            }
            case 2: {
                return this.cfr_renamed_1;
            }
        }
        throw new IllegalArgumentException(sprnas.cfr_renamed_9("uRWRHVQVW\u0013KRHV\u001f\u0013QJUV"));
    }

    @sprtea
    public void cfr_renamed_14999(sprzyn arg0) throws Exception {
        int n;
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_0.size()) {
            sprayn sprayn2 = spresca.cfr_renamed_11777(this.cfr_renamed_0.cfr_renamed_13485(n), sprayn.class);
            sprayn2.cfr_renamed_15000(arg0);
            n2 = ++n;
        }
    }
}

