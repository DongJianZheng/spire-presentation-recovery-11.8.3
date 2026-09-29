/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprebp;
import com.spire.presentation.packages.sprfqn;
import com.spire.presentation.packages.sprlsn;
import com.spire.presentation.packages.sproin;
import com.spire.presentation.packages.sprsmn;
import com.spire.presentation.packages.sprsuja;
import com.spire.presentation.packages.sprtea;
import com.spire.presentation.packages.sprtqn;
import com.spire.presentation.packages.sprttn;
import com.spire.presentation.packages.sprupn;
import com.spire.presentation.packages.sprxln;
import com.spire.presentation.packages.sprxnn;

@sprtea
public class sprwqn
extends sprsmn {
    private boolean cfr_renamed_3;
    private sproin cfr_renamed_4;

    @Override
    public void cfr_renamed_13186(sprfqn arg0) {
        int n;
        if (arg0.cfr_renamed_13187().cfr_renamed_11861() <= 0) {
            return;
        }
        int n2 = n = 0;
        while (n2 < arg0.cfr_renamed_13187().cfr_renamed_11861()) {
            if (this.cfr_renamed_3) {
                this.cfr_renamed_13166(arg0.cfr_renamed_13187().cfr_renamed_576(0));
                this.cfr_renamed_3 = false;
            } else {
                this.cfr_renamed_13168(arg0.cfr_renamed_13187().cfr_renamed_576(n));
            }
            n2 = ++n;
        }
    }

    private /* synthetic */ void cfr_renamed_13172(sprsuja[] arg0) {
        int n;
        int n2 = n = 0;
        while (n2 < arg0.length) {
            this.cfr_renamed_13851(arg0[n++]);
            n2 = n;
        }
        this.cfr_renamed_4.cfr_renamed_11735(sprttn.cfr_renamed_9("+E:F-D'"));
    }

    private /* synthetic */ void cfr_renamed_13168(sprsuja arg0) {
        sprwqn sprwqn2 = this;
        sprwqn2.cfr_renamed_13851(arg0);
        sprwqn2.cfr_renamed_4.cfr_renamed_11735(sprupn.cfr_renamed_9("\u0018@\u001aL\u0000F"));
    }

    @Override
    public void cfr_renamed_13175(sprxnn arg0) {
        sprsuja[] sprsujaArray;
        if (this.cfr_renamed_3) {
            this.cfr_renamed_13166(arg0.cfr_renamed_13167());
            this.cfr_renamed_3 = false;
        } else {
            this.cfr_renamed_13168(arg0.cfr_renamed_13167());
        }
        sprsuja[] sprsujaArray2 = sprsujaArray = new sprsuja[3];
        sprsujaArray[0] = arg0.cfr_renamed_13169();
        sprsujaArray2[1] = arg0.cfr_renamed_13170();
        sprsujaArray[2] = arg0.cfr_renamed_13171();
        this.cfr_renamed_13172(sprsujaArray2);
    }

    @sprtea
    public void cfr_renamed_14065(sprxln sprxln2) {
        sprwqn sprwqn2 = this;
        sprwqn2.cfr_renamed_4.cfr_renamed_11735(sprttn.cfr_renamed_9("&U?@)D "));
        sprxln2.cfr_renamed_13121(sprwqn2);
    }

    private /* synthetic */ void cfr_renamed_13166(sprsuja arg0) {
        sprwqn sprwqn2 = this;
        sprwqn2.cfr_renamed_13851(arg0);
        sprwqn2.cfr_renamed_4.cfr_renamed_11735(sprupn.cfr_renamed_9("\u0019F\u0002L\u0000F"));
    }

    /*
     * WARNING - void declaration
     */
    @sprtea
    public void cfr_renamed_14091(sprtqn sprtqn2) {
        void arg0;
        sprwqn sprwqn2 = this;
        sprwqn2.cfr_renamed_13166(arg0.cfr_renamed_2);
        sprwqn2.cfr_renamed_13168(sprtqn2.cfr_renamed_3);
    }

    @Override
    public void cfr_renamed_13173(sprlsn arg0) {
        if (arg0.cfr_renamed_13174()) {
            this.cfr_renamed_4.cfr_renamed_11735(sprttn.cfr_renamed_9("+\\'C-@)D "));
        }
    }

    @Override
    public void cfr_renamed_13178(sprlsn arg0) {
        this.cfr_renamed_3 = true;
    }

    @sprtea
    public sprwqn(sproin sproin2) {
        this.cfr_renamed_4 = sproin2;
    }

    private /* synthetic */ void cfr_renamed_13851(sprsuja arg0) {
        sprwqn sprwqn2 = this;
        sprwqn2.cfr_renamed_4.cfr_renamed_14058(sprebp.cfr_renamed_13083(arg0.cfr_renamed_1980()));
        sprwqn2.cfr_renamed_4.cfr_renamed_14058(sprebp.cfr_renamed_13083(arg0.spr\u3181()));
    }
}

