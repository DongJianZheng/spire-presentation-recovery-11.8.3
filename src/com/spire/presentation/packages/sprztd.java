/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.spraud;
import com.spire.presentation.packages.sprbod;
import com.spire.presentation.packages.sprcwe;
import com.spire.presentation.packages.sprerd;
import com.spire.presentation.packages.sprfve;
import com.spire.presentation.packages.sprgl;
import com.spire.presentation.packages.sprhoe;
import com.spire.presentation.packages.sprhwd;
import com.spire.presentation.packages.sprlre;
import com.spire.presentation.packages.sprooe;
import com.spire.presentation.packages.sprpod;
import com.spire.presentation.packages.sprpue;
import com.spire.presentation.packages.sprtzd;
import com.spire.presentation.packages.sprvud;
import com.spire.presentation.packages.spryte;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.List;

public class sprztd
extends sprvud {
    private int cfr_renamed_4;

    public OutputStream cfr_renamed_4129(OutputStream arg0, boolean arg1) throws IOException {
        return this.cfr_renamed_4130(sprgl.cfr_renamed_152, arg0, arg1);
    }

    public OutputStream cfr_renamed_4131(OutputStream arg0, boolean arg1, OutputStream arg2) throws IOException {
        return this.cfr_renamed_4132(sprgl.cfr_renamed_152, arg0, arg1, arg2);
    }

    public OutputStream cfr_renamed_4132(sprtzd arg0, OutputStream arg1, boolean arg2, OutputStream arg3) throws IOException {
        Object object;
        Object object2;
        sprhoe sprhoe2 = new sprhoe(arg1);
        sprhoe2.cfr_renamed_4133(sprgl.cfr_renamed_3);
        sprhoe sprhoe3 = new sprhoe(sprhoe2.cfr_renamed_4134(), 0, true);
        sprhoe3.cfr_renamed_4133(this.cfr_renamed_4135(arg0));
        sprlre sprlre2 = new sprlre();
        Object object3 = object2 = this.cfr_renamed_185.iterator();
        while (object3.hasNext()) {
            object = (sprpod)object2.next();
            object3 = object2;
            sprlre2.cfr_renamed_49(spraud.cfr_renamed_3.cfr_renamed_4122(((sprpod)object).cfr_renamed_3960()));
        }
        Object object4 = object2 = this.cfr_renamed_3.iterator();
        while (object4.hasNext()) {
            object = (sprbod)object2.next();
            object4 = object2;
            sprlre2.cfr_renamed_49(((sprbod)object).cfr_renamed_410());
        }
        sprhoe3.cfr_renamed_4134().write(new sprcwe(sprlre2).cfr_renamed_91());
        object2 = new sprhoe(sprhoe3.cfr_renamed_4134());
        ((sprhoe)object2).cfr_renamed_4133(arg0);
        object = arg2 ? sprerd.cfr_renamed_4108(((sprpue)object2).cfr_renamed_4134(), 0, true, this.cfr_renamed_4) : null;
        OutputStream outputStream = sprerd.cfr_renamed_4112(arg3, (OutputStream)object);
        OutputStream outputStream2 = sprerd.cfr_renamed_4111(this.cfr_renamed_3, outputStream);
        return new sprhwd(this, outputStream2, arg0, sprhoe2, sprhoe3, (sprhoe)object2);
    }

    private /* synthetic */ sprooe cfr_renamed_4135(sprtzd arg0) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        if (this.cfr_renamed_79 != null) {
            for (Object e : this.cfr_renamed_79) {
                if (!(e instanceof spryte)) continue;
                spryte spryte2 = (spryte)e;
                if (spryte2.cfr_renamed_312() == 1) {
                    bl3 = true;
                    continue;
                }
                if (spryte2.cfr_renamed_312() == 2) {
                    bl4 = true;
                    continue;
                }
                if (spryte2.cfr_renamed_312() != 3) continue;
                bl = true;
            }
        }
        if (bl) {
            return new sprooe(5L);
        }
        if (this.spr\ufe34 != null) {
            for (Object e : this.spr\ufe34) {
                if (!(e instanceof spryte)) continue;
                bl2 = true;
            }
        }
        if (bl2) {
            return new sprooe(5L);
        }
        if (bl4) {
            return new sprooe(4L);
        }
        if (bl3) {
            return new sprooe(3L);
        }
        sprztd sprztd2 = this;
        if (sprztd2.cfr_renamed_4136(sprztd2.cfr_renamed_185, sprztd2.cfr_renamed_3)) {
            return new sprooe(3L);
        }
        if (!sprgl.cfr_renamed_152.equals(arg0)) {
            return new sprooe(3L);
        }
        return new sprooe(1L);
    }

    public OutputStream cfr_renamed_4130(sprtzd arg0, OutputStream arg1, boolean arg2) throws IOException {
        return this.cfr_renamed_4132(arg0, arg1, arg2, null);
    }

    public OutputStream cfr_renamed_4137(OutputStream arg0) throws IOException {
        return this.cfr_renamed_4129(arg0, false);
    }

    public void cfr_renamed_4138(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    private /* synthetic */ boolean cfr_renamed_4136(List arg0, List arg1) {
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            Object object = sprfve.cfr_renamed_23(((sprpod)iterator.next()).cfr_renamed_568());
            if (((sprfve)object).cfr_renamed_3().cfr_renamed_97().intValue() != 3) continue;
            return true;
        }
        for (Object object : arg1) {
            if (((sprbod)object).cfr_renamed_3987() != 3) continue;
            return true;
        }
        return false;
    }
}

