/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmnd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprubd;
import com.spire.presentation.packages.spruj;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprxzc;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;

public abstract class sprjzc
extends sprxzc {
    public abstract short cfr_renamed_89();

    public sprt cfr_renamed_3026(boolean arg0, sprt arg1) {
        return arg1;
    }

    @Override
    public sprta cfr_renamed_2795(sprzuc arg0, sprhgb arg1) {
        return this.cfr_renamed_2893(arg0, false, false, arg1);
    }

    @Override
    public boolean cfr_renamed_2807(sprzuc arg0, byte[] arg1, sprhgb arg2, byte[] arg3) throws sprvmd {
        sprta sprta2;
        sprta sprta3 = this.cfr_renamed_2893(arg0, true, false, arg2);
        if (arg0 == null) {
            sprta sprta4 = sprta3;
            sprta2 = sprta4;
            sprta4.cfr_renamed_1197(arg3, 16, 20);
        } else {
            sprta3.cfr_renamed_1197(arg3, 0, arg3.length);
            sprta2 = sprta3;
        }
        return sprta2.cfr_renamed_1328(arg1);
    }

    @Override
    public byte[] cfr_renamed_2808(sprzuc arg0, sprhgb arg1, byte[] arg2) throws sprvmd {
        sprta sprta2;
        sprta sprta3 = this.cfr_renamed_2893(arg0, true, true, new spraed(arg1, this.cfr_renamed_4.cfr_renamed_2794()));
        if (arg0 == null) {
            sprta sprta4 = sprta3;
            sprta2 = sprta4;
            sprta4.cfr_renamed_1197(arg2, 16, 20);
        } else {
            sprta3.cfr_renamed_1197(arg2, 0, arg2.length);
            sprta2 = sprta3;
        }
        return sprta2.cfr_renamed_1329();
    }

    public sprta cfr_renamed_2893(sprzuc arg0, boolean arg1, boolean arg2, sprt arg3) {
        sprjzc sprjzc2;
        boolean bl;
        if (arg0 != null) {
            bl = true;
            sprjzc2 = this;
        } else {
            bl = false;
            sprjzc2 = this;
        }
        if (bl != sprzsc.cfr_renamed_2631(sprjzc2.cfr_renamed_4)) {
            throw new IllegalStateException();
        }
        if (arg0 != null && (arg0.cfr_renamed_2690() != 2 || arg0.cfr_renamed_79() != this.cfr_renamed_89())) {
            throw new IllegalStateException();
        }
        short s = arg0 == null ? (short)2 : (short)arg0.cfr_renamed_2690();
        sprlc sprlc2 = arg1 ? new sprmnd() : sprzsc.cfr_renamed_2640(s);
        sprubd sprubd2 = new sprubd(this.cfr_renamed_2983(s), sprlc2);
        boolean bl2 = arg2;
        sprubd2.cfr_renamed_1217(bl2, this.cfr_renamed_3026(bl2, arg3));
        return sprubd2;
    }

    @Override
    public sprta cfr_renamed_2809(sprzuc arg0, sprhgb arg1) {
        return this.cfr_renamed_2893(arg0, false, true, arg1);
    }

    public abstract spruj cfr_renamed_2983(short var1);
}

