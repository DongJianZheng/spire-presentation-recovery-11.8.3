/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprbrg;
import com.spire.presentation.packages.sprlsg;
import com.spire.presentation.packages.sprlzg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprtqg;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class sprvsg
extends sprlsg {
    public sprvsg(Collection<sprbrg> arg0) {
        super(arg0);
    }

    /*
     * WARNING - void declaration
     */
    public sprvsg(byte[] byArray) throws IOException, sprtqg {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public sprvsg(InputStream arg0) throws IOException, sprtqg {
        super(arg0, (sprrk)new sprlzg());
    }
}

