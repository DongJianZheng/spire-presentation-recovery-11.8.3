/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprao;
import com.spire.presentation.packages.sprgre;
import com.spire.presentation.packages.sprhvd;
import com.spire.presentation.packages.sprlme;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprqpb;
import com.spire.presentation.packages.sprun;
import com.spire.presentation.packages.spruua;
import com.spire.presentation.packages.sprwf;
import com.spire.presentation.packages.sprwl;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprtwd
extends spruua {
    /*
     * WARNING - void declaration
     */
    public sprtwd(byte[] byArray) throws sprlqd {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhvd cfr_renamed_4186(sprun arg0) throws sprlqd {
        try {
            sprlme sprlme2 = new sprlme((sprao)this.cfr_renamed_4.cfr_renamed_697(16));
            sprgre sprgre2 = sprlme2.cfr_renamed_2589();
            sprwl sprwl2 = arg0.cfr_renamed_578(sprlme2.cfr_renamed_4187());
            sprwf sprwf2 = (sprwf)sprgre2.cfr_renamed_697(4);
            return new sprhvd(sprgre2.cfr_renamed_696().cfr_renamed_19(), sprwl2.cfr_renamed_1447(sprwf2.cfr_renamed_698()));
        }
        catch (IOException iOException) {
            throw new sprlqd(sprqpb.cfr_renamed_9(";S7d\u0011y\u0002h\u001bs\u001c<\u0000y\u0013x\u001br\u0015<\u0011s\u001fl\u0000y\u0001o\u0017xR\u007f\u001dr\u0006y\u001ch\\"), iOException);
        }
    }

    public sprtwd(InputStream arg0) throws sprlqd {
        super(arg0);
    }
}

