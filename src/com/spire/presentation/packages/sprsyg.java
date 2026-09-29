/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrg;
import com.spire.presentation.packages.sprlsg;
import com.spire.presentation.packages.sprmwg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprtqg;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class sprsyg
extends sprlsg {
    public sprsyg(InputStream arg0) throws IOException, sprtqg {
        super(arg0, (sprrk)new sprmwg());
    }

    public sprsyg(Collection<sprbrg> arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprsyg(byte[] byArray) throws IOException, sprtqg {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }
}

