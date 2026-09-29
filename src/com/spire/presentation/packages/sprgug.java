/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprlzg;
import com.spire.presentation.packages.sprrk;
import com.spire.presentation.packages.sprryg;
import com.spire.presentation.packages.sprtbh;
import com.spire.presentation.packages.sprtqg;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collection;

public class sprgug
extends sprryg {
    /*
     * WARNING - void declaration
     */
    public sprgug(byte[] byArray) throws IOException, sprtqg {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public sprgug(InputStream arg0) throws IOException, sprtqg {
        super(arg0, (sprrk)new sprlzg());
    }

    public sprgug(Collection<sprtbh> arg0) {
        super(arg0);
    }
}

