/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprkx;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.sprotm;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprrol;
import com.spire.presentation.packages.sprsu;
import com.spire.presentation.packages.sprvye;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class sprjsl
extends sprvye {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprhql cfr_renamed_10816(sprkx arg0) throws sprlyl {
        try {
            sprotm sprotm2 = new sprotm((sprqp)this.cfr_renamed_4.cfr_renamed_697(16));
            sprjvm sprjvm2 = sprotm2.cfr_renamed_2589();
            sprsu sprsu2 = arg0.cfr_renamed_5279(sprotm2.cfr_renamed_4187());
            sprme sprme2 = (sprme)sprjvm2.cfr_renamed_697(4);
            return new sprhql(sprjvm2.cfr_renamed_696(), sprsu2.cfr_renamed_1447(sprme2.cfr_renamed_698()));
        }
        catch (IOException iOException) {
            throw new sprlyl(sprrol.cfr_renamed_9("@@Lwjjy{``g/{jhk`an/j`d\u007f{jz|lk)lfa}jg{'"), iOException);
        }
    }

    /*
     * WARNING - void declaration
     */
    public sprjsl(byte[] byArray) throws sprlyl {
        this(new ByteArrayInputStream((byte[])arg0));
        void arg0;
    }

    public sprjsl(InputStream arg0) throws sprlyl {
        super(arg0);
    }
}

