/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcxl;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprgdn;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhrl;
import com.spire.presentation.packages.sprien;
import com.spire.presentation.packages.sprium;
import com.spire.presentation.packages.sprktm;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprnvm;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprve;
import com.spire.presentation.packages.sprxxl;
import com.spire.presentation.packages.sprynl;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class spruul
extends sprhrl {
    private int cfr_renamed_4;

    public OutputStream cfr_renamed_4137(OutputStream arg0) throws IOException {
        return this.cfr_renamed_4129(arg0, false);
    }

    public void cfr_renamed_4138(int arg0) {
        this.cfr_renamed_4 = arg0;
    }

    public spruul(sprve arg0) {
        super(arg0);
    }

    public OutputStream cfr_renamed_4129(OutputStream arg0, boolean arg1) throws IOException {
        return this.cfr_renamed_10773(sprgz.cfr_renamed_3, arg0, arg1);
    }

    public OutputStream cfr_renamed_10774(sprlem arg0, OutputStream arg1, boolean arg2, OutputStream arg3) throws IOException {
        Object object;
        Object object2;
        sprien sprien2 = new sprien(arg1);
        sprien2.cfr_renamed_10775(sprgz.cfr_renamed_105);
        sprien sprien3 = new sprien(sprien2.cfr_renamed_4134(), 0, true);
        sprien3.cfr_renamed_10775(this.cfr_renamed_10776(arg0));
        HashSet<sprddm> hashSet = new HashSet<sprddm>();
        Object object3 = object2 = this.cfr_renamed_126.iterator();
        while (object3.hasNext()) {
            object = (sprrpl)object2.next();
            object3 = object2;
            spreul.cfr_renamed_10755(hashSet, (sprrpl)object, this.cfr_renamed_133);
        }
        Object object4 = object2 = this.cfr_renamed_724.iterator();
        while (object4.hasNext()) {
            object = (sprxxl)object2.next();
            object4 = object2;
            hashSet.add(((sprxxl)object).cfr_renamed_410());
        }
        sprien3.cfr_renamed_4134().write(spreul.cfr_renamed_10757(hashSet).cfr_renamed_91());
        object2 = new sprien(sprien3.cfr_renamed_4134());
        ((sprien)object2).cfr_renamed_10775(arg0);
        object = arg2 ? spreul.cfr_renamed_4108(((sprgdn)object2).cfr_renamed_4134(), 0, true, this.cfr_renamed_4) : null;
        OutputStream outputStream = spreul.cfr_renamed_4112(arg3, (OutputStream)object);
        OutputStream outputStream2 = spreul.cfr_renamed_4111(this.cfr_renamed_724, outputStream);
        return new sprcxl(this, outputStream2, arg0, sprien2, sprien3, (sprien)object2);
    }

    public List<sprddm> cfr_renamed_4139() {
        Object object;
        Iterator iterator;
        ArrayList<sprddm> arrayList = new ArrayList<sprddm>();
        Iterator iterator2 = iterator = this.cfr_renamed_126.iterator();
        while (iterator2.hasNext()) {
            object = (sprrpl)iterator.next();
            sprddm sprddm2 = sprynl.cfr_renamed_4.cfr_renamed_10756(((sprrpl)object).cfr_renamed_3960(), this.cfr_renamed_133);
            iterator2 = iterator;
            arrayList.add(sprddm2);
        }
        iterator = this.cfr_renamed_724.iterator();
        Iterator iterator3 = iterator;
        while (iterator3.hasNext()) {
            object = (sprxxl)iterator.next();
            iterator3 = iterator;
            arrayList.add(((sprxxl)object).cfr_renamed_410());
        }
        return arrayList;
    }

    public spruul() {
    }

    public OutputStream cfr_renamed_10773(sprlem arg0, OutputStream arg1, boolean arg2) throws IOException {
        return this.cfr_renamed_10774(arg0, arg1, arg2, null);
    }

    private /* synthetic */ boolean cfr_renamed_4136(List arg0, List arg1) {
        Iterator iterator = arg0.iterator();
        while (iterator.hasNext()) {
            Object object = sprium.cfr_renamed_23(((sprrpl)iterator.next()).cfr_renamed_568());
            if (((sprium)object).cfr_renamed_3().cfr_renamed_5023() != 3) continue;
            return true;
        }
        for (Object object : arg1) {
            if (((sprxxl)object).cfr_renamed_3987() != 3) continue;
            return true;
        }
        return false;
    }

    public OutputStream cfr_renamed_4131(OutputStream arg0, boolean arg1, OutputStream arg2) throws IOException {
        return this.cfr_renamed_10774(sprgz.cfr_renamed_3, arg0, arg1, arg2);
    }

    private /* synthetic */ sprktm cfr_renamed_10776(sprlem arg0) {
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        if (this.cfr_renamed_31 != null) {
            for (Object e : this.cfr_renamed_31) {
                if (!(e instanceof sprnvm)) continue;
                sprnvm sprnvm2 = (sprnvm)e;
                if (sprnvm2.cfr_renamed_312() == 1) {
                    bl3 = true;
                    continue;
                }
                if (sprnvm2.cfr_renamed_312() == 2) {
                    bl4 = true;
                    continue;
                }
                if (sprnvm2.cfr_renamed_312() != 3) continue;
                bl = true;
            }
        }
        if (bl) {
            return new sprktm(5L);
        }
        if (this.cfr_renamed_119 != null) {
            for (Object e : this.cfr_renamed_119) {
                if (!(e instanceof sprnvm)) continue;
                bl2 = true;
            }
        }
        if (bl2) {
            return new sprktm(5L);
        }
        if (bl4) {
            return new sprktm(4L);
        }
        if (bl3) {
            return new sprktm(3L);
        }
        spruul spruul2 = this;
        if (spruul2.cfr_renamed_4136(spruul2.cfr_renamed_126, spruul2.cfr_renamed_724)) {
            return new sprktm(3L);
        }
        if (!sprgz.cfr_renamed_3.cfr_renamed_5078(arg0)) {
            return new sprktm(3L);
        }
        return new sprktm(1L);
    }
}

