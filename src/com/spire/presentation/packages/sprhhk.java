/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprdkk;
import com.spire.presentation.packages.spres;
import com.spire.presentation.packages.sprkfk;
import com.spire.presentation.packages.sprkt;
import com.spire.presentation.packages.sprnmk;
import com.spire.presentation.packages.sprox;
import com.spire.presentation.packages.sprsy;
import com.spire.presentation.packages.spryz;
import java.util.Set;
import javax.net.ssl.SSLSocketFactory;

public class sprhhk
implements sprox {
    private final spryz cfr_renamed_119;
    private final sprsy cfr_renamed_91;
    private final boolean cfr_renamed_0;
    private final spres cfr_renamed_1;
    private final Set<String> cfr_renamed_2;
    private final int cfr_renamed_3;
    private final Long cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    @Override
    public sprkt cfr_renamed_9729() throws sprkfk {
        try {
            SSLSocketFactory sSLSocketFactory = this.cfr_renamed_91.cfr_renamed_9709();
            sprhhk sprhhk2 = this;
            sprhhk sprhhk3 = this;
            sprhhk sprhhk4 = this;
            return new sprdkk(new sprnmk(sSLSocketFactory, sprhhk2.cfr_renamed_119, sprhhk2.cfr_renamed_3, sprhhk3.cfr_renamed_1, sprhhk3.cfr_renamed_2, sprhhk4.cfr_renamed_4, sprhhk4.cfr_renamed_0));
        }
        catch (Exception exception) {
            throw new sprkfk(exception.getMessage(), exception.getCause());
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprhhk(spryz spryz2, sprsy sprsy2, int n, spres spres2, Set<String> set, Long l, boolean bl) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprhhk sprhhk2 = this;
        sprhhk sprhhk3 = this;
        sprhhk sprhhk4 = this;
        this.cfr_renamed_119 = arg0;
        sprhhk4.cfr_renamed_91 = arg1;
        sprhhk4.cfr_renamed_3 = arg2;
        sprhhk3.cfr_renamed_1 = arg3;
        sprhhk3.cfr_renamed_2 = arg4;
        sprhhk2.cfr_renamed_4 = arg5;
        sprhhk2.cfr_renamed_0 = bl;
    }

    @Override
    public boolean cfr_renamed_9710() {
        return this.cfr_renamed_91.cfr_renamed_9710();
    }
}

