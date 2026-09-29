/*
 * Decompiled with CFR 0.152.
 */
package com.spire.presentation.packages;

import com.spire.presentation.packages.sprcbn;
import com.spire.presentation.packages.sprccn;
import com.spire.presentation.packages.sprco;
import com.spire.presentation.packages.sprcog;
import com.spire.presentation.packages.sprddm;
import com.spire.presentation.packages.sprden;
import com.spire.presentation.packages.sprdrl;
import com.spire.presentation.packages.spreul;
import com.spire.presentation.packages.sprgdn;
import com.spire.presentation.packages.sprgz;
import com.spire.presentation.packages.sprhjg;
import com.spire.presentation.packages.sprhql;
import com.spire.presentation.packages.spridn;
import com.spire.presentation.packages.sprien;
import com.spire.presentation.packages.sprium;
import com.spire.presentation.packages.sprjj;
import com.spire.presentation.packages.sprjvm;
import com.spire.presentation.packages.sprkdn;
import com.spire.presentation.packages.sprkqe;
import com.spire.presentation.packages.sprlem;
import com.spire.presentation.packages.sprlj;
import com.spire.presentation.packages.sprlyl;
import com.spire.presentation.packages.sprme;
import com.spire.presentation.packages.sprmul;
import com.spire.presentation.packages.sprocn;
import com.spire.presentation.packages.sprqp;
import com.spire.presentation.packages.sprrpl;
import com.spire.presentation.packages.sprrvm;
import com.spire.presentation.packages.sprug;
import com.spire.presentation.packages.sprusm;
import com.spire.presentation.packages.sprvye;
import com.spire.presentation.packages.sprycn;
import com.spire.presentation.packages.sprynl;
import com.spire.presentation.packages.spryth;
import com.spire.presentation.packages.sprzwq;
import com.spire.presentation.packages.sprzy;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class sprlvl
extends sprvye {
    private static final sprynl cfr_renamed_93 = sprynl.cfr_renamed_4;
    private Map cfr_renamed_86;
    private Set<sprddm> cfr_renamed_152;
    private static final sprcog cfr_renamed_112 = new sprcog();
    private sprlem cfr_renamed_119;
    private sprhql cfr_renamed_91;
    private spridn cfr_renamed_0;
    private sprmul cfr_renamed_1;
    private boolean cfr_renamed_2;
    private sprusm cfr_renamed_3;
    private spridn cfr_renamed_4;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    private /* synthetic */ void cfr_renamed_4143() throws sprlyl {
        if (this.cfr_renamed_2) {
            return;
        }
        this.cfr_renamed_2 = true;
        try {
            sprlvl sprlvl2 = this;
            sprlvl2.cfr_renamed_0 = sprlvl.cfr_renamed_10777(sprlvl2.cfr_renamed_3.cfr_renamed_617());
            sprlvl2.cfr_renamed_4 = sprlvl.cfr_renamed_10777(sprlvl2.cfr_renamed_3.cfr_renamed_4145());
            return;
        }
        catch (IOException iOException) {
            throw new sprlyl(spryth.cfr_renamed_9("lcssptq1lpnbu\u007f{1\u007ftne3rn}<byeo"), iOException);
        }
    }

    /*
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public sprlvl(sprlj arg0, sprhql arg1, InputStream arg2) throws sprlyl {
        super(arg2);
        try {
            block10: {
                v0 = this;
                v0.cfr_renamed_91 = arg1;
                v0.cfr_renamed_3 = sprusm.cfr_renamed_23(v0.cfr_renamed_4.cfr_renamed_697(16));
                v1 = this;
                v0.cfr_renamed_86 = new HashMap<K, V>();
                var4_4 = v0.cfr_renamed_3.cfr_renamed_4139();
                var6_6 = new HashSet<sprddm>();
                while ((var5_7 = var4_4.cfr_renamed_24()) != null) {
                    var7_8 = sprddm.cfr_renamed_23(var5_7);
                    var6_6.add((sprddm)var7_8);
                    try {
                        var8_9 = arg0.cfr_renamed_5279((sprddm)var7_8);
                        if (var8_9 == null) continue;
                        this.cfr_renamed_86.put(var7_8.cfr_renamed_593(), var8_9);
                    }
                    catch (sprhjg var8_10) {}
                }
                this.cfr_renamed_152 = Collections.unmodifiableSet(var6_6);
                var7_8 = this.cfr_renamed_3.cfr_renamed_2589();
                var8_9 = var7_8.cfr_renamed_697(4);
                if (!(var8_9 instanceof sprme)) break block10;
                var9_11 = (sprme)var8_9;
                var10_13 = new sprhql(var7_8.cfr_renamed_696(), var9_11.cfr_renamed_698());
                if (this.cfr_renamed_91 == null) {
                    this.cfr_renamed_91 = var10_13;
                } else {
                    var10_13.cfr_renamed_4117();
                }
                ** GOTO lbl43
            }
            if (var8_9 == null) ** GOTO lbl43
            var9_12 = new sprdrl(var7_8.cfr_renamed_696(), (sprco)var8_9);
            if (this.cfr_renamed_91 == null) {
                v2 = arg1;
                this.cfr_renamed_91 = var9_12;
            } else {
                var9_12.cfr_renamed_4117();
lbl43:
                // 4 sources

                v2 = arg1;
            }
            if (v2 == null) {
                this.cfr_renamed_119 = var7_8.cfr_renamed_696();
                return;
            }
            this.cfr_renamed_119 = this.cfr_renamed_91.cfr_renamed_696();
            return;
        }
        catch (IOException var4_5) {
            throw new sprlyl(new StringBuilder().insert(0, sprzwq.cfr_renamed_9("6l\u007ff'`:s+j0me#")).append(var4_5.getMessage()).toString(), var4_5);
        }
    }

    public int cfr_renamed_3() {
        return this.cfr_renamed_3.cfr_renamed_3().cfr_renamed_5023();
    }

    public sprlvl(sprlj arg0, byte[] arg1) throws sprlyl {
        this(arg0, new ByteArrayInputStream(arg1));
    }

    public sprug cfr_renamed_633() throws sprlyl {
        this.cfr_renamed_4143();
        return cfr_renamed_93.cfr_renamed_10674(this.cfr_renamed_4);
    }

    public String cfr_renamed_620() {
        return this.cfr_renamed_119.cfr_renamed_19();
    }

    public sprhql cfr_renamed_623() {
        if (this.cfr_renamed_91 == null) {
            return null;
        }
        InputStream inputStream = spreul.cfr_renamed_4103(this.cfr_renamed_86.values(), this.cfr_renamed_91.cfr_renamed_4004());
        return new sprhql(this.cfr_renamed_91.cfr_renamed_696(), inputStream);
    }

    private static /* synthetic */ spridn cfr_renamed_10777(sprzy arg0) {
        if (arg0 == null) {
            return null;
        }
        return spridn.cfr_renamed_23(arg0.cfr_renamed_119());
    }

    private static /* synthetic */ void cfr_renamed_10778(sprjvm arg0, OutputStream arg1) throws IOException {
        sprme sprme2 = (sprme)arg0.cfr_renamed_697(4);
        if (sprme2 != null) {
            sprlvl.cfr_renamed_10779(sprme2, arg1);
        }
    }

    public sprug cfr_renamed_618() throws sprlyl {
        this.cfr_renamed_4143();
        return cfr_renamed_93.cfr_renamed_10765(this.cfr_renamed_0);
    }

    public Set<sprddm> cfr_renamed_10780() {
        return this.cfr_renamed_152;
    }

    public static OutputStream cfr_renamed_10781(InputStream arg0, sprmul arg1, OutputStream arg2) throws sprlyl, IOException {
        Iterator<sprrpl> iterator;
        Object object;
        sprden sprden2 = new sprden(arg0);
        sprusm sprusm2 = sprusm.cfr_renamed_23(new sprjvm((sprqp)sprden2.cfr_renamed_24()).cfr_renamed_697(16));
        sprien sprien2 = new sprien(arg2);
        sprien2.cfr_renamed_10775(sprgz.cfr_renamed_105);
        sprien sprien3 = new sprien(sprien2.cfr_renamed_4134(), 0, true);
        sprusm sprusm3 = sprusm2;
        sprien3.cfr_renamed_10775(sprusm3.cfr_renamed_3());
        sprusm3.cfr_renamed_4139().cfr_renamed_119();
        sprrvm sprrvm2 = new sprrvm();
        Object object2 = arg1.cfr_renamed_622().iterator();
        Iterator<sprrpl> iterator2 = object2;
        while (iterator2.hasNext()) {
            object = object2.next();
            iterator2 = object2;
            sprrvm2.cfr_renamed_5004(sprynl.cfr_renamed_4.cfr_renamed_10756(((sprrpl)object).cfr_renamed_3960(), cfr_renamed_112));
        }
        sprusm sprusm4 = sprusm2;
        sprien sprien4 = sprien3;
        sprien4.cfr_renamed_4134().write(new sprocn(sprrvm2).cfr_renamed_91());
        object2 = sprusm4.cfr_renamed_2589();
        Object object3 = object = new sprien(sprien3.cfr_renamed_4134());
        ((sprien)object3).cfr_renamed_10775(((sprjvm)object2).cfr_renamed_696());
        sprlvl.cfr_renamed_10778((sprjvm)object2, ((sprgdn)object3).cfr_renamed_4134());
        ((sprien)object3).cfr_renamed_2637();
        sprlvl.cfr_renamed_10782(sprien4, sprusm4.cfr_renamed_617(), 0);
        sprlvl.cfr_renamed_10782(sprien3, sprusm2.cfr_renamed_4145(), 1);
        sprrvm sprrvm3 = new sprrvm();
        Iterator<sprrpl> iterator3 = iterator = arg1.cfr_renamed_622().iterator();
        while (iterator3.hasNext()) {
            sprrpl sprrpl2 = iterator.next();
            iterator3 = iterator;
            sprrvm3.cfr_renamed_5004(sprrpl2.cfr_renamed_568());
        }
        sprien sprien5 = sprien3;
        sprien5.cfr_renamed_4134().write(new sprocn(sprrvm3).cfr_renamed_91());
        sprien5.cfr_renamed_2637();
        sprien2.cfr_renamed_2637();
        return arg2;
    }

    public static OutputStream cfr_renamed_10783(InputStream arg0, sprug arg1, sprug arg2, sprug arg3, OutputStream arg4) throws sprlyl, IOException {
        Iterable iterable;
        sprien sprien2;
        sprden sprden2 = new sprden(arg0);
        sprusm sprusm2 = sprusm.cfr_renamed_23(new sprjvm((sprqp)sprden2.cfr_renamed_24()).cfr_renamed_697(16));
        sprien sprien3 = new sprien(arg4);
        sprien3.cfr_renamed_10775(sprgz.cfr_renamed_105);
        sprien sprien4 = new sprien(sprien3.cfr_renamed_4134(), 0, true);
        sprusm sprusm3 = sprusm2;
        sprien4.cfr_renamed_10775(sprusm3.cfr_renamed_3());
        sprusm sprusm4 = sprusm2;
        sprien4.cfr_renamed_4134().write(sprusm4.cfr_renamed_4139().cfr_renamed_119().cfr_renamed_91());
        sprjvm sprjvm2 = sprusm3.cfr_renamed_2589();
        sprien sprien5 = sprien2 = new sprien(sprien4.cfr_renamed_4134());
        sprien5.cfr_renamed_10775(sprjvm2.cfr_renamed_696());
        sprlvl.cfr_renamed_10778(sprjvm2, sprien5.cfr_renamed_4134());
        sprien5.cfr_renamed_2637();
        sprlvl.cfr_renamed_10777(sprusm4.cfr_renamed_617());
        sprlvl.cfr_renamed_10777(sprusm2.cfr_renamed_4145());
        if (arg1 != null || arg3 != null) {
            spridn spridn2;
            iterable = new ArrayList();
            if (arg1 != null) {
                iterable.addAll(spreul.cfr_renamed_10676(arg1));
            }
            if (arg3 != null) {
                iterable.addAll(spreul.cfr_renamed_10760(arg3));
            }
            if ((spridn2 = spreul.cfr_renamed_4116(iterable)).cfr_renamed_84() > 0) {
                sprien4.cfr_renamed_4134().write(new sprycn(0 != 0, 0, (sprco)spridn2).cfr_renamed_91());
            }
        }
        if (arg2 != null && ((spridn)(iterable = spreul.cfr_renamed_4116(spreul.cfr_renamed_10677(arg2)))).cfr_renamed_84() > 0) {
            sprien4.cfr_renamed_4134().write(new sprycn(false, 1, (sprco)((Object)iterable)).cfr_renamed_91());
        }
        sprien sprien6 = sprien4;
        sprien6.cfr_renamed_4134().write(sprusm2.cfr_renamed_621().cfr_renamed_119().cfr_renamed_91());
        sprien6.cfr_renamed_2637();
        sprien3.cfr_renamed_2637();
        return arg4;
    }

    public sprmul cfr_renamed_621() throws sprlyl {
        if (this.cfr_renamed_1 == null) {
            Object object;
            Iterator iterator;
            sprlvl sprlvl2 = this;
            sprlvl2.cfr_renamed_4143();
            ArrayList<sprrpl> arrayList = new ArrayList<sprrpl>();
            HashMap<Object, byte[]> hashMap = new HashMap<Object, byte[]>();
            Iterator iterator2 = iterator = sprlvl2.cfr_renamed_86.keySet().iterator();
            while (iterator2.hasNext()) {
                Object object2 = object = iterator.next();
                hashMap.put(object2, ((sprjj)this.cfr_renamed_86.get(object2)).cfr_renamed_580());
                iterator2 = iterator;
            }
            try {
                sprco sprco2;
                object = this.cfr_renamed_3.cfr_renamed_621();
                while ((sprco2 = object.cfr_renamed_24()) != null) {
                    sprium sprium2 = sprium.cfr_renamed_23(sprco2.cfr_renamed_119());
                    byte[] byArray = (byte[])hashMap.get(sprium2.cfr_renamed_410().cfr_renamed_593());
                    arrayList.add(new sprrpl(sprium2, this.cfr_renamed_119, null, byArray));
                }
            }
            catch (IOException iOException) {
                throw new sprlyl(new StringBuilder().insert(0, spryth.cfr_renamed_9("xs1yi\u007ftleu~r+<")).append(iOException.getMessage()).toString(), iOException);
            }
            this.cfr_renamed_1 = new sprmul(arrayList);
        }
        return this.cfr_renamed_1;
    }

    private static /* synthetic */ void cfr_renamed_10779(sprme arg0, OutputStream arg1) throws IOException {
        OutputStream outputStream;
        OutputStream outputStream2 = outputStream = spreul.cfr_renamed_4108(arg1, 0, true, 0);
        sprkqe.cfr_renamed_472(arg0.cfr_renamed_698(), outputStream2);
        outputStream2.close();
    }

    private static /* synthetic */ void cfr_renamed_10782(sprcbn arg0, sprzy arg1, int arg2) throws IOException {
        spridn spridn2 = sprlvl.cfr_renamed_10777(arg1);
        if (spridn2 != null) {
            if (arg1 instanceof sprccn) {
                arg0.cfr_renamed_4134().write(new sprkdn(false, arg2, (sprco)spridn2).cfr_renamed_91());
                return;
            }
            arg0.cfr_renamed_4134().write(new sprycn(false, arg2, (sprco)spridn2).cfr_renamed_91());
        }
    }

    public sprlvl(sprlj arg0, sprhql arg1, byte[] arg2) throws sprlyl {
        this(arg0, arg1, new ByteArrayInputStream(arg2));
    }

    public sprug cfr_renamed_10784(sprlem arg0) throws sprlyl {
        this.cfr_renamed_4143();
        return cfr_renamed_93.cfr_renamed_10763(arg0, this.cfr_renamed_4);
    }

    public sprlvl(sprlj arg0, InputStream arg1) throws sprlyl {
        this(arg0, null, arg1);
    }

    public sprug cfr_renamed_617() throws sprlyl {
        this.cfr_renamed_4143();
        return cfr_renamed_93.cfr_renamed_10675(this.cfr_renamed_0);
    }
}

