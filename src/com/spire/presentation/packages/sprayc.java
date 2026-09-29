/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraed;
import com.spire.presentation.packages.sprfzc;
import com.spire.presentation.packages.sprh;
import com.spire.presentation.packages.sprhgb;
import com.spire.presentation.packages.sprkbd;
import com.spire.presentation.packages.sprlc;
import com.spire.presentation.packages.sprmnd;
import com.spire.presentation.packages.sprmtc;
import com.spire.presentation.packages.sprpmd;
import com.spire.presentation.packages.sprrcd;
import com.spire.presentation.packages.sprt;
import com.spire.presentation.packages.sprta;
import com.spire.presentation.packages.sprvmd;
import com.spire.presentation.packages.sprxzc;
import com.spire.presentation.packages.sprzsc;
import com.spire.presentation.packages.sprzuc;
import com.spire.presentation.packages.sprzvc;

public class sprayc
extends sprxzc {
    @Override
    public sprta cfr_renamed_2809(sprzuc arg0, sprhgb arg1) {
        return this.cfr_renamed_2893(arg0, false, true, new spraed(arg1, this.cfr_renamed_4.cfr_renamed_2794()));
    }

    public sprta cfr_renamed_2893(sprzuc arg0, boolean arg1, boolean arg2, sprt arg3) {
        sprta sprta2;
        sprta sprta3;
        sprzuc sprzuc2;
        sprlc sprlc2;
        sprayc sprayc2;
        boolean bl;
        if (arg0 != null) {
            bl = true;
            sprayc2 = this;
        } else {
            bl = false;
            sprayc2 = this;
        }
        if (bl != sprzsc.cfr_renamed_2631(sprayc2.cfr_renamed_4)) {
            throw new IllegalStateException();
        }
        if (arg0 != null && arg0.cfr_renamed_79() != 1) {
            throw new IllegalStateException();
        }
        if (arg1) {
            sprlc2 = new sprmnd();
            sprzuc2 = arg0;
        } else if (arg0 == null) {
            sprlc2 = new sprfzc();
            sprzuc2 = arg0;
        } else {
            sprzuc sprzuc3 = arg0;
            sprzuc2 = sprzuc3;
            sprlc2 = sprzsc.cfr_renamed_2640(sprzuc3.cfr_renamed_2690());
        }
        if (sprzuc2 != null) {
            sprta3 = new sprzvc(sprlc2, sprzsc.cfr_renamed_2722(arg0.cfr_renamed_2690()));
            sprta2 = sprta3;
        } else {
            sprta3 = new sprkbd(this.cfr_renamed_2894(), sprlc2);
            sprta2 = sprta3;
        }
        sprta2.cfr_renamed_1217(arg2, arg3);
        return sprta3;
    }

    @Override
    public boolean cfr_renamed_2787(sprhgb arg0) {
        return arg0 instanceof sprmtc && !arg0.cfr_renamed_1352();
    }

    @Override
    public byte[] cfr_renamed_2808(sprzuc arg0, sprhgb arg1, byte[] arg2) throws sprvmd {
        sprta sprta2 = this.cfr_renamed_2893(arg0, true, true, new spraed(arg1, this.cfr_renamed_4.cfr_renamed_2794()));
        sprta2.cfr_renamed_1197(arg2, 0, arg2.length);
        return sprta2.cfr_renamed_1329();
    }

    public sprh cfr_renamed_2894() {
        return new sprpmd(new sprrcd());
    }

    @Override
    public boolean cfr_renamed_2807(sprzuc arg0, byte[] arg1, sprhgb arg2, byte[] arg3) throws sprvmd {
        sprta sprta2 = this.cfr_renamed_2893(arg0, true, false, arg2);
        sprta2.cfr_renamed_1197(arg3, 0, arg3.length);
        return sprta2.cfr_renamed_1328(arg1);
    }

    @Override
    public sprta cfr_renamed_2795(sprzuc arg0, sprhgb arg1) {
        return this.cfr_renamed_2893(arg0, false, false, arg1);
    }
}

