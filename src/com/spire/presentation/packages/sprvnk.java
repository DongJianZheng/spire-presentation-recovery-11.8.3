/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprijk;
import com.spire.presentation.packages.sprkt;
import com.spire.presentation.packages.sprlx;
import com.spire.presentation.packages.sprwt;
import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.util.Map;

public class sprvnk {
    public final sprwt cfr_renamed_119;
    public final String cfr_renamed_91;
    public final URL cfr_renamed_0;
    public final sprkt cfr_renamed_1;
    public final byte[] cfr_renamed_2;
    public sprijk cfr_renamed_3;
    public final sprlx cfr_renamed_4;

    public sprkt cfr_renamed_9759() {
        return this.cfr_renamed_1;
    }

    public sprlx cfr_renamed_9738() {
        return this.cfr_renamed_4;
    }

    public sprwt cfr_renamed_9744() {
        return this.cfr_renamed_119;
    }

    public void cfr_renamed_9743(OutputStream arg0) throws IOException {
        if (this.cfr_renamed_2 != null) {
            arg0.write(this.cfr_renamed_2);
        }
    }

    public URL cfr_renamed_2627() {
        return this.cfr_renamed_0;
    }

    public Map<String, String[]> cfr_renamed_479() {
        return (Map)this.cfr_renamed_3.clone();
    }

    /*
     * WARNING - void declaration
     */
    public sprvnk(String string, URL uRL, byte[] byArray, sprwt sprwt2, sprlx sprlx2, sprijk sprijk2, sprkt sprkt2) {
        void arg5;
        void arg4;
        void arg3;
        void arg2;
        void arg1;
        void arg0;
        sprvnk sprvnk2 = this;
        sprvnk sprvnk3 = this;
        sprvnk sprvnk4 = this;
        sprvnk sprvnk5 = this;
        this.cfr_renamed_3 = new sprijk();
        this.cfr_renamed_91 = arg0;
        sprvnk4.cfr_renamed_0 = arg1;
        sprvnk4.cfr_renamed_2 = arg2;
        sprvnk3.cfr_renamed_119 = arg3;
        sprvnk3.cfr_renamed_4 = arg4;
        sprvnk2.cfr_renamed_3 = arg5;
        sprvnk2.cfr_renamed_1 = sprkt2;
    }

    public String cfr_renamed_9742() {
        return this.cfr_renamed_91;
    }
}

