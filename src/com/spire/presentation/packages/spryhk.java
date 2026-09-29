/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprge;
import com.spire.presentation.packages.sprgmh;
import com.spire.presentation.packages.sprhjh;
import com.spire.presentation.packages.sprjn;
import com.spire.presentation.packages.sprjvj;
import com.spire.presentation.packages.sprlrg;
import com.spire.presentation.packages.sprnik;
import com.spire.presentation.packages.sprowj;
import com.spire.presentation.packages.sprrih;
import com.spire.presentation.packages.sprsp;
import com.spire.presentation.packages.sprywg;
import java.io.IOException;
import java.io.OutputStream;

public class spryhk
implements sprjn {
    private final sprhjh cfr_renamed_4;

    public sprnik cfr_renamed_8258() {
        return new sprnik(this.cfr_renamed_4.cfr_renamed_8295().cfr_renamed_8258());
    }

    public boolean cfr_renamed_9571(sprsp arg0) throws Exception {
        sprge sprge2 = arg0.cfr_renamed_576(this.cfr_renamed_4.cfr_renamed_79().cfr_renamed_8227());
        OutputStream outputStream = sprge2.cfr_renamed_470();
        spryhk spryhk2 = this;
        outputStream.write(sprrih.cfr_renamed_8165(spryhk2.cfr_renamed_4.cfr_renamed_8295(), sprlrg.cfr_renamed_135.cfr_renamed_1451()));
        outputStream.close();
        return sprge2.cfr_renamed_1435(sprowj.cfr_renamed_9519(spryhk2.cfr_renamed_4.cfr_renamed_79()));
    }

    public sprhjh cfr_renamed_568() {
        return this.cfr_renamed_4;
    }

    public sprjvj cfr_renamed_9572() {
        sprywg sprywg2 = this.cfr_renamed_4.cfr_renamed_8295().cfr_renamed_8221();
        if (sprywg2 != null) {
            return new sprjvj(sprywg2);
        }
        return null;
    }

    public sprgmh cfr_renamed_102() {
        return this.cfr_renamed_4.cfr_renamed_102();
    }

    @Override
    public byte[] cfr_renamed_91() throws IOException {
        return sprrih.cfr_renamed_8165(this.cfr_renamed_4, sprlrg.cfr_renamed_953.cfr_renamed_1451());
    }

    public spryhk(sprhjh sprhjh2) {
        this.cfr_renamed_4 = sprhjh2;
    }
}

