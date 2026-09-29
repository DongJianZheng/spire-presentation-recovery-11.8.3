/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spra;
import com.spire.presentation.packages.sprase;
import com.spire.presentation.packages.sprbf;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprjpe;
import com.spire.presentation.packages.sprjwe;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprnuc;
import com.spire.presentation.packages.sprre;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprxwd;
import com.spire.presentation.packages.sprxwg;
import com.spire.presentation.packages.sprzod;

public class sprtod
implements sprre {
    public static final int cfr_renamed_0 = 0;
    private static final sprtzd cfr_renamed_1 = sprbf.cfr_renamed_0;
    public static final int cfr_renamed_2 = 2;
    public static final int cfr_renamed_3 = 1;
    private final sprjpe cfr_renamed_4;

    public sprtod(sprjpe sprjpe2) {
        this.cfr_renamed_4 = sprjpe2;
    }

    @Override
    public sprtzd cfr_renamed_324() {
        return cfr_renamed_1;
    }

    public int cfr_renamed_4340() {
        return this.cfr_renamed_4.cfr_renamed_324();
    }

    public boolean cfr_renamed_4341() {
        return !sprjwe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_97()).cfr_renamed_4342();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprxwd cfr_renamed_4343() throws sprzod {
        try {
            sprjwe sprjwe2 = sprjwe.cfr_renamed_23(this.cfr_renamed_4.cfr_renamed_97());
            sprase sprase2 = sprase.cfr_renamed_23(sprjwe2.cfr_renamed_97());
            return new sprxwd(new sprnte(sprgl.cfr_renamed_2, sprase2));
        }
        catch (sprlqd sprlqd2) {
            throw new sprzod(new StringBuilder().insert(0, sprnuc.cfr_renamed_9("w[g6DwFe]xS6QdFyF,\u0014")).append(sprlqd2.getMessage()).toString(), sprlqd2.getCause());
        }
        catch (Exception exception) {
            throw new sprzod(new StringBuilder().insert(0, sprxwg.cfr_renamed_9("]JS^>h\u007fjmqp\u007f>}ljqj$8")).append(exception.getMessage()).toString(), exception);
        }
    }

    @Override
    public spra cfr_renamed_97() {
        return this.cfr_renamed_4;
    }
}

