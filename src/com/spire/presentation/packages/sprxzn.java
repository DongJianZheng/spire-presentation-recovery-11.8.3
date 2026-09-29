/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprewn;
import com.spire.presentation.packages.sprfy;
import com.spire.presentation.packages.sprgeja;
import com.spire.presentation.packages.sprhhp;
import com.spire.presentation.packages.sprjlp;
import com.spire.presentation.packages.sprjyn;
import com.spire.presentation.packages.sprkxb;
import com.spire.presentation.packages.sprpao;
import com.spire.presentation.packages.sprpbo;
import com.spire.presentation.packages.sprpdja;
import com.spire.presentation.packages.sprphja;
import com.spire.presentation.packages.sprpin;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprwbp;
import com.spire.presentation.packages.sprwvn;
import com.spire.presentation.packages.spryjn;
import java.util.Iterator;

@sprtea
public class sprxzn
extends sprjyn {
    private static final int cfr_renamed_152 = 2;
    private static final int cfr_renamed_112 = 10;
    private sprpbo cfr_renamed_119;
    private sprhhp cfr_renamed_91;
    private static final byte cfr_renamed_0 = 17;
    private sprgeja cfr_renamed_1;
    private int cfr_renamed_2;
    private static sprwbp cfr_renamed_3 = sprwbp.cfr_renamed_1513;
    private sprwvn cfr_renamed_4;

    @sprtea
    public sprxzn(sprpao arg0, sprpin arg1) {
        sprpin sprpin2 = arg1;
        super(arg0, arg1);
        this.cfr_renamed_2 = sprpin2.cfr_renamed_97();
        this.cfr_renamed_4 = sprpin2.cfr_renamed_13978();
        this.cfr_renamed_91 = arg1.cfr_renamed_13977();
        this.cfr_renamed_1 = this.cfr_renamed_14822();
        this.cfr_renamed_14800();
    }

    private /* synthetic */ void cfr_renamed_14823() {
        Iterator iterator;
        sprxzn sprxzn2 = this;
        sprewn sprewn2 = this.cfr_renamed_2820().cfr_renamed_14626().cfr_renamed_14394(sprxzn2.cfr_renamed_91, null);
        Iterator iterator2 = iterator = sprxzn2.cfr_renamed_4.iterator();
        while (iterator2.hasNext()) {
            String string = (String)iterator.next();
            iterator2 = iterator;
            sprewn2.cfr_renamed_14824(string);
        }
    }

    @Override
    public void cfr_renamed_14295(sprfy arg0) {
        sprxzn sprxzn2 = this;
        super.cfr_renamed_14295(arg0);
        sprxzn2.cfr_renamed_119.cfr_renamed_14291(arg0);
    }

    private /* synthetic */ sprpdja cfr_renamed_14801() {
        sprpdja sprpdja2 = new sprpdja();
        spryjn spryjn2 = new spryjn(sprpdja2);
        sprxzn sprxzn2 = this;
        spryjn spryjn3 = spryjn2;
        spryjn spryjn4 = spryjn2;
        sprxzn sprxzn3 = this;
        sprxzn.cfr_renamed_14825(spryjn4, sprxzn3.cfr_renamed_119.cfr_renamed_13550(), cfr_renamed_3, this.cfr_renamed_13973());
        sprxzn.cfr_renamed_14815(spryjn4);
        sprxzn.cfr_renamed_14816(spryjn3, sprxzn3.cfr_renamed_13976(), false);
        sprewn sprewn2 = sprxzn2.cfr_renamed_14817(spryjn2, this.cfr_renamed_91);
        sprxzn.cfr_renamed_14818(spryjn3, sprxzn2.cfr_renamed_13550().cfr_renamed_1452() - this.cfr_renamed_91.cfr_renamed_13265() - 1.0f);
        sprxzn.cfr_renamed_14819(spryjn2, 0.0f, 0.0f);
        sprxzn sprxzn4 = this;
        sprxzn.cfr_renamed_14820(spryjn2, (String)sprxzn4.cfr_renamed_4.get(sprxzn4.cfr_renamed_2), sprewn2);
        sprxzn.cfr_renamed_14821(spryjn2);
        return sprpdja2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public void cfr_renamed_14806(spryjn spryjn2) {
        int n;
        void arg0;
        arg0.cfr_renamed_11835(sprkxb.cfr_renamed_9("\u0014\u0019K\"\u001b\r"));
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.size()) {
            String string = (String)this.cfr_renamed_4.get(n);
            arg0.cfr_renamed_14306(string);
            arg0.cfr_renamed_14055();
            n2 = ++n;
        }
        arg0.cfr_renamed_11835("]");
        sprxzn sprxzn2 = this;
        arg0.cfr_renamed_14286(sprjlp.cfr_renamed_9("x\b"), (String)sprxzn2.cfr_renamed_4.get(sprxzn2.cfr_renamed_2));
        void v3 = arg0;
        void v4 = arg0;
        sprxzn sprxzn3 = this;
        v4.cfr_renamed_14310((String)((Object)cfr_renamed_119), sprxzn3.cfr_renamed_14814(this.cfr_renamed_91, sprxzn3.cfr_renamed_13976()), false);
        v4.cfr_renamed_11835((String)((Object)cfr_renamed_4));
        v4.cfr_renamed_14086();
        v3.cfr_renamed_14058(cfr_renamed_107);
        v3.cfr_renamed_11835(this.cfr_renamed_119.cfr_renamed_4570());
        v3.cfr_renamed_14061();
    }

    private /* synthetic */ sprphja cfr_renamed_14826() {
        int n;
        sprxzn sprxzn2 = this;
        float f = sprxzn2.cfr_renamed_91.cfr_renamed_13265();
        float f2 = sprxzn2.cfr_renamed_91.cfr_renamed_13265();
        int n2 = n = 0;
        while (n2 < this.cfr_renamed_4.size()) {
            sprphja sprphja2;
            String string = (String)this.cfr_renamed_4.get(n);
            sprphja sprphja3 = this.cfr_renamed_91.cfr_renamed_13729(string);
            if (sprphja2.cfr_renamed_1942() > f) {
                f = sprphja3.cfr_renamed_1942();
            }
            if (sprphja3.cfr_renamed_1452() > f2) {
                f2 = sprphja3.cfr_renamed_1452();
            }
            n2 = ++n;
        }
        return new sprphja(f, f2);
    }

    private /* synthetic */ void cfr_renamed_14800() {
        this.cfr_renamed_119 = new sprpbo(this.cfr_renamed_2820());
        this.cfr_renamed_119.cfr_renamed_13579(new sprgeja(0.0f, 0.0f, this.cfr_renamed_13550().cfr_renamed_1942(), this.cfr_renamed_13550().cfr_renamed_1452()));
        this.cfr_renamed_119.cfr_renamed_14292(this.cfr_renamed_14801());
    }

    @Override
    public int cfr_renamed_14809() {
        return 0x20000 | super.cfr_renamed_14809();
    }

    private /* synthetic */ sprgeja cfr_renamed_14822() {
        float f;
        sprxzn sprxzn2 = this;
        sprphja sprphja2 = sprxzn2.cfr_renamed_14826();
        float f2 = sprxzn2.cfr_renamed_13110().cfr_renamed_1980() - 1.75f;
        float f3 = sprxzn2.cfr_renamed_13110().spr\u3181();
        float f4 = f2 + sprphja2.cfr_renamed_1942() + 10.0f + 3.5f;
        float f5 = f3 - sprphja2.cfr_renamed_1452() - 2.0f;
        f5 = f < 0.0f ? 0.0f : f5;
        f4 = f4 > this.cfr_renamed_102.cfr_renamed_1942() ? this.cfr_renamed_102.cfr_renamed_1942() : f4;
        return sprgeja.cfr_renamed_14827(f2, f5, f4, f3);
    }

    @Override
    @sprtea
    public sprgeja cfr_renamed_13550() {
        return this.cfr_renamed_1;
    }

    @Override
    public int cfr_renamed_14810() {
        return 2;
    }
}

