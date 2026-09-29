/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprijk;
import com.spire.presentation.packages.sprkt;
import com.spire.presentation.packages.sprlx;
import com.spire.presentation.packages.sproze;
import com.spire.presentation.packages.sprvnk;
import com.spire.presentation.packages.sprwt;
import java.net.URL;

public class sprmnk {
    public sprwt cfr_renamed_119;
    private final String cfr_renamed_91;
    public sprlx cfr_renamed_0;
    private sprijk cfr_renamed_1;
    private byte[] cfr_renamed_2;
    public sprkt cfr_renamed_3;
    private URL cfr_renamed_4;

    public sprmnk cfr_renamed_9740(String arg0, String arg1) {
        sprmnk sprmnk2 = this;
        sprmnk2.cfr_renamed_1.cfr_renamed_9798(arg0, arg1);
        return sprmnk2;
    }

    public sprmnk cfr_renamed_9741(String arg0, String arg1) {
        sprmnk sprmnk2 = this;
        sprmnk2.cfr_renamed_1.cfr_renamed_9799(arg0, arg1);
        return sprmnk2;
    }

    public sprmnk cfr_renamed_9773(sprkt arg0) {
        this.cfr_renamed_3 = arg0;
        return this;
    }

    public sprmnk cfr_renamed_9788(byte[] arg0) {
        this.cfr_renamed_2 = sproze.cfr_renamed_158(arg0);
        return this;
    }

    public sprmnk cfr_renamed_9777(sprlx arg0) {
        this.cfr_renamed_0 = arg0;
        return this;
    }

    public sprvnk cfr_renamed_1451() {
        sprmnk sprmnk2 = this;
        sprmnk sprmnk3 = this;
        sprmnk sprmnk4 = this;
        return new sprvnk(sprmnk2.cfr_renamed_91, sprmnk2.cfr_renamed_4, sprmnk3.cfr_renamed_2, sprmnk3.cfr_renamed_119, sprmnk4.cfr_renamed_0, sprmnk4.cfr_renamed_1, this.cfr_renamed_3);
    }

    /*
     * WARNING - void declaration
     */
    public sprmnk(String string, URL uRL) {
        void arg0;
        sprmnk sprmnk2 = this;
        sprmnk2.cfr_renamed_91 = arg0;
        sprmnk2.cfr_renamed_4 = uRL;
        sprmnk sprmnk3 = this;
        sprmnk2.cfr_renamed_1 = new sprijk();
    }

    public sprmnk cfr_renamed_9735(URL arg0) {
        this.cfr_renamed_4 = arg0;
        return this;
    }

    public sprmnk cfr_renamed_9758(sprwt arg0) {
        this.cfr_renamed_119 = arg0;
        return this;
    }

    /*
     * WARNING - void declaration
     */
    public sprmnk(sprvnk sprvnk2) {
        void arg0;
        sprmnk sprmnk2 = this;
        void v1 = arg0;
        sprmnk sprmnk3 = this;
        void v3 = arg0;
        this.cfr_renamed_91 = v3.cfr_renamed_91;
        sprmnk3.cfr_renamed_4 = v3.cfr_renamed_0;
        sprmnk3.cfr_renamed_0 = arg0.cfr_renamed_4;
        this.cfr_renamed_2 = v1.cfr_renamed_2;
        sprmnk2.cfr_renamed_119 = v1.cfr_renamed_119;
        sprmnk2.cfr_renamed_1 = (sprijk)sprvnk2.cfr_renamed_3.clone();
        this.cfr_renamed_3 = arg0.cfr_renamed_9759();
    }
}

