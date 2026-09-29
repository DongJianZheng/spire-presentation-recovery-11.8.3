/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbj;
import com.spire.presentation.packages.spriqy;
import com.spire.presentation.packages.sprlnk;
import com.spire.presentation.packages.sprmcp;
import com.spire.presentation.packages.sprsfk;
import com.spire.presentation.packages.spruek;
import com.spire.presentation.packages.sprwgk;
import com.spire.presentation.packages.spryye;

public class sprdjk
implements sprbj {
    private spryye cfr_renamed_2;
    private spryye cfr_renamed_3;
    private spryye cfr_renamed_4;

    /*
     * WARNING - void declaration
     */
    public sprdjk(spryye spryye2, spryye spryye3, spryye spryye4) {
        sprdjk sprdjk2;
        spryye arg2;
        void arg1;
        void arg0;
        if (spryye2 == null) {
            throw new NullPointerException(sprmcp.cfr_renamed_9("adsd{sBb{fsdw[wi2ss~|\u007ff0pu2~g|~"));
        }
        if (!(arg0 instanceof sprsfk) && !(arg0 instanceof spruek)) {
            throw new IllegalArgumentException(spriqy.cfr_renamed_9("\u0006C\u0005TIu[\u0018\\\u001cP\r\bC\r\r1\u0019]\u0015I]\b_\b@\bY\f_\u001a\r\nL\u0007\r\u000bHIX\u001aH\r"));
        }
        if (arg1 == null) {
            throw new NullPointerException(sprmcp.cfr_renamed_9("ubxw}wbs|Bb{fsdw[wi2ss~|\u007ff0pu2~g|~"));
        }
        if (!arg0.getClass().isAssignableFrom(arg1.getClass())) {
            throw new IllegalArgumentException(spriqy.cfr_renamed_9("^\u001dL\u001dD\n\r\bC\r\r\f]\u0001H\u0004H\u001bL\u0005\r\u0019_\u0000[\bY\f\r\u0002H\u0010^IE\b[\f\r\rD\u000fK\f_\fC\u001d\r\rB\u0004L\u0000CI]\b_\b@\fY\f_\u001a"));
        }
        if (arg2 == null) {
            if (arg1 instanceof sprsfk) {
                arg2 = ((sprsfk)arg1).cfr_renamed_9432();
                sprdjk2 = this;
            } else {
                arg2 = ((spruek)arg1).cfr_renamed_9432();
                sprdjk2 = this;
            }
        } else {
            if (arg2 instanceof sprlnk && !(arg0 instanceof sprsfk)) {
                throw new IllegalArgumentException(sprmcp.cfr_renamed_9("ubxw}wbs|2`gr~yq0yuk0zqa0vytvwbw~f0v\u007f\u007fq{~2`sbs}wdwba"));
            }
            if (arg2 instanceof sprwgk && !(arg0 instanceof spruek)) {
                throw new IllegalArgumentException(spriqy.cfr_renamed_9("H\u0019E\f@\f_\bAI]\u001cO\u0005D\n\r\u0002H\u0010\r\u0001L\u001a\r\rD\u000fK\f_\fC\u001d\r\rB\u0004L\u0000CI]\b_\b@\fY\f_\u001a"));
            }
            sprdjk2 = this;
        }
        sprdjk2.cfr_renamed_2 = arg0;
        sprdjk sprdjk3 = this;
        sprdjk3.cfr_renamed_3 = arg1;
        sprdjk3.cfr_renamed_4 = arg2;
    }

    public spryye cfr_renamed_2096() {
        return this.cfr_renamed_4;
    }

    public sprdjk(spryye arg0, spryye arg1) {
        this(arg0, arg1, null);
    }

    public spryye cfr_renamed_2095() {
        return this.cfr_renamed_2;
    }

    public spryye cfr_renamed_2094() {
        return this.cfr_renamed_3;
    }
}

