/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprakp;
import com.spire.presentation.packages.spreed;
import com.spire.presentation.packages.sprjjo;
import com.spire.presentation.packages.sprlf;
import com.spire.presentation.packages.sprrhd;
import com.spire.presentation.packages.sprrlb;
import com.spire.presentation.packages.sprt;

public class sprsfd
implements sprlf {
    private spreed cfr_renamed_4;

    @Override
    public sprrlb cfr_renamed_3745(sprrhd arg0) {
        if (this.cfr_renamed_4 == null) {
            throw new IllegalStateException(sprjjo.cfr_renamed_9("c\"c\ra\u0000K\u0000J%C\u0002T\u0018V\u0015I\u0013\u0006\u000fI\u0015\u0006\bH\bR\bG\rO\u0012C\u0005"));
        }
        sprrhd sprrhd2 = arg0;
        sprrlb sprrlb2 = sprrhd2.cfr_renamed_1980().cfr_renamed_1830(this.cfr_renamed_4.cfr_renamed_2112());
        return sprrhd2.spr\u3181().cfr_renamed_1975(sprrlb2).cfr_renamed_1775();
    }

    @Override
    public void cfr_renamed_1524(sprt arg0) {
        if (!(arg0 instanceof spreed)) {
            throw new IllegalArgumentException(sprakp.cfr_renamed_9("\u007f'j\u0016S\u0012[\u0010_/_\u001dj\u0005H\u0005W\u0001N\u0001H\u0017\u001a\u0005H\u0001\u001a\u0016_\u0015O\rH\u0001^D\\\u000bHD^\u0001Y\u0016C\u0014N\rU\n\u0014"));
        }
        this.cfr_renamed_4 = (spreed)arg0;
    }
}

