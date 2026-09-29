/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.sprhqd;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprnte;
import com.spire.presentation.packages.sprqod;
import com.spire.presentation.packages.sprrve;
import com.spire.presentation.packages.spryxd;
import com.spire.presentation.packages.sprzte;
import java.io.InputStream;

public class sprjyd {
    public sprnte cfr_renamed_119;
    private sprije cfr_renamed_91;
    private sprrve cfr_renamed_0;
    private sprere cfr_renamed_1;
    public spryxd cfr_renamed_2;
    private byte[] cfr_renamed_3;
    private sprere cfr_renamed_4;

    public sprjyd(byte[] arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4106(arg0));
    }

    public sprjyd(sprnte arg0) throws sprlqd {
        sprjyd sprjyd2 = this;
        sprjyd sprjyd3 = this;
        sprjyd3.cfr_renamed_119 = arg0;
        sprzte sprzte2 = sprzte.cfr_renamed_23(arg0.cfr_renamed_480());
        sprjyd3.cfr_renamed_0 = sprzte2.cfr_renamed_4170();
        sprzte sprzte3 = sprzte2;
        sprere sprere2 = sprzte3.cfr_renamed_4171();
        sprjyd2.cfr_renamed_91 = sprzte3.cfr_renamed_4189().cfr_renamed_4173();
        sprqod sprqod2 = new sprqod(this);
        this.cfr_renamed_2 = sprhqd.cfr_renamed_4157(sprere2, this.cfr_renamed_91, sprqod2);
        sprjyd2.cfr_renamed_1 = sprzte2.cfr_renamed_4190();
        sprjyd2.cfr_renamed_3 = sprzte2.cfr_renamed_1472().cfr_renamed_186();
        sprjyd2.cfr_renamed_4 = sprzte2.cfr_renamed_4191();
    }

    public sprjyd(InputStream arg0) throws sprlqd {
        this(sprerd.cfr_renamed_4104(arg0));
    }
}

