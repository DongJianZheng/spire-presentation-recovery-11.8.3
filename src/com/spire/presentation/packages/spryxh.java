/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spralz;
import com.spire.presentation.packages.sprci;
import com.spire.presentation.packages.sprdum;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprmsh;
import com.spire.presentation.packages.sprqo;
import com.spire.presentation.packages.sprtrm;
import com.spire.presentation.packages.sprxum;
import java.security.spec.AlgorithmParameterSpec;

public class spryxh
implements AlgorithmParameterSpec,
sprci {
    private String cfr_renamed_1;
    private String cfr_renamed_2;
    private sprmsh cfr_renamed_3;
    private String cfr_renamed_4;

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public spryxh(String string, String string2, String string3) {
        void arg2;
        void arg1;
        sprtrm sprtrm2;
        String arg0;
        sprtrm sprtrm3 = null;
        try {
            sprtrm2 = sprtrm3 = sprdum.cfr_renamed_7994(new sprlem(arg0));
        }
        catch (IllegalArgumentException illegalArgumentException) {
            sprlem sprlem2 = sprdum.cfr_renamed_2103(arg0);
            if (sprlem2 != null) {
                sprlem sprlem3 = sprlem2;
                arg0 = sprlem3.cfr_renamed_19();
                sprtrm3 = sprdum.cfr_renamed_7994(sprlem3);
            }
            sprtrm2 = sprtrm3;
        }
        if (sprtrm2 == null) {
            throw new IllegalArgumentException(spralz.cfr_renamed_9("L\u0012\u0002\u0016G\u0004\u0002\rC\u000fC\u0010G\tG\u000f\u0002\u000eG\t\u0002\u001bM\u000f\u0002\rC\u000eQ\u0018F]K\u0013\u0002\u0013C\u0010GRm4fS"));
        }
        spryxh spryxh2 = this;
        this.cfr_renamed_3 = new sprmsh(sprtrm3.cfr_renamed_1155(), sprtrm3.cfr_renamed_1604(), sprtrm3.cfr_renamed_1778());
        spryxh2.cfr_renamed_4 = arg0;
        spryxh2.cfr_renamed_1 = arg1;
        this.cfr_renamed_2 = arg2;
    }

    public int hashCode() {
        return this.cfr_renamed_3.hashCode() ^ this.cfr_renamed_1.hashCode() ^ (this.cfr_renamed_2 != null ? this.cfr_renamed_2.hashCode() : 0);
    }

    @Override
    public String cfr_renamed_2101() {
        return this.cfr_renamed_2;
    }

    @Override
    public String cfr_renamed_2109() {
        return this.cfr_renamed_4;
    }

    /*
     * WARNING - void declaration
     */
    public spryxh(sprmsh sprmsh2) {
        void arg0;
        spryxh spryxh2 = this;
        spryxh2.cfr_renamed_3 = arg0;
        spryxh2.cfr_renamed_1 = sprqo.cfr_renamed_133.cfr_renamed_19();
        spryxh2.cfr_renamed_2 = null;
    }

    public boolean equals(Object arg0) {
        if (arg0 instanceof spryxh) {
            spryxh spryxh2 = (spryxh)arg0;
            return this.cfr_renamed_3.equals(spryxh2.cfr_renamed_3) && this.cfr_renamed_1.equals(spryxh2.cfr_renamed_1) && (this.cfr_renamed_2 == spryxh2.cfr_renamed_2 || this.cfr_renamed_2 != null && this.cfr_renamed_2.equals(spryxh2.cfr_renamed_2));
        }
        return false;
    }

    public static spryxh cfr_renamed_9051(sprxum arg0) {
        if (arg0.cfr_renamed_2105() != null) {
            return new spryxh(arg0.cfr_renamed_2106().cfr_renamed_19(), arg0.cfr_renamed_2107().cfr_renamed_19(), arg0.cfr_renamed_2105().cfr_renamed_19());
        }
        return new spryxh(arg0.cfr_renamed_2106().cfr_renamed_19(), arg0.cfr_renamed_2107().cfr_renamed_19());
    }

    @Override
    public String cfr_renamed_2108() {
        return this.cfr_renamed_1;
    }

    public spryxh(String arg0) {
        this(arg0, sprqo.cfr_renamed_133.cfr_renamed_19(), null);
    }

    public spryxh(String arg0, String arg1) {
        this(arg0, arg1, null);
    }

    @Override
    public sprmsh cfr_renamed_130() {
        return this.cfr_renamed_3;
    }
}

