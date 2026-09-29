/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprase;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprere;
import com.spire.presentation.packages.spreya;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprgve;
import com.spire.presentation.packages.sprhoe;
import com.spire.presentation.packages.sprhse;
import com.spire.presentation.packages.sprije;
import com.spire.presentation.packages.sprlqd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sproa;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprswd;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprusd;
import com.spire.presentation.packages.spruuia;
import com.spire.presentation.packages.sprvn;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;

public class sprovd
extends sprswd {
    private sprere cfr_renamed_2 = null;
    private int cfr_renamed_3;
    private boolean cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public OutputStream cfr_renamed_4163(OutputStream arg0, sprlre arg1, sproa arg2) throws sprlqd {
        try {
            sprhoe sprhoe2;
            sprhoe sprhoe3;
            sprere sprere2;
            sprhoe sprhoe4 = new sprhoe(arg0);
            sprhoe4.cfr_renamed_4133(sprgl.cfr_renamed_2);
            sprhoe sprhoe5 = new sprhoe(sprhoe4.cfr_renamed_4134(), 0, true);
            if (this.cfr_renamed_4) {
                sprere2 = new sprgve(arg1);
                sprhoe3 = sprhoe5;
            } else {
                sprere2 = new sprcwe(arg1);
                sprhoe3 = sprhoe5;
            }
            sprhoe3.cfr_renamed_4133(new sprooe(sprase.cfr_renamed_4164(this.cfr_renamed_31, sprere2, this.cfr_renamed_2)));
            if (this.cfr_renamed_31 != null) {
                sprhoe5.cfr_renamed_4133(new sprhse(0 != 0, 0, this.cfr_renamed_31));
            }
            sprhoe5.cfr_renamed_4134().write(sprere2.cfr_renamed_91());
            sprhoe sprhoe6 = sprhoe2 = new sprhoe(sprhoe5.cfr_renamed_4134());
            sprhoe6.cfr_renamed_4133(sprgl.cfr_renamed_152);
            sprije sprije2 = arg2.cfr_renamed_615();
            sprhoe6.cfr_renamed_4134().write(sprije2.cfr_renamed_91());
            OutputStream outputStream = sprerd.cfr_renamed_4108(sprhoe6.cfr_renamed_4134(), 0, false, this.cfr_renamed_3);
            return new sprusd(this, arg2.cfr_renamed_1442(outputStream), sprhoe4, sprhoe5, sprhoe2);
        }
        catch (IOException iOException) {
            throw new sprlqd(spruuia.cfr_renamed_9("0U6H%Y<B;\r1H6B1D;JuL9J:_<Y=@u]4_4@0Y0_&\u0003"), iOException);
        }
    }

    public void cfr_renamed_4165(boolean arg0) {
        this.cfr_renamed_4 = arg0;
    }

    /*
     * WARNING - void declaration
     */
    public OutputStream cfr_renamed_4166(OutputStream outputStream, sproa sproa2) throws sprlqd, IOException {
        void arg1;
        void arg0;
        return this.cfr_renamed_4167(new sprtzd(sprgl.cfr_renamed_152.cfr_renamed_19()), (OutputStream)arg0, (sproa)arg1);
    }

    private /* synthetic */ sprooe cfr_renamed_3() {
        if (this.cfr_renamed_31 != null || this.cfr_renamed_2 != null) {
            return new sprooe(2L);
        }
        return new sprooe(0L);
    }

    public OutputStream cfr_renamed_4168(sprtzd arg0, OutputStream arg1, sproa arg2) throws sprlqd, IOException {
        return this.cfr_renamed_4167(arg0, arg1, arg2);
    }

    private /* synthetic */ OutputStream cfr_renamed_4167(sprtzd arg0, OutputStream arg1, sproa arg2) throws IOException, sprlqd {
        Iterator iterator;
        sprlre sprlre2 = new sprlre();
        spreya spreya2 = arg2.cfr_renamed_1521();
        Iterator iterator2 = iterator = this.cfr_renamed_272.iterator();
        while (iterator2.hasNext()) {
            sprvn sprvn2 = (sprvn)iterator.next();
            iterator2 = iterator;
            sprlre2.cfr_renamed_49(sprvn2.cfr_renamed_3242(spreya2));
        }
        return this.cfr_renamed_4169(arg0, arg1, sprlre2, arg2);
    }

    public void cfr_renamed_4138(int arg0) {
        this.cfr_renamed_3 = arg0;
    }

    public OutputStream cfr_renamed_4169(sprtzd arg0, OutputStream arg1, sprlre arg2, sproa arg3) throws IOException {
        sprhoe sprhoe2;
        sprhoe sprhoe3 = new sprhoe(arg1);
        sprhoe3.cfr_renamed_4133(sprgl.cfr_renamed_2);
        sprhoe sprhoe4 = new sprhoe(sprhoe3.cfr_renamed_4134(), 0, true);
        sprovd sprovd2 = this;
        sprhoe4.cfr_renamed_4133(sprovd2.cfr_renamed_3());
        if (sprovd2.cfr_renamed_31 != null) {
            sprhoe4.cfr_renamed_4133(new sprhse(0 != 0, 0, this.cfr_renamed_31));
        }
        if (this.cfr_renamed_4) {
            sprhoe4.cfr_renamed_4134().write(new sprgve(arg2).cfr_renamed_91());
        } else {
            sprhoe4.cfr_renamed_4134().write(new sprcwe(arg2).cfr_renamed_91());
        }
        sprhoe sprhoe5 = sprhoe2 = new sprhoe(sprhoe4.cfr_renamed_4134());
        sprhoe5.cfr_renamed_4133(arg0);
        sprije sprije2 = arg3.cfr_renamed_615();
        sprhoe5.cfr_renamed_4134().write(sprije2.cfr_renamed_91());
        OutputStream outputStream = sprerd.cfr_renamed_4108(sprhoe5.cfr_renamed_4134(), 0, false, this.cfr_renamed_3);
        OutputStream outputStream2 = arg3.cfr_renamed_1442(outputStream);
        return new sprusd(this, outputStream2, sprhoe3, sprhoe4, sprhoe2);
    }
}

