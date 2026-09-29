/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbnk;
import com.spire.presentation.packages.sprlik;
import com.spire.presentation.packages.sprlzg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprux;
import java.io.IOException;
import java.io.InputStream;

public class sprifk
extends sprlik {
    public sprifk(byte[] arg0) throws IOException {
        byte[] byArray = arg0;
        super(arg0, (sprrk)new sprlzg(), (sprux)new sprbnk());
    }

    public sprifk(InputStream arg0) throws IOException {
        super(arg0, (sprrk)new sprlzg(), (sprux)new sprbnk());
    }
}

