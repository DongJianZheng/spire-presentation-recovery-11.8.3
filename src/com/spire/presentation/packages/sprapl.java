/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spreyl;
import com.spire.presentation.packages.sprfam;
import com.spire.presentation.packages.sprhx;
import com.spire.presentation.packages.sprqpja;
import com.spire.presentation.packages.sprrdm;
import com.spire.presentation.packages.sprtpl;
import com.spire.presentation.packages.sprtr;
import com.spire.presentation.packages.sprxqy;
import com.spire.presentation.packages.sprxwl;

public class sprapl
implements sprtr {
    private boolean cfr_renamed_4;

    public sprapl() {
        this(true);
    }

    @Override
    public void cfr_renamed_5183(sprhx arg0) {
        sprapl sprapl2 = (sprapl)arg0;
        this.cfr_renamed_4 = sprapl2.cfr_renamed_4;
    }

    @Override
    public sprhx cfr_renamed_461() {
        return new sprapl(this.cfr_renamed_4);
    }

    @Override
    public void cfr_renamed_10893(sprxwl arg0, sprtpl arg1) throws spreyl {
        sprxwl sprxwl2 = arg0;
        sprxwl2.cfr_renamed_10894(sprrdm.cfr_renamed_272);
        if (!sprxwl2.cfr_renamed_4248()) {
            sprfam sprfam2 = sprfam.cfr_renamed_5322(arg1.cfr_renamed_98());
            if (sprfam2 != null) {
                if (!sprfam2.cfr_renamed_4249(4)) {
                    throw new spreyl(sprqpja.cfr_renamed_9(">U\u0004S\u0012TWE\u0012T\u0003O\u0011O\u0014G\u0003CWm\u0012_\"U\u0016A\u0012\u0006\u0012^\u0003C\u0019U\u001eI\u0019\u0006\u0013I\u0012UWH\u0018RWV\u0012T\u001aO\u0003\u0006\u001cC\u000e\u0006\u0004O\u0010H\u001eH\u0010"));
                }
            } else if (this.cfr_renamed_4) {
                throw new spreyl(sprxqy.cfr_renamed_9("j?X\u000fR;F?\u0001?Y.D4R3N4\u00014N.\u0001*S?R?O.\u00013Ozb\u001b\u00019D(U3G3B;U?"));
            }
        }
    }

    public sprapl(boolean bl) {
        this.cfr_renamed_4 = bl;
    }
}

