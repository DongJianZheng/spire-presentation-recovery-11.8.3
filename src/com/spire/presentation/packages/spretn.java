/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbgp;
import com.spire.presentation.packages.sprbln;
import com.spire.presentation.packages.sprgdo;
import com.spire.presentation.packages.sprkpp;
import com.spire.presentation.packages.sprkxy;
import com.spire.presentation.packages.sprmuda;
import com.spire.presentation.packages.sprnyja;
import com.spire.presentation.packages.sprraia;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.spryjn;
import com.spire.presentation.packages.sprznp;
import java.util.Iterator;

@sprtea
public class spretn
extends sprbln {
    private String[] cfr_renamed_4;

    @Override
    public void cfr_renamed_14285(spryjn arg0) {
        spryjn spryjn2 = arg0;
        spryjn spryjn3 = arg0;
        spryjn3.cfr_renamed_14086();
        sprbgp sprbgp2 = this.cfr_renamed_2820().cfr_renamed_3365();
        spryjn2.cfr_renamed_14286(sprkxy.cfr_renamed_9("fx X%I"), sprbgp2.cfr_renamed_13189());
        spryjn3.cfr_renamed_14286(sprmuda.cfr_renamed_9("\b0R\u0005O\u001eU"), sprbgp2.cfr_renamed_14047());
        spryjn2.cfr_renamed_14286(sprkxy.cfr_renamed_9("f\u007f<N#I*X"), sprbgp2.cfr_renamed_1485());
        spryjn2.cfr_renamed_14286(sprmuda.cfr_renamed_9("\b:B\bP\u001eU\u0015T"), sprbgp2.cfr_renamed_13204());
        spryjn2.cfr_renamed_14286(sprkxy.cfr_renamed_9("fo;I(X&^"), sprbgp2.cfr_renamed_13201());
        spryjn2.cfr_renamed_14286(sprmuda.cfr_renamed_9("\b!U\u001eC\u0004D\u0014U"), sprbgp2.cfr_renamed_13212());
        spryjn2.cfr_renamed_14289(sprkxy.cfr_renamed_9("\u0003\n^,M=E&B\rM=I"), sprbgp2.cfr_renamed_9310());
        spryjn2.cfr_renamed_14289(sprmuda.cfr_renamed_9("^j\u001eC5F\u0005B"), sprbgp2.cfr_renamed_13291());
        if (this.cfr_renamed_2820().cfr_renamed_14359()) {
            this.cfr_renamed_14568(arg0, sprbgp2);
        }
        if (this.cfr_renamed_2820().cfr_renamed_13097().cfr_renamed_14527() == 1) {
            this.cfr_renamed_14569(arg0);
        }
        arg0.cfr_renamed_14061();
    }

    @sprtea
    public void cfr_renamed_14568(spryjn arg0, sprbgp arg1) {
        Object[] objectArray = new Object[1];
        objectArray[0] = sprznp.cfr_renamed_12328(arg1.cfr_renamed_13189()) ? arg1.cfr_renamed_13189() : sprkxy.cfr_renamed_9("\u007f9E;Ig|-J");
        arg0.cfr_renamed_14057(sprkxy.cfr_renamed_9("fx X%I"), sprraia.cfr_renamed_11562(sprmuda.cfr_renamed_9("\u000f\n\u0017\f\u000e"), objectArray));
        spryjn spryjn2 = arg0;
        arg0.cfr_renamed_14057(sprmuda.cfr_renamed_9("^`%t.w5a)d\u001eI\u0017H\u0003J\u0010I\u0012B"), sprkxy.cfr_renamed_9("\u0004\u0019h\u000f\u0003\u0011\u0001xMs\u001ey\u001cx\u0005"));
        spryjn2.cfr_renamed_14057(sprmuda.cfr_renamed_9("^s\u0003F\u0001W\u0014C"), sprkxy.cfr_renamed_9("fj(@:I"));
        spryjn2.cfr_renamed_14057(sprmuda.cfr_renamed_9("^`%t.w5a)q\u0014U\u0002N\u001eI"), sprkxy.cfr_renamed_9("a|\rjftd\u001ds\u001ey\u001cx\u0005"));
    }

    /*
     * WARNING - void declaration
     */
    public spretn(sprgdo sprgdo2) {
        super((sprgdo)arg0);
        void arg0;
        String[] stringArray = new String[9];
        stringArray[0] = "Title";
        stringArray[1] = "Author";
        stringArray[2] = "Subject";
        stringArray[3] = "Keywords";
        stringArray[4] = sprmuda.cfr_renamed_9("d\u0003B\u0010S\u001eU");
        stringArray[5] = sprkxy.cfr_renamed_9("\u0019^&H<O,^");
        stringArray[6] = sprmuda.cfr_renamed_9("2U\u0014F\u0005N\u001eI5F\u0005B");
        stringArray[7] = sprkxy.cfr_renamed_9("a&H\rM=I");
        stringArray[8] = sprmuda.cfr_renamed_9("s\u0003F\u0001W\u0014C");
        this.cfr_renamed_4 = stringArray;
    }

    private /* synthetic */ void cfr_renamed_14569(spryjn arg0) {
        Iterator iterator;
        Iterator iterator2 = iterator = this.cfr_renamed_2820().cfr_renamed_3365().cfr_renamed_14564().iterator();
        while (iterator2.hasNext()) {
            sprnyja sprnyja2 = (sprnyja)iterator.next();
            String string = sprnyja2.getKey().toString();
            if (sprkpp.cfr_renamed_14570(this.cfr_renamed_4, string)) {
                iterator2 = iterator;
                this.cfr_renamed_2820().cfr_renamed_13269(2, sprkxy.cfr_renamed_9("\u0007M$IiC/\f*Y:X&Ai\\;C9I;X0\f") + string + sprmuda.cfr_renamed_9("\u0007\u0018TQI\u001eSQQ\u0010K\u0018C"));
                continue;
            }
            arg0.cfr_renamed_14286(new StringBuilder().insert(0, "/").append(string).toString(), sprnyja2.getValue().toString());
            iterator2 = iterator;
        }
    }
}

